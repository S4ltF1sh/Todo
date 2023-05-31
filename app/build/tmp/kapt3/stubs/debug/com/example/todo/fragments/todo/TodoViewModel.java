package com.example.todo.fragments.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000eJ\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000eJ\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/todo/fragments/todo/TodoViewModel;", "Landroidx/lifecycle/ViewModel;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "(Lcom/example/todo/data/repositories/TodoRepository;Lcom/example/todo/data/repositories/GroupRepository;)V", "todo", "Lcom/example/todo/data/models/todo/Todo;", "todoLiveData", "Landroidx/lifecycle/MutableLiveData;", "addNewGroup", "", "newGroupName", "", "addNewTodo", "newTodo", "delete2Todo", "getGroupName", "getNote", "getTitle", "getTodoLiveData", "setData", "setGroupName", "setNote", "note", "setTime", "alarmDate", "Ljava/util/Date;", "editDate", "setTitle", "title", "setTodoStatus", "todoStatus", "Lcom/example/todo/common/TodoStatus;", "updateTodo", "Lkotlinx/coroutines/Job;", "TodoNeedToViewViewModelFactory", "app_debug"})
public final class TodoViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
    private final com.example.todo.data.repositories.GroupRepository groupRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.todo.data.models.todo.Todo> todoLiveData = null;
    private com.example.todo.data.models.todo.Todo todo;
    
    public TodoViewModel(@org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.GroupRepository groupRepository) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo) {
    }
    
    public final void setTodoStatus(@org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus todoStatus) {
    }
    
    public final void setTime(@org.jetbrains.annotations.Nullable
    java.util.Date alarmDate, @org.jetbrains.annotations.Nullable
    java.util.Date editDate) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull
    java.lang.String note) {
    }
    
    public final void setGroupName(@org.jetbrains.annotations.NotNull
    java.lang.String newGroupName) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.todo.data.models.todo.Todo> getTodoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGroupName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateTodo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.data.models.todo.Todo addNewTodo(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo newTodo) {
        return null;
    }
    
    public final void delete2Todo() {
    }
    
    public final void addNewGroup(@org.jetbrains.annotations.NotNull
    java.lang.String newGroupName) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/todo/fragments/todo/TodoViewModel$TodoNeedToViewViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "(Lcom/example/todo/data/repositories/TodoRepository;Lcom/example/todo/data/repositories/GroupRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class TodoNeedToViewViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
        private final com.example.todo.data.repositories.GroupRepository groupRepository = null;
        
        public TodoNeedToViewViewModelFactory(@org.jetbrains.annotations.NotNull
        com.example.todo.data.repositories.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull
        com.example.todo.data.repositories.GroupRepository groupRepository) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}