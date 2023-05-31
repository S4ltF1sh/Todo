package com.example.todo.fragments.searchfragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n0\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0014J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/todo/fragments/searchfragment/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "(Lcom/example/todo/data/repositories/TodoRepository;)V", "searchData", "", "Lcom/example/todo/data/models/todo/Todo;", "searchLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "clearData", "", "getSearchLiveData", "getTodosByKeyWord", "keyWord", "", "onCleared", "updateData", "SearchViewModelFactory", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.todo.Todo>> searchLiveData = null;
    private final java.util.List<com.example.todo.data.models.todo.Todo> searchData = null;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.TodoRepository todoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.todo.Todo>> getSearchLiveData() {
        return null;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull
    java.lang.String keyWord) {
    }
    
    public final void clearData() {
    }
    
    private final java.util.List<com.example.todo.data.models.todo.Todo> getTodosByKeyWord(java.lang.String keyWord) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/todo/fragments/searchfragment/SearchViewModel$SearchViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "(Lcom/example/todo/data/repositories/TodoRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class SearchViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
        
        public SearchViewModelFactory(@org.jetbrains.annotations.NotNull
        com.example.todo.data.repositories.TodoRepository todoRepository) {
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