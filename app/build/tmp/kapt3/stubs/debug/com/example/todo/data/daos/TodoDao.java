package com.example.todo.data.daos;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\'J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010\u001b\u001a\u00020\u0010H\'J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\'J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u001f"}, d2 = {"Lcom/example/todo/data/daos/TodoDao;", "", "add", "", "todo", "Lcom/example/todo/data/models/todo/Todo;", "changeGroup", "", "id", "", "newGroupName", "", "changeGroup2", "oldGroupName", "changeTodoStatus", "newTodoStatus", "Lcom/example/todo/common/TodoStatus;", "deleteTodosFromGroup", "currentTodoStatus", "currentGroupName", "getAll", "", "getById", "getByKeyWord", "", "title", "getByTodoStatus", "todoStatus", "getTodosForOnGoingFragment", "removeTodo", "updateTodo", "app_debug"})
public abstract interface TodoDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE title LIKE \'%\'||:title||\'%\'")
    public abstract java.util.List<com.example.todo.data.models.todo.Todo> getByKeyWord(@org.jetbrains.annotations.NotNull
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE id = :id")
    public abstract com.example.todo.data.models.todo.Todo getById(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE todoStatus = :todoStatus")
    public abstract java.util.List<com.example.todo.data.models.todo.Todo> getByTodoStatus(@org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus todoStatus);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE todoStatus = \'ON_GOING\' AND groupName = \'\'")
    public abstract java.util.List<com.example.todo.data.models.todo.Todo> getTodosForOnGoingFragment();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM todo_table")
    public abstract java.util.List<com.example.todo.data.models.todo.Todo> getAll();
    
    @androidx.room.Query(value = "UPDATE todo_table SET todoStatus = :newTodoStatus WHERE todoStatus = :currentTodoStatus AND groupName = :currentGroupName")
    public abstract void deleteTodosFromGroup(@org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus currentTodoStatus, @org.jetbrains.annotations.NotNull
    java.lang.String currentGroupName, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus newTodoStatus);
    
    @androidx.room.Query(value = "UPDATE todo_table SET todoStatus = :newTodoStatus WHERE id = :id")
    public abstract void changeTodoStatus(int id, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus newTodoStatus);
    
    @androidx.room.Query(value = "UPDATE todo_table SET groupName = :newGroupName WHERE id = :id")
    public abstract void changeGroup(int id, @org.jetbrains.annotations.NotNull
    java.lang.String newGroupName);
    
    @androidx.room.Query(value = "UPDATE todo_table SET groupName = :newGroupName WHERE groupName = :oldGroupName")
    public abstract void changeGroup2(@org.jetbrains.annotations.NotNull
    java.lang.String oldGroupName, @org.jetbrains.annotations.NotNull
    java.lang.String newGroupName);
    
    @androidx.room.Update
    public abstract void updateTodo(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo);
    
    @androidx.room.Delete
    public abstract void removeTodo(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo);
    
    @androidx.room.Insert
    public abstract long add(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo);
}