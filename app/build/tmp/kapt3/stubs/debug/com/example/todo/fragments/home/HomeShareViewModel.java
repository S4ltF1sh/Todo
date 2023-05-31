package com.example.todo.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 >2\u00020\u0001:\u0002>?B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0015J\u0016\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\tJ\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&J\u0006\u0010(\u001a\u00020\rJ\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010&0*J\u0010\u0010+\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010&H\u0002J\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010&0*J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0&2\u0006\u0010/\u001a\u00020 H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\b0&H\u0002J\b\u00101\u001a\u00020\tH\u0014J\u0006\u00102\u001a\u00020\tJ\u0006\u00103\u001a\u00020\tJ\u0006\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010J\u000e\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\rJ\u0006\u0010:\u001a\u00020\tJ\u000e\u0010;\u001a\u0002062\u0006\u00107\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\tJ\u0006\u0010=\u001a\u00020\tR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/example/todo/fragments/home/HomeShareViewModel;", "Landroidx/lifecycle/ViewModel;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "removeRemind", "(Lcom/example/todo/data/repositories/TodoRepository;Lcom/example/todo/data/repositories/GroupRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "editMode", "Lcom/example/todo/common/ItemsEditMode;", "items", "", "Lcom/example/todo/data/models/Item;", "selectedItems", "todos", "addAllSelectedTodosToGroup", "groupName", "", "addNewGroup", "Lkotlinx/coroutines/Job;", "newGroupName", "addTodoToGroup", "id", "", "changeGroupName", "newTitle", "changeTodoStatus", "newTodoStatus", "Lcom/example/todo/common/TodoStatus;", "checkDoneAllSelectedTodos", "deleteGroupWithTodos", "groupWithTodos", "Lcom/example/todo/data/models/GroupWithTodos;", "getAllGroup", "", "Lcom/example/todo/data/models/group/Group;", "getEditMode", "getGarbageFragmentLiveData", "Landroidx/lifecycle/MutableLiveData;", "getGroupsWithTodos", "getOnGoingFragmentLiveData", "getSelectedItems", "getTodoByTodoStatus", "todoStatus", "getTodosForOnGoingFragment", "onCleared", "remove1AllSelectedItems", "remove2AllSelectedTodos", "restoreAllSelectedTodos", "selectItem", "", "item", "setEditMode", "newEditMode", "unSelectAllItem", "unSelectItem", "updateGarbageFragmentData", "updateOnGoingFragmentData", "Companion", "HomeShareViewModelFactory", "app_debug"})
public final class HomeShareViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
    private final com.example.todo.data.repositories.GroupRepository groupRepository = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.todo.fragments.home.HomeShareViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.Item>> onGoingFragmentLiveData = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.todo.Todo>> garbageFragmentLiveData = null;
    private final java.util.List<com.example.todo.data.models.Item> items = null;
    private final java.util.List<com.example.todo.data.models.todo.Todo> todos = null;
    private com.example.todo.common.ItemsEditMode editMode = com.example.todo.common.ItemsEditMode.NONE;
    private final java.util.List<com.example.todo.data.models.Item> selectedItems = null;
    
    public HomeShareViewModel(@org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.GroupRepository groupRepository, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.common.ItemsEditMode getEditMode() {
        return null;
    }
    
    public final void setEditMode(@org.jetbrains.annotations.NotNull
    com.example.todo.common.ItemsEditMode newEditMode) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.Item>> getOnGoingFragmentLiveData() {
        return null;
    }
    
    public final void updateOnGoingFragmentData() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.Item> getSelectedItems() {
        return null;
    }
    
    public final boolean selectItem(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.Item item) {
        return false;
    }
    
    public final boolean unSelectItem(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.Item item) {
        return false;
    }
    
    public final void unSelectAllItem() {
    }
    
    public final void remove1AllSelectedItems() {
    }
    
    public final void checkDoneAllSelectedTodos() {
    }
    
    private final void deleteGroupWithTodos(com.example.todo.data.models.GroupWithTodos groupWithTodos) {
    }
    
    public final void addAllSelectedTodosToGroup(@org.jetbrains.annotations.NotNull
    java.lang.String groupName) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.todo.Todo>> getGarbageFragmentLiveData() {
        return null;
    }
    
    public final void updateGarbageFragmentData() {
    }
    
    public final void remove2AllSelectedTodos() {
    }
    
    public final void restoreAllSelectedTodos() {
    }
    
    public final void changeGroupName(@org.jetbrains.annotations.NotNull
    java.lang.String newTitle) {
    }
    
    private final java.util.List<com.example.todo.data.models.todo.Todo> getTodosForOnGoingFragment() {
        return null;
    }
    
    private final java.util.List<com.example.todo.data.models.todo.Todo> getTodoByTodoStatus(com.example.todo.common.TodoStatus todoStatus) {
        return null;
    }
    
    public final void changeTodoStatus(int id, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus newTodoStatus) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addNewGroup(@org.jetbrains.annotations.NotNull
    java.lang.String newGroupName) {
        return null;
    }
    
    private final java.util.List<com.example.todo.data.models.GroupWithTodos> getGroupsWithTodos() {
        return null;
    }
    
    public final void addTodoToGroup(int id, @org.jetbrains.annotations.NotNull
    java.lang.String groupName) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.group.Group> getAllGroup() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/todo/fragments/home/HomeShareViewModel$HomeShareViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "removeRemind", "(Lcom/example/todo/data/repositories/TodoRepository;Lcom/example/todo/data/repositories/GroupRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class HomeShareViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
        private final com.example.todo.data.repositories.GroupRepository groupRepository = null;
        private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
        private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
        
        public HomeShareViewModelFactory(@org.jetbrains.annotations.NotNull
        com.example.todo.data.repositories.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull
        com.example.todo.data.repositories.GroupRepository groupRepository, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind) {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/todo/fragments/home/HomeShareViewModel$Companion;", "", "()V", "garbageFragmentLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/todo/data/models/todo/Todo;", "getGarbageFragmentLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onGoingFragmentLiveData", "Lcom/example/todo/data/models/Item;", "getOnGoingFragmentLiveData", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.Item>> getOnGoingFragmentLiveData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todo.data.models.todo.Todo>> getGarbageFragmentLiveData() {
            return null;
        }
    }
}