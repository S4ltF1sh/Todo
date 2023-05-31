package com.example.todo.adapters.forViewPager2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/todo/adapters/forViewPager2/HomeFragmentViewPager2Adapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onGoingBotNavListener", "Lcom/example/todo/fragments/home/OnGoingFragment$OnGoingBotNavListener;", "garbageBotNavListener", "Lcom/example/todo/fragments/home/GarbageFragment$GarbageBotNavListener;", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Lcom/example/todo/fragments/home/OnGoingFragment$OnGoingBotNavListener;Lcom/example/todo/fragments/home/GarbageFragment$GarbageBotNavListener;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
public final class HomeFragmentViewPager2Adapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final com.example.todo.fragments.home.OnGoingFragment.OnGoingBotNavListener onGoingBotNavListener = null;
    private final com.example.todo.fragments.home.GarbageFragment.GarbageBotNavListener garbageBotNavListener = null;
    
    public HomeFragmentViewPager2Adapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle lifecycle, @org.jetbrains.annotations.NotNull
    com.example.todo.fragments.home.OnGoingFragment.OnGoingBotNavListener onGoingBotNavListener, @org.jetbrains.annotations.NotNull
    com.example.todo.fragments.home.GarbageFragment.GarbageBotNavListener garbageBotNavListener) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}