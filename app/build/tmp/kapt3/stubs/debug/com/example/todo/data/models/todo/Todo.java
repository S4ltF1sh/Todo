package com.example.todo.data.models.todo;

import java.lang.System;

@androidx.room.Entity(tableName = "todo_table")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000eJ\t\u0010%\u001a\u00020\u0004H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tH\u00c6\u0003JS\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0004H\u00d6\u0001J\t\u00102\u001a\u00020\u0006H\u00d6\u0001R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\r\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00063"}, d2 = {"Lcom/example/todo/data/models/todo/Todo;", "Ljava/io/Serializable;", "Lcom/example/todo/data/models/Item;", "id", "", "title", "", "note", "alarmDate", "Ljava/util/Date;", "groupName", "todoStatus", "Lcom/example/todo/common/TodoStatus;", "editDate", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/example/todo/common/TodoStatus;Ljava/util/Date;)V", "getAlarmDate", "()Ljava/util/Date;", "setAlarmDate", "(Ljava/util/Date;)V", "getEditDate", "setEditDate", "getGroupName", "()Ljava/lang/String;", "setGroupName", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getNote", "setNote", "getTitle", "setTitle", "getTodoStatus", "()Lcom/example/todo/common/TodoStatus;", "setTodoStatus", "(Lcom/example/todo/common/TodoStatus;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Todo extends com.example.todo.data.models.Item implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo
    private java.lang.String note;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo
    private java.util.Date alarmDate;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo
    private java.lang.String groupName;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo
    private com.example.todo.common.TodoStatus todoStatus;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "todo_edit_date")
    private java.util.Date editDate;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.data.models.todo.Todo copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String note, @org.jetbrains.annotations.Nullable
    java.util.Date alarmDate, @org.jetbrains.annotations.NotNull
    java.lang.String groupName, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus todoStatus, @org.jetbrains.annotations.Nullable
    java.util.Date editDate) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Todo(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String note, @org.jetbrains.annotations.Nullable
    java.util.Date alarmDate, @org.jetbrains.annotations.NotNull
    java.lang.String groupName, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus todoStatus, @org.jetbrains.annotations.Nullable
    java.util.Date editDate) {
        super(null);
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getAlarmDate() {
        return null;
    }
    
    public final void setAlarmDate(@org.jetbrains.annotations.Nullable
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGroupName() {
        return null;
    }
    
    public final void setGroupName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.common.TodoStatus component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.common.TodoStatus getTodoStatus() {
        return null;
    }
    
    public final void setTodoStatus(@org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Date getEditDate() {
        return null;
    }
    
    @java.lang.Override
    public void setEditDate(@org.jetbrains.annotations.Nullable
    java.util.Date p0) {
    }
}