// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGroupState2Binding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardViewTodos;

  @NonNull
  public final ImageView imvIcon;

  @NonNull
  public final TextView tvTitle;

  private ItemGroupState2Binding(@NonNull CardView rootView, @NonNull CardView cardViewTodos,
      @NonNull ImageView imvIcon, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.cardViewTodos = cardViewTodos;
    this.imvIcon = imvIcon;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGroupState2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGroupState2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_group_state_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGroupState2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardViewTodos = (CardView) rootView;

      id = R.id.imvIcon;
      ImageView imvIcon = ViewBindings.findChildViewById(rootView, id);
      if (imvIcon == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ItemGroupState2Binding((CardView) rootView, cardViewTodos, imvIcon, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}