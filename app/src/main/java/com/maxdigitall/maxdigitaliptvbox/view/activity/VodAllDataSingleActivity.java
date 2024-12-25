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
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5848a0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity.class */
public class VodAllDataSingleActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: A */
    public ArrayList<FavouriteDBModel> f19546A;

    /* renamed from: B */
    public ArrayList<FavouriteM3UModel> f19547B;

    /* renamed from: E */
    public SharedPreferences f19550E;

    /* renamed from: F */
    public SharedPreferences.Editor f19551F;

    /* renamed from: G */
    public Menu f19552G;

    /* renamed from: H */
    public MenuItem f19553H;

    /* renamed from: I */
    public SearchView f19554I;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f19558d;

    /* renamed from: e */
    public Animation f19559e;

    @BindView
    public EditText et_search_left_side;

    /* renamed from: f */
    public Animation f19560f;

    /* renamed from: g */
    public Animation f19561g;

    /* renamed from: h */
    public Animation f19562h;

    /* renamed from: i */
    public Animation f19563i;

    @BindView
    public ImageView iv_back_button_1;

    @BindView
    public ImageView iv_back_button_2;

    @BindView
    public ImageView iv_close_sidebar;

    @BindView
    public ImageView iv_hamburger_sidebar;

    /* renamed from: j */
    public GridLayoutManager f19564j;

    /* renamed from: k */
    public LinearLayoutManager f19565k;

    /* renamed from: l */
    public VodAllDataRightSideAdapter f19566l;

    @BindView
    public LinearLayout ll_loader;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_series_data;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public C5848a0 f19567m;

    /* renamed from: n */
    public RecentWatchDBHandler f19568n;

    /* renamed from: o */
    public ArrayList<LiveStreamCategoryIdDBModel> f19569o;

    /* renamed from: p */
    public ArrayList<LiveStreamCategoryIdDBModel> f19570p;

    /* renamed from: q */
    public LiveStreamDBHandler f19571q;

    /* renamed from: r */
    public ArrayList<PasswordStatusDBModel> f19572r;

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
    public ArrayList<LiveStreamCategoryIdDBModel> f19573s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f19574t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_main_cat_name;

    @BindView
    public TextView tv_no_record_found;

    /* renamed from: w */
    public DatabaseHandler f19577w;

    /* renamed from: x */
    public ArrayList<LiveStreamsDBModel> f19578x;

    /* renamed from: y */
    public ArrayList<LiveStreamsDBModel> f19579y;

    /* renamed from: z */
    public ArrayList<LiveStreamsDBModel> f19580z;

    /* renamed from: u */
    public int f19575u = -1;

    /* renamed from: v */
    public ArrayList<String> f19576v = new ArrayList<>();

    /* renamed from: C */
    public ArrayList<LiveStreamsDBModel> f19548C = new ArrayList<>();

    /* renamed from: D */
    public ArrayList<LiveStreamsDBModel> f19549D = new ArrayList<>();

    /* renamed from: J */
    public String f19555J = "0";

    /* renamed from: K */
    public String f19556K = "0";

    /* renamed from: L */
    public int f19557L = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$a.class */
    public class C3347a implements TextWatcher {

        /* renamed from: b */
        public final VodAllDataSingleActivity f19581b;

        public C3347a(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19581b = vodAllDataSingleActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (this.f19581b.f19567m != null) {
                this.f19581b.f19567m.getFilter().filter(charSequence.toString());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$b.class */
    public class DialogC3348b extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f19582b;

        /* renamed from: c */
        public TextView f19583c;

        /* renamed from: d */
        public TextView f19584d;

        /* renamed from: e */
        public TextView f19585e;

        /* renamed from: f */
        public LinearLayout f19586f;

        /* renamed from: g */
        public LinearLayout f19587g;

        /* renamed from: h */
        public final VodAllDataSingleActivity f19588h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final DialogC3348b f19589b;

            public a(DialogC3348b dialogC3348b) {
                this.f19589b = dialogC3348b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19589b.f19588h.m17007e1();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$b$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$b$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$b$b.class */
        public class b implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f19590b;

            /* renamed from: c */
            public final DialogC3348b f19591c;

            public b(DialogC3348b dialogC3348b, View view) {
                this.f19591c = dialogC3348b;
                this.f19590b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f19590b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f19590b.getTag().equals("1")) {
                        View view3 = this.f19590b;
                        if (view3 == null || view3.getTag() == null || !this.f19590b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f19591c.f19587g;
                    }
                    linearLayout = this.f19591c.f19586f;
                } else {
                    View view4 = this.f19590b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f19590b.getTag().equals("1")) {
                        View view5 = this.f19590b;
                        if (view5 == null || view5.getTag() == null || !this.f19590b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f19591c.f19587g;
                    }
                    linearLayout = this.f19591c.f19586f;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3348b(VodAllDataSingleActivity vodAllDataSingleActivity, Activity activity) {
            super(activity);
            this.f19588h = vodAllDataSingleActivity;
            this.f19582b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    this.f19588h.f19568n.m15304E0();
                    this.f19588h.m17012j1();
                    new Handler().postDelayed(new a(this), 100L);
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C6783a(this.f19588h.f19558d).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
            this.f19583c = (TextView) findViewById(2131427681);
            this.f19584d = (TextView) findViewById(2131427653);
            this.f19586f = (LinearLayout) findViewById(2131428448);
            this.f19587g = (LinearLayout) findViewById(2131428541);
            TextView textView = (TextView) findViewById(2131429644);
            this.f19585e = textView;
            textView.setText(this.f19588h.getResources().getString(2132018829));
            this.f19583c.setOnClickListener(this);
            this.f19584d.setOnClickListener(this);
            TextView textView2 = this.f19583c;
            textView2.setOnFocusChangeListener(new b(this, textView2));
            TextView textView3 = this.f19584d;
            textView3.setOnFocusChangeListener(new b(this, textView3));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$c.class */
    public class C3349c implements Comparator<LiveStreamsDBModel> {

        /* renamed from: b */
        public final VodAllDataSingleActivity f19592b;

        public C3349c(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19592b = vodAllDataSingleActivity;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamsDBModel liveStreamsDBModel, LiveStreamsDBModel liveStreamsDBModel2) {
            float f10;
            float f11 = 0.0f;
            try {
                f10 = Float.parseFloat(liveStreamsDBModel2.m14808O());
            } catch (Exception e10) {
                f10 = 0.0f;
            }
            try {
                f11 = Float.parseFloat(liveStreamsDBModel.m14808O());
            } catch (Exception e11) {
            }
            return Float.compare(f10, f11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$d.class */
    public class DialogC3350d extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f19593b;

        /* renamed from: c */
        public TextView f19594c;

        /* renamed from: d */
        public TextView f19595d;

        /* renamed from: e */
        public LinearLayout f19596e;

        /* renamed from: f */
        public LinearLayout f19597f;

        /* renamed from: g */
        public RadioGroup f19598g;

        /* renamed from: h */
        public final Activity f19599h;

        /* renamed from: i */
        public final VodAllDataSingleActivity f19600i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$d$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f19601b;

            /* renamed from: c */
            public final DialogC3350d f19602c;

            public a(DialogC3350d dialogC3350d, View view) {
                this.f19602c = dialogC3350d;
                this.f19601b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f19601b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f19601b.getTag().equals("1")) {
                        View view3 = this.f19601b;
                        if (view3 == null || view3.getTag() == null || !this.f19601b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f19602c.f19597f;
                    }
                    linearLayout = this.f19602c.f19596e;
                } else {
                    View view4 = this.f19601b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f19601b.getTag().equals("1")) {
                        View view5 = this.f19601b;
                        if (view5 == null || view5.getTag() == null || !this.f19601b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f19602c.f19597f;
                    }
                    linearLayout = this.f19602c.f19596e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3350d(VodAllDataSingleActivity vodAllDataSingleActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f19600i = vodAllDataSingleActivity;
            this.f19599h = activity2;
            this.f19593b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f19598g.getCheckedRadioButtonId());
                    SharepreferenceDBHandler.m15384k0(radioButton.getText().toString().equals(this.f19599h.getResources().getString(2132018611)) ? "1" : radioButton.getText().toString().equals(this.f19599h.getResources().getString(2132018607)) ? "2" : radioButton.getText().toString().equals(this.f19599h.getResources().getString(2132018615)) ? "3" : radioButton.getText().toString().equals(this.f19599h.getResources().getString(2132018614)) ? "6" : "0", this.f19599h);
                    VodAllDataSingleActivity vodAllDataSingleActivity = this.f19600i;
                    vodAllDataSingleActivity.m17005c1(vodAllDataSingleActivity.f19555J, this.f19600i.f19556K);
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
            setContentView(new C6783a(this.f19599h).m31288z().equals(C5251a.f30065s0) ? 2131624327 : 2131624326);
            this.f19594c = (TextView) findViewById(2131427681);
            this.f19595d = (TextView) findViewById(2131427653);
            this.f19595d = (TextView) findViewById(2131427653);
            this.f19596e = (LinearLayout) findViewById(2131428448);
            this.f19597f = (LinearLayout) findViewById(2131428541);
            this.f19598g = (RadioGroup) findViewById(2131428935);
            radioButton = (RadioButton) findViewById(2131428909);
            radioButton2 = (RadioButton) findViewById(2131428903);
            radioButton3 = (RadioButton) findViewById(2131428897);
            radioButton4 = (RadioButton) findViewById(2131428916);
            RadioButton radioButton6 = (RadioButton) findViewById(2131428898);
            RadioButton radioButton7 = (RadioButton) findViewById(2131428899);
            radioButton5 = (RadioButton) findViewById(2131428911);
            radioButton6.setVisibility(8);
            radioButton7.setVisibility(8);
            String m15342F = SharepreferenceDBHandler.m15342F(this.f19599h);
            m15342F.hashCode();
            switch (m15342F) {
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
            this.f19594c.setOnClickListener(this);
            this.f19595d.setOnClickListener(this);
            TextView textView = this.f19594c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f19595d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$e.class */
    public class C3351e implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodAllDataSingleActivity f19603a;

        public C3351e(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19603a = vodAllDataSingleActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            if (this.f19603a.f19566l == null) {
                return false;
            }
            this.f19603a.f19566l.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$f.class */
    public class DialogInterfaceOnClickListenerC3352f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodAllDataSingleActivity f19604b;

        public DialogInterfaceOnClickListenerC3352f(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19604b = vodAllDataSingleActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19604b.f19558d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$g.class */
    public class DialogInterfaceOnClickListenerC3353g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodAllDataSingleActivity f19605b;

        public DialogInterfaceOnClickListenerC3353g(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19605b = vodAllDataSingleActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$h.class */
    public class AsyncTaskC3354h extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final VodAllDataSingleActivity f19606a;

        public AsyncTaskC3354h(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19606a = vodAllDataSingleActivity;
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
                    return this.f19606a.m16989K0();
                }
                if (z10) {
                    return this.f19606a.m16988J0(strArr[1]);
                }
                if (z10 == 2) {
                    return this.f19606a.m16991M0();
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f19606a.m16992N0(strArr[1]);
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f19606a.m16997T0();
            str.hashCode();
            switch (str) {
                case "get_all":
                    this.f19606a.m17019q0();
                    break;
                case "get_fav":
                    this.f19606a.m16986H0();
                    break;
                case "get_recent_watch":
                    this.f19606a.m17021r0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f19606a.m17018p1();
            this.f19606a.m17000X0();
            this.f19606a.m16996S0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$i.class */
    public class ViewOnFocusChangeListenerC3355i implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19607b;

        /* renamed from: c */
        public final VodAllDataSingleActivity f19608c;

        public ViewOnFocusChangeListenerC3355i(VodAllDataSingleActivity vodAllDataSingleActivity, View view) {
            this.f19608c = vodAllDataSingleActivity;
            this.f19607b = view;
        }

        /* renamed from: a */
        public final void m17033a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19607b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17034b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19607b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17035c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19607b, "scaleY", f10);
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
                View view2 = this.f19607b;
                if (view2 == null || view2.getTag() == null || !this.f19607b.getTag().equals("1")) {
                    View view3 = this.f19607b;
                    if (view3 == null || view3.getTag() == null || !this.f19607b.getTag().equals("2")) {
                        View view4 = this.f19607b;
                        if (view4 == null || view4.getTag() == null || !this.f19607b.getTag().equals("3")) {
                            m17034b(1.15f);
                            m17035c(1.15f);
                            return;
                        }
                    } else {
                        resources = this.f19608c.getResources();
                        i10 = 2131099870;
                    }
                }
                drawable = this.f19608c.getResources().getDrawable(2131231459);
                view.setBackground(drawable);
            }
            if (z10) {
                return;
            }
            View view5 = this.f19607b;
            if (view5 == null || view5.getTag() == null || !this.f19607b.getTag().equals("1")) {
                View view6 = this.f19607b;
                if (view6 == null || view6.getTag() == null || !this.f19607b.getTag().equals("2")) {
                    View view7 = this.f19607b;
                    if (view7 == null || view7.getTag() == null || !this.f19607b.getTag().equals("3")) {
                        m17034b(1.0f);
                        m17035c(1.0f);
                        m17033a(z10);
                        return;
                    }
                } else {
                    resources = this.f19608c.getResources();
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity$j.class */
    public class AsyncTaskC3356j extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final VodAllDataSingleActivity f19609a;

        public AsyncTaskC3356j(VodAllDataSingleActivity vodAllDataSingleActivity) {
            this.f19609a = vodAllDataSingleActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f19609a.m17025u1();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f19609a.m17015m1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: Q0 */
    public static void m16975Q0(Activity activity) {
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
    public final void m16983E0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: F0 */
    public boolean m16984F0() {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f19566l;
        if (vodAllDataRightSideAdapter != null) {
            return vodAllDataRightSideAdapter.m17593F0();
        }
        return false;
    }

    /* renamed from: G0 */
    public final void m16985G0() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText("");
            this.et_search_left_side.clearFocus();
        }
    }

    /* renamed from: H0 */
    public void m16986H0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f19548C;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.m14909b().m14921m(null);
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f19558d, "vod");
                this.f19566l = vodAllDataRightSideAdapter;
                this.recycler_view.setAdapter(vodAllDataRightSideAdapter);
                m17017o1(getResources().getString(2132018203));
                return;
            }
            VodAllCategoriesSingleton.m14909b().m14921m(this.f19548C);
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = new VodAllDataRightSideAdapter(this.f19558d, "vod");
            this.f19566l = vodAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(vodAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f19564j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f19564j);
            m17023s1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: I0 */
    public final void m16987I0() {
        ImageView imageView = this.iv_close_sidebar;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3355i(this, imageView));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3355i(this, relativeLayout));
        ImageView imageView2 = this.iv_hamburger_sidebar;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3355i(this, imageView2));
    }

    /* renamed from: J0 */
    public String m16988J0(String str) {
        try {
            this.f19578x = new ArrayList<>();
            this.f19569o = new ArrayList<>();
            this.f19579y = new ArrayList<>();
            this.f19580z = this.f19571q.m15217f1(str, "movie");
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: K0 */
    public String m16989K0() {
        try {
            if (SharepreferenceDBHandler.m15373f(this.f19558d).equals("m3u")) {
                new ArrayList();
                this.f19548C.clear();
                ArrayList<FavouriteM3UModel> m15175K1 = this.f19571q.m15175K1("movie");
                if (this.f19576v != null) {
                    this.f19576v = m16990L0();
                }
                ArrayList<String> arrayList = this.f19576v;
                ArrayList<FavouriteM3UModel> arrayList2 = m15175K1;
                if (arrayList != null) {
                    arrayList2 = m15175K1;
                    if (arrayList.size() > 0) {
                        arrayList2 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList2 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList2 = m16994P0(m15175K1, this.f19576v);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList2.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f19571q.m15183O1(next.m14775a(), next.m14777c());
                    if (m15183O1 != null && m15183O1.size() > 0) {
                        this.f19548C.add(m15183O1.get(0));
                    }
                }
                return "get_fav";
            }
            new ArrayList();
            this.f19548C.clear();
            ArrayList<FavouriteDBModel> m15116v = this.f19577w.m15116v("vod", SharepreferenceDBHandler.m15337A(this.f19558d));
            if (this.f19576v != null) {
                this.f19576v = m16990L0();
            }
            ArrayList<String> arrayList3 = this.f19576v;
            ArrayList<FavouriteDBModel> arrayList4 = m15116v;
            if (arrayList3 != null) {
                arrayList4 = m15116v;
                if (arrayList3.size() > 0) {
                    arrayList4 = m15116v;
                    if (m15116v != null) {
                        arrayList4 = m15116v;
                        if (m15116v.size() > 0) {
                            arrayList4 = m16993O0(m15116v, this.f19576v);
                        }
                    }
                }
            }
            Iterator<FavouriteDBModel> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                FavouriteDBModel next2 = it2.next();
                LiveStreamsDBModel m15179M1 = this.f19571q.m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
                if (m15179M1 != null) {
                    this.f19548C.add(m15179M1);
                }
            }
            if (!SharepreferenceDBHandler.m15342F(this.f19558d).equalsIgnoreCase("6")) {
                return "get_fav";
            }
            Collections.sort(this.f19548C, new C3349c(this));
            return "get_fav";
        } catch (Exception e10) {
            return "get_fav";
        }
    }

    /* renamed from: L0 */
    public final ArrayList<String> m16990L0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f19571q.m15232m1(SharepreferenceDBHandler.m15337A(this.f19558d));
        this.f19572r = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f19576v.add(next.m15291b());
                }
            }
        }
        return this.f19576v;
    }

    /* renamed from: M0 */
    public final String m16991M0() {
        boolean z10;
        this.f19576v = new ArrayList<>();
        new ArrayList();
        this.f19549D = new ArrayList<>();
        ArrayList<LiveStreamsDBModel> m15300B = this.f19568n.m15300B("getalldata", "1");
        if (this.f19571q.m15189R1(SharepreferenceDBHandler.m15337A(this.f19558d)) <= 0) {
            this.f19549D = m15300B;
            return "get_recent_watch";
        }
        this.f19576v = m16990L0();
        Iterator<LiveStreamsDBModel> it = m15300B.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel next = it.next();
            Iterator<String> it2 = this.f19576v.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                String next2 = it2.next();
                if (next.m14827g() != null && next.m14827g().equals(next2)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.f19549D.add(next);
            }
        }
        return "get_recent_watch";
    }

    /* renamed from: N0 */
    public String m16992N0(String str) {
        try {
            this.f19578x = new ArrayList<>();
            this.f19569o = new ArrayList<>();
            this.f19579y = new ArrayList<>();
            this.f19580z = this.f19571q.m15217f1(str, "movie");
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: O0 */
    public final ArrayList<FavouriteDBModel> m16993O0(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f19546A = new ArrayList<>();
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
                this.f19546A.add(next);
            }
        }
        return this.f19546A;
    }

    /* renamed from: P0 */
    public final ArrayList<FavouriteM3UModel> m16994P0(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f19547B = new ArrayList<>();
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
                        this.f19547B.add(next);
                    }
                }
            }
            return this.f19547B;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: R0 */
    public void m16995R0() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: S0 */
    public void m16996S0() {
        TextView textView = this.tv_no_record_found;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.tv_no_record_found.setVisibility(8);
    }

    /* renamed from: T0 */
    public void m16997T0() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_loader.setVisibility(8);
    }

    /* renamed from: V0 */
    public final void m16998V0() {
        if (this.rl_left.getVisibility() == 0) {
            m16975Q0(this);
            this.rl_right.startAnimation(this.f19562h);
            this.rl_right.setVisibility(0);
            this.rl_left.startAnimation(this.f19560f);
            this.rl_left.setVisibility(8);
            this.iv_hamburger_sidebar.startAnimation(this.f19563i);
            this.iv_hamburger_sidebar.setVisibility(0);
            if (!new C6783a(this.f19558d).m31288z().equals(C5251a.f30065s0)) {
                this.iv_back_button_2.setVisibility(0);
            }
            this.iv_hamburger_sidebar.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19558d, 7);
            this.f19564j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: W0 */
    public void m16999W0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: X0 */
    public void m17000X0() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_series_data.setVisibility(8);
    }

    /* renamed from: Y0 */
    public final void m17001Y0() {
        ImageView imageView;
        this.f19569o = new ArrayList<>();
        this.f19570p = new ArrayList<>();
        this.f19571q = new LiveStreamDBHandler(this.f19558d);
        this.f19572r = new ArrayList<>();
        this.f19574t = new ArrayList<>();
        this.f19573s = new ArrayList<>();
        this.f19568n = new RecentWatchDBHandler(this.f19558d);
        this.f19565k = new LinearLayoutManager(this.f19558d);
        this.f19577w = new DatabaseHandler(this.f19558d);
        this.f19580z = new ArrayList<>();
        int i10 = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.f19550E = sharedPreferences;
        this.f19551F = sharedPreferences.edit();
        C5255e.m26246n(this.f19558d);
        if (new C6783a(this.f19558d).m31288z().equals(C5251a.f30065s0)) {
            imageView = this.iv_back_button_1;
            i10 = 8;
        } else {
            imageView = this.iv_back_button_1;
        }
        imageView.setVisibility(i10);
        m16987I0();
        m17024t1();
        m17009g1();
        m17010h1();
        m17004b1();
    }

    /* renamed from: Z0 */
    public final boolean m17002Z0() {
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
    public boolean m17003a1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    /* renamed from: b1 */
    public void m17004b1() {
        new AsyncTaskC3356j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[Catch: Exception -> 0x0116, TRY_LEAVE, TryCatch #1 {Exception -> 0x0116, blocks: (B:11:0x0036, B:13:0x003c, B:15:0x0049, B:18:0x0059, B:20:0x0099, B:22:0x00a5, B:24:0x00b0, B:26:0x00b7, B:27:0x00d8, B:29:0x00f1, B:30:0x00fb, B:31:0x007a), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: Exception -> 0x0116, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0116, blocks: (B:11:0x0036, B:13:0x003c, B:15:0x0049, B:18:0x0059, B:20:0x0099, B:22:0x00a5, B:24:0x00b0, B:26:0x00b7, B:27:0x00d8, B:29:0x00f1, B:30:0x00fb, B:31:0x007a), top: B:10:0x0036 }] */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m17005c1(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity.m17005c1(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d1 */
    public void m17006d1() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: e1 */
    public void m17007e1() {
        C5848a0 c5848a0 = this.f19567m;
        if (c5848a0 != null) {
            c5848a0.m4099w();
        }
    }

    /* renamed from: f1 */
    public void m17008f1() {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f19566l;
        if (vodAllDataRightSideAdapter != null) {
            vodAllDataRightSideAdapter.m4099w();
        }
    }

    /* renamed from: g1 */
    public final void m17009g1() {
        this.iv_close_sidebar.setOnClickListener(this);
        this.iv_hamburger_sidebar.setOnClickListener(this);
        this.logo.setOnClickListener(this);
        this.rl_search_cat.setOnClickListener(this);
        this.iv_back_button_1.setOnClickListener(this);
        this.iv_back_button_2.setOnClickListener(this);
    }

    /* renamed from: h1 */
    public final void m17010h1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new C3347a(this));
        }
    }

    /* renamed from: i1 */
    public void m17011i1() {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f19566l;
        if (vodAllDataRightSideAdapter != null) {
            vodAllDataRightSideAdapter.m17599L0();
        }
    }

    /* renamed from: j1 */
    public void m17012j1() {
        C5255e.f30089m = new AsyncTaskC3354h(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    /* renamed from: k1 */
    public final void m17013k1(String str) {
        C5848a0 c5848a0 = this.f19567m;
        if (c5848a0 != null) {
            c5848a0.m28466n0(str);
        }
    }

    /* renamed from: l1 */
    public void m17014l1(String str) {
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: m1 */
    public final void m17015m1() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList;
        int i10;
        String string;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f19573s;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = this.f19574t;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = new ArrayList<>();
        this.f19574t = arrayList4;
        arrayList4.addAll(this.f19573s);
        String str = "0";
        if (SharepreferenceDBHandler.m15373f(this.f19558d).equals("m3u")) {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList5 = this.f19573s;
            if (arrayList5 != null && arrayList5.size() >= 3) {
                arrayList = this.f19573s;
                i10 = 2;
                str = arrayList.get(i10).m14787b();
                string = this.f19573s.get(i10).m14788c();
            }
            string = this.f19558d.getResources().getString(2132017297);
        } else {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList6 = this.f19573s;
            if (arrayList6 != null && arrayList6.size() >= 5) {
                arrayList = this.f19573s;
                i10 = 4;
                str = arrayList.get(i10).m14787b();
                string = this.f19573s.get(i10).m14788c();
            }
            string = this.f19558d.getResources().getString(2132017297);
        }
        m17005c1(str, string);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList7 = this.f19574t;
        if (arrayList7 != null && arrayList7.size() > 0) {
            VodAllCategoriesSingleton.m14909b().m14920l(this.f19574t);
        }
        C5848a0 c5848a0 = new C5848a0(this.f19558d, str);
        this.f19567m = c5848a0;
        this.recycler_view_left_sidebar.setAdapter(c5848a0);
        this.recycler_view_left_sidebar.setLayoutManager(this.f19565k);
    }

    /* renamed from: n1 */
    public final void m17016n1() {
        try {
            new DialogC3348b(this, (VodAllDataSingleActivity) this.f19558d).show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: o1 */
    public void m17017o1(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m17002Z0()) {
            m16985G0();
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
                m16998V0();
                break;
            case 2131428184:
                this.f19557L = -1;
                m17020q1();
                break;
            case 2131428555:
                C5255e.m26224a(this.f19558d);
                break;
            case 2131429049:
                this.et_search_left_side.requestFocus();
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16999W0();
        m16983E0();
        this.f19558d = this;
        setContentView(2131624051);
        ButterKnife.m5626a(this);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            m878n0(toolbar);
        }
        m17001Y0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            return true;
        }
        toolbar.m1224x(2131689499);
        SharedPreferences sharedPreferences = this.f19550E;
        if (sharedPreferences != null) {
            if (sharedPreferences.getInt("vod", 1) == 1) {
                menu.getItem(1).getSubMenu().findItem(2131428258).setVisible(false);
                menu.getItem(1).getSubMenu().findItem(2131428254).setVisible(true);
            } else {
                menu.getItem(1).getSubMenu().findItem(2131428258).setVisible(true);
                menu.getItem(1).getSubMenu().findItem(2131428254).setVisible(false);
            }
        }
        this.f19552G = menu;
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (this.f19555J.equals("-5") || this.f19555J.equals("-4")) {
            this.f19552G.getItem(1).getSubMenu().findItem(2131428645).setVisible(false);
        } else {
            this.f19552G.getItem(1).getSubMenu().findItem(2131428645).setVisible(true);
        }
        if (this.f19555J.equals("-4")) {
            this.f19552G.getItem(1).getSubMenu().findItem(2131428757).setVisible(true);
        }
        boolean equals = SharepreferenceDBHandler.m15373f(this.f19558d).equals("m3u");
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
        AsyncTask asyncTask = C5255e.f30089m;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        C5255e.f30089m.cancel(true);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter;
        if (i10 != 21) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.rl_left.getVisibility() != 8 || (vodAllDataRightSideAdapter = this.f19566l) == null) {
            return false;
        }
        int m17594G0 = vodAllDataRightSideAdapter.m17594G0();
        this.f19557L = m17594G0;
        if (m17594G0 % 7 != 0) {
            return false;
        }
        m17020q1();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f19553H = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131427425) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f19554I = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(2132018526));
                    this.f19554I.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f19554I.findViewById(2131429120);
                    ((ImageView) this.f19554I.findViewById(2131429123)).setImageResource(2131231606);
                    imageView.setImageResource(2131231606);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f19554I.setOnQueryTextListener(new C3351e(this));
                    return true;
                }
            } catch (Exception e10) {
            }
        }
        if (itemId == 2131428645) {
            m17022r1(this);
        }
        if (itemId == 2131428258) {
            SharedPreferences.Editor editor = this.f19551F;
            if (editor != null) {
                editor.putInt("vod", 1);
                this.f19551F.commit();
            }
            Menu menu = this.f19552G;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(2131428258).setVisible(false);
                this.f19552G.getItem(1).getSubMenu().findItem(2131428254).setVisible(true);
            }
            m17008f1();
        }
        if (itemId == 2131428254) {
            SharedPreferences.Editor editor2 = this.f19551F;
            if (editor2 != null) {
                editor2.putInt("vod", 0);
                this.f19551F.commit();
            }
            Menu menu2 = this.f19552G;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(2131428258).setVisible(true);
                this.f19552G.getItem(1).getSubMenu().findItem(2131428254).setVisible(false);
            }
            m17008f1();
        }
        if (itemId == 2131428757 && VodAllCategoriesSingleton.m14909b().m14910a() != null && VodAllCategoriesSingleton.m14909b().m14910a().size() > 0) {
            m17016n1();
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19558d.getResources().getString(2132017514));
            aVar.m857e(this.f19558d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19558d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3352f(this));
            aVar.m858f(this.f19558d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3353g(this));
            aVar.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16999W0();
        super.onResume();
        m17007e1();
        if (this.f19555J.equals("-4")) {
            m17012j1();
        } else {
            m17008f1();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16999W0();
    }

    /* renamed from: p1 */
    public final void m17018p1() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_loader.setVisibility(0);
    }

    /* renamed from: q0 */
    public void m17019q0() {
        try {
            ArrayList<LiveStreamsDBModel> arrayList = this.f19580z;
            if (arrayList == null || arrayList.size() <= 0) {
                VodAllCategoriesSingleton.m14909b().m14921m(null);
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f19558d, "vod");
                this.f19566l = vodAllDataRightSideAdapter;
                this.recycler_view.setAdapter(vodAllDataRightSideAdapter);
                m17017o1(getResources().getString(2132018212));
                return;
            }
            VodAllCategoriesSingleton.m14909b().m14921m(this.f19580z);
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = new VodAllDataRightSideAdapter(this.f19558d, "vod");
            this.f19566l = vodAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(vodAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f19564j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f19564j);
            m17023s1();
        } catch (Exception e10) {
        }
    }

    /* renamed from: q1 */
    public final void m17020q1() {
        if (this.rl_left.getVisibility() == 8) {
            this.iv_hamburger_sidebar.setVisibility(8);
            if (!new C6783a(this.f19558d).m31288z().equals(C5251a.f30065s0)) {
                this.iv_back_button_2.setVisibility(8);
            }
            this.iv_close_sidebar.startAnimation(this.f19563i);
            this.iv_close_sidebar.setVisibility(0);
            this.iv_close_sidebar.requestFocus();
            this.rl_left.startAnimation(this.f19559e);
            this.rl_left.setVisibility(0);
            this.rl_right.startAnimation(this.f19561g);
            this.rl_right.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19558d, 5);
            this.f19564j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
            if (this.f19566l != null) {
                this.recycler_view.mo2557n1(this.f19557L);
                this.f19557L = -1;
            }
        }
    }

    /* renamed from: r0 */
    public final void m17021r0() {
        ArrayList<LiveStreamsDBModel> arrayList = this.f19549D;
        if (arrayList == null || arrayList.size() <= 0) {
            VodAllCategoriesSingleton.m14909b().m14921m(null);
            VodAllCategoriesSingleton.m14909b().m14916h(null);
            Menu menu = this.f19552G;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
            }
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f19558d, "continue_watching");
            this.f19566l = vodAllDataRightSideAdapter;
            this.recycler_view.setAdapter(vodAllDataRightSideAdapter);
            m17017o1(getResources().getString(2132018213));
            return;
        }
        VodAllCategoriesSingleton.m14909b().m14916h(this.f19549D);
        if (this.f19552G != null) {
            ArrayList<LiveStreamsDBModel> arrayList2 = this.f19549D;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                this.f19552G.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
            } else {
                this.f19552G.getItem(1).getSubMenu().findItem(2131428757).setVisible(true);
            }
        }
        VodAllCategoriesSingleton.m14909b().m14921m(this.f19549D);
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = new VodAllDataRightSideAdapter(this.f19558d, "continue_watching");
        this.f19566l = vodAllDataRightSideAdapter2;
        this.recycler_view.setAdapter(vodAllDataRightSideAdapter2);
        RelativeLayout relativeLayout = this.rl_left;
        this.f19564j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
        this.recycler_view.setLayoutManager(this.f19564j);
        m17023s1();
    }

    /* renamed from: r1 */
    public final void m17022r1(Activity activity) {
        try {
            new DialogC3350d(this, this, activity).show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: s1 */
    public void m17023s1() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_series_data.setVisibility(0);
    }

    /* renamed from: t1 */
    public final void m17024t1() {
        this.f19559e = AnimationUtils.loadAnimation(this.f19558d, 2130771993);
        this.f19560f = AnimationUtils.loadAnimation(this.f19558d, 2130771994);
        this.f19561g = AnimationUtils.loadAnimation(this.f19558d, 2130772004);
        this.f19562h = AnimationUtils.loadAnimation(this.f19558d, 2130772002);
        this.f19563i = AnimationUtils.loadAnimation(this.f19558d, 2130771980);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014d A[Catch: Exception -> 0x01af, NullPointerException -> 0x01b4, TryCatch #2 {NullPointerException -> 0x01b4, Exception -> 0x01af, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x0010, B:8:0x0015, B:10:0x009d, B:14:0x00b5, B:16:0x00da, B:17:0x0129, B:19:0x014d, B:20:0x00e6, B:24:0x0101, B:25:0x01a9, B:25:0x01a9), top: B:1:0x0000 }] */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean m17025u1() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity.m17025u1():java.lang.Boolean");
    }
}
