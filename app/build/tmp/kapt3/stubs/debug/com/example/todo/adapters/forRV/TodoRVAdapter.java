package com.example.todo.adapters.forRV;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\tJ\u0016\u0010\u001e\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0007R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/todo/adapters/forRV/TodoRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/todo/adapters/forRV/TodoViewHolder;", "viewTodo", "Lkotlin/Function2;", "Lcom/example/todo/data/models/todo/Todo;", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "", "checkBoxClicked", "", "getEditMode", "Lkotlin/Function0;", "Lcom/example/todo/common/ItemsEditMode;", "selectItem", "Lkotlin/Function1;", "Lcom/example/todo/data/models/Item;", "unSelectItem", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "todos", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "setData", "", "app_debug"})
public final class TodoRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.todo.adapters.forRV.TodoViewHolder> {
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> viewTodo = null;
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, java.lang.Integer, kotlin.Unit> checkBoxClicked = null;
    private final kotlin.jvm.functions.Function0<com.example.todo.common.ItemsEditMode> getEditMode = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> selectItem = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> unSelectItem = null;
    private final java.util.List<com.example.todo.data.models.todo.Todo> todos = null;
    
    public TodoRVAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.example.todo.data.models.todo.Todo, ? super androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> viewTodo, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super com.example.todo.data.models.todo.Todo, ? super java.lang.Integer, kotlin.Unit> checkBoxClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends com.example.todo.common.ItemsEditMode> getEditMode, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.Item, kotlin.Unit> selectItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.todo.data.models.Item, kotlin.Unit> unSelectItem) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.todo.data.models.todo.Todo> todos) {
    }
    
    public final void removeItem(int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.todo.adapters.forRV.TodoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.todo.adapters.forRV.TodoViewHolder holder, int position) {
    }
}