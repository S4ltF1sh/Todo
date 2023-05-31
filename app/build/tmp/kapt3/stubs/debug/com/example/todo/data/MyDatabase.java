package com.example.todo.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.todo.data.models.todo.DateConverter.class})
@androidx.room.Database(entities = {com.example.todo.data.models.todo.Todo.class, com.example.todo.data.models.group.Group.class}, views = {com.example.todo.data.models.OnGoingTodo.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/example/todo/data/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "groupDao", "Lcom/example/todo/data/daos/GroupDao;", "getGroupDao", "()Lcom/example/todo/data/daos/GroupDao;", "todoDao", "Lcom/example/todo/data/daos/TodoDao;", "getTodoDao", "()Lcom/example/todo/data/daos/TodoDao;", "Companion", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.todo.data.MyDatabase.Companion Companion = null;
    private static com.example.todo.data.MyDatabase INSTANCE;
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.todo.data.daos.TodoDao getTodoDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.todo.data.daos.GroupDao getGroupDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/todo/data/MyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/todo/data/MyDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.todo.data.MyDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}