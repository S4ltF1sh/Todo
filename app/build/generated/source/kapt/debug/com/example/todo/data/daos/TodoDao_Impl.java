package com.example.todo.data.daos;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.todo.common.TodoStatus;
import com.example.todo.data.models.todo.DateConverter;
import com.example.todo.data.models.todo.Todo;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoDao_Impl implements TodoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Todo> __insertionAdapterOfTodo;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityDeletionOrUpdateAdapter<Todo> __deletionAdapterOfTodo;

  private final EntityDeletionOrUpdateAdapter<Todo> __updateAdapterOfTodo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTodosFromGroup;

  private final SharedSQLiteStatement __preparedStmtOfChangeTodoStatus;

  private final SharedSQLiteStatement __preparedStmtOfChangeGroup;

  private final SharedSQLiteStatement __preparedStmtOfChangeGroup2;

  public TodoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodo = new EntityInsertionAdapter<Todo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `todo_table` (`id`,`title`,`note`,`alarmDate`,`groupName`,`todoStatus`,`todo_edit_date`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Todo value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getNote() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNote());
        }
        final Long _tmp = __dateConverter.toTimestamp(value.getAlarmDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getGroupName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGroupName());
        }
        if (value.getTodoStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, __TodoStatus_enumToString(value.getTodoStatus()));
        }
        final Long _tmp_1 = __dateConverter.toTimestamp(value.getEditDate());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
      }
    };
    this.__deletionAdapterOfTodo = new EntityDeletionOrUpdateAdapter<Todo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `todo_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Todo value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTodo = new EntityDeletionOrUpdateAdapter<Todo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `todo_table` SET `id` = ?,`title` = ?,`note` = ?,`alarmDate` = ?,`groupName` = ?,`todoStatus` = ?,`todo_edit_date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Todo value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getNote() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNote());
        }
        final Long _tmp = __dateConverter.toTimestamp(value.getAlarmDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getGroupName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGroupName());
        }
        if (value.getTodoStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, __TodoStatus_enumToString(value.getTodoStatus()));
        }
        final Long _tmp_1 = __dateConverter.toTimestamp(value.getEditDate());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfDeleteTodosFromGroup = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE todo_table SET todoStatus = ? WHERE todoStatus = ? AND groupName = ?";
        return _query;
      }
    };
    this.__preparedStmtOfChangeTodoStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE todo_table SET todoStatus = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfChangeGroup = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE todo_table SET groupName = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfChangeGroup2 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE todo_table SET groupName = ? WHERE groupName = ?";
        return _query;
      }
    };
  }

  @Override
  public long add(final Todo todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTodo.insertAndReturnId(todo);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeTodo(final Todo todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTodo.handle(todo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTodo(final Todo todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTodo.handle(todo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTodosFromGroup(final TodoStatus currentTodoStatus,
      final String currentGroupName, final TodoStatus newTodoStatus) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTodosFromGroup.acquire();
    int _argIndex = 1;
    if (newTodoStatus == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, __TodoStatus_enumToString(newTodoStatus));
    }
    _argIndex = 2;
    if (currentTodoStatus == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, __TodoStatus_enumToString(currentTodoStatus));
    }
    _argIndex = 3;
    if (currentGroupName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, currentGroupName);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTodosFromGroup.release(_stmt);
    }
  }

  @Override
  public void changeTodoStatus(final int id, final TodoStatus newTodoStatus) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfChangeTodoStatus.acquire();
    int _argIndex = 1;
    if (newTodoStatus == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, __TodoStatus_enumToString(newTodoStatus));
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfChangeTodoStatus.release(_stmt);
    }
  }

  @Override
  public void changeGroup(final int id, final String newGroupName) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfChangeGroup.acquire();
    int _argIndex = 1;
    if (newGroupName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, newGroupName);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfChangeGroup.release(_stmt);
    }
  }

  @Override
  public void changeGroup2(final String oldGroupName, final String newGroupName) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfChangeGroup2.acquire();
    int _argIndex = 1;
    if (newGroupName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, newGroupName);
    }
    _argIndex = 2;
    if (oldGroupName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, oldGroupName);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfChangeGroup2.release(_stmt);
    }
  }

  @Override
  public List<Todo> getByKeyWord(final String title) {
    final String _sql = "SELECT * FROM todo_table WHERE title LIKE '%'||?||'%'";
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
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
      final int _cursorIndexOfAlarmDate = CursorUtil.getColumnIndexOrThrow(_cursor, "alarmDate");
      final int _cursorIndexOfGroupName = CursorUtil.getColumnIndexOrThrow(_cursor, "groupName");
      final int _cursorIndexOfTodoStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "todoStatus");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "todo_edit_date");
      final List<Todo> _result = new ArrayList<Todo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Todo _item;
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
        _item = new Todo(_tmpId,_tmpTitle,_tmpNote,_tmpAlarmDate,_tmpGroupName,_tmpTodoStatus,_tmpEditDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Todo getById(final int id) {
    final String _sql = "SELECT * FROM todo_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
      final int _cursorIndexOfAlarmDate = CursorUtil.getColumnIndexOrThrow(_cursor, "alarmDate");
      final int _cursorIndexOfGroupName = CursorUtil.getColumnIndexOrThrow(_cursor, "groupName");
      final int _cursorIndexOfTodoStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "todoStatus");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "todo_edit_date");
      final Todo _result;
      if(_cursor.moveToFirst()) {
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
        _result = new Todo(_tmpId,_tmpTitle,_tmpNote,_tmpAlarmDate,_tmpGroupName,_tmpTodoStatus,_tmpEditDate);
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
  public List<Todo> getByTodoStatus(final TodoStatus todoStatus) {
    final String _sql = "SELECT * FROM todo_table WHERE todoStatus = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (todoStatus == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, __TodoStatus_enumToString(todoStatus));
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
      final int _cursorIndexOfAlarmDate = CursorUtil.getColumnIndexOrThrow(_cursor, "alarmDate");
      final int _cursorIndexOfGroupName = CursorUtil.getColumnIndexOrThrow(_cursor, "groupName");
      final int _cursorIndexOfTodoStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "todoStatus");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "todo_edit_date");
      final List<Todo> _result = new ArrayList<Todo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Todo _item;
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
        _item = new Todo(_tmpId,_tmpTitle,_tmpNote,_tmpAlarmDate,_tmpGroupName,_tmpTodoStatus,_tmpEditDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Todo> getTodosForOnGoingFragment() {
    final String _sql = "SELECT * FROM todo_table WHERE todoStatus = 'ON_GOING' AND groupName = ''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
      final int _cursorIndexOfAlarmDate = CursorUtil.getColumnIndexOrThrow(_cursor, "alarmDate");
      final int _cursorIndexOfGroupName = CursorUtil.getColumnIndexOrThrow(_cursor, "groupName");
      final int _cursorIndexOfTodoStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "todoStatus");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "todo_edit_date");
      final List<Todo> _result = new ArrayList<Todo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Todo _item;
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
        _item = new Todo(_tmpId,_tmpTitle,_tmpNote,_tmpAlarmDate,_tmpGroupName,_tmpTodoStatus,_tmpEditDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Todo> getAll() {
    final String _sql = "SELECT * FROM todo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfNote = CursorUtil.getColumnIndexOrThrow(_cursor, "note");
      final int _cursorIndexOfAlarmDate = CursorUtil.getColumnIndexOrThrow(_cursor, "alarmDate");
      final int _cursorIndexOfGroupName = CursorUtil.getColumnIndexOrThrow(_cursor, "groupName");
      final int _cursorIndexOfTodoStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "todoStatus");
      final int _cursorIndexOfEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "todo_edit_date");
      final List<Todo> _result = new ArrayList<Todo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Todo _item;
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
        _item = new Todo(_tmpId,_tmpTitle,_tmpNote,_tmpAlarmDate,_tmpGroupName,_tmpTodoStatus,_tmpEditDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __TodoStatus_enumToString(final TodoStatus _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case ON_GOING: return "ON_GOING";
      case DONE: return "DONE";
      case DELETED: return "DELETED";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
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
}
