package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity.class */
public class PlayerSettingsActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    @BindView
    public CheckBox cbInfBuf;

    @BindView
    public CheckBox cbOpenGL;

    @BindView
    public CheckBox cbOpenSLES;

    /* renamed from: d */
    public Context f18014d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f18015e;

    /* renamed from: f */
    public SharedPreferences f18016f;

    @BindView
    public FrameLayout fl_buffer_size_limit;

    /* renamed from: g */
    public SharedPreferences.Editor f18017g;

    /* renamed from: h */
    public SharedPreferences.Editor f18018h;

    /* renamed from: i */
    public LiveStreamDBHandler f18019i;

    @BindView
    public ImageView logo;

    /* renamed from: n */
    public SharedPreferences f18024n;

    /* renamed from: o */
    public SharedPreferences.Editor f18025o;

    /* renamed from: p */
    public SharedPreferences f18026p;

    /* renamed from: q */
    public SharedPreferences.Editor f18027q;

    /* renamed from: r */
    public SharedPreferences f18028r;

    @BindView
    public RadioButton rbHardwareDecoder;

    @BindView
    public RadioButton rbNative;

    @BindView
    public RadioButton rbSoftwareDecoder;

    @BindView
    public RadioGroup rgRadio;

    /* renamed from: s */
    public SharedPreferences.Editor f18029s;

    /* renamed from: t */
    public DialogC0242a f18030t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_buffer_size_limit;

    /* renamed from: u */
    public C6783a f18031u;

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f18020j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: k */
    public DatabaseUpdatedStatusDBModel f18021k = new DatabaseUpdatedStatusDBModel();

    /* renamed from: l */
    public String f18022l = "";

    /* renamed from: m */
    public String f18023m = "";

    /* renamed from: v */
    public Thread f18032v = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$a.class */
    public class DialogInterfaceOnDismissListenerC2938a implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18033b;

        public DialogInterfaceOnDismissListenerC2938a(PlayerSettingsActivity playerSettingsActivity) {
            this.f18033b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$b.class */
    public class ViewOnClickListenerC2939b implements View.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18034b;

        public ViewOnClickListenerC2939b(PlayerSettingsActivity playerSettingsActivity) {
            this.f18034b = playerSettingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18034b.f18014d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$c.class */
    public class RunnableC2940c implements Runnable {

        /* renamed from: b */
        public final PlayerSettingsActivity f18035b;

        public RunnableC2940c(PlayerSettingsActivity playerSettingsActivity) {
            this.f18035b = playerSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18035b.f18014d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18035b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18035b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$d.class */
    public class DialogInterfaceOnClickListenerC2941d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18036b;

        public DialogInterfaceOnClickListenerC2941d(PlayerSettingsActivity playerSettingsActivity) {
            this.f18036b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$e.class */
    public class DialogInterfaceOnClickListenerC2942e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18037b;

        public DialogInterfaceOnClickListenerC2942e(PlayerSettingsActivity playerSettingsActivity) {
            this.f18037b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18037b.f18014d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$f.class */
    public class DialogInterfaceOnClickListenerC2943f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18038b;

        public DialogInterfaceOnClickListenerC2943f(PlayerSettingsActivity playerSettingsActivity) {
            this.f18038b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18038b.f18014d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$g.class */
    public class DialogInterfaceOnClickListenerC2944g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18039b;

        public DialogInterfaceOnClickListenerC2944g(PlayerSettingsActivity playerSettingsActivity) {
            this.f18039b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$h.class */
    public class DialogInterfaceOnClickListenerC2945h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18040b;

        public DialogInterfaceOnClickListenerC2945h(PlayerSettingsActivity playerSettingsActivity) {
            this.f18040b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$i.class */
    public class DialogInterfaceOnClickListenerC2946i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18041b;

        public DialogInterfaceOnClickListenerC2946i(PlayerSettingsActivity playerSettingsActivity) {
            this.f18041b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$j.class */
    public class DialogInterfaceOnClickListenerC2947j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayerSettingsActivity f18042b;

        public DialogInterfaceOnClickListenerC2947j(PlayerSettingsActivity playerSettingsActivity) {
            this.f18042b = playerSettingsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i10) {
            TextView textView;
            CharSequence charSequence;
            switch (i10) {
                case 0:
                    this.f18042b.m16258t0(1);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "1";
                    break;
                case 1:
                    this.f18042b.m16258t0(2);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "2";
                    break;
                case 2:
                    this.f18042b.m16258t0(3);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "3";
                    break;
                case 3:
                    this.f18042b.m16258t0(4);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "4";
                    break;
                case 4:
                    this.f18042b.m16258t0(5);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "5";
                    break;
                case 5:
                    this.f18042b.m16258t0(10);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "10";
                    break;
                case 6:
                    this.f18042b.m16258t0(20);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "20";
                    break;
                case 7:
                    this.f18042b.m16258t0(30);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "30";
                    break;
                case 8:
                    this.f18042b.m16258t0(40);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "40";
                    break;
                case 9:
                    this.f18042b.m16258t0(50);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "50";
                    break;
                case 10:
                    this.f18042b.m16258t0(100);
                    textView = this.f18042b.tv_buffer_size_limit;
                    charSequence = "100";
                    break;
                default:
                    return;
            }
            textView.setText(charSequence);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$k.class */
    public class RunnableC2948k implements Runnable {

        /* renamed from: b */
        public final PlayerSettingsActivity f18043b;

        public RunnableC2948k(PlayerSettingsActivity playerSettingsActivity) {
            this.f18043b = playerSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18043b.m16260v0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity$l.class */
    public class ViewOnFocusChangeListenerC2949l implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18044b;

        /* renamed from: c */
        public final PlayerSettingsActivity f18045c;

        public ViewOnFocusChangeListenerC2949l(PlayerSettingsActivity playerSettingsActivity, View view) {
            this.f18045c = playerSettingsActivity;
            this.f18044b = view;
        }

        /* renamed from: a */
        public final void m16263a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18044b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16264b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18044b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16263a(f10);
                m16264b(f10);
                View view4 = this.f18044b;
                if ((view4 == null || view4.getTag() == null || !this.f18044b.getTag().equals("1")) && ((view2 = this.f18044b) == null || view2.getTag() == null || !this.f18044b.getTag().equals("2"))) {
                    return;
                }
                this.f18044b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view5 = this.f18044b;
            if (view5 == null || view5.getTag() == null || !this.f18044b.getTag().equals("1")) {
                View view6 = this.f18044b;
                if (view6 == null || view6.getTag() == null || !this.f18044b.getTag().equals("2")) {
                    View view7 = this.f18044b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f18044b.setBackground(this.f18045c.getResources().getDrawable(2131231814));
                    return;
                }
                m16263a(f10);
                m16264b(f10);
                view3 = this.f18044b;
                i10 = 2131231576;
            } else {
                m16263a(f10);
                m16264b(f10);
                view3 = this.f18044b;
                i10 = 2131230828;
            }
            view3.setBackgroundResource(i10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428024) {
            m16257s0();
        } else {
            if (id2 != 2131429468) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18014d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18014d);
        this.f18031u = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624030 : 2131624029);
        ButterKnife.m5626a(this);
        m16261w0();
        m16259u0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m16262x0();
        Thread thread = this.f18032v;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2948k(this));
            this.f18032v = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2939b(this));
        this.fl_buffer_size_limit.setOnClickListener(this);
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
        if (itemId == 2131427416 && (context = this.f18014d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2942e(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2941d(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18014d.getResources().getString(2132017514));
            aVar.m857e(this.f18014d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18014d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2943f(this));
            aVar.m858f(this.f18014d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2944g(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18014d.getResources().getString(2132017514));
            aVar2.m857e(this.f18014d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18014d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2945h(this));
            aVar2.m858f(this.f18014d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2946i(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18032v;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18032v.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f18032v;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2948k(this));
            this.f18032v = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f18014d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18015e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18015e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        SharedPreferences.Editor editor;
        String str;
        int id2 = view.getId();
        if (id2 == 2131427620) {
            this.f18024n = getSharedPreferences("pref.using_opensl_es", 0);
            this.f18026p = getSharedPreferences("pref.using_opengl", 0);
            this.f18028r = getSharedPreferences("pref.using_infbuf", 0);
            this.f18025o = this.f18024n.edit();
            this.f18027q = this.f18026p.edit();
            this.f18029s = this.f18028r.edit();
            if (this.cbOpenSLES.isChecked()) {
                SharedPreferences.Editor editor2 = this.f18025o;
                if (editor2 != null) {
                    editor2.putString("pref.using_opensl_es", "checked");
                }
            } else {
                SharedPreferences.Editor editor3 = this.f18025o;
                if (editor3 != null) {
                    editor3.putString("pref.using_opensl_es", "");
                }
            }
            if (this.cbOpenGL.isChecked()) {
                SharedPreferences.Editor editor4 = this.f18027q;
                if (editor4 != null) {
                    editor4.putString("pref.using_opengl", "checked");
                }
            } else {
                SharedPreferences.Editor editor5 = this.f18027q;
                if (editor5 != null) {
                    editor5.putString("pref.using_opengl", "");
                }
            }
            if (this.cbInfBuf.isChecked()) {
                SharedPreferences.Editor editor6 = this.f18029s;
                if (editor6 != null) {
                    editor6.putString("pref.using_infbuf", "checked");
                }
            } else {
                SharedPreferences.Editor editor7 = this.f18029s;
                if (editor7 != null) {
                    editor7.putString("pref.using_infbuf", "unchecked");
                }
            }
            this.f18025o.apply();
            this.f18027q.apply();
            this.f18029s.apply();
            int checkedRadioButtonId = this.rgRadio.getCheckedRadioButtonId();
            this.f18015e = getSharedPreferences("pref.using_media_codec", 0);
            RadioButton radioButton = (RadioButton) findViewById(checkedRadioButtonId);
            String valueOf = radioButton.getTag() != null ? String.valueOf(radioButton.getTag()) : "4";
            SharedPreferences.Editor edit = this.f18015e.edit();
            this.f18018h = edit;
            if (edit == null) {
                Toast.makeText(this, getResources().getString(2132018337), 0).show();
                return;
            }
            if (valueOf.equals("3")) {
                editor = this.f18018h;
                str = "Native";
            } else if (valueOf.equals("4")) {
                editor = this.f18018h;
                str = "Hardware Decoder";
            } else {
                if (valueOf.equals("5")) {
                    editor = this.f18018h;
                    str = "Software Decoder";
                }
                this.f18018h.apply();
                Toast.makeText(this, getResources().getString(2132018338), 0).show();
            }
            editor.putString("pref.using_media_codec", str);
            this.f18018h.apply();
            Toast.makeText(this, getResources().getString(2132018338), 0).show();
        } else if (id2 != 2131427634) {
            return;
        }
        finish();
    }

    /* renamed from: s0 */
    public final void m16257s0() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132017376));
        int i11 = this.f18016f.getInt("pref.using_buffer_size", C5251a.f30037e0);
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = 1;
            } else if (i11 == 3) {
                i10 = 2;
            } else if (i11 == 4) {
                i10 = 3;
            } else if (i11 == 5) {
                i10 = 4;
            } else if (i11 == 10) {
                i10 = 5;
            } else if (i11 == 20) {
                i10 = 6;
            } else if (i11 == 30) {
                i10 = 7;
            } else if (i11 == 40) {
                i10 = 8;
            } else if (i11 == 50) {
                i10 = 9;
            } else if (i11 == 100) {
                i10 = 10;
            }
            aVar.m863k(new CharSequence[]{"1", "2", "3", "4", "5", "10", "20", "30", "40", "50", "100"}, i10, new DialogInterfaceOnClickListenerC2947j(this));
            DialogC0242a create = aVar.create();
            this.f18030t = create;
            create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2938a(this));
            this.f18030t.show();
        }
        i10 = 0;
        aVar.m863k(new CharSequence[]{"1", "2", "3", "4", "5", "10", "20", "30", "40", "50", "100"}, i10, new DialogInterfaceOnClickListenerC2947j(this));
        DialogC0242a create2 = aVar.create();
        this.f18030t = create2;
        create2.setOnDismissListener(new DialogInterfaceOnDismissListenerC2938a(this));
        this.f18030t.show();
    }

    /* renamed from: t0 */
    public final void m16258t0(int i10) {
        SharedPreferences.Editor editor = this.f18017g;
        if (editor != null) {
            editor.putInt("pref.using_buffer_size", i10);
            this.f18017g.apply();
        }
    }

    /* renamed from: u0 */
    public final void m16259u0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: v0 */
    public void m16260v0() {
        runOnUiThread(new RunnableC2940c(this));
    }

    /* renamed from: w0 */
    public final void m16261w0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, button));
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, button2));
        }
        RadioButton radioButton = this.rbNative;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, radioButton));
        }
        RadioButton radioButton2 = this.rbHardwareDecoder;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, radioButton2));
        }
        RadioButton radioButton3 = this.rbSoftwareDecoder;
        if (radioButton3 != null) {
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, radioButton3));
        }
        CheckBox checkBox = this.cbOpenSLES;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, checkBox));
        }
        CheckBox checkBox2 = this.cbOpenGL;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, checkBox2));
        }
        CheckBox checkBox3 = this.cbInfBuf;
        if (checkBox3 != null) {
            checkBox3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, checkBox3));
        }
        FrameLayout frameLayout = this.fl_buffer_size_limit;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2949l(this, frameLayout));
        }
    }

    /* renamed from: x0 */
    public final void m16262x0() {
        RadioButton radioButton;
        this.f18014d = this;
        this.f18019i = new LiveStreamDBHandler(this.f18014d);
        this.f18024n = getSharedPreferences("pref.using_opensl_es", 0);
        this.f18026p = getSharedPreferences("pref.using_opengl", 0);
        this.f18028r = getSharedPreferences("pref.using_infbuf", 0);
        this.f18015e = getSharedPreferences("pref.using_media_codec", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("pref.using_buffer_size", 0);
        this.f18016f = sharedPreferences;
        this.f18017g = sharedPreferences.edit();
        String string = this.f18024n.getString("pref.using_opensl_es", "");
        String string2 = this.f18026p.getString("pref.using_opengl", "");
        String string3 = this.f18015e.getString("pref.using_media_codec", C5251a.f30035d0);
        String string4 = this.f18028r.getString("pref.using_infbuf", "unchecked");
        int i10 = this.f18016f.getInt("pref.using_buffer_size", C5251a.f30037e0);
        if (string3.equals(getResources().getString(2132018167)) || string3.equals("Native")) {
            this.rbNative.setChecked(true);
            radioButton = this.rbNative;
        } else if (string3.equals(getResources().getString(2132017829)) || string3.equals("Hardware Decoder") || !(string3.equals(getResources().getString(2132018605)) || string3.equals("Software Decoder"))) {
            this.rbHardwareDecoder.setChecked(true);
            radioButton = this.rbHardwareDecoder;
        } else {
            this.rbSoftwareDecoder.setChecked(true);
            radioButton = this.rbSoftwareDecoder;
        }
        radioButton.requestFocus();
        if (string.equals("checked")) {
            this.cbOpenSLES.setChecked(true);
        }
        if (string2.equals("checked")) {
            this.cbOpenGL.setChecked(true);
        }
        if (string4.equals("checked")) {
            this.cbInfBuf.setChecked(true);
        }
        TextView textView = this.tv_buffer_size_limit;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }
}
