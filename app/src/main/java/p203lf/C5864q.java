package p203lf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity;
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/q.class
 */
/* renamed from: lf.q */
/* loaded from: combined.jar:classes2.jar:lf/q.class */
public class C5864q extends RecyclerView.AbstractC0677h<f> implements Filterable {

    /* renamed from: g */
    public String f32711g;

    /* renamed from: h */
    public Context f32712h;

    /* renamed from: i */
    public DatabaseHandler f32713i;

    /* renamed from: k */
    public String f32715k;

    /* renamed from: m */
    public String f32717m;

    /* renamed from: n */
    public String f32718n;

    /* renamed from: o */
    public LiveStreamDBHandler f32719o;

    /* renamed from: p */
    public C6783a f32720p;

    /* renamed from: j */
    public b f32714j = new b(this, null);

    /* renamed from: l */
    public boolean f32716l = false;

    /* renamed from: e */
    public final ArrayList<LiveStreamCategoryIdDBModel> f32709e = VodAllCategoriesSingleton.m14909b().m14911c();

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> f32710f = VodAllCategoriesSingleton.m14909b().m14911c();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/q$a.class
     */
    /* renamed from: lf.q$a */
    /* loaded from: combined.jar:classes2.jar:lf/q$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final int f32721b;

        /* renamed from: c */
        public final f f32722c;

        /* renamed from: d */
        public final C5864q f32723d;

        public a(C5864q c5864q, int i10, f fVar) {
            this.f32723d = c5864q;
            this.f32721b = i10;
            this.f32722c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5864q c5864q = this.f32723d;
            c5864q.f32711g = ((LiveStreamCategoryIdDBModel) c5864q.f32710f.get(this.f32721b)).m14787b();
            this.f32722c.f32735w.setBackground(this.f32723d.f32712h.getResources().getDrawable(2131099869));
            if (this.f32723d.f32715k.equals("mobile")) {
                if (this.f32723d.f32712h instanceof NSTIJKPlayerSkyActivity) {
                    AsyncTask asyncTask = C5255e.f30090n;
                    if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        C5255e.f30090n.cancel(true);
                    }
                    ((NSTIJKPlayerSkyActivity) this.f32723d.f32712h).m18430k2(((LiveStreamCategoryIdDBModel) this.f32723d.f32710f.get(this.f32721b)).m14787b(), ((LiveStreamCategoryIdDBModel) this.f32723d.f32710f.get(this.f32721b)).m14788c());
                } else if (this.f32723d.f32712h instanceof NSTEXOPlayerSkyActivity) {
                    AsyncTask asyncTask2 = C5255e.f30090n;
                    if (asyncTask2 != null && asyncTask2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        C5255e.f30090n.cancel(true);
                    }
                    ((NSTEXOPlayerSkyActivity) this.f32723d.f32712h).m17691B2(((LiveStreamCategoryIdDBModel) this.f32723d.f32710f.get(this.f32721b)).m14787b(), ((LiveStreamCategoryIdDBModel) this.f32723d.f32710f.get(this.f32721b)).m14788c());
                }
            } else if (this.f32723d.f32712h instanceof NSTIJKPlayerSkyTvActivity) {
                AsyncTask asyncTask3 = C5255e.f30090n;
                if (asyncTask3 != null && asyncTask3.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    C5255e.f30090n.cancel(true);
                }
                ((NSTIJKPlayerSkyTvActivity) this.f32723d.f32712h).m18610w2(((LiveStreamCategoryIdDBModel) this.f32723d.f32710f.get(this.f32721b)).m14787b());
            } else if (this.f32723d.f32712h instanceof NSTEXOPlayerSkyTvActivity) {
                AsyncTask asyncTask4 = C5255e.f30090n;
                if (asyncTask4 != null && asyncTask4.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    C5255e.f30090n.cancel(true);
                }
                ((NSTEXOPlayerSkyTvActivity) this.f32723d.f32712h).m17877C2(((LiveStreamCategoryIdDBModel) this.f32723d.f32710f.get(this.f32721b)).m14787b());
            }
            this.f32723d.m4099w();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/q$b.class
     */
    /* renamed from: lf.q$b */
    /* loaded from: combined.jar:classes2.jar:lf/q$b.class */
    public class b extends Filter {

        /* renamed from: a */
        public final C5864q f32724a;

        public b(C5864q c5864q) {
            this.f32724a = c5864q;
        }

        public /* synthetic */ b(C5864q c5864q, a aVar) {
            this(c5864q);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f32724a.f32709e;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) arrayList.get(i10);
                if (liveStreamCategoryIdDBModel.m14788c().toLowerCase().contains(lowerCase) || liveStreamCategoryIdDBModel.m14788c().contains(lowerCase)) {
                    arrayList2.add(liveStreamCategoryIdDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f32724a.f32710f = (ArrayList) filterResults.values;
                this.f32724a.m4099w();
                if (this.f32724a.f32710f == null || this.f32724a.f32710f.size() != 0) {
                    if (this.f32724a.f32715k.equals("mobile")) {
                        if (this.f32724a.f32712h instanceof NSTIJKPlayerSkyActivity) {
                            ((NSTIJKPlayerSkyActivity) this.f32724a.f32712h).m18424e2();
                        } else if (this.f32724a.f32712h instanceof NSTEXOPlayerSkyActivity) {
                            ((NSTEXOPlayerSkyActivity) this.f32724a.f32712h).m17764t2();
                        }
                    } else if (this.f32724a.f32712h instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) this.f32724a.f32712h).m18604q2();
                    } else if (this.f32724a.f32712h instanceof NSTEXOPlayerSkyTvActivity) {
                        ((NSTEXOPlayerSkyTvActivity) this.f32724a.f32712h).m17939v2();
                    }
                } else if (this.f32724a.f32715k.equals("mobile")) {
                    if (this.f32724a.f32712h instanceof NSTIJKPlayerSkyActivity) {
                        ((NSTIJKPlayerSkyActivity) this.f32724a.f32712h).m18435p2();
                    } else if (this.f32724a.f32712h instanceof NSTEXOPlayerSkyActivity) {
                        ((NSTEXOPlayerSkyActivity) this.f32724a.f32712h).m17697G2();
                    }
                } else if (this.f32724a.f32712h instanceof NSTIJKPlayerSkyTvActivity) {
                    ((NSTIJKPlayerSkyTvActivity) this.f32724a.f32712h).m18613z2();
                } else if (this.f32724a.f32712h instanceof NSTEXOPlayerSkyTvActivity) {
                    ((NSTEXOPlayerSkyTvActivity) this.f32724a.f32712h).m17880F2();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/q$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.q$c */
    /* loaded from: combined.jar:classes2.jar:lf/q$c.class */
    public class c extends AsyncTask<f, Void, Integer> {

        /* renamed from: a */
        public f f32725a;

        /* renamed from: b */
        public final C5864q f32726b;

        public c(C5864q c5864q, f fVar) {
            this.f32726b = c5864q;
            this.f32725a = fVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            return Integer.valueOf(SharepreferenceDBHandler.m15373f(this.f32726b.f32712h).equals("m3u") ? this.f32726b.f32719o.m15173J1("live") : this.f32726b.f32718n.equals("true") ? this.f32726b.f32713i.m15109B("radio_streams", SharepreferenceDBHandler.m15337A(this.f32726b.f32712h)) : this.f32726b.f32713i.m15109B("live", SharepreferenceDBHandler.m15337A(this.f32726b.f32712h)));
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32725a.f32734v.setText("0");
            } else {
                this.f32725a.f32734v.setText(String.valueOf(num));
            }
            this.f32725a.f32734v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32725a.f32734v.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/q$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.q$d */
    /* loaded from: combined.jar:classes2.jar:lf/q$d.class */
    public class d extends AsyncTask<f, Void, Integer> {

        /* renamed from: a */
        public f f32727a;

        /* renamed from: b */
        public final C5864q f32728b;

        public d(C5864q c5864q, f fVar) {
            this.f32728b = c5864q;
            this.f32727a = fVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            try {
                return Integer.valueOf(this.f32728b.f32719o.m15233m2());
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32727a.f32734v.setText("0");
            } else {
                this.f32727a.f32734v.setText(String.valueOf(num));
            }
            this.f32727a.f32734v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32727a.f32734v.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/q$e.class
     */
    /* renamed from: lf.q$e */
    /* loaded from: combined.jar:classes2.jar:lf/q$e.class */
    public class e implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32729b;

        /* renamed from: c */
        public final f f32730c;

        /* renamed from: d */
        public int f32731d;

        /* renamed from: e */
        public final C5864q f32732e;

        public e(C5864q c5864q, View view, f fVar, int i10) {
            this.f32732e = c5864q;
            this.f32729b = view;
            this.f32730c = fVar;
            this.f32731d = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            f fVar;
            TextView textView;
            if (!z10 || (fVar = this.f32730c) == null || (textView = fVar.f32733u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/q$f.class
     */
    /* renamed from: lf.q$f */
    /* loaded from: combined.jar:classes2.jar:lf/q$f.class */
    public static class f extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32733u;

        /* renamed from: v */
        public TextView f32734v;

        /* renamed from: w */
        public RelativeLayout f32735w;

        public f(View view) {
            super(view);
            this.f32733u = (TextView) view.findViewById(2131429378);
            this.f32734v = (TextView) view.findViewById(2131429377);
            this.f32735w = (RelativeLayout) view.findViewById(2131429054);
        }
    }

    public C5864q(Context context, String str, String str2, String str3) {
        this.f32711g = "0";
        this.f32715k = "mobile";
        this.f32717m = "";
        this.f32718n = "false";
        this.f32712h = context;
        this.f32713i = new DatabaseHandler(context);
        this.f32711g = str;
        this.f32717m = str2;
        this.f32719o = new LiveStreamDBHandler(context);
        C6783a c6783a = new C6783a(context);
        this.f32720p = c6783a;
        if (c6783a.m31288z().equals(C5251a.f30065s0)) {
            this.f32715k = "tv";
        } else {
            this.f32715k = "mobile";
        }
        this.f32718n = str3;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f32714j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(@NotNull f fVar, int i10) {
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            fVar.f32733u.setText(this.f32710f.get(i10).m14788c());
            if (this.f32710f.get(i10).m14787b().equalsIgnoreCase("-1")) {
                m28591o0(fVar);
            } else if (this.f32710f.get(i10).m14787b().equalsIgnoreCase("-6")) {
                m28592p0(fVar);
            } else {
                fVar.f32734v.setText(String.valueOf(this.f32710f.get(i10).m14789d()));
            }
            fVar.f32735w.setOnClickListener(new a(this, i10, fVar));
            if (this.f32711g.equals(this.f32710f.get(i10).m14787b())) {
                if (!this.f32716l) {
                    this.f32716l = true;
                    if (this.f32715k.equals("mobile")) {
                        Context context = this.f32712h;
                        if (context instanceof NSTIJKPlayerSkyActivity) {
                            ((NSTIJKPlayerSkyActivity) context).m18401J1(i10, this.f32710f.get(i10).m14787b(), this.f32710f.get(i10).m14788c());
                        } else if (context instanceof NSTEXOPlayerSkyActivity) {
                            ((NSTEXOPlayerSkyActivity) context).m17730X1(i10, this.f32710f.get(i10).m14787b(), this.f32710f.get(i10).m14788c());
                        }
                    } else {
                        Context context2 = this.f32712h;
                        if (context2 instanceof NSTIJKPlayerSkyTvActivity) {
                            ((NSTIJKPlayerSkyTvActivity) context2).m18579T1(i10, this.f32710f.get(i10).m14787b(), this.f32710f.get(i10).m14788c());
                        } else if (context2 instanceof NSTEXOPlayerSkyTvActivity) {
                            ((NSTEXOPlayerSkyTvActivity) context2).m17912Y1(i10, this.f32710f.get(i10).m14787b(), this.f32710f.get(i10).m14788c());
                        }
                    }
                }
                if (this.f32715k.equals("mobile")) {
                    Context context3 = this.f32712h;
                    if (context3 instanceof NSTIJKPlayerSkyActivity) {
                        ((NSTIJKPlayerSkyActivity) context3).f22950w3 = this.f32711g;
                    } else if (context3 instanceof NSTEXOPlayerSkyActivity) {
                        ((NSTEXOPlayerSkyActivity) context3).f21587y3 = this.f32711g;
                    }
                } else {
                    Context context4 = this.f32712h;
                    if (context4 instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) context4).f23157f3 = this.f32711g;
                    } else if (context4 instanceof NSTEXOPlayerSkyTvActivity) {
                        ((NSTEXOPlayerSkyTvActivity) context4).f21799g3 = this.f32711g;
                    }
                }
                relativeLayout = fVar.f32735w;
                drawable = this.f32712h.getResources().getDrawable(2131099869);
            } else {
                relativeLayout = fVar.f32735w;
                drawable = this.f32712h.getResources().getDrawable(2131231527);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout2 = fVar.f32735w;
            relativeLayout2.setOnFocusChangeListener(new e(this, relativeLayout2, fVar, i10));
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f32710f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public f mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (this.f32717m.equals("player")) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624465;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624464;
        }
        return new f(from.inflate(i11, viewGroup, false));
    }

    /* renamed from: o0 */
    public final void m28591o0(f fVar) {
        new c(this, fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    /* renamed from: p0 */
    public final void m28592p0(f fVar) {
        new d(this, fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }
}
