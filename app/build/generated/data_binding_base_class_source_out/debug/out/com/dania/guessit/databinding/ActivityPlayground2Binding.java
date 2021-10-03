// Generated by view binder compiler. Do not edit!
package com.dania.guessit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.dania.guessit.R;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlayground2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout keyboardRl;

  @NonNull
  public final View separator;

  @NonNull
  public final TextView timer;

  @NonNull
  public final ImageView timerIv;

  @NonNull
  public final RelativeLayout topRl;

  @NonNull
  public final SimpleDraweeView wb;

  private ActivityPlayground2Binding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout keyboardRl, @NonNull View separator, @NonNull TextView timer,
      @NonNull ImageView timerIv, @NonNull RelativeLayout topRl, @NonNull SimpleDraweeView wb) {
    this.rootView = rootView;
    this.keyboardRl = keyboardRl;
    this.separator = separator;
    this.timer = timer;
    this.timerIv = timerIv;
    this.topRl = topRl;
    this.wb = wb;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlayground2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlayground2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_playground2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlayground2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.keyboardRl;
      RelativeLayout keyboardRl = rootView.findViewById(id);
      if (keyboardRl == null) {
        break missingId;
      }

      id = R.id.separator;
      View separator = rootView.findViewById(id);
      if (separator == null) {
        break missingId;
      }

      id = R.id.timer;
      TextView timer = rootView.findViewById(id);
      if (timer == null) {
        break missingId;
      }

      id = R.id.timerIv;
      ImageView timerIv = rootView.findViewById(id);
      if (timerIv == null) {
        break missingId;
      }

      id = R.id.top_rl;
      RelativeLayout topRl = rootView.findViewById(id);
      if (topRl == null) {
        break missingId;
      }

      id = R.id.wb;
      SimpleDraweeView wb = rootView.findViewById(id);
      if (wb == null) {
        break missingId;
      }

      return new ActivityPlayground2Binding((RelativeLayout) rootView, keyboardRl, separator, timer,
          timerIv, topRl, wb);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
