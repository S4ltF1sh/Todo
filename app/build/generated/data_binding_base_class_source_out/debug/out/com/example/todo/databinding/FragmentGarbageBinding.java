// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGarbageBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final RecyclerView rvDeletedTodoList;

  @NonNull
  public final TextView tvShrugFace;

  private FragmentGarbageBinding(@NonNull CoordinatorLayout rootView,
      @NonNull RecyclerView rvDeletedTodoList, @NonNull TextView tvShrugFace) {
    this.rootView = rootView;
    this.rvDeletedTodoList = rvDeletedTodoList;
    this.tvShrugFace = tvShrugFace;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGarbageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGarbageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_garbage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGarbageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rvDeletedTodoList;
      RecyclerView rvDeletedTodoList = ViewBindings.findChildViewById(rootView, id);
      if (rvDeletedTodoList == null) {
        break missingId;
      }

      id = R.id.tvShrugFace;
      TextView tvShrugFace = ViewBindings.findChildViewById(rootView, id);
      if (tvShrugFace == null) {
        break missingId;
      }

      return new FragmentGarbageBinding((CoordinatorLayout) rootView, rvDeletedTodoList,
          tvShrugFace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
