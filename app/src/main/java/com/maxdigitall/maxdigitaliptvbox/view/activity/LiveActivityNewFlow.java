package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import p203lf.C5857j;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow.class */
public class LiveActivityNewFlow extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: M */
    public static ProgressBar f17406M;

    /* renamed from: B */
    public SearchView f17408B;

    /* renamed from: C */
    public Handler f17409C;

    /* renamed from: E */
    public MenuItem f17411E;

    /* renamed from: F */
    public Menu f17412F;

    /* renamed from: J */
    public List<Object> f17416J;

    /* renamed from: K */
    public Boolean f17417K;

    /* renamed from: L */
    public Boolean f17418L;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button bt_explore_all;

    /* renamed from: d */
    public Context f17419d;

    /* renamed from: e */
    public SharedPreferences f17420e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public GridLayoutManager f17421f;

    @BindView
    public FrameLayout frameLayout;

    /* renamed from: g */
    public C5857j f17422g;

    @BindView
    public ImageView ivBTUP;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public LiveStreamDBHandler f17430o;

    /* renamed from: p */
    public ArrayList<PasswordStatusDBModel> f17431p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;

    /* renamed from: q */
    public ArrayList<LiveStreamCategoryIdDBModel> f17432q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f17433r;

    @BindView
    public RelativeLayout rl_no_arrangement_found;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f17434s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f17435t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f17436u;

    /* renamed from: z */
    public PopupWindow f17441z;

    /* renamed from: h */
    public boolean f17423h = false;

    /* renamed from: i */
    public int f17424i = -1;

    /* renamed from: j */
    public boolean f17425j = false;

    /* renamed from: k */
    public int f17426k = 1;

    /* renamed from: l */
    public int f17427l = 0;

    /* renamed from: m */
    public int f17428m = 20;

    /* renamed from: n */
    public ArrayList<String> f17429n = new ArrayList<>();

    /* renamed from: v */
    public String f17437v = "";

    /* renamed from: w */
    public String f17438w = "";

    /* renamed from: x */
    public DatabaseUpdatedStatusDBModel f17439x = new DatabaseUpdatedStatusDBModel();

    /* renamed from: y */
    public DatabaseUpdatedStatusDBModel f17440y = new DatabaseUpdatedStatusDBModel();

    /* renamed from: A */
    public ArrayList<LiveStreamCategoryIdDBModel> f17407A = new ArrayList<>();

    /* renamed from: D */
    public int f17410D = -1;

    /* renamed from: G */
    public AsyncTask f17413G = null;

    /* renamed from: H */
    public int f17414H = 0;

    /* renamed from: I */
    public ArrayList<NativeAd> f17415I = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$a.class */
    public class ViewOnClickListenerC2799a implements View.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17442b;

        public ViewOnClickListenerC2799a(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17442b = liveActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17442b.f17441z.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$b.class */
    public class ViewOnClickListenerC2800b implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f17443b;

        /* renamed from: c */
        public final View f17444c;

        /* renamed from: d */
        public final Activity f17445d;

        /* renamed from: e */
        public final LiveActivityNewFlow f17446e;

        public ViewOnClickListenerC2800b(LiveActivityNewFlow liveActivityNewFlow, RadioGroup radioGroup, View view, Activity activity) {
            this.f17446e = liveActivityNewFlow;
            this.f17443b = radioGroup;
            this.f17444c = view;
            this.f17445d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f17444c.findViewById(this.f17443b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f17446e.getResources().getString(2132018607))) {
                activity = this.f17445d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f17446e.getResources().getString(2132018615))) {
                activity = this.f17445d;
                str = "2";
            } else {
                activity = this.f17445d;
                str = "0";
            }
            SharepreferenceDBHandler.m15355S(str, activity);
            this.f17446e.f17413G = new AsyncTaskC2810l(this.f17446e).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            this.f17446e.f17441z.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$c.class */
    public class ViewOnClickListenerC2801c implements View.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17447b;

        public ViewOnClickListenerC2801c(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17447b = liveActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17447b.f17419d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$d.class */
    public class ViewOnClickListenerC2802d implements View.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17448b;

        public ViewOnClickListenerC2802d(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17448b = liveActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$e.class */
    public class DialogInterfaceOnClickListenerC2803e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17449b;

        public DialogInterfaceOnClickListenerC2803e(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17449b = liveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$f.class */
    public class DialogInterfaceOnClickListenerC2804f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17450b;

        public DialogInterfaceOnClickListenerC2804f(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17450b = liveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f17450b.f17419d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$g.class */
    public class C2805g implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final LiveActivityNewFlow f17451a;

        public C2805g(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17451a = liveActivityNewFlow;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            C5251a.f30021T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            this.f17451a.tvNoRecordFound.setVisibility(8);
            LiveActivityNewFlow liveActivityNewFlow = this.f17451a;
            if (liveActivityNewFlow.f17422g == null || (textView = liveActivityNewFlow.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            LiveActivityNewFlow liveActivityNewFlow2 = this.f17451a;
            liveActivityNewFlow2.f17422g.m28533q0(str, liveActivityNewFlow2.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$h.class */
    public class DialogInterfaceOnClickListenerC2806h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17452b;

        public DialogInterfaceOnClickListenerC2806h(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17452b = liveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17452b.f17419d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$i.class */
    public class DialogInterfaceOnClickListenerC2807i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17453b;

        public DialogInterfaceOnClickListenerC2807i(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17453b = liveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$j.class */
    public class DialogInterfaceOnClickListenerC2808j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17454b;

        public DialogInterfaceOnClickListenerC2808j(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17454b = liveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$k.class */
    public class DialogInterfaceOnClickListenerC2809k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LiveActivityNewFlow f17455b;

        public DialogInterfaceOnClickListenerC2809k(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17455b = liveActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$l.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$l.class */
    public class AsyncTaskC2810l extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final LiveActivityNewFlow f17456a;

        public AsyncTaskC2810l(LiveActivityNewFlow liveActivityNewFlow) {
            this.f17456a = liveActivityNewFlow;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f17456a.m15896z0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f17456a.m15891A0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow$m.class */
    public class ViewOnFocusChangeListenerC2811m implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17457b;

        /* renamed from: c */
        public final LiveActivityNewFlow f17458c;

        public ViewOnFocusChangeListenerC2811m(LiveActivityNewFlow liveActivityNewFlow, View view) {
            this.f17458c = liveActivityNewFlow;
            this.f17457b = view;
        }

        /* renamed from: a */
        public final void m15899a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17457b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m15900b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17457b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m15901c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17457b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m15900b(1.15f);
                m15901c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m15900b(1.0f);
                m15901c(1.0f);
                m15899a(z10);
            }
        }
    }

    public LiveActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f17417K = bool;
        this.f17418L = bool;
    }

    /* renamed from: A0 */
    public final void m15891A0() {
        List<Object> list;
        View view;
        List<Object> list2;
        int i10 = 8;
        if (SharepreferenceDBHandler.m15373f(this.f17419d).equals("m3u")) {
            if (this.f17434s == null || this.f17414H == 0 || (list2 = this.f17416J) == null) {
                ProgressBar progressBar = this.pbLoader;
                if (progressBar == null) {
                    return;
                }
                progressBar.setVisibility(8);
                view = this.rl_no_arrangement_found;
                i10 = 0;
            } else {
                this.f17422g = new C5857j(list2, this.f17419d);
                this.f17421f = new C6783a(this.f17419d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this.f17419d, 2) : new GridLayoutManager(this.f17419d, 2);
                this.myRecyclerView.setLayoutManager(this.f17421f);
                this.myRecyclerView.setItemAnimator(new C0704c());
                this.myRecyclerView.setAdapter(this.f17422g);
                view = this.pbLoader;
                if (view == null) {
                    return;
                }
            }
        } else {
            if (this.f17434s == null || (list = this.f17416J) == null) {
                return;
            }
            this.f17422g = new C5857j(list, this.f17419d);
            this.f17421f = new C6783a(this.f17419d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this.f17419d, 2) : new GridLayoutManager(this.f17419d, 2);
            this.myRecyclerView.setLayoutManager(this.f17421f);
            this.myRecyclerView.setItemAnimator(new C0704c());
            this.myRecyclerView.setAdapter(this.f17422g);
            view = this.pbLoader;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(i10);
    }

    /* renamed from: B0 */
    public final void m15892B0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f17441z = popupWindow;
            popupWindow.setContentView(inflate);
            this.f17441z.setWidth(-1);
            this.f17441z.setHeight(-1);
            this.f17441z.setFocusable(true);
            this.f17441z.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            radioButton.requestFocus();
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            RadioButton radioButton5 = (RadioButton) inflate.findViewById(2131428898);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) inflate.findViewById(2131428899);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2811m(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2811m(this, radioButton2));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2811m(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2811m(this, radioButton4));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2811m(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2811m(this, radioButton6));
            String m15381j = SharepreferenceDBHandler.m15381j(activity);
            if (m15381j.equals("1")) {
                radioButton3.setChecked(true);
            } else if (m15381j.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC2799a(this));
            button.setOnClickListener(new ViewOnClickListenerC2800b(this, radioGroup, inflate, activity));
        } catch (NullPointerException | Exception e10) {
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
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        C5857j c5857j = this.f17422g;
        if (c5857j != null && (progressBar = f17406M) != null) {
            c5857j.m28537u0(progressBar);
            this.f17422g.m4099w();
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428153) {
            this.f17413G = new AsyncTaskC2810l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else if (id2 == 2131428555) {
            C5255e.m26224a(this.f17419d);
        } else {
            if (id2 != 2131429468) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(2131624007);
        ButterKnife.m5626a(this);
        C5251a.f30021T = Boolean.FALSE;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        m15893v0();
        m878n0((Toolbar) findViewById(2131429320));
        this.f17419d = this;
        Handler handler = new Handler();
        this.f17409C = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2801c(this));
        this.f17413G = new AsyncTaskC2810l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.frameLayout.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689495);
        this.f17412F = menu;
        this.f17411E = menu.getItem(2).getSubMenu().findItem(2131427886);
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

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f17413G;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f17413G.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f17412F;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f17411E = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f17419d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2804f(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2803e(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f17408B = searchView;
            searchView.setQueryHint(getResources().getString(2132018518));
            this.f17408B.setIconifiedByDefault(false);
            this.f17408B.setOnQueryTextListener(new C2805g(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17419d.getResources().getString(2132017514));
            aVar.m857e(this.f17419d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17419d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2806h(this));
            aVar.m858f(this.f17419d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2807i(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f17419d.getResources().getString(2132017514));
            aVar2.m857e(this.f17419d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f17419d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2808j(this));
            aVar2.m858f(this.f17419d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2809k(this));
            aVar2.m865m();
        }
        if (itemId == 2131428645) {
            this.tvNoRecordFound.setVisibility(8);
            m15892B0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f17419d);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C5857j c5857j = this.f17422g;
        if (c5857j != null) {
            c5857j.m4099w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17420e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17420e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    /* renamed from: v0 */
    public final void m15893v0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: w0 */
    public final ArrayList<String> m15894w0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f17430o.m15232m1(SharepreferenceDBHandler.m15337A(this.f17419d));
        this.f17431p = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f17429n.add(next.m15291b());
                }
            }
        }
        return this.f17429n;
    }

    /* renamed from: x0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m15895x0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f17432q) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f17432q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ca, code lost:
    
        if (r13 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0376, code lost:
    
        if (r0.size() > 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0202 A[Catch: NullPointerException | Exception -> 0x056e, NullPointerException | Exception -> 0x056e, TRY_LEAVE, TryCatch #0 {NullPointerException | Exception -> 0x056e, blocks: (B:2:0x0000, B:2:0x0000, B:4:0x0007, B:4:0x0007, B:6:0x00f5, B:6:0x00f5, B:10:0x010d, B:10:0x010d, B:12:0x012b, B:12:0x012b, B:13:0x0173, B:13:0x0173, B:15:0x0184, B:15:0x0184, B:17:0x018b, B:17:0x018b, B:19:0x01b0, B:19:0x01b0, B:21:0x01c3, B:21:0x01c3, B:23:0x01cd, B:23:0x01cd, B:24:0x01f3, B:24:0x01f3, B:26:0x0202, B:26:0x0202, B:28:0x0225, B:28:0x0225, B:32:0x0231, B:32:0x0231, B:34:0x023c, B:34:0x023c, B:36:0x0247, B:36:0x0247, B:40:0x0252, B:40:0x0252, B:42:0x0269, B:42:0x0269, B:44:0x0280, B:44:0x0280, B:47:0x02a1, B:49:0x0354, B:49:0x0354, B:54:0x02e1, B:54:0x02e1, B:56:0x0311, B:56:0x0311, B:57:0x0316, B:57:0x0316, B:57:0x0316, B:57:0x0316, B:58:0x0319, B:58:0x0319, B:60:0x0366, B:60:0x0366, B:62:0x0371, B:62:0x0371, B:65:0x037a, B:65:0x037a, B:66:0x04e6, B:66:0x04e6, B:70:0x04ef, B:70:0x04ef, B:72:0x04fa, B:72:0x04fa, B:78:0x0384, B:78:0x0384, B:80:0x038f, B:80:0x038f, B:84:0x039b, B:84:0x039b, B:86:0x03a6, B:86:0x03a6, B:88:0x03b1, B:88:0x03b1, B:92:0x03bc, B:92:0x03bc, B:94:0x03d3, B:94:0x03d3, B:96:0x03ea, B:96:0x03ea, B:99:0x040b, B:99:0x040b, B:101:0x04be, B:101:0x04be, B:106:0x044b, B:106:0x044b, B:108:0x047b, B:108:0x047b, B:109:0x0480, B:109:0x0480, B:109:0x0480, B:109:0x0480, B:110:0x0483, B:110:0x0483, B:112:0x04d0, B:112:0x04d0, B:114:0x04db, B:114:0x04db, B:117:0x01d6, B:117:0x01d6, B:118:0x0138, B:118:0x0138, B:122:0x0153, B:122:0x0153), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0384 A[Catch: NullPointerException | Exception -> 0x056e, NullPointerException | Exception -> 0x056e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NullPointerException | Exception -> 0x056e, blocks: (B:2:0x0000, B:2:0x0000, B:4:0x0007, B:4:0x0007, B:6:0x00f5, B:6:0x00f5, B:10:0x010d, B:10:0x010d, B:12:0x012b, B:12:0x012b, B:13:0x0173, B:13:0x0173, B:15:0x0184, B:15:0x0184, B:17:0x018b, B:17:0x018b, B:19:0x01b0, B:19:0x01b0, B:21:0x01c3, B:21:0x01c3, B:23:0x01cd, B:23:0x01cd, B:24:0x01f3, B:24:0x01f3, B:26:0x0202, B:26:0x0202, B:28:0x0225, B:28:0x0225, B:32:0x0231, B:32:0x0231, B:34:0x023c, B:34:0x023c, B:36:0x0247, B:36:0x0247, B:40:0x0252, B:40:0x0252, B:42:0x0269, B:42:0x0269, B:44:0x0280, B:44:0x0280, B:47:0x02a1, B:49:0x0354, B:49:0x0354, B:54:0x02e1, B:54:0x02e1, B:56:0x0311, B:56:0x0311, B:57:0x0316, B:57:0x0316, B:57:0x0316, B:57:0x0316, B:58:0x0319, B:58:0x0319, B:60:0x0366, B:60:0x0366, B:62:0x0371, B:62:0x0371, B:65:0x037a, B:65:0x037a, B:66:0x04e6, B:66:0x04e6, B:70:0x04ef, B:70:0x04ef, B:72:0x04fa, B:72:0x04fa, B:78:0x0384, B:78:0x0384, B:80:0x038f, B:80:0x038f, B:84:0x039b, B:84:0x039b, B:86:0x03a6, B:86:0x03a6, B:88:0x03b1, B:88:0x03b1, B:92:0x03bc, B:92:0x03bc, B:94:0x03d3, B:94:0x03d3, B:96:0x03ea, B:96:0x03ea, B:99:0x040b, B:99:0x040b, B:101:0x04be, B:101:0x04be, B:106:0x044b, B:106:0x044b, B:108:0x047b, B:108:0x047b, B:109:0x0480, B:109:0x0480, B:109:0x0480, B:109:0x0480, B:110:0x0483, B:110:0x0483, B:112:0x04d0, B:112:0x04d0, B:114:0x04db, B:114:0x04db, B:117:0x01d6, B:117:0x01d6, B:118:0x0138, B:118:0x0138, B:122:0x0153, B:122:0x0153), top: B:1:0x0000 }] */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m15896z0() {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LiveActivityNewFlow.m15896z0():boolean");
    }
}
