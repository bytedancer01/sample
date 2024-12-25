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
import android.util.Log;
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
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5868u;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U.class */
public class SeriesActivityNewFlowM3U extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: H */
    public static ProgressBar f18250H;

    /* renamed from: A */
    public Menu f18251A;

    /* renamed from: E */
    public List<Object> f18255E;

    /* renamed from: F */
    public Boolean f18256F;

    /* renamed from: G */
    public Boolean f18257G;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button bt_explore_all;

    /* renamed from: d */
    public Context f18258d;

    /* renamed from: e */
    public SharedPreferences f18259e;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f18260f;

    @BindView
    public FrameLayout frameLayout;

    @BindView
    public TextView home;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public LiveStreamDBHandler f18264j;

    /* renamed from: l */
    public ArrayList<LiveStreamCategoryIdDBModel> f18266l;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public ArrayList<LiveStreamCategoryIdDBModel> f18267m;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public C5868u f18268n;

    /* renamed from: o */
    public SearchView f18269o;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;

    /* renamed from: q */
    public ArrayList<PasswordStatusDBModel> f18271q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f18272r;

    @BindView
    public RelativeLayout rl_no_arrangement_found;

    @BindView
    public RelativeLayout rl_vod_layout;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f18273s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f18274t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvSettings;

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f18275u;

    /* renamed from: v */
    public ArrayList<LiveStreamCategoryIdDBModel> f18276v;

    /* renamed from: x */
    public PopupWindow f18278x;

    /* renamed from: y */
    public Handler f18279y;

    /* renamed from: z */
    public MenuItem f18280z;

    /* renamed from: g */
    public String f18261g = "";

    /* renamed from: h */
    public String f18262h = "";

    /* renamed from: i */
    public DatabaseUpdatedStatusDBModel f18263i = new DatabaseUpdatedStatusDBModel();

    /* renamed from: k */
    public DatabaseUpdatedStatusDBModel f18265k = new DatabaseUpdatedStatusDBModel();

    /* renamed from: p */
    public ArrayList<String> f18270p = new ArrayList<>();

    /* renamed from: w */
    public int f18277w = -1;

    /* renamed from: B */
    public AsyncTask f18252B = null;

    /* renamed from: C */
    public int f18253C = 0;

    /* renamed from: D */
    public ArrayList<NativeAd> f18254D = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$a.class */
    public class DialogInterfaceOnClickListenerC3012a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18281b;

        public DialogInterfaceOnClickListenerC3012a(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18281b = seriesActivityNewFlowM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$b.class */
    public class C3013b implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final SeriesActivityNewFlowM3U f18282a;

        public C3013b(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18282a = seriesActivityNewFlowM3U;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f18282a.tvNoRecordFound.setVisibility(8);
            if (this.f18282a.f18268n == null || (textView = this.f18282a.tvNoRecordFound) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f18282a.f18268n.m28625l0(str, this.f18282a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$c.class */
    public class ViewOnClickListenerC3014c implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18283b;

        public ViewOnClickListenerC3014c(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18283b = seriesActivityNewFlowM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18283b.f18278x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$d.class */
    public class ViewOnClickListenerC3015d implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f18284b;

        /* renamed from: c */
        public final View f18285c;

        /* renamed from: d */
        public final Activity f18286d;

        /* renamed from: e */
        public final SeriesActivityNewFlowM3U f18287e;

        public ViewOnClickListenerC3015d(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U, RadioGroup radioGroup, View view, Activity activity) {
            this.f18287e = seriesActivityNewFlowM3U;
            this.f18284b = radioGroup;
            this.f18285c = view;
            this.f18286d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f18285c.findViewById(this.f18284b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f18287e.getResources().getString(2132018607))) {
                activity = this.f18286d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f18287e.getResources().getString(2132018615))) {
                activity = this.f18286d;
                str = "2";
            } else {
                activity = this.f18286d;
                str = "0";
            }
            SharepreferenceDBHandler.m15392o0(str, activity);
            this.f18287e.f18252B = new AsyncTaskC3025n(this.f18287e).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            this.f18287e.f18278x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$e.class */
    public class ViewOnClickListenerC3016e implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18288b;

        public ViewOnClickListenerC3016e(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18288b = seriesActivityNewFlowM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18288b.f18258d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$f.class */
    public class ViewOnClickListenerC3017f implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18289b;

        public ViewOnClickListenerC3017f(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18289b = seriesActivityNewFlowM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18289b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$g.class */
    public class ViewOnClickListenerC3018g implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18290b;

        public ViewOnClickListenerC3018g(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18290b = seriesActivityNewFlowM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18290b.f18258d.startActivity(new Intent(this.f18290b.f18258d, (Class<?>) NewDashboardActivity.class));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$h.class */
    public class DialogInterfaceOnClickListenerC3019h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18291b;

        public DialogInterfaceOnClickListenerC3019h(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18291b = seriesActivityNewFlowM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$i.class */
    public class DialogInterfaceOnClickListenerC3020i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18292b;

        public DialogInterfaceOnClickListenerC3020i(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18292b = seriesActivityNewFlowM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18292b.f18258d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$j.class */
    public class DialogInterfaceOnClickListenerC3021j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18293b;

        public DialogInterfaceOnClickListenerC3021j(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18293b = seriesActivityNewFlowM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18293b.f18258d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$k.class */
    public class DialogInterfaceOnClickListenerC3022k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18294b;

        public DialogInterfaceOnClickListenerC3022k(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18294b = seriesActivityNewFlowM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$l.class */
    public class DialogInterfaceOnClickListenerC3023l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowM3U f18295b;

        public DialogInterfaceOnClickListenerC3023l(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18295b = seriesActivityNewFlowM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$m.class */
    public class ViewOnFocusChangeListenerC3024m implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18296b;

        /* renamed from: c */
        public final SeriesActivityNewFlowM3U f18297c;

        public ViewOnFocusChangeListenerC3024m(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U, View view) {
            this.f18297c = seriesActivityNewFlowM3U;
            this.f18296b = view;
        }

        /* renamed from: a */
        public final void m16445a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18296b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16446b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18296b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16447c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18296b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16446b(1.15f);
                m16447c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16446b(1.0f);
                m16447c(1.0f);
                m16445a(z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$n.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U$n.class */
    public class AsyncTaskC3025n extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final SeriesActivityNewFlowM3U f18298a;

        public AsyncTaskC3025n(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U) {
            this.f18298a = seriesActivityNewFlowM3U;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f18298a.m16441E0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!new C6783a(this.f18298a.f18258d).m31288z().equals(C5251a.f30065s0) && this.f18298a.f18256F.booleanValue()) {
                this.f18298a.m16440D0();
            } else {
                this.f18298a.m16442F0();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public SeriesActivityNewFlowM3U() {
        Boolean bool = Boolean.FALSE;
        this.f18256F = bool;
        this.f18257G = bool;
    }

    /* renamed from: A0 */
    public final ArrayList<String> m16437A0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18264j.m15232m1(SharepreferenceDBHandler.m15337A(this.f18258d));
        this.f18271q = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18270p.add(next.m15291b());
                }
            }
        }
        return this.f18270p;
    }

    /* renamed from: B0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m16438B0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f18272r) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f18272r;
    }

    /* renamed from: C0 */
    public final void m16439C0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: D0 */
    public final void m16440D0() {
        if (this.f18254D.size() <= 0) {
            m16442F0();
            return;
        }
        List<Object> list = this.f18255E;
        if (list != null && list.size() > 0) {
            Iterator<Object> it = this.f18255E.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof NativeAd) {
                    Log.e("ads", "ads already exists");
                    m16442F0();
                    return;
                }
            }
            int size = this.f18255E.size() / this.f18254D.size();
            Iterator<NativeAd> it2 = this.f18254D.iterator();
            int i10 = size;
            while (it2.hasNext()) {
                try {
                    this.f18255E.add(i10, it2.next());
                    i10 += size;
                } catch (Exception e10) {
                }
            }
        }
        m16442F0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x017f, code lost:
    
        if (r12 != null) goto L16;
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m16441E0() {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowM3U.m16441E0():boolean");
    }

    /* renamed from: F0 */
    public final void m16442F0() {
        View view;
        int i10 = 8;
        if (this.f18274t == null || this.f18253C == 0) {
            ProgressBar progressBar = this.pbLoader;
            if (progressBar == null) {
                return;
            }
            progressBar.setVisibility(8);
            view = this.rl_no_arrangement_found;
            i10 = 0;
        } else {
            this.f18268n = new C5868u(this.f18255E, this.f18258d);
            this.myRecyclerView.setItemAnimator(new C0704c());
            this.myRecyclerView.setAdapter(this.f18268n);
            view = this.pbLoader;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(i10);
    }

    /* renamed from: G0 */
    public final void m16443G0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f18278x = popupWindow;
            popupWindow.setContentView(inflate);
            boolean z10 = -1;
            this.f18278x.setWidth(-1);
            this.f18278x.setHeight(-1);
            this.f18278x.setFocusable(true);
            this.f18278x.showAtLocation(inflate, 17, 0, 0);
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
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3024m(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3024m(this, radioButton2));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3024m(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3024m(this, radioButton4));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3024m(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3024m(this, radioButton6));
            String m15345I = SharepreferenceDBHandler.m15345I(activity);
            int hashCode = m15345I.hashCode();
            if (hashCode != 49) {
                if (hashCode == 50 && m15345I.equals("2")) {
                    z10 = true;
                }
            } else if (m15345I.equals("1")) {
                z10 = false;
            }
            if (!z10) {
                radioButton3.setChecked(true);
            } else if (!z10) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3014c(this));
            button.setOnClickListener(new ViewOnClickListenerC3015d(this, radioGroup, inflate, activity));
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
        C5868u c5868u = this.f18268n;
        if (c5868u != null && (progressBar = f18250H) != null) {
            c5868u.m28629p0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428153) {
            this.f18252B = new AsyncTaskC3025n(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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
        m16439C0();
        setContentView(2131624099);
        ButterKnife.m5626a(this);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        TextView textView = this.tvSettings;
        if (textView != null) {
            textView.setText(getResources().getString(2132018545));
        }
        m16444z0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        this.f18258d = this;
        Handler handler = new Handler();
        this.f18279y = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3016e(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3017f(this));
        this.f18264j = new LiveStreamDBHandler(this.f18258d);
        this.myRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f18260f = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setVisibility(0);
        this.f18252B = new AsyncTaskC3025n(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.home.setOnClickListener(new ViewOnClickListenerC3018g(this));
        this.frameLayout.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689495);
        this.f18251A = menu;
        this.f18280z = menu.getItem(2).getSubMenu().findItem(2131427886);
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
        AsyncTask asyncTask = this.f18252B;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f18252B.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f18251A;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f18280z = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f18258d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3020i(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3019h(this)).m865m();
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18258d.getResources().getString(2132017514));
            aVar.m857e(this.f18258d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18258d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3021j(this));
            aVar.m858f(this.f18258d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3022k(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18258d.getResources().getString(2132017514));
            aVar2.m857e(this.f18258d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18258d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3023l(this));
            aVar2.m858f(this.f18258d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3012a(this));
            aVar2.m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f18269o = searchView;
            searchView.setQueryHint(getResources().getString(2132018524));
            this.f18269o.setIconifiedByDefault(false);
            this.f18269o.setOnQueryTextListener(new C3013b(this));
        }
        if (itemId == 2131428645) {
            m16443G0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16439C0();
        super.onResume();
        C5255e.m26233f(this.f18258d);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C5868u c5868u = this.f18268n;
        if (c5868u != null) {
            c5868u.m28629p0(f18250H);
            this.f18268n.m4099w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18259e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18259e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16439C0();
    }

    /* renamed from: z0 */
    public final void m16444z0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }
}
