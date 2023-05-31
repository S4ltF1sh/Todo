package com.example.todo.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0019\u001a\u00020\u000eJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u001b\u001a\u00020\u0013J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/todo/data/repositories/TodoRepository;", "", "todoDao", "Lcom/example/todo/data/daos/TodoDao;", "(Lcom/example/todo/data/daos/TodoDao;)V", "addTodo", "", "todo", "Lcom/example/todo/data/models/todo/Todo;", "changeGroup", "", "id", "", "newGroupName", "", "changeGroup2", "oldGroupName", "changeTodoStatus", "newTodoStatus", "Lcom/example/todo/common/TodoStatus;", "getAll", "", "getById", "getByKeyWord", "", "keyWord", "getByTodoStatus", "todoStatus", "getTodosForOnGoingFragment", "removeTodo", "removeTodosFromGroup", "currentTodoStatus", "currentGroupName", "updateTodo", "app_debug"})
public final class TodoRepository {
    private final com.example.todo.data.daos.TodoDao todoDao = null;
    
    public TodoRepository(@org.jetbrains.annotations.NotNull
    com.example.todo.data.daos.TodoDao todoDao) {
        super();
    }
    
    public final long addTodo(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo) {
        return 0L;
    }
    
    public final void removeTodo(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo) {
    }
    
    public final void removeTodosFromGroup(@org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus currentTodoStatus, @org.jetbrains.annotations.NotNull
    java.lang.String currentGroupName, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus newTodoStatus) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.data.models.todo.Todo getById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> getByTodoStatus(@org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus todoStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> getTodosForOnGoingFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> getByKeyWord(@org.jetbrains.annotations.NotNull
    java.lang.String keyWord) {
        return null;
    }
    
    public final void updateTodo(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo) {
    }
    
    public final void changeTodoStatus(int id, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus newTodoStatus) {
    }
    
    public final void changeGroup(int id, @org.jetbrains.annotations.NotNull
    java.lang.String newGroupName) {
    }
    
    public final void changeGroup2(@org.jetbrains.annotations.NotNull
    java.lang.String oldGroupName, @org.jetbrains.annotations.NotNull
    java.lang.String newGroupName) {
    }
}