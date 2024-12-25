package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.AsyncTaskC5252b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity.class */
public class SettingsActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: o */
    public static SharedPreferences f18669o;

    /* renamed from: p */
    public static C6783a f18670p;

    @BindView
    public CardView cardAppUpdate;

    @BindView
    public CardView cardRateus;

    @BindView
    public CardView card_backup_restore;

    @BindView
    public CardView card_screenType;

    @BindView
    public CardView cvExteranlPlayers;

    @BindView
    public CardView cv_vpn;

    @BindView
    public CardView cvplayersettingscard;

    /* renamed from: d */
    public Context f18671d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f18672e;

    /* renamed from: f */
    public LiveStreamDBHandler f18673f;

    /* renamed from: i */
    public PopupWindow f18676i;

    @BindView
    public ImageView iv_Rateus;

    @BindView
    public ImageView iv_automation;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView iv_backup_restore;

    @BindView
    public ImageView iv_epg_shift;

    @BindView
    public ImageView iv_external_player;

    @BindView
    public ImageView iv_general_settings;

    @BindView
    public ImageView iv_multi_inner;

    @BindView
    public ImageView iv_parental;

    @BindView
    public ImageView iv_player_selection;

    @BindView
    public ImageView iv_player_settings;

    @BindView
    public ImageView iv_screenType;

    @BindView
    public ImageView iv_speed_test;

    @BindView
    public ImageView iv_stream_format;

    @BindView
    public ImageView iv_time_format;

    @BindView
    public ImageView iv_vpn;

    /* renamed from: l */
    public Button f18679l;

    @BindView
    public LinearLayout llAppUpdate;

    @BindView
    public LinearLayout llExternalPlayer;

    @BindView
    public LinearLayout llPlayer;

    @BindView
    public LinearLayout ll_Rateus;

    @BindView
    public LinearLayout ll_backup_restore;

    @BindView
    public LinearLayout ll_screenType;

    @BindView
    public LinearLayout ll_vpn;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public Button f18680m;

    @BindView
    public LinearLayout multi_inner;

    @BindView
    public CardView multiscreen;

    @BindView
    public LinearLayout rlAutomation;

    @BindView
    public CardView rlAutomationCard;

    @BindView
    public LinearLayout rlEPGShift;

    @BindView
    public CardView rlEPGShiftCard;

    @BindView
    public LinearLayout rlGeneralSettings;

    @BindView
    public CardView rlGeneralSettingsCard;

    @BindView
    public LinearLayout rlParental;

    @BindView
    public CardView rlParentalCard;

    @BindView
    public CardView rlPlayerCard;

    @BindView
    public LinearLayout rlPlayerSettings;

    @BindView
    public CardView rlStreamCard;

    @BindView
    public LinearLayout rlStreamFormat;

    @BindView
    public CardView rlTimeCard;

    @BindView
    public LinearLayout rlTimeFormat;

    @BindView
    public LinearLayout speed_test;

    @BindView
    public CardView speedtest;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* renamed from: g */
    public DatabaseUpdatedStatusDBModel f18674g = new DatabaseUpdatedStatusDBModel();

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f18675h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public String f18677j = "";

    /* renamed from: k */
    public String f18678k = "";

    /* renamed from: n */
    public Thread f18681n = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$a.class */
    public class ViewOnClickListenerC3115a implements View.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18682b;

        public ViewOnClickListenerC3115a(SettingsActivity settingsActivity) {
            this.f18682b = settingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18682b.f18676i.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$b.class */
    public class ViewOnClickListenerC3116b implements View.OnClickListener {

        /* renamed from: b */
        public final String f18683b;

        /* renamed from: c */
        public final SettingsActivity f18684c;

        /* renamed from: d */
        public final EditText f18685d;

        /* renamed from: e */
        public final String[] f18686e;

        /* renamed from: f */
        public final SettingsActivity f18687f;

        public ViewOnClickListenerC3116b(SettingsActivity settingsActivity, String str, SettingsActivity settingsActivity2, EditText editText, String[] strArr) {
            this.f18687f = settingsActivity;
            this.f18683b = str;
            this.f18684c = settingsActivity2;
            this.f18685d = editText;
            this.f18686e = strArr;
        }

        /* renamed from: a */
        public final boolean m16648a(String str) {
            this.f18686e[0] = String.valueOf(this.f18685d.getText());
            String str2 = this.f18686e[0];
            return (str2 == null || str2.equals("") || this.f18686e[0].isEmpty() || str == null || str.isEmpty() || str.equals("") || !this.f18686e[0].equals(str)) ? false : true;
        }

        /* renamed from: b */
        public final boolean m16649b() {
            this.f18686e[0] = String.valueOf(this.f18685d.getText());
            String[] strArr = this.f18686e;
            if (strArr == null || !strArr[0].equals("")) {
                String[] strArr2 = this.f18686e;
                return (strArr2 == null || strArr2[0].equals("")) ? false : true;
            }
            Toast.makeText(this.f18684c, this.f18687f.getResources().getString(2132017649), 1).show();
            return false;
        }

        /* renamed from: c */
        public final void m16650c(boolean z10) {
            if (z10) {
                this.f18687f.f18676i.dismiss();
                m16651d();
            } else {
                SettingsActivity settingsActivity = this.f18684c;
                if (settingsActivity != null) {
                    Toast.makeText(settingsActivity, this.f18687f.getResources().getString(2132018278), 1).show();
                }
                this.f18685d.getText().clear();
            }
        }

        /* renamed from: d */
        public final void m16651d() {
            this.f18687f.startActivity(new Intent(this.f18687f, (Class<?>) ParentalControlActivitity.class));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m16649b()) {
                m16650c(m16648a(this.f18683b));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$c.class */
    public class ViewOnClickListenerC3117c implements View.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18688b;

        public ViewOnClickListenerC3117c(SettingsActivity settingsActivity) {
            this.f18688b = settingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18688b.f18676i.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$d.class */
    public class ViewOnClickListenerC3118d implements View.OnClickListener {

        /* renamed from: b */
        public final String[] f18689b;

        /* renamed from: c */
        public final EditText f18690c;

        /* renamed from: d */
        public final String[] f18691d;

        /* renamed from: e */
        public final EditText f18692e;

        /* renamed from: f */
        public final Activity f18693f;

        /* renamed from: g */
        public final String f18694g;

        /* renamed from: h */
        public final SettingsActivity f18695h;

        public ViewOnClickListenerC3118d(SettingsActivity settingsActivity, String[] strArr, EditText editText, String[] strArr2, EditText editText2, Activity activity, String str) {
            this.f18695h = settingsActivity;
            this.f18689b = strArr;
            this.f18690c = editText;
            this.f18691d = strArr2;
            this.f18692e = editText2;
            this.f18693f = activity;
            this.f18694g = str;
        }

        /* renamed from: a */
        public final boolean m16652a() {
            String[] strArr;
            this.f18689b[0] = String.valueOf(this.f18690c.getText());
            this.f18691d[0] = String.valueOf(this.f18692e.getText());
            String[] strArr2 = this.f18689b;
            return (strArr2 == null || strArr2[0].equals("") || (strArr = this.f18691d) == null || strArr[0].equals("") || !this.f18689b[0].equals(this.f18691d[0])) ? false : true;
        }

        /* renamed from: b */
        public final boolean m16653b() {
            String[] strArr;
            Activity activity;
            Resources resources;
            int i10;
            this.f18689b[0] = String.valueOf(this.f18690c.getText());
            this.f18691d[0] = String.valueOf(this.f18692e.getText());
            String[] strArr2 = this.f18689b;
            if (strArr2 == null || !strArr2[0].equals("")) {
                String[] strArr3 = this.f18689b;
                if (strArr3 == null || strArr3[0].equals("") || (strArr = this.f18691d) == null || !strArr[0].equals("")) {
                    String[] strArr4 = this.f18689b;
                    return (strArr4 == null || this.f18691d == null || strArr4[0].equals("") || this.f18691d[0].equals("")) ? false : true;
                }
                activity = this.f18693f;
                resources = this.f18695h.getResources();
                i10 = 2132018273;
            } else {
                activity = this.f18693f;
                resources = this.f18695h.getResources();
                i10 = 2132017649;
            }
            Toast.makeText(activity, resources.getString(i10), 1).show();
            return false;
        }

        /* renamed from: c */
        public final void m16654c(boolean z10) {
            if (!z10) {
                Activity activity = this.f18693f;
                if (activity != null) {
                    Toast.makeText(activity, this.f18695h.getResources().getString(2132018280), 1).show();
                }
                this.f18690c.getText().clear();
                this.f18692e.getText().clear();
                return;
            }
            PasswordDBModel passwordDBModel = new PasswordDBModel();
            passwordDBModel.m15289g(String.valueOf(this.f18689b[0]));
            passwordDBModel.m15287e(this.f18694g);
            passwordDBModel.m15288f(SharepreferenceDBHandler.m15337A(this.f18693f));
            if (this.f18695h.f18673f != null) {
                this.f18695h.f18673f.m15146A0(passwordDBModel);
                this.f18695h.f18676i.dismiss();
                m16655d();
            }
        }

        /* renamed from: d */
        public final void m16655d() {
            this.f18695h.startActivity(new Intent(this.f18693f, (Class<?>) ParentalControlActivitity.class));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m16653b()) {
                m16654c(m16652a());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$e.class */
    public class ViewOnClickListenerC3119e implements View.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18696b;

        public ViewOnClickListenerC3119e(SettingsActivity settingsActivity) {
            this.f18696b = settingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18696b.f18671d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$f.class */
    public class ViewOnClickListenerC3120f implements View.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18697b;

        public ViewOnClickListenerC3120f(SettingsActivity settingsActivity) {
            this.f18697b = settingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18697b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$g.class */
    public class RunnableC3121g implements Runnable {

        /* renamed from: b */
        public final SettingsActivity f18698b;

        public RunnableC3121g(SettingsActivity settingsActivity) {
            this.f18698b = settingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18698b.f18671d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18698b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18698b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$h.class */
    public class DialogInterfaceOnClickListenerC3122h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18699b;

        public DialogInterfaceOnClickListenerC3122h(SettingsActivity settingsActivity) {
            this.f18699b = settingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$i.class */
    public class DialogInterfaceOnClickListenerC3123i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18700b;

        public DialogInterfaceOnClickListenerC3123i(SettingsActivity settingsActivity) {
            this.f18700b = settingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18700b.f18671d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$j.class */
    public class DialogInterfaceOnClickListenerC3124j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18701b;

        public DialogInterfaceOnClickListenerC3124j(SettingsActivity settingsActivity) {
            this.f18701b = settingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18701b.f18671d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$k.class */
    public class DialogInterfaceOnClickListenerC3125k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18702b;

        public DialogInterfaceOnClickListenerC3125k(SettingsActivity settingsActivity) {
            this.f18702b = settingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$l.class */
    public class DialogInterfaceOnClickListenerC3126l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18703b;

        public DialogInterfaceOnClickListenerC3126l(SettingsActivity settingsActivity) {
            this.f18703b = settingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$m.class */
    public class DialogInterfaceOnClickListenerC3127m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SettingsActivity f18704b;

        public DialogInterfaceOnClickListenerC3127m(SettingsActivity settingsActivity) {
            this.f18704b = settingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$n.class */
    public class RunnableC3128n implements Runnable {

        /* renamed from: b */
        public final SettingsActivity f18705b;

        public RunnableC3128n(SettingsActivity settingsActivity) {
            this.f18705b = settingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18705b.m16643t0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SettingsActivity$o.class */
    public class ViewOnFocusChangeListenerC3129o implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18706b;

        /* renamed from: c */
        public final SettingsActivity f18707c;

        public ViewOnFocusChangeListenerC3129o(SettingsActivity settingsActivity, View view) {
            this.f18707c = settingsActivity;
            this.f18706b = view;
        }

        /* renamed from: a */
        public final void m16656a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18706b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16657b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18706b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16658c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18706b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            ImageView imageView;
            int i10;
            View view2;
            View view3;
            if (z10) {
                float f10 = z10 ? 1.12f : 1.0f;
                m16657b(f10);
                m16658c(f10);
                View view4 = this.f18706b;
                if (view4 != null && view4.getTag() != null && this.f18706b.getTag().equals("2")) {
                    this.f18707c.rlParental.setBackgroundResource(2131231837);
                    this.f18707c.iv_parental.setImageResource(2131231849);
                }
                View view5 = this.f18706b;
                if (view5 != null && view5.getTag() != null && this.f18706b.getTag().equals("3")) {
                    this.f18707c.rlEPGShift.setBackgroundResource(2131231837);
                    this.f18707c.iv_epg_shift.setImageResource(2131231839);
                }
                if (!SharepreferenceDBHandler.m15373f(this.f18707c.f18671d).equals("m3u") && (view3 = this.f18706b) != null && view3.getTag() != null && this.f18706b.getTag().equals("5")) {
                    this.f18707c.rlStreamFormat.setBackgroundResource(2131231837);
                    this.f18707c.iv_stream_format.setImageResource(2131231861);
                }
                View view6 = this.f18706b;
                if (view6 != null && view6.getTag() != null && this.f18706b.getTag().equals("6")) {
                    this.f18707c.rlTimeFormat.setBackgroundResource(2131231837);
                    this.f18707c.iv_time_format.setImageResource(2131231865);
                }
                View view7 = this.f18706b;
                if (view7 != null && view7.getTag() != null && this.f18706b.getTag().equals("8")) {
                    this.f18707c.f18679l.setBackgroundResource(2131230828);
                }
                View view8 = this.f18706b;
                if (view8 != null && view8.getTag() != null && this.f18706b.getTag().equals("9")) {
                    this.f18707c.f18680m.setBackgroundResource(2131231576);
                }
                View view9 = this.f18706b;
                if (view9 != null && view9.getTag() != null && this.f18706b.getTag().equals("10")) {
                    this.f18707c.rlAutomation.setBackgroundResource(2131231837);
                    this.f18707c.iv_automation.setImageResource(2131231835);
                }
                View view10 = this.f18706b;
                if (view10 != null && view10.getTag() != null && this.f18706b.getTag().equals("11")) {
                    this.f18707c.rlGeneralSettings.setBackgroundResource(2131231837);
                    this.f18707c.iv_general_settings.setImageResource(2131231857);
                }
                View view11 = this.f18706b;
                if (view11 != null && view11.getTag() != null && this.f18706b.getTag().equals("12")) {
                    this.f18707c.llPlayer.setBackgroundResource(2131231837);
                    this.f18707c.iv_player_selection.setImageResource(2131231851);
                }
                View view12 = this.f18706b;
                if (view12 != null && view12.getTag() != null && this.f18706b.getTag().equals("13")) {
                    this.f18707c.rlPlayerSettings.setBackgroundResource(2131231837);
                    this.f18707c.iv_player_settings.setImageResource(2131231853);
                }
                View view13 = this.f18706b;
                if (view13 != null && view13.getTag() != null && this.f18706b.getTag().equals("14")) {
                    this.f18707c.ll_Rateus.setBackgroundResource(2131231837);
                    this.f18707c.iv_Rateus.setImageResource(2131231855);
                }
                View view14 = this.f18706b;
                if (view14 != null && view14.getTag() != null && this.f18706b.getTag().equals("15")) {
                    this.f18707c.llAppUpdate.setBackgroundResource(2131231837);
                }
                View view15 = this.f18706b;
                if (view15 != null && view15.getTag() != null && this.f18706b.getTag().equals("16")) {
                    this.f18707c.llExternalPlayer.setBackgroundResource(2131231837);
                    this.f18707c.iv_external_player.setImageResource(2131231843);
                }
                View view16 = this.f18706b;
                if (view16 != null && view16.getTag() != null && this.f18706b.getTag().equals("17")) {
                    this.f18707c.ll_vpn.setBackgroundResource(2131231837);
                    this.f18707c.iv_vpn.setImageResource(2131231867);
                }
                View view17 = this.f18706b;
                if (view17 != null && view17.getTag() != null && this.f18706b.getTag().equals("18")) {
                    this.f18707c.multi_inner.setBackgroundResource(2131231837);
                    this.f18707c.iv_multi_inner.setImageResource(2131231847);
                }
                View view18 = this.f18706b;
                if (view18 != null && view18.getTag() != null && this.f18706b.getTag().equals("19")) {
                    this.f18707c.speed_test.setBackgroundResource(2131231837);
                    this.f18707c.iv_speed_test.setImageResource(2131231859);
                }
                View view19 = this.f18706b;
                if (view19 != null && view19.getTag() != null && this.f18706b.getTag().equals("20")) {
                    this.f18707c.ll_screenType.setBackgroundResource(2131231837);
                    this.f18707c.iv_screenType.setImageResource(2131231863);
                }
                View view20 = this.f18706b;
                if (view20 == null || view20.getTag() == null || !this.f18706b.getTag().equals("21")) {
                    return;
                }
                this.f18707c.ll_backup_restore.setBackgroundResource(2131231837);
                imageView = this.f18707c.iv_backup_restore;
                i10 = 2131230833;
            } else {
                if (z10) {
                    return;
                }
                float f11 = z10 ? 1.09f : 1.0f;
                m16657b(f11);
                m16658c(f11);
                m16656a(z10);
                View view21 = this.f18706b;
                if (view21 != null && view21.getTag() != null && this.f18706b.getTag().equals("2")) {
                    this.f18707c.rlParental.setBackgroundResource(2131231763);
                    this.f18707c.iv_parental.setImageResource(2131231848);
                }
                View view22 = this.f18706b;
                if (view22 != null && view22.getTag() != null && this.f18706b.getTag().equals("3")) {
                    this.f18707c.rlEPGShift.setBackgroundResource(2131231763);
                    this.f18707c.iv_epg_shift.setImageResource(2131231838);
                }
                if (!SharepreferenceDBHandler.m15373f(this.f18707c.f18671d).equals("m3u") && (view2 = this.f18706b) != null && view2.getTag() != null && this.f18706b.getTag().equals("5")) {
                    this.f18707c.rlStreamFormat.setBackgroundResource(2131231763);
                    this.f18707c.iv_stream_format.setImageResource(2131231860);
                }
                View view23 = this.f18706b;
                if (view23 != null && view23.getTag() != null && this.f18706b.getTag().equals("6")) {
                    this.f18707c.rlTimeFormat.setBackgroundResource(2131231763);
                    this.f18707c.iv_time_format.setImageResource(2131231864);
                }
                View view24 = this.f18706b;
                if (view24 != null && view24.getTag() != null && this.f18706b.getTag().equals("8")) {
                    this.f18707c.f18679l.setBackgroundResource(2131230845);
                }
                View view25 = this.f18706b;
                if (view25 != null && view25.getTag() != null && this.f18706b.getTag().equals("9")) {
                    this.f18707c.f18680m.setBackgroundResource(2131230845);
                }
                View view26 = this.f18706b;
                if (view26 != null && view26.getTag() != null && this.f18706b.getTag().equals("10")) {
                    this.f18707c.rlAutomation.setBackgroundResource(2131231763);
                    this.f18707c.iv_automation.setImageResource(2131231834);
                }
                View view27 = this.f18706b;
                if (view27 != null && view27.getTag() != null && this.f18706b.getTag().equals("11")) {
                    this.f18707c.rlGeneralSettings.setBackgroundResource(2131231763);
                    this.f18707c.iv_general_settings.setImageResource(2131231856);
                }
                View view28 = this.f18706b;
                if (view28 != null && view28.getTag() != null && this.f18706b.getTag().equals("12")) {
                    this.f18707c.llPlayer.setBackgroundResource(2131231763);
                    this.f18707c.iv_player_selection.setImageResource(2131231850);
                }
                View view29 = this.f18706b;
                if (view29 != null && view29.getTag() != null && this.f18706b.getTag().equals("13")) {
                    this.f18707c.rlPlayerSettings.setBackgroundResource(2131231763);
                    this.f18707c.iv_player_settings.setImageResource(2131231852);
                }
                View view30 = this.f18706b;
                if (view30 != null && view30.getTag() != null && this.f18706b.getTag().equals("14")) {
                    this.f18707c.ll_Rateus.setBackgroundResource(2131231763);
                    this.f18707c.iv_Rateus.setImageResource(2131231854);
                }
                View view31 = this.f18706b;
                if (view31 != null && view31.getTag() != null && this.f18706b.getTag().equals("15")) {
                    this.f18707c.llAppUpdate.setBackgroundResource(2131231763);
                }
                View view32 = this.f18706b;
                if (view32 != null && view32.getTag() != null && this.f18706b.getTag().equals("16")) {
                    this.f18707c.llExternalPlayer.setBackgroundResource(2131231763);
                    this.f18707c.iv_external_player.setImageResource(2131231842);
                }
                View view33 = this.f18706b;
                if (view33 != null && view33.getTag() != null && this.f18706b.getTag().equals("17")) {
                    this.f18707c.ll_vpn.setBackgroundResource(2131231763);
                    this.f18707c.iv_vpn.setImageResource(2131231866);
                }
                View view34 = this.f18706b;
                if (view34 != null && view34.getTag() != null && this.f18706b.getTag().equals("18")) {
                    this.f18707c.multi_inner.setBackgroundResource(2131231763);
                    this.f18707c.iv_multi_inner.setImageResource(2131231846);
                }
                View view35 = this.f18706b;
                if (view35 != null && view35.getTag() != null && this.f18706b.getTag().equals("19")) {
                    this.f18707c.speed_test.setBackgroundResource(2131231763);
                    this.f18707c.iv_speed_test.setImageResource(2131231858);
                }
                View view36 = this.f18706b;
                if (view36 != null && view36.getTag() != null && this.f18706b.getTag().equals("20")) {
                    this.f18707c.ll_screenType.setBackgroundResource(2131231763);
                    this.f18707c.iv_screenType.setImageResource(2131231862);
                }
                View view37 = this.f18706b;
                if (view37 == null || view37.getTag() == null || !this.f18706b.getTag().equals("21")) {
                    return;
                }
                this.f18707c.ll_backup_restore.setBackgroundResource(2131231763);
                imageView = this.f18707c.iv_backup_restore;
                i10 = 2131230832;
            }
            imageView.setImageResource(i10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18671d = this;
        m16644u0();
        super.onCreate(bundle);
        f18670p = new C6783a(this.f18671d);
        if (C5251a.f30014M.booleanValue() && !f18670p.m31275m().booleanValue()) {
            finish();
        }
        String m31288z = f18670p.m31288z();
        setContentView(SharepreferenceDBHandler.m15373f(this.f18671d).equals("m3u") ? m31288z.equals(C5251a.f30065s0) ? 2131624059 : 2131624058 : m31288z.equals(C5251a.f30065s0) ? 2131624060 : 2131624057);
        ButterKnife.m5626a(this);
        C5251a.f30028a = false;
        SharepreferenceDBHandler.m15374f0("settings", this.f18671d);
        CardView cardView = this.cvExteranlPlayers;
        if (cardView != null) {
            cardView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView));
        }
        CardView cardView2 = this.card_screenType;
        if (cardView2 != null) {
            cardView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView2));
        }
        CardView cardView3 = this.card_backup_restore;
        if (cardView3 != null) {
            cardView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView3));
        }
        CardView cardView4 = this.multiscreen;
        if (cardView4 != null) {
            cardView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView4));
        }
        CardView cardView5 = this.speedtest;
        if (cardView5 != null) {
            cardView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView5));
        }
        CardView cardView6 = this.rlPlayerCard;
        if (cardView6 != null) {
            cardView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView6));
        }
        CardView cardView7 = this.rlParentalCard;
        if (cardView7 != null) {
            cardView7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView7));
        }
        CardView cardView8 = this.rlEPGShiftCard;
        if (cardView8 != null) {
            cardView8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView8));
        }
        CardView cardView9 = this.rlStreamCard;
        if (cardView9 != null) {
            cardView9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView9));
        }
        CardView cardView10 = this.rlTimeCard;
        if (cardView10 != null) {
            cardView10.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView10));
        }
        CardView cardView11 = this.rlAutomationCard;
        if (cardView11 != null) {
            cardView11.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView11));
        }
        CardView cardView12 = this.rlGeneralSettingsCard;
        if (cardView12 != null) {
            cardView12.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView12));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.rlGeneralSettingsCard.requestFocus();
                this.rlGeneralSettingsCard.setFocusableInTouchMode(true);
            }
            this.rlGeneralSettingsCard.requestFocus();
        }
        CardView cardView13 = this.cv_vpn;
        cardView13.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView13));
        CardView cardView14 = this.cvplayersettingscard;
        if (cardView14 != null) {
            cardView14.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView14));
        }
        CardView cardView15 = this.cardAppUpdate;
        cardView15.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView15));
        CardView cardView16 = this.cardRateus;
        cardView16.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView16));
        boolean m15379i = SharepreferenceDBHandler.m15379i(this.f18671d);
        if (!m15379i) {
            new AsyncTaskC5252b(this).execute(new Void[0]);
        }
        if (m15379i) {
            this.cardRateus.setVisibility(0);
            this.cardAppUpdate.setVisibility(0);
            CardView cardView17 = this.cardAppUpdate;
            cardView17.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView17));
            CardView cardView18 = this.cardRateus;
            cardView18.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, cardView18));
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3119e(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3120f(this));
        getWindow().setFlags(1024, 1024);
        m16642s0();
        m878n0((Toolbar) findViewById(2131429320));
        m16645v0();
        Thread thread = this.f18681n;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3128n(this));
            this.f18681n = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.toolbar.getChildCount(); i10++) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f18671d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3123i(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3122h(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18671d.getResources().getString(2132017514));
            aVar.m857e(this.f18671d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18671d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3124j(this));
            aVar.m858f(this.f18671d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3125k(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18671d.getResources().getString(2132017514));
            aVar2.m857e(this.f18671d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18671d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3126l(this));
            aVar2.m858f(this.f18671d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3127m(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18681n;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18681n.interrupt();
        } catch (Exception e10) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 androidx.cardview.widget.CardView, still in use, count: 2, list:
          (r7v6 androidx.cardview.widget.CardView) from 0x00df: PHI (r7v5 androidx.cardview.widget.CardView) = (r7v4 androidx.cardview.widget.CardView), (r7v6 androidx.cardview.widget.CardView) binds: [B:19:0x00dc, B:16:0x00d0] A[DONT_GENERATE, DONT_INLINE]
          (r7v6 androidx.cardview.widget.CardView) from 0x00d0: IF  (r7v6 androidx.cardview.widget.CardView) != (null androidx.cardview.widget.CardView)  -> B:17:0x00df A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity.onResume():void");
    }

    @OnClick
    public void onViewClicked(View view) {
        Intent intent;
        Intent intent2;
        String str;
        String str2;
        switch (view.getId()) {
            case 2131427696:
            case 2131428314:
                intent = new Intent(this, (Class<?>) RateUsActivity.class);
                startActivity(intent);
                return;
            case 2131427697:
            case 2131428324:
                intent = new Intent(this, (Class<?>) CheckAppupdateActivity.class);
                startActivity(intent);
                return;
            case 2131427698:
            case 2131428334:
                intent2 = new Intent(this, (Class<?>) BackupAndRestoreActivity.class);
                break;
            case 2131427702:
            case 2131428493:
                intent2 = new Intent(this, (Class<?>) ScreenTypeSettingsActivity.class);
                break;
            case 2131427809:
            case 2131428404:
                intent2 = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
                break;
            case 2131427810:
            case 2131429037:
                intent2 = new Intent(this, (Class<?>) PlayerSelectionActivity.class);
                break;
            case 2131427811:
            case 2131429039:
                intent2 = new Intent(this, (Class<?>) PlayerSettingsActivity.class);
                break;
            case 2131427813:
            case 2131428537:
                intent = new Intent(this, (Class<?>) ProfileActivity.class);
                intent.putExtra("typeid", "settings");
                startActivity(intent);
                return;
            case 2131428744:
            case 2131428746:
                intent = new Intent(this, (Class<?>) MultiSettingActivity.class);
                startActivity(intent);
                return;
            case 2131428954:
            case 2131428955:
                intent2 = new Intent(this, (Class<?>) AutomationActivity.class);
                break;
            case 2131428979:
            case 2131428980:
                intent2 = new Intent(this, (Class<?>) EPGSettingsActivity.class);
                break;
            case 2131428987:
            case 2131428988:
                intent = new Intent(this, (Class<?>) GeneralSettingsActivity.class);
                startActivity(intent);
                return;
            case 2131429029:
            case 2131429030:
                String string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f18671d);
                this.f18673f = liveStreamDBHandler;
                ArrayList<PasswordDBModel> m15230l1 = liveStreamDBHandler.m15230l1(SharepreferenceDBHandler.m15337A(this.f18671d));
                if (m15230l1 != null) {
                    Iterator<PasswordDBModel> it = m15230l1.iterator();
                    str = "";
                    str2 = "";
                    while (it.hasNext()) {
                        PasswordDBModel next = it.next();
                        if (next.m15283a().equals(string) && !next.m15285c().isEmpty()) {
                            str = next.m15283a();
                            str2 = next.m15285c();
                        }
                    }
                } else {
                    str = "";
                    str2 = "";
                }
                if (str != null && !str.equals("") && !str.isEmpty()) {
                    m16646w0(this, 100, string, str, str2);
                    return;
                } else {
                    if (string.isEmpty() || string.equals("")) {
                        return;
                    }
                    m16647x0(this, 100, string);
                    return;
                }
            case 2131429056:
            case 2131429057:
                intent2 = new Intent(this, (Class<?>) StreamFormatActivity.class);
                break;
            case 2131429063:
            case 2131429064:
                intent2 = new Intent(this, (Class<?>) TimeFormatActivity.class);
                break;
            case 2131429204:
            case 2131429205:
                intent = new Intent(this, (Class<?>) SpeedTestActivity.class);
                startActivity(intent);
                return;
            default:
                return;
        }
        startActivity(intent2);
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16644u0();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: s0 */
    public final void m16642s0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: t0 */
    public void m16643t0() {
        runOnUiThread(new RunnableC3121g(this));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: u0 */
    public void m16644u0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: v0 */
    public final void m16645v0() {
        this.f18671d = this;
        this.f18673f = new LiveStreamDBHandler(this.f18671d);
        this.f18672e = getSharedPreferences("loginPrefs", 0);
    }

    /* renamed from: w0 */
    public final void m16646w0(SettingsActivity settingsActivity, int i10, String str, String str2, String str3) {
        View inflate = ((LayoutInflater) settingsActivity.getSystemService("layout_inflater")).inflate(f18670p.m31288z().equals(C5251a.f30065s0) ? 2131624557 : 2131624556, (RelativeLayout) settingsActivity.findViewById(2131429033));
        PopupWindow popupWindow = new PopupWindow(settingsActivity);
        this.f18676i = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18676i.setWidth(-1);
        this.f18676i.setHeight(-1);
        this.f18676i.setFocusable(true);
        this.f18676i.showAtLocation(inflate, 17, 0, 0);
        this.f18679l = (Button) inflate.findViewById(2131427623);
        this.f18680m = (Button) inflate.findViewById(2131427605);
        Button button = this.f18679l;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, button));
        }
        Button button2 = this.f18680m;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, button2));
        }
        EditText editText = (EditText) inflate.findViewById(2131427916);
        editText.requestFocus();
        this.f18680m.setOnClickListener(new ViewOnClickListenerC3115a(this));
        this.f18679l.setOnClickListener(new ViewOnClickListenerC3116b(this, str3, settingsActivity, editText, new String[1]));
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: x0 */
    public final void m16647x0(Activity activity, int i10, String str) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(2131429032);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            View inflate = f18670p.m31288z().equals(C5251a.f30065s0) ? layoutInflater.inflate(2131624555, relativeLayout) : layoutInflater.inflate(2131624554, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f18676i = popupWindow;
            popupWindow.setContentView(inflate);
            this.f18676i.setWidth(-1);
            this.f18676i.setHeight(-1);
            this.f18676i.setFocusable(true);
            this.f18676i.showAtLocation(inflate, 17, 0, 0);
            this.f18679l = (Button) inflate.findViewById(2131427623);
            this.f18680m = (Button) inflate.findViewById(2131427605);
            Button button = this.f18679l;
            if (button != null) {
                button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, button));
            }
            Button button2 = this.f18680m;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3129o(this, button2));
            }
            EditText editText = (EditText) inflate.findViewById(2131429551);
            EditText editText2 = (EditText) inflate.findViewById(2131429390);
            if (activity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            this.f18680m.setOnClickListener(new ViewOnClickListenerC3117c(this));
            this.f18679l.setOnClickListener(new ViewOnClickListenerC3118d(this, new String[1], editText, new String[1], editText2, activity, str));
        } catch (NullPointerException | Exception e10) {
        }
    }
}
