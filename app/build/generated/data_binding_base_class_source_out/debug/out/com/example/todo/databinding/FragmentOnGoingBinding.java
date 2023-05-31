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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOnGoingBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final FloatingActionButton fabAdd;

  @NonNull
  public final RecyclerView rvItemList;

  @NonNull
  public final TextView tvShrugFace;

  private FragmentOnGoingBinding(@NonNull CoordinatorLayout rootView,
      @NonNull FloatingActionButton fabAdd, @NonNull RecyclerView rvItemList,
      @NonNull TextView tvShrugFace) {
    this.rootView = rootView;
    this.fabAdd = fabAdd;
    this.rvItemList = rvItemList;
    this.tvShrugFace = tvShrugFace;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOnGoingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOnGoingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_on_going, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOnGoingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fabAdd;
      FloatingActionButton fabAdd = ViewBindings.findChildViewById(rootView, id);
      if (fabAdd == null) {
        break missingId;
      }

      id = R.id.rvItemList;
      RecyclerView rvItemList = ViewBindings.findChildViewById(rootView, id);
      if (rvItemList == null) {
        break missingId;
      }

      id = R.id.tvShrugFace;
      TextView tvShrugFace = ViewBindings.findChildViewById(rootView, id);
      if (tvShrugFace == null) {
        break missingId;
      }

      return new FragmentOnGoingBinding((CoordinatorLayout) rootView, fabAdd, rvItemList,
          tvShrugFace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
