package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK;
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p200l9.C5782l;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import p402x9.C9691a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch.class */
public class RightSideProgramsSearch extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: C */
    public static SharedPreferences f20281C;

    /* renamed from: D */
    public static int f20282D;

    /* renamed from: A */
    public SimpleDateFormat f20283A;

    /* renamed from: e */
    public ArrayList<XMLTVProgrammePojo> f20285e;

    /* renamed from: f */
    public Context f20286f;

    /* renamed from: h */
    public DatabaseHandler f20288h;

    /* renamed from: i */
    public Animation f20289i;

    /* renamed from: j */
    public String f20290j;

    /* renamed from: l */
    public ProgressDialog f20292l;

    /* renamed from: o */
    public C5947e f20295o;

    /* renamed from: q */
    public Handler f20297q;

    /* renamed from: s */
    public LiveStreamDBHandler f20299s;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f20302v;

    /* renamed from: g */
    public Boolean f20287g = Boolean.FALSE;

    /* renamed from: k */
    public String f20291k = "";

    /* renamed from: m */
    public boolean f20293m = false;

    /* renamed from: n */
    public int f20294n = -1;

    /* renamed from: p */
    public String f20296p = "";

    /* renamed from: t */
    public int f20300t = -1;

    /* renamed from: w */
    public String f20303w = "";

    /* renamed from: x */
    public String f20304x = "";

    /* renamed from: y */
    public String f20305y = "";

    /* renamed from: z */
    public int f20306z = 0;

    /* renamed from: B */
    public int f20284B = 0;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f20298r = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f20301u = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$ViewHolder.class */
    public static class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public LinearLayout ll_list_view;

        @BindView
        public LinearLayout ll_pb_recent_watch;

        @BindView
        public ProgressBar pb_recent_watch;

        @BindView
        public TextView tvProgramStartDate;

        @BindView
        public TextView tvProgramStopDate;

        @BindView
        public TextView tvProgramTitle;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f20307b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f20307b = viewHolder;
            viewHolder.tvProgramTitle = (TextView) C8522c.m36739c(view, 2131429577, "field 'tvProgramTitle'", TextView.class);
            viewHolder.tvProgramStartDate = (TextView) C8522c.m36739c(view, 2131429573, "field 'tvProgramStartDate'", TextView.class);
            viewHolder.tvProgramStopDate = (TextView) C8522c.m36739c(view, 2131429575, "field 'tvProgramStopDate'", TextView.class);
            viewHolder.ll_pb_recent_watch = (LinearLayout) C8522c.m36739c(view, 2131428464, "field 'll_pb_recent_watch'", LinearLayout.class);
            viewHolder.pb_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428841, "field 'pb_recent_watch'", ProgressBar.class);
            viewHolder.ll_list_view = (LinearLayout) C8522c.m36739c(view, 2131428433, "field 'll_list_view'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f20307b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20307b = null;
            viewHolder.tvProgramTitle = null;
            viewHolder.tvProgramStartDate = null;
            viewHolder.tvProgramStopDate = null;
            viewHolder.ll_pb_recent_watch = null;
            viewHolder.pb_recent_watch = null;
            viewHolder.ll_list_view = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RightSideProgramsSearch$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$a.class */
    public class ViewOnClickListenerC3460a implements View.OnClickListener {

        /* renamed from: b */
        public final int f20308b;

        /* renamed from: c */
        public final String f20309c;

        /* renamed from: d */
        public final int f20310d;

        /* renamed from: e */
        public final String f20311e;

        /* renamed from: f */
        public final String f20312f;

        /* renamed from: g */
        public final String f20313g;

        /* renamed from: h */
        public final ViewHolder f20314h;

        /* renamed from: i */
        public final String f20315i;

        /* renamed from: j */
        public final String f20316j;

        /* renamed from: k */
        public final String f20317k;

        /* renamed from: l */
        public final int f20318l;

        /* renamed from: m */
        public final RightSideProgramsSearch f20319m;

        public ViewOnClickListenerC3460a(RightSideProgramsSearch rightSideProgramsSearch, int i10, String str, int i11, String str2, String str3, String str4, ViewHolder viewHolder, String str5, String str6, String str7, int i12) {
            this.f20319m = rightSideProgramsSearch;
            this.f20308b = i10;
            this.f20309c = str;
            this.f20310d = i11;
            this.f20311e = str2;
            this.f20312f = str3;
            this.f20313g = str4;
            this.f20314h = viewHolder;
            this.f20315i = str5;
            this.f20316j = str6;
            this.f20317k = str7;
            this.f20318l = i12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f20308b != this.f20319m.f20284B) {
                this.f20319m.f20284B = this.f20308b;
                this.f20314h.ll_list_view.setBackground(this.f20319m.f20286f.getResources().getDrawable(2131099869));
                if (Build.VERSION.SDK_INT >= 23) {
                    ((SearchActivity) this.f20319m.f20286f).m16311C0(this.f20311e, this.f20315i, this.f20316j, this.f20317k, this.f20318l);
                } else {
                    ((SearchActivityLowerSDK) this.f20319m.f20286f).m16386w(this.f20311e, this.f20315i, this.f20316j, this.f20317k, this.f20318l);
                }
                this.f20319m.m4099w();
                return;
            }
            try {
                RightSideProgramsSearch rightSideProgramsSearch = this.f20319m;
                rightSideProgramsSearch.f20295o = C5938b.m29235e(rightSideProgramsSearch.f20286f).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f20319m.f20295o == null || !this.f20319m.f20295o.m29348c()) {
                this.f20319m.m17353v0(this.f20310d, this.f20313g, this.f20309c);
                return;
            }
            if (this.f20319m.f20295o != null && this.f20319m.f20295o.m29290r() != null && this.f20319m.f20295o.m29290r().m31009j() != null && this.f20319m.f20295o.m29290r().m31009j().m13058R() != null) {
                RightSideProgramsSearch rightSideProgramsSearch2 = this.f20319m;
                rightSideProgramsSearch2.f20296p = rightSideProgramsSearch2.f20295o.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f20319m.f20286f).equals("m3u") ? this.f20309c : C5255e.m26202E(this.f20319m.f20286f, this.f20310d, "m3u8", "live");
            if (this.f20319m.f20296p.contains(String.valueOf(m26202E))) {
                this.f20319m.f20286f.startActivity(new Intent(this.f20319m.f20286f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f20311e);
            c5782l.m28253b(new C9691a(Uri.parse(this.f20312f)));
            RightSideProgramsSearch rightSideProgramsSearch3 = this.f20319m;
            C4718a.m23742b(rightSideProgramsSearch3.f20297q, rightSideProgramsSearch3.f20295o.m29290r(), m26202E, c5782l, this.f20319m.f20286f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$b.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RightSideProgramsSearch$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$b.class */
    public class AsyncTaskC3461b extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final RightSideProgramsSearch f20320a;

        public AsyncTaskC3461b(RightSideProgramsSearch rightSideProgramsSearch) {
            this.f20320a = rightSideProgramsSearch;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f20320a.m17348q0(strArr[1]);
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f20320a.m17350s0();
            this.f20320a.m17347d0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.RightSideProgramsSearch$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/RightSideProgramsSearch$c.class */
    public class AsyncTaskC3462c extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final RightSideProgramsSearch f20321a;

        public AsyncTaskC3462c(RightSideProgramsSearch rightSideProgramsSearch) {
            this.f20321a = rightSideProgramsSearch;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f20321a.m17351t0();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f20321a.m17354w0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f20321a.m17355x0();
            super.onPreExecute();
        }
    }

    public RightSideProgramsSearch(Context context, ArrayList<XMLTVProgrammePojo> arrayList) {
        this.f20290j = "mobile";
        this.f20286f = context;
        this.f20285e = arrayList;
        this.f20288h = new DatabaseHandler(context);
        this.f20289i = AnimationUtils.loadAnimation(context, 2130771980);
        this.f20299s = new LiveStreamDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f20281C = sharedPreferences;
        this.f20283A = new SimpleDateFormat(sharedPreferences.getString("timeFormat", C5251a.f30053m0), Locale.US);
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f20290j = "tv";
        } else {
            this.f20290j = "mobile";
        }
        this.f20297q = new Handler(Looper.getMainLooper());
        if (this.f20290j.equals("mobile")) {
            try {
                this.f20295o = C5938b.m29235e(context).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    public void mo2996G(@NotNull RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        int i11;
        String str;
        String str2;
        TextView textView;
        int i12;
        LinearLayout linearLayout;
        mo3018q(i10);
        this.f20286f.getSharedPreferences("showhidemoviename", 0).getInt("livestream", 1);
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        try {
            ArrayList<XMLTVProgrammePojo> arrayList = this.f20285e;
            if (arrayList == null || arrayList.size() <= 0 || this.f20286f == null) {
                return;
            }
            XMLTVProgrammePojo xMLTVProgrammePojo = this.f20285e.get(i10);
            String m15515m = xMLTVProgrammePojo.m15508f() != null ? xMLTVProgrammePojo.m15515m() : "";
            String m15504b = xMLTVProgrammePojo.m15504b() != null ? xMLTVProgrammePojo.m15504b() : "";
            String m15506d = xMLTVProgrammePojo.m15506d() != null ? xMLTVProgrammePojo.m15506d() : "";
            String m15516n = xMLTVProgrammePojo.m15516n() != null ? xMLTVProgrammePojo.m15516n() : "";
            String m15507e = xMLTVProgrammePojo.m15507e() != null ? xMLTVProgrammePojo.m15507e() : "";
            if (xMLTVProgrammePojo.m15510h() != null) {
                try {
                    i11 = Integer.parseInt(xMLTVProgrammePojo.m15510h());
                } catch (NumberFormatException e10) {
                    i11 = 0;
                }
            } else {
                i11 = -1;
            }
            String replace = m15515m.trim().replace("'", " ");
            viewHolder.tvProgramTitle.setText(replace);
            String m15512j = xMLTVProgrammePojo.m15512j();
            String m15514l = xMLTVProgrammePojo.m15514l();
            Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f20286f));
            Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f20286f));
            if (C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f20286f)) {
                i12 = C5255e.m26258y(valueOf.longValue(), valueOf2.longValue(), this.f20286f);
                if (i12 != 0) {
                    i12 = 100 - i12;
                    if (i12 != 0) {
                        str = this.f20283A.format(valueOf);
                        str2 = " - " + this.f20283A.format(valueOf2);
                        viewHolder.tvProgramStartDate.setText(str);
                        viewHolder.tvProgramStopDate.setText(str2);
                        viewHolder.pb_recent_watch.setProgress(i12);
                        viewHolder.ll_pb_recent_watch.setVisibility(0);
                    } else {
                        linearLayout = viewHolder.ll_pb_recent_watch;
                    }
                } else {
                    linearLayout = viewHolder.ll_pb_recent_watch;
                }
                linearLayout.setVisibility(8);
                str = "";
                str2 = "";
            } else {
                viewHolder.ll_pb_recent_watch.setVisibility(8);
                Date date = new Date();
                Locale locale = Locale.US;
                String format = new SimpleDateFormat("dd", locale).format(date);
                String format2 = new SimpleDateFormat("dd", locale).format(valueOf);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd", locale);
                if (format.equals(format2)) {
                    str = this.f20283A.format(valueOf);
                    str2 = " - " + this.f20283A.format(valueOf2);
                    viewHolder.tvProgramStartDate.setText(str);
                    textView = viewHolder.tvProgramStopDate;
                } else {
                    str = simpleDateFormat.format(valueOf) + ", " + this.f20283A.format(valueOf);
                    str2 = " - " + this.f20283A.format(valueOf2);
                    viewHolder.tvProgramStartDate.setText(str);
                    textView = viewHolder.tvProgramStopDate;
                }
                textView.setText(str2);
                i12 = 0;
            }
            viewHolder.ll_list_view.setOnClickListener(new ViewOnClickListenerC3460a(this, i10, m15516n, i11, replace, m15507e, m15506d, viewHolder, m15504b, str, str2, i12));
            if (this.f20284B == i10) {
                viewHolder.ll_list_view.setBackground(this.f20286f.getResources().getDrawable(2131099869));
                viewHolder.ll_list_view.requestFocus();
            } else {
                viewHolder.ll_list_view.setBackground(this.f20286f.getResources().getDrawable(2131231527));
            }
            if (i10 != f20282D || this.f20293m) {
                return;
            }
            this.f20293m = true;
            viewHolder.ll_list_view.setBackground(this.f20286f.getResources().getDrawable(2131099869));
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) this.f20286f).m16311C0(replace, m15504b, str, str2, i12);
            } else {
                ((SearchActivityLowerSDK) this.f20286f).m16386w(replace, m15504b, str, str2, i12);
            }
        } catch (Exception e11) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(@NotNull ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (this.f20290j.equals("tv")) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624496;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624495;
        }
        return new ViewHolder(from.inflate(i11, viewGroup, false));
    }

    /* renamed from: d0 */
    public void m17347d0() {
        try {
            int m17349r0 = SharepreferenceDBHandler.m15373f(this.f20286f).equals("m3u") ? m17349r0(this.f20305y, "m3u") : m17349r0(String.valueOf(this.f20306z), "api");
            if (!this.f20290j.equals("tv")) {
                ArrayList<LiveStreamsDBModel> arrayList = this.f20302v;
                if (arrayList == null || arrayList.size() <= 0) {
                    VodAllCategoriesSingleton.m14909b().m14918j(null);
                    return;
                } else {
                    VodAllCategoriesSingleton.m14909b().m14918j(this.f20302v);
                    C5255e.m26221X(this.f20286f, "Built-in Player ( Default )", this.f20306z, "live", m17349r0, "", "", "", this.f20303w, this.f20305y, this.f20304x);
                    return;
                }
            }
            String m15385l = SharepreferenceDBHandler.m15385l(this.f20286f);
            Intent intent = (m15385l == null || !m15385l.equalsIgnoreCase("default_native")) ? new Intent(this.f20286f, (Class<?>) NSTIJKPlayerSkyTvActivity.class) : new Intent(this.f20286f, (Class<?>) NSTEXOPlayerSkyTvActivity.class);
            intent.putExtra("OPENED_STREAM_ID", this.f20306z);
            intent.putExtra("VIDEO_NUM", m17349r0);
            intent.putExtra("OPENED_CAT_ID", this.f20303w);
            intent.putExtra("VIDEO_URL", this.f20305y);
            intent.putExtra("OPENED_CAT_NAME", this.f20304x);
            intent.putExtra("FROM_SEARCH", "true");
            this.f20286f.startActivity(intent);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<XMLTVProgrammePojo> arrayList = this.f20285e;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f20285e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return 0;
    }

    /* renamed from: q0 */
    public String m17348q0(String str) {
        try {
            this.f20302v = this.f20299s.m15217f1(str, "live");
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: r0 */
    public int m17349r0(String str, String str2) {
        ArrayList<LiveStreamsDBModel> arrayList = this.f20302v;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        if (str2.equals("m3u")) {
            for (int i10 = 0; i10 < this.f20302v.size(); i10++) {
                if (this.f20302v.get(i10).m14816W().equals(str)) {
                    return i10;
                }
            }
            return 0;
        }
        for (int i11 = 0; i11 < this.f20302v.size(); i11++) {
            if (this.f20302v.get(i11).m14811R().equals(str)) {
                return i11;
            }
        }
        return 0;
    }

    /* renamed from: s0 */
    public final void m17350s0() {
        ProgressDialog progressDialog = this.f20292l;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f20292l.dismiss();
    }

    /* renamed from: t0 */
    public final Boolean m17351t0() {
        try {
            if (this.f20286f != null) {
                ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f20298r;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.f20298r = this.f20299s.m15263x1();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                int m15205Z1 = this.f20299s.m15205Z1("live");
                liveStreamCategoryIdDBModel.m14792g("0");
                liveStreamCategoryIdDBModel.m14793h(this.f20286f.getResources().getString(2132017297));
                liveStreamCategoryIdDBModel.m14794i(m15205Z1);
                liveStreamCategoryIdDBModel2.m14792g("-1");
                liveStreamCategoryIdDBModel2.m14793h(this.f20286f.getResources().getString(2132017779));
                this.f20300t = SharepreferenceDBHandler.m15373f(this.f20286f).equals("m3u") ? this.f20299s.m15218f2("live") : this.f20299s.m15211c2("-2", "live");
                int i10 = this.f20300t;
                if (i10 != 0 && i10 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("-2");
                    liveStreamCategoryIdDBModel3.m14793h(this.f20286f.getResources().getString(2132018731));
                    liveStreamCategoryIdDBModel3.m14794i(this.f20300t);
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f20298r;
                    arrayList2.add(arrayList2.size(), liveStreamCategoryIdDBModel3);
                }
                this.f20298r.add(0, liveStreamCategoryIdDBModel);
                this.f20298r.add(1, liveStreamCategoryIdDBModel2);
            }
            return Boolean.TRUE;
        } catch (NullPointerException e10) {
            return Boolean.FALSE;
        } catch (Exception e11) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: u0 */
    public final void m17352u0() {
        new AsyncTaskC3462c(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: v0 */
    public final void m17353v0(int i10, String str, String str2) {
        this.f20303w = str;
        this.f20306z = i10;
        this.f20305y = str2;
        m17352u0();
    }

    /* renamed from: w0 */
    public final void m17354w0() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f20298r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f20301u;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = new ArrayList<>();
        this.f20301u = arrayList3;
        arrayList3.addAll(this.f20298r);
        int i10 = 0;
        while (true) {
            if (i10 >= this.f20298r.size()) {
                break;
            }
            if (this.f20303w.equals(String.valueOf(this.f20298r.get(i10).m14787b()))) {
                this.f20304x = this.f20298r.get(i10).m14788c();
                break;
            }
            i10++;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = this.f20301u;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            return;
        }
        VodAllCategoriesSingleton.m14909b().m14917i(this.f20301u);
        C5255e.f30090n = new AsyncTaskC3461b(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.f20303w);
    }

    /* renamed from: x0 */
    public final void m17355x0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f20286f);
        this.f20292l = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f20292l.setMessage(this.f20286f.getResources().getString(2132018352));
        this.f20292l.show();
    }
}
