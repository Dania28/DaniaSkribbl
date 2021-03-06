// Generated by view binder compiler. Do not edit!
package com.dania.guessit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.dania.guessit.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRoomBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView adminIv;

  @NonNull
  public final TextView adminTv;

  @NonNull
  public final ImageView backIv;

  @NonNull
  public final LinearLayout btmll;

  @NonNull
  public final ImageView copyIv;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final TextView roomIdTv;

  @NonNull
  public final TextView roundsTv;

  @NonNull
  public final RecyclerView rv;

  @NonNull
  public final View separator;

  @NonNull
  public final View separator2;

  @NonNull
  public final ImageView shareIv;

  @NonNull
  public final TextView startTv;

  @NonNull
  public final TextView timerTv;

  @NonNull
  public final RelativeLayout topRl;

  private ActivityRoomBinding(@NonNull RelativeLayout rootView, @NonNull CircleImageView adminIv,
      @NonNull TextView adminTv, @NonNull ImageView backIv, @NonNull LinearLayout btmll,
      @NonNull ImageView copyIv, @NonNull LinearLayout ll, @NonNull TextView roomIdTv,
      @NonNull TextView roundsTv, @NonNull RecyclerView rv, @NonNull View separator,
      @NonNull View separator2, @NonNull ImageView shareIv, @NonNull TextView startTv,
      @NonNull TextView timerTv, @NonNull RelativeLayout topRl) {
    this.rootView = rootView;
    this.adminIv = adminIv;
    this.adminTv = adminTv;
    this.backIv = backIv;
    this.btmll = btmll;
    this.copyIv = copyIv;
    this.ll = ll;
    this.roomIdTv = roomIdTv;
    this.roundsTv = roundsTv;
    this.rv = rv;
    this.separator = separator;
    this.separator2 = separator2;
    this.shareIv = shareIv;
    this.startTv = startTv;
    this.timerTv = timerTv;
    this.topRl = topRl;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_room, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRoomBinding bind(@NonNull View rootView) {
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

      id = R.id.backIv;
      ImageView backIv = rootView.findViewById(id);
      if (backIv == null) {
        break missingId;
      }

      id = R.id.btmll;
      LinearLayout btmll = rootView.findViewById(id);
      if (btmll == null) {
        break missingId;
      }

      id = R.id.copyIv;
      ImageView copyIv = rootView.findViewById(id);
      if (copyIv == null) {
        break missingId;
      }

      id = R.id.ll;
      LinearLayout ll = rootView.findViewById(id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.roomIdTv;
      TextView roomIdTv = rootView.findViewById(id);
      if (roomIdTv == null) {
        break missingId;
      }

      id = R.id.roundsTv;
      TextView roundsTv = rootView.findViewById(id);
      if (roundsTv == null) {
        break missingId;
      }

      id = R.id.rv;
      RecyclerView rv = rootView.findViewById(id);
      if (rv == null) {
        break missingId;
      }

      id = R.id.separator;
      View separator = rootView.findViewById(id);
      if (separator == null) {
        break missingId;
      }

      id = R.id.separator2;
      View separator2 = rootView.findViewById(id);
      if (separator2 == null) {
        break missingId;
      }

      id = R.id.shareIv;
      ImageView shareIv = rootView.findViewById(id);
      if (shareIv == null) {
        break missingId;
      }

      id = R.id.startTv;
      TextView startTv = rootView.findViewById(id);
      if (startTv == null) {
        break missingId;
      }

      id = R.id.timerTv;
      TextView timerTv = rootView.findViewById(id);
      if (timerTv == null) {
        break missingId;
      }

      id = R.id.top_rl;
      RelativeLayout topRl = rootView.findViewById(id);
      if (topRl == null) {
        break missingId;
      }

      return new ActivityRoomBinding((RelativeLayout) rootView, adminIv, adminTv, backIv, btmll,
          copyIv, ll, roomIdTv, roundsTv, rv, separator, separator2, shareIv, startTv, timerTv,
          topRl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
