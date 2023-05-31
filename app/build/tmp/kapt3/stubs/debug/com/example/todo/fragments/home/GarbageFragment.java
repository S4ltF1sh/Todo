package com.example.todo.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/example/todo/fragments/home/GarbageFragment;", "Landroidx/fragment/app/Fragment;", "garbageBotNavListener", "Lcom/example/todo/fragments/home/GarbageFragment$GarbageBotNavListener;", "(Lcom/example/todo/fragments/home/GarbageFragment$GarbageBotNavListener;)V", "adapter", "Lcom/example/todo/adapters/forRV/TodoRVAdapter;", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "binding", "Lcom/example/todo/databinding/FragmentGarbageBinding;", "getEditMode", "Lkotlin/Function0;", "Lcom/example/todo/common/ItemsEditMode;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "homeShareViewModel", "Lcom/example/todo/fragments/home/HomeShareViewModel;", "getHomeShareViewModel", "()Lcom/example/todo/fragments/home/HomeShareViewModel;", "homeShareViewModel$delegate", "Lkotlin/Lazy;", "removeRemind", "restoreTodo", "Lkotlin/Function2;", "", "selectItem", "Lcom/example/todo/data/models/Item;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "unSelectItem", "viewTodo", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setContent", "updateWidgets", "GarbageBotNavListener", "app_debug"})
public final class GarbageFragment extends androidx.fragment.app.Fragment {
    private final com.example.todo.fragments.home.GarbageFragment.GarbageBotNavListener garbageBotNavListener = null;
    private com.example.todo.databinding.FragmentGarbageBinding binding;
    private com.example.todo.data.repositories.TodoRepository todoRepository;
    private com.example.todo.data.repositories.GroupRepository groupRepository;
    private com.example.todo.adapters.forRV.TodoRVAdapter adapter;
    private final kotlin.Lazy homeShareViewModel$delegate = null;
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> viewTodo = null;
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, java.lang.Integer, kotlin.Unit> restoreTodo = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> selectItem = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> unSelectItem = null;
    private final kotlin.jvm.functions.Function0<com.example.todo.common.ItemsEditMode> getEditMode = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
    private java.util.HashMap _$_findViewCache;
    
    public GarbageFragment(@org.jetbrains.annotations.NotNull
    com.example.todo.fragments.home.GarbageFragment.GarbageBotNavListener garbageBotNavListener) {
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
    
    private final void setContent() {
    }
    
    private final void updateWidgets() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todo/fragments/home/GarbageFragment$GarbageBotNavListener;", "", "enterEditMode", "", "enterNavigationMode", "app_debug"})
    public static abstract interface GarbageBotNavListener {
        
        public abstract void enterEditMode();
        
        public abstract void enterNavigationMode();
    }
}