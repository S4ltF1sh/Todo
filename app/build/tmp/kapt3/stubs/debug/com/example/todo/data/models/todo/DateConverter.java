package com.example.todo.data.models.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/todo/data/models/todo/DateConverter;", "", "()V", "toDate", "Ljava/util/Date;", "timestamp", "", "(Ljava/lang/Long;)Ljava/util/Date;", "toTimestamp", "date", "(Ljava/util/Date;)Ljava/lang/Long;", "app_debug"})
public final class DateConverter {
    
    public DateConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.Date toDate(@org.jetbrains.annotations.Nullable
    java.lang.Long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.Long toTimestamp(@org.jetbrains.annotations.Nullable
    java.util.Date date) {
        return null;
    }
}