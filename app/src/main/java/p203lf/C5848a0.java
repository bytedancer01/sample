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
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/a0.class
 */
/* renamed from: lf.a0 */
/* loaded from: combined.jar:classes2.jar:lf/a0.class */
public class C5848a0 extends RecyclerView.AbstractC0677h<d> implements Filterable {

    /* renamed from: g */
    public String f32489g;

    /* renamed from: h */
    public Context f32490h;

    /* renamed from: i */
    public DatabaseHandler f32491i;

    /* renamed from: j */
    public RecentWatchDBHandler f32492j;

    /* renamed from: l */
    public String f32494l;

    /* renamed from: m */
    public LiveStreamDBHandler f32495m;

    /* renamed from: k */
    public b f32493k = new b(this, null);

    /* renamed from: e */
    public final ArrayList<LiveStreamCategoryIdDBModel> f32487e = VodAllCategoriesSingleton.m14909b().m14914f();

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> f32488f = VodAllCategoriesSingleton.m14909b().m14914f();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a0$a.class
     */
    /* renamed from: lf.a0$a */
    /* loaded from: combined.jar:classes2.jar:lf/a0$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final int f32496b;

        /* renamed from: c */
        public final d f32497c;

        /* renamed from: d */
        public final C5848a0 f32498d;

        public a(C5848a0 c5848a0, int i10, d dVar) {
            this.f32498d = c5848a0;
            this.f32496b = i10;
            this.f32497c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((VodAllDataSingleActivity) this.f32498d.f32490h).m17011i1();
            C5848a0 c5848a0 = this.f32498d;
            c5848a0.f32489g = ((LiveStreamCategoryIdDBModel) c5848a0.f32488f.get(this.f32496b)).m14787b();
            this.f32497c.f32506w.setBackground(this.f32498d.f32490h.getResources().getDrawable(2131099869));
            if (this.f32498d.f32490h instanceof VodAllDataSingleActivity) {
                AsyncTask asyncTask = C5255e.f30089m;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    C5255e.f30089m.cancel(true);
                }
                ((VodAllDataSingleActivity) this.f32498d.f32490h).m17005c1(((LiveStreamCategoryIdDBModel) this.f32498d.f32488f.get(this.f32496b)).m14787b(), ((LiveStreamCategoryIdDBModel) this.f32498d.f32488f.get(this.f32496b)).m14788c());
            }
            this.f32498d.m4099w();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a0$b.class
     */
    /* renamed from: lf.a0$b */
    /* loaded from: combined.jar:classes2.jar:lf/a0$b.class */
    public class b extends Filter {

        /* renamed from: a */
        public final C5848a0 f32499a;

        public b(C5848a0 c5848a0) {
            this.f32499a = c5848a0;
        }

        public /* synthetic */ b(C5848a0 c5848a0, a aVar) {
            this(c5848a0);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f32499a.f32487e;
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
                this.f32499a.f32488f = (ArrayList) filterResults.values;
                this.f32499a.m4099w();
                if (this.f32499a.f32488f == null || this.f32499a.f32488f.size() != 0) {
                    ((VodAllDataSingleActivity) this.f32499a.f32490h).m16995R0();
                } else {
                    ((VodAllDataSingleActivity) this.f32499a.f32490h).m17006d1();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a0$c.class
     */
    /* renamed from: lf.a0$c */
    /* loaded from: combined.jar:classes2.jar:lf/a0$c.class */
    public class c implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32500b;

        /* renamed from: c */
        public final d f32501c;

        /* renamed from: d */
        public int f32502d;

        /* renamed from: e */
        public final C5848a0 f32503e;

        public c(C5848a0 c5848a0, View view, d dVar, int i10) {
            this.f32503e = c5848a0;
            this.f32500b = view;
            this.f32501c = dVar;
            this.f32502d = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            d dVar;
            TextView textView;
            if (!z10 || (dVar = this.f32501c) == null || (textView = dVar.f32504u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a0$d.class
     */
    /* renamed from: lf.a0$d */
    /* loaded from: combined.jar:classes2.jar:lf/a0$d.class */
    public static class d extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32504u;

        /* renamed from: v */
        public TextView f32505v;

        /* renamed from: w */
        public RelativeLayout f32506w;

        public d(View view) {
            super(view);
            this.f32504u = (TextView) view.findViewById(2131429378);
            this.f32505v = (TextView) view.findViewById(2131429377);
            this.f32506w = (RelativeLayout) view.findViewById(2131429054);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a0$e.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.a0$e */
    /* loaded from: combined.jar:classes2.jar:lf/a0$e.class */
    public class e extends AsyncTask<d, Void, Integer> {

        /* renamed from: a */
        public d f32507a;

        /* renamed from: b */
        public final C5848a0 f32508b;

        public e(C5848a0 c5848a0, d dVar) {
            this.f32508b = c5848a0;
            this.f32507a = dVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(d... dVarArr) {
            try {
                return SharepreferenceDBHandler.m15373f(this.f32508b.f32490h).equals("m3u") ? Integer.valueOf(this.f32508b.f32495m.m15173J1("movie")) : Integer.valueOf(this.f32508b.f32491i.m15109B("vod", SharepreferenceDBHandler.m15337A(this.f32508b.f32490h)));
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32507a.f32505v.setText("0");
            } else {
                this.f32507a.f32505v.setText(String.valueOf(num));
            }
            this.f32507a.f32505v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32507a.f32505v.setVisibility(8);
        }
    }

    public C5848a0(Context context, String str) {
        this.f32494l = "mobile";
        this.f32490h = context;
        this.f32491i = new DatabaseHandler(context);
        this.f32495m = new LiveStreamDBHandler(context);
        this.f32492j = new RecentWatchDBHandler(context);
        this.f32489g = str;
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f32494l = "tv";
        } else {
            this.f32494l = "mobile";
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f32493k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(@NotNull d dVar, int i10) {
        String valueOf;
        TextView textView;
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            dVar.f32504u.setText(this.f32488f.get(i10).m14788c());
            if (this.f32488f.get(i10).m14787b().equalsIgnoreCase("-1")) {
                m28465m0(dVar);
            } else {
                if (this.f32488f.get(i10).m14787b().equalsIgnoreCase("-4")) {
                    int m15302C0 = this.f32492j.m15302C0();
                    if (m15302C0 == 0 || m15302C0 == -1) {
                        dVar.f32505v.setText("0");
                    } else {
                        textView = dVar.f32505v;
                        valueOf = String.valueOf(m15302C0);
                    }
                } else {
                    valueOf = String.valueOf(this.f32488f.get(i10).m14789d());
                    textView = dVar.f32505v;
                }
                textView.setText(valueOf);
            }
            dVar.f32506w.setOnClickListener(new a(this, i10, dVar));
            if (!this.f32489g.equals(this.f32488f.get(i10).m14787b())) {
                relativeLayout = dVar.f32506w;
                drawable = this.f32490h.getResources().getDrawable(2131231527);
            } else {
                if (!((VodAllDataSingleActivity) this.f32490h).m16984F0()) {
                    dVar.f32506w.setBackground(this.f32490h.getResources().getDrawable(2131099869));
                    if (!((VodAllDataSingleActivity) this.f32490h).m17003a1()) {
                        dVar.f32506w.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = dVar.f32506w;
                    relativeLayout2.setOnFocusChangeListener(new c(this, relativeLayout2, dVar, i10));
                }
                relativeLayout = dVar.f32506w;
                drawable = this.f32490h.getResources().getDrawable(2131099869);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout22 = dVar.f32506w;
            relativeLayout22.setOnFocusChangeListener(new c(this, relativeLayout22, dVar, i10));
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public d mo2998J(ViewGroup viewGroup, int i10) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(2131624511, viewGroup, false));
    }

    /* renamed from: m0 */
    public final void m28465m0(d dVar) {
        new e(this, dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f32488f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n0 */
    public void m28466n0(String str) {
        this.f32489g = str;
    }
}
