// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatTextView ageU;

  @NonNull
  public final AppCompatTextView codeU;

  @NonNull
  public final AppCompatTextView phoneU;

  @NonNull
  public final AppCompatTextView userL;

  @NonNull
  public final AppCompatTextView userN;

  @NonNull
  public final AppCompatTextView userNa;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatTextView ageU,
      @NonNull AppCompatTextView codeU, @NonNull AppCompatTextView phoneU,
      @NonNull AppCompatTextView userL, @NonNull AppCompatTextView userN,
      @NonNull AppCompatTextView userNa) {
    this.rootView = rootView;
    this.ageU = ageU;
    this.codeU = codeU;
    this.phoneU = phoneU;
    this.userL = userL;
    this.userN = userN;
    this.userNa = userNa;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ageU;
      AppCompatTextView ageU = ViewBindings.findChildViewById(rootView, id);
      if (ageU == null) {
        break missingId;
      }

      id = R.id.codeU;
      AppCompatTextView codeU = ViewBindings.findChildViewById(rootView, id);
      if (codeU == null) {
        break missingId;
      }

      id = R.id.phoneU;
      AppCompatTextView phoneU = ViewBindings.findChildViewById(rootView, id);
      if (phoneU == null) {
        break missingId;
      }

      id = R.id.userL;
      AppCompatTextView userL = ViewBindings.findChildViewById(rootView, id);
      if (userL == null) {
        break missingId;
      }

      id = R.id.userN;
      AppCompatTextView userN = ViewBindings.findChildViewById(rootView, id);
      if (userN == null) {
        break missingId;
      }

      id = R.id.userNa;
      AppCompatTextView userNa = ViewBindings.findChildViewById(rootView, id);
      if (userNa == null) {
        break missingId;
      }

      return new FragmentProfileBinding((RelativeLayout) rootView, ageU, codeU, phoneU, userL,
          userN, userNa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}