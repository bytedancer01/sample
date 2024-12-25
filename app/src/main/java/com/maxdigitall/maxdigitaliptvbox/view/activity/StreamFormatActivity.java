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
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity.class */
public class StreamFormatActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* renamed from: d */
    public Context f18922d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f18923e;

    /* renamed from: f */
    public SharedPreferences.Editor f18924f;

    /* renamed from: g */
    public LiveStreamDBHandler f18925g;

    /* renamed from: l */
    public C6783a f18930l;

    @BindView
    public ImageView logo;

    @BindView
    public RadioButton rbDefault;

    @BindView
    public RadioButton rbM3u8;

    @BindView
    public RadioButton rbTs;

    @BindView
    public RadioGroup rgRadio;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f18926h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: i */
    public DatabaseUpdatedStatusDBModel f18927i = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public String f18928j = "";

    /* renamed from: k */
    public String f18929k = "";

    /* renamed from: m */
    public Thread f18931m = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$a.class */
    public class ViewOnClickListenerC3176a implements View.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18932b;

        public ViewOnClickListenerC3176a(StreamFormatActivity streamFormatActivity) {
            this.f18932b = streamFormatActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18932b.f18922d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$b.class */
    public class RunnableC3177b implements Runnable {

        /* renamed from: b */
        public final StreamFormatActivity f18933b;

        public RunnableC3177b(StreamFormatActivity streamFormatActivity) {
            this.f18933b = streamFormatActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18933b.f18922d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18933b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18933b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$c.class */
    public class DialogInterfaceOnClickListenerC3178c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18934b;

        public DialogInterfaceOnClickListenerC3178c(StreamFormatActivity streamFormatActivity) {
            this.f18934b = streamFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$d.class */
    public class DialogInterfaceOnClickListenerC3179d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18935b;

        public DialogInterfaceOnClickListenerC3179d(StreamFormatActivity streamFormatActivity) {
            this.f18935b = streamFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18935b.f18922d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$e.class */
    public class DialogInterfaceOnClickListenerC3180e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18936b;

        public DialogInterfaceOnClickListenerC3180e(StreamFormatActivity streamFormatActivity) {
            this.f18936b = streamFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18936b.f18922d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$f.class */
    public class DialogInterfaceOnClickListenerC3181f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18937b;

        public DialogInterfaceOnClickListenerC3181f(StreamFormatActivity streamFormatActivity) {
            this.f18937b = streamFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$g.class */
    public class DialogInterfaceOnClickListenerC3182g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18938b;

        public DialogInterfaceOnClickListenerC3182g(StreamFormatActivity streamFormatActivity) {
            this.f18938b = streamFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$h.class */
    public class DialogInterfaceOnClickListenerC3183h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final StreamFormatActivity f18939b;

        public DialogInterfaceOnClickListenerC3183h(StreamFormatActivity streamFormatActivity) {
            this.f18939b = streamFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$i.class */
    public class RunnableC3184i implements Runnable {

        /* renamed from: b */
        public final StreamFormatActivity f18940b;

        public RunnableC3184i(StreamFormatActivity streamFormatActivity) {
            this.f18940b = streamFormatActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18940b.m16707s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity$j.class */
    public class ViewOnFocusChangeListenerC3185j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18941b;

        /* renamed from: c */
        public final StreamFormatActivity f18942c;

        public ViewOnFocusChangeListenerC3185j(StreamFormatActivity streamFormatActivity, View view) {
            this.f18942c = streamFormatActivity;
            this.f18941b = view;
        }

        /* renamed from: a */
        public final void m16710a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18941b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16711b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18941b, "scaleY", f10);
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
                m16710a(f10);
                m16711b(f10);
                View view4 = this.f18941b;
                if ((view4 == null || view4.getTag() == null || !this.f18941b.getTag().equals("1")) && ((view2 = this.f18941b) == null || view2.getTag() == null || !this.f18941b.getTag().equals("2"))) {
                    return;
                }
                this.f18941b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view5 = this.f18941b;
            if (view5 == null || view5.getTag() == null || !this.f18941b.getTag().equals("1")) {
                View view6 = this.f18941b;
                if (view6 == null || view6.getTag() == null || !this.f18941b.getTag().equals("2")) {
                    View view7 = this.f18941b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f18941b.setBackground(this.f18942c.getResources().getDrawable(2131231814));
                    return;
                }
                m16710a(f10);
                m16711b(f10);
                view3 = this.f18941b;
                i10 = 2131231576;
            } else {
                m16710a(f10);
                m16711b(f10);
                view3 = this.f18941b;
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
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18922d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18922d);
        this.f18930l = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624068 : 2131624067);
        ButterKnife.m5626a(this);
        m16708t0();
        m16706r0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m16709u0();
        Thread thread = this.f18931m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3184i(this));
            this.f18931m = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3176a(this));
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
        if (itemId == 2131427416 && (context = this.f18922d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3179d(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3178c(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18922d.getResources().getString(2132017514));
            aVar.m857e(this.f18922d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18922d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3180e(this));
            aVar.m858f(this.f18922d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3181f(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18922d.getResources().getString(2132017514));
            aVar2.m857e(this.f18922d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18922d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3182g(this));
            aVar2.m858f(this.f18922d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3183h(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18931m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18931m.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f18931m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3184i(this));
            this.f18931m = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f18922d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18923e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18923e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        SharedPreferences.Editor editor;
        String str;
        int id2 = view.getId();
        if (id2 == 2131427620) {
            RadioButton radioButton = (RadioButton) findViewById(this.rgRadio.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("allowedFormat", 0);
            this.f18923e = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f18924f = edit;
            if (edit == null) {
                Toast.makeText(this, getResources().getString(2132018337), 0).show();
                return;
            }
            if (radioButton.getText().toString().equals(getResources().getString(2132017835))) {
                editor = this.f18924f;
                str = "m3u8";
            } else if (radioButton.getText().toString().equals(getResources().getString(2132018082))) {
                editor = this.f18924f;
                str = "ts";
            } else {
                editor = this.f18924f;
                str = CookieSpecs.DEFAULT;
            }
            editor.putString("allowedFormat", str);
            this.f18924f.commit();
            Toast.makeText(this, getResources().getString(2132018338), 0).show();
        } else if (id2 != 2131427634) {
            return;
        }
        finish();
    }

    /* renamed from: r0 */
    public final void m16706r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m16707s0() {
        runOnUiThread(new RunnableC3177b(this));
    }

    /* renamed from: t0 */
    public final void m16708t0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3185j(this, button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3185j(this, button2));
        }
        RadioButton radioButton = this.rbM3u8;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3185j(this, radioButton));
        }
        RadioButton radioButton2 = this.rbTs;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3185j(this, radioButton2));
        }
        RadioButton radioButton3 = this.rbDefault;
        if (radioButton3 != null) {
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3185j(this, radioButton3));
        }
    }

    /* renamed from: u0 */
    public final void m16709u0() {
        RadioButton radioButton;
        this.f18922d = this;
        this.f18925g = new LiveStreamDBHandler(this.f18922d);
        SharedPreferences sharedPreferences = getSharedPreferences("allowedFormat", 0);
        this.f18923e = sharedPreferences;
        String string = sharedPreferences.getString("allowedFormat", "");
        if (string.equals("m3u8")) {
            this.rbM3u8.setChecked(true);
            radioButton = this.rbM3u8;
        } else if (string.equals("ts")) {
            this.rbTs.setChecked(true);
            radioButton = this.rbTs;
        } else {
            this.rbDefault.setChecked(true);
            radioButton = this.rbDefault;
        }
        radioButton.requestFocus();
    }
}
