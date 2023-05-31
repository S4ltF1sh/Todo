// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTodoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ChipGroup chipContainer;

  @NonNull
  public final Chip chipGroup;

  @NonNull
  public final Chip chipTime;

  @NonNull
  public final EditText edtNote;

  @NonNull
  public final EditText edtTitle;

  @NonNull
  public final HorizontalScrollView horizontalScrollView;

  @NonNull
  public final MaterialToolbar toolBar;

  private FragmentTodoBinding(@NonNull LinearLayout rootView, @NonNull ChipGroup chipContainer,
      @NonNull Chip chipGroup, @NonNull Chip chipTime, @NonNull EditText edtNote,
      @NonNull EditText edtTitle, @NonNull HorizontalScrollView horizontalScrollView,
      @NonNull MaterialToolbar toolBar) {
    this.rootView = rootView;
    this.chipContainer = chipContainer;
    this.chipGroup = chipGroup;
    this.chipTime = chipTime;
    this.edtNote = edtNote;
    this.edtTitle = edtTitle;
    this.horizontalScrollView = horizontalScrollView;
    this.toolBar = toolBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_todo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTodoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chipContainer;
      ChipGroup chipContainer = ViewBindings.findChildViewById(rootView, id);
      if (chipContainer == null) {
        break missingId;
      }

      id = R.id.chipGroup;
      Chip chipGroup = ViewBindings.findChildViewById(rootView, id);
      if (chipGroup == null) {
        break missingId;
      }

      id = R.id.chipTime;
      Chip chipTime = ViewBindings.findChildViewById(rootView, id);
      if (chipTime == null) {
        break missingId;
      }

      id = R.id.edtNote;
      EditText edtNote = ViewBindings.findChildViewById(rootView, id);
      if (edtNote == null) {
        break missingId;
      }

      id = R.id.edtTitle;
      EditText edtTitle = ViewBindings.findChildViewById(rootView, id);
      if (edtTitle == null) {
        break missingId;
      }

      id = R.id.horizontalScrollView;
      HorizontalScrollView horizontalScrollView = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollView == null) {
        break missingId;
      }

      id = R.id.toolBar;
      MaterialToolbar toolBar = ViewBindings.findChildViewById(rootView, id);
      if (toolBar == null) {
        break missingId;
      }

      return new FragmentTodoBinding((LinearLayout) rootView, chipContainer, chipGroup, chipTime,
          edtNote, edtTitle, horizontalScrollView, toolBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
