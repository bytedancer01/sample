package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cf.C1080d;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.Objects;
import nf.C6783a;
import org.apache.commons.codec.language.p254bm.ResourceConstants;
import org.apache.http.HttpHost;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity.class */
public class RoutingActivity extends ActivityC0243b {

    /* renamed from: l */
    public static C6783a f18098l;

    /* renamed from: d */
    public Context f18099d = this;

    /* renamed from: e */
    public Dialog f18100e;

    /* renamed from: f */
    public long f18101f;

    /* renamed from: g */
    public RelativeLayout f18102g;

    /* renamed from: h */
    public RelativeLayout f18103h;

    /* renamed from: i */
    public RelativeLayout f18104i;

    @BindView
    public ImageView iv_list_users;

    @BindView
    public ImageView iv_list_users_arrow;

    @BindView
    public ImageView iv_login_with_m3u;

    @BindView
    public ImageView iv_login_with_m3u_arrow;

    @BindView
    public ImageView iv_login_with_xtream_codes_api;

    @BindView
    public ImageView iv_login_with_xtream_codes_api_arrow;

    @BindView
    public ImageView iv_play_from_device;

    @BindView
    public ImageView iv_play_from_device_arrow;

    @BindView
    public ImageView iv_play_single_stream;

    @BindView
    public ImageView iv_play_single_stream_arrow;

    /* renamed from: j */
    public TextView f18105j;

    /* renamed from: k */
    public DialogC0242a f18106k;

    @BindView
    public RelativeLayout rl_list_users;

    @BindView
    public RelativeLayout rl_login_with_m3u;

    @BindView
    public RelativeLayout rl_login_with_xtream_codes_api;

    @BindView
    public RelativeLayout rl_play_from_device;

    @BindView
    public RelativeLayout rl_play_single_stream;

    @BindView
    public TextView tv_link2;

    @BindView
    public TextView tv_list_users;

    @BindView
    public TextView tv_login_with_m3u;

    @BindView
    public TextView tv_login_with_xtream_codes_api;

    @BindView
    public TextView tv_play_from_device;

    @BindView
    public TextView tv_play_single_stream;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$a.class */
    public class C2968a implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public final RoutingActivity f18107a;

        public C2968a(RoutingActivity routingActivity) {
            this.f18107a = routingActivity;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 6) {
                return false;
            }
            ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$b.class */
    public class ViewOnClickListenerC2969b implements View.OnClickListener {

        /* renamed from: b */
        public final RoutingActivity f18108b;

        public ViewOnClickListenerC2969b(RoutingActivity routingActivity) {
            this.f18108b = routingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.iptvsmarters.com/terms-and-conditions/"));
                this.f18108b.startActivity(intent);
            } catch (Exception e10) {
                Toast.makeText(this.f18108b.getApplicationContext(), "Your Device Not Supported !!", 1).show();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$c.class */
    public class C2970c extends WebViewClient {

        /* renamed from: a */
        public final RoutingActivity f18109a;

        public C2970c(RoutingActivity routingActivity) {
            this.f18109a = routingActivity;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            this.f18109a.f18102g.setVisibility(0);
            this.f18109a.f18103h.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$d.class */
    public class ViewOnClickListenerC2971d implements View.OnClickListener {

        /* renamed from: b */
        public final RoutingActivity f18110b;

        public ViewOnClickListenerC2971d(RoutingActivity routingActivity) {
            this.f18110b = routingActivity;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ApplySharedPref"})
        public void onClick(View view) {
            this.f18110b.getSharedPreferences("Accept_clicked", 0).edit().putString("Accept_clicked", "true").apply();
            this.f18110b.f18100e.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$e.class */
    public class ViewOnClickListenerC2972e implements View.OnClickListener {

        /* renamed from: b */
        public final RoutingActivity f18111b;

        public ViewOnClickListenerC2972e(RoutingActivity routingActivity) {
            this.f18111b = routingActivity;
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ApplySharedPref"})
        public void onClick(View view) {
            this.f18111b.finishAffinity();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$f.class */
    public class DialogInterfaceOnDismissListenerC2973f implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final RoutingActivity f18112b;

        public DialogInterfaceOnDismissListenerC2973f(RoutingActivity routingActivity) {
            this.f18112b = routingActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$g.class */
    public class C2974g implements C1080d.g {

        /* renamed from: a */
        public final String[] f18113a;

        /* renamed from: b */
        public final RoutingActivity f18114b;

        public C2974g(RoutingActivity routingActivity, String[] strArr) {
            this.f18114b = routingActivity;
            this.f18113a = strArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$h.class */
    public class ViewOnClickListenerC2975h implements View.OnClickListener {

        /* renamed from: b */
        public final RoutingActivity f18115b;

        public ViewOnClickListenerC2975h(RoutingActivity routingActivity) {
            this.f18115b = routingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f18115b.getPackageName(), null));
                this.f18115b.startActivityForResult(intent, 101);
                Toast.makeText(this.f18115b.f18099d, this.f18115b.f18099d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f18115b.f18106k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$i.class */
    public class ViewOnClickListenerC2976i implements View.OnClickListener {

        /* renamed from: b */
        public final RoutingActivity f18116b;

        public ViewOnClickListenerC2976i(RoutingActivity routingActivity) {
            this.f18116b = routingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18116b.f18106k.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$j.class */
    public class ViewOnClickListenerC2977j implements View.OnClickListener {

        /* renamed from: b */
        public final EditText f18117b;

        /* renamed from: c */
        public final RoutingActivity f18118c;

        public ViewOnClickListenerC2977j(RoutingActivity routingActivity, EditText editText) {
            this.f18118c = routingActivity;
            this.f18117b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context applicationContext;
            Resources resources;
            int i10;
            Intent intent;
            String trim = this.f18117b.getText().toString().trim();
            String substring = trim.substring(trim.lastIndexOf("/") + 1);
            if (TextUtils.isEmpty(trim)) {
                applicationContext = this.f18118c.getApplicationContext();
                resources = this.f18118c.getResources();
                i10 = 2132018348;
            } else if (!trim.contains(ClientConstants.DOMAIN_SCHEME) && (!trim.contains(HttpHost.DEFAULT_SCHEME_NAME) || !trim.contains(ResourceConstants.CMT) || !trim.contains(InstructionFileId.DOT) || !trim.contains("/") || !trim.contains(":") || !substring.contains(InstructionFileId.DOT))) {
                applicationContext = this.f18118c.getApplicationContext();
                resources = this.f18118c.getResources();
                i10 = 2132018345;
            } else {
                if (!trim.endsWith(".com") && (trim.startsWith(ClientConstants.DOMAIN_SCHEME) || trim.startsWith(HttpHost.DEFAULT_SCHEME_NAME))) {
                    if (this.f18118c.f18099d != null) {
                        C6783a unused = RoutingActivity.f18098l = new C6783a(this.f18118c.f18099d);
                        if (RoutingActivity.f18098l.m31285w() == 3) {
                            RoutingActivity.f18098l.m31258Q(this.f18118c.f18099d.getResources().getString(2132017829));
                            intent = new Intent(this.f18118c.f18099d, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(this.f18118c.f18099d, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "loadurl");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", trim);
                        this.f18118c.f18099d.startActivity(intent);
                        return;
                    }
                    return;
                }
                applicationContext = this.f18118c.getApplicationContext();
                resources = this.f18118c.getResources();
                i10 = 2132017383;
            }
            Toast.makeText(applicationContext, resources.getString(i10), 1).show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RoutingActivity$k.class */
    public class ViewOnFocusChangeListenerC2978k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18119b;

        /* renamed from: c */
        public final RoutingActivity f18120c;

        public ViewOnFocusChangeListenerC2978k(RoutingActivity routingActivity, View view) {
            this.f18120c = routingActivity;
            this.f18119b = view;
        }

        /* renamed from: a */
        public final void m16296a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18119b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16297b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18119b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16298c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18119b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            RelativeLayout relativeLayout;
            ImageView imageView;
            RelativeLayout relativeLayout2;
            ImageView imageView2;
            if (z10) {
                try {
                    View view2 = this.f18119b;
                    if (view2 == null || view2.getTag() == null || !this.f18119b.getTag().equals("rl_login_with_m3u")) {
                        View view3 = this.f18119b;
                        if (view3 == null || view3.getTag() == null || !this.f18119b.getTag().equals("rl_login_with_xtream_codes_api")) {
                            View view4 = this.f18119b;
                            if (view4 == null || view4.getTag() == null || !this.f18119b.getTag().equals("rl_play_from_device")) {
                                View view5 = this.f18119b;
                                if (view5 == null || view5.getTag() == null || !this.f18119b.getTag().equals("rl_play_single_stream")) {
                                    View view6 = this.f18119b;
                                    if (view6 == null || view6.getTag() == null || !this.f18119b.getTag().equals("rl_list_users")) {
                                        View view7 = this.f18119b;
                                        if (view7 == null || view7.getTag() == null || !this.f18119b.getTag().equals("rl_accept")) {
                                            View view8 = this.f18119b;
                                            if (view8 == null || view8.getTag() == null || !this.f18119b.getTag().equals("rl_cancel")) {
                                                View view9 = this.f18119b;
                                                if (view9 == null || view9.getTag() == null || !this.f18119b.getTag().equals("rl_play")) {
                                                    return;
                                                }
                                                this.f18120c.f18104i.setBackgroundResource(2131231557);
                                                this.f18120c.f18105j.setTextColor(this.f18120c.f18099d.getResources().getColor(2131100158));
                                                return;
                                            }
                                            relativeLayout = this.f18120c.f18103h;
                                        } else {
                                            relativeLayout = this.f18120c.f18102g;
                                        }
                                        relativeLayout.setBackgroundResource(2131230849);
                                        return;
                                    }
                                    this.f18120c.rl_list_users.setBackgroundResource(2131230849);
                                    this.f18120c.iv_list_users.setImageResource(2131231563);
                                    RoutingActivity routingActivity = this.f18120c;
                                    routingActivity.tv_list_users.setTextColor(routingActivity.f18099d.getResources().getColor(2131100158));
                                    imageView = this.f18120c.iv_list_users_arrow;
                                } else {
                                    this.f18120c.rl_play_single_stream.setBackgroundResource(2131230849);
                                    this.f18120c.iv_play_single_stream.setImageResource(2131231453);
                                    RoutingActivity routingActivity2 = this.f18120c;
                                    routingActivity2.tv_play_single_stream.setTextColor(routingActivity2.f18099d.getResources().getColor(2131100158));
                                    imageView = this.f18120c.iv_play_single_stream_arrow;
                                }
                            } else {
                                this.f18120c.rl_play_from_device.setBackgroundResource(2131230849);
                                this.f18120c.iv_play_from_device.setImageResource(2131231449);
                                RoutingActivity routingActivity3 = this.f18120c;
                                routingActivity3.tv_play_from_device.setTextColor(routingActivity3.f18099d.getResources().getColor(2131100158));
                                imageView = this.f18120c.iv_play_from_device_arrow;
                            }
                        } else {
                            this.f18120c.rl_login_with_xtream_codes_api.setBackgroundResource(2131230849);
                            this.f18120c.iv_login_with_xtream_codes_api.setImageResource(2131231451);
                            RoutingActivity routingActivity4 = this.f18120c;
                            routingActivity4.tv_login_with_xtream_codes_api.setTextColor(routingActivity4.f18099d.getResources().getColor(2131100158));
                            imageView = this.f18120c.iv_login_with_xtream_codes_api_arrow;
                        }
                    } else {
                        this.f18120c.rl_login_with_m3u.setBackgroundResource(2131230849);
                        this.f18120c.iv_login_with_m3u.setImageResource(2131231447);
                        RoutingActivity routingActivity5 = this.f18120c;
                        routingActivity5.tv_login_with_m3u.setTextColor(routingActivity5.f18099d.getResources().getColor(2131100158));
                        imageView = this.f18120c.iv_login_with_m3u_arrow;
                    }
                    imageView.setImageResource(2131232009);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (z10) {
                return;
            }
            float f10 = z10 ? 1.09f : 1.0f;
            m16297b(f10);
            m16298c(f10);
            m16296a(z10);
            View view10 = this.f18119b;
            if (view10 == null || view10.getTag() == null || !this.f18119b.getTag().equals("rl_login_with_m3u")) {
                View view11 = this.f18119b;
                if (view11 == null || view11.getTag() == null || !this.f18119b.getTag().equals("rl_login_with_xtream_codes_api")) {
                    View view12 = this.f18119b;
                    if (view12 == null || view12.getTag() == null || !this.f18119b.getTag().equals("rl_play_from_device")) {
                        View view13 = this.f18119b;
                        if (view13 == null || view13.getTag() == null || !this.f18119b.getTag().equals("rl_play_single_stream")) {
                            View view14 = this.f18119b;
                            if (view14 == null || view14.getTag() == null || !this.f18119b.getTag().equals("rl_list_users")) {
                                View view15 = this.f18119b;
                                if (view15 == null || view15.getTag() == null || !this.f18119b.getTag().equals("rl_accept")) {
                                    View view16 = this.f18119b;
                                    if (view16 == null || view16.getTag() == null || !this.f18119b.getTag().equals("rl_cancel")) {
                                        View view17 = this.f18119b;
                                        if (view17 == null || view17.getTag() == null || !this.f18119b.getTag().equals("rl_play")) {
                                            return;
                                        }
                                        this.f18120c.f18104i.setBackgroundResource(2131231558);
                                        this.f18120c.f18105j.setTextColor(this.f18120c.f18099d.getResources().getColor(2131099723));
                                        return;
                                    }
                                    relativeLayout2 = this.f18120c.f18103h;
                                } else {
                                    relativeLayout2 = this.f18120c.f18102g;
                                }
                                relativeLayout2.setBackgroundResource(2131230845);
                                return;
                            }
                            this.f18120c.rl_list_users.setBackgroundResource(2131230850);
                            this.f18120c.iv_list_users.setImageResource(2131231564);
                            RoutingActivity routingActivity6 = this.f18120c;
                            routingActivity6.tv_list_users.setTextColor(routingActivity6.f18099d.getResources().getColor(2131099723));
                            imageView2 = this.f18120c.iv_list_users_arrow;
                        } else {
                            this.f18120c.rl_play_single_stream.setBackgroundResource(2131230850);
                            this.f18120c.iv_play_single_stream.setImageResource(2131231454);
                            RoutingActivity routingActivity7 = this.f18120c;
                            routingActivity7.tv_play_single_stream.setTextColor(routingActivity7.f18099d.getResources().getColor(2131099723));
                            imageView2 = this.f18120c.iv_play_single_stream_arrow;
                        }
                    } else {
                        this.f18120c.rl_play_from_device.setBackgroundResource(2131230850);
                        this.f18120c.iv_play_from_device.setImageResource(2131231450);
                        RoutingActivity routingActivity8 = this.f18120c;
                        routingActivity8.tv_play_from_device.setTextColor(routingActivity8.f18099d.getResources().getColor(2131099723));
                        imageView2 = this.f18120c.iv_play_from_device_arrow;
                    }
                } else {
                    this.f18120c.rl_login_with_xtream_codes_api.setBackgroundResource(2131230850);
                    this.f18120c.iv_login_with_xtream_codes_api.setImageResource(2131231452);
                    RoutingActivity routingActivity9 = this.f18120c;
                    routingActivity9.tv_login_with_xtream_codes_api.setTextColor(routingActivity9.f18099d.getResources().getColor(2131099723));
                    imageView2 = this.f18120c.iv_login_with_xtream_codes_api_arrow;
                }
            } else {
                this.f18120c.rl_login_with_m3u.setBackgroundResource(2131230850);
                this.f18120c.iv_login_with_m3u.setImageResource(2131231448);
                RoutingActivity routingActivity10 = this.f18120c;
                routingActivity10.tv_login_with_m3u.setTextColor(routingActivity10.f18099d.getResources().getColor(2131099723));
                imageView2 = this.f18120c.iv_login_with_m3u_arrow;
            }
            imageView2.setImageResource(2131230843);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: A0 */
    public final void m16291A0() {
        Dialog dialog;
        int i10;
        this.f18100e = new Dialog(this, R.style.Theme.Translucent.NoTitleBar);
        if (f18098l.m31288z().equals(C5251a.f30065s0)) {
            dialog = this.f18100e;
            i10 = 2131624073;
        } else {
            dialog = this.f18100e;
            i10 = 2131624072;
        }
        dialog.setContentView(i10);
        this.f18100e.setCancelable(false);
        Window window = this.f18100e.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        window.setAttributes(attributes);
        this.f18100e.getWindow().setLayout(-1, -1);
        this.f18100e.show();
        this.f18100e.setCanceledOnTouchOutside(false);
        this.f18102g = (RelativeLayout) this.f18100e.findViewById(2131428943);
        this.f18103h = (RelativeLayout) this.f18100e.findViewById(2131428962);
        RelativeLayout relativeLayout = this.f18102g;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout));
        RelativeLayout relativeLayout2 = this.f18103h;
        relativeLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout2));
        WebView webView = (WebView) this.f18100e.findViewById(2131429694);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/terms.html");
        webView.setWebViewClient(new C2970c(this));
        this.f18102g.setOnClickListener(new ViewOnClickListenerC2971d(this));
        this.f18103h.setOnClickListener(new ViewOnClickListenerC2972e(this));
        this.f18100e.setOnDismissListener(new DialogInterfaceOnDismissListenerC2973f(this));
        this.f18100e.show();
    }

    /* renamed from: B0 */
    public void m16292B0() {
        ((ConstraintLayout) findViewById(2131428570)).setSystemUiVisibility(4871);
    }

    /* renamed from: C0 */
    public void m16293C0() {
        RelativeLayout relativeLayout = this.rl_login_with_m3u;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout));
        RelativeLayout relativeLayout2 = this.rl_login_with_xtream_codes_api;
        relativeLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout2));
        RelativeLayout relativeLayout3 = this.rl_play_from_device;
        relativeLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout3));
        RelativeLayout relativeLayout4 = this.rl_play_single_stream;
        relativeLayout4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout4));
        RelativeLayout relativeLayout5 = this.rl_list_users;
        relativeLayout5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout5));
    }

    /* renamed from: D0 */
    public boolean m16294D0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i10 >= 33) {
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        C0936d.m5641r(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 101);
        return false;
    }

    /* renamed from: E0 */
    public void m16295E0() {
        C1080d c1080d = new C1080d(this.f18099d, new C2974g(this, new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            c1080d.m6361x("");
        } else {
            c1080d.m6360w("");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0007. Please report as an issue. */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 101) {
            switch (i10) {
            }
        } else {
            m16294D0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f18101f + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(2132018406), 0).show();
            } catch (Exception e10) {
            }
        }
        this.f18101f = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18099d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18099d);
        f18098l = c6783a;
        String m31288z = c6783a.m31288z();
        setContentView(C5251a.f30014M.booleanValue() ? m31288z.equals(C5251a.f30065s0) ? 2131624040 : 2131624039 : m31288z.equals(C5251a.f30065s0) ? 2131624041 : 2131624038);
        ButterKnife.m5626a(this);
        if (C5251a.f30014M.booleanValue() && !getSharedPreferences("Accept_clicked", 0).getString("Accept_clicked", "").equals("true")) {
            m16291A0();
        }
        m16292B0();
        m16293C0();
        try {
            this.tv_link2.setOnClickListener(new ViewOnClickListenerC2969b(this));
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                m16293C0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                Toast.makeText(this, this.f18099d.getResources().getString(2132017242), 0).show();
            } else {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.requestFocus();
                button.setOnClickListener(new ViewOnClickListenerC2975h(this));
                button2.setOnClickListener(new ViewOnClickListenerC2976i(this));
                aVar.setView(inflate);
                this.f18106k = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f18106k.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f18106k.show();
                this.f18106k.getWindow().setAttributes(layoutParams);
                this.f18106k.setCancelable(false);
                this.f18106k.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(2130772003, 2130772000);
        m16292B0();
    }

    @OnClick
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case 2131429009:
                on_click_list(view);
                return;
            case 2131429010:
                SharepreferenceDBHandler.m15351O("m3u", this.f18099d);
                intent = new Intent(this, (Class<?>) LoginM3uActivity.class);
                break;
            case 2131429011:
                SharepreferenceDBHandler.m15351O("api", this.f18099d);
                intent = new Intent(this, (Class<?>) LoginActivity.class);
                break;
            case 2131429035:
                try {
                    if (f18098l.m31288z().equals(C5251a.f30065s0)) {
                        if (!m16294D0()) {
                            return;
                        } else {
                            m16295E0();
                        }
                    } else {
                        if (!m16294D0()) {
                            return;
                        }
                        Intent intent2 = new Intent(this, (Class<?>) Local_media_Activity.class);
                        overridePendingTransition(2130772003, 2130772000);
                        startActivity(intent2);
                        finish();
                    }
                    return;
                } catch (Exception e10) {
                    return;
                }
            case 2131429036:
                single_stream_click(view);
                return;
            default:
                return;
        }
        startActivity(intent);
        overridePendingTransition(2130772003, 2130772000);
    }

    public void on_click_list(View view) {
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
    }

    public void single_stream_click(View view) {
        try {
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
            View inflate = f18098l.m31288z().equals(C5251a.f30065s0) ? layoutInflater.inflate(2131624515, (ViewGroup) null) : layoutInflater.inflate(2131624514, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
            popupWindow.showAtLocation(inflate, 16, 0, 0);
            popupWindow.setTouchable(true);
            popupWindow.setFocusable(true);
            EditText editText = (EditText) inflate.findViewById(2131427913);
            this.f18104i = (RelativeLayout) inflate.findViewById(2131429034);
            this.f18105j = (TextView) inflate.findViewById(2131429558);
            RelativeLayout relativeLayout = this.f18104i;
            relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, relativeLayout));
            TextView textView = this.f18105j;
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2978k(this, textView));
            this.f18104i.setOnClickListener(new ViewOnClickListenerC2977j(this, editText));
            editText.setOnEditorActionListener(new C2968a(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
