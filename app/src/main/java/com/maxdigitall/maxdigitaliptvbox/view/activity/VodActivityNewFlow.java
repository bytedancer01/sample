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
import android.widget.LinearLayout;
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
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapterNewFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow.class */
public class VodActivityNewFlow extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: I */
    public static ProgressBar f19376I;

    /* renamed from: A */
    public Menu f19377A;

    /* renamed from: D */
    public SeriesRecentWatchDatabase f19380D;

    /* renamed from: F */
    public List<Object> f19382F;

    /* renamed from: G */
    public Boolean f19383G;

    /* renamed from: H */
    public Boolean f19384H;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button bt_explore_all;

    /* renamed from: d */
    public Context f19385d;

    /* renamed from: e */
    public SharedPreferences f19386e;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f19387f;

    @BindView
    public FrameLayout frameLayout;

    @BindView
    public TextView home;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public LiveStreamDBHandler f19391j;

    /* renamed from: l */
    public ArrayList<LiveStreamCategoryIdDBModel> f19393l;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public ArrayList<LiveStreamCategoryIdDBModel> f19394m;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public ArrayList<LiveStreamCategoryIdDBModel> f19395n;

    /* renamed from: o */
    public VodAdapterNewFlow f19396o;

    /* renamed from: p */
    public SearchView f19397p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;

    /* renamed from: r */
    public ArrayList<PasswordStatusDBModel> f19399r;

    @BindView
    public RelativeLayout rl_no_arrangement_found;

    @BindView
    public RelativeLayout rl_vod_layout;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f19400s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f19401t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f19402u;

    /* renamed from: v */
    public ArrayList<LiveStreamCategoryIdDBModel> f19403v;

    /* renamed from: x */
    public PopupWindow f19405x;

    /* renamed from: y */
    public Handler f19406y;

    /* renamed from: z */
    public MenuItem f19407z;

    /* renamed from: g */
    public String f19388g = "";

    /* renamed from: h */
    public String f19389h = "";

    /* renamed from: i */
    public DatabaseUpdatedStatusDBModel f19390i = new DatabaseUpdatedStatusDBModel();

    /* renamed from: k */
    public DatabaseUpdatedStatusDBModel f19392k = new DatabaseUpdatedStatusDBModel();

    /* renamed from: q */
    public ArrayList<String> f19398q = new ArrayList<>();

    /* renamed from: w */
    public int f19404w = -1;

    /* renamed from: B */
    public AsyncTask f19378B = null;

    /* renamed from: C */
    public int f19379C = 0;

    /* renamed from: E */
    public ArrayList<NativeAd> f19381E = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$a.class */
    public class C3303a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodActivityNewFlow f19408a;

        public C3303a(VodActivityNewFlow vodActivityNewFlow) {
            this.f19408a = vodActivityNewFlow;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            C5251a.f30021T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            this.f19408a.tvNoRecordFound.setVisibility(8);
            if (this.f19408a.f19396o == null || (textView = this.f19408a.tvNoRecordFound) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19408a.f19396o.m17554n0(str, this.f19408a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$b.class */
    public class ViewOnClickListenerC3304b implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19409b;

        public ViewOnClickListenerC3304b(VodActivityNewFlow vodActivityNewFlow) {
            this.f19409b = vodActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19409b.f19405x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$c.class */
    public class ViewOnClickListenerC3305c implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f19410b;

        /* renamed from: c */
        public final View f19411c;

        /* renamed from: d */
        public final Activity f19412d;

        /* renamed from: e */
        public final VodActivityNewFlow f19413e;

        public ViewOnClickListenerC3305c(VodActivityNewFlow vodActivityNewFlow, RadioGroup radioGroup, View view, Activity activity) {
            this.f19413e = vodActivityNewFlow;
            this.f19410b = radioGroup;
            this.f19411c = view;
            this.f19412d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f19411c.findViewById(this.f19410b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f19413e.getResources().getString(2132018607))) {
                activity = this.f19412d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f19413e.getResources().getString(2132018615))) {
                activity = this.f19412d;
                str = "2";
            } else {
                activity = this.f19412d;
                str = "0";
            }
            SharepreferenceDBHandler.m15388m0(str, activity);
            this.f19413e.f19378B = new AsyncTaskC3316n(this.f19413e).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            this.f19413e.f19405x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$d.class */
    public class ViewOnClickListenerC3306d implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19414b;

        public ViewOnClickListenerC3306d(VodActivityNewFlow vodActivityNewFlow) {
            this.f19414b = vodActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19414b.f19385d.startActivity(new Intent(this.f19414b.f19385d, (Class<?>) NewDashboardActivity.class));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$e.class */
    public class ViewOnClickListenerC3307e implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19415b;

        public ViewOnClickListenerC3307e(VodActivityNewFlow vodActivityNewFlow) {
            this.f19415b = vodActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19415b.f19385d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$f.class */
    public class ViewOnClickListenerC3308f implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19416b;

        public ViewOnClickListenerC3308f(VodActivityNewFlow vodActivityNewFlow) {
            this.f19416b = vodActivityNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19416b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$g.class */
    public class DialogInterfaceOnClickListenerC3309g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19417b;

        public DialogInterfaceOnClickListenerC3309g(VodActivityNewFlow vodActivityNewFlow) {
            this.f19417b = vodActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$h.class */
    public class DialogInterfaceOnClickListenerC3310h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19418b;

        public DialogInterfaceOnClickListenerC3310h(VodActivityNewFlow vodActivityNewFlow) {
            this.f19418b = vodActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19418b.f19385d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$i.class */
    public class DialogInterfaceOnClickListenerC3311i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19419b;

        public DialogInterfaceOnClickListenerC3311i(VodActivityNewFlow vodActivityNewFlow) {
            this.f19419b = vodActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19419b.f19385d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$j.class */
    public class DialogInterfaceOnClickListenerC3312j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19420b;

        public DialogInterfaceOnClickListenerC3312j(VodActivityNewFlow vodActivityNewFlow) {
            this.f19420b = vodActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$k.class */
    public class DialogInterfaceOnClickListenerC3313k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19421b;

        public DialogInterfaceOnClickListenerC3313k(VodActivityNewFlow vodActivityNewFlow) {
            this.f19421b = vodActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$l.class */
    public class DialogInterfaceOnClickListenerC3314l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlow f19422b;

        public DialogInterfaceOnClickListenerC3314l(VodActivityNewFlow vodActivityNewFlow) {
            this.f19422b = vodActivityNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$m.class */
    public class ViewOnFocusChangeListenerC3315m implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19423b;

        /* renamed from: c */
        public final VodActivityNewFlow f19424c;

        public ViewOnFocusChangeListenerC3315m(VodActivityNewFlow vodActivityNewFlow, View view) {
            this.f19424c = vodActivityNewFlow;
            this.f19423b = view;
        }

        /* renamed from: a */
        public final void m16898a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19423b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16899b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19423b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16900c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19423b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16899b(1.15f);
                m16900c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16899b(1.0f);
                m16900c(1.0f);
                m16898a(z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$n.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow$n.class */
    public class AsyncTaskC3316n extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final VodActivityNewFlow f19425a;

        public AsyncTaskC3316n(VodActivityNewFlow vodActivityNewFlow) {
            this.f19425a = vodActivityNewFlow;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f19425a.m16892B0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f19425a.m16893C0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public VodActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f19383G = bool;
        this.f19384H = bool;
    }

    /* renamed from: A0 */
    public final void m16891A0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0205, code lost:
    
        if (r13 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x039a, code lost:
    
        if (r0.size() > 0) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c1 A[Catch: NullPointerException | Exception -> 0x0589, NullPointerException | Exception -> 0x0589, TRY_ENTER, TryCatch #0 {NullPointerException | Exception -> 0x0589, blocks: (B:2:0x0000, B:2:0x0000, B:4:0x0007, B:4:0x0007, B:6:0x0101, B:6:0x0101, B:8:0x0119, B:8:0x0119, B:10:0x012c, B:10:0x012c, B:14:0x0144, B:14:0x0144, B:16:0x015c, B:16:0x015c, B:17:0x019e, B:17:0x019e, B:21:0x01ca, B:21:0x01ca, B:23:0x01e0, B:23:0x01e0, B:25:0x01e7, B:25:0x01e7, B:27:0x0208, B:27:0x0208, B:28:0x021a, B:28:0x021a, B:30:0x022a, B:30:0x022a, B:32:0x0235, B:32:0x0235, B:36:0x0241, B:36:0x0241, B:38:0x024c, B:38:0x024c, B:40:0x0257, B:40:0x0257, B:44:0x0262, B:46:0x0278, B:48:0x028e, B:50:0x02a5, B:53:0x02c6, B:53:0x02c6, B:55:0x0378, B:55:0x0378, B:60:0x0306, B:60:0x0306, B:62:0x0335, B:62:0x0335, B:63:0x033a, B:63:0x033a, B:63:0x033a, B:63:0x033a, B:64:0x033d, B:64:0x033d, B:66:0x038a, B:66:0x038a, B:68:0x0395, B:68:0x0395, B:71:0x039e, B:71:0x039e, B:72:0x0501, B:72:0x0501, B:76:0x050a, B:76:0x050a, B:78:0x0515, B:78:0x0515, B:84:0x03a8, B:84:0x03a8, B:86:0x03b3, B:86:0x03b3, B:90:0x03bf, B:90:0x03bf, B:92:0x03ca, B:92:0x03ca, B:94:0x03d5, B:94:0x03d5, B:98:0x03e0, B:98:0x03e0, B:100:0x03f6, B:100:0x03f6, B:102:0x040c, B:102:0x040c, B:104:0x0423, B:104:0x0423, B:106:0x043a, B:106:0x043a, B:109:0x045b, B:109:0x045b, B:115:0x049f, B:115:0x049f, B:117:0x04eb, B:117:0x04eb, B:119:0x04f6, B:119:0x04f6, B:122:0x0211, B:122:0x0211, B:123:0x01c1, B:123:0x01c1, B:124:0x0169, B:124:0x0169, B:128:0x0184, B:128:0x0184), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022a A[Catch: NullPointerException | Exception -> 0x0589, NullPointerException | Exception -> 0x0589, TRY_LEAVE, TryCatch #0 {NullPointerException | Exception -> 0x0589, blocks: (B:2:0x0000, B:2:0x0000, B:4:0x0007, B:4:0x0007, B:6:0x0101, B:6:0x0101, B:8:0x0119, B:8:0x0119, B:10:0x012c, B:10:0x012c, B:14:0x0144, B:14:0x0144, B:16:0x015c, B:16:0x015c, B:17:0x019e, B:17:0x019e, B:21:0x01ca, B:21:0x01ca, B:23:0x01e0, B:23:0x01e0, B:25:0x01e7, B:25:0x01e7, B:27:0x0208, B:27:0x0208, B:28:0x021a, B:28:0x021a, B:30:0x022a, B:30:0x022a, B:32:0x0235, B:32:0x0235, B:36:0x0241, B:36:0x0241, B:38:0x024c, B:38:0x024c, B:40:0x0257, B:40:0x0257, B:44:0x0262, B:46:0x0278, B:48:0x028e, B:50:0x02a5, B:53:0x02c6, B:53:0x02c6, B:55:0x0378, B:55:0x0378, B:60:0x0306, B:60:0x0306, B:62:0x0335, B:62:0x0335, B:63:0x033a, B:63:0x033a, B:63:0x033a, B:63:0x033a, B:64:0x033d, B:64:0x033d, B:66:0x038a, B:66:0x038a, B:68:0x0395, B:68:0x0395, B:71:0x039e, B:71:0x039e, B:72:0x0501, B:72:0x0501, B:76:0x050a, B:76:0x050a, B:78:0x0515, B:78:0x0515, B:84:0x03a8, B:84:0x03a8, B:86:0x03b3, B:86:0x03b3, B:90:0x03bf, B:90:0x03bf, B:92:0x03ca, B:92:0x03ca, B:94:0x03d5, B:94:0x03d5, B:98:0x03e0, B:98:0x03e0, B:100:0x03f6, B:100:0x03f6, B:102:0x040c, B:102:0x040c, B:104:0x0423, B:104:0x0423, B:106:0x043a, B:106:0x043a, B:109:0x045b, B:109:0x045b, B:115:0x049f, B:115:0x049f, B:117:0x04eb, B:117:0x04eb, B:119:0x04f6, B:119:0x04f6, B:122:0x0211, B:122:0x0211, B:123:0x01c1, B:123:0x01c1, B:124:0x0169, B:124:0x0169, B:128:0x0184, B:128:0x0184), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03a8 A[Catch: NullPointerException | Exception -> 0x0589, NullPointerException | Exception -> 0x0589, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NullPointerException | Exception -> 0x0589, blocks: (B:2:0x0000, B:2:0x0000, B:4:0x0007, B:4:0x0007, B:6:0x0101, B:6:0x0101, B:8:0x0119, B:8:0x0119, B:10:0x012c, B:10:0x012c, B:14:0x0144, B:14:0x0144, B:16:0x015c, B:16:0x015c, B:17:0x019e, B:17:0x019e, B:21:0x01ca, B:21:0x01ca, B:23:0x01e0, B:23:0x01e0, B:25:0x01e7, B:25:0x01e7, B:27:0x0208, B:27:0x0208, B:28:0x021a, B:28:0x021a, B:30:0x022a, B:30:0x022a, B:32:0x0235, B:32:0x0235, B:36:0x0241, B:36:0x0241, B:38:0x024c, B:38:0x024c, B:40:0x0257, B:40:0x0257, B:44:0x0262, B:46:0x0278, B:48:0x028e, B:50:0x02a5, B:53:0x02c6, B:53:0x02c6, B:55:0x0378, B:55:0x0378, B:60:0x0306, B:60:0x0306, B:62:0x0335, B:62:0x0335, B:63:0x033a, B:63:0x033a, B:63:0x033a, B:63:0x033a, B:64:0x033d, B:64:0x033d, B:66:0x038a, B:66:0x038a, B:68:0x0395, B:68:0x0395, B:71:0x039e, B:71:0x039e, B:72:0x0501, B:72:0x0501, B:76:0x050a, B:76:0x050a, B:78:0x0515, B:78:0x0515, B:84:0x03a8, B:84:0x03a8, B:86:0x03b3, B:86:0x03b3, B:90:0x03bf, B:90:0x03bf, B:92:0x03ca, B:92:0x03ca, B:94:0x03d5, B:94:0x03d5, B:98:0x03e0, B:98:0x03e0, B:100:0x03f6, B:100:0x03f6, B:102:0x040c, B:102:0x040c, B:104:0x0423, B:104:0x0423, B:106:0x043a, B:106:0x043a, B:109:0x045b, B:109:0x045b, B:115:0x049f, B:115:0x049f, B:117:0x04eb, B:117:0x04eb, B:119:0x04f6, B:119:0x04f6, B:122:0x0211, B:122:0x0211, B:123:0x01c1, B:123:0x01c1, B:124:0x0169, B:124:0x0169, B:128:0x0184, B:128:0x0184), top: B:1:0x0000 }] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m16892B0() {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlow.m16892B0():boolean");
    }

    /* renamed from: C0 */
    public final void m16893C0() {
        View view;
        int i10 = 8;
        if (SharepreferenceDBHandler.m15373f(this.f19385d).equals("m3u")) {
            if (this.f19402u == null || this.f19379C == 0) {
                ProgressBar progressBar = this.pbLoader;
                if (progressBar == null) {
                    return;
                }
                progressBar.setVisibility(8);
                view = this.rl_no_arrangement_found;
                i10 = 0;
            } else {
                this.f19396o = new VodAdapterNewFlow(this.f19382F, this.f19385d);
                this.myRecyclerView.setItemAnimator(new C0704c());
                this.myRecyclerView.setAdapter(this.f19396o);
                view = this.pbLoader;
                if (view == null) {
                    return;
                }
            }
        } else {
            if (this.f19402u == null) {
                return;
            }
            this.f19396o = new VodAdapterNewFlow(this.f19382F, this.f19385d);
            this.myRecyclerView.setItemAnimator(new C0704c());
            this.myRecyclerView.setAdapter(this.f19396o);
            view = this.pbLoader;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(i10);
    }

    /* renamed from: D0 */
    public final void m16894D0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f19405x = popupWindow;
            popupWindow.setContentView(inflate);
            this.f19405x.setWidth(-1);
            this.f19405x.setHeight(-1);
            this.f19405x.setFocusable(true);
            this.f19405x.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            RadioButton radioButton5 = (RadioButton) inflate.findViewById(2131428898);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) inflate.findViewById(2131428899);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3315m(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3315m(this, radioButton2));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3315m(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3315m(this, radioButton4));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3315m(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3315m(this, radioButton6));
            String m15343G = SharepreferenceDBHandler.m15343G(activity);
            if (m15343G.equals("1")) {
                radioButton3.setChecked(true);
            } else if (m15343G.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3304b(this));
            button.setOnClickListener(new ViewOnClickListenerC3305c(this, radioGroup, inflate, activity));
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
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        VodAdapterNewFlow vodAdapterNewFlow = this.f19396o;
        if (vodAdapterNewFlow != null && (progressBar = f19376I) != null) {
            vodAdapterNewFlow.m17558r0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428153) {
            this.f19378B = new AsyncTaskC3316n(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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
        m16891A0();
        setContentView(2131624099);
        ButterKnife.m5626a(this);
        this.f19385d = this;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        C5251a.f30021T = Boolean.FALSE;
        m16895w0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        Handler handler = new Handler();
        this.f19406y = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f19393l = new ArrayList<>();
        this.f19394m = new ArrayList<>();
        this.f19391j = new LiveStreamDBHandler(this.f19385d);
        this.myRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f19387f = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setVisibility(0);
        this.f19378B = new AsyncTaskC3316n(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.home.setOnClickListener(new ViewOnClickListenerC3306d(this));
        this.frameLayout.setVisibility(8);
        this.logo.setOnClickListener(new ViewOnClickListenerC3307e(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3308f(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689495);
        this.f19377A = menu;
        this.f19407z = menu.getItem(2).getSubMenu().findItem(2131427886);
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
        AsyncTask asyncTask = this.f19378B;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f19378B.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f19377A;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f19407z = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f19385d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3310h(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3309g(this)).m865m();
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19385d.getResources().getString(2132017514));
            aVar.m857e(this.f19385d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19385d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3311i(this));
            aVar.m858f(this.f19385d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3312j(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f19385d.getResources().getString(2132017514));
            aVar2.m857e(this.f19385d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f19385d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3313k(this));
            aVar2.m858f(this.f19385d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3314l(this));
            aVar2.m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f19397p = searchView;
            searchView.setQueryHint(getResources().getString(2132018527));
            this.f19397p.setIconifiedByDefault(false);
            this.f19397p.setOnQueryTextListener(new C3303a(this));
        }
        if (itemId == 2131428645) {
            m16894D0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16891A0();
        super.onResume();
        C5255e.m26233f(this.f19385d);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        VodAdapterNewFlow vodAdapterNewFlow = this.f19396o;
        if (vodAdapterNewFlow != null) {
            vodAdapterNewFlow.m17558r0(f19376I);
            this.f19396o.m4099w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19386e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19386e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16891A0();
    }

    /* renamed from: w0 */
    public final void m16895w0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: x0 */
    public final ArrayList<String> m16896x0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f19391j.m15232m1(SharepreferenceDBHandler.m15337A(this.f19385d));
        this.f19399r = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f19398q.add(next.m15291b());
                }
            }
        }
        return this.f19398q;
    }

    /* renamed from: z0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m16897z0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f19400s) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f19400s;
    }
}
