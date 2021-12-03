// Generated by view binder compiler. Do not edit!
package org.techtown.repose.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.techtown.repose.R;

public final class FragMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnSelectPose;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageButton imageButton5;

  @NonNull
  public final ImageButton imageButton7;

  @NonNull
  public final ImageButton imageButton8;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final DotsIndicator poseIndicator;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final ViewPager2 vpMainViewPager;

  private FragMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton btnSelectPose,
      @NonNull ImageButton imageButton2, @NonNull ImageButton imageButton5,
      @NonNull ImageButton imageButton7, @NonNull ImageButton imageButton8,
      @NonNull LinearLayout linearLayout, @NonNull DotsIndicator poseIndicator,
      @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull ViewPager2 vpMainViewPager) {
    this.rootView = rootView;
    this.btnSelectPose = btnSelectPose;
    this.imageButton2 = imageButton2;
    this.imageButton5 = imageButton5;
    this.imageButton7 = imageButton7;
    this.imageButton8 = imageButton8;
    this.linearLayout = linearLayout;
    this.poseIndicator = poseIndicator;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.vpMainViewPager = vpMainViewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.frag_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_SelectPose;
      ImageButton btnSelectPose = rootView.findViewById(id);
      if (btnSelectPose == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = rootView.findViewById(id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageButton5;
      ImageButton imageButton5 = rootView.findViewById(id);
      if (imageButton5 == null) {
        break missingId;
      }

      id = R.id.imageButton7;
      ImageButton imageButton7 = rootView.findViewById(id);
      if (imageButton7 == null) {
        break missingId;
      }

      id = R.id.imageButton8;
      ImageButton imageButton8 = rootView.findViewById(id);
      if (imageButton8 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.pose_indicator;
      DotsIndicator poseIndicator = rootView.findViewById(id);
      if (poseIndicator == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.vp_mainViewPager;
      ViewPager2 vpMainViewPager = rootView.findViewById(id);
      if (vpMainViewPager == null) {
        break missingId;
      }

      return new FragMainBinding((ConstraintLayout) rootView, btnSelectPose, imageButton2,
          imageButton5, imageButton7, imageButton8, linearLayout, poseIndicator, textView,
          textView2, textView3, textView6, textView7, vpMainViewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}