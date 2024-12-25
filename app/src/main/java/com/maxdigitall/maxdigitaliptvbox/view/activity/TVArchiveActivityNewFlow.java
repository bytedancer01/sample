package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.List;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5859l;
import p203lf.C5871x;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow.class */
public class TVArchiveActivityNewFlow extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: L */
    public static ProgressBar f19023L;

    /* renamed from: A */
    public SharedPreferences.Editor f19024A;

    /* renamed from: C */
    public SearchView f19026C;

    /* renamed from: D */
    public Handler f19027D;

    /* renamed from: E */
    public MenuItem f19028E;

    /* renamed from: F */
    public Menu f19029F;

    /* renamed from: I */
    public List<Object> f19032I;

    /* renamed from: J */
    public Boolean f19033J;

    /* renamed from: K */
    public Boolean f19034K;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f19035d;

    /* renamed from: e */
    public SharedPreferences f19036e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public GridLayoutManager f19037f;

    @BindView
    public FrameLayout frameLayout;

    /* renamed from: g */
    public C5871x f19038g;

    @BindView
    public ImageView ivBTUP;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public LiveStreamDBHandler f19046o;

    /* renamed from: p */
    public ArrayList<PasswordStatusDBModel> f19047p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;

    /* renamed from: q */
    public ArrayList<LiveStreamCategoryIdDBModel> f19048q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f19049r;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f19050s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f19051t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f19052u;

    @BindView
    public ViewPager viewpager;

    /* renamed from: z */
    public SharedPreferences f19057z;

    /* renamed from: h */
    public boolean f19039h = false;

    /* renamed from: i */
    public int f19040i = -1;

    /* renamed from: j */
    public boolean f19041j = false;

    /* renamed from: k */
    public int f19042k = 1;

    /* renamed from: l */
    public int f19043l = 0;

    /* renamed from: m */
    public int f19044m = 20;

    /* renamed from: n */
    public ArrayList<String> f19045n = new ArrayList<>();

    /* renamed from: v */
    public String f19053v = "";

    /* renamed from: w */
    public String f19054w = "";

    /* renamed from: x */
    public DatabaseUpdatedStatusDBModel f19055x = new DatabaseUpdatedStatusDBModel();

    /* renamed from: y */
    public DatabaseUpdatedStatusDBModel f19056y = new DatabaseUpdatedStatusDBModel();

    /* renamed from: B */
    public ArrayList<LiveStreamCategoryIdDBModel> f19025B = new ArrayList<>();

    /* renamed from: G */
    public AsyncTask f19030G = null;

    /* renamed from: H */
    public ArrayList<NativeAd> f19031H = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$a.class */
    public class ViewOnClickListenerC3208a implements View.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19058b;

        public ViewOnClickListenerC3208a(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19058b = tVArchiveActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19058b.f19035d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$b.class */
    public class DialogC3209b extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f19059b;

        /* renamed from: c */
        public TextView f19060c;

        /* renamed from: d */
        public TextView f19061d;

        /* renamed from: e */
        public LinearLayout f19062e;

        /* renamed from: f */
        public LinearLayout f19063f;

        /* renamed from: g */
        public RadioGroup f19064g;

        /* renamed from: h */
        public final Activity f19065h;

        /* renamed from: i */
        public final TVArchiveActivityNewFlow f19066i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$b$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f19067b;

            /* renamed from: c */
            public final DialogC3209b f19068c;

            public a(DialogC3209b dialogC3209b, View view) {
                this.f19068c = dialogC3209b;
                this.f19067b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f19067b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f19067b.getTag().equals("1")) {
                        View view3 = this.f19067b;
                        if (view3 == null || view3.getTag() == null || !this.f19067b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f19068c.f19063f;
                    }
                    linearLayout = this.f19068c.f19062e;
                } else {
                    View view4 = this.f19067b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f19067b.getTag().equals("1")) {
                        View view5 = this.f19067b;
                        if (view5 == null || view5.getTag() == null || !this.f19067b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f19068c.f19063f;
                    }
                    linearLayout = this.f19068c.f19062e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3209b(TVArchiveActivityNewFlow tVArchiveActivityNewFlow, Activity activity, Activity activity2) {
            super(activity);
            this.f19066i = tVArchiveActivityNewFlow;
            this.f19065h = activity2;
            this.f19059b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f19064g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f19065h.getResources().getString(2132018607))) {
                        this.f19066i.f19024A.putString("sort", "1");
                        tVArchiveActivityNewFlow = this.f19066i;
                    } else if (radioButton.getText().toString().equals(this.f19065h.getResources().getString(2132018615))) {
                        this.f19066i.f19024A.putString("sort", "2");
                        tVArchiveActivityNewFlow = this.f19066i;
                    } else {
                        this.f19066i.f19024A.putString("sort", "0");
                        tVArchiveActivityNewFlow = this.f19066i;
                    }
                    tVArchiveActivityNewFlow.f19024A.commit();
                    this.f19066i.f19030G = new AsyncTaskC3219l(this.f19066i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    dismiss();
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(2131624326);
            this.f19060c = (TextView) findViewById(2131427681);
            this.f19061d = (TextView) findViewById(2131427653);
            this.f19061d = (TextView) findViewById(2131427653);
            this.f19062e = (LinearLayout) findViewById(2131428448);
            this.f19063f = (LinearLayout) findViewById(2131428541);
            this.f19064g = (RadioGroup) findViewById(2131428935);
            RadioButton radioButton = (RadioButton) findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) findViewById(2131428916);
            RadioButton radioButton5 = (RadioButton) findViewById(2131428898);
            RadioButton radioButton6 = (RadioButton) findViewById(2131428899);
            ((RadioButton) findViewById(2131428911)).setVisibility(8);
            radioButton5.setVisibility(8);
            radioButton6.setVisibility(8);
            radioButton2.setVisibility(8);
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3218k(this.f19066i, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3218k(this.f19066i, radioButton4));
            String string = this.f19066i.f19057z.getString("sort", "");
            string.hashCode();
            if (string.equals("1")) {
                radioButton3.setChecked(true);
            } else if (string.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            this.f19060c.setOnClickListener(this);
            this.f19061d.setOnClickListener(this);
            TextView textView = this.f19060c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f19061d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$c.class */
    public class ViewOnClickListenerC3210c implements View.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19069b;

        public ViewOnClickListenerC3210c(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19069b = tVArchiveActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19069b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$d.class */
    public class DialogInterfaceOnClickListenerC3211d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19070b;

        public DialogInterfaceOnClickListenerC3211d(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19070b = tVArchiveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$e.class */
    public class DialogInterfaceOnClickListenerC3212e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19071b;

        public DialogInterfaceOnClickListenerC3212e(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19071b = tVArchiveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19071b.f19035d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$f.class */
    public class C3213f implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final TVArchiveActivityNewFlow f19072a;

        public C3213f(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19072a = tVArchiveActivityNewFlow;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            C5251a.f30021T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            this.f19072a.tvNoRecordFound.setVisibility(8);
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow = this.f19072a;
            if (tVArchiveActivityNewFlow.f19038g == null || (textView = tVArchiveActivityNewFlow.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow2 = this.f19072a;
            tVArchiveActivityNewFlow2.f19038g.m28664p0(str, tVArchiveActivityNewFlow2.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$g.class */
    public class DialogInterfaceOnClickListenerC3214g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19073b;

        public DialogInterfaceOnClickListenerC3214g(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19073b = tVArchiveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19073b.f19035d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$h.class */
    public class DialogInterfaceOnClickListenerC3215h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19074b;

        public DialogInterfaceOnClickListenerC3215h(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19074b = tVArchiveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$i.class */
    public class DialogInterfaceOnClickListenerC3216i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19075b;

        public DialogInterfaceOnClickListenerC3216i(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19075b = tVArchiveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$j.class */
    public class DialogInterfaceOnClickListenerC3217j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityNewFlow f19076b;

        public DialogInterfaceOnClickListenerC3217j(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19076b = tVArchiveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$k.class */
    public class ViewOnFocusChangeListenerC3218k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19077b;

        /* renamed from: c */
        public final TVArchiveActivityNewFlow f19078c;

        public ViewOnFocusChangeListenerC3218k(TVArchiveActivityNewFlow tVArchiveActivityNewFlow, View view) {
            this.f19078c = tVArchiveActivityNewFlow;
            this.f19077b = view;
        }

        /* renamed from: a */
        public final void m16758a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19077b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16759b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19077b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16760c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19077b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16759b(1.15f);
                m16760c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16759b(1.0f);
                m16760c(1.0f);
                m16758a(z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$l.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityNewFlow$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow$l.class */
    public class AsyncTaskC3219l extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final TVArchiveActivityNewFlow f19079a;

        public AsyncTaskC3219l(TVArchiveActivityNewFlow tVArchiveActivityNewFlow) {
            this.f19079a = tVArchiveActivityNewFlow;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f19079a.m16755z0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f19079a.m16750A0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public TVArchiveActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f19033J = bool;
        this.f19034K = bool;
    }

    /* renamed from: A0 */
    public final void m16750A0() {
        if (this.f19050s != null) {
            this.f19038g = new C5871x(this.f19032I, this.f19035d);
            this.f19037f = new C6783a(this.f19035d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this.f19035d, 2) : new GridLayoutManager(this.f19035d, 2);
            this.myRecyclerView.setLayoutManager(this.f19037f);
            this.myRecyclerView.setItemAnimator(new C0704c());
            this.myRecyclerView.setAdapter(this.f19038g);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: B0 */
    public final void m16751B0(Activity activity) {
        new DialogC3209b(this, (TVArchiveActivityNewFlow) activity, activity).show();
    }

    /* renamed from: b */
    public void m16752b() {
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            return z10 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.myRecyclerView.setClickable(true);
        C5871x c5871x = this.f19038g;
        if (c5871x != null) {
            c5871x.m28667s0(f19023L);
            this.f19038g.m4099w();
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428153) {
            this.f19030G = new AsyncTaskC3219l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id2 != 2131429468) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f19035d = this;
        m16754x0();
        super.onCreate(bundle);
        setContentView(2131624076);
        ButterKnife.m5626a(this);
        C5251a.f30021T = Boolean.FALSE;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sortcatch", 0);
        this.f19057z = sharedPreferences;
        this.f19024A = sharedPreferences.edit();
        if (this.f19057z.getString("sort", "").equals("")) {
            this.f19024A.putString("sort", "0");
            this.f19024A.apply();
        }
        m16753w0();
        m878n0((Toolbar) findViewById(2131429320));
        Handler handler = new Handler();
        this.f19027D = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3208a(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3210c(this));
        this.f19030G = new AsyncTaskC3219l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.frameLayout.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689495);
        this.f19029F = menu;
        this.f19028E = menu.getItem(2).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f19035d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(2131428638).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        int i10 = 0;
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            i10 = 0;
        }
        while (i10 < this.toolbar.getChildCount()) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
            i10++;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f19029F;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f19028E = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f19035d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3212e(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3211d(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f19026C = searchView;
            searchView.setQueryHint(getResources().getString(2132018512));
            this.f19026C.setIconifiedByDefault(false);
            this.f19026C.setOnQueryTextListener(new C3213f(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19035d.getResources().getString(2132017514));
            aVar.m857e(this.f19035d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19035d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3214g(this));
            aVar.m858f(this.f19035d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3215h(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f19035d.getResources().getString(2132017514));
            aVar2.m857e(this.f19035d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f19035d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3216i(this));
            aVar2.m858f(this.f19035d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3217j(this));
            aVar2.m865m();
        }
        if (itemId == 2131428645) {
            m16751B0(this);
            m16752b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16754x0();
        super.onResume();
        C5255e.m26233f(this.f19035d);
        getWindow().setFlags(1024, 1024);
        this.frameLayout.setVisibility(8);
        C5871x c5871x = this.f19038g;
        if (c5871x != null) {
            c5871x.m28667s0(f19023L);
            this.f19038g.m4099w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19036e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19036e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f19035d != null) {
            m16752b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16754x0();
    }

    /* renamed from: w0 */
    public final void m16753w0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: x0 */
    public void m16754x0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: z0 */
    public final boolean m16755z0() {
        AsyncTask asyncTask;
        int i10;
        try {
            if (this.f19035d == null) {
                return true;
            }
            this.f19046o = new LiveStreamDBHandler(this.f19035d);
            this.f19047p = new ArrayList<>();
            this.f19048q = new ArrayList<>();
            this.f19049r = new ArrayList<>();
            this.f19050s = new ArrayList<>();
            this.f19051t = new ArrayList<>();
            this.f19052u = new ArrayList<>();
            this.f19032I = new ArrayList();
            this.f19051t = this.f19046o.m15263x1();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.m14792g("0");
            liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132017297));
            this.f19051t.add(0, liveStreamCategoryIdDBModel);
            this.f19050s = this.f19051t;
            if (!SharepreferenceDBHandler.m15373f(this.f19035d).equals("m3u")) {
                ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f19050s;
                if (arrayList != null && arrayList.size() > 0) {
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        int i13 = i12;
                        if (i11 >= this.f19050s.size() || ((asyncTask = this.f19030G) != null && asyncTask.isCancelled())) {
                            break;
                        }
                        if (this.f19050s.get(i11).m14787b().equals("0") || this.f19050s.get(i11).m14787b().equals("-1")) {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel2.m14794i(0);
                            liveStreamCategoryIdDBModel2.m14793h(this.f19050s.get(i11).m14788c());
                            liveStreamCategoryIdDBModel2.m14792g(this.f19050s.get(i11).m14787b());
                            this.f19052u.add(i13, liveStreamCategoryIdDBModel2);
                        } else {
                            ArrayList<LiveStreamsDBModel> m15212d1 = this.f19046o.m15212d1(this.f19050s.get(i11).m14787b());
                            i10 = i13;
                            if (m15212d1 != null) {
                                i10 = i13;
                                if (m15212d1.size() != 0) {
                                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                                    liveStreamCategoryIdDBModel3.m14794i(m15212d1.size());
                                    liveStreamCategoryIdDBModel3.m14793h(this.f19050s.get(i11).m14788c());
                                    liveStreamCategoryIdDBModel3.m14792g(this.f19050s.get(i11).m14787b());
                                    this.f19052u.add(i13, liveStreamCategoryIdDBModel3);
                                }
                            }
                            i11++;
                            i12 = i10;
                        }
                        i10 = i13 + 1;
                        i11++;
                        i12 = i10;
                    }
                }
                ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f19052u;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.f19050s = this.f19052u;
                }
            }
            if (this.f19050s == null) {
                return true;
            }
            for (int i14 = 0; i14 < this.f19050s.size(); i14++) {
                this.f19032I.add(new C5859l(this.f19050s.get(i14).m14788c(), this.f19050s.get(i14).m14787b(), this.f19050s.get(i14).m14786a(), this.f19050s.get(i14).m14789d(), this.f19050s.get(i14).m14790e()));
            }
            return true;
        } catch (NullPointerException | Exception e10) {
            return true;
        }
    }
}
