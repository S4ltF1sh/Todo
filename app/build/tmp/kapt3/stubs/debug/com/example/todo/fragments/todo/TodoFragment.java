package com.example.todo.fragments.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u000fH\u0002J\b\u0010%\u001a\u00020\u000fH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\b\u0010\'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u000fH\u0002J\b\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000102H\u0016J$\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00109\u001a\u00020\u000fH\u0016J\b\u0010:\u001a\u00020\u000fH\u0016J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020,0\u0011H\u0003J\u001a\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u0002042\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010?\u001a\u00020\u000fH\u0002J\b\u0010@\u001a\u00020\u000fH\u0002J\b\u0010A\u001a\u00020\u000fH\u0002J\b\u0010B\u001a\u00020\u000fH\u0002J\b\u0010C\u001a\u00020\u000fH\u0002J\b\u0010D\u001a\u00020\u000fH\u0002J\b\u0010E\u001a\u00020\u000fH\u0002J\b\u0010F\u001a\u00020\u000fH\u0002J\b\u0010G\u001a\u00020\u000fH\u0002J\b\u0010H\u001a\u00020\u000fH\u0003J\b\u0010I\u001a\u00020\u000fH\u0002J\b\u0010J\u001a\u00020\u000fH\u0002J\b\u0010K\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006L"}, d2 = {"Lcom/example/todo/fragments/todo/TodoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/todo/databinding/FragmentTodoBinding;", "currentAlarmDate", "Ljava/util/Date;", "currentGroupName", "", "currentTodoStatus", "Lcom/example/todo/common/TodoStatus;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "openBottomSheetToCreateNewGroup", "Lkotlin/Function0;", "", "setNewGroup", "Lkotlin/Function1;", "setNewTime", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "todoViewMode", "Lcom/example/todo/common/ViewTodoStatus;", "todoViewModel", "Lcom/example/todo/fragments/todo/TodoViewModel;", "getTodoViewModel", "()Lcom/example/todo/fragments/todo/TodoViewModel;", "todoViewModel$delegate", "Lkotlin/Lazy;", "addNewTodo", "addRemind", "newTodo", "Lcom/example/todo/data/models/todo/Todo;", "afterTextChange", "backButtonClicked", "clearFocus", "delete1ButtonClicked", "delete2ButtonClicked", "enterEditMenu", "enterEditMode", "enterViewDeleteMenu", "enterViewMenu", "enterViewMode", "isEmptyTodo", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onMenuItemClickListener", "Landroid/view/MenuItem;", "onViewCreated", "view", "pickGroup", "pickTime", "restoreButtonClicked", "saveButtonClicked", "setContent", "setOnClick", "setOnFocusChange", "setOnTextChange", "setVisibility", "shareButtonClicked", "updateCurrentTodo", "updateRemind", "updateWidgets", "app_debug"})
public final class TodoFragment extends androidx.fragment.app.Fragment {
    private com.example.todo.databinding.FragmentTodoBinding binding;
    private com.example.todo.data.repositories.TodoRepository todoRepository;
    private com.example.todo.data.repositories.GroupRepository groupRepository;
    private final kotlin.Lazy todoViewModel$delegate = null;
    private com.example.todo.common.ViewTodoStatus todoViewMode = com.example.todo.common.ViewTodoStatus.VIEW_MODE;
    private com.example.todo.common.TodoStatus currentTodoStatus = com.example.todo.common.TodoStatus.ON_GOING;
    private java.util.Date currentAlarmDate;
    private java.lang.String currentGroupName = "";
    private final kotlin.jvm.functions.Function1<java.util.Date, kotlin.Unit> setNewTime = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> openBottomSheetToCreateNewGroup = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> setNewGroup = null;
    private java.util.HashMap _$_findViewCache;
    
    public TodoFragment() {
        super();
    }
    
    private final com.example.todo.fragments.todo.TodoViewModel getTodoViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setContent() {
    }
    
    private final void setVisibility() {
    }
    
    private final void setOnClick() {
    }
    
    private final void setOnFocusChange() {
    }
    
    private final void setOnTextChange() {
    }
    
    private final void afterTextChange() {
    }
    
    private final boolean isEmptyTodo() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final kotlin.jvm.functions.Function1<android.view.MenuItem, java.lang.Boolean> onMenuItemClickListener() {
        return null;
    }
    
    private final void saveButtonClicked() {
    }
    
    private final void backButtonClicked() {
    }
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final void shareButtonClicked() {
    }
    
    private final void delete1ButtonClicked() {
    }
    
    private final void delete2ButtonClicked() {
    }
    
    private final void restoreButtonClicked() {
    }
    
    private final void pickTime() {
    }
    
    private final void pickGroup() {
    }
    
    private final void updateCurrentTodo() {
    }
    
    private final void addNewTodo() {
    }
    
    private final void addRemind(com.example.todo.data.models.todo.Todo newTodo) {
    }
    
    private final void updateRemind() {
    }
    
    private final void updateWidgets() {
    }
    
    private final void enterViewMode() {
    }
    
    private final void enterEditMode() {
    }
    
    private final void enterEditMenu() {
    }
    
    private final void enterViewMenu() {
    }
    
    private final void enterViewDeleteMenu() {
    }
    
    private final void clearFocus() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}