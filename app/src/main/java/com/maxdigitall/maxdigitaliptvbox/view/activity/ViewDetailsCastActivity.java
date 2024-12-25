package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBMoviesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.PersonImagesAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5373e;
import p318s4.InterfaceC8527c;
import p324sf.InterfaceC8570i;
import p329t3.C8617g;
import p330t4.AbstractC8627g;
import p428yg.C10014t;
import p428yg.InterfaceC9993c0;
import pf.C7705a;
import pf.C7708d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity.class */
public class ViewDetailsCastActivity extends ActivityC0243b implements View.OnClickListener, InterfaceC8570i {

    /* renamed from: w */
    public static String f19229w;

    /* renamed from: x */
    public static String f19230x;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public String f19231d;

    /* renamed from: e */
    public String f19232e;

    /* renamed from: f */
    public SimpleDateFormat f19233f;

    /* renamed from: g */
    public Date f19234g;

    /* renamed from: i */
    public ProgressDialog f19236i;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public SharedPreferences f19237j;

    @BindView
    public LinearLayout llDODBoxInfo;

    @BindView
    public LinearLayout llDetailLeftSide;

    @BindView
    public LinearLayout llDetailProgressBar;

    @BindView
    public LinearLayout llDetailRightSide;

    @BindView
    public LinearLayout llDobBox;

    @BindView
    public LinearLayout llDobBoxInfo;

    @BindView
    public LinearLayout llDodBox;

    @BindView
    public LinearLayout llGenderBox;

    @BindView
    public LinearLayout llGenderBoxInfo;

    @BindView
    public LinearLayout llKnownForBox;

    @BindView
    public LinearLayout llKnownForBoxInfo;

    @BindView
    public LinearLayout llPersonInfoBox;

    @BindView
    public LinearLayout llPobBox;

    @BindView
    public LinearLayout llPobBoxInfo;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public DateFormat f19240m;

    /* renamed from: n */
    public MenuItem f19241n;

    /* renamed from: o */
    public Menu f19242o;

    /* renamed from: q */
    public C5373e f19244q;

    /* renamed from: r */
    public PersonImagesAdapter f19245r;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;

    /* renamed from: s */
    public String f19246s;

    @BindView
    public ScrollView scrollView;

    /* renamed from: t */
    public String f19247t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvCastDesc;

    @BindView
    public TextView tvCastName;

    @BindView
    public TextView tvDODInfo;

    @BindView
    public TextView tvDateOfBirth;

    @BindView
    public TextView tvGender;

    @BindView
    public TextView tvKnownFor;

    @BindView
    public TextView tvPlaceOfBirth;

    @BindView
    public ProgressBar tvdetailprogressbar;

    /* renamed from: u */
    public String f19248u;

    /* renamed from: h */
    public Context f19235h = this;

    /* renamed from: k */
    public String f19238k = "";

    /* renamed from: l */
    public String f19239l = "";

    /* renamed from: p */
    public Boolean f19243p = Boolean.TRUE;

    /* renamed from: v */
    public String f19249v = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$a.class */
    public class DialogInterfaceOnClickListenerC3263a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19250b;

        public DialogInterfaceOnClickListenerC3263a(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19250b = viewDetailsCastActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$b.class */
    public class ViewOnClickListenerC3264b implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19251b;

        public ViewOnClickListenerC3264b(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19251b = viewDetailsCastActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19251b.f19235h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$c.class */
    public class ViewOnClickListenerC3265c implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19252b;

        public ViewOnClickListenerC3265c(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19252b = viewDetailsCastActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19252b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$d.class */
    public class C3266d implements InterfaceC9993c0 {

        /* renamed from: a */
        public final Context f19253a;

        /* renamed from: b */
        public final ViewDetailsCastActivity f19254b;

        public C3266d(ViewDetailsCastActivity viewDetailsCastActivity, Context context) {
            this.f19254b = viewDetailsCastActivity;
            this.f19253a = context;
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: a */
        public void mo16616a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: b */
        public void mo16617b(Bitmap bitmap, C10014t.e eVar) {
            this.f19254b.appbarToolbar.setBackground(new BitmapDrawable(this.f19253a.getResources(), bitmap));
            ViewDetailsCastActivity viewDetailsCastActivity = this.f19254b;
            viewDetailsCastActivity.rlTransparent.setBackgroundColor(viewDetailsCastActivity.getResources().getColor(2131100140));
            ViewDetailsCastActivity viewDetailsCastActivity2 = this.f19254b;
            viewDetailsCastActivity2.toolbar.setBackgroundColor(viewDetailsCastActivity2.getResources().getColor(2131100140));
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: c */
        public void mo16618c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$e.class */
    public class C3267e extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final ViewDetailsCastActivity f19255d;

        public C3267e(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19255d = viewDetailsCastActivity;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            this.f19255d.ivMovieImage.setBackground(new BitmapDrawable(bitmap));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$f.class */
    public class DialogInterfaceOnClickListenerC3268f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19256b;

        public DialogInterfaceOnClickListenerC3268f(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19256b = viewDetailsCastActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$g.class */
    public class DialogInterfaceOnClickListenerC3269g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19257b;

        public DialogInterfaceOnClickListenerC3269g(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19257b = viewDetailsCastActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19257b.f19235h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$h.class */
    public class DialogInterfaceOnClickListenerC3270h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19258b;

        public DialogInterfaceOnClickListenerC3270h(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19258b = viewDetailsCastActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19258b.f19235h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$i.class */
    public class DialogInterfaceOnClickListenerC3271i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19259b;

        public DialogInterfaceOnClickListenerC3271i(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19259b = viewDetailsCastActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity$j.class */
    public class DialogInterfaceOnClickListenerC3272j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsCastActivity f19260b;

        public DialogInterfaceOnClickListenerC3272j(ViewDetailsCastActivity viewDetailsCastActivity) {
            this.f19260b = viewDetailsCastActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* renamed from: s0 */
    public static String m16833s0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: L */
    public void mo16819L(TMDBGenreCallback tMDBGenreCallback) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0270, code lost:
    
        if (r8 != null) goto L113;
     */
    @Override // p324sf.InterfaceC8570i
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16824R(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBPersonInfoCallback r8) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsCastActivity.mo16824R(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBPersonInfoCallback):void");
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: W */
    public void mo16826W(TMDBCastsCallback tMDBCastsCallback) {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
        ProgressDialog progressDialog = this.f19236i;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: b0 */
    public void mo16827b0(TMDBCastsCallback tMDBCastsCallback) {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
        this.tvdetailprogressbar.setVisibility(8);
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

    @Override // p324sf.InterfaceC8570i
    /* renamed from: e */
    public void mo16828e(SearchTMDBMoviesCallback searchTMDBMoviesCallback) {
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: o */
    public void mo16829o(TMDBTrailerCallback tMDBTrailerCallback) {
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
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f19235h = this;
        super.onCreate(bundle);
        m16835t0();
        setContentView(new C6783a(this.f19235h).m31288z().equals(C5251a.f30065s0) ? 2131624083 : 2131624082);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        m16834r0();
        this.f19234g = new Date();
        f19229w = m16833s0(this.f19235h);
        Locale locale = Locale.US;
        this.f19240m = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f19232e = C5255e.m26247n0(C7708d.m33672d());
        f19230x = getApplicationContext().getPackageName();
        this.f19231d = C5255e.m26247n0(C7705a.m33651a());
        this.f19233f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        m878n0((Toolbar) findViewById(2131429320));
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230975));
        }
        m16836u0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        this.f19242o = menu;
        this.f19241n = menu.getItem(1).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f19235h).equals("api")) {
            menu.getItem(1).getSubMenu().findItem(2131428637).setVisible(false);
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
        Menu menu = this.f19242o;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f19241n = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f19235h) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3269g(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3268f(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19235h.getResources().getString(2132017514));
            aVar.m857e(this.f19235h.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19235h.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3270h(this));
            aVar.m858f(this.f19235h.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3271i(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f19235h.getResources().getString(2132017514));
            aVar2.m857e(this.f19235h.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f19235h.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3272j(this));
            aVar2.m858f(this.f19235h.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3263a(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f19235h);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19237j = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19237j.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f19235h != null) {
            mo15997b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16835t0();
    }

    /* renamed from: r0 */
    public final void m16834r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: t0 */
    public void m16835t0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: u0 */
    public final void m16836u0() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19237j = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f19237j.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        } else {
            m16837v0(this.f19235h, string, string2);
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3264b(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3265c(this));
    }

    /* renamed from: v0 */
    public final void m16837v0(Context context, String str, String str2) {
        String str3;
        this.f19244q = new C5373e(this, context);
        Intent intent = getIntent();
        if (intent != null) {
            this.f19246s = intent.getStringExtra("castID");
            this.f19247t = intent.getStringExtra("castName");
            this.f19248u = intent.getStringExtra("profilePath");
            String stringExtra = intent.getStringExtra("streamBackdrop");
            this.f19249v = stringExtra;
            if (stringExtra != null && !stringExtra.equals("") && context != null) {
                C10014t.m42105q(context).m42116l(this.f19249v).m42153i(new C3266d(this, context));
            }
            String str4 = this.f19246s;
            if (str4 == null || str4.equals("0")) {
                return;
            }
            TextView textView = this.tvCastName;
            if (textView != null) {
                textView.setText(this.f19247t);
            }
            if (context != null) {
                try {
                    if (this.ivMovieImage != null && (str3 = this.f19248u) != null && !str3.isEmpty()) {
                        C8617g.m37004u(getApplicationContext()).m37029q("https://image.tmdb.org/t/p/w500/" + this.f19248u).m36988K().m36993l(new C3267e(this));
                    }
                } catch (Exception e10) {
                }
            }
            this.f19244q.m26717f(this.f19246s);
        }
    }
}
