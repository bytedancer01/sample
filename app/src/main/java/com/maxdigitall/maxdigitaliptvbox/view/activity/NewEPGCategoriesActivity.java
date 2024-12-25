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
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5855h;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity.class */
public class NewEPGCategoriesActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: N */
    public static ProgressBar f17842N;

    /* renamed from: B */
    public SearchView f17844B;

    /* renamed from: C */
    public SharedPreferences f17845C;

    /* renamed from: D */
    public SharedPreferences.Editor f17846D;

    /* renamed from: F */
    public MenuItem f17848F;

    /* renamed from: G */
    public Menu f17849G;

    /* renamed from: J */
    public List<Object> f17852J;

    /* renamed from: K */
    public Boolean f17853K;

    /* renamed from: L */
    public Boolean f17854L;

    /* renamed from: M */
    public C6783a f17855M;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f17856d;

    /* renamed from: e */
    public SharedPreferences f17857e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public Handler f17858f;

    @BindView
    public FrameLayout frameLayout;

    /* renamed from: g */
    public GridLayoutManager f17859g;

    /* renamed from: h */
    public C5855h f17860h;

    @BindView
    public ImageView ivBTUP;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: p */
    public LiveStreamDBHandler f17868p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;

    /* renamed from: q */
    public ArrayList<PasswordStatusDBModel> f17869q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f17870r;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f17871s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f17872t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f17873u;

    /* renamed from: v */
    public ArrayList<LiveStreamCategoryIdDBModel> f17874v;

    @BindView
    public ViewPager viewpager;

    /* renamed from: i */
    public boolean f17861i = false;

    /* renamed from: j */
    public int f17862j = -1;

    /* renamed from: k */
    public boolean f17863k = false;

    /* renamed from: l */
    public int f17864l = 1;

    /* renamed from: m */
    public int f17865m = 0;

    /* renamed from: n */
    public int f17866n = 20;

    /* renamed from: o */
    public ArrayList<String> f17867o = new ArrayList<>();

    /* renamed from: w */
    public String f17875w = "";

    /* renamed from: x */
    public String f17876x = "";

    /* renamed from: y */
    public DatabaseUpdatedStatusDBModel f17877y = new DatabaseUpdatedStatusDBModel();

    /* renamed from: z */
    public DatabaseUpdatedStatusDBModel f17878z = new DatabaseUpdatedStatusDBModel();

    /* renamed from: A */
    public ArrayList<LiveStreamCategoryIdDBModel> f17843A = new ArrayList<>();

    /* renamed from: E */
    public int f17847E = -1;

    /* renamed from: H */
    public AsyncTask f17850H = null;

    /* renamed from: I */
    public ArrayList<NativeAd> f17851I = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$a.class */
    public class ViewOnClickListenerC2887a implements View.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17879b;

        public ViewOnClickListenerC2887a(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17879b = newEPGCategoriesActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17879b.f17856d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$b.class */
    public class DialogC2888b extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17880b;

        /* renamed from: c */
        public TextView f17881c;

        /* renamed from: d */
        public TextView f17882d;

        /* renamed from: e */
        public LinearLayout f17883e;

        /* renamed from: f */
        public LinearLayout f17884f;

        /* renamed from: g */
        public RadioGroup f17885g;

        /* renamed from: h */
        public final Activity f17886h;

        /* renamed from: i */
        public final NewEPGCategoriesActivity f17887i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$b$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17888b;

            /* renamed from: c */
            public final DialogC2888b f17889c;

            public a(DialogC2888b dialogC2888b, View view) {
                this.f17889c = dialogC2888b;
                this.f17888b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17888b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17888b.getTag().equals("1")) {
                        View view3 = this.f17888b;
                        if (view3 == null || view3.getTag() == null || !this.f17888b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17889c.f17884f;
                    }
                    linearLayout = this.f17889c.f17883e;
                } else {
                    View view4 = this.f17888b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17888b.getTag().equals("1")) {
                        View view5 = this.f17888b;
                        if (view5 == null || view5.getTag() == null || !this.f17888b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17889c.f17884f;
                    }
                    linearLayout = this.f17889c.f17883e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2888b(NewEPGCategoriesActivity newEPGCategoriesActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f17887i = newEPGCategoriesActivity;
            this.f17886h = activity2;
            this.f17880b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGCategoriesActivity newEPGCategoriesActivity;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f17885g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f17886h.getResources().getString(2132018607))) {
                        this.f17887i.f17846D.putString("sort", "1");
                        newEPGCategoriesActivity = this.f17887i;
                    } else if (radioButton.getText().toString().equals(this.f17886h.getResources().getString(2132018615))) {
                        this.f17887i.f17846D.putString("sort", "2");
                        newEPGCategoriesActivity = this.f17887i;
                    } else {
                        this.f17887i.f17846D.putString("sort", "0");
                        newEPGCategoriesActivity = this.f17887i;
                    }
                    newEPGCategoriesActivity.f17846D.commit();
                    this.f17887i.f17850H = new AsyncTaskC2897k(this.f17887i).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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
            this.f17881c = (TextView) findViewById(2131427681);
            this.f17882d = (TextView) findViewById(2131427653);
            this.f17882d = (TextView) findViewById(2131427653);
            this.f17883e = (LinearLayout) findViewById(2131428448);
            this.f17884f = (LinearLayout) findViewById(2131428541);
            this.f17885g = (RadioGroup) findViewById(2131428935);
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
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2898l(this.f17887i, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2898l(this.f17887i, radioButton4));
            String string = this.f17887i.f17845C.getString("sort", "");
            string.hashCode();
            if (string.equals("1")) {
                radioButton3.setChecked(true);
            } else if (string.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            this.f17881c.setOnClickListener(this);
            this.f17882d.setOnClickListener(this);
            TextView textView = this.f17881c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f17882d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$c.class */
    public class ViewOnClickListenerC2889c implements View.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17890b;

        public ViewOnClickListenerC2889c(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17890b = newEPGCategoriesActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17890b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$d.class */
    public class DialogInterfaceOnClickListenerC2890d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17891b;

        public DialogInterfaceOnClickListenerC2890d(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17891b = newEPGCategoriesActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$e.class */
    public class DialogInterfaceOnClickListenerC2891e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17892b;

        public DialogInterfaceOnClickListenerC2891e(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17892b = newEPGCategoriesActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f17892b.f17856d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$f.class */
    public class C2892f implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final NewEPGCategoriesActivity f17893a;

        public C2892f(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17893a = newEPGCategoriesActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            C5251a.f30021T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            this.f17893a.tvNoRecordFound.setVisibility(8);
            NewEPGCategoriesActivity newEPGCategoriesActivity = this.f17893a;
            if (newEPGCategoriesActivity.f17860h == null || (textView = newEPGCategoriesActivity.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            NewEPGCategoriesActivity newEPGCategoriesActivity2 = this.f17893a;
            newEPGCategoriesActivity2.f17860h.m28501r0(str, newEPGCategoriesActivity2.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$g.class */
    public class DialogInterfaceOnClickListenerC2893g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17894b;

        public DialogInterfaceOnClickListenerC2893g(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17894b = newEPGCategoriesActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17894b.f17856d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$h.class */
    public class DialogInterfaceOnClickListenerC2894h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17895b;

        public DialogInterfaceOnClickListenerC2894h(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17895b = newEPGCategoriesActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$i.class */
    public class DialogInterfaceOnClickListenerC2895i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17896b;

        public DialogInterfaceOnClickListenerC2895i(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17896b = newEPGCategoriesActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$j.class */
    public class DialogInterfaceOnClickListenerC2896j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NewEPGCategoriesActivity f17897b;

        public DialogInterfaceOnClickListenerC2896j(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17897b = newEPGCategoriesActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$k.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$k.class */
    public class AsyncTaskC2897k extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final NewEPGCategoriesActivity f17898a;

        public AsyncTaskC2897k(NewEPGCategoriesActivity newEPGCategoriesActivity) {
            this.f17898a = newEPGCategoriesActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f17898a.m16186B0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f17898a.m16187C0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity$l.class */
    public class ViewOnFocusChangeListenerC2898l implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17899b;

        /* renamed from: c */
        public final NewEPGCategoriesActivity f17900c;

        public ViewOnFocusChangeListenerC2898l(NewEPGCategoriesActivity newEPGCategoriesActivity, View view) {
            this.f17900c = newEPGCategoriesActivity;
            this.f17899b = view;
        }

        /* renamed from: a */
        public final void m16197a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17899b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16198b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17899b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16199c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17899b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16198b(1.15f);
                m16199c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16198b(1.0f);
                m16199c(1.0f);
                m16197a(z10);
            }
        }
    }

    public NewEPGCategoriesActivity() {
        Boolean bool = Boolean.FALSE;
        this.f17853K = bool;
        this.f17854L = bool;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A0 */
    public void m16185A0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x02d2, code lost:
    
        if (r0.size() > 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m16186B0() {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGCategoriesActivity.m16186B0():boolean");
    }

    /* renamed from: C0 */
    public final void m16187C0() {
        List<Object> list;
        if (this.f17872t == null || (list = this.f17852J) == null) {
            return;
        }
        this.f17860h = new C5855h(this.f17856d, list);
        this.f17859g = new C6783a(this.f17856d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this.f17856d, 2) : new GridLayoutManager(this.f17856d, 2);
        this.myRecyclerView.setLayoutManager(this.f17859g);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.myRecyclerView.setAdapter(this.f17860h);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: D0 */
    public final void m16188D0(Activity activity) {
        new DialogC2888b(this, (NewEPGCategoriesActivity) activity, activity).show();
    }

    /* renamed from: b */
    public void m16189b() {
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
        C5855h c5855h = this.f17860h;
        if (c5855h != null) {
            c5855h.m28505v0(f17842N);
            this.f17860h.m4099w();
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428153) {
            this.f17850H = new AsyncTaskC2897k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id2 != 2131429468) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17856d = this;
        super.onCreate(bundle);
        m16185A0();
        setContentView(2131623983);
        ButterKnife.m5626a(this);
        C5251a.f30021T = Boolean.FALSE;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        m16190w0();
        m878n0((Toolbar) findViewById(2131429320));
        this.f17855M = new C6783a(this.f17856d);
        this.f17868p = new LiveStreamDBHandler(this.f17856d);
        SharedPreferences sharedPreferences = getSharedPreferences("sortepg", 0);
        this.f17845C = sharedPreferences;
        this.f17846D = sharedPreferences.edit();
        if (this.f17845C.getString("sort", "").equals("")) {
            this.f17846D.putString("sort", "0");
            this.f17846D.commit();
        }
        Handler handler = new Handler();
        this.f17858f = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f17850H = new AsyncTaskC2897k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.frameLayout.setVisibility(8);
        this.logo.setOnClickListener(new ViewOnClickListenerC2887a(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC2889c(this));
        C5255e.m26206I(this.f17856d);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689495);
        this.f17849G = menu;
        this.f17848F = menu.getItem(2).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f17856d).equals("api")) {
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

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f17850H;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f17850H.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f17849G;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f17848F = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f17856d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2891e(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2890d(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f17844B = searchView;
            searchView.setQueryHint(getResources().getString(2132018515));
            this.f17844B.setIconifiedByDefault(false);
            this.f17844B.setOnQueryTextListener(new C2892f(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17856d.getResources().getString(2132017514));
            aVar.m857e(this.f17856d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17856d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2893g(this));
            aVar.m858f(this.f17856d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2894h(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f17856d.getResources().getString(2132017514));
            aVar2.m857e(this.f17856d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f17856d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2895i(this));
            aVar2.m858f(this.f17856d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2896j(this));
            aVar2.m865m();
        }
        if (itemId == 2131428645) {
            m16188D0(this);
            m16189b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16185A0();
        super.onResume();
        C5255e.m26233f(this.f17856d);
        getWindow().setFlags(1024, 1024);
        this.frameLayout.setVisibility(8);
        C5855h c5855h = this.f17860h;
        if (c5855h != null) {
            c5855h.m28505v0(f17842N);
            this.f17860h.m4099w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17857e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17857e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f17856d != null) {
            m16189b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16185A0();
    }

    /* renamed from: w0 */
    public final void m16190w0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: x0 */
    public final ArrayList<String> m16191x0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f17868p.m15232m1(SharepreferenceDBHandler.m15337A(this.f17856d));
        this.f17869q = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f17867o.add(next.m15291b());
                }
            }
        }
        return this.f17867o;
    }

    /* renamed from: z0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m16192z0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3;
        if (arrayList == null) {
            return null;
        }
        Iterator<LiveStreamCategoryIdDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel next = it.next();
            if (arrayList2 != null) {
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14787b().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10 && (arrayList3 = this.f17870r) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f17870r;
    }
}
