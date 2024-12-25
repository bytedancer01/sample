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
import com.maxdigitall.maxdigitaliptvbox.model.SeriesAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/v.class
 */
/* renamed from: lf.v */
/* loaded from: combined.jar:classes2.jar:lf/v.class */
public class C5869v extends RecyclerView.AbstractC0677h<e> implements Filterable {

    /* renamed from: g */
    public String f32844g;

    /* renamed from: h */
    public Context f32845h;

    /* renamed from: i */
    public DatabaseHandler f32846i;

    /* renamed from: j */
    public SeriesRecentWatchDatabase f32847j;

    /* renamed from: l */
    public String f32849l;

    /* renamed from: m */
    public LiveStreamDBHandler f32850m;

    /* renamed from: k */
    public b f32848k = new b(this, null);

    /* renamed from: e */
    public final ArrayList<LiveStreamCategoryIdDBModel> f32842e = SeriesAllCategoriesSingleton.m14899b().m14901c();

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> f32843f = SeriesAllCategoriesSingleton.m14899b().m14901c();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/v$a.class
     */
    /* renamed from: lf.v$a */
    /* loaded from: combined.jar:classes2.jar:lf/v$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final int f32851b;

        /* renamed from: c */
        public final e f32852c;

        /* renamed from: d */
        public final C5869v f32853d;

        public a(C5869v c5869v, int i10, e eVar) {
            this.f32853d = c5869v;
            this.f32851b = i10;
            this.f32852c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((SeriesAllDataSingleActivity) this.f32853d.f32845h).m16550i1();
            C5869v c5869v = this.f32853d;
            c5869v.f32844g = ((LiveStreamCategoryIdDBModel) c5869v.f32843f.get(this.f32851b)).m14787b();
            this.f32852c.f32863w.setBackground(this.f32853d.f32845h.getResources().getDrawable(2131099869));
            if (this.f32853d.f32845h instanceof SeriesAllDataSingleActivity) {
                AsyncTask asyncTask = C5255e.f30088l;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    C5255e.f30088l.cancel(true);
                }
                ((SeriesAllDataSingleActivity) this.f32853d.f32845h).m16544c1(((LiveStreamCategoryIdDBModel) this.f32853d.f32843f.get(this.f32851b)).m14787b(), ((LiveStreamCategoryIdDBModel) this.f32853d.f32843f.get(this.f32851b)).m14788c());
            }
            this.f32853d.m4099w();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/v$b.class
     */
    /* renamed from: lf.v$b */
    /* loaded from: combined.jar:classes2.jar:lf/v$b.class */
    public class b extends Filter {

        /* renamed from: a */
        public final C5869v f32854a;

        public b(C5869v c5869v) {
            this.f32854a = c5869v;
        }

        public /* synthetic */ b(C5869v c5869v, a aVar) {
            this(c5869v);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f32854a.f32842e;
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
                this.f32854a.f32843f = (ArrayList) filterResults.values;
                this.f32854a.m4099w();
                if (this.f32854a.f32843f == null || this.f32854a.f32843f.size() != 0) {
                    ((SeriesAllDataSingleActivity) this.f32854a.f32845h).m16534R0();
                } else {
                    ((SeriesAllDataSingleActivity) this.f32854a.f32845h).m16545d1();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/v$c.class
     */
    /* renamed from: lf.v$c */
    /* loaded from: combined.jar:classes2.jar:lf/v$c.class */
    public class c implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32855b;

        /* renamed from: c */
        public final e f32856c;

        /* renamed from: d */
        public int f32857d;

        /* renamed from: e */
        public final C5869v f32858e;

        public c(C5869v c5869v, View view, e eVar, int i10) {
            this.f32858e = c5869v;
            this.f32855b = view;
            this.f32856c = eVar;
            this.f32857d = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            e eVar;
            TextView textView;
            if (!z10 || (eVar = this.f32856c) == null || (textView = eVar.f32861u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/v$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.v$d */
    /* loaded from: combined.jar:classes2.jar:lf/v$d.class */
    public class d extends AsyncTask<e, Void, Integer> {

        /* renamed from: a */
        public e f32859a;

        /* renamed from: b */
        public final C5869v f32860b;

        public d(C5869v c5869v, e eVar) {
            this.f32860b = c5869v;
            this.f32859a = eVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(e... eVarArr) {
            try {
                return SharepreferenceDBHandler.m15373f(this.f32860b.f32845h).equals("m3u") ? Integer.valueOf(this.f32860b.f32850m.m15173J1("series")) : Integer.valueOf(this.f32860b.f32846i.m15109B("series", SharepreferenceDBHandler.m15337A(this.f32860b.f32845h)));
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32859a.f32862v.setText("0");
            } else {
                this.f32859a.f32862v.setText(String.valueOf(num));
            }
            this.f32859a.f32862v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32859a.f32862v.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/v$e.class
     */
    /* renamed from: lf.v$e */
    /* loaded from: combined.jar:classes2.jar:lf/v$e.class */
    public static class e extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32861u;

        /* renamed from: v */
        public TextView f32862v;

        /* renamed from: w */
        public RelativeLayout f32863w;

        public e(View view) {
            super(view);
            this.f32861u = (TextView) view.findViewById(2131429378);
            this.f32862v = (TextView) view.findViewById(2131429377);
            this.f32863w = (RelativeLayout) view.findViewById(2131429054);
        }
    }

    public C5869v(Context context, String str) {
        this.f32849l = "mobile";
        this.f32845h = context;
        this.f32846i = new DatabaseHandler(context);
        this.f32850m = new LiveStreamDBHandler(context);
        this.f32847j = new SeriesRecentWatchDatabase(context);
        this.f32844g = str;
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f32849l = "tv";
        } else {
            this.f32849l = "mobile";
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f32848k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(@NotNull e eVar, int i10) {
        String valueOf;
        TextView textView;
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            eVar.f32861u.setText(this.f32843f.get(i10).m14788c());
            if (this.f32843f.get(i10).m14787b().equalsIgnoreCase("-1")) {
                m28648m0(eVar);
            } else {
                if (this.f32843f.get(i10).m14787b().equalsIgnoreCase("-4")) {
                    int m15331q0 = this.f32847j.m15331q0();
                    if (m15331q0 == 0 || m15331q0 == -1) {
                        eVar.f32862v.setText("0");
                    } else {
                        textView = eVar.f32862v;
                        valueOf = String.valueOf(m15331q0);
                    }
                } else {
                    valueOf = String.valueOf(this.f32843f.get(i10).m14789d());
                    textView = eVar.f32862v;
                }
                textView.setText(valueOf);
            }
            eVar.f32863w.setOnClickListener(new a(this, i10, eVar));
            if (!this.f32844g.equals(this.f32843f.get(i10).m14787b())) {
                relativeLayout = eVar.f32863w;
                drawable = this.f32845h.getResources().getDrawable(2131231527);
            } else {
                if (!((SeriesAllDataSingleActivity) this.f32845h).m16523F0()) {
                    eVar.f32863w.setBackground(this.f32845h.getResources().getDrawable(2131099869));
                    if (!((SeriesAllDataSingleActivity) this.f32845h).m16542a1()) {
                        eVar.f32863w.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = eVar.f32863w;
                    relativeLayout2.setOnFocusChangeListener(new c(this, relativeLayout2, eVar, i10));
                }
                relativeLayout = eVar.f32863w;
                drawable = this.f32845h.getResources().getDrawable(2131099869);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout22 = eVar.f32863w;
            relativeLayout22.setOnFocusChangeListener(new c(this, relativeLayout22, eVar, i10));
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public e mo2998J(ViewGroup viewGroup, int i10) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(2131624511, viewGroup, false));
    }

    /* renamed from: m0 */
    public final void m28648m0(e eVar) {
        new d(this, eVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f32843f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n0 */
    public void m28649n0(String str) {
        this.f32844g = str;
    }
}
