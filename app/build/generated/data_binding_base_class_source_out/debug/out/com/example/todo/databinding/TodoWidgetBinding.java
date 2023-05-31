// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TodoWidgetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imvAdd;

  @NonNull
  public final ImageView imvClock1;

  @NonNull
  public final ImageView imvClock2;

  @NonNull
  public final ImageView imvClock3;

  @NonNull
  public final ImageView imvClock4;

  @NonNull
  public final RelativeLayout todo1;

  @NonNull
  public final RelativeLayout todo2;

  @NonNull
  public final RelativeLayout todo3;

  @NonNull
  public final RelativeLayout todo4;

  @NonNull
  public final RelativeLayout top;

  @NonNull
  public final TextView tvTitle1;

  @NonNull
  public final TextView tvTitle2;

  @NonNull
  public final TextView tvTitle3;

  @NonNull
  public final TextView tvTitle4;

  @NonNull
  public final TextView tvTodo;

  private TodoWidgetBinding(@NonNull LinearLayout rootView, @NonNull ImageView imvAdd,
      @NonNull ImageView imvClock1, @NonNull ImageView imvClock2, @NonNull ImageView imvClock3,
      @NonNull ImageView imvClock4, @NonNull RelativeLayout todo1, @NonNull RelativeLayout todo2,
      @NonNull RelativeLayout todo3, @NonNull RelativeLayout todo4, @NonNull RelativeLayout top,
      @NonNull TextView tvTitle1, @NonNull TextView tvTitle2, @NonNull TextView tvTitle3,
      @NonNull TextView tvTitle4, @NonNull TextView tvTodo) {
    this.rootView = rootView;
    this.imvAdd = imvAdd;
    this.imvClock1 = imvClock1;
    this.imvClock2 = imvClock2;
    this.imvClock3 = imvClock3;
    this.imvClock4 = imvClock4;
    this.todo1 = todo1;
    this.todo2 = todo2;
    this.todo3 = todo3;
    this.todo4 = todo4;
    this.top = top;
    this.tvTitle1 = tvTitle1;
    this.tvTitle2 = tvTitle2;
    this.tvTitle3 = tvTitle3;
    this.tvTitle4 = tvTitle4;
    this.tvTodo = tvTodo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TodoWidgetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TodoWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.todo_widget, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TodoWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imvAdd;
      ImageView imvAdd = ViewBindings.findChildViewById(rootView, id);
      if (imvAdd == null) {
        break missingId;
      }

      id = R.id.imvClock1;
      ImageView imvClock1 = ViewBindings.findChildViewById(rootView, id);
      if (imvClock1 == null) {
        break missingId;
      }

      id = R.id.imvClock2;
      ImageView imvClock2 = ViewBindings.findChildViewById(rootView, id);
      if (imvClock2 == null) {
        break missingId;
      }

      id = R.id.imvClock3;
      ImageView imvClock3 = ViewBindings.findChildViewById(rootView, id);
      if (imvClock3 == null) {
        break missingId;
      }

      id = R.id.imvClock4;
      ImageView imvClock4 = ViewBindings.findChildViewById(rootView, id);
      if (imvClock4 == null) {
        break missingId;
      }

      id = R.id.todo1;
      RelativeLayout todo1 = ViewBindings.findChildViewById(rootView, id);
      if (todo1 == null) {
        break missingId;
      }

      id = R.id.todo2;
      RelativeLayout todo2 = ViewBindings.findChildViewById(rootView, id);
      if (todo2 == null) {
        break missingId;
      }

      id = R.id.todo3;
      RelativeLayout todo3 = ViewBindings.findChildViewById(rootView, id);
      if (todo3 == null) {
        break missingId;
      }

      id = R.id.todo4;
      RelativeLayout todo4 = ViewBindings.findChildViewById(rootView, id);
      if (todo4 == null) {
        break missingId;
      }

      id = R.id.top;
      RelativeLayout top = ViewBindings.findChildViewById(rootView, id);
      if (top == null) {
        break missingId;
      }

      id = R.id.tvTitle1;
      TextView tvTitle1 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle1 == null) {
        break missingId;
      }

      id = R.id.tvTitle2;
      TextView tvTitle2 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle2 == null) {
        break missingId;
      }

      id = R.id.tvTitle3;
      TextView tvTitle3 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle3 == null) {
        break missingId;
      }

      id = R.id.tvTitle4;
      TextView tvTitle4 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle4 == null) {
        break missingId;
      }

      id = R.id.tvTodo;
      TextView tvTodo = ViewBindings.findChildViewById(rootView, id);
      if (tvTodo == null) {
        break missingId;
      }

      return new TodoWidgetBinding((LinearLayout) rootView, imvAdd, imvClock1, imvClock2, imvClock3,
          imvClock4, todo1, todo2, todo3, todo4, top, tvTitle1, tvTitle2, tvTitle3, tvTitle4,
          tvTodo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
