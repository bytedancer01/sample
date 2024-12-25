package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5858k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity.class */
public class LiveAllDataSingleActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: A */
    public ArrayList<FavouriteM3UModel> f17460A;

    /* renamed from: D */
    public SharedPreferences f17463D;

    /* renamed from: E */
    public SharedPreferences.Editor f17464E;

    /* renamed from: F */
    public Menu f17465F;

    /* renamed from: G */
    public MenuItem f17466G;

    /* renamed from: H */
    public SearchView f17467H;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f17474d;

    /* renamed from: e */
    public Animation f17475e;

    @BindView
    public EditText et_search_left_side;

    /* renamed from: f */
    public Animation f17476f;

    /* renamed from: g */
    public Animation f17477g;

    /* renamed from: h */
    public Animation f17478h;

    /* renamed from: i */
    public Animation f17479i;

    @BindView
    public ImageView iv_back_button_1;

    @BindView
    public ImageView iv_back_button_2;

    @BindView
    public ImageView iv_close_sidebar;

    @BindView
    public ImageView iv_hamburger_sidebar;

    /* renamed from: j */
    public GridLayoutManager f17480j;

    /* renamed from: k */
    public LinearLayoutManager f17481k;

    /* renamed from: l */
    public LiveAllDataRightSideAdapter f17482l;

    @BindView
    public LinearLayout ll_loader;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_series_data;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public C5858k f17483m;

    /* renamed from: n */
    public ArrayList<LiveStreamCategoryIdDBModel> f17484n;

    /* renamed from: o */
    public ArrayList<LiveStreamCategoryIdDBModel> f17485o;

    /* renamed from: p */
    public LiveStreamDBHandler f17486p;

    /* renamed from: q */
    public ArrayList<PasswordStatusDBModel> f17487q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f17488r;

    @BindView
    public RecyclerView recycler_view;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RelativeLayout rl_left;

    @BindView
    public RelativeLayout rl_right;

    @BindView
    public RelativeLayout rl_search_cat;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f17489s;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_main_cat_name;

    @BindView
    public TextView tv_no_record_found;

    /* renamed from: v */
    public DatabaseHandler f17492v;

    /* renamed from: w */
    public ArrayList<LiveStreamsDBModel> f17493w;

    /* renamed from: x */
    public ArrayList<LiveStreamsDBModel> f17494x;

    /* renamed from: y */
    public ArrayList<LiveStreamsDBModel> f17495y;

    /* renamed from: z */
    public ArrayList<FavouriteDBModel> f17496z;

    /* renamed from: t */
    public int f17490t = -1;

    /* renamed from: u */
    public ArrayList<String> f17491u = new ArrayList<>();

    /* renamed from: B */
    public ArrayList<LiveStreamsDBModel> f17461B = new ArrayList<>();

    /* renamed from: C */
    public ArrayList<LiveStreamsDBModel> f17462C = new ArrayList<>();

    /* renamed from: I */
    public String f17468I = "0";

    /* renamed from: J */
    public String f17469J = "0";

    /* renamed from: K */
    public int f17470K = -1;

    /* renamed from: L */
    public String f17471L = "";

    /* renamed from: M */
    public String f17472M = "0";

    /* renamed from: N */
    public String f17473N = "false";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$a.class */
    public class C2812a implements TextWatcher {

        /* renamed from: b */
        public final LiveAllDataSingleActivity f17497b;

        public C2812a(LiveAllDataSingleActivity liveAllDataSingleActivity) {
            this.f17497b = liveAllDataSingleActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.f17497b.f17483m != null) {
                this.f17497b.f17483m.getFilter().filter(charSequence.toString());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$b.class */
    public class DialogC2813b extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17498b;

        /* renamed from: c */
        public TextView f17499c;

        /* renamed from: d */
        public TextView f17500d;

        /* renamed from: e */
        public TextView f17501e;

        /* renamed from: f */
        public LinearLayout f17502f;

        /* renamed from: g */
        public LinearLayout f17503g;

        /* renamed from: h */
        public final LiveAllDataSingleActivity f17504h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final DialogC2813b f17505b;

            public a(DialogC2813b dialogC2813b) {
                this.f17505b = dialogC2813b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17505b.f17504h.m15938e1();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$b$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$b$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$b$b.class */
        public class b implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17506b;

            /* renamed from: c */
            public final DialogC2813b f17507c;

            public b(DialogC2813b dialogC2813b, View view) {
                this.f17507c = dialogC2813b;
                this.f17506b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17506b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17506b.getTag().equals("1")) {
                        View view3 = this.f17506b;
                        if (view3 == null || view3.getTag() == null || !this.f17506b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17507c.f17503g;
                    }
                    linearLayout = this.f17507c.f17502f;
                } else {
                    View view4 = this.f17506b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17506b.getTag().equals("1")) {
                        View view5 = this.f17506b;
                        if (view5 == null || view5.getTag() == null || !this.f17506b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17507c.f17503g;
                    }
                    linearLayout = this.f17507c.f17502f;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2813b(LiveAllDataSingleActivity liveAllDataSingleActivity, Activity activity) {
            super(activity);
            this.f17504h = liveAllDataSingleActivity;
            this.f17498b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    this.f17504h.f17486p.m15172J0();
                    this.f17504h.m15944k1();
                    new Handler().postDelayed(new a(this), 100L);
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C6783a(this.f17504h.f17474d).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
            this.f17499c = (TextView) findViewById(2131427681);
            this.f17500d = (TextView) findViewById(2131427653);
            this.f17502f = (LinearLayout) findViewById(2131428448);
            this.f17503g = (LinearLayout) findViewById(2131428541);
            TextView textView = (TextView) findViewById(2131429644);
            this.f17501e = textView;
            textView.setText(this.f17504h.getResources().getString(2132018828));
            this.f17499c.setOnClickListener(this);
            this.f17500d.setOnClickListener(this);
            TextView textView2 = this.f17499c;
            textView2.setOnFocusChangeListener(new b(this, textView2));
            TextView textView3 = this.f17500d;
            textView3.setOnFocusChangeListener(new b(this, textView3));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$c.class */
    public class C2814c implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final LiveAllDataSingleActivity f17508a;

        public C2814c(LiveAllDataSingleActivity liveAllDataSingleActivity) {
            this.f17508a = liveAllDataSingleActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            if (this.f17508a.f17482l == null) {
                return false;
            }
            this.f17508a.f17482l.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$d.class */
    public class DialogC2815d extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17509b;

        /* renamed from: c */
        public TextView f17510c;

        /* renamed from: d */
        public TextView f17511d;

        /* renamed from: e */
        public LinearLayout f17512e;

        /* renamed from: f */
        public LinearLayout f17513f;

        /* renamed from: g */
        public RadioGroup f17514g;

        /* renamed from: h */
        public final Activity f17515h;

        /* renamed from: i */
        public final LiveAllDataSingleActivity f17516i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$d$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17517b;

            /* renamed from: c */
            public final DialogC2815d f17518c;

            public a(DialogC2815d dialogC2815d, View view) {
                this.f17518c = dialogC2815d;
                this.f17517b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17517b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17517b.getTag().equals("1")) {
                        View view3 = this.f17517b;
                        if (view3 == null || view3.getTag() == null || !this.f17517b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17518c.f17513f;
                    }
                    linearLayout = this.f17518c.f17512e;
                } else {
                    View view4 = this.f17517b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17517b.getTag().equals("1")) {
                        View view5 = this.f17517b;
                        if (view5 == null || view5.getTag() == null || !this.f17517b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17518c.f17513f;
                    }
                    linearLayout = this.f17518c.f17512e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2815d(LiveAllDataSingleActivity liveAllDataSingleActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f17516i = liveAllDataSingleActivity;
            this.f17515h = activity2;
            this.f17509b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f17514g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f17515h.getResources().getString(2132018611))) {
                        str = "1";
                        if (this.f17516i.f17473N.equals("true")) {
                            str2 = "1";
                            SharepreferenceDBHandler.m15358V(str2, this.f17515h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f17515h);
                    } else if (radioButton.getText().toString().equals(this.f17515h.getResources().getString(2132018607))) {
                        str = "2";
                        if (this.f17516i.f17473N.equals("true")) {
                            str2 = "2";
                            SharepreferenceDBHandler.m15358V(str2, this.f17515h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f17515h);
                    } else if (radioButton.getText().toString().equals(this.f17515h.getResources().getString(2132018615))) {
                        str = "3";
                        if (this.f17516i.f17473N.equals("true")) {
                            str2 = "3";
                            SharepreferenceDBHandler.m15358V(str2, this.f17515h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f17515h);
                    } else if (radioButton.getText().toString().equals(this.f17515h.getResources().getString(2132018608))) {
                        str = "4";
                        if (this.f17516i.f17473N.equals("true")) {
                            str2 = "4";
                            SharepreferenceDBHandler.m15358V(str2, this.f17515h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f17515h);
                    } else if (radioButton.getText().toString().equals(this.f17515h.getResources().getString(2132018609))) {
                        str = "5";
                        if (this.f17516i.f17473N.equals("true")) {
                            str2 = "5";
                            SharepreferenceDBHandler.m15358V(str2, this.f17515h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f17515h);
                    } else {
                        str = "0";
                        if (this.f17516i.f17473N.equals("true")) {
                            str2 = "0";
                            SharepreferenceDBHandler.m15358V(str2, this.f17515h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f17515h);
                    }
                    LiveAllDataSingleActivity liveAllDataSingleActivity = this.f17516i;
                    liveAllDataSingleActivity.m15936c1(liveAllDataSingleActivity.f17468I, this.f17516i.f17469J);
                    dismiss();
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x01bb, code lost:
        
            if (r7.equals("1") == false) goto L8;
         */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCreate(android.os.Bundle r7) {
            /*
                Method dump skipped, instructions count: 587
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity.DialogC2815d.onCreate(android.os.Bundle):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$e.class */
    public class DialogInterfaceOnClickListenerC2816e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveAllDataSingleActivity f17519b;

        public DialogInterfaceOnClickListenerC2816e(LiveAllDataSingleActivity liveAllDataSingleActivity) {
            this.f17519b = liveAllDataSingleActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17519b.f17474d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$f.class */
    public class DialogInterfaceOnClickListenerC2817f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveAllDataSingleActivity f17520b;

        public DialogInterfaceOnClickListenerC2817f(LiveAllDataSingleActivity liveAllDataSingleActivity) {
            this.f17520b = liveAllDataSingleActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$g.class */
    public class AsyncTaskC2818g extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final LiveAllDataSingleActivity f17521a;

        public AsyncTaskC2818g(LiveAllDataSingleActivity liveAllDataSingleActivity) {
            this.f17521a = liveAllDataSingleActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            boolean z10 = false;
            String str = strArr[0];
            try {
                int hashCode = str.hashCode();
                if (hashCode == -74801864) {
                    if (str.equals("get_all")) {
                        z10 = true;
                    }
                    z10 = -1;
                } else if (hashCode != -74797390) {
                    if (hashCode == 1768729440 && str.equals("get_recently_watched")) {
                        z10 = 2;
                    }
                    z10 = -1;
                } else {
                    if (str.equals("get_fav")) {
                    }
                    z10 = -1;
                }
                if (!z10) {
                    return this.f17521a.m15921L0();
                }
                if (z10) {
                    return this.f17521a.m15919J0(strArr[1]);
                }
                if (z10 != 2) {
                    return null;
                }
                return this.f17521a.m15920K0();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f17521a.m15928T0();
            str.hashCode();
            switch (str) {
                case "get_all":
                    this.f17521a.m15950q0();
                    break;
                case "get_fav":
                    this.f17521a.m15917H0();
                    break;
                case "get_recent_watch":
                    this.f17521a.m15952r0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17521a.m15953r1();
            this.f17521a.m15925Q0();
            this.f17521a.m15927S0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$h.class */
    public class ViewOnFocusChangeListenerC2819h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17522b;

        /* renamed from: c */
        public final LiveAllDataSingleActivity f17523c;

        public ViewOnFocusChangeListenerC2819h(LiveAllDataSingleActivity liveAllDataSingleActivity, View view) {
            this.f17523c = liveAllDataSingleActivity;
            this.f17522b = view;
        }

        /* renamed from: a */
        public final void m15963a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17522b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m15964b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17522b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m15965c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17522b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            Resources resources;
            int i10;
            Drawable drawable;
            if (z10) {
                View view2 = this.f17522b;
                if (view2 == null || view2.getTag() == null || !this.f17522b.getTag().equals("1")) {
                    View view3 = this.f17522b;
                    if (view3 == null || view3.getTag() == null || !this.f17522b.getTag().equals("2")) {
                        View view4 = this.f17522b;
                        if (view4 == null || view4.getTag() == null || !this.f17522b.getTag().equals("3")) {
                            m15964b(1.15f);
                            m15965c(1.15f);
                            return;
                        }
                    } else {
                        resources = this.f17523c.getResources();
                        i10 = 2131099870;
                    }
                }
                drawable = this.f17523c.getResources().getDrawable(2131231459);
                view.setBackground(drawable);
            }
            if (z10) {
                return;
            }
            View view5 = this.f17522b;
            if (view5 == null || view5.getTag() == null || !this.f17522b.getTag().equals("1")) {
                View view6 = this.f17522b;
                if (view6 == null || view6.getTag() == null || !this.f17522b.getTag().equals("2")) {
                    View view7 = this.f17522b;
                    if (view7 == null || view7.getTag() == null || !this.f17522b.getTag().equals("3")) {
                        m15964b(1.0f);
                        m15965c(1.0f);
                        m15963a(z10);
                        return;
                    }
                } else {
                    resources = this.f17523c.getResources();
                    i10 = 2131099770;
                }
            }
            view.setBackgroundResource(0);
            return;
            drawable = resources.getDrawable(i10);
            view.setBackground(drawable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$i.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity$i.class */
    public class AsyncTaskC2820i extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final LiveAllDataSingleActivity f17524a;

        public AsyncTaskC2820i(LiveAllDataSingleActivity liveAllDataSingleActivity) {
            this.f17524a = liveAllDataSingleActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f17524a.m15934a1();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f17524a.m15947n1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: P0 */
    public static void m15906P0(Activity activity) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            View view = currentFocus;
            if (currentFocus == null) {
                view = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e10) {
        }
    }

    /* renamed from: E0 */
    public final void m15914E0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: F0 */
    public boolean m15915F0() {
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f17482l;
        if (liveAllDataRightSideAdapter != null) {
            return liveAllDataRightSideAdapter.m17131z0();
        }
        return false;
    }

    /* renamed from: G0 */
    public final void m15916G0() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText("");
            this.et_search_left_side.clearFocus();
        }
    }

    /* renamed from: H0 */
    public void m15917H0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f17461B;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.m14909b().m14918j(null);
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = new LiveAllDataRightSideAdapter(this.f17474d, "live", this.f17471L, this.f17472M);
                this.f17482l = liveAllDataRightSideAdapter;
                this.recycler_view.setAdapter(liveAllDataRightSideAdapter);
                m15951q1(getResources().getString(2132018201));
                return;
            }
            VodAllCategoriesSingleton.m14909b().m14918j(this.f17461B);
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = new LiveAllDataRightSideAdapter(this.f17474d, "live", this.f17471L, this.f17472M);
            this.f17482l = liveAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(liveAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f17480j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f17480j);
            m15949p1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: I0 */
    public final void m15918I0() {
        ImageView imageView = this.iv_close_sidebar;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2819h(this, imageView));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2819h(this, relativeLayout));
        ImageView imageView2 = this.iv_hamburger_sidebar;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2819h(this, imageView2));
    }

    /* renamed from: J0 */
    public String m15919J0(String str) {
        LiveStreamDBHandler liveStreamDBHandler;
        String str2;
        try {
            this.f17493w = new ArrayList<>();
            this.f17484n = new ArrayList<>();
            this.f17494x = new ArrayList<>();
            if (this.f17473N.equals("true")) {
                liveStreamDBHandler = this.f17486p;
                str2 = "radio_streams";
            } else {
                liveStreamDBHandler = this.f17486p;
                str2 = "live";
            }
            this.f17495y = liveStreamDBHandler.m15217f1(str, str2);
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: K0 */
    public String m15920K0() {
        try {
            this.f17493w = new ArrayList<>();
            this.f17484n = new ArrayList<>();
            this.f17494x = new ArrayList<>();
            this.f17495y = this.f17486p.m15241p1();
            return "get_recent_watch";
        } catch (Exception e10) {
            return "get_recent_watch";
        }
    }

    /* renamed from: L0 */
    public String m15921L0() {
        DatabaseHandler databaseHandler;
        Context context;
        try {
            String str = "live";
            if (SharepreferenceDBHandler.m15373f(this.f17474d).equals("m3u")) {
                new ArrayList();
                this.f17461B.clear();
                ArrayList<FavouriteM3UModel> m15175K1 = this.f17486p.m15175K1("live");
                if (this.f17491u != null) {
                    this.f17491u = m15922M0();
                }
                ArrayList<String> arrayList = this.f17491u;
                ArrayList<FavouriteM3UModel> arrayList2 = m15175K1;
                if (arrayList != null) {
                    arrayList2 = m15175K1;
                    if (arrayList.size() > 0) {
                        arrayList2 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList2 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList2 = m15924O0(m15175K1, this.f17491u);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList2.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f17486p.m15183O1(next.m14775a(), next.m14777c());
                    if (m15183O1 != null && m15183O1.size() > 0) {
                        this.f17461B.add(m15183O1.get(0));
                    }
                }
                return "get_fav";
            }
            new ArrayList();
            this.f17461B.clear();
            if (this.f17473N.equals("true")) {
                databaseHandler = this.f17492v;
                str = "radio_streams";
                context = this.f17474d;
            } else {
                databaseHandler = this.f17492v;
                context = this.f17474d;
            }
            ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v(str, SharepreferenceDBHandler.m15337A(context));
            if (this.f17491u != null) {
                this.f17491u = m15922M0();
            }
            ArrayList<String> arrayList3 = this.f17491u;
            ArrayList<FavouriteDBModel> arrayList4 = m15116v;
            if (arrayList3 != null) {
                arrayList4 = m15116v;
                if (arrayList3.size() > 0) {
                    arrayList4 = m15116v;
                    if (m15116v != null) {
                        arrayList4 = m15116v;
                        if (m15116v.size() > 0) {
                            arrayList4 = m15923N0(m15116v, this.f17491u);
                        }
                    }
                }
            }
            Iterator<FavouriteDBModel> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                FavouriteDBModel next2 = it2.next();
                LiveStreamsDBModel m15179M1 = this.f17486p.m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
                if (m15179M1 != null) {
                    this.f17461B.add(m15179M1);
                }
            }
            return "get_fav";
        } catch (Exception e10) {
            return "get_fav";
        }
    }

    /* renamed from: M0 */
    public final ArrayList<String> m15922M0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f17486p.m15232m1(SharepreferenceDBHandler.m15337A(this.f17474d));
        this.f17487q = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f17491u.add(next.m15291b());
                }
            }
        }
        return this.f17491u;
    }

    /* renamed from: N0 */
    public final ArrayList<FavouriteDBModel> m15923N0(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f17496z = new ArrayList<>();
        Iterator<FavouriteDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel next = it.next();
            Iterator<String> it2 = arrayList2.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                String next2 = it2.next();
                if (next.m14760a() != null && next.m14760a().equals(next2)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.f17496z.add(next);
            }
        }
        return this.f17496z;
    }

    /* renamed from: O0 */
    public final ArrayList<FavouriteM3UModel> m15924O0(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f17460A = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator<FavouriteM3UModel> it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel next = it.next();
                if (arrayList2 != null) {
                    Iterator<String> it2 = arrayList2.iterator();
                    while (true) {
                        z10 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (next.m14775a().equals(it2.next())) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        this.f17460A.add(next);
                    }
                }
            }
            return this.f17460A;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: Q0 */
    public void m15925Q0() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_series_data.setVisibility(8);
    }

    /* renamed from: R0 */
    public void m15926R0() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: S0 */
    public void m15927S0() {
        TextView textView = this.tv_no_record_found;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.tv_no_record_found.setVisibility(8);
    }

    /* renamed from: T0 */
    public void m15928T0() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_loader.setVisibility(8);
    }

    /* renamed from: V0 */
    public final void m15929V0() {
        if (this.rl_left.getVisibility() == 0) {
            m15906P0(this);
            this.rl_right.startAnimation(this.f17478h);
            this.rl_right.setVisibility(0);
            this.rl_left.startAnimation(this.f17476f);
            this.rl_left.setVisibility(8);
            this.iv_hamburger_sidebar.startAnimation(this.f17479i);
            this.iv_hamburger_sidebar.setVisibility(0);
            this.iv_back_button_2.setVisibility(0);
            this.iv_hamburger_sidebar.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f17474d, 7);
            this.f17480j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: W0 */
    public void m15930W0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: X0 */
    public final void m15931X0() {
        this.f17484n = new ArrayList<>();
        this.f17485o = new ArrayList<>();
        this.f17486p = new LiveStreamDBHandler(this.f17474d);
        this.f17487q = new ArrayList<>();
        this.f17489s = new ArrayList<>();
        this.f17488r = new ArrayList<>();
        this.f17481k = new LinearLayoutManager(this.f17474d);
        this.f17492v = new DatabaseHandler(this.f17474d);
        C5255e.m26246n(this.f17474d);
        this.f17495y = new ArrayList<>();
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.f17463D = sharedPreferences;
        this.f17464E = sharedPreferences.edit();
        String stringExtra = getIntent().getStringExtra("RADIO");
        this.f17473N = stringExtra;
        if (stringExtra == null) {
            this.f17473N = "false";
        }
        this.f17486p.m15184P0();
        m15918I0();
        m15956u1();
        m15940g1();
        m15941h1();
        m15935b1();
        C5255e.m26206I(this.f17474d);
    }

    /* renamed from: Y0 */
    public final boolean m15932Y0() {
        EditText editText = this.et_search_left_side;
        boolean z10 = false;
        if (editText != null) {
            z10 = false;
            if (editText.getText().toString().length() > 0) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: Z0 */
    public boolean m15933Z0() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00de A[Catch: Exception -> 0x01f7, NullPointerException -> 0x01fc, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x01fc, Exception -> 0x01f7, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x0010, B:7:0x0014, B:7:0x0014, B:8:0x0017, B:10:0x004e, B:12:0x005a, B:13:0x009b, B:15:0x00de, B:19:0x00f6, B:21:0x011b, B:22:0x01bc, B:23:0x0127, B:25:0x0136, B:29:0x0151, B:30:0x0179, B:34:0x0194, B:35:0x0067, B:37:0x0074, B:38:0x008d, B:39:0x01f1, B:39:0x01f1), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127 A[Catch: Exception -> 0x01f7, NullPointerException -> 0x01fc, TRY_ENTER, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x01fc, Exception -> 0x01f7, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x0010, B:7:0x0014, B:7:0x0014, B:8:0x0017, B:10:0x004e, B:12:0x005a, B:13:0x009b, B:15:0x00de, B:19:0x00f6, B:21:0x011b, B:22:0x01bc, B:23:0x0127, B:25:0x0136, B:29:0x0151, B:30:0x0179, B:34:0x0194, B:35:0x0067, B:37:0x0074, B:38:0x008d, B:39:0x01f1, B:39:0x01f1), top: B:1:0x0000 }] */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean m15934a1() {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity.m15934a1():java.lang.Boolean");
    }

    /* renamed from: b1 */
    public void m15935b1() {
        new AsyncTaskC2820i(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: Exception -> 0x0123, TRY_LEAVE, TryCatch #1 {Exception -> 0x0123, blocks: (B:11:0x0036, B:13:0x003c, B:15:0x0049, B:17:0x0056, B:20:0x0066, B:22:0x00a6, B:24:0x00b2, B:26:0x00bd, B:28:0x00c4, B:29:0x00e5, B:31:0x00fe, B:32:0x0108, B:33:0x0087), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108 A[Catch: Exception -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0123, blocks: (B:11:0x0036, B:13:0x003c, B:15:0x0049, B:17:0x0056, B:20:0x0066, B:22:0x00a6, B:24:0x00b2, B:26:0x00bd, B:28:0x00c4, B:29:0x00e5, B:31:0x00fe, B:32:0x0108, B:33:0x0087), top: B:10:0x0036 }] */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15936c1(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity.m15936c1(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d1 */
    public void m15937d1() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: e1 */
    public void m15938e1() {
        C5858k c5858k = this.f17483m;
        if (c5858k != null) {
            c5858k.m4099w();
        }
    }

    /* renamed from: f1 */
    public void m15939f1() {
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f17482l;
        if (liveAllDataRightSideAdapter != null) {
            liveAllDataRightSideAdapter.m4099w();
        }
    }

    /* renamed from: g1 */
    public final void m15940g1() {
        this.iv_close_sidebar.setOnClickListener(this);
        this.iv_hamburger_sidebar.setOnClickListener(this);
        this.logo.setOnClickListener(this);
        this.rl_search_cat.setOnClickListener(this);
        this.iv_back_button_1.setOnClickListener(this);
        this.iv_back_button_2.setOnClickListener(this);
    }

    /* renamed from: h1 */
    public final void m15941h1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new C2812a(this));
        }
    }

    /* renamed from: i1 */
    public void m15942i1() {
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f17482l;
        if (liveAllDataRightSideAdapter != null) {
            liveAllDataRightSideAdapter.m17126F0();
        }
    }

    /* renamed from: j1 */
    public void m15943j1() {
        C5255e.f30090n = new AsyncTaskC2818g(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    /* renamed from: k1 */
    public void m15944k1() {
        C5255e.f30090n = new AsyncTaskC2818g(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recently_watched", "-6");
    }

    /* renamed from: l1 */
    public final void m15945l1(String str) {
        this.f17472M = str;
        C5858k c5858k = this.f17483m;
        if (c5858k != null) {
            c5858k.m28558p0(str);
        }
    }

    /* renamed from: m1 */
    public void m15946m1(String str) {
        this.f17471L = str;
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: n1 */
    public final void m15947n1() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f17488r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f17489s;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = new ArrayList<>();
        this.f17489s = arrayList3;
        arrayList3.addAll(this.f17488r);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = this.f17488r;
        String str = "0";
        if (arrayList4 == null || arrayList4.size() < 4) {
            m15936c1("0", this.f17474d.getResources().getString(2132017297));
        } else {
            str = this.f17488r.get(3).m14787b();
            m15936c1(str, this.f17488r.get(3).m14788c());
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList5 = this.f17489s;
        if (arrayList5 != null && arrayList5.size() > 0) {
            VodAllCategoriesSingleton.m14909b().m14917i(this.f17489s);
        }
        C5858k c5858k = new C5858k(this.f17474d, this.f17473N, str);
        this.f17483m = c5858k;
        this.recycler_view_left_sidebar.setAdapter(c5858k);
        this.recycler_view_left_sidebar.setLayoutManager(this.f17481k);
    }

    /* renamed from: o1 */
    public final void m15948o1() {
        try {
            new DialogC2813b(this, this).show();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m15932Y0()) {
            m15916G0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131428146:
            case 2131428147:
                onBackPressed();
                break;
            case 2131428162:
                m15929V0();
                break;
            case 2131428184:
                this.f17470K = -1;
                m15954s1();
                break;
            case 2131428555:
                C5255e.m26224a(this.f17474d);
                break;
            case 2131429049:
                this.et_search_left_side.requestFocus();
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m15930W0();
        m15914E0();
        this.f17474d = this;
        setContentView(2131624051);
        ButterKnife.m5626a(this);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            m878n0(toolbar);
        }
        m15931X0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ArrayList<LiveStreamsDBModel> m14912d;
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            return true;
        }
        toolbar.m1224x(2131689499);
        SharedPreferences sharedPreferences = this.f17463D;
        if (sharedPreferences != null) {
            if (sharedPreferences.getInt("livestream", 1) == 1) {
                menu.getItem(1).getSubMenu().findItem(2131428257).setVisible(false);
                menu.getItem(1).getSubMenu().findItem(2131428253).setVisible(true);
            } else {
                menu.getItem(1).getSubMenu().findItem(2131428257).setVisible(true);
                menu.getItem(1).getSubMenu().findItem(2131428253).setVisible(false);
            }
        }
        this.f17465F = menu;
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (this.f17468I.equals("-5") || this.f17468I.equals("-4") || this.f17468I.equals("-6")) {
            this.f17465F.getItem(1).getSubMenu().findItem(2131428645).setVisible(false);
        } else {
            this.f17465F.getItem(1).getSubMenu().findItem(2131428645).setVisible(true);
        }
        if (!this.f17468I.equals("-6") || (m14912d = VodAllCategoriesSingleton.m14909b().m14912d()) == null || m14912d.size() <= 0) {
            this.f17465F.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
        } else {
            this.f17465F.getItem(1).getSubMenu().findItem(2131428757).setVisible(true);
        }
        boolean equals = SharepreferenceDBHandler.m15373f(this.f17474d).equals("m3u");
        MenuItem findItem = menu.getItem(1).getSubMenu().findItem(2131428638);
        if (equals) {
            findItem.setVisible(true);
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = C5255e.f30090n;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        C5255e.f30090n.cancel(true);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter;
        if (i10 != 21) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.rl_left.getVisibility() != 8 || (liveAllDataRightSideAdapter = this.f17482l) == null) {
            return false;
        }
        int m17121A0 = liveAllDataRightSideAdapter.m17121A0();
        this.f17470K = m17121A0;
        if (m17121A0 % 7 != 0) {
            return false;
        }
        m15954s1();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f17466G = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131427425) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f17467H = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(2132018514));
                    this.f17467H.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f17467H.findViewById(2131429120);
                    ((ImageView) this.f17467H.findViewById(2131429123)).setImageResource(2131231606);
                    imageView.setImageResource(2131231606);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f17467H.setOnQueryTextListener(new C2814c(this));
                    return true;
                }
            } catch (Exception e10) {
            }
        }
        if (itemId == 2131428645) {
            m15955t1(this);
        }
        if (itemId == 2131428257) {
            SharedPreferences.Editor editor = this.f17464E;
            if (editor != null) {
                editor.putInt("livestream", 1);
                this.f17464E.commit();
            }
            Menu menu = this.f17465F;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(2131428257).setVisible(false);
                this.f17465F.getItem(1).getSubMenu().findItem(2131428253).setVisible(true);
            }
            m15939f1();
        }
        if (itemId == 2131428253) {
            SharedPreferences.Editor editor2 = this.f17464E;
            if (editor2 != null) {
                editor2.putInt("livestream", 0);
                this.f17464E.commit();
            }
            Menu menu2 = this.f17465F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(2131428257).setVisible(true);
                this.f17465F.getItem(1).getSubMenu().findItem(2131428253).setVisible(false);
            }
            m15939f1();
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17474d.getResources().getString(2132017514));
            aVar.m857e(this.f17474d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17474d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2816e(this));
            aVar.m858f(this.f17474d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2817f(this));
            aVar.m865m();
        }
        if (itemId == 2131428757 && VodAllCategoriesSingleton.m14909b().m14912d() != null && VodAllCategoriesSingleton.m14909b().m14912d().size() > 0) {
            m15948o1();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m15930W0();
        super.onResume();
        m15938e1();
        if (this.f17468I.equals("-4")) {
            m15943j1();
        } else {
            m15939f1();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m15930W0();
    }

    /* renamed from: p1 */
    public void m15949p1() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_series_data.setVisibility(0);
    }

    /* renamed from: q0 */
    public void m15950q0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f17495y;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.m14909b().m14918j(null);
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = new LiveAllDataRightSideAdapter(this.f17474d, "live", this.f17471L, this.f17472M);
                this.f17482l = liveAllDataRightSideAdapter;
                this.recycler_view.setAdapter(liveAllDataRightSideAdapter);
                m15951q1(getResources().getString(2132018196));
                return;
            }
            VodAllCategoriesSingleton.m14909b().m14918j(this.f17495y);
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = new LiveAllDataRightSideAdapter(this.f17474d, "live", this.f17471L, this.f17472M);
            this.f17482l = liveAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(liveAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f17480j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f17480j);
            m15949p1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: q1 */
    public void m15951q1(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    /* renamed from: r0 */
    public final void m15952r0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f17495y;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.m14909b().m14918j(null);
                Menu menu = this.f17465F;
                if (menu != null) {
                    menu.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
                }
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = new LiveAllDataRightSideAdapter(this.f17474d, "live", this.f17471L, this.f17472M);
                this.f17482l = liveAllDataRightSideAdapter;
                this.recycler_view.setAdapter(liveAllDataRightSideAdapter);
                m15951q1(getResources().getString(2132018196));
                return;
            }
            VodAllCategoriesSingleton.m14909b().m14918j(this.f17495y);
            Menu menu2 = this.f17465F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(2131428757).setVisible(true);
            }
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = new LiveAllDataRightSideAdapter(this.f17474d, "live", this.f17471L, this.f17472M);
            this.f17482l = liveAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(liveAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f17480j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f17480j);
            m15949p1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: r1 */
    public final void m15953r1() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_loader.setVisibility(0);
    }

    /* renamed from: s1 */
    public final void m15954s1() {
        if (this.rl_left.getVisibility() == 8) {
            this.iv_hamburger_sidebar.setVisibility(8);
            this.iv_back_button_2.setVisibility(8);
            this.iv_close_sidebar.startAnimation(this.f17479i);
            this.iv_close_sidebar.setVisibility(0);
            this.iv_close_sidebar.requestFocus();
            this.rl_left.startAnimation(this.f17475e);
            this.rl_left.setVisibility(0);
            this.rl_right.startAnimation(this.f17477g);
            this.rl_right.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f17474d, 5);
            this.f17480j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
            if (this.f17482l != null) {
                this.recycler_view.mo2557n1(this.f17470K);
                this.f17470K = -1;
            }
        }
    }

    /* renamed from: t1 */
    public final void m15955t1(Activity activity) {
        new DialogC2815d(this, (LiveAllDataSingleActivity) activity, activity).show();
    }

    /* renamed from: u1 */
    public final void m15956u1() {
        this.f17475e = AnimationUtils.loadAnimation(this.f17474d, 2130771993);
        this.f17476f = AnimationUtils.loadAnimation(this.f17474d, 2130771994);
        this.f17477g = AnimationUtils.loadAnimation(this.f17474d, 2130772004);
        this.f17478h = AnimationUtils.loadAnimation(this.f17474d, 2130772002);
        this.f17479i = AnimationUtils.loadAnimation(this.f17474d, 2130771980);
    }
}
