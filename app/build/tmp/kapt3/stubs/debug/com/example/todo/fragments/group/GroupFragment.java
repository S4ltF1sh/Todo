package com.example.todo.fragments.group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\bH\u0002J\b\u0010\"\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\bH\u0002J\b\u0010$\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0014\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0006H\u0002J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0006H\u0002J\u001a\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00107\u001a\u00020\bH\u0002J\b\u00108\u001a\u00020\bH\u0002J\b\u00109\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/example/todo/fragments/group/GroupFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/todo/adapters/forRV/TodoRVAdapter;", "addRemind", "Lkotlin/Function1;", "Lcom/example/todo/data/models/todo/Todo;", "", "binding", "Lcom/example/todo/databinding/FragmentGroupBinding;", "checkDoneTodo", "Lkotlin/Function2;", "", "getEditMode", "Lkotlin/Function0;", "Lcom/example/todo/common/ItemsEditMode;", "groupRepository", "Lcom/example/todo/data/repositories/GroupRepository;", "groupViewModel", "Lcom/example/todo/fragments/group/GroupViewModel;", "getGroupViewModel", "()Lcom/example/todo/fragments/group/GroupViewModel;", "groupViewModel$delegate", "Lkotlin/Lazy;", "removeRemind", "selectItem", "Lcom/example/todo/data/models/Item;", "todoRepository", "Lcom/example/todo/data/repositories/TodoRepository;", "unSelectItem", "viewTodo", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "enterEditMode", "enterNavigationMode", "navigationButtonClicked", "notifyEditModeChange", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemSelectedListener", "Landroid/view/MenuItem;", "", "onMenuItemClickListener", "onViewCreated", "view", "setContent", "setOnClick", "updateGroup", "app_debug"})
public final class GroupFragment extends androidx.fragment.app.Fragment {
    private com.example.todo.databinding.FragmentGroupBinding binding;
    private com.example.todo.data.repositories.TodoRepository todoRepository;
    private com.example.todo.data.repositories.GroupRepository groupRepository;
    private com.example.todo.adapters.forRV.TodoRVAdapter adapter;
    private final kotlin.Lazy groupViewModel$delegate = null;
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, androidx.navigation.fragment.FragmentNavigator.Extras, kotlin.Unit> viewTodo = null;
    private final kotlin.jvm.functions.Function2<com.example.todo.data.models.todo.Todo, java.lang.Integer, kotlin.Unit> checkDoneTodo = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> selectItem = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.Item, kotlin.Unit> unSelectItem = null;
    private final kotlin.jvm.functions.Function0<com.example.todo.common.ItemsEditMode> getEditMode = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> addRemind = null;
    private final kotlin.jvm.functions.Function1<com.example.todo.data.models.todo.Todo, kotlin.Unit> removeRemind = null;
    private java.util.HashMap _$_findViewCache;
    
    public GroupFragment() {
        super();
    }
    
    private final com.example.todo.fragments.group.GroupViewModel getGroupViewModel() {
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
    
    private final void setOnClick() {
    }
    
    private final void navigationButtonClicked() {
    }
    
    private final void updateGroup() {
    }
    
    private final kotlin.jvm.functions.Function1<android.view.MenuItem, java.lang.Boolean> onMenuItemClickListener() {
        return null;
    }
    
    private final kotlin.jvm.functions.Function1<android.view.MenuItem, java.lang.Boolean> onItemSelectedListener() {
        return null;
    }
    
    private final void enterEditMode() {
    }
    
    private final void enterNavigationMode() {
    }
    
    private final void notifyEditModeChange() {
    }
}