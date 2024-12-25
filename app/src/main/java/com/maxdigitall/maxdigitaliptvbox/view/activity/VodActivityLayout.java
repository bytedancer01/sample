package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout.class */
public class VodActivityLayout extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: B */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19336B = new ArrayList<>();

    /* renamed from: C */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19337C = new ArrayList<>();

    /* renamed from: D */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19338D = new ArrayList<>();

    /* renamed from: E */
    public static ProgressBar f19339E;

    /* renamed from: A */
    public Menu f19340A;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f19341d;

    /* renamed from: e */
    public SharedPreferences f19342e;

    /* renamed from: i */
    public LiveStreamDBHandler f19346i;

    /* renamed from: k */
    public SearchView f19348k;

    /* renamed from: l */
    public ProgressDialog f19349l;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: p */
    public SharedPreferences f19353p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public SharedPreferences.Editor f19354q;

    /* renamed from: r */
    public RecyclerView.AbstractC0685p f19355r;

    /* renamed from: s */
    public SharedPreferences f19356s;

    /* renamed from: t */
    public VodAdapter f19357t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    /* renamed from: v */
    public VodSubCatAdpaterNew f19359v;

    @BindView
    public TextView vodCategoryName;

    /* renamed from: w */
    public SharedPreferences f19360w;

    /* renamed from: x */
    public SharedPreferences.Editor f19361x;

    /* renamed from: y */
    public PopupWindow f19362y;

    /* renamed from: z */
    public MenuItem f19363z;

    /* renamed from: f */
    public String f19343f = "";

    /* renamed from: g */
    public String f19344g = "";

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f19345h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f19347j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: m */
    public String f19350m = "";

    /* renamed from: n */
    public String f19351n = "";

    /* renamed from: o */
    public boolean f19352o = false;

    /* renamed from: u */
    public ArrayList<LiveStreamsDBModel> f19358u = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$a.class */
    public class DialogInterfaceOnClickListenerC3294a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19364b;

        public DialogInterfaceOnClickListenerC3294a(VodActivityLayout vodActivityLayout) {
            this.f19364b = vodActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$b.class */
    public class DialogInterfaceOnClickListenerC3295b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19365b;

        public DialogInterfaceOnClickListenerC3295b(VodActivityLayout vodActivityLayout) {
            this.f19365b = vodActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19365b.f19341d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$c.class */
    public class C3296c implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodActivityLayout f19366a;

        public C3296c(VodActivityLayout vodActivityLayout) {
            this.f19366a = vodActivityLayout;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f19366a.tvNoRecordFound.setVisibility(8);
            if (this.f19366a.f19357t == null || (textView = this.f19366a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19366a.f19357t.m17527s0(str, this.f19366a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$d.class */
    public class DialogInterfaceOnClickListenerC3297d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19367b;

        public DialogInterfaceOnClickListenerC3297d(VodActivityLayout vodActivityLayout) {
            this.f19367b = vodActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19367b.f19341d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$e.class */
    public class DialogInterfaceOnClickListenerC3298e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19368b;

        public DialogInterfaceOnClickListenerC3298e(VodActivityLayout vodActivityLayout) {
            this.f19368b = vodActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$f.class */
    public class DialogInterfaceOnClickListenerC3299f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19369b;

        public DialogInterfaceOnClickListenerC3299f(VodActivityLayout vodActivityLayout) {
            this.f19369b = vodActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$g.class */
    public class DialogInterfaceOnClickListenerC3300g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19370b;

        public DialogInterfaceOnClickListenerC3300g(VodActivityLayout vodActivityLayout) {
            this.f19370b = vodActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$h.class */
    public class ViewOnClickListenerC3301h implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityLayout f19371b;

        public ViewOnClickListenerC3301h(VodActivityLayout vodActivityLayout) {
            this.f19371b = vodActivityLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19371b.f19362y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout$i.class */
    public class ViewOnClickListenerC3302i implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f19372b;

        /* renamed from: c */
        public final View f19373c;

        /* renamed from: d */
        public final VodActivityLayout f19374d;

        public ViewOnClickListenerC3302i(VodActivityLayout vodActivityLayout, RadioGroup radioGroup, View view) {
            this.f19374d = vodActivityLayout;
            this.f19372b = radioGroup;
            this.f19373c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f19373c.findViewById(this.f19372b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f19374d.getResources().getString(2132018611))) {
                editor = this.f19374d.f19361x;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f19374d.getResources().getString(2132018607))) {
                editor = this.f19374d.f19361x;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f19374d.getResources().getString(2132018615))) {
                editor = this.f19374d.f19361x;
                str = "3";
            } else {
                editor = this.f19374d.f19361x;
                str = "0";
            }
            editor.putString("sort", str);
            this.f19374d.f19361x.commit();
            VodActivityLayout vodActivityLayout = this.f19374d;
            vodActivityLayout.f19353p = vodActivityLayout.getSharedPreferences("listgridview", 0);
            VodActivityLayout vodActivityLayout2 = this.f19374d;
            vodActivityLayout2.f19354q = vodActivityLayout2.f19353p.edit();
            int i10 = this.f19374d.f19353p.getInt("vod", 0);
            C5251a.f30070v = i10;
            if (i10 == 1) {
                this.f19374d.m16878D0();
            } else {
                this.f19374d.m16877C0();
            }
            this.f19374d.f19362y.dismiss();
        }
    }

    /* renamed from: A0 */
    public final void m16875A0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: B0 */
    public void m16876B0() {
        RecyclerView recyclerView;
        C0704c c0704c;
        m16883a();
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f19353p = sharedPreferences;
        this.f19354q = sharedPreferences.edit();
        int i10 = this.f19353p.getInt("vod", 0);
        C5251a.f30070v = i10;
        this.f19341d = this;
        if (i10 == 1) {
            this.f19346i = new LiveStreamDBHandler(this.f19341d);
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null && this.f19341d != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f19341d);
                this.f19355r = linearLayoutManager;
                this.myRecyclerView.setLayoutManager(linearLayoutManager);
                recyclerView = this.myRecyclerView;
                c0704c = new C0704c();
                recyclerView.setItemAnimator(c0704c);
            }
        } else {
            this.f19346i = new LiveStreamDBHandler(this.f19341d);
            RecyclerView recyclerView3 = this.myRecyclerView;
            if (recyclerView3 != null && this.f19341d != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19341d, C5255e.m26257x(this.f19341d) + 2);
                this.f19355r = gridLayoutManager;
                this.myRecyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.myRecyclerView;
                c0704c = new C0704c();
                recyclerView.setItemAnimator(c0704c);
            }
        }
        if (this.f19341d != null) {
            ArrayList<LiveStreamsDBModel> m15217f1 = new LiveStreamDBHandler(this.f19341d).m15217f1("0", "movie");
            m16884b();
            if (m15217f1 == null || this.myRecyclerView == null || m15217f1.size() == 0) {
                ProgressDialog progressDialog = this.f19349l;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                ProgressDialog progressDialog2 = this.f19349l;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
                this.f19357t = new VodAdapter(m15217f1, this.f19341d, true);
                C5255e.m26243l0(this.f19341d, getResources().getString(2132018759));
                this.myRecyclerView.setAdapter(this.f19357t);
            }
        }
        ProgressDialog progressDialog3 = this.f19349l;
        if (progressDialog3 != null) {
            progressDialog3.dismiss();
        }
    }

    /* renamed from: C0 */
    public final void m16877C0() {
        this.f19341d = this;
        this.f19346i = new LiveStreamDBHandler(this.f19341d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19341d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19341d, C5255e.m26257x(this.f19341d) + 2);
        this.f19355r = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f19341d.getSharedPreferences("loginPrefs", 0);
        this.f19356s = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f19356s.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m16881G0();
    }

    /* renamed from: D0 */
    public final void m16878D0() {
        this.f19341d = this;
        this.f19346i = new LiveStreamDBHandler(this.f19341d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19341d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f19341d);
        this.f19355r = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        SharedPreferences sharedPreferences = this.f19341d.getSharedPreferences("loginPrefs", 0);
        this.f19356s = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f19356s.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        m16881G0();
    }

    /* renamed from: E0 */
    public void m16879E0(ProgressBar progressBar) {
        f19339E = progressBar;
    }

    /* renamed from: F0 */
    public final void m16880F0() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f19353p = sharedPreferences;
        this.f19354q = sharedPreferences.edit();
        int i10 = this.f19353p.getInt("vod", 0);
        C5251a.f30070v = i10;
        if (i10 == 1) {
            m16878D0();
        } else {
            m16877C0();
        }
    }

    /* renamed from: G0 */
    public final void m16881G0() {
        if (this.f19341d != null) {
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f19341d);
            if (!this.f19350m.equals("-1")) {
                ArrayList<LiveStreamsDBModel> m15217f1 = liveStreamDBHandler.m15217f1(this.f19350m, "movie");
                m16884b();
                ProgressDialog progressDialog = this.f19349l;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (m15217f1 == null || this.myRecyclerView == null || m15217f1.size() == 0) {
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                } else {
                    VodAdapter vodAdapter = new VodAdapter(m15217f1, this.f19341d, true);
                    this.f19357t = vodAdapter;
                    this.myRecyclerView.setAdapter(vodAdapter);
                    C5255e.m26243l0(this.f19341d, getResources().getString(2132018759));
                }
            }
        }
        ProgressDialog progressDialog2 = this.f19349l;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }

    /* renamed from: H0 */
    public final void m16882H0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f19362y = popupWindow;
            popupWindow.setContentView(inflate);
            this.f19362y.setWidth(-1);
            this.f19362y.setHeight(-1);
            this.f19362y.setFocusable(true);
            this.f19362y.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f19360w.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3301h(this));
            button.setOnClickListener(new ViewOnClickListenerC3302i(this, radioGroup, inflate));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m16883a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* renamed from: b */
    public void m16884b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
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
        ProgressBar progressBar;
        VodSubCatAdpaterNew vodSubCatAdpaterNew = this.f19359v;
        if (vodSubCatAdpaterNew != null && (progressBar = f19339E) != null) {
            vodSubCatAdpaterNew.m17617r0(progressBar);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
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
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f19360w = sharedPreferences;
        this.f19361x = sharedPreferences.edit();
        if (this.f19360w.getString("sort", "").equals("")) {
            this.f19361x.putString("sort", "0");
            this.f19361x.commit();
        }
        getWindow().setFlags(1024, 1024);
        Intent intent = getIntent();
        if (intent != null) {
            this.f19350m = intent.getStringExtra("category_id");
            this.f19351n = intent.getStringExtra("category_name");
        }
        this.f19341d = this;
        this.f19359v = new VodSubCatAdpaterNew();
        this.f19346i = new LiveStreamDBHandler(this.f19341d);
        setContentView(2131624098);
        overridePendingTransition(2130772003, 2130772000);
        ButterKnife.m5626a(this);
        m16883a();
        m16880F0();
        m16875A0();
        m878n0((Toolbar) findViewById(2131429320));
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        this.f19341d = this;
        if (!this.f19351n.isEmpty()) {
            this.vodCategoryName.setText(this.f19351n);
        }
        this.vodCategoryName.setSelected(true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689497);
        this.f19340A = menu;
        this.f19363z = menu.getItem(2).getSubMenu().findItem(2131427886);
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f19340A;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x023e, code lost:
    
        if (r0.size() > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02b1, code lost:
    
        if (r0.size() > 0) goto L44;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityLayout.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f19341d);
        getWindow().setFlags(1024, 1024);
        this.f19359v.m17617r0(f19339E);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19342e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19342e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f19341d != null) {
            m16884b();
        }
    }
}
