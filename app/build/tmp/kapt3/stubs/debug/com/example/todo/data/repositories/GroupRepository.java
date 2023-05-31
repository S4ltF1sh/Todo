package com.example.todo.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bJ \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/todo/data/repositories/GroupRepository;", "", "groupDao", "Lcom/example/todo/data/daos/GroupDao;", "(Lcom/example/todo/data/daos/GroupDao;)V", "addGroup", "", "newGroup", "Lcom/example/todo/data/models/group/Group;", "deleteGroupByTitle", "title", "", "getAll", "", "getGroupByTitle", "getGroupsWithTodos", "Lcom/example/todo/data/models/GroupWithTodos;", "getGroupsWithTodosByGroupName", "groupName", "removeGroup", "group", "updateGroup", "updateGroupByTitle", "oldTitle", "newTitle", "newDate", "Ljava/util/Date;", "app_debug"})
public final class GroupRepository {
    private final com.example.todo.data.daos.GroupDao groupDao = null;
    
    public GroupRepository(@org.jetbrains.annotations.NotNull
    com.example.todo.data.daos.GroupDao groupDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.todo.data.models.group.Group> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.todo.data.models.group.Group getGroupByTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.todo.data.models.GroupWithTodos> getGroupsWithTodos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.data.models.GroupWithTodos getGroupsWithTodosByGroupName(@org.jetbrains.annotations.NotNull
    java.lang.String groupName) {
        return null;
    }
    
    public final void addGroup(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.group.Group newGroup) {
    }
    
    public final void updateGroup(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.group.Group group) {
    }
    
    public final void updateGroupByTitle(@org.jetbrains.annotations.NotNull
    java.lang.String oldTitle, @org.jetbrains.annotations.NotNull
    java.lang.String newTitle, @org.jetbrains.annotations.Nullable
    java.util.Date newDate) {
    }
    
    public final void removeGroup(@org.jetbrains.annotations.NotNull
    com.example.todo.data.models.group.Group group) {
    }
    
    public final void deleteGroupByTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
}