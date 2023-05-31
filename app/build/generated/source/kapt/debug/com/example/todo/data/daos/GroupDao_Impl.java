package com.example.todo.data.daos;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.todo.common.TodoStatus;
import com.example.todo.data.models.GroupWithTodos;
import com.example.todo.data.models.group.Group;
import com.example.todo.data.models.todo.DateConverter;
import com.example.todo.data.models.todo.Todo;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GroupDao_Impl implements GroupDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Group> __insertionAdapterOfGroup;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<Group> __deletionAdapterOfGroup;

  private final EntityDeletionOrUpdateAdapter<Group> __updateAdapterOfGroup;

  private final SharedSQLiteStatement __preparedStmtOfRemoveGroupByTitle;

  private final SharedSQLiteStatement __preparedStmtOfUpdateByTitle;

  public GroupDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroup = new EntityInsertionAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `group_table` (`title`,`group_edit_date`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        final Long _tmp = __dateConverter.toTimestamp(value.getEditDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
      }
    };
    this.__deletionAdapterOfGroup = new EntityDeletionOrUpdateAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `group_table` WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
      }
    };
    this.__updateAdapterOfGroup = new EntityDeletionOrUpdateAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `group_table` SET `title` = ?,`group_edit_date` = ? WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        final Long _tmp = __dateConverter.toTimestamp(value.getEditDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
      }
    };
    this.__preparedStmtOfRemoveGroupByTitle = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM group_table WHERE title =?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateByTitle = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE group_table SET title = ?, group_edit_date = ? WHERE title = ?";
        return _query;
      }
    };
  }

  @Override
  public void add(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGroup.insert(group);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGroup.handle(group);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfGroup.handle(group);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeGroupByTitle(final String title) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveGroupByTitle.acquire();
    int _argIndex = 1;
    if (title == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, title);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveGroupByTitle.release(_stmt);
    }
  }

  @Override
  public void updateByTitle(final String oldTitle, final String newTitle, final Date newEditDate) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateByTitle.acquire();
    int _argIndex = 1;
    if (newTitle == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, newTitle);
    }
    _argIndex = 2;
    final Long _tmp = __dateConverter.toTimestamp(newEditDate);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, _tmp);
    }
    _argIndex = 3;
    if (oldTitle == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, oldTitle);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateByTitle.release(_stmt);
    }
  }

  @Override
  public List<Group> getAll() {
    final String _sql = "SELECT * FROM group_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "group_edit_date");
      final List<Group> _result = new ArrayList<Group>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Group _item;
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Date _tmpEditDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfEditDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfEditDate);
        }
        _tmpEditDate = __dateConverter.toDate(_tmp);
        _item = new Group(_tmpTitle,_tmpEditDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Group getByTitle(final String title) {
    final String _sql = "SELECT * FROM group_table WHERE title = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "group_edit_date");
      final Group _result;
      if(_cursor.moveToFirst()) {
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Date _tmpEditDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfEditDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfEditDate);
        }
        _tmpEditDate = __dateConverter.toDate(_tmp);
        _result = new Group(_tmpTitle,_tmpEditDate);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<GroupWithTodos> getGroupsWithTodos() {
    final String _sql = "SELECT * FROM group_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
        final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "group_edit_date");
        final ArrayMap<String, ArrayList<Todo>> _collectionTodos = new ArrayMap<String, ArrayList<Todo>>();
        while (_cursor.moveToNext()) {
          if (!_cursor.isNull(_cursorIndexOfTitle)) {
            final String _tmpKey = _cursor.getString(_cursorIndexOfTitle);
            ArrayList<Todo> _tmpTodosCollection = _collectionTodos.get(_tmpKey);
            if (_tmpTodosCollection == null) {
              _tmpTodosCollection = new ArrayList<Todo>();
              _collectionTodos.put(_tmpKey, _tmpTodosCollection);
            }
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipOnGoingTodoAscomExampleTodoDataModelsTodoTodo(_collectionTodos);
        final List<GroupWithTodos> _result = new ArrayList<GroupWithTodos>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final GroupWithTodos _item;
          final Group _tmpGroup;
          if (! (_cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfEditDate))) {
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Date _tmpEditDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfEditDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfEditDate);
            }
            _tmpEditDate = __dateConverter.toDate(_tmp);
            _tmpGroup = new Group(_tmpTitle,_tmpEditDate);
          }  else  {
            _tmpGroup = null;
          }
          ArrayList<Todo> _tmpTodosCollection_1 = null;
          if (!_cursor.isNull(_cursorIndexOfTitle)) {
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfTitle);
            _tmpTodosCollection_1 = _collectionTodos.get(_tmpKey_1);
          }
          if (_tmpTodosCollection_1 == null) {
            _tmpTodosCollection_1 = new ArrayList<Todo>();
          }
          _item = new GroupWithTodos(_tmpGroup,_tmpTodosCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public GroupWithTodos getGroupWithTodosByGroupName(final String groupName) {
    final String _sql = "SELECT * FROM group_table WHERE title = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (groupName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, groupName);
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
        final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "group_edit_date");
        final ArrayMap<String, ArrayList<Todo>> _collectionTodos = new ArrayMap<String, ArrayList<Todo>>();
        while (_cursor.moveToNext()) {
          if (!_cursor.isNull(_cursorIndexOfTitle)) {
            final String _tmpKey = _cursor.getString(_cursorIndexOfTitle);
            ArrayList<Todo> _tmpTodosCollection = _collectionTodos.get(_tmpKey);
            if (_tmpTodosCollection == null) {
              _tmpTodosCollection = new ArrayList<Todo>();
              _collectionTodos.put(_tmpKey, _tmpTodosCollection);
            }
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipOnGoingTodoAscomExampleTodoDataModelsTodoTodo(_collectionTodos);
        final GroupWithTodos _result;
        if(_cursor.moveToFirst()) {
          final Group _tmpGroup;
          if (! (_cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfEditDate))) {
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Date _tmpEditDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfEditDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfEditDate);
            }
            _tmpEditDate = __dateConverter.toDate(_tmp);
            _tmpGroup = new Group(_tmpTitle,_tmpEditDate);
          }  else  {
            _tmpGroup = null;
          }
          ArrayList<Todo> _tmpTodosCollection_1 = null;
          if (!_cursor.isNull(_cursorIndexOfTitle)) {
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfTitle);
            _tmpTodosCollection_1 = _collectionTodos.get(_tmpKey_1);
          }
          if (_tmpTodosCollection_1 == null) {
            _tmpTodosCollection_1 = new ArrayList<Todo>();
          }
          _result = new GroupWithTodos(_tmpGroup,_tmpTodosCollection_1);
        } else {
          _result = null;
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private TodoStatus __TodoStatus_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "ON_GOING": return TodoStatus.ON_GOING;
      case "DONE": return TodoStatus.DONE;
      case "DELETED": return TodoStatus.DELETED;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }

  private void __fetchRelationshipOnGoingTodoAscomExampleTodoDataModelsTodoTodo(
      final ArrayMap<String, ArrayList<Todo>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<Todo>> _tmpInnerMap = new ArrayMap<String, ArrayList<Todo>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipOnGoingTodoAscomExampleTodoDataModelsTodoTodo(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<Todo>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipOnGoingTodoAscomExampleTodoDataModelsTodoTodo(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`title`,`note`,`alarmDate`,`groupName`,`todoStatus`,`todo_edit_date` FROM `OnGoingTodo` WHERE `groupName` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "groupName");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfTitle = 1;
      final int _cursorIndexOfNote = 2;
      final int _cursorIndexOfAlarmDate = 3;
      final int _cursorIndexOfGroupName = 4;
      final int _cursorIndexOfTodoStatus = 5;
      final int _cursorIndexOfEditDate = 6;
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final String _tmpKey = _cursor.getString(_itemKeyIndex);
          ArrayList<Todo> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final Todo _item_1;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpNote;
            if (_cursor.isNull(_cursorIndexOfNote)) {
              _tmpNote = null;
            } else {
              _tmpNote = _cursor.getString(_cursorIndexOfNote);
            }
            final Date _tmpAlarmDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfAlarmDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfAlarmDate);
            }
            _tmpAlarmDate = __dateConverter.toDate(_tmp);
            final String _tmpGroupName;
            if (_cursor.isNull(_cursorIndexOfGroupName)) {
              _tmpGroupName = null;
            } else {
              _tmpGroupName = _cursor.getString(_cursorIndexOfGroupName);
            }
            final TodoStatus _tmpTodoStatus;
            _tmpTodoStatus = __TodoStatus_stringToEnum(_cursor.getString(_cursorIndexOfTodoStatus));
            final Date _tmpEditDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEditDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfEditDate);
            }
            _tmpEditDate = __dateConverter.toDate(_tmp_1);
            _item_1 = new Todo(_tmpId,_tmpTitle,_tmpNote,_tmpAlarmDate,_tmpGroupName,_tmpTodoStatus,_tmpEditDate);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
