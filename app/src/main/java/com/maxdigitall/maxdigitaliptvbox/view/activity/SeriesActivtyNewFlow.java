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
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5859l;
import p203lf.C5868u;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow.class */
public class SeriesActivtyNewFlow extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: C */
    public static ProgressBar f18368C;

    /* renamed from: A */
    public Boolean f18369A;

    /* renamed from: B */
    public Boolean f18370B;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f18371d;

    /* renamed from: e */
    public SharedPreferences f18372e;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f18373f;

    @BindView
    public FrameLayout frameLayout;

    @BindView
    public TextView home;

    /* renamed from: j */
    public C5868u f18377j;

    /* renamed from: k */
    public SearchView f18378k;

    /* renamed from: l */
    public Handler f18379l;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public MenuItem f18380m;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public Menu f18381n;

    /* renamed from: o */
    public LiveStreamDBHandler f18382o;

    /* renamed from: p */
    public ArrayList<PasswordStatusDBModel> f18383p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;

    /* renamed from: q */
    public ArrayList<LiveStreamCategoryIdDBModel> f18384q;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f18385r;

    @BindView
    public RelativeLayout rl_vod_layout;

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f18386s;

    /* renamed from: t */
    public ArrayList<LiveStreamCategoryIdDBModel> f18387t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    /* renamed from: v */
    public PopupWindow f18389v;

    /* renamed from: x */
    public SeriesRecentWatchDatabase f18391x;

    /* renamed from: z */
    public List<Object> f18393z;

    /* renamed from: g */
    public String f18374g = "";

    /* renamed from: h */
    public String f18375h = "";

    /* renamed from: i */
    public DatabaseUpdatedStatusDBModel f18376i = new DatabaseUpdatedStatusDBModel();

    /* renamed from: u */
    public int f18388u = -1;

    /* renamed from: w */
    public ArrayList<String> f18390w = new ArrayList<>();

    /* renamed from: y */
    public ArrayList<NativeAd> f18392y = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$a.class */
    public class C3046a implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final SeriesActivtyNewFlow f18394a;

        public C3046a(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18394a = seriesActivtyNewFlow;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            C5251a.f30021T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            this.f18394a.tvNoRecordFound.setVisibility(8);
            if (this.f18394a.f18377j == null || (textView = this.f18394a.tvNoRecordFound) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f18394a.f18377j.m28625l0(str, this.f18394a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$b.class */
    public class ViewOnClickListenerC3047b implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18395b;

        public ViewOnClickListenerC3047b(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18395b = seriesActivtyNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18395b.f18389v.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$c.class */
    public class ViewOnClickListenerC3048c implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f18396b;

        /* renamed from: c */
        public final View f18397c;

        /* renamed from: d */
        public final Activity f18398d;

        /* renamed from: e */
        public final SeriesActivtyNewFlow f18399e;

        public ViewOnClickListenerC3048c(SeriesActivtyNewFlow seriesActivtyNewFlow, RadioGroup radioGroup, View view, Activity activity) {
            this.f18399e = seriesActivtyNewFlow;
            this.f18396b = radioGroup;
            this.f18397c = view;
            this.f18398d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f18397c.findViewById(this.f18396b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f18399e.getResources().getString(2132018607))) {
                activity = this.f18398d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f18399e.getResources().getString(2132018615))) {
                activity = this.f18398d;
                str = "2";
            } else {
                activity = this.f18398d;
                str = "0";
            }
            SharepreferenceDBHandler.m15392o0(str, activity);
            this.f18399e.f18389v.dismiss();
            new AsyncTaskC3058m(this.f18399e).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$d.class */
    public class ViewOnClickListenerC3049d implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18400b;

        public ViewOnClickListenerC3049d(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18400b = seriesActivtyNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18400b.f18371d.startActivity(new Intent(this.f18400b.f18371d, (Class<?>) NewDashboardActivity.class));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$e.class */
    public class ViewOnClickListenerC3050e implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18401b;

        public ViewOnClickListenerC3050e(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18401b = seriesActivtyNewFlow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18401b.f18371d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$f.class */
    public class DialogInterfaceOnClickListenerC3051f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18402b;

        public DialogInterfaceOnClickListenerC3051f(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18402b = seriesActivtyNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$g.class */
    public class DialogInterfaceOnClickListenerC3052g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18403b;

        public DialogInterfaceOnClickListenerC3052g(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18403b = seriesActivtyNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18403b.f18371d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$h.class */
    public class DialogInterfaceOnClickListenerC3053h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18404b;

        public DialogInterfaceOnClickListenerC3053h(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18404b = seriesActivtyNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18404b.f18371d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$i.class */
    public class DialogInterfaceOnClickListenerC3054i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18405b;

        public DialogInterfaceOnClickListenerC3054i(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18405b = seriesActivtyNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$j.class */
    public class DialogInterfaceOnClickListenerC3055j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18406b;

        public DialogInterfaceOnClickListenerC3055j(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18406b = seriesActivtyNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$k.class */
    public class DialogInterfaceOnClickListenerC3056k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivtyNewFlow f18407b;

        public DialogInterfaceOnClickListenerC3056k(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18407b = seriesActivtyNewFlow;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$l.class */
    public class ViewOnFocusChangeListenerC3057l implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18408b;

        /* renamed from: c */
        public final SeriesActivtyNewFlow f18409c;

        public ViewOnFocusChangeListenerC3057l(SeriesActivtyNewFlow seriesActivtyNewFlow, View view) {
            this.f18409c = seriesActivtyNewFlow;
            this.f18408b = view;
        }

        /* renamed from: a */
        public final void m16505a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18408b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16506b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18408b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16507c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18408b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16506b(1.15f);
                m16507c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16506b(1.0f);
                m16507c(1.0f);
                m16505a(z10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$m.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivtyNewFlow$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow$m.class */
    public class AsyncTaskC3058m extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final SeriesActivtyNewFlow f18410a;

        public AsyncTaskC3058m(SeriesActivtyNewFlow seriesActivtyNewFlow) {
            this.f18410a = seriesActivtyNewFlow;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f18410a.m16499C0();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!new C6783a(this.f18410a.f18371d).m31288z().equals(C5251a.f30065s0) && this.f18410a.f18369A.booleanValue()) {
                this.f18410a.m16498B0();
            } else {
                this.f18410a.m16500D0();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public SeriesActivtyNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f18369A = bool;
        this.f18370B = bool;
    }

    /* renamed from: A0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m16497A0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
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
                if (!z10 && (arrayList3 = this.f18384q) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f18384q;
    }

    /* renamed from: B0 */
    public final void m16498B0() {
        if (this.f18392y.size() <= 0) {
            m16500D0();
            return;
        }
        List<Object> list = this.f18393z;
        if (list != null && list.size() > 0) {
            Iterator<Object> it = this.f18393z.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof NativeAd) {
                    Log.e("ads", "ads already exists");
                    m16500D0();
                    return;
                }
            }
            int size = this.f18393z.size() / this.f18392y.size();
            Iterator<NativeAd> it2 = this.f18392y.iterator();
            int i10 = size;
            while (it2.hasNext()) {
                try {
                    this.f18393z.add(i10, it2.next());
                    i10 += size;
                } catch (Exception e10) {
                }
            }
        }
        m16500D0();
    }

    /* renamed from: C0 */
    public final Boolean m16499C0() {
        try {
            if (this.f18371d != null) {
                this.f18384q = new ArrayList<>();
                this.f18385r = new ArrayList<>();
                this.f18393z = new ArrayList();
                this.myRecyclerView.setVisibility(0);
                this.f18382o = new LiveStreamDBHandler(this.f18371d);
                this.f18383p = new ArrayList<>();
                this.f18386s = new ArrayList<>();
                this.f18387t = new ArrayList<>();
                this.f18387t = this.f18382o.m15249s1();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
                liveStreamCategoryIdDBModel.m14792g("0");
                liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132017297));
                liveStreamCategoryIdDBModel2.m14792g("-1");
                liveStreamCategoryIdDBModel2.m14793h(getResources().getString(2132017779));
                this.f18388u = this.f18382o.m15220g2("-5");
                this.f18391x = new SeriesRecentWatchDatabase(this.f18371d);
                int i10 = this.f18388u;
                if (i10 != 0 && i10 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("-5");
                    liveStreamCategoryIdDBModel3.m14793h(getResources().getString(2132018731));
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f18387t;
                    arrayList.add(arrayList.size(), liveStreamCategoryIdDBModel3);
                }
                liveStreamCategoryIdDBModel4.m14792g("-4");
                liveStreamCategoryIdDBModel4.m14793h(getResources().getString(2132018438));
                if (this.f18382o.m15189R1(SharepreferenceDBHandler.m15337A(this.f18371d)) > 0 && this.f18387t != null) {
                    ArrayList<String> m16504z0 = m16504z0();
                    this.f18390w = m16504z0;
                    ArrayList<LiveStreamCategoryIdDBModel> m16497A0 = m16497A0(this.f18387t, m16504z0);
                    this.f18385r = m16497A0;
                    this.f18387t = m16497A0;
                }
                this.f18387t.add(0, liveStreamCategoryIdDBModel);
                this.f18387t.add(1, liveStreamCategoryIdDBModel2);
                liveStreamCategoryIdDBModel4.m14792g("-4");
                liveStreamCategoryIdDBModel4.m14793h(getResources().getString(2132018438));
                this.f18387t.add(2, liveStreamCategoryIdDBModel4);
                if (this.f18387t != null) {
                    for (int i11 = 0; i11 < this.f18387t.size(); i11++) {
                        this.f18393z.add(new C5859l(this.f18387t.get(i11).m14788c(), this.f18387t.get(i11).m14787b(), this.f18387t.get(i11).m14786a(), this.f18387t.get(i11).m14789d(), this.f18387t.get(i11).m14790e()));
                    }
                }
            }
            return Boolean.TRUE;
        } catch (NullPointerException e10) {
            return Boolean.FALSE;
        } catch (Exception e11) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: D0 */
    public final void m16500D0() {
        if (this.f18387t != null) {
            this.f18377j = new C5868u(this.f18393z, this.f18371d);
            this.myRecyclerView.setItemAnimator(new C0704c());
            this.myRecyclerView.setAdapter(this.f18377j);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: E0 */
    public final void m16501E0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f18389v = popupWindow;
            popupWindow.setContentView(inflate);
            boolean z10 = -1;
            this.f18389v.setWidth(-1);
            this.f18389v.setHeight(-1);
            this.f18389v.setFocusable(true);
            this.f18389v.showAtLocation(inflate, 17, 0, 0);
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
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3057l(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3057l(this, radioButton2));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3057l(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3057l(this, radioButton4));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3057l(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3057l(this, radioButton6));
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
            button2.setOnClickListener(new ViewOnClickListenerC3047b(this));
            button.setOnClickListener(new ViewOnClickListenerC3048c(this, radioGroup, inflate, activity));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: b */
    public void m16502b() {
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
        C5868u c5868u = this.f18377j;
        if (c5868u != null && (progressBar = f18368C) != null) {
            c5868u.m28629p0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428153) {
            new AsyncTaskC3058m(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id2 != 2131429468) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @SuppressLint({"ApplySharedPref"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624050);
        ButterKnife.m5626a(this);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        C5251a.f30021T = Boolean.FALSE;
        m16503x0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        this.f18371d = this;
        Handler handler = new Handler();
        this.f18379l = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.myRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f18373f = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setVisibility(0);
        new AsyncTaskC3058m(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.home.setOnClickListener(new ViewOnClickListenerC3049d(this));
        this.frameLayout.setVisibility(8);
        this.logo.setOnClickListener(new ViewOnClickListenerC3050e(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689495);
        this.f18381n = menu;
        this.f18380m = menu.getItem(2).getSubMenu().findItem(2131427886);
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
        Menu menu = this.f18381n;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f18380m = menuItem;
        this.toolbar.m1205e();
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f18371d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3052g(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3051f(this)).m865m();
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18371d.getResources().getString(2132017514));
            aVar.m857e(this.f18371d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18371d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3053h(this));
            aVar.m858f(this.f18371d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3054i(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18371d.getResources().getString(2132017514));
            aVar2.m857e(this.f18371d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18371d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3055j(this));
            aVar2.m858f(this.f18371d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3056k(this));
            aVar2.m865m();
        }
        if (itemId != 2131427425) {
            if (itemId == 2131428645) {
                m16501E0(this);
                m16502b();
            }
            return super.onOptionsItemSelected(menuItem);
        }
        SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
        this.f18378k = searchView;
        searchView.setQueryHint(getResources().getString(2132018524));
        this.f18378k.setIconifiedByDefault(false);
        this.f18378k.setOnQueryTextListener(new C3046a(this));
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        C5255e.m26233f(this.f18371d);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C5868u c5868u = this.f18377j;
        if (c5868u != null && (progressBar = f18368C) != null) {
            c5868u.m28629p0(progressBar);
            this.f18377j.m4099w();
        }
        C5868u c5868u2 = this.f18377j;
        if (c5868u2 != null) {
            c5868u2.m4099w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18372e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18372e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f18371d != null) {
            m16502b();
        }
    }

    /* renamed from: x0 */
    public final void m16503x0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: z0 */
    public final ArrayList<String> m16504z0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18382o.m15232m1(SharepreferenceDBHandler.m15337A(this.f18371d));
        this.f18383p = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18390w.add(next.m15291b());
                }
            }
        }
        return this.f18390w;
    }
}
