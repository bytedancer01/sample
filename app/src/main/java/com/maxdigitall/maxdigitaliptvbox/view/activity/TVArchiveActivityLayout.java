package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveLiveChannelsAdapterNewFlow;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout.class */
public class TVArchiveActivityLayout extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: A */
    public SharedPreferences.Editor f18977A;

    /* renamed from: B */
    public SharedPreferences f18978B;

    /* renamed from: C */
    public SharedPreferences.Editor f18979C;

    /* renamed from: D */
    public PopupWindow f18980D;

    /* renamed from: E */
    public TVArchiveLiveChannelsAdapterNewFlow f18981E;

    /* renamed from: F */
    public GridLayoutManager f18982F;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f18984d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f18985e;

    /* renamed from: i */
    public LiveStreamDBHandler f18989i;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: k */
    public SearchView f18991k;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public RecyclerView.AbstractC0685p f18994n;

    /* renamed from: o */
    public SharedPreferences f18995o;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public DatabaseHandler f18997q;

    /* renamed from: r */
    public LiveStreamsAdapter f18998r;

    /* renamed from: t */
    public ArrayList<PasswordStatusDBModel> f19000t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    /* renamed from: u */
    public ArrayList<LiveStreamsDBModel> f19001u;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f19002v;

    /* renamed from: w */
    public ArrayList<LiveStreamsDBModel> f19003w;

    /* renamed from: x */
    public ArrayList<LiveStreamsDBModel> f19004x;

    /* renamed from: y */
    public ArrayList<LiveStreamsDBModel> f19005y;

    /* renamed from: z */
    public SharedPreferences f19006z;

    /* renamed from: f */
    public String f18986f = "";

    /* renamed from: g */
    public String f18987g = "";

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f18988h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f18990j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: l */
    public String f18992l = "";

    /* renamed from: m */
    public String f18993m = "";

    /* renamed from: p */
    public ArrayList<LiveStreamsDBModel> f18996p = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<String> f18999s = new ArrayList<>();

    /* renamed from: G */
    public Thread f18983G = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$a.class */
    public class DialogInterfaceOnClickListenerC3195a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19007b;

        public DialogInterfaceOnClickListenerC3195a(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19007b = tVArchiveActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$b.class */
    public class ViewOnClickListenerC3196b implements View.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19008b;

        public ViewOnClickListenerC3196b(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19008b = tVArchiveActivityLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19008b.f18980D.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$c.class */
    public class ViewOnClickListenerC3197c implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f19009b;

        /* renamed from: c */
        public final View f19010c;

        /* renamed from: d */
        public final TVArchiveActivityLayout f19011d;

        public ViewOnClickListenerC3197c(TVArchiveActivityLayout tVArchiveActivityLayout, RadioGroup radioGroup, View view) {
            this.f19011d = tVArchiveActivityLayout;
            this.f19009b = radioGroup;
            this.f19010c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f19010c.findViewById(this.f19009b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f19011d.getResources().getString(2132018611))) {
                editor = this.f19011d.f18979C;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f19011d.getResources().getString(2132018607))) {
                editor = this.f19011d.f18979C;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f19011d.getResources().getString(2132018615))) {
                editor = this.f19011d.f18979C;
                str = "3";
            } else {
                editor = this.f19011d.f18979C;
                str = "0";
            }
            editor.putString("sort", str);
            this.f19011d.f18979C.apply();
            TVArchiveActivityLayout tVArchiveActivityLayout = this.f19011d;
            tVArchiveActivityLayout.f19006z = tVArchiveActivityLayout.getSharedPreferences("listgridview", 0);
            int i10 = this.f19011d.f19006z.getInt("livestream", 0);
            C5251a.f30068u = i10;
            if (i10 == 1) {
                this.f19011d.m16737F0();
            } else {
                this.f19011d.m16738G0();
            }
            this.f19011d.f18980D.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$d.class */
    public class ViewOnClickListenerC3198d implements View.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19012b;

        public ViewOnClickListenerC3198d(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19012b = tVArchiveActivityLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19012b.f18984d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$e.class */
    public class ViewOnClickListenerC3199e implements View.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19013b;

        public ViewOnClickListenerC3199e(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19013b = tVArchiveActivityLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19013b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$f.class */
    public class RunnableC3200f implements Runnable {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19014b;

        public RunnableC3200f(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19014b = tVArchiveActivityLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f19014b.f18984d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f19014b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f19014b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$g.class */
    public class DialogInterfaceOnClickListenerC3201g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19015b;

        public DialogInterfaceOnClickListenerC3201g(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19015b = tVArchiveActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$h.class */
    public class DialogInterfaceOnClickListenerC3202h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19016b;

        public DialogInterfaceOnClickListenerC3202h(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19016b = tVArchiveActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19016b.f18984d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$i.class */
    public class C3203i implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final TVArchiveActivityLayout f19017a;

        public C3203i(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19017a = tVArchiveActivityLayout;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f19017a.tvNoRecordFound.setVisibility(8);
            if (this.f19017a.f18998r == null || (textView = this.f19017a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19017a.f18998r.m17178l0(str, this.f19017a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$j.class */
    public class DialogInterfaceOnClickListenerC3204j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19018b;

        public DialogInterfaceOnClickListenerC3204j(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19018b = tVArchiveActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19018b.f18984d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$k.class */
    public class DialogInterfaceOnClickListenerC3205k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19019b;

        public DialogInterfaceOnClickListenerC3205k(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19019b = tVArchiveActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$l.class */
    public class DialogInterfaceOnClickListenerC3206l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19020b;

        public DialogInterfaceOnClickListenerC3206l(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19020b = tVArchiveActivityLayout;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout$m.class */
    public class RunnableC3207m implements Runnable {

        /* renamed from: b */
        public final TVArchiveActivityLayout f19021b;

        public RunnableC3207m(TVArchiveActivityLayout tVArchiveActivityLayout) {
            this.f19021b = tVArchiveActivityLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f19021b.m16732A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: A0 */
    public void m16732A0() {
        runOnUiThread(new RunnableC3200f(this));
    }

    /* renamed from: B0 */
    public void m16733B0() {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        this.f18996p.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f18998r);
        }
        if (this.f18984d != null) {
            DatabaseHandler databaseHandler = new DatabaseHandler(this.f18984d);
            this.f18997q = databaseHandler;
            Iterator<FavouriteDBModel> it = databaseHandler.m15116v("live", SharepreferenceDBHandler.m15337A(this.f18984d)).iterator();
            while (it.hasNext()) {
                FavouriteDBModel next = it.next();
                this.f18996p.add(new LiveStreamDBHandler(this.f18984d).m15179M1(next.m14760a(), String.valueOf(next.m14764e())));
            }
            m16742b();
            if (this.myRecyclerView != null && (arrayList2 = this.f18996p) != null && arrayList2.size() != 0) {
                LiveStreamsAdapter liveStreamsAdapter = new LiveStreamsAdapter(this.f18996p, this.f18984d);
                this.f18998r = liveStreamsAdapter;
                this.myRecyclerView.setAdapter(liveStreamsAdapter);
                this.f18998r.m4099w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f18996p) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f18998r);
            }
            this.tvNoStream.setText(getResources().getString(2132018201));
            this.tvNoStream.setVisibility(0);
        }
    }

    /* renamed from: C0 */
    public final ArrayList<String> m16734C0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18989i.m15232m1(SharepreferenceDBHandler.m15337A(this.f18984d));
        this.f19000t = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18999s.add(next.m15291b());
                }
            }
        }
        return this.f18999s;
    }

    /* renamed from: D0 */
    public final ArrayList<LiveStreamsDBModel> m16735D0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        ArrayList<LiveStreamsDBModel> arrayList3;
        if (arrayList == null) {
            return null;
        }
        Iterator<LiveStreamsDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel next = it.next();
            if (arrayList2 != null) {
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14827g().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10 && (arrayList3 = this.f19001u) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f19001u;
    }

    /* renamed from: E0 */
    public void m16736E0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: F0 */
    public final void m16737F0() {
        this.f18984d = this;
        this.f18989i = new LiveStreamDBHandler(this.f18984d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18984d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f18984d, C5255e.m26257x(this.f18984d) + 1);
        this.f18994n = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f18995o = this.f18984d.getSharedPreferences("loginPrefs", 0);
        m16740I0();
    }

    /* renamed from: G0 */
    public final void m16738G0() {
        this.f18984d = this;
        this.f18989i = new LiveStreamDBHandler(this.f18984d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18984d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f18984d);
        this.f18994n = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f18995o = this.f18984d.getSharedPreferences("loginPrefs", 0);
        m16740I0();
    }

    /* renamed from: H0 */
    public void m16739H0(ArrayList<LiveStreamsDBModel> arrayList) {
        this.f18981E = new TVArchiveLiveChannelsAdapterNewFlow(arrayList, this.f18984d);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        this.f18982F = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.myRecyclerView.setAdapter(this.f18981E);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* renamed from: I0 */
    public final void m16740I0() {
        try {
            if (this.f18984d != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f18984d);
                this.f19000t = new ArrayList<>();
                this.f19001u = new ArrayList<>();
                this.f19002v = new ArrayList<>();
                this.f19003w = new ArrayList<>();
                this.f19004x = new ArrayList<>();
                this.f19005y = new ArrayList<>();
                ArrayList<LiveStreamsDBModel> m15212d1 = liveStreamDBHandler.m15212d1(this.f18992l);
                Log.e("channelAvailable size", " >>>>>>>> " + m15212d1.size());
                Log.e("channelAvailable", " >>>>>>>> " + m15212d1.toString());
                if (liveStreamDBHandler.m15189R1(SharepreferenceDBHandler.m15337A(this.f18984d)) > 0) {
                    ArrayList<String> m16734C0 = m16734C0();
                    this.f18999s = m16734C0;
                    if (m16734C0 != null) {
                        this.f19002v = m16735D0(m15212d1, m16734C0);
                    }
                    this.f19003w = this.f19002v;
                } else {
                    this.f19003w = m15212d1;
                }
                if (this.f18992l.equals("-1")) {
                    m16742b();
                    return;
                }
                ArrayList<LiveStreamsDBModel> arrayList = this.f19003w;
                if (arrayList != null && this.myRecyclerView != null && arrayList.size() != 0) {
                    m16742b();
                    m16739H0(this.f19003w);
                    return;
                }
                m16742b();
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J0 */
    public final void m16741J0(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f18980D = popupWindow;
            popupWindow.setContentView(inflate);
            boolean z10 = -1;
            this.f18980D.setWidth(-1);
            this.f18980D.setHeight(-1);
            this.f18980D.setFocusable(true);
            this.f18980D.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            String string = this.f18978B.getString("sort", "");
            switch (string.hashCode()) {
                case 49:
                    if (string.equals("1")) {
                        z10 = false;
                        break;
                    }
                    break;
                case 50:
                    if (string.equals("2")) {
                        z10 = true;
                        break;
                    }
                    break;
                case 51:
                    if (string.equals("3")) {
                        z10 = 2;
                        break;
                    }
                    break;
            }
            if (!z10) {
                radioButton2.setChecked(true);
            } else if (z10) {
                radioButton3.setChecked(true);
            } else if (z10 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3196b(this));
            button.setOnClickListener(new ViewOnClickListenerC3197c(this, radioGroup, inflate));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: b */
    public void m16742b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.myRecyclerView.setClickable(true);
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
        this.f18984d = this;
        m16736E0();
        super.onCreate(bundle);
        setContentView(2131624077);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f18978B = sharedPreferences;
        this.f18979C = sharedPreferences.edit();
        if (this.f18978B.getString("sort", "").equals("")) {
            this.f18979C.putString("sort", "0");
            this.f18979C.apply();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f18992l = intent.getStringExtra("category_id");
            this.f18993m = intent.getStringExtra("category_name");
        }
        this.f18989i = new LiveStreamDBHandler(this.f18984d);
        SharedPreferences sharedPreferences2 = getSharedPreferences("listgridview", 0);
        this.f19006z = sharedPreferences2;
        C5251a.f30068u = sharedPreferences2.getInt("livestream", 0);
        this.logo.setOnClickListener(new ViewOnClickListenerC3198d(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3199e(this));
        if (C5251a.f30068u == 1) {
            m16737F0();
        } else {
            m16738G0();
        }
        if (this.f18992l.equals("-1")) {
            m16733B0();
        }
        m16743z0();
        m878n0((Toolbar) findViewById(2131429320));
        this.f18984d = this;
        Thread thread = this.f18983G;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3207m(this));
            this.f18983G = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689497);
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

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f18984d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3202h(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3201g(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f18991k = searchView;
            searchView.setQueryHint(getResources().getString(2132018514));
            this.f18991k.setIconifiedByDefault(false);
            this.f18991k.setOnQueryTextListener(new C3203i(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18984d.getResources().getString(2132017514));
            aVar.m857e(this.f18984d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18984d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3204j(this));
            aVar.m858f(this.f18984d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3205k(this));
            aVar.m865m();
        }
        if (itemId == 2131428640) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18984d.getResources().getString(2132017514));
            aVar2.m857e(this.f18984d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18984d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3206l(this));
            aVar2.m858f(this.f18984d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3195a(this));
            aVar2.m865m();
        }
        if (itemId == 2131428252) {
            this.f18977A.putInt("livestream", 1);
            this.f18977A.commit();
            m16737F0();
        }
        if (itemId == 2131428256) {
            this.f18977A.putInt("livestream", 0);
            this.f18977A.commit();
            m16738G0();
        }
        if (itemId == 2131428645) {
            m16741J0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18983G;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18983G.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16736E0();
        super.onResume();
        Thread thread = this.f18983G;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3207m(this));
            this.f18983G = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f18984d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18985e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18985e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f18984d != null) {
            m16742b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16736E0();
    }

    /* renamed from: z0 */
    public final void m16743z0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }
}
