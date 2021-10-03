// Generated by view binder compiler. Do not edit!
package com.dania.guessit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.dania.guessit.R;
import com.facebook.drawee.view.SimpleDraweeView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlaygroundBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView adminIv;

  @NonNull
  public final TextView adminTv;

  @NonNull
  public final LinearLayout drawerLl;

  @NonNull
  public final EditText et;

  @NonNull
  public final RelativeLayout keyboardRl;

  @NonNull
  public final LinearLayout rankLl;

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

  private ActivityPlaygroundBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleImageView adminIv, @NonNull TextView adminTv, @NonNull LinearLayout drawerLl,
      @NonNull EditText et, @NonNull RelativeLayout keyboardRl, @NonNull LinearLayout rankLl,
      @NonNull View separator, @NonNull TextView timer, @NonNull ImageView timerIv,
      @NonNull RelativeLayout topRl, @NonNull SimpleDraweeView wb) {
    this.rootView = rootView;
    this.adminIv = adminIv;
    this.adminTv = adminTv;
    this.drawerLl = drawerLl;
    this.et = et;
    this.keyboardRl = keyboardRl;
    this.rankLl = rankLl;
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
  public static ActivityPlaygroundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlaygroundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_playground, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlaygroundBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adminIv;
      CircleImageView adminIv = rootView.findViewById(id);
      if (adminIv == null) {
        break missingId;
      }

      id = R.id.adminTv;
      TextView adminTv = rootView.findViewById(id);
      if (adminTv == null) {
        break missingId;
      }

      id = R.id.drawer_ll;
      LinearLayout drawerLl = rootView.findViewById(id);
      if (drawerLl == null) {
        break missingId;
      }

      id = R.id.et;
      EditText et = rootView.findViewById(id);
      if (et == null) {
        break missingId;
      }

      id = R.id.keyboardRl;
      RelativeLayout keyboardRl = rootView.findViewById(id);
      if (keyboardRl == null) {
        break missingId;
      }

      id = R.id.rank_ll;
      LinearLayout rankLl = rootView.findViewById(id);
      if (rankLl == null) {
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

      return new ActivityPlaygroundBinding((RelativeLayout) rootView, adminIv, adminTv, drawerLl,
          et, keyboardRl, rankLl, separator, timer, timerIv, topRl, wb);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}