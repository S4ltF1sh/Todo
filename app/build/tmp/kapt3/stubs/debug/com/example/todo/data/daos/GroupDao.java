package com.example.todo.data.daos;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\"\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/example/todo/data/daos/GroupDao;", "", "add", "", "group", "Lcom/example/todo/data/models/group/Group;", "delete", "getAll", "", "getByTitle", "title", "", "getGroupWithTodosByGroupName", "Lcom/example/todo/data/models/GroupWithTodos;", "groupName", "getGroupsWithTodos", "removeGroupByTitle", "update", "updateByTitle", "oldTitle", "newTitle", "newEditDate", "Ljava/util/Date;", "app_debug"})
public abstract interface GroupDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM group_table")
    public abstract java.util.List<com.example.todo.data.models.group.Group> getAll();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM group_table WHERE title = :title")
    public abstract com.example.todo.data.models.group.Group getByTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title);
    
    @androidx.room.Query(value = "DELETE FROM group_table WHERE title =:title")
    public abstract void removeGroupByTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title);
    
    @androidx.room.Query(value = "UPDATE group_table SET title = :newTitle, group_edit_date = :newEditDate WHERE title = :oldTitle")
    public abstract void updateByTitle(@org.jetbrains.annotations.NotNull
    java.lang.String oldTitle, @org.jetbrains.annotations.NotNull
    java.lang.String newTitle, @org.jetbrains.annotations.Nullable
    java.util.Date newEditDate);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM group_table")
    @androidx.room.Transaction
    public abstract java.util.List<com.example.todo.data.models.GroupWithTodos> getGroupsWithTodos();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM group_table WHERE title = :groupName")
    @androidx.room.Transaction
    public abstract com.example.todo.data.models.GroupWithTodos getGroupWithTodosByGroupName(@org.jetbrains.annotations.NotNull
    java.lang.String groupName);
    
    @androidx.room.Insert
    public abstract void add(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.group.Group group);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.group.Group group);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.group.Group group);
}