package com.example.todo.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020\bH\u0002J$\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\bH\u0002J\b\u00100\u001a\u00020\bH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/example/todo/fragments/home/OnGoingFragment;", "Landroidx/fragment/app/Fragment;", "onGoingBotNavListener", "Lcom/example/todo/fragments/home/OnGoingFragment$OnGoingBotNavListener;", "(Lcom/example/todo/fragments/home/OnGoingFragment$OnGoingBotNavListener;)V", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "addTodoToGroup", "Lkotlin/Function2;", "", "", "binding", "Lcom/example/todo/databinding/FragmentOnGoingBinding;", "checkDoneTodo", "getEditMode", "Lkotlin/Function0;", "Lcom/example/todo/common/ItemsEditMode;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "homeShareViewModel", "Lcom/example/todo/fragments/home/HomeShareViewModel;", "getHomeShareViewModel", "()Lcom/example/todo/fragments/home/HomeShareViewModel;", "homeShareViewModel$delegate", "Lkotlin/Lazy;", "removeRemind", "selectItem", "Lcom/example/todo/data/models/Item;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "unSelectItem", "viewGroup", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "viewTodo", "addNewTodo", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setOnClick", "updateWidgets", "OnGoingBotNavListener", "app_debug"})
public final class OnGoingFragment extends androidx.fragment.app.Fragment {
    private com.example.todo.databinding.FragmentOnGoingBinding binding;
    private com.example.todo.data.repositories.TodoRepository todoRepository;
    private com.example.todo.data.repositories.GroupRepository groupRepository;
    private final kotlin.Lazy homeShareViewModel$delegate = null;
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> viewTodo = null;
    private final kotlin.jvm.functions.Function2<java.lang.String, androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> viewGroup = null;
    private final kotlin.jvm.functions.Function0<com.example.todo.common.ItemsEditMode> getEditMode = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> checkDoneTodo = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> addTodoToGroup = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> selectItem = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> unSelectItem = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
    private java.util.HashMap _$_findViewCache;
    
    public OnGoingFragment(@org.jetbrains.annotations.NotNull
    com.example.todo.fragments.home.OnGoingFragment.OnGoingBotNavListener onGoingBotNavListener) {
        super();
    }
    
    private final com.example.todo.fragments.home.HomeShareViewModel getHomeShareViewModel() {
        return null;
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
    
    private final void setOnClick() {
    }
    
    private final void addNewTodo() {
    }
    
    private final void updateWidgets() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todo/fragments/home/OnGoingFragment$OnGoingBotNavListener;", "", "enterEditMode", "", "enterNavigationMode", "notifyEditModeChange", "app_debug"})
    public static abstract interface OnGoingBotNavListener {
        
        public abstract void enterEditMode();
        
        public abstract void enterNavigationMode();
        
        public abstract void notifyEditModeChange();
    }
}