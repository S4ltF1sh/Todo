package com.example.todo.fragments.group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001<B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&J\u0006\u0010(\u001a\u00020\rJ\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010+\u001a\u00020\u0017J\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0&J\b\u0010-\u001a\u00020\tH\u0014J\u0006\u0010.\u001a\u00020\tJ\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0014J\u000e\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0017J\u000e\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\rJ\u0006\u00106\u001a\u00020\tJ\u000e\u00107\u001a\u0002002\u0006\u00101\u001a\u00020\u0014J\u0006\u00108\u001a\u00020\tJ\u0018\u00109\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u00010;R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/example/todo/fragments/group/GroupViewModel;", "Landroidx/lifecycle/ViewModel;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "removeRemind", "(Lcom/example/todo/data/repositories/TodoRepository;Lcom/example/todo/data/repositories/GroupRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "editMode", "Lcom/example/todo/common/ItemsEditMode;", "groupWithTodos", "Lcom/example/todo/data/models/GroupWithTodos;", "groupWithTodosLiveData", "Landroidx/lifecycle/MutableLiveData;", "selectedItems", "", "Lcom/example/todo/data/models/Item;", "addAllSelectedTodosToGroup", "groupName", "", "addNewGroup", "Lkotlinx/coroutines/Job;", "newGroupName", "addTodoToGroup", "id", "", "changeGroupName", "newTitle", "changeTodoStatus", "newTodoStatus", "Lcom/example/todo/common/TodoStatus;", "checkDoneAllSelectedTodos", "deleteGroupWithTodos", "getAllGroup", "", "Lcom/example/todo/data/models/group/Group;", "getEditMode", "getGroupWithTodosLiveData", "getSelectedItems", "getTitle", "getTodos", "onCleared", "remove1AllSelectedItems", "selectItem", "", "item", "setData", "title", "setEditMode", "newEditMode", "unSelectAllItem", "unSelectItem", "updateData", "updateGroup", "newEditDate", "Ljava/util/Date;", "GroupNeedToViewViewModelFactory", "app_debug"})
public final class GroupViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
    private final com.example.todo.data.repositories.GroupRepository groupRepository = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
    private final androidx.lifecycle.MutableLiveData<com.example.todo.data.models.GroupWithTodos> groupWithTodosLiveData = null;
    private com.example.todo.data.models.GroupWithTodos groupWithTodos;
    private com.example.todo.common.ItemsEditMode editMode = com.example.todo.common.ItemsEditMode.NONE;
    private final java.util.List<com.example.todo.data.models.Item> selectedItems = null;
    
    public GroupViewModel(@org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull
    com.example.todo.data.repositories.GroupRepository groupRepository, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void updateData() {
    }
    
    public final void updateGroup(@org.jetbrains.annotations.NotNull
    java.lang.String newTitle, @org.jetbrains.annotations.Nullable
    java.util.Date newEditDate) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.todo.data.models.GroupWithTodos> getGroupWithTodosLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> getTodos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.common.ItemsEditMode getEditMode() {
        return null;
    }
    
    public final void setEditMode(@org.jetbrains.annotations.NotNull
    com.example.todo.common.ItemsEditMode newEditMode) {
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
    
    public final void addAllSelectedTodosToGroup(@org.jetbrains.annotations.NotNull
    java.lang.String groupName) {
    }
    
    public final void changeGroupName(@org.jetbrains.annotations.NotNull
    java.lang.String newTitle) {
    }
    
    private final void addTodoToGroup(int id, java.lang.String groupName) {
    }
    
    public final void checkDoneAllSelectedTodos() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.group.Group> getAllGroup() {
        return null;
    }
    
    public final void deleteGroupWithTodos() {
    }
    
    public final void changeTodoStatus(int id, @org.jetbrains.annotations.NotNull
    com.example.todo.common.TodoStatus newTodoStatus) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addNewGroup(@org.jetbrains.annotations.NotNull
    java.lang.String newGroupName) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/todo/fragments/group/GroupViewModel$GroupNeedToViewViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "removeRemind", "(Lcom/example/todo/data/repositories/TodoRepository;Lcom/example/todo/data/repositories/GroupRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class GroupNeedToViewViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.todo.data.repositories.TodoRepository todoRepository = null;
        private final com.example.todo.data.repositories.GroupRepository groupRepository = null;
        private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
        private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
        
        public GroupNeedToViewViewModelFactory(@org.jetbrains.annotations.NotNull
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
}