package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
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
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapterNewFlow;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat.class */
public class SeriesActivitNewFlowSubCat extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: R */
    public static ArrayList<LiveStreamCategoryIdDBModel> f18191R = new ArrayList<>();

    /* renamed from: S */
    public static ArrayList<LiveStreamCategoryIdDBModel> f18192S = new ArrayList<>();

    /* renamed from: T */
    public static ArrayList<LiveStreamCategoryIdDBModel> f18193T = new ArrayList<>();

    /* renamed from: U */
    public static ProgressBar f18194U;

    /* renamed from: A */
    public Handler f18195A;

    /* renamed from: B */
    public MenuItem f18196B;

    /* renamed from: C */
    public Menu f18197C;

    /* renamed from: E */
    public String f18199E;

    /* renamed from: F */
    public ArrayList<SeriesDBModel> f18200F;

    /* renamed from: G */
    public ArrayList<SeriesDBModel> f18201G;

    /* renamed from: H */
    public ArrayList<SeriesDBModel> f18202H;

    /* renamed from: I */
    public ArrayList<PasswordStatusDBModel> f18203I;

    /* renamed from: P */
    public SeriesRecentWatchDatabase f18210P;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f18212d;

    /* renamed from: e */
    public SharedPreferences f18213e;

    /* renamed from: i */
    public LiveStreamDBHandler f18217i;

    /* renamed from: k */
    public ProgressDialog f18219k;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public VodSubCatAdpaterNew f18223o;

    /* renamed from: p */
    public SharedPreferences f18224p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public SharedPreferences.Editor f18225q;

    /* renamed from: r */
    public RecyclerView.AbstractC0685p f18226r;

    @BindView
    public RelativeLayout rl_sub_cat;

    /* renamed from: s */
    public SharedPreferences f18227s;

    /* renamed from: t */
    public SeriesAdapter f18228t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    /* renamed from: v */
    public DatabaseHandler f18230v;

    @BindView
    public TextView vodCategoryName;

    /* renamed from: w */
    public VodAdapterNewFlow f18231w;

    /* renamed from: y */
    public PopupWindow f18233y;

    /* renamed from: z */
    public GridLayoutManager f18234z;

    /* renamed from: f */
    public String f18214f = "";

    /* renamed from: g */
    public String f18215g = "";

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f18216h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f18218j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: l */
    public String f18220l = "";

    /* renamed from: m */
    public String f18221m = "";

    /* renamed from: n */
    public boolean f18222n = false;

    /* renamed from: u */
    public ArrayList<SeriesDBModel> f18229u = new ArrayList<>();

    /* renamed from: x */
    public boolean f18232x = false;

    /* renamed from: D */
    public ArrayList<String> f18198D = new ArrayList<>();

    /* renamed from: J */
    public ArrayList<GetEpisdoeDetailsCallback> f18204J = new ArrayList<>();

    /* renamed from: K */
    public Map<String, String> f18205K = new HashMap();

    /* renamed from: L */
    public Map<String, String> f18206L = new HashMap();

    /* renamed from: M */
    public ArrayList<SeriesDBModel> f18207M = new ArrayList<>();

    /* renamed from: N */
    public ArrayList<GetEpisdoeDetailsCallback> f18208N = new ArrayList<>();

    /* renamed from: O */
    public ArrayList<GetEpisdoeDetailsCallback> f18209O = new ArrayList<>();

    /* renamed from: Q */
    public List<GetEpisdoeDetailsCallback> f18211Q = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$a.class */
    public class ViewOnClickListenerC3002a implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivitNewFlowSubCat f18235b;

        public ViewOnClickListenerC3002a(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18235b = seriesActivitNewFlowSubCat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18235b.f18212d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$b.class */
    public class DialogInterfaceOnClickListenerC3003b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivitNewFlowSubCat f18236b;

        public DialogInterfaceOnClickListenerC3003b(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18236b = seriesActivitNewFlowSubCat;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18236b.f18212d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$c.class */
    public class DialogInterfaceOnClickListenerC3004c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivitNewFlowSubCat f18237b;

        public DialogInterfaceOnClickListenerC3004c(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18237b = seriesActivitNewFlowSubCat;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$d.class */
    public class ViewOnClickListenerC3005d implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivitNewFlowSubCat f18238b;

        public ViewOnClickListenerC3005d(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18238b = seriesActivitNewFlowSubCat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18238b.f18233y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$e.class */
    public class ViewOnClickListenerC3006e implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f18239b;

        /* renamed from: c */
        public final View f18240c;

        /* renamed from: d */
        public final Activity f18241d;

        /* renamed from: e */
        public final SeriesActivitNewFlowSubCat f18242e;

        public ViewOnClickListenerC3006e(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, RadioGroup radioGroup, View view, Activity activity) {
            this.f18242e = seriesActivitNewFlowSubCat;
            this.f18239b = radioGroup;
            this.f18240c = view;
            this.f18241d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f18240c.findViewById(this.f18239b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f18242e.getResources().getString(2132018611))) {
                activity = this.f18241d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f18242e.getResources().getString(2132018607))) {
                activity = this.f18241d;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f18242e.getResources().getString(2132018615))) {
                activity = this.f18241d;
                str = "3";
            } else {
                activity = this.f18241d;
                str = "0";
            }
            SharepreferenceDBHandler.m15368c0(str, activity);
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = this.f18242e;
            seriesActivitNewFlowSubCat.f18224p = seriesActivitNewFlowSubCat.getSharedPreferences("listgridview", 0);
            int i10 = this.f18242e.f18224p.getInt("series", 0);
            C5251a.f30072w = i10;
            if (i10 == 1) {
                this.f18242e.m16409K0();
            } else {
                this.f18242e.m16408J0();
            }
            this.f18242e.f18233y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$f.class */
    public class ViewOnClickListenerC3007f implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivitNewFlowSubCat f18243b;

        public ViewOnClickListenerC3007f(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18243b = seriesActivitNewFlowSubCat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new AsyncTaskC3010i(this.f18243b, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            this.f18243b.f18233y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$g.class */
    public class ViewOnClickListenerC3008g implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivitNewFlowSubCat f18244b;

        public ViewOnClickListenerC3008g(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18244b = seriesActivitNewFlowSubCat;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18244b.f18233y.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$h.class */
    public class AsyncTaskC3009h extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final SeriesActivitNewFlowSubCat f18245a;

        public AsyncTaskC3009h(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18245a = seriesActivitNewFlowSubCat;
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
                    if (hashCode == 1997009972 && str.equals("get_recent_watch")) {
                        z10 = 2;
                    }
                    z10 = -1;
                } else {
                    if (str.equals("get_fav")) {
                    }
                    z10 = -1;
                }
                if (!z10) {
                    return this.f18245a.m16405G0();
                }
                if (z10) {
                    return this.f18245a.m16404F0(strArr[1]);
                }
                if (z10 != 2) {
                    return null;
                }
                return this.f18245a.m16407I0();
            } catch (Exception e10) {
                return "error";
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            str.hashCode();
            boolean z10 = -1;
            switch (str.hashCode()) {
                case -74801864:
                    if (str.equals("get_all")) {
                        z10 = false;
                        break;
                    }
                    break;
                case -74797390:
                    if (str.equals("get_fav")) {
                        z10 = true;
                        break;
                    }
                    break;
                case 1997009972:
                    if (str.equals("get_recent_watch")) {
                        z10 = 2;
                        break;
                    }
                    break;
            }
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = this.f18245a;
            switch (z10) {
                case false:
                    seriesActivitNewFlowSubCat.m16420q0();
                    break;
                case true:
                    seriesActivitNewFlowSubCat.m16403E0();
                    break;
                case true:
                    seriesActivitNewFlowSubCat.m16421r0();
                    break;
                default:
                    seriesActivitNewFlowSubCat.m16411M0(false);
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$i.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$i.class */
    public class AsyncTaskC3010i extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final SeriesActivitNewFlowSubCat f18246a;

        public AsyncTaskC3010i(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat) {
            this.f18246a = seriesActivitNewFlowSubCat;
        }

        public /* synthetic */ AsyncTaskC3010i(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, ViewOnClickListenerC3002a viewOnClickListenerC3002a) {
            this(seriesActivitNewFlowSubCat);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return this.f18246a.m16402D0();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ProgressBar progressBar = this.f18246a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (bool.booleanValue()) {
                Toast.makeText(this.f18246a.f18212d, this.f18246a.getResources().getString(2132017303), 0).show();
                this.f18246a.m16411M0(false);
                return;
            }
            this.f18246a.f18211Q.clear();
            this.f18246a.myRecyclerView.setVisibility(8);
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = this.f18246a;
            seriesActivitNewFlowSubCat.tvNoRecordFound.setText(seriesActivitNewFlowSubCat.getResources().getString(2132018198));
            this.f18246a.tvNoRecordFound.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressBar progressBar = this.f18246a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat$j.class */
    public class ViewOnFocusChangeListenerC3011j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18247b;

        /* renamed from: c */
        public final SeriesActivitNewFlowSubCat f18248c;

        public ViewOnFocusChangeListenerC3011j(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, View view) {
            this.f18248c = seriesActivitNewFlowSubCat;
            this.f18247b = view;
        }

        /* renamed from: a */
        public final void m16426a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18247b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16427b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18247b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16428c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18247b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16427b(1.15f);
                m16428c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16427b(1.0f);
                m16428c(1.0f);
                m16426a(z10);
            }
        }
    }

    /* renamed from: C0 */
    public final void m16401C0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: D0 */
    public Boolean m16402D0() {
        List<GetEpisdoeDetailsCallback> list = this.f18211Q;
        if (list == null || list.size() <= 0) {
            return Boolean.FALSE;
        }
        if (this.f18210P == null) {
            this.f18210P = new SeriesRecentWatchDatabase(this.f18212d);
        }
        for (int i10 = 0; i10 < this.f18211Q.size(); i10++) {
            this.f18210P.m15330q(this.f18211Q.get(i10).m14958j());
        }
        return Boolean.TRUE;
    }

    /* renamed from: E0 */
    public void m16403E0() {
        ArrayList<SeriesDBModel> arrayList;
        ArrayList<SeriesDBModel> arrayList2;
        try {
            if (this.myRecyclerView != null && (arrayList2 = this.f18229u) != null && arrayList2.size() != 0) {
                SeriesAdapter seriesAdapter = new SeriesAdapter(this.f18229u, this.f18212d);
                this.f18228t = seriesAdapter;
                this.myRecyclerView.setAdapter(seriesAdapter);
                this.f18228t.m4099w();
                C5255e.m26243l0(this.f18212d, getResources().getString(2132018759));
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream != null && (arrayList = this.f18229u) != null && arrayList.size() == 0) {
                RecyclerView recyclerView = this.myRecyclerView;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f18228t);
                }
                this.tvNoStream.setText(getResources().getString(2132018223));
                this.tvNoStream.setVisibility(0);
            }
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: F0 */
    public String m16404F0(String str) {
        try {
            this.f18203I = new ArrayList<>();
            this.f18200F = new ArrayList<>();
            this.f18201G = new ArrayList<>();
            this.f18202H = new ArrayList<>();
            this.f18202H = this.f18217i.m15258v1(str);
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: G0 */
    public String m16405G0() {
        return "get_fav";
    }

    /* renamed from: H0 */
    public final ArrayList<String> m16406H0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18217i.m15232m1(SharepreferenceDBHandler.m15337A(this.f18212d));
        this.f18203I = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18198D.add(next.m15291b());
                }
            }
        }
        return this.f18198D;
    }

    /* renamed from: I0 */
    public final String m16407I0() {
        boolean z10;
        this.f18198D = new ArrayList<>();
        new ArrayList();
        this.f18211Q = new ArrayList();
        SeriesRecentWatchDatabase seriesRecentWatchDatabase = new SeriesRecentWatchDatabase(this.f18212d);
        this.f18210P = seriesRecentWatchDatabase;
        ArrayList<GetEpisdoeDetailsCallback> m15336y = seriesRecentWatchDatabase.m15336y("getalldata");
        if (this.f18217i == null) {
            this.f18217i = new LiveStreamDBHandler(this.f18212d);
        }
        if (this.f18217i.m15189R1(SharepreferenceDBHandler.m15337A(this.f18212d)) <= 0) {
            this.f18211Q = m15336y;
            return "get_recent_watch";
        }
        this.f18198D = m16406H0();
        Iterator<GetEpisdoeDetailsCallback> it = m15336y.iterator();
        while (it.hasNext()) {
            GetEpisdoeDetailsCallback next = it.next();
            Iterator<String> it2 = this.f18198D.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                if (next.m14950b().equals(it2.next())) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.f18211Q.add(next);
            }
        }
        return "get_recent_watch";
    }

    /* renamed from: J0 */
    public final void m16408J0() {
        this.f18212d = this;
        this.f18217i = new LiveStreamDBHandler(this.f18212d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18212d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f18212d, C5255e.m26257x(this.f18212d) + 1);
        this.f18226r = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f18227s = this.f18212d.getSharedPreferences("loginPrefs", 0);
        m16415Q0();
    }

    /* renamed from: K0 */
    public final void m16409K0() {
        this.f18212d = this;
        this.f18217i = new LiveStreamDBHandler(this.f18212d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18212d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f18212d);
        this.f18226r = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f18227s = this.f18212d.getSharedPreferences("loginPrefs", 0);
        m16415Q0();
    }

    /* renamed from: L0 */
    public final void m16410L0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18212d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f18234z = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setHasFixedSize(true);
        m16419b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f18212d, this.f18217i);
        this.f18223o = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    /* renamed from: M0 */
    public void m16411M0(boolean z10) {
        View view;
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z10) {
            this.tvNoStream.setVisibility(8);
            view = this.myRecyclerView;
        } else {
            this.myRecyclerView.setVisibility(8);
            this.tvNoStream.setText(getResources().getString(2132018198));
            view = this.tvNoStream;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c7, code lost:
    
        m16413O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        r5.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        if (r5 != null) goto L21;
     */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16412N0() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat.m16412N0():void");
    }

    /* renamed from: O0 */
    public final void m16413O0() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f18224p = sharedPreferences;
        this.f18225q = sharedPreferences.edit();
        int i10 = this.f18224p.getInt("series", 0);
        C5251a.f30072w = i10;
        if (i10 == 1) {
            m16409K0();
        } else {
            m16408J0();
        }
    }

    /* renamed from: P0 */
    public final void m16414P0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        m16410L0(arrayList);
    }

    /* renamed from: Q0 */
    public final void m16415Q0() {
        try {
            if (this.f18212d != null) {
                new LiveStreamDBHandler(this.f18212d);
                String str = this.f18220l;
                boolean z10 = -1;
                int hashCode = str.hashCode();
                if (hashCode != 1444) {
                    if (hashCode == 1447 && str.equals("-4")) {
                        z10 = true;
                    }
                } else if (str.equals("-1")) {
                    z10 = false;
                }
                if (!z10) {
                    new AsyncTaskC3009h(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                } else if (!z10) {
                    new AsyncTaskC3009h(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.f18220l);
                } else {
                    new AsyncTaskC3009h(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch");
                }
            }
            ProgressDialog progressDialog = this.f18219k;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: R0 */
    public final void m16416R0() {
        try {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f18233y = popupWindow;
            popupWindow.setContentView(inflate);
            this.f18233y.setWidth(-1);
            this.f18233y.setHeight(-1);
            this.f18233y.setFocusable(true);
            this.f18233y.showAtLocation(inflate, 17, 0, 0);
            ((TextView) inflate.findViewById(2131429411)).setText(getResources().getString(2132017558));
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, this));
            }
            button.setOnClickListener(new ViewOnClickListenerC3007f(this));
            if (button2 != null) {
                button2.setOnClickListener(new ViewOnClickListenerC3008g(this));
            }
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S0 */
    public final void m16417S0(Activity activity) {
        boolean z10;
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f18233y = popupWindow;
            popupWindow.setContentView(inflate);
            this.f18233y.setWidth(-1);
            this.f18233y.setHeight(-1);
            this.f18233y.setFocusable(true);
            this.f18233y.showAtLocation(inflate, 17, 0, 0);
            String m15400w = SharepreferenceDBHandler.m15400w(activity);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            if (this.f18220l.equalsIgnoreCase("-2")) {
                radioButton2.setVisibility(8);
                if (m15400w.equalsIgnoreCase("1")) {
                    SharepreferenceDBHandler.m15368c0("0", activity);
                }
            } else {
                radioButton2.setVisibility(0);
            }
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428898);
            radioButton3.setVisibility(8);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428899);
            radioButton4.setVisibility(8);
            RadioButton radioButton5 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton6 = (RadioButton) inflate.findViewById(2131428916);
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3011j(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3011j(this, radioButton2));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3011j(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3011j(this, radioButton6));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3011j(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3011j(this, radioButton4));
            switch (m15400w.hashCode()) {
                case 49:
                    if (m15400w.equals("1")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case 50:
                    if (m15400w.equals("2")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case 51:
                    if (m15400w.equals("3")) {
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
                radioButton2.setChecked(true);
            } else if (z10) {
                radioButton5.setChecked(true);
            } else if (z10 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton6.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3005d(this));
            button.setOnClickListener(new ViewOnClickListenerC3006e(this, radioGroup, inflate, activity));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: a */
    public void m16418a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m16419b() {
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
        VodAdapterNewFlow vodAdapterNewFlow = this.f18231w;
        if (vodAdapterNewFlow != null) {
            vodAdapterNewFlow.m17558r0(f18194U);
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
        setContentView(2131624049);
        getWindow().setFlags(1024, 1024);
        this.f18212d = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.f18220l = intent.getStringExtra("category_id");
            this.f18221m = intent.getStringExtra("category_name");
        }
        this.f18203I = new ArrayList<>();
        this.f18200F = new ArrayList<>();
        this.f18201G = new ArrayList<>();
        this.f18202H = new ArrayList<>();
        this.f18231w = new VodAdapterNewFlow();
        this.f18230v = new DatabaseHandler(this.f18212d);
        this.f18217i = new LiveStreamDBHandler(this.f18212d);
        this.f18195A = new Handler();
        m16412N0();
        this.f18199E = this.f18199E;
        this.logo.setOnClickListener(new ViewOnClickListenerC3002a(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Toolbar toolbar;
        int i10;
        super.onCreateOptionsMenu(menu);
        if (this.f18232x) {
            toolbar = this.toolbar;
            i10 = 2131689495;
        } else {
            toolbar = this.toolbar;
            i10 = 2131689497;
        }
        toolbar.m1224x(i10);
        this.f18197C = menu;
        this.f18196B = menu.getItem(2).getSubMenu().findItem(2131427886);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i11 = 0; i11 < this.toolbar.getChildCount(); i11++) {
            if (this.toolbar.getChildAt(i11) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i11).getLayoutParams()).f26228a = 16;
            }
        }
        if (!this.f18220l.equalsIgnoreCase("-4")) {
            return true;
        }
        this.f18196B = menu.getItem(2).getSubMenu().findItem(2131428256).setVisible(true);
        this.f18196B = menu.getItem(2).getSubMenu().findItem(2131428252).setVisible(true);
        if (this.f18210P == null) {
            this.f18210P = new SeriesRecentWatchDatabase(this.f18212d);
        }
        if (this.f18210P.m15331q0() <= 0) {
            return true;
        }
        menu.getItem(2).getSubMenu().findItem(2131428757).setVisible(true);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f18197C;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0122, code lost:
    
        if (r0.size() > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b9, code lost:
    
        if (r0.size() > 0) goto L33;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        C5255e.m26233f(this.f18212d);
        getWindow().setFlags(1024, 1024);
        VodAdapterNewFlow vodAdapterNewFlow = this.f18231w;
        if (vodAdapterNewFlow != null && (progressBar = f18194U) != null) {
            vodAdapterNewFlow.m17558r0(progressBar);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18213e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18213e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    /* renamed from: q0 */
    public void m16420q0() {
        try {
            ArrayList<SeriesDBModel> arrayList = this.f18202H;
            if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                SeriesAdapter seriesAdapter = new SeriesAdapter(this.f18202H, this.f18212d);
                this.f18228t = seriesAdapter;
                this.myRecyclerView.setAdapter(seriesAdapter);
                C5255e.m26243l0(this.f18212d, getResources().getString(2132018759));
            }
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: r0 */
    public final void m16421r0() {
    }
}
