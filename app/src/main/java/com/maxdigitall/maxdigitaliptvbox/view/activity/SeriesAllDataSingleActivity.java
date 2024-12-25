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
import com.maxdigitall.maxdigitaliptvbox.model.SeriesAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5869v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity.class */
public class SeriesAllDataSingleActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: A */
    public ArrayList<FavouriteDBModel> f18412A;

    /* renamed from: B */
    public ArrayList<FavouriteM3UModel> f18413B;

    /* renamed from: E */
    public SharedPreferences f18416E;

    /* renamed from: F */
    public SharedPreferences.Editor f18417F;

    /* renamed from: G */
    public Menu f18418G;

    /* renamed from: H */
    public MenuItem f18419H;

    /* renamed from: I */
    public SearchView f18420I;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f18424d;

    /* renamed from: e */
    public Animation f18425e;

    @BindView
    public EditText et_search_left_side;

    /* renamed from: f */
    public Animation f18426f;

    /* renamed from: g */
    public Animation f18427g;

    /* renamed from: h */
    public Animation f18428h;

    /* renamed from: i */
    public Animation f18429i;

    @BindView
    public ImageView iv_back_button_1;

    @BindView
    public ImageView iv_back_button_2;

    @BindView
    public ImageView iv_close_sidebar;

    @BindView
    public ImageView iv_hamburger_sidebar;

    /* renamed from: j */
    public GridLayoutManager f18430j;

    /* renamed from: k */
    public LinearLayoutManager f18431k;

    /* renamed from: l */
    public SeriesAllDataRightSideAdapter f18432l;

    @BindView
    public LinearLayout ll_loader;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_series_data;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public C5869v f18433m;

    /* renamed from: n */
    public ArrayList<LiveStreamCategoryIdDBModel> f18434n;

    /* renamed from: o */
    public ArrayList<LiveStreamCategoryIdDBModel> f18435o;

    /* renamed from: p */
    public LiveStreamDBHandler f18436p;

    /* renamed from: q */
    public ArrayList<PasswordStatusDBModel> f18437q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f18438r;

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
    public ArrayList<LiveStreamCategoryIdDBModel> f18439s;

    /* renamed from: t */
    public SeriesRecentWatchDatabase f18440t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_main_cat_name;

    @BindView
    public TextView tv_no_record_found;

    /* renamed from: w */
    public DatabaseHandler f18443w;

    /* renamed from: x */
    public ArrayList<SeriesDBModel> f18444x;

    /* renamed from: y */
    public ArrayList<SeriesDBModel> f18445y;

    /* renamed from: z */
    public ArrayList<SeriesDBModel> f18446z;

    /* renamed from: u */
    public int f18441u = -1;

    /* renamed from: v */
    public ArrayList<String> f18442v = new ArrayList<>();

    /* renamed from: C */
    public ArrayList<SeriesDBModel> f18414C = new ArrayList<>();

    /* renamed from: D */
    public List<GetEpisdoeDetailsCallback> f18415D = new ArrayList();

    /* renamed from: J */
    public String f18421J = "0";

    /* renamed from: K */
    public String f18422K = "0";

    /* renamed from: L */
    public int f18423L = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$a.class */
    public class C3059a implements TextWatcher {

        /* renamed from: b */
        public final SeriesAllDataSingleActivity f18447b;

        public C3059a(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18447b = seriesAllDataSingleActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.f18447b.f18433m != null) {
                this.f18447b.f18433m.getFilter().filter(charSequence.toString());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$b.class */
    public class DialogC3060b extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f18448b;

        /* renamed from: c */
        public TextView f18449c;

        /* renamed from: d */
        public TextView f18450d;

        /* renamed from: e */
        public TextView f18451e;

        /* renamed from: f */
        public LinearLayout f18452f;

        /* renamed from: g */
        public LinearLayout f18453g;

        /* renamed from: h */
        public final SeriesAllDataSingleActivity f18454h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final DialogC3060b f18455b;

            public a(DialogC3060b dialogC3060b) {
                this.f18455b = dialogC3060b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18455b.f18454h.m16546e1();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$b$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$b$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$b$b.class */
        public class b implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f18456b;

            /* renamed from: c */
            public final DialogC3060b f18457c;

            public b(DialogC3060b dialogC3060b, View view) {
                this.f18457c = dialogC3060b;
                this.f18456b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f18456b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f18456b.getTag().equals("1")) {
                        View view3 = this.f18456b;
                        if (view3 == null || view3.getTag() == null || !this.f18456b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f18457c.f18453g;
                    }
                    linearLayout = this.f18457c.f18452f;
                } else {
                    View view4 = this.f18456b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f18456b.getTag().equals("1")) {
                        View view5 = this.f18456b;
                        if (view5 == null || view5.getTag() == null || !this.f18456b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f18457c.f18453g;
                    }
                    linearLayout = this.f18457c.f18452f;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3060b(SeriesAllDataSingleActivity seriesAllDataSingleActivity, Activity activity) {
            super(activity);
            this.f18454h = seriesAllDataSingleActivity;
            this.f18448b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    this.f18454h.f18440t.m15322C0();
                    this.f18454h.m16551j1();
                    new Handler().postDelayed(new a(this), 100L);
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C6783a(this.f18454h.f18424d).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
            this.f18449c = (TextView) findViewById(2131427681);
            this.f18450d = (TextView) findViewById(2131427653);
            this.f18452f = (LinearLayout) findViewById(2131428448);
            this.f18453g = (LinearLayout) findViewById(2131428541);
            TextView textView = (TextView) findViewById(2131429644);
            this.f18451e = textView;
            textView.setText(this.f18454h.getResources().getString(2132018830));
            this.f18449c.setOnClickListener(this);
            this.f18450d.setOnClickListener(this);
            TextView textView2 = this.f18449c;
            textView2.setOnFocusChangeListener(new b(this, textView2));
            TextView textView3 = this.f18450d;
            textView3.setOnFocusChangeListener(new b(this, textView3));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$c.class */
    public class C3061c implements Comparator<SeriesDBModel> {

        /* renamed from: b */
        public final SeriesAllDataSingleActivity f18458b;

        public C3061c(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18458b = seriesAllDataSingleActivity;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SeriesDBModel seriesDBModel, SeriesDBModel seriesDBModel2) {
            float f10;
            float f11 = 0.0f;
            try {
                f10 = Float.parseFloat(seriesDBModel2.m15049p());
            } catch (Exception e10) {
                f10 = 0.0f;
            }
            try {
                f11 = Float.parseFloat(seriesDBModel.m15049p());
            } catch (Exception e11) {
            }
            return Float.compare(f10, f11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$d.class */
    public class DialogC3062d extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f18459b;

        /* renamed from: c */
        public TextView f18460c;

        /* renamed from: d */
        public TextView f18461d;

        /* renamed from: e */
        public LinearLayout f18462e;

        /* renamed from: f */
        public LinearLayout f18463f;

        /* renamed from: g */
        public RadioGroup f18464g;

        /* renamed from: h */
        public final Activity f18465h;

        /* renamed from: i */
        public final SeriesAllDataSingleActivity f18466i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$d$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f18467b;

            /* renamed from: c */
            public final DialogC3062d f18468c;

            public a(DialogC3062d dialogC3062d, View view) {
                this.f18468c = dialogC3062d;
                this.f18467b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f18467b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f18467b.getTag().equals("1")) {
                        View view3 = this.f18467b;
                        if (view3 == null || view3.getTag() == null || !this.f18467b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f18468c.f18463f;
                    }
                    linearLayout = this.f18468c.f18462e;
                } else {
                    View view4 = this.f18467b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f18467b.getTag().equals("1")) {
                        View view5 = this.f18467b;
                        if (view5 == null || view5.getTag() == null || !this.f18467b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f18468c.f18463f;
                    }
                    linearLayout = this.f18468c.f18462e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3062d(SeriesAllDataSingleActivity seriesAllDataSingleActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f18466i = seriesAllDataSingleActivity;
            this.f18465h = activity2;
            this.f18459b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f18464g.getCheckedRadioButtonId());
                    SharepreferenceDBHandler.m15368c0(radioButton.getText().toString().equals(this.f18465h.getResources().getString(2132018611)) ? "1" : radioButton.getText().toString().equals(this.f18465h.getResources().getString(2132018607)) ? "2" : radioButton.getText().toString().equals(this.f18465h.getResources().getString(2132018615)) ? "3" : radioButton.getText().toString().equals(this.f18465h.getResources().getString(2132018614)) ? "6" : "0", this.f18465h);
                    SeriesAllDataSingleActivity seriesAllDataSingleActivity = this.f18466i;
                    seriesAllDataSingleActivity.m16544c1(seriesAllDataSingleActivity.f18421J, this.f18466i.f18422K);
                    dismiss();
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            RadioButton radioButton;
            RadioButton radioButton2;
            RadioButton radioButton3;
            RadioButton radioButton4;
            RadioButton radioButton5;
            super.onCreate(bundle);
            setContentView(new C6783a(this.f18465h).m31288z().equals(C5251a.f30065s0) ? 2131624327 : 2131624326);
            this.f18460c = (TextView) findViewById(2131427681);
            this.f18461d = (TextView) findViewById(2131427653);
            this.f18461d = (TextView) findViewById(2131427653);
            this.f18462e = (LinearLayout) findViewById(2131428448);
            this.f18463f = (LinearLayout) findViewById(2131428541);
            this.f18464g = (RadioGroup) findViewById(2131428935);
            radioButton = (RadioButton) findViewById(2131428909);
            radioButton2 = (RadioButton) findViewById(2131428903);
            radioButton3 = (RadioButton) findViewById(2131428897);
            radioButton4 = (RadioButton) findViewById(2131428916);
            RadioButton radioButton6 = (RadioButton) findViewById(2131428898);
            RadioButton radioButton7 = (RadioButton) findViewById(2131428899);
            radioButton5 = (RadioButton) findViewById(2131428911);
            radioButton6.setVisibility(8);
            radioButton7.setVisibility(8);
            String m15400w = SharepreferenceDBHandler.m15400w(this.f18465h);
            m15400w.hashCode();
            switch (m15400w) {
                case "1":
                    radioButton2.setChecked(true);
                    break;
                case "2":
                    radioButton3.setChecked(true);
                    break;
                case "3":
                    radioButton4.setChecked(true);
                    break;
                case "6":
                    radioButton5.setChecked(true);
                    break;
                default:
                    radioButton.setChecked(true);
                    break;
            }
            this.f18460c.setOnClickListener(this);
            this.f18461d.setOnClickListener(this);
            TextView textView = this.f18460c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f18461d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$e.class */
    public class C3063e implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final SeriesAllDataSingleActivity f18469a;

        public C3063e(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18469a = seriesAllDataSingleActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            if (this.f18469a.f18432l == null) {
                return false;
            }
            this.f18469a.f18432l.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$f.class */
    public class DialogInterfaceOnClickListenerC3064f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesAllDataSingleActivity f18470b;

        public DialogInterfaceOnClickListenerC3064f(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18470b = seriesAllDataSingleActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18470b.f18424d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$g.class */
    public class DialogInterfaceOnClickListenerC3065g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesAllDataSingleActivity f18471b;

        public DialogInterfaceOnClickListenerC3065g(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18471b = seriesAllDataSingleActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$h.class */
    public class AsyncTaskC3066h extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final SeriesAllDataSingleActivity f18472a;

        public AsyncTaskC3066h(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18472a = seriesAllDataSingleActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            boolean z10 = false;
            String str = strArr[0];
            try {
                switch (str.hashCode()) {
                    case -74801864:
                        if (str.equals("get_all")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -74797390:
                        if (str.equals("get_fav")) {
                            break;
                        }
                        z10 = -1;
                        break;
                    case 1976766565:
                        if (str.equals("get_recent_added")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 1997009972:
                        if (str.equals("get_recent_watch")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                if (!z10) {
                    return this.f18472a.m16528K0();
                }
                if (z10) {
                    return this.f18472a.m16527J0(strArr[1]);
                }
                if (z10 == 2) {
                    return this.f18472a.m16530M0();
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f18472a.m16531N0(strArr[1]);
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f18472a.m16536T0();
            str.hashCode();
            switch (str) {
                case "get_all":
                    this.f18472a.m16558q0();
                    break;
                case "get_fav":
                    this.f18472a.m16525H0();
                    break;
                case "get_recent_watch":
                    this.f18472a.m16560r0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f18472a.m16559q1();
            this.f18472a.m16537V0();
            this.f18472a.m16535S0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$i.class */
    public class ViewOnFocusChangeListenerC3067i implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18473b;

        /* renamed from: c */
        public final SeriesAllDataSingleActivity f18474c;

        public ViewOnFocusChangeListenerC3067i(SeriesAllDataSingleActivity seriesAllDataSingleActivity, View view) {
            this.f18474c = seriesAllDataSingleActivity;
            this.f18473b = view;
        }

        /* renamed from: a */
        public final void m16572a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18473b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16573b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18473b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16574c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18473b, "scaleY", f10);
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
                View view2 = this.f18473b;
                if (view2 == null || view2.getTag() == null || !this.f18473b.getTag().equals("1")) {
                    View view3 = this.f18473b;
                    if (view3 == null || view3.getTag() == null || !this.f18473b.getTag().equals("2")) {
                        View view4 = this.f18473b;
                        if (view4 == null || view4.getTag() == null || !this.f18473b.getTag().equals("3")) {
                            m16573b(1.15f);
                            m16574c(1.15f);
                            return;
                        }
                    } else {
                        resources = this.f18474c.getResources();
                        i10 = 2131099870;
                    }
                }
                drawable = this.f18474c.getResources().getDrawable(2131231459);
                view.setBackground(drawable);
            }
            if (z10) {
                return;
            }
            View view5 = this.f18473b;
            if (view5 == null || view5.getTag() == null || !this.f18473b.getTag().equals("1")) {
                View view6 = this.f18473b;
                if (view6 == null || view6.getTag() == null || !this.f18473b.getTag().equals("2")) {
                    View view7 = this.f18473b;
                    if (view7 == null || view7.getTag() == null || !this.f18473b.getTag().equals("3")) {
                        m16573b(1.0f);
                        m16574c(1.0f);
                        m16572a(z10);
                        return;
                    }
                } else {
                    resources = this.f18474c.getResources();
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity$j.class */
    public class AsyncTaskC3068j extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final SeriesAllDataSingleActivity f18475a;

        public AsyncTaskC3068j(SeriesAllDataSingleActivity seriesAllDataSingleActivity) {
            this.f18475a = seriesAllDataSingleActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f18475a.m16553l1();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f18475a.m16555n1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: Q0 */
    public static void m16514Q0(Activity activity) {
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
    public final void m16522E0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: F0 */
    public boolean m16523F0() {
        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f18432l;
        if (seriesAllDataRightSideAdapter != null) {
            return seriesAllDataRightSideAdapter.m17444N0();
        }
        return false;
    }

    /* renamed from: G0 */
    public final void m16524G0() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText("");
            this.et_search_left_side.clearFocus();
        }
    }

    /* renamed from: H0 */
    public void m16525H0() {
        try {
            ArrayList<SeriesDBModel> arrayList = this.f18414C;
            if (arrayList == null || arrayList.size() <= 0) {
                SeriesAllCategoriesSingleton.m14899b().m14905g(null);
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f18424d, "series");
                this.f18432l = seriesAllDataRightSideAdapter;
                this.recycler_view.setAdapter(seriesAllDataRightSideAdapter);
                m16557p1(getResources().getString(2132018204));
                return;
            }
            SeriesAllCategoriesSingleton.m14899b().m14905g(this.f18414C);
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = new SeriesAllDataRightSideAdapter(this.f18424d, "series");
            this.f18432l = seriesAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(seriesAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f18430j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f18430j);
            m16561r1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: I0 */
    public final void m16526I0() {
        ImageView imageView = this.iv_close_sidebar;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3067i(this, imageView));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3067i(this, relativeLayout));
        ImageView imageView2 = this.iv_hamburger_sidebar;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3067i(this, imageView2));
    }

    /* renamed from: J0 */
    public String m16527J0(String str) {
        try {
            this.f18444x = new ArrayList<>();
            this.f18434n = new ArrayList<>();
            this.f18445y = new ArrayList<>();
            this.f18446z = SharepreferenceDBHandler.m15373f(this.f18424d).equals("m3u") ? this.f18436p.m15261w1(str) : this.f18436p.m15258v1(str);
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: K0 */
    public String m16528K0() {
        try {
            if (SharepreferenceDBHandler.m15373f(this.f18424d).equals("m3u")) {
                new ArrayList();
                this.f18414C.clear();
                ArrayList<FavouriteM3UModel> m15175K1 = this.f18436p.m15175K1("series");
                if (this.f18442v != null) {
                    this.f18442v = m16529L0();
                }
                ArrayList<String> arrayList = this.f18442v;
                ArrayList<FavouriteM3UModel> arrayList2 = m15175K1;
                if (arrayList != null) {
                    arrayList2 = m15175K1;
                    if (arrayList.size() > 0) {
                        arrayList2 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList2 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList2 = m16533P0(m15175K1, this.f18442v);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList2.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    SeriesDBModel m15185P1 = this.f18436p.m15185P1(next.m14775a(), next.m14777c());
                    if (m15185P1 != null) {
                        this.f18414C.add(m15185P1);
                    }
                }
                return "get_fav";
            }
            new ArrayList();
            this.f18414C.clear();
            ArrayList<FavouriteDBModel> m15116v = this.f18443w.m15116v("series", SharepreferenceDBHandler.m15337A(this.f18424d));
            if (this.f18442v != null) {
                this.f18442v = m16529L0();
            }
            ArrayList<String> arrayList3 = this.f18442v;
            ArrayList<FavouriteDBModel> arrayList4 = m15116v;
            if (arrayList3 != null) {
                arrayList4 = m15116v;
                if (arrayList3.size() > 0) {
                    arrayList4 = m15116v;
                    if (m15116v != null) {
                        arrayList4 = m15116v;
                        if (m15116v.size() > 0) {
                            arrayList4 = m16532O0(m15116v, this.f18442v);
                        }
                    }
                }
            }
            Iterator<FavouriteDBModel> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SeriesDBModel m15201X1 = this.f18436p.m15201X1(String.valueOf(it2.next().m14764e()));
                if (m15201X1 != null) {
                    this.f18414C.add(m15201X1);
                }
            }
            if (!SharepreferenceDBHandler.m15400w(this.f18424d).equalsIgnoreCase("6")) {
                return "get_fav";
            }
            Collections.sort(this.f18414C, new C3061c(this));
            return "get_fav";
        } catch (Exception e10) {
            return "get_fav";
        }
    }

    /* renamed from: L0 */
    public final ArrayList<String> m16529L0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18436p.m15232m1(SharepreferenceDBHandler.m15337A(this.f18424d));
        this.f18437q = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18442v.add(next.m15291b());
                }
            }
        }
        return this.f18442v;
    }

    /* renamed from: M0 */
    public final String m16530M0() {
        boolean z10;
        this.f18442v = new ArrayList<>();
        new ArrayList();
        this.f18415D = new ArrayList();
        ArrayList<GetEpisdoeDetailsCallback> m15333v = this.f18440t.m15333v("getalldata", "1");
        if (this.f18436p.m15189R1(SharepreferenceDBHandler.m15337A(this.f18424d)) <= 0) {
            this.f18415D = m15333v;
            return "get_recent_watch";
        }
        this.f18442v = m16529L0();
        Iterator<GetEpisdoeDetailsCallback> it = m15333v.iterator();
        while (it.hasNext()) {
            GetEpisdoeDetailsCallback next = it.next();
            Iterator<String> it2 = this.f18442v.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                String next2 = it2.next();
                if (next.m14950b() != null && next.m14950b().equals(next2)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.f18415D.add(next);
            }
        }
        return "get_recent_watch";
    }

    /* renamed from: N0 */
    public String m16531N0(String str) {
        try {
            this.f18444x = new ArrayList<>();
            this.f18434n = new ArrayList<>();
            this.f18445y = new ArrayList<>();
            this.f18446z = this.f18436p.m15258v1(str);
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: O0 */
    public final ArrayList<FavouriteDBModel> m16532O0(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f18412A = new ArrayList<>();
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
                this.f18412A.add(next);
            }
        }
        return this.f18412A;
    }

    /* renamed from: P0 */
    public final ArrayList<FavouriteM3UModel> m16533P0(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f18413B = new ArrayList<>();
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
                        this.f18413B.add(next);
                    }
                }
            }
            return this.f18413B;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: R0 */
    public void m16534R0() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: S0 */
    public void m16535S0() {
        TextView textView = this.tv_no_record_found;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.tv_no_record_found.setVisibility(8);
    }

    /* renamed from: T0 */
    public void m16536T0() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_loader.setVisibility(8);
    }

    /* renamed from: V0 */
    public void m16537V0() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_series_data.setVisibility(8);
    }

    /* renamed from: W0 */
    public final void m16538W0() {
        if (this.rl_left.getVisibility() == 0) {
            m16514Q0(this);
            this.rl_right.startAnimation(this.f18428h);
            this.rl_right.setVisibility(0);
            this.rl_left.startAnimation(this.f18426f);
            this.rl_left.setVisibility(8);
            this.iv_hamburger_sidebar.startAnimation(this.f18429i);
            this.iv_hamburger_sidebar.setVisibility(0);
            if (!new C6783a(this.f18424d).m31288z().equals(C5251a.f30065s0)) {
                this.iv_back_button_2.setVisibility(0);
            }
            this.iv_hamburger_sidebar.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f18424d, 7);
            this.f18430j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: X0 */
    public void m16539X0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: Y0 */
    public final void m16540Y0() {
        this.f18434n = new ArrayList<>();
        this.f18435o = new ArrayList<>();
        this.f18436p = new LiveStreamDBHandler(this.f18424d);
        this.f18437q = new ArrayList<>();
        this.f18439s = new ArrayList<>();
        this.f18438r = new ArrayList<>();
        this.f18440t = new SeriesRecentWatchDatabase(this.f18424d);
        this.f18431k = new LinearLayoutManager(this.f18424d);
        this.f18443w = new DatabaseHandler(this.f18424d);
        this.f18446z = new ArrayList<>();
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.f18416E = sharedPreferences;
        this.f18417F = sharedPreferences.edit();
        C5255e.m26246n(this.f18424d);
        if (new C6783a(this.f18424d).m31288z().equals(C5251a.f30065s0)) {
            this.iv_back_button_1.setVisibility(8);
        }
        m16526I0();
        m16564u1();
        m16548g1();
        m16549h1();
        m16543b1();
    }

    /* renamed from: Z0 */
    public final boolean m16541Z0() {
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

    /* renamed from: a1 */
    public boolean m16542a1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    /* renamed from: b1 */
    public void m16543b1() {
        new AsyncTaskC3068j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #0 {Exception -> 0x0119, blocks: (B:11:0x0037, B:13:0x003d, B:15:0x004a, B:18:0x005a, B:20:0x009a, B:22:0x00a6, B:24:0x00b1, B:26:0x00ba, B:27:0x00db, B:29:0x00f4, B:30:0x00fe, B:31:0x007b), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe A[Catch: Exception -> 0x0119, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0119, blocks: (B:11:0x0037, B:13:0x003d, B:15:0x004a, B:18:0x005a, B:20:0x009a, B:22:0x00a6, B:24:0x00b1, B:26:0x00ba, B:27:0x00db, B:29:0x00f4, B:30:0x00fe, B:31:0x007b), top: B:10:0x0037 }] */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16544c1(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity.m16544c1(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d1 */
    public void m16545d1() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: e1 */
    public void m16546e1() {
        C5869v c5869v = this.f18433m;
        if (c5869v != null) {
            c5869v.m4099w();
        }
    }

    /* renamed from: f1 */
    public void m16547f1() {
        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f18432l;
        if (seriesAllDataRightSideAdapter != null) {
            seriesAllDataRightSideAdapter.m4099w();
        }
    }

    /* renamed from: g1 */
    public final void m16548g1() {
        this.iv_close_sidebar.setOnClickListener(this);
        this.iv_hamburger_sidebar.setOnClickListener(this);
        this.logo.setOnClickListener(this);
        this.rl_search_cat.setOnClickListener(this);
        this.iv_back_button_1.setOnClickListener(this);
        this.iv_back_button_2.setOnClickListener(this);
    }

    /* renamed from: h1 */
    public final void m16549h1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new C3059a(this));
        }
    }

    /* renamed from: i1 */
    public void m16550i1() {
        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f18432l;
        if (seriesAllDataRightSideAdapter != null) {
            seriesAllDataRightSideAdapter.m17453W0();
        }
    }

    /* renamed from: j1 */
    public void m16551j1() {
        C5255e.f30088l = new AsyncTaskC3066h(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    /* renamed from: k1 */
    public final void m16552k1(String str) {
        C5869v c5869v = this.f18433m;
        if (c5869v != null) {
            c5869v.m28649n0(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014c A[Catch: Exception -> 0x01c0, NullPointerException -> 0x01c5, TryCatch #2 {NullPointerException -> 0x01c5, Exception -> 0x01c0, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x0010, B:8:0x0015, B:10:0x009e, B:14:0x00b6, B:16:0x00dc, B:17:0x0128, B:19:0x014c, B:20:0x00e8, B:24:0x0100, B:25:0x01ba, B:25:0x01ba), top: B:1:0x0000 }] */
    /* renamed from: l1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean m16553l1() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity.m16553l1():java.lang.Boolean");
    }

    /* renamed from: m1 */
    public void m16554m1(String str) {
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: n1 */
    public final void m16555n1() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList;
        int i10;
        String string;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f18438r;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = this.f18439s;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = new ArrayList<>();
        this.f18439s = arrayList4;
        arrayList4.addAll(this.f18438r);
        String str = "0";
        if (SharepreferenceDBHandler.m15373f(this.f18424d).equals("m3u")) {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList5 = this.f18438r;
            if (arrayList5 != null && arrayList5.size() >= 3) {
                arrayList = this.f18438r;
                i10 = 2;
                str = arrayList.get(i10).m14787b();
                string = this.f18438r.get(i10).m14788c();
            }
            string = this.f18424d.getResources().getString(2132017297);
        } else {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList6 = this.f18438r;
            if (arrayList6 != null && arrayList6.size() >= 5) {
                arrayList = this.f18438r;
                i10 = 4;
                str = arrayList.get(i10).m14787b();
                string = this.f18438r.get(i10).m14788c();
            }
            string = this.f18424d.getResources().getString(2132017297);
        }
        m16544c1(str, string);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList7 = this.f18439s;
        if (arrayList7 != null && arrayList7.size() > 0) {
            SeriesAllCategoriesSingleton.m14899b().m14904f(this.f18439s);
        }
        C5869v c5869v = new C5869v(this.f18424d, str);
        this.f18433m = c5869v;
        this.recycler_view_left_sidebar.setAdapter(c5869v);
        this.recycler_view_left_sidebar.setLayoutManager(this.f18431k);
    }

    /* renamed from: o1 */
    public final void m16556o1() {
        try {
            new DialogC3060b(this, this).show();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m16541Z0()) {
            m16524G0();
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
                m16538W0();
                break;
            case 2131428184:
                this.f18423L = -1;
                m16562s1();
                break;
            case 2131428555:
                C5255e.m26224a(this.f18424d);
                break;
            case 2131429049:
                this.et_search_left_side.requestFocus();
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16539X0();
        m16522E0();
        this.f18424d = this;
        setContentView(2131624051);
        ButterKnife.m5626a(this);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            m878n0(toolbar);
        }
        m16540Y0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            return true;
        }
        toolbar.m1224x(2131689499);
        SharedPreferences sharedPreferences = this.f18416E;
        if (sharedPreferences != null) {
            if (sharedPreferences.getInt("series", 1) == 1) {
                menu.getItem(1).getSubMenu().findItem(2131428259).setVisible(false);
                menu.getItem(1).getSubMenu().findItem(2131428255).setVisible(true);
            } else {
                menu.getItem(1).getSubMenu().findItem(2131428259).setVisible(true);
                menu.getItem(1).getSubMenu().findItem(2131428255).setVisible(false);
            }
        }
        this.f18418G = menu;
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (this.f18421J.equals("-5") || this.f18421J.equals("-4")) {
            this.f18418G.getItem(1).getSubMenu().findItem(2131428645).setVisible(false);
        } else {
            this.f18418G.getItem(1).getSubMenu().findItem(2131428645).setVisible(true);
        }
        if (this.f18421J.equals("-4")) {
            this.f18418G.getItem(1).getSubMenu().findItem(2131428757).setVisible(true);
        }
        boolean equals = SharepreferenceDBHandler.m15373f(this.f18424d).equals("m3u");
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
        AsyncTask asyncTask = C5255e.f30088l;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        C5255e.f30088l.cancel(true);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter;
        if (i10 != 21) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.rl_left.getVisibility() != 8 || (seriesAllDataRightSideAdapter = this.f18432l) == null) {
            return false;
        }
        int m17446P0 = seriesAllDataRightSideAdapter.m17446P0();
        this.f18423L = m17446P0;
        if (m17446P0 % 7 != 0) {
            return false;
        }
        m16562s1();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f18419H = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131427425) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f18420I = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(2132018523));
                    this.f18420I.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f18420I.findViewById(2131429120);
                    ((ImageView) this.f18420I.findViewById(2131429123)).setImageResource(2131231606);
                    imageView.setImageResource(2131231606);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f18420I.setOnQueryTextListener(new C3063e(this));
                    return true;
                }
            } catch (Exception e10) {
            }
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18424d.getResources().getString(2132017514));
            aVar.m857e(this.f18424d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18424d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3064f(this));
            aVar.m858f(this.f18424d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3065g(this));
            aVar.m865m();
        }
        if (itemId == 2131428645) {
            m16563t1(this);
        }
        if (itemId == 2131428259) {
            SharedPreferences.Editor editor = this.f18417F;
            if (editor != null) {
                editor.putInt("series", 1);
                this.f18417F.commit();
            }
            Menu menu = this.f18418G;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(2131428259).setVisible(false);
                this.f18418G.getItem(1).getSubMenu().findItem(2131428255).setVisible(true);
            }
            m16547f1();
        }
        if (itemId == 2131428255) {
            SharedPreferences.Editor editor2 = this.f18417F;
            if (editor2 != null) {
                editor2.putInt("series", 0);
                this.f18417F.commit();
            }
            Menu menu2 = this.f18418G;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(2131428259).setVisible(true);
                this.f18418G.getItem(1).getSubMenu().findItem(2131428255).setVisible(false);
            }
            m16547f1();
        }
        if (itemId == 2131428757 && SeriesAllCategoriesSingleton.m14899b().m14900a() != null && SeriesAllCategoriesSingleton.m14899b().m14900a().size() > 0) {
            m16556o1();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16539X0();
        super.onResume();
        m16546e1();
        if (this.f18421J.equals("-4")) {
            m16551j1();
        } else {
            m16547f1();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16539X0();
    }

    /* renamed from: p1 */
    public void m16557p1(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    /* renamed from: q0 */
    public void m16558q0() {
        try {
            ArrayList<SeriesDBModel> arrayList = this.f18446z;
            if (arrayList == null || arrayList.size() <= 0) {
                SeriesAllCategoriesSingleton.m14899b().m14905g(null);
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f18424d, "series");
                this.f18432l = seriesAllDataRightSideAdapter;
                this.recycler_view.setAdapter(seriesAllDataRightSideAdapter);
                m16557p1(getResources().getString(2132018223));
                return;
            }
            SeriesAllCategoriesSingleton.m14899b().m14905g(this.f18446z);
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = new SeriesAllDataRightSideAdapter(this.f18424d, "series");
            this.f18432l = seriesAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(seriesAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f18430j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f18430j);
            m16561r1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: q1 */
    public final void m16559q1() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_loader.setVisibility(0);
    }

    /* renamed from: r0 */
    public final void m16560r0() {
        List<GetEpisdoeDetailsCallback> list = this.f18415D;
        if (list == null || list.size() <= 0) {
            SeriesAllCategoriesSingleton.m14899b().m14903e(null);
            Menu menu = this.f18418G;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
            }
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f18424d, "continue_watching");
            this.f18432l = seriesAllDataRightSideAdapter;
            this.recycler_view.setAdapter(seriesAllDataRightSideAdapter);
            m16557p1(getResources().getString(2132018224));
            return;
        }
        SeriesAllCategoriesSingleton.m14899b().m14903e(this.f18415D);
        if (this.f18418G != null) {
            List<GetEpisdoeDetailsCallback> list2 = this.f18415D;
            if (list2 == null || list2.size() <= 0) {
                this.f18418G.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
            } else {
                this.f18418G.getItem(1).getSubMenu().findItem(2131428757).setVisible(true);
            }
        }
        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = new SeriesAllDataRightSideAdapter(this.f18424d, "continue_watching");
        this.f18432l = seriesAllDataRightSideAdapter2;
        this.recycler_view.setAdapter(seriesAllDataRightSideAdapter2);
        RelativeLayout relativeLayout = this.rl_left;
        this.f18430j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
        this.recycler_view.setLayoutManager(this.f18430j);
        m16561r1();
    }

    /* renamed from: r1 */
    public void m16561r1() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_series_data.setVisibility(0);
    }

    /* renamed from: s1 */
    public final void m16562s1() {
        if (this.rl_left.getVisibility() == 8) {
            this.iv_hamburger_sidebar.setVisibility(8);
            if (!new C6783a(this.f18424d).m31288z().equals(C5251a.f30065s0)) {
                this.iv_back_button_2.setVisibility(8);
            }
            this.iv_close_sidebar.startAnimation(this.f18429i);
            this.iv_close_sidebar.setVisibility(0);
            this.iv_close_sidebar.requestFocus();
            this.rl_left.startAnimation(this.f18425e);
            this.rl_left.setVisibility(0);
            this.rl_right.startAnimation(this.f18427g);
            this.rl_right.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f18424d, 5);
            this.f18430j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
            if (this.f18432l != null) {
                this.recycler_view.mo2557n1(this.f18423L);
                this.f18423L = -1;
            }
        }
    }

    /* renamed from: t1 */
    public final void m16563t1(Activity activity) {
        try {
            new DialogC3062d(this, this, activity).show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: u1 */
    public final void m16564u1() {
        this.f18425e = AnimationUtils.loadAnimation(this.f18424d, 2130771993);
        this.f18426f = AnimationUtils.loadAnimation(this.f18424d, 2130771994);
        this.f18427g = AnimationUtils.loadAnimation(this.f18424d, 2130772004);
        this.f18428h = AnimationUtils.loadAnimation(this.f18424d, 2130772002);
        this.f18429i = AnimationUtils.loadAnimation(this.f18424d, 2130771980);
    }
}
