package com.example.todo.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u001a\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\'\u001a\u00020\bH\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0003J\b\u0010*\u001a\u00020\bH\u0002J\b\u0010+\u001a\u00020\bH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/todo/fragments/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/todo/fragments/home/OnGoingFragment$OnGoingBotNavListener;", "Lcom/example/todo/fragments/home/GarbageFragment$GarbageBotNavListener;", "()V", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "binding", "Lcom/example/todo/databinding/FragmentHomeBinding;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "homeShareViewModel", "Lcom/example/todo/fragments/home/HomeShareViewModel;", "getHomeShareViewModel", "()Lcom/example/todo/fragments/home/HomeShareViewModel;", "homeShareViewModel$delegate", "Lkotlin/Lazy;", "removeRemind", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "enterEditMode", "enterNavigationMode", "navigationButtonClicked", "notifyEditModeChange", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onViewCreated", "view", "setOnClick", "setupBotNav", "setupSearchView", "setupTabLayout", "updateWidgets", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.example.todo.fragments.home.OnGoingFragment.OnGoingBotNavListener, com.example.todo.fragments.home.GarbageFragment.GarbageBotNavListener {
    private com.example.todo.databinding.FragmentHomeBinding binding;
    private com.example.todo.data.repositories.TodoRepository todoRepository;
    private com.example.todo.data.repositories.GroupRepository groupRepository;
    private final kotlin.Lazy homeShareViewModel$delegate = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.todo.fragments.home.HomeShareViewModel getHomeShareViewModel() {
        return null;
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
    
    private final void setupBotNav() {
    }
    
    private final void setupTabLayout() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setupSearchView() {
    }
    
    private final void setOnClick() {
    }
    
    private final void navigationButtonClicked() {
    }
    
    private final void updateWidgets() {
    }
    
    @java.lang.Override
    public void enterEditMode() {
    }
    
    @java.lang.Override
    public void enterNavigationMode() {
    }
    
    @java.lang.Override
    public void notifyEditModeChange() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}