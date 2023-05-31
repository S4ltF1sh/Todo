package com.example.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\bH\u0014J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/todo/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "alarmManager", "Landroid/app/AlarmManager;", "binding", "Lcom/example/todo/databinding/ActivityMainBinding;", "addRemind", "", "todo", "Lcom/example/todo/data/models/todo/Todo;", "getRemindIntent", "Landroid/content/Intent;", "getRemindPendingIntent", "Landroid/app/PendingIntent;", "intent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "removeRemind", "updateWidgets", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.todo.databinding.ActivityMainBinding binding;
    private android.app.AlarmManager alarmManager;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void addRemind(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo) {
    }
    
    public final void removeRemind(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.todo.Todo todo) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final android.content.Intent getRemindIntent(com.example.todo.data.models.todo.Todo todo) {
        return null;
    }
    
    private final android.app.PendingIntent getRemindPendingIntent(android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    public final void updateWidgets() {
    }
}