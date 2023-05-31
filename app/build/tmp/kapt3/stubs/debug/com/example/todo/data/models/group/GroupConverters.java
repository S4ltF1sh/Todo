package com.example.todo.data.models.group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/todo/data/models/group/GroupConverters;", "", "()V", "fromTodoList", "", "list", "", "", "toTodoList", "Lcom/example/todo/data/models/todo/Todo;", "string", "app_debug"})
public final class GroupConverters {
    
    public GroupConverters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromTodoList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.List<com.example.todo.data.models.todo.Todo> toTodoList(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
}