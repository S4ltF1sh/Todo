// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetDateAndTimePickerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnOK;

  @NonNull
  public final DatePicker datePicker;

  @NonNull
  public final TimePicker timePicker;

  @NonNull
  public final TextView tvDetailTime;

  @NonNull
  public final TextView tvDialogTitle;

  private BottomSheetDateAndTimePickerBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnCancel, @NonNull Button btnOK, @NonNull DatePicker datePicker,
      @NonNull TimePicker timePicker, @NonNull TextView tvDetailTime,
      @NonNull TextView tvDialogTitle) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnOK = btnOK;
    this.datePicker = datePicker;
    this.timePicker = timePicker;
    this.tvDetailTime = tvDetailTime;
    this.tvDialogTitle = tvDialogTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetDateAndTimePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetDateAndTimePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_date_and_time_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetDateAndTimePickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnOK;
      Button btnOK = ViewBindings.findChildViewById(rootView, id);
      if (btnOK == null) {
        break missingId;
      }

      id = R.id.datePicker;
      DatePicker datePicker = ViewBindings.findChildViewById(rootView, id);
      if (datePicker == null) {
        break missingId;
      }

      id = R.id.timePicker;
      TimePicker timePicker = ViewBindings.findChildViewById(rootView, id);
      if (timePicker == null) {
        break missingId;
      }

      id = R.id.tvDetailTime;
      TextView tvDetailTime = ViewBindings.findChildViewById(rootView, id);
      if (tvDetailTime == null) {
        break missingId;
      }

      id = R.id.tvDialogTitle;
      TextView tvDialogTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvDialogTitle == null) {
        break missingId;
      }

      return new BottomSheetDateAndTimePickerBinding((RelativeLayout) rootView, btnCancel, btnOK,
          datePicker, timePicker, tvDetailTime, tvDialogTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
