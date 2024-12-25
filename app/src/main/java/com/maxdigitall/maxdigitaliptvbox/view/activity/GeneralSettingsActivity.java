package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity.class */
public class GeneralSettingsActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public CheckBox activesubtitle;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public CheckBox autoStart;

    @BindView
    public CheckBox auto_clear_cache;

    @BindView
    public CheckBox auto_play_channel_in_live;

    @BindView
    public CheckBox autoplay;

    @BindView
    public Button btSaveChanges;

    @BindView
    public TextView bt_clear_now;

    @BindView
    public Button btnBackPlayerselection;

    /* renamed from: d */
    public Context f17212d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17213e;

    @BindView
    public EditText etUserAgent;

    /* renamed from: f */
    public SharedPreferences.Editor f17214f;

    @BindView
    public FrameLayout fl_auto_play_in;

    @BindView
    public FrameLayout fl_recently_added_limit;

    @BindView
    public FrameLayout fl_recently_watched_limit_live;

    @BindView
    public CheckBox fullEPG;

    /* renamed from: g */
    public SharedPreferences f17215g;

    /* renamed from: h */
    public SharedPreferences.Editor f17216h;

    /* renamed from: i */
    public SharedPreferences f17217i;

    /* renamed from: j */
    public SharedPreferences.Editor f17218j;

    /* renamed from: k */
    public LiveStreamDBHandler f17219k;

    @BindView
    public LinearLayout ll_auto_play_next_episode;

    @BindView
    public LinearLayout ll_recently_added_limit;

    @BindView
    public LinearLayout ll_recently_watched_limit_live;

    @BindView
    public ImageView logo;

    /* renamed from: p */
    public SharedPreferences f17224p;

    @BindView
    public CheckBox picinpic;

    /* renamed from: q */
    public SharedPreferences f17225q;

    /* renamed from: r */
    public SharedPreferences.Editor f17226r;

    /* renamed from: s */
    public SharedPreferences.Editor f17227s;

    @BindView
    public CheckBox show_epg_in_channels_list;

    @BindView
    public Spinner spinnerEPG;

    /* renamed from: t */
    public SharedPreferences.Editor f17228t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_auto_play_in;

    @BindView
    public TextView tv_recently_added_limit;

    @BindView
    public TextView tv_recently_watched_limit_live;

    @BindView
    public TextView tv_useragent;

    /* renamed from: u */
    public SharedPreferences f17229u;

    /* renamed from: v */
    public String f17230v;

    /* renamed from: w */
    public DialogC0242a f17231w;

    /* renamed from: l */
    public DatabaseUpdatedStatusDBModel f17220l = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f17221m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public String f17222n = "";

    /* renamed from: o */
    public String f17223o = "";

    /* renamed from: x */
    public String f17232x = "mobile";

    /* renamed from: y */
    public boolean f17233y = false;

    /* renamed from: z */
    public int f17234z = C5251a.f30027Z;

    /* renamed from: A */
    public int f17209A = C5251a.f30029a0;

    /* renamed from: B */
    public String f17210B = C5251a.f30031b0;

    /* renamed from: C */
    public Thread f17211C = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$a.class */
    public class ViewOnClickListenerC2771a implements View.OnClickListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17235b;

        public ViewOnClickListenerC2771a(GeneralSettingsActivity generalSettingsActivity) {
            this.f17235b = generalSettingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17235b.f17212d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$b.class */
    public class DialogC2772b extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17236b;

        /* renamed from: c */
        public TextView f17237c;

        /* renamed from: d */
        public TextView f17238d;

        /* renamed from: e */
        public TextView f17239e;

        /* renamed from: f */
        public LinearLayout f17240f;

        /* renamed from: g */
        public LinearLayout f17241g;

        /* renamed from: h */
        public final GeneralSettingsActivity f17242h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$b$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17243b;

            /* renamed from: c */
            public final DialogC2772b f17244c;

            public a(DialogC2772b dialogC2772b, View view) {
                this.f17244c = dialogC2772b;
                this.f17243b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17243b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17243b.getTag().equals("1")) {
                        View view3 = this.f17243b;
                        if (view3 == null || view3.getTag() == null || !this.f17243b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17244c.f17241g;
                    }
                    linearLayout = this.f17244c.f17240f;
                } else {
                    View view4 = this.f17243b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17243b.getTag().equals("1")) {
                        View view5 = this.f17243b;
                        if (view5 == null || view5.getTag() == null || !this.f17243b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17244c.f17241g;
                    }
                    linearLayout = this.f17244c.f17240f;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2772b(GeneralSettingsActivity generalSettingsActivity, Activity activity) {
            super(activity);
            this.f17242h = generalSettingsActivity;
            this.f17236b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    C5255e.m26237i(this.f17242h.f17212d);
                    GeneralSettingsActivity generalSettingsActivity = this.f17242h;
                    Toast.makeText(generalSettingsActivity, generalSettingsActivity.getResources().getString(2132017382), 0).show();
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C6783a(this.f17242h.f17212d).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
            this.f17237c = (TextView) findViewById(2131427681);
            this.f17238d = (TextView) findViewById(2131427653);
            this.f17240f = (LinearLayout) findViewById(2131428448);
            this.f17241g = (LinearLayout) findViewById(2131428541);
            TextView textView = (TextView) findViewById(2131429644);
            this.f17239e = textView;
            textView.setText(this.f17242h.f17212d.getResources().getString(2132018827));
            this.f17237c.setOnClickListener(this);
            this.f17238d.setOnClickListener(this);
            TextView textView2 = this.f17237c;
            textView2.setOnFocusChangeListener(new a(this, textView2));
            TextView textView3 = this.f17238d;
            textView3.setOnFocusChangeListener(new a(this, textView3));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$c.class */
    public class RunnableC2773c implements Runnable {

        /* renamed from: b */
        public final GeneralSettingsActivity f17245b;

        public RunnableC2773c(GeneralSettingsActivity generalSettingsActivity) {
            this.f17245b = generalSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17245b.f17212d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17245b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17245b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$d.class */
    public class DialogInterfaceOnClickListenerC2774d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17246b;

        public DialogInterfaceOnClickListenerC2774d(GeneralSettingsActivity generalSettingsActivity) {
            this.f17246b = generalSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            TextView textView;
            CharSequence charSequence;
            if (i10 == 0) {
                this.f17246b.m15775E0(10);
                textView = this.f17246b.tv_recently_added_limit;
                charSequence = "10";
            } else if (i10 == 1) {
                this.f17246b.m15775E0(20);
                textView = this.f17246b.tv_recently_added_limit;
                charSequence = "20";
            } else if (i10 == 2) {
                this.f17246b.m15775E0(30);
                textView = this.f17246b.tv_recently_added_limit;
                charSequence = "30";
            } else if (i10 == 3) {
                this.f17246b.m15775E0(40);
                textView = this.f17246b.tv_recently_added_limit;
                charSequence = "40";
            } else if (i10 == 4) {
                this.f17246b.m15775E0(50);
                textView = this.f17246b.tv_recently_added_limit;
                charSequence = "50";
            } else {
                if (i10 != 5) {
                    return;
                }
                this.f17246b.m15775E0(100);
                textView = this.f17246b.tv_recently_added_limit;
                charSequence = "100";
            }
            textView.setText(charSequence);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$e.class */
    public class DialogInterfaceOnDismissListenerC2775e implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17247b;

        public DialogInterfaceOnDismissListenerC2775e(GeneralSettingsActivity generalSettingsActivity) {
            this.f17247b = generalSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$f.class */
    public class DialogInterfaceOnClickListenerC2776f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17248b;

        public DialogInterfaceOnClickListenerC2776f(GeneralSettingsActivity generalSettingsActivity) {
            this.f17248b = generalSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            TextView textView;
            CharSequence charSequence;
            if (i10 == 0) {
                this.f17248b.m15777G0(5);
                textView = this.f17248b.tv_recently_watched_limit_live;
                charSequence = "5";
            } else if (i10 == 1) {
                this.f17248b.m15777G0(10);
                textView = this.f17248b.tv_recently_watched_limit_live;
                charSequence = "10";
            } else if (i10 == 2) {
                this.f17248b.m15777G0(20);
                textView = this.f17248b.tv_recently_watched_limit_live;
                charSequence = "20";
            } else if (i10 == 3) {
                this.f17248b.m15777G0(30);
                textView = this.f17248b.tv_recently_watched_limit_live;
                charSequence = "30";
            } else if (i10 == 4) {
                this.f17248b.m15777G0(40);
                textView = this.f17248b.tv_recently_watched_limit_live;
                charSequence = "40";
            } else {
                if (i10 != 5) {
                    return;
                }
                this.f17248b.m15777G0(50);
                textView = this.f17248b.tv_recently_watched_limit_live;
                charSequence = "50";
            }
            textView.setText(charSequence);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$g.class */
    public class DialogInterfaceOnDismissListenerC2777g implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17249b;

        public DialogInterfaceOnDismissListenerC2777g(GeneralSettingsActivity generalSettingsActivity) {
            this.f17249b = generalSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$h.class */
    public class DialogInterfaceOnClickListenerC2778h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17250b;

        public DialogInterfaceOnClickListenerC2778h(GeneralSettingsActivity generalSettingsActivity) {
            this.f17250b = generalSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            GeneralSettingsActivity generalSettingsActivity;
            String str;
            if (i10 == 0) {
                generalSettingsActivity = this.f17250b;
                str = "10s";
            } else if (i10 == 1) {
                generalSettingsActivity = this.f17250b;
                str = "20s";
            } else if (i10 == 2) {
                generalSettingsActivity = this.f17250b;
                str = "30s";
            } else if (i10 == 3) {
                generalSettingsActivity = this.f17250b;
                str = "40s";
            } else if (i10 == 4) {
                generalSettingsActivity = this.f17250b;
                str = "50s";
            } else {
                if (i10 != 5) {
                    return;
                }
                generalSettingsActivity = this.f17250b;
                str = "60s";
            }
            generalSettingsActivity.m15773C0(str);
            this.f17250b.tv_auto_play_in.setText(str);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$i.class */
    public class DialogInterfaceOnDismissListenerC2779i implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final GeneralSettingsActivity f17251b;

        public DialogInterfaceOnDismissListenerC2779i(GeneralSettingsActivity generalSettingsActivity) {
            this.f17251b = generalSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$j.class */
    public class RunnableC2780j implements Runnable {

        /* renamed from: b */
        public final GeneralSettingsActivity f17252b;

        public RunnableC2780j(GeneralSettingsActivity generalSettingsActivity) {
            this.f17252b = generalSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17252b.m15781x0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity$k.class */
    public class ViewOnFocusChangeListenerC2781k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17253b;

        /* renamed from: c */
        public final GeneralSettingsActivity f17254c;

        public ViewOnFocusChangeListenerC2781k(GeneralSettingsActivity generalSettingsActivity, View view) {
            this.f17254c = generalSettingsActivity;
            this.f17253b = view;
        }

        /* renamed from: a */
        public final void m15785a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17253b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m15786b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17253b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            int i10;
            float f10 = 1.05f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m15785a(f10);
                m15786b(f10);
                View view4 = this.f17253b;
                if ((view4 == null || view4.getTag() == null || !this.f17253b.getTag().equals("1")) && ((view2 = this.f17253b) == null || view2.getTag() == null || !this.f17253b.getTag().equals("2"))) {
                    return;
                }
                this.f17253b.setBackgroundResource(2131230845);
                return;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            View view5 = this.f17253b;
            if (view5 == null || view5.getTag() == null || !this.f17253b.getTag().equals("1")) {
                View view6 = this.f17253b;
                if (view6 == null || view6.getTag() == null || !this.f17253b.getTag().equals("2")) {
                    View view7 = this.f17253b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f17253b.setBackground(this.f17254c.getResources().getDrawable(2131231814));
                    return;
                }
                m15785a(f10);
                m15786b(f10);
                view3 = this.f17253b;
                i10 = 2131231576;
            } else {
                m15785a(f10);
                m15786b(f10);
                view3 = this.f17253b;
                i10 = 2131230828;
            }
            view3.setBackgroundResource(i10);
        }
    }

    /* renamed from: A0 */
    public final void m15771A0() {
        String str;
        this.f17212d = this;
        this.f17219k = new LiveStreamDBHandler(this.f17212d);
        this.f17213e = getSharedPreferences("automation_channels", 0);
        this.f17215g = getSharedPreferences("automation_epg", 0);
        this.f17217i = getSharedPreferences("user_agent", 0);
        String string = this.f17213e.getString("auto_start_on_bootup", "");
        String string2 = this.f17217i.getString("user_agent", "MAXDIGITALPlayer");
        if (string.equals("checked")) {
            this.autoStart.setChecked(true);
        }
        EditText editText = this.etUserAgent;
        if (editText != null) {
            editText.setText(string2);
        }
        this.f17224p = getSharedPreferences("loginPrefs", 0);
        this.f17225q = getSharedPreferences("selected_language", 0);
        this.f17224p = getSharedPreferences("loginPrefs", 0);
        String string3 = this.f17225q.getString("selected_language", "");
        this.f17230v = string3;
        if (string3.equals("English")) {
            str = "en";
        } else if (string3.equals("Polish")) {
            str = "pl";
        } else if (string3.equals("Portuguese")) {
            str = "pt";
        } else if (string3.equals("Turkish")) {
            str = "tr";
        } else if (string3.equals("Croatian")) {
            str = "hr";
        } else if (string3.equals("Spanish")) {
            str = "es";
        } else if (string3.equals("Arabic")) {
            str = "ar";
        } else if (string3.equals("French")) {
            str = "fr";
        } else if (string3.equals("German")) {
            str = "de";
        } else if (string3.equals("Italian")) {
            str = "it";
        } else if (string3.equals("Romanian")) {
            str = "ro";
        } else if (string3.equals("Hungary")) {
            str = "hu";
        } else if (string3.equals("Albanian")) {
            str = "sq";
        } else if (string3.equals("Korean")) {
            str = "ko";
        } else if (string3.equals("Hebrew")) {
            str = "he";
        } else if (string3.equals("Ukrainian")) {
            str = "uk";
        } else if (string3.equals("Malay")) {
            str = "ms";
        } else if (string3.equals("Dutch")) {
            str = "nl";
        } else if (string3.equals("Indonesian")) {
            str = "in";
        } else {
            str = string3;
            if (string3.equals("Swedish")) {
                str = "sv";
            }
        }
        try {
            this.spinnerEPG.setSelection(C5255e.m26253t(str));
        } catch (Exception e10) {
        }
    }

    /* renamed from: B0 */
    public void m15772B0() {
        AppOpsManager appOpsManager;
        this.f17212d = this;
        Application application = getApplication();
        this.f17212d = application;
        String m31288z = new C6783a(application).m31288z();
        setContentView(m31288z.equals(C5251a.f30065s0) ? 2131624000 : 2131623999);
        ButterKnife.m5626a(this);
        m15782z0();
        m15779v0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        if (m31288z.equals(C5251a.f30065s0)) {
            this.f17232x = "tv";
        } else {
            this.f17232x = "mobile";
        }
        if (SharepreferenceDBHandler.m15373f(this.f17212d).equals("m3u")) {
            this.ll_auto_play_next_episode.setVisibility(8);
            this.ll_recently_added_limit.setVisibility(8);
        } else {
            this.ll_auto_play_next_episode.setVisibility(0);
            this.ll_recently_added_limit.setVisibility(0);
        }
        SharedPreferences sharedPreferences = this.f17212d.getSharedPreferences("auto_start", 0);
        this.f17229u = sharedPreferences;
        this.f17228t = sharedPreferences.edit();
        boolean z10 = this.f17229u.getBoolean("auto_start", true);
        boolean z11 = this.f17229u.getBoolean("full_epg", true);
        boolean z12 = this.f17229u.getBoolean("subtitle_active", true);
        boolean z13 = this.f17229u.getBoolean("autoplay", true);
        this.f17210B = this.f17229u.getString("autoplay_seconds", C5251a.f30031b0);
        boolean z14 = this.f17229u.getBoolean("picinpic", C5251a.f30033c0);
        this.f17234z = this.f17229u.getInt("recently_added_limit", C5251a.f30027Z);
        this.f17209A = this.f17229u.getInt("recently_watched_limit_live", C5251a.f30029a0);
        boolean z15 = this.f17229u.getBoolean("auto_clear_cache", C5251a.f30043h0);
        boolean z16 = this.f17229u.getBoolean("show_epg_in_channels_list", C5251a.f30045i0);
        boolean z17 = this.f17229u.getBoolean("auto_play_channel_in_live", C5251a.f30047j0);
        if (!this.f17232x.equals("mobile")) {
            this.picinpic.setVisibility(8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f17212d.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f17212d.getPackageName()) == 0) {
                    this.f17233y = true;
                }
            } catch (Exception e10) {
            }
        }
        if (this.f17233y) {
            this.picinpic.setTextColor(this.f17212d.getResources().getColor(2131100158));
            this.picinpic.setEnabled(true);
            this.picinpic.setButtonTintList(ColorStateList.valueOf(this.f17212d.getResources().getColor(2131099660)));
            CheckBox checkBox = this.picinpic;
            if (z14) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
            }
        } else {
            this.picinpic.setTextColor(this.f17212d.getResources().getColor(2131099656));
            this.picinpic.setEnabled(false);
            this.picinpic.setChecked(false);
            this.picinpic.setButtonTintList(ColorStateList.valueOf(this.f17212d.getResources().getColor(2131099656)));
        }
        TextView textView = this.tv_auto_play_in;
        if (textView != null) {
            textView.setText(this.f17210B);
        }
        CheckBox checkBox2 = this.activesubtitle;
        if (z12) {
            checkBox2.setChecked(true);
        } else {
            checkBox2.setChecked(false);
        }
        if (z10) {
            this.autoStart.setChecked(true);
        } else {
            this.autoStart.setChecked(false);
        }
        CheckBox checkBox3 = this.fullEPG;
        if (z11) {
            checkBox3.setChecked(true);
        } else {
            checkBox3.setChecked(false);
        }
        CheckBox checkBox4 = this.autoplay;
        if (z13) {
            checkBox4.setChecked(true);
        } else {
            checkBox4.setChecked(false);
        }
        CheckBox checkBox5 = this.auto_clear_cache;
        if (z15) {
            checkBox5.setChecked(true);
        } else {
            checkBox5.setChecked(false);
        }
        CheckBox checkBox6 = this.show_epg_in_channels_list;
        if (z16) {
            checkBox6.setChecked(true);
        } else {
            checkBox6.setChecked(false);
        }
        CheckBox checkBox7 = this.auto_play_channel_in_live;
        if (z17) {
            checkBox7.setChecked(true);
        } else {
            checkBox7.setChecked(false);
        }
        TextView textView2 = this.tv_recently_added_limit;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.f17234z));
        }
        TextView textView3 = this.tv_recently_watched_limit_live;
        if (textView3 != null) {
            textView3.setText(String.valueOf(this.f17209A));
        }
        m15771A0();
        Thread thread = this.f17211C;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2780j(this));
            this.f17211C = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2771a(this));
        this.fl_auto_play_in.setOnClickListener(this);
        this.fl_recently_added_limit.setOnClickListener(this);
        this.fl_recently_watched_limit_live.setOnClickListener(this);
        this.bt_clear_now.setOnClickListener(this);
    }

    /* renamed from: C0 */
    public final void m15773C0(String str) {
        SharedPreferences.Editor editor = this.f17228t;
        if (editor != null) {
            editor.putString("autoplay_seconds", str);
            this.f17228t.apply();
        }
    }

    /* renamed from: D0 */
    public final void m15774D0() {
        int i10 = 0;
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132018440));
        int i11 = this.f17229u.getInt("recently_added_limit", C5251a.f30027Z);
        this.f17234z = i11;
        if (i11 != 10) {
            if (i11 == 20) {
                i10 = 1;
            } else if (i11 == 30) {
                i10 = 2;
            } else if (i11 == 40) {
                i10 = 3;
            } else if (i11 == 50) {
                i10 = 4;
            } else if (i11 == 100) {
                i10 = 5;
            }
        }
        aVar.m863k(new CharSequence[]{"10", "20", "30", "40", "50", "100"}, i10, new DialogInterfaceOnClickListenerC2774d(this));
        DialogC0242a create = aVar.create();
        this.f17231w = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2775e(this));
        this.f17231w.show();
    }

    /* renamed from: E0 */
    public final void m15775E0(int i10) {
        SharedPreferences.Editor editor = this.f17228t;
        if (editor != null) {
            editor.putInt("recently_added_limit", i10);
            this.f17228t.apply();
        }
    }

    /* renamed from: F0 */
    public final void m15776F0() {
        int i10 = 0;
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132018442));
        int i11 = this.f17229u.getInt("recently_watched_limit_live", C5251a.f30029a0);
        this.f17209A = i11;
        if (i11 != 5) {
            if (i11 == 10) {
                i10 = 1;
            } else if (i11 == 20) {
                i10 = 2;
            } else if (i11 == 30) {
                i10 = 3;
            } else if (i11 == 40) {
                i10 = 4;
            } else if (i11 == 50) {
                i10 = 5;
            }
        }
        aVar.m863k(new CharSequence[]{"5", "10", "20", "30", "40", "50"}, i10, new DialogInterfaceOnClickListenerC2776f(this));
        DialogC0242a create = aVar.create();
        this.f17231w = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2777g(this));
        this.f17231w.show();
    }

    /* renamed from: G0 */
    public final void m15777G0(int i10) {
        SharedPreferences.Editor editor = this.f17228t;
        if (editor != null) {
            editor.putInt("recently_watched_limit_live", i10);
            this.f17228t.apply();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131427604:
                m15780w0();
                break;
            case 2131428021:
                m15778u0();
                break;
            case 2131428027:
                m15774D0();
                break;
            case 2131428028:
                m15776F0();
                break;
            case 2131429468:
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                overridePendingTransition(2130772003, 2130772000);
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m15772B0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17211C;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17211C.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f17211C;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2780j(this));
            this.f17211C = thread2;
            thread2.start();
        }
        overridePendingTransition(2130772003, 2130772000);
        C5255e.m26233f(this.f17212d);
    }

    @OnClick
    @SuppressLint({"ApplySharedPref", "CommitPrefEdits"})
    public void onViewClicked(View view) {
        String str;
        Resources resources;
        int i10;
        int id2 = view.getId();
        if (id2 != 2131427620) {
            if (id2 != 2131427634) {
                return;
            }
            onBackPressed();
            return;
        }
        this.f17213e = getSharedPreferences("automation_channels", 0);
        this.f17215g = getSharedPreferences("auto_start_on_bootup", 0);
        this.f17214f = this.f17213e.edit();
        this.f17218j = this.f17217i.edit();
        this.f17216h = this.f17215g.edit();
        if (this.autoStart.isChecked()) {
            SharedPreferences.Editor editor = this.f17228t;
            if (editor != null) {
                editor.putBoolean("auto_start", true);
            }
        } else {
            SharedPreferences.Editor editor2 = this.f17228t;
            if (editor2 != null) {
                editor2.putBoolean("auto_start", false);
            }
        }
        if (this.fullEPG.isChecked()) {
            SharedPreferences.Editor editor3 = this.f17228t;
            if (editor3 != null) {
                editor3.putBoolean("full_epg", true);
            }
        } else {
            SharedPreferences.Editor editor4 = this.f17228t;
            if (editor4 != null) {
                editor4.putBoolean("full_epg", false);
            }
        }
        if (this.activesubtitle.isChecked()) {
            SharedPreferences.Editor editor5 = this.f17228t;
            if (editor5 != null) {
                editor5.putBoolean("subtitle_active", true);
            }
        } else {
            SharedPreferences.Editor editor6 = this.f17228t;
            if (editor6 != null) {
                editor6.putBoolean("subtitle_active", false);
            }
        }
        if (this.autoplay.isChecked()) {
            SharedPreferences.Editor editor7 = this.f17228t;
            if (editor7 != null) {
                editor7.putBoolean("autoplay", true);
            }
        } else {
            SharedPreferences.Editor editor8 = this.f17228t;
            if (editor8 != null) {
                editor8.putBoolean("autoplay", false);
            }
        }
        if (this.picinpic.isChecked()) {
            SharedPreferences.Editor editor9 = this.f17228t;
            if (editor9 != null) {
                editor9.putBoolean("picinpic", true);
            }
        } else {
            SharedPreferences.Editor editor10 = this.f17228t;
            if (editor10 != null) {
                editor10.putBoolean("picinpic", false);
            }
        }
        if (this.auto_clear_cache.isChecked()) {
            SharedPreferences.Editor editor11 = this.f17228t;
            if (editor11 != null) {
                editor11.putBoolean("auto_clear_cache", true);
            }
        } else {
            SharedPreferences.Editor editor12 = this.f17228t;
            if (editor12 != null) {
                editor12.putBoolean("auto_clear_cache", false);
            }
        }
        if (this.show_epg_in_channels_list.isChecked()) {
            SharedPreferences.Editor editor13 = this.f17228t;
            if (editor13 != null) {
                editor13.putBoolean("show_epg_in_channels_list", true);
            }
        } else {
            SharedPreferences.Editor editor14 = this.f17228t;
            if (editor14 != null) {
                editor14.putBoolean("show_epg_in_channels_list", false);
            }
        }
        if (this.auto_play_channel_in_live.isChecked()) {
            SharedPreferences.Editor editor15 = this.f17228t;
            if (editor15 != null) {
                editor15.putBoolean("auto_play_channel_in_live", true);
            }
        } else {
            SharedPreferences.Editor editor16 = this.f17228t;
            if (editor16 != null) {
                editor16.putBoolean("auto_play_channel_in_live", false);
            }
        }
        if (this.etUserAgent.getText().toString().equals("")) {
            SharedPreferences.Editor editor17 = this.f17218j;
            if (editor17 != null) {
                editor17.putString("user_agent", "MAXDIGITALPlayer");
            }
        } else {
            SharedPreferences.Editor editor18 = this.f17218j;
            if (editor18 != null) {
                editor18.putString("user_agent", this.etUserAgent.getText().toString());
            }
        }
        this.f17226r = this.f17224p.edit();
        SharedPreferences.Editor edit = this.f17225q.edit();
        this.f17227s = edit;
        if (edit != null) {
            this.spinnerEPG.getSelectedItemPosition();
            str = String.valueOf(this.spinnerEPG.getSelectedItem());
            this.f17227s.putString("selected_language", String.valueOf(this.spinnerEPG.getSelectedItem()));
            SharepreferenceDBHandler.m15364a0(String.valueOf(this.spinnerEPG.getSelectedItem()), this.f17212d);
            this.f17227s.commit();
            C5255e.m26232e0(this.f17212d, str);
        } else {
            str = "";
        }
        this.f17228t.apply();
        this.f17214f.apply();
        this.f17216h.apply();
        this.f17218j.apply();
        if (this.etUserAgent.getText().toString().equals("")) {
            this.etUserAgent.setText("MAXDIGITALPlayer");
            resources = getResources();
            i10 = 2132018349;
        } else if (this.f17230v.equalsIgnoreCase(str)) {
            resources = getResources();
            i10 = 2132018338;
        } else {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            resources = getResources();
            i10 = 2132018459;
        }
        Toast.makeText(this, resources.getString(i10), 0).show();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: u0 */
    public final void m15778u0() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132017350));
        String string = this.f17229u.getString("autoplay_seconds", C5251a.f30031b0);
        this.f17210B = string;
        string.hashCode();
        boolean z10 = -1;
        switch (string.hashCode()) {
            case 48692:
                if (string.equals("10s")) {
                    z10 = false;
                    break;
                }
                break;
            case 49653:
                if (string.equals("20s")) {
                    z10 = true;
                    break;
                }
                break;
            case 50614:
                if (string.equals("30s")) {
                    z10 = 2;
                    break;
                }
                break;
            case 51575:
                if (string.equals("40s")) {
                    z10 = 3;
                    break;
                }
                break;
            case 52536:
                if (string.equals("50s")) {
                    z10 = 4;
                    break;
                }
                break;
            case 53497:
                if (string.equals("60s")) {
                    z10 = 5;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
            default:
                i10 = 0;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 2;
                break;
            case true:
                i10 = 3;
                break;
            case true:
                i10 = 4;
                break;
            case true:
                i10 = 5;
                break;
        }
        aVar.m863k(new CharSequence[]{"10s", "20s", "30s", "40s", "50s", "60s"}, i10, new DialogInterfaceOnClickListenerC2778h(this));
        DialogC0242a create = aVar.create();
        this.f17231w = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2779i(this));
        this.f17231w.show();
    }

    /* renamed from: v0 */
    public final void m15779v0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: w0 */
    public final void m15780w0() {
        new DialogC2772b(this, this).show();
    }

    /* renamed from: x0 */
    public void m15781x0() {
        runOnUiThread(new RunnableC2773c(this));
    }

    /* renamed from: z0 */
    public final void m15782z0() {
        Button button = this.btnBackPlayerselection;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, button));
        }
        CheckBox checkBox = this.autoStart;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox));
            this.autoStart.requestFocus();
        }
        EditText editText = this.etUserAgent;
        if (editText != null) {
            editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, editText));
        }
        CheckBox checkBox2 = this.fullEPG;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox2));
        }
        Spinner spinner = this.spinnerEPG;
        if (spinner != null) {
            spinner.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, spinner));
        }
        CheckBox checkBox3 = this.activesubtitle;
        if (checkBox3 != null) {
            checkBox3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox3));
        }
        CheckBox checkBox4 = this.picinpic;
        if (checkBox4 != null) {
            checkBox4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox4));
        }
        CheckBox checkBox5 = this.autoplay;
        if (checkBox5 != null) {
            checkBox5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox5));
        }
        FrameLayout frameLayout = this.fl_auto_play_in;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, frameLayout));
        }
        FrameLayout frameLayout2 = this.fl_recently_added_limit;
        if (frameLayout2 != null) {
            frameLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, frameLayout2));
        }
        FrameLayout frameLayout3 = this.fl_recently_watched_limit_live;
        if (frameLayout3 != null) {
            frameLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, frameLayout3));
        }
        TextView textView = this.bt_clear_now;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, textView));
        }
        CheckBox checkBox6 = this.auto_clear_cache;
        if (checkBox6 != null) {
            checkBox6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox6));
        }
        CheckBox checkBox7 = this.show_epg_in_channels_list;
        if (checkBox7 != null) {
            checkBox7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox7));
        }
        CheckBox checkBox8 = this.auto_play_channel_in_live;
        if (checkBox8 != null) {
            checkBox8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, checkBox8));
        }
        Button button2 = this.btSaveChanges;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2781k(this, button2));
        }
    }
}
