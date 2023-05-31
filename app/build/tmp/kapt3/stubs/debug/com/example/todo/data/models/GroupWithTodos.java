package com.example.todo.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/todo/data/models/GroupWithTodos;", "Ljava/io/Serializable;", "Lcom/example/todo/data/models/Item;", "group", "Lcom/example/todo/data/models/group/Group;", "todos", "", "Lcom/example/todo/data/models/todo/Todo;", "(Lcom/example/todo/data/models/group/Group;Ljava/util/List;)V", "getGroup", "()Lcom/example/todo/data/models/group/Group;", "getTodos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
public final class GroupWithTodos extends com.example.todo.data.models.Item implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable
    @androidx.room.Embedded
    private final com.example.todo.data.models.group.Group group = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Relation(parentColumn = "title", entityColumn = "groupName", entity = com.example.todo.data.models.OnGoingTodo.class)
    private final java.util.List<com.example.todo.data.models.todo.Todo> todos = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.data.models.GroupWithTodos copy(@org.jetbrains.annotations.Nullable
    com.example.todo.data.models.group.Group group, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.todo.data.models.todo.Todo> todos) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GroupWithTodos(@org.jetbrains.annotations.Nullable
    com.example.todo.data.models.group.Group group, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.todo.data.models.todo.Todo> todos) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.todo.data.models.group.Group component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.todo.data.models.group.Group getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.todo.Todo> getTodos() {
        return null;
    }
}