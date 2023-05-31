package com.example.todo.adapters.forRV;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJx\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eJ\u0014\u0010\u0017\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/todo/adapters/forRV/GroupWithTodosViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/todo/databinding/ItemGroupBinding;", "(Lcom/example/todo/databinding/ItemGroupBinding;)V", "setContent", "", "groupWithTodos", "Lcom/example/todo/data/models/GroupWithTodos;", "setOnClick", "getEditMode", "Lkotlin/Function0;", "Lcom/example/todo/common/ItemsEditMode;", "itemAsGroupClicked", "Lkotlin/Function2;", "", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "selectItem", "Lkotlin/Function1;", "Lcom/example/todo/data/models/Item;", "unSelectItem", "addTodoToGroup", "", "setVisibility", "app_debug"})
public final class GroupWithTodosViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.example.todo.databinding.ItemGroupBinding binding = null;
    
    public GroupWithTodosViewHolder(@org.jetbrains.annotations.NotNull
    com.example.todo.databinding.ItemGroupBinding binding) {
        super(null);
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.GroupWithTodos groupWithTodos) {
    }
    
    public final void setVisibility(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends com.example.todo.common.ItemsEditMode> getEditMode) {
    }
    
    public final void setOnClick(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.GroupWithTodos groupWithTodos, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends com.example.todo.common.ItemsEditMode> getEditMode, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> itemAsGroupClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.Item, kotlin.Unit> selectItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.Item, kotlin.Unit> unSelectItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> addTodoToGroup) {
    }
}