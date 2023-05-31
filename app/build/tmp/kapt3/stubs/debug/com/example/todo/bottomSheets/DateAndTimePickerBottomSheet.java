package com.example.todo.bottomSheets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/todo/bottomSheets/DateAndTimePickerBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "setNewTime", "Lkotlin/Function1;", "Ljava/util/Date;", "", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/example/todo/databinding/BottomSheetDateAndTimePickerBinding;", "onDateChangedListener", "Lkotlin/Function4;", "Landroid/widget/DatePicker;", "", "onTimeChangeListener", "Lkotlin/Function3;", "Landroid/widget/TimePicker;", "cancelButtonClicked", "getDate", "notifyDetailTimeChange", "okButtonClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setListener", "setOnClick", "app_debug"})
public final class DateAndTimePickerBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final kotlin.jvm.functions.Function1<java.util.Date, kotlin.Unit> setNewTime = null;
    private com.example.todo.databinding.BottomSheetDateAndTimePickerBinding binding;
    private final kotlin.jvm.functions.Function4<android.widget.DatePicker, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> onDateChangedListener = null;
    private final kotlin.jvm.functions.Function3<android.widget.TimePicker, java.lang.Integer, java.lang.Integer, kotlin.Unit> onTimeChangeListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public DateAndTimePickerBottomSheet(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.Date, kotlin.Unit> setNewTime) {
        super();
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
    
    private final void setOnClick() {
    }
    
    private final void setListener() {
    }
    
    private final void notifyDetailTimeChange() {
    }
    
    private final void cancelButtonClicked() {
    }
    
    private final void okButtonClicked() {
    }
    
    private final java.util.Date getDate() {
        return null;
    }
}