package com.example.todo.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.todo.data.daos.GroupDao;
import com.example.todo.data.daos.GroupDao_Impl;
import com.example.todo.data.daos.TodoDao;
import com.example.todo.data.daos.TodoDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyDatabase_Impl extends MyDatabase {
  private volatile TodoDao _todoDao;

  private volatile GroupDao _groupDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `todo_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `note` TEXT NOT NULL, `alarmDate` INTEGER, `groupName` TEXT NOT NULL, `todoStatus` TEXT NOT NULL, `todo_edit_date` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `group_table` (`title` TEXT NOT NULL, `group_edit_date` INTEGER, PRIMARY KEY(`title`))");
        _db.execSQL("CREATE VIEW `OnGoingTodo` AS SELECT * FROM todo_table WHERE todoStatus = 'ON_GOING'");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f0e603ebbcc6d3a9c450fb3d90867874')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `todo_table`");
        _db.execSQL("DROP TABLE IF EXISTS `group_table`");
        _db.execSQL("DROP VIEW IF EXISTS `OnGoingTodo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTodoTable = new HashMap<String, TableInfo.Column>(7);
        _columnsTodoTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoTable.put("note", new TableInfo.Column("note", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoTable.put("alarmDate", new TableInfo.Column("alarmDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoTable.put("groupName", new TableInfo.Column("groupName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoTable.put("todoStatus", new TableInfo.Column("todoStatus", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTodoTable.put("todo_edit_date", new TableInfo.Column("todo_edit_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTodoTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTodoTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTodoTable = new TableInfo("todo_table", _columnsTodoTable, _foreignKeysTodoTable, _indicesTodoTable);
        final TableInfo _existingTodoTable = TableInfo.read(_db, "todo_table");
        if (! _infoTodoTable.equals(_existingTodoTable)) {
          return new RoomOpenHelper.ValidationResult(false, "todo_table(com.example.todo.data.models.todo.Todo).\n"
                  + " Expected:\n" + _infoTodoTable + "\n"
                  + " Found:\n" + _existingTodoTable);
        }
        final HashMap<String, TableInfo.Column> _columnsGroupTable = new HashMap<String, TableInfo.Column>(2);
        _columnsGroupTable.put("title", new TableInfo.Column("title", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupTable.put("group_edit_date", new TableInfo.Column("group_edit_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroupTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroupTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroupTable = new TableInfo("group_table", _columnsGroupTable, _foreignKeysGroupTable, _indicesGroupTable);
        final TableInfo _existingGroupTable = TableInfo.read(_db, "group_table");
        if (! _infoGroupTable.equals(_existingGroupTable)) {
          return new RoomOpenHelper.ValidationResult(false, "group_table(com.example.todo.data.models.group.Group).\n"
                  + " Expected:\n" + _infoGroupTable + "\n"
                  + " Found:\n" + _existingGroupTable);
        }
        final ViewInfo _infoOnGoingTodo = new ViewInfo("OnGoingTodo", "CREATE VIEW `OnGoingTodo` AS SELECT * FROM todo_table WHERE todoStatus = 'ON_GOING'");
        final ViewInfo _existingOnGoingTodo = ViewInfo.read(_db, "OnGoingTodo");
        if (! _infoOnGoingTodo.equals(_existingOnGoingTodo)) {
          return new RoomOpenHelper.ValidationResult(false, "OnGoingTodo(com.example.todo.data.models.OnGoingTodo).\n"
                  + " Expected:\n" + _infoOnGoingTodo + "\n"
                  + " Found:\n" + _existingOnGoingTodo);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f0e603ebbcc6d3a9c450fb3d90867874", "11370b4f4437685b08405be2ede97eee");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(1);
    HashSet<String> _tables = new HashSet<String>(1);
    _tables.add("todo_table");
    _viewTables.put("ongoingtodo", _tables);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "todo_table","group_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `todo_table`");
      _db.execSQL("DELETE FROM `group_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TodoDao.class, TodoDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GroupDao.class, GroupDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TodoDao getTodoDao() {
    if (_todoDao != null) {
      return _todoDao;
    } else {
      synchronized(this) {
        if(_todoDao == null) {
          _todoDao = new TodoDao_Impl(this);
        }
        return _todoDao;
      }
    }
  }

  @Override
  public GroupDao getGroupDao() {
    if (_groupDao != null) {
      return _groupDao;
    } else {
      synchronized(this) {
        if(_groupDao == null) {
          _groupDao = new GroupDao_Impl(this);
        }
        return _groupDao;
      }
    }
  }
}
