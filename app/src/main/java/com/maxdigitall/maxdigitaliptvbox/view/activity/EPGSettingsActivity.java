package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.EPGSourcesModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.EPGSourcesAdapter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p355uf.C9175c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity.class */
public class EPGSettingsActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChangesTimeShift;

    @BindView
    public Button btSaveChangesTimeline;

    @BindView
    public Button bt_epg_sources;

    @BindView
    public Button bt_epg_timeline;

    @BindView
    public Button bt_epg_timeshift;

    /* renamed from: d */
    public Context f17044d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17045e;

    /* renamed from: f */
    public SharedPreferences.Editor f17046f;

    /* renamed from: g */
    public SharedPreferences f17047g;

    /* renamed from: h */
    public SharedPreferences.Editor f17048h;

    /* renamed from: i */
    public LiveStreamDBHandler f17049i;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public RelativeLayout ll_add_source;

    @BindView
    public LinearLayout ll_epg_sources;

    @BindView
    public LinearLayout ll_epg_timeline;

    @BindView
    public LinearLayout ll_epg_timeshift;

    @BindView
    public RelativeLayout ll_refresh_epg;

    @BindView
    public ImageView logo;

    /* renamed from: n */
    public EPGSourcesAdapter f17054n;

    /* renamed from: o */
    public ArrayList<XMLTVProgrammePojo> f17055o;

    /* renamed from: p */
    public C6783a f17056p;

    /* renamed from: q */
    public ProgressDialog f17057q;

    @BindView
    public RadioButton rballchannels;

    @BindView
    public RadioButton rbwithepg;

    @BindView
    public RadioGroup rgRadio;

    @BindView
    public RecyclerView rv_epg_sources;

    @BindView
    public Spinner spinnerEPG;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_epg_found_for;

    @BindView
    public TextView tv_epg_source_default;

    @BindView
    public TextView tv_epg_timeline_default;

    @BindView
    public TextView tv_epg_timeshift_default;

    @BindView
    public TextView tv_no_source_found;

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f17050j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: k */
    public DatabaseUpdatedStatusDBModel f17051k = new DatabaseUpdatedStatusDBModel();

    /* renamed from: l */
    public String f17052l = "";

    /* renamed from: m */
    public String f17053m = "";

    /* renamed from: r */
    public Thread f17058r = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$a.class */
    public class RunnableC2737a implements Runnable {

        /* renamed from: b */
        public final EPGSettingsActivity f17059b;

        public RunnableC2737a(EPGSettingsActivity ePGSettingsActivity) {
            this.f17059b = ePGSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17059b.f17044d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17059b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17059b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$b.class */
    public class ViewOnClickListenerC2738b implements View.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17060b;

        public ViewOnClickListenerC2738b(EPGSettingsActivity ePGSettingsActivity) {
            this.f17060b = ePGSettingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17060b.f17044d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$c.class */
    public class ViewOnClickListenerC2739c implements View.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17061b;

        public ViewOnClickListenerC2739c(EPGSettingsActivity ePGSettingsActivity) {
            this.f17061b = ePGSettingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17061b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$d.class */
    public class DialogInterfaceOnClickListenerC2740d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17062b;

        public DialogInterfaceOnClickListenerC2740d(EPGSettingsActivity ePGSettingsActivity) {
            this.f17062b = ePGSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$e.class */
    public class DialogInterfaceOnClickListenerC2741e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17063b;

        public DialogInterfaceOnClickListenerC2741e(EPGSettingsActivity ePGSettingsActivity) {
            this.f17063b = ePGSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f17063b.f17044d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$f.class */
    public class DialogInterfaceOnClickListenerC2742f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17064b;

        public DialogInterfaceOnClickListenerC2742f(EPGSettingsActivity ePGSettingsActivity) {
            this.f17064b = ePGSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17064b.f17044d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$g.class */
    public class DialogInterfaceOnClickListenerC2743g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17065b;

        public DialogInterfaceOnClickListenerC2743g(EPGSettingsActivity ePGSettingsActivity) {
            this.f17065b = ePGSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$h.class */
    public class DialogInterfaceOnClickListenerC2744h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17066b;

        public DialogInterfaceOnClickListenerC2744h(EPGSettingsActivity ePGSettingsActivity) {
            this.f17066b = ePGSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$i.class */
    public class DialogInterfaceOnClickListenerC2745i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGSettingsActivity f17067b;

        public DialogInterfaceOnClickListenerC2745i(EPGSettingsActivity ePGSettingsActivity) {
            this.f17067b = ePGSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$j.class */
    public class RunnableC2746j implements Runnable {

        /* renamed from: b */
        public final EPGSettingsActivity f17068b;

        public RunnableC2746j(EPGSettingsActivity ePGSettingsActivity) {
            this.f17068b = ePGSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17068b.m15701G0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$k.class */
    public class DialogC2747k extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17069b;

        /* renamed from: c */
        public TextView f17070c;

        /* renamed from: d */
        public TextView f17071d;

        /* renamed from: e */
        public EditText f17072e;

        /* renamed from: f */
        public Context f17073f;

        /* renamed from: g */
        public LiveStreamDBHandler f17074g;

        /* renamed from: h */
        public LinearLayout f17075h;

        /* renamed from: i */
        public LinearLayout f17076i;

        /* renamed from: j */
        public final EPGSettingsActivity f17077j;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$k$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$k$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$k$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17078b;

            /* renamed from: c */
            public final DialogC2747k f17079c;

            public a(DialogC2747k dialogC2747k, View view) {
                this.f17079c = dialogC2747k;
                this.f17078b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17078b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17078b.getTag().equals("1")) {
                        View view3 = this.f17078b;
                        if (view3 == null || view3.getTag() == null || !this.f17078b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17079c.f17076i;
                    }
                    linearLayout = this.f17079c.f17075h;
                } else {
                    View view4 = this.f17078b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17078b.getTag().equals("1")) {
                        View view5 = this.f17078b;
                        if (view5 == null || view5.getTag() == null || !this.f17078b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17079c.f17076i;
                    }
                    linearLayout = this.f17079c.f17075h;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2747k(EPGSettingsActivity ePGSettingsActivity, Activity activity, Context context, LiveStreamDBHandler liveStreamDBHandler) {
            super(activity);
            this.f17077j = ePGSettingsActivity;
            this.f17069b = activity;
            this.f17073f = context;
            this.f17074g = liveStreamDBHandler;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String string;
            int id2 = view.getId();
            if (id2 == 2131427639) {
                dismiss();
                return;
            }
            if (id2 != 2131427668) {
                return;
            }
            try {
                String trim = this.f17072e.getText().toString().trim();
                try {
                    URI uri = new URI(this.f17072e.getText().toString().trim());
                    trim = uri.getHost() == null ? this.f17072e.getText().toString().trim() : uri.getHost();
                } catch (Exception e10) {
                }
                String trim2 = String.valueOf(this.f17072e.getText()).trim();
                if (trim != null && !trim.equals("") && !trim.isEmpty()) {
                    if (trim2 != null && !trim2.equals("") && !trim2.isEmpty()) {
                        if (this.f17074g.m15162F0(trim2) != 0) {
                            context = this.f17073f;
                            string = context.getResources().getString(2132018616);
                            Toast.makeText(context, string, 0).show();
                        } else {
                            this.f17074g.m15260w(trim, "custom", trim2, "0");
                            Context context2 = this.f17073f;
                            Toast.makeText(context2, context2.getResources().getString(2132018338), 0).show();
                            this.f17077j.m15708N0();
                            dismiss();
                            return;
                        }
                    }
                    context = this.f17073f;
                    string = context.getResources().getString(2132017652);
                    Toast.makeText(context, string, 0).show();
                }
                context = this.f17073f;
                string = context.getResources().getString(2132017651);
                Toast.makeText(context, string, 0).show();
            } catch (Exception e11) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f17077j.f17056p.m31288z().equals(C5251a.f30065s0) ? 2131624108 : 2131624107);
            this.f17070c = (TextView) findViewById(2131427668);
            this.f17071d = (TextView) findViewById(2131427639);
            this.f17075h = (LinearLayout) findViewById(2131428448);
            this.f17076i = (LinearLayout) findViewById(2131428541);
            this.f17072e = (EditText) findViewById(2131427927);
            this.f17070c.setOnClickListener(this);
            this.f17071d.setOnClickListener(this);
            TextView textView = this.f17070c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f17071d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$l.class */
    public class DialogC2748l extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17080b;

        /* renamed from: c */
        public TextView f17081c;

        /* renamed from: d */
        public TextView f17082d;

        /* renamed from: e */
        public SwitchCompat f17083e;

        /* renamed from: f */
        public LinearLayout f17084f;

        /* renamed from: g */
        public EditText f17085g;

        /* renamed from: h */
        public EditText f17086h;

        /* renamed from: i */
        public Context f17087i;

        /* renamed from: j */
        public LiveStreamDBHandler f17088j;

        /* renamed from: k */
        public EPGSourcesModel f17089k;

        /* renamed from: l */
        public boolean f17090l;

        /* renamed from: m */
        public String f17091m;

        /* renamed from: n */
        public int f17092n;

        /* renamed from: o */
        public String f17093o;

        /* renamed from: p */
        public LinearLayout f17094p;

        /* renamed from: q */
        public LinearLayout f17095q;

        /* renamed from: r */
        public final EPGSettingsActivity f17096r;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$l$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$l$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$l$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final DialogC2748l f17097b;

            public a(DialogC2748l dialogC2748l) {
                this.f17097b = dialogC2748l;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17097b.f17088j.m15161E2("epg", "3", String.valueOf(this.f17097b.f17092n));
                this.f17097b.f17096r.m15708N0();
                if (this.f17097b.f17096r.f17054n != null) {
                    EPGSettingsActivity ePGSettingsActivity = this.f17097b.f17096r;
                    ePGSettingsActivity.m15707M0(ePGSettingsActivity.f17054n, this.f17097b.f17092n);
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$l$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$l$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$l$b.class */
        public class b implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17098b;

            /* renamed from: c */
            public final DialogC2748l f17099c;

            public b(DialogC2748l dialogC2748l, View view) {
                this.f17099c = dialogC2748l;
                this.f17098b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17098b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17098b.getTag().equals("1")) {
                        View view3 = this.f17098b;
                        if (view3 == null || view3.getTag() == null || !this.f17098b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17099c.f17095q;
                    }
                    linearLayout = this.f17099c.f17094p;
                } else {
                    View view4 = this.f17098b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17098b.getTag().equals("1")) {
                        View view5 = this.f17098b;
                        if (view5 == null || view5.getTag() == null || !this.f17098b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17099c.f17095q;
                    }
                    linearLayout = this.f17099c.f17094p;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2748l(EPGSettingsActivity ePGSettingsActivity, Activity activity, Context context, LiveStreamDBHandler liveStreamDBHandler, EPGSourcesModel ePGSourcesModel) {
            super(activity);
            this.f17096r = ePGSettingsActivity;
            this.f17090l = false;
            this.f17080b = activity;
            this.f17087i = context;
            this.f17088j = liveStreamDBHandler;
            this.f17089k = ePGSourcesModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String string;
            EPGSettingsActivity ePGSettingsActivity;
            LiveStreamDBHandler liveStreamDBHandler;
            int id2 = view.getId();
            if (id2 == 2131427639) {
                dismiss();
                return;
            }
            if (id2 != 2131427668) {
                if (id2 != 2131428366) {
                    return;
                }
                new DialogC2749m(this.f17096r, (Activity) this.f17087i, this, this.f17092n, this.f17090l).show();
                return;
            }
            try {
                String valueOf = String.valueOf(this.f17085g.getText());
                String trim = String.valueOf(this.f17086h.getText()).trim();
                if (C5251a.f30034d.booleanValue() && (valueOf.equals("") || valueOf.isEmpty())) {
                    context = this.f17087i;
                    string = context.getResources().getString(2132017651);
                } else {
                    if (trim != null && !trim.equals("") && !trim.isEmpty()) {
                        String str = this.f17083e.isChecked() ? "1" : "0";
                        if (this.f17093o.equals(trim)) {
                            this.f17088j.m15155C2(valueOf, this.f17091m, trim, str, this.f17092n);
                            Context context2 = this.f17087i;
                            Toast.makeText(context2, context2.getResources().getString(2132018338), 0).show();
                        } else if (this.f17088j.m15162F0(trim) == 0) {
                            this.f17088j.m15155C2(valueOf, this.f17091m, trim, str, this.f17092n);
                            Context context3 = this.f17087i;
                            Toast.makeText(context3, context3.getResources().getString(2132018338), 0).show();
                            this.f17088j.m15161E2("epg", "0", String.valueOf(this.f17092n));
                            if (!String.valueOf(this.f17092n).equals("0") && (liveStreamDBHandler = this.f17088j) != null) {
                                liveStreamDBHandler.m15246q2(String.valueOf(this.f17092n));
                            }
                        } else {
                            context = this.f17087i;
                            string = context.getResources().getString(2132018616);
                        }
                        if (this.f17090l && str.equals("0") && this.f17091m.equals("custom")) {
                            this.f17088j.m15164F2();
                        }
                        if (str.equals("1")) {
                            ImportStatusModel m15224i2 = this.f17088j.m15224i2("epg", String.valueOf(this.f17092n));
                            ImportStatusModel importStatusModel = m15224i2;
                            if (m15224i2.m15137d() == null) {
                                importStatusModel = m15224i2;
                                if (m15224i2.m15138e() == null) {
                                    importStatusModel = m15224i2;
                                    if (m15224i2.m15139f() == null) {
                                        importStatusModel = new ImportStatusModel();
                                        importStatusModel.m15145l("epg");
                                        importStatusModel.m15143j("0");
                                        importStatusModel.m15140g("");
                                        importStatusModel.m15144k("");
                                        importStatusModel.m15142i(String.valueOf(this.f17092n));
                                        ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                                        arrayList.add(0, importStatusModel);
                                        this.f17088j.m15228k2(arrayList, SharepreferenceDBHandler.m15373f(this.f17087i));
                                    }
                                }
                            }
                            if ((importStatusModel.m15137d() != null && importStatusModel.m15137d().equals("2")) || (importStatusModel.m15137d() != null && importStatusModel.m15137d().equals("0"))) {
                                if (C5251a.f30061q0) {
                                    C5251a.f30061q0 = false;
                                }
                                if (this.f17096r.f17057q == null) {
                                    this.f17096r.f17057q = EPGSettingsActivity.m15690F0(this.f17087i);
                                    ePGSettingsActivity = this.f17096r;
                                } else {
                                    ePGSettingsActivity = this.f17096r;
                                }
                                ePGSettingsActivity.f17057q.show();
                                new Handler(Looper.getMainLooper()).postDelayed(new a(this), 1000L);
                                dismiss();
                                return;
                            }
                        }
                        this.f17096r.m15708N0();
                        dismiss();
                        return;
                    }
                    context = this.f17087i;
                    string = context.getResources().getString(2132017652);
                }
                Toast.makeText(context, string, 0).show();
            } catch (Exception e10) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f17096r.f17056p.m31288z().equals(C5251a.f30065s0) ? 2131624183 : 2131624182);
            this.f17081c = (TextView) findViewById(2131427668);
            this.f17082d = (TextView) findViewById(2131427639);
            this.f17094p = (LinearLayout) findViewById(2131428448);
            this.f17095q = (LinearLayout) findViewById(2131428541);
            this.f17084f = (LinearLayout) findViewById(2131428366);
            this.f17083e = (SwitchCompat) findViewById(2131429250);
            this.f17085g = (EditText) findViewById(2131427926);
            this.f17086h = (EditText) findViewById(2131427927);
            this.f17085g.setText(this.f17089k.m15122d());
            this.f17086h.setText(this.f17089k.m15120b());
            this.f17091m = this.f17089k.m15123e();
            this.f17092n = this.f17089k.m15121c();
            this.f17093o = this.f17089k.m15120b().trim();
            this.f17081c.setOnClickListener(this);
            this.f17082d.setOnClickListener(this);
            this.f17084f.setOnClickListener(this);
            if (this.f17089k.m15119a().equals("1")) {
                this.f17083e.setChecked(true);
                this.f17090l = true;
            } else {
                this.f17083e.setChecked(false);
                this.f17090l = false;
            }
            if (this.f17089k.m15123e().equals("panel")) {
                this.f17085g.setEnabled(false);
                if (C5251a.f30034d.booleanValue()) {
                    this.f17085g.setVisibility(0);
                } else {
                    this.f17085g.setVisibility(8);
                }
                this.f17086h.setEnabled(false);
                this.f17084f.setVisibility(8);
                this.f17086h.setVisibility(8);
                ArrayList<EPGSourcesModel> m15169H1 = this.f17088j.m15169H1();
                if (m15169H1 == null || m15169H1.size() <= 1) {
                    this.f17083e.setEnabled(false);
                } else {
                    this.f17083e.setEnabled(true);
                }
            }
            TextView textView = this.f17081c;
            textView.setOnFocusChangeListener(new b(this, textView));
            TextView textView2 = this.f17082d;
            textView2.setOnFocusChangeListener(new b(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$m.class */
    public class DialogC2749m extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC2748l f17100b;

        /* renamed from: c */
        public final int f17101c;

        /* renamed from: d */
        public final boolean f17102d;

        /* renamed from: e */
        public Activity f17103e;

        /* renamed from: f */
        public TextView f17104f;

        /* renamed from: g */
        public TextView f17105g;

        /* renamed from: h */
        public TextView f17106h;

        /* renamed from: i */
        public TextView f17107i;

        /* renamed from: j */
        public LinearLayout f17108j;

        /* renamed from: k */
        public LinearLayout f17109k;

        /* renamed from: l */
        public final EPGSettingsActivity f17110l;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$m$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$m$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$m$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17111b;

            /* renamed from: c */
            public final DialogC2749m f17112c;

            public a(DialogC2749m dialogC2749m, View view) {
                this.f17112c = dialogC2749m;
                this.f17111b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17111b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17111b.getTag().equals("1")) {
                        View view3 = this.f17111b;
                        if (view3 == null || view3.getTag() == null || !this.f17111b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17112c.f17109k;
                    }
                    linearLayout = this.f17112c.f17108j;
                } else {
                    View view4 = this.f17111b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17111b.getTag().equals("1")) {
                        View view5 = this.f17111b;
                        if (view5 == null || view5.getTag() == null || !this.f17111b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17112c.f17109k;
                    }
                    linearLayout = this.f17112c.f17108j;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2749m(EPGSettingsActivity ePGSettingsActivity, Activity activity, DialogC2748l dialogC2748l, int i10, boolean z10) {
            super(activity);
            this.f17110l = ePGSettingsActivity;
            this.f17103e = activity;
            this.f17100b = dialogC2748l;
            this.f17101c = i10;
            this.f17102d = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
                return;
            }
            if (id2 != 2131427681) {
                return;
            }
            this.f17110l.f17049i.m15182O0(this.f17101c);
            this.f17110l.f17049i.m15192T0(SharepreferenceDBHandler.m15337A(this.f17110l.f17044d), String.valueOf(this.f17101c), SharepreferenceDBHandler.m15373f(this.f17110l.f17044d));
            this.f17110l.f17049i.m15246q2(String.valueOf(this.f17101c));
            if (this.f17102d) {
                this.f17110l.f17049i.m15164F2();
            }
            Toast.makeText(this.f17110l.f17044d, this.f17110l.f17044d.getResources().getString(2132018617), 0).show();
            this.f17110l.m15708N0();
            dismiss();
            this.f17100b.dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f17110l.f17056p.m31288z().equals(C5251a.f30065s0) ? 2131624132 : 2131624131);
            this.f17104f = (TextView) findViewById(2131427681);
            this.f17105g = (TextView) findViewById(2131427653);
            this.f17108j = (LinearLayout) findViewById(2131428448);
            this.f17109k = (LinearLayout) findViewById(2131428541);
            this.f17107i = (TextView) findViewById(2131429631);
            this.f17106h = (TextView) findViewById(2131429644);
            this.f17107i.setText(this.f17110l.f17044d.getResources().getString(2132017560));
            this.f17106h.setText(this.f17110l.f17044d.getResources().getString(2132018809));
            this.f17104f.setOnClickListener(this);
            this.f17105g.setOnClickListener(this);
            TextView textView = this.f17104f;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f17105g;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$n.class */
    public class DialogC2750n extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17113b;

        /* renamed from: c */
        public TextView f17114c;

        /* renamed from: d */
        public TextView f17115d;

        /* renamed from: e */
        public TextView f17116e;

        /* renamed from: f */
        public TextView f17117f;

        /* renamed from: g */
        public LinearLayout f17118g;

        /* renamed from: h */
        public LinearLayout f17119h;

        /* renamed from: i */
        public final EPGSettingsActivity f17120i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$n$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$n$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$n$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final String f17121b;

            /* renamed from: c */
            public final DialogC2750n f17122c;

            public a(DialogC2750n dialogC2750n, String str) {
                this.f17122c = dialogC2750n;
                this.f17121b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17122c.f17120i.f17049i.m15161E2("epg", "3", this.f17121b);
                this.f17122c.f17120i.m15708N0();
                if (this.f17122c.f17120i.f17054n != null) {
                    EPGSettingsActivity ePGSettingsActivity = this.f17122c.f17120i;
                    ePGSettingsActivity.m15707M0(ePGSettingsActivity.f17054n, C5255e.m26215R(this.f17121b));
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$n$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$n$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$n$b.class */
        public class b implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17123b;

            /* renamed from: c */
            public final DialogC2750n f17124c;

            public b(DialogC2750n dialogC2750n, View view) {
                this.f17124c = dialogC2750n;
                this.f17123b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17123b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17123b.getTag().equals("1")) {
                        View view3 = this.f17123b;
                        if (view3 == null || view3.getTag() == null || !this.f17123b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17124c.f17119h;
                    }
                    linearLayout = this.f17124c.f17118g;
                } else {
                    View view4 = this.f17123b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17123b.getTag().equals("1")) {
                        View view5 = this.f17123b;
                        if (view5 == null || view5.getTag() == null || !this.f17123b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17124c.f17119h;
                    }
                    linearLayout = this.f17124c.f17118g;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2750n(EPGSettingsActivity ePGSettingsActivity, Activity activity) {
            super(activity);
            this.f17120i = ePGSettingsActivity;
            this.f17113b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPGSettingsActivity ePGSettingsActivity;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
                return;
            }
            if (id2 != 2131427681) {
                return;
            }
            try {
                if (C5251a.f30061q0) {
                    C5251a.f30061q0 = false;
                }
                ArrayList<EPGSourcesModel> m15208b1 = this.f17120i.f17049i.m15208b1();
                String valueOf = (m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c());
                ImportStatusModel m15224i2 = this.f17120i.f17049i.m15224i2("epg", valueOf);
                if (m15224i2.m15137d() == null && m15224i2.m15138e() == null && m15224i2.m15139f() == null) {
                    ImportStatusModel importStatusModel = new ImportStatusModel();
                    importStatusModel.m15145l("epg");
                    importStatusModel.m15143j("0");
                    importStatusModel.m15140g("");
                    importStatusModel.m15144k("");
                    importStatusModel.m15142i(valueOf);
                    ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                    arrayList.add(0, importStatusModel);
                    this.f17120i.f17049i.m15228k2(arrayList, SharepreferenceDBHandler.m15373f(this.f17120i.f17044d));
                }
                if (this.f17120i.f17057q == null) {
                    EPGSettingsActivity ePGSettingsActivity2 = this.f17120i;
                    ePGSettingsActivity2.f17057q = EPGSettingsActivity.m15690F0(ePGSettingsActivity2.f17044d);
                    ePGSettingsActivity = this.f17120i;
                } else {
                    ePGSettingsActivity = this.f17120i;
                }
                ePGSettingsActivity.f17057q.show();
                new Handler(Looper.getMainLooper()).postDelayed(new a(this, valueOf), 1000L);
                dismiss();
            } catch (Exception e10) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f17120i.f17056p.m31288z().equals(C5251a.f30065s0) ? 2131624132 : 2131624131);
            this.f17114c = (TextView) findViewById(2131427681);
            this.f17115d = (TextView) findViewById(2131427653);
            this.f17118g = (LinearLayout) findViewById(2131428448);
            this.f17119h = (LinearLayout) findViewById(2131428541);
            this.f17117f = (TextView) findViewById(2131429631);
            this.f17116e = (TextView) findViewById(2131429644);
            this.f17117f.setText(this.f17120i.f17044d.getResources().getString(2132018456));
            this.f17116e.setText(this.f17120i.f17044d.getResources().getString(2132018457));
            this.f17114c.setOnClickListener(this);
            this.f17115d.setOnClickListener(this);
            TextView textView = this.f17114c;
            textView.setOnFocusChangeListener(new b(this, textView));
            TextView textView2 = this.f17115d;
            textView2.setOnFocusChangeListener(new b(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$o.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$o.class */
    public class AsyncTaskC2751o extends AsyncTask<String, Integer, Boolean> {

        /* renamed from: a */
        public String f17125a = "0";

        /* renamed from: b */
        public ArrayList<EPGSourcesModel> f17126b;

        /* renamed from: c */
        public final EPGSettingsActivity f17127c;

        public AsyncTaskC2751o(EPGSettingsActivity ePGSettingsActivity, Context context) {
            this.f17127c = ePGSettingsActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                publishProgress(0);
                ArrayList<EPGSourcesModel> m15169H1 = this.f17127c.f17049i.m15169H1();
                this.f17126b = m15169H1;
                if (m15169H1 == null || m15169H1.size() <= 0) {
                    return Boolean.FALSE;
                }
                ArrayList<EPGSourcesModel> m15208b1 = this.f17127c.f17049i.m15208b1();
                if (m15208b1 != null && m15208b1.size() > 0) {
                    this.f17125a = String.valueOf(m15208b1.get(0).m15121c());
                }
                return Boolean.TRUE;
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    this.f17127c.tv_epg_source_default.setVisibility(0);
                    this.f17127c.ll_refresh_epg.setVisibility(0);
                    this.f17127c.tv_epg_found_for.setVisibility(0);
                    this.f17127c.tv_no_source_found.setVisibility(8);
                    this.f17127c.rv_epg_sources.setVisibility(0);
                    this.f17127c.rv_epg_sources.setLayoutManager(new LinearLayoutManager(this.f17127c.f17044d, 1, false));
                    this.f17127c.rv_epg_sources.setItemAnimator(new C0704c());
                    EPGSettingsActivity ePGSettingsActivity = this.f17127c;
                    ePGSettingsActivity.f17054n = new EPGSourcesAdapter(ePGSettingsActivity.f17044d, this.f17126b);
                    EPGSettingsActivity ePGSettingsActivity2 = this.f17127c;
                    ePGSettingsActivity2.rv_epg_sources.setAdapter(ePGSettingsActivity2.f17054n);
                    this.f17127c.m15709O0(this.f17125a);
                } else {
                    this.f17127c.tv_epg_source_default.setVisibility(8);
                    this.f17127c.ll_refresh_epg.setVisibility(8);
                    this.f17127c.tv_no_source_found.setVisibility(0);
                    this.f17127c.rv_epg_sources.setVisibility(8);
                    this.f17127c.tv_epg_found_for.setVisibility(8);
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$p.class */
    public class ViewOnFocusChangeListenerC2752p implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17128b;

        /* renamed from: c */
        public final EPGSettingsActivity f17129c;

        public ViewOnFocusChangeListenerC2752p(EPGSettingsActivity ePGSettingsActivity, View view) {
            this.f17129c = ePGSettingsActivity;
            this.f17128b = view;
        }

        /* renamed from: a */
        public final void m15724a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17128b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m15725b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17128b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            Button button;
            float f10 = 1.0f;
            if (z10) {
                if (z10) {
                    f10 = 1.05f;
                }
                Log.e("id is", "" + this.f17128b.getTag());
                i10 = 2131231576;
                if (!this.f17128b.getTag().equals("1") && !this.f17128b.getTag().equals("2")) {
                    if (this.f17128b.getTag().equals("bt_epg_sources")) {
                        button = this.f17129c.bt_epg_sources;
                    } else if (this.f17128b.getTag().equals("bt_epg_timeline")) {
                        button = this.f17129c.bt_epg_timeline;
                    } else {
                        if (!this.f17128b.getTag().equals("bt_epg_timeshift")) {
                            if (this.f17128b.getTag().equals("rb_withepg") || this.f17128b.getTag().equals("rb_allchannels")) {
                                this.f17128b.setBackground(this.f17129c.getResources().getDrawable(2131231814));
                                return;
                            } else {
                                m15724a(1.05f);
                                m15725b(1.05f);
                                return;
                            }
                        }
                        button = this.f17129c.bt_epg_timeshift;
                    }
                    button.performClick();
                    return;
                }
                m15724a(f10);
                m15725b(f10);
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m15724a(f10);
                m15725b(f10);
                i10 = 2131230845;
                if (!this.f17128b.getTag().equals("1") && !this.f17128b.getTag().equals("2")) {
                    return;
                }
            }
            this.f17128b.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$q.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$q.class */
    public class AsyncTaskC2753q extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final EPGSourcesAdapter f17130a;

        /* renamed from: b */
        public C9175c f17131b;

        /* renamed from: c */
        public String f17132c;

        /* renamed from: d */
        public final EPGSettingsActivity f17133d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$q$a.class
         */
        @SuppressLint({"StaticFieldLeak"})
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGSettingsActivity$q$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGSettingsActivity$q$a.class */
        public class a extends AsyncTask<String, Integer, Boolean> {

            /* renamed from: a */
            public volatile boolean f17134a = true;

            /* renamed from: b */
            public Context f17135b;

            /* renamed from: c */
            public final AsyncTaskC2753q f17136c;

            public a(AsyncTaskC2753q asyncTaskC2753q, Context context) {
                this.f17136c = asyncTaskC2753q;
                this.f17135b = context;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                if (this.f17136c.f17133d.f17049i != null) {
                    this.f17136c.f17133d.f17049i.m15265y(this.f17136c.f17133d.f17055o);
                    this.f17136c.f17133d.f17055o.clear();
                    this.f17136c.f17133d.f17049i.m15161E2("epg", "1", this.f17136c.f17132c);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                EPGSettingsActivity ePGSettingsActivity = this.f17136c.f17133d;
                ePGSettingsActivity.f17045e = ePGSettingsActivity.getSharedPreferences("loginPrefs", 0);
                try {
                    this.f17136c.f17133d.m15708N0();
                } catch (Exception e10) {
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f17134a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public AsyncTaskC2753q(EPGSettingsActivity ePGSettingsActivity, EPGSourcesAdapter ePGSourcesAdapter, int i10) {
            this.f17133d = ePGSettingsActivity;
            this.f17132c = "0";
            this.f17130a = ePGSourcesAdapter;
            this.f17132c = String.valueOf(i10);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            if (!this.f17132c.equals("0") && this.f17133d.f17049i != null) {
                this.f17133d.f17049i.m15246q2(this.f17132c);
            }
            Log.e("honey", "epg 1");
            this.f17131b = new C9175c();
            Log.e("honey", "epg 2");
            this.f17131b.m38610a(this.f17133d.f17044d);
            Log.e("honey", "epg 3");
            this.f17133d.f17055o = this.f17131b.m38611b();
            Log.e("honey", "epg 4");
            if (this.f17133d.f17055o != null && this.f17133d.f17055o.size() > 0) {
                Log.e("honey", "size:" + this.f17133d.f17055o.size());
            } else {
                if (this.f17133d.f17049i.m15163F1(this.f17132c) == 0) {
                    return Boolean.FALSE;
                }
                this.f17133d.f17049i.m15161E2("epg", "1", this.f17132c);
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    C5251a.f30061q0 = false;
                    if (this.f17133d.f17055o == null || this.f17133d.f17055o.size() <= 0) {
                        EPGSettingsActivity ePGSettingsActivity = this.f17133d;
                        ePGSettingsActivity.f17045e = ePGSettingsActivity.getSharedPreferences("loginPrefs", 0);
                    } else {
                        try {
                            C5255e.f30093q = new a(this, this.f17133d.f17044d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                            return;
                        } catch (Exception e10) {
                            this.f17133d.f17049i.m15161E2("epg", "0", this.f17132c);
                        }
                    }
                } else {
                    this.f17133d.f17049i.m15161E2("epg", "2", this.f17132c);
                }
                this.f17133d.m15708N0();
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f17133d.m15704J0();
        }
    }

    /* renamed from: F0 */
    public static ProgressDialog m15690F0(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        try {
            progressDialog.show();
        } catch (Exception e10) {
        }
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setContentView(2131624486);
        return progressDialog;
    }

    /* renamed from: E0 */
    public final void m15700E0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: G0 */
    public void m15701G0() {
        runOnUiThread(new RunnableC2737a(this));
    }

    /* renamed from: H0 */
    public void m15702H0(EPGSourcesModel ePGSourcesModel) {
        new DialogC2748l(this, this, this.f17044d, this.f17049i, ePGSourcesModel).show();
    }

    /* renamed from: I0 */
    public final void m15703I0() {
        Button button = this.btSaveChangesTimeShift;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, button));
        }
        Button button2 = this.btSaveChangesTimeline;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, button2));
        }
        Button button3 = this.bt_epg_sources;
        button3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, button3));
        Button button4 = this.bt_epg_timeline;
        button4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, button4));
        Button button5 = this.bt_epg_timeshift;
        button5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, button5));
        RadioButton radioButton = this.rbwithepg;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, radioButton));
        }
        RadioButton radioButton2 = this.rballchannels;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, radioButton2));
        }
        Spinner spinner = this.spinnerEPG;
        if (spinner != null) {
            spinner.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2752p(this, spinner));
        }
    }

    /* renamed from: J0 */
    public void m15704J0() {
        try {
            ProgressDialog progressDialog = this.f17057q;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            Log.e("honey", "hideProgressDialog");
            this.f17057q.dismiss();
        } catch (Exception e10) {
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: K0 */
    public void m15705K0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: L0 */
    public final void m15706L0() {
        TextView textView;
        Resources resources;
        int i10;
        this.f17049i = new LiveStreamDBHandler(this.f17044d);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17045e = sharedPreferences;
        String string = sharedPreferences.getString("selectedEPGShift", C5251a.f30049k0);
        int m26259z = C5255e.m26259z(string);
        if (string.equals("")) {
            this.tv_epg_timeshift_default.setText("0");
        } else {
            this.tv_epg_timeshift_default.setText(string);
        }
        this.spinnerEPG.setSelection(m26259z);
        SharedPreferences sharedPreferences2 = getSharedPreferences("epgchannelupdate", 0);
        this.f17047g = sharedPreferences2;
        if (sharedPreferences2.getString("epgchannelupdate", "").equals("all")) {
            this.rballchannels.setChecked(true);
            textView = this.tv_epg_timeline_default;
            resources = this.f17044d.getResources();
            i10 = 2132017300;
        } else {
            this.rbwithepg.setChecked(true);
            textView = this.tv_epg_timeline_default;
            resources = this.f17044d.getResources();
            i10 = 2132017664;
        }
        textView.setText(resources.getString(i10));
        m15708N0();
        this.logo.setOnClickListener(new ViewOnClickListenerC2738b(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC2739c(this));
    }

    /* renamed from: M0 */
    public final void m15707M0(EPGSourcesAdapter ePGSourcesAdapter, int i10) {
        new AsyncTaskC2753q(this, ePGSourcesAdapter, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: N0 */
    public final void m15708N0() {
        if (this.rv_epg_sources != null) {
            new AsyncTaskC2751o(this, this.f17044d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    /* renamed from: O0 */
    public final void m15709O0(String str) {
        try {
            this.tv_epg_found_for.setText(getResources().getString(2132017667, String.valueOf(this.f17049i.m15209b2(str))));
        } catch (Exception e10) {
        }
    }

    /* renamed from: P0 */
    public void m15710P0(String str) {
        this.tv_epg_source_default.setText(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17044d = this;
        m15705K0();
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17044d);
        this.f17056p = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623986 : 2131623985);
        ButterKnife.m5626a(this);
        m15703I0();
        m15700E0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m15706L0();
        Thread thread = this.f17058r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2746j(this));
            this.f17058r = thread2;
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
        if (itemId == 2131427416 && (context = this.f17044d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2741e(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2740d(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17044d.getResources().getString(2132017514));
            aVar.m857e(this.f17044d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17044d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2742f(this));
            aVar.m858f(this.f17044d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2743g(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f17044d.getResources().getString(2132017514));
            aVar2.m857e(this.f17044d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f17044d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2744h(this));
            aVar2.m858f(this.f17044d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2745i(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17058r;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17058r.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m15705K0();
        super.onResume();
        Thread thread = this.f17058r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2746j(this));
            this.f17058r = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f17044d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17045e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17045e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        String string;
        Toast makeText;
        TextView textView;
        Resources resources;
        int i10;
        Dialog dialogC2747k;
        switch (view.getId()) {
            case 2131427606:
                this.ll_epg_sources.setVisibility(0);
                this.bt_epg_sources.setBackgroundResource(2131230846);
                this.bt_epg_timeline.setBackgroundResource(2131230845);
                this.bt_epg_timeshift.setBackgroundResource(2131230845);
                linearLayout = this.ll_epg_timeline;
                linearLayout.setVisibility(8);
                linearLayout2 = this.ll_epg_timeshift;
                linearLayout2.setVisibility(8);
                break;
            case 2131427607:
                this.ll_epg_timeline.setVisibility(0);
                this.bt_epg_timeline.setBackgroundResource(2131230846);
                this.bt_epg_sources.setBackgroundResource(2131230845);
                this.bt_epg_timeshift.setBackgroundResource(2131230845);
                linearLayout = this.ll_epg_sources;
                linearLayout.setVisibility(8);
                linearLayout2 = this.ll_epg_timeshift;
                linearLayout2.setVisibility(8);
                break;
            case 2131427608:
                this.ll_epg_timeshift.setVisibility(0);
                this.bt_epg_timeshift.setBackgroundResource(2131230846);
                this.bt_epg_sources.setBackgroundResource(2131230845);
                this.bt_epg_timeline.setBackgroundResource(2131230845);
                this.ll_epg_sources.setVisibility(8);
                linearLayout2 = this.ll_epg_timeline;
                linearLayout2.setVisibility(8);
                break;
            case 2131427621:
                SharedPreferences.Editor edit = this.f17045e.edit();
                this.f17046f = edit;
                if (edit != null) {
                    this.spinnerEPG.getSelectedItemPosition();
                    this.f17046f.putString("selectedEPGShift", String.valueOf(this.spinnerEPG.getSelectedItem()));
                    this.f17046f.apply();
                    this.tv_epg_timeshift_default.setText(String.valueOf(this.spinnerEPG.getSelectedItem()));
                    string = getResources().getString(2132018338);
                    makeText = Toast.makeText(this, string, 0);
                    makeText.show();
                    break;
                }
                string = getResources().getString(2132018337);
                makeText = Toast.makeText(this, string, 0);
                makeText.show();
            case 2131427622:
                RadioButton radioButton = (RadioButton) findViewById(this.rgRadio.getCheckedRadioButtonId());
                SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
                this.f17047g = sharedPreferences;
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                this.f17048h = edit2;
                if (edit2 != null) {
                    if (radioButton.getText().toString().equals(getResources().getString(2132017299))) {
                        this.f17048h.putString("epgchannelupdate", "all");
                        textView = this.tv_epg_timeline_default;
                        resources = getResources();
                        i10 = 2132017300;
                    } else {
                        this.f17048h.putString("epgchannelupdate", "withepg");
                        textView = this.tv_epg_timeline_default;
                        resources = getResources();
                        i10 = 2132017664;
                    }
                    textView.setText(resources.getString(i10));
                    this.f17048h.apply();
                    string = getResources().getString(2132018338);
                    makeText = Toast.makeText(this, string, 0);
                    makeText.show();
                    break;
                }
                string = getResources().getString(2132018337);
                makeText = Toast.makeText(this, string, 0);
                makeText.show();
            case 2131427634:
                finish();
                break;
            case 2131428321:
                dialogC2747k = new DialogC2747k(this, this, this.f17044d, this.f17049i);
                dialogC2747k.show();
                break;
            case 2131428485:
                ArrayList<EPGSourcesModel> m15208b1 = this.f17049i.m15208b1();
                if (!((m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c())).equals("0")) {
                    dialogC2747k = new DialogC2750n(this, this);
                    dialogC2747k.show();
                    break;
                } else {
                    makeText = Toast.makeText(this, getResources().getString(2132018535), 1);
                    makeText.show();
                    break;
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m15705K0();
    }
}
