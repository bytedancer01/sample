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
import com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/k.class
 */
/* renamed from: lf.k */
/* loaded from: combined.jar:classes2.jar:lf/k.class */
public class C5858k extends RecyclerView.AbstractC0677h<f> implements Filterable {

    /* renamed from: g */
    public String f32665g;

    /* renamed from: h */
    public Context f32666h;

    /* renamed from: i */
    public DatabaseHandler f32667i;

    /* renamed from: k */
    public String f32669k;

    /* renamed from: l */
    public String f32670l;

    /* renamed from: m */
    public LiveStreamDBHandler f32671m;

    /* renamed from: j */
    public b f32668j = new b(this, null);

    /* renamed from: e */
    public final ArrayList<LiveStreamCategoryIdDBModel> f32663e = VodAllCategoriesSingleton.m14909b().m14911c();

    /* renamed from: f */
    public ArrayList<LiveStreamCategoryIdDBModel> f32664f = VodAllCategoriesSingleton.m14909b().m14911c();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/k$a.class
     */
    /* renamed from: lf.k$a */
    /* loaded from: combined.jar:classes2.jar:lf/k$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final int f32672b;

        /* renamed from: c */
        public final f f32673c;

        /* renamed from: d */
        public final C5858k f32674d;

        public a(C5858k c5858k, int i10, f fVar) {
            this.f32674d = c5858k;
            this.f32672b = i10;
            this.f32673c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((LiveAllDataSingleActivity) this.f32674d.f32666h).m15942i1();
            C5858k c5858k = this.f32674d;
            c5858k.f32665g = ((LiveStreamCategoryIdDBModel) c5858k.f32664f.get(this.f32672b)).m14787b();
            this.f32673c.f32686w.setBackground(this.f32674d.f32666h.getResources().getDrawable(2131099869));
            if (this.f32674d.f32666h instanceof LiveAllDataSingleActivity) {
                AsyncTask asyncTask = C5255e.f30090n;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    C5255e.f30090n.cancel(true);
                }
                ((LiveAllDataSingleActivity) this.f32674d.f32666h).m15936c1(((LiveStreamCategoryIdDBModel) this.f32674d.f32664f.get(this.f32672b)).m14787b(), ((LiveStreamCategoryIdDBModel) this.f32674d.f32664f.get(this.f32672b)).m14788c());
            }
            this.f32674d.m4099w();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/k$b.class
     */
    /* renamed from: lf.k$b */
    /* loaded from: combined.jar:classes2.jar:lf/k$b.class */
    public class b extends Filter {

        /* renamed from: a */
        public final C5858k f32675a;

        public b(C5858k c5858k) {
            this.f32675a = c5858k;
        }

        public /* synthetic */ b(C5858k c5858k, a aVar) {
            this(c5858k);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f32675a.f32663e;
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
                this.f32675a.f32664f = (ArrayList) filterResults.values;
                this.f32675a.m4099w();
                if (this.f32675a.f32664f == null || this.f32675a.f32664f.size() != 0) {
                    ((LiveAllDataSingleActivity) this.f32675a.f32666h).m15926R0();
                } else {
                    ((LiveAllDataSingleActivity) this.f32675a.f32666h).m15937d1();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/k$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.k$c */
    /* loaded from: combined.jar:classes2.jar:lf/k$c.class */
    public class c extends AsyncTask<f, Void, Integer> {

        /* renamed from: a */
        public f f32676a;

        /* renamed from: b */
        public final C5858k f32677b;

        public c(C5858k c5858k, f fVar) {
            this.f32677b = c5858k;
            this.f32676a = fVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            return Integer.valueOf(SharepreferenceDBHandler.m15373f(this.f32677b.f32666h).equals("m3u") ? this.f32677b.f32671m.m15173J1("live") : this.f32677b.f32670l.equals("true") ? this.f32677b.f32667i.m15109B("radio_streams", SharepreferenceDBHandler.m15337A(this.f32677b.f32666h)) : this.f32677b.f32667i.m15109B("live", SharepreferenceDBHandler.m15337A(this.f32677b.f32666h)));
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32676a.f32685v.setText("0");
            } else {
                this.f32676a.f32685v.setText(String.valueOf(num));
            }
            this.f32676a.f32685v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32676a.f32685v.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/k$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.k$d */
    /* loaded from: combined.jar:classes2.jar:lf/k$d.class */
    public class d extends AsyncTask<f, Void, Integer> {

        /* renamed from: a */
        public f f32678a;

        /* renamed from: b */
        public final C5858k f32679b;

        public d(C5858k c5858k, f fVar) {
            this.f32679b = c5858k;
            this.f32678a = fVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            try {
                return Integer.valueOf(this.f32679b.f32671m.m15233m2());
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32678a.f32685v.setText("0");
            } else {
                this.f32678a.f32685v.setText(String.valueOf(num));
            }
            this.f32678a.f32685v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32678a.f32685v.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/k$e.class
     */
    /* renamed from: lf.k$e */
    /* loaded from: combined.jar:classes2.jar:lf/k$e.class */
    public class e implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32680b;

        /* renamed from: c */
        public final f f32681c;

        /* renamed from: d */
        public int f32682d;

        /* renamed from: e */
        public final C5858k f32683e;

        public e(C5858k c5858k, View view, f fVar, int i10) {
            this.f32683e = c5858k;
            this.f32680b = view;
            this.f32681c = fVar;
            this.f32682d = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            f fVar;
            TextView textView;
            if (!z10 || (fVar = this.f32681c) == null || (textView = fVar.f32684u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/k$f.class
     */
    /* renamed from: lf.k$f */
    /* loaded from: combined.jar:classes2.jar:lf/k$f.class */
    public static class f extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32684u;

        /* renamed from: v */
        public TextView f32685v;

        /* renamed from: w */
        public RelativeLayout f32686w;

        public f(View view) {
            super(view);
            this.f32684u = (TextView) view.findViewById(2131429378);
            this.f32685v = (TextView) view.findViewById(2131429377);
            this.f32686w = (RelativeLayout) view.findViewById(2131429054);
        }
    }

    public C5858k(Context context, String str, String str2) {
        this.f32669k = "mobile";
        this.f32670l = "false";
        this.f32666h = context;
        this.f32667i = new DatabaseHandler(context);
        this.f32671m = new LiveStreamDBHandler(context);
        this.f32665g = str2;
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f32669k = "tv";
        } else {
            this.f32669k = "mobile";
        }
        this.f32670l = str;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f32668j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(@NotNull f fVar, int i10) {
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            fVar.f32684u.setText(this.f32664f.get(i10).m14788c());
            if (this.f32664f.get(i10).m14787b().equalsIgnoreCase("-1")) {
                m28556n0(fVar);
            } else if (this.f32664f.get(i10).m14787b().equalsIgnoreCase("-6")) {
                m28557o0(fVar);
            } else {
                fVar.f32685v.setText(String.valueOf(this.f32664f.get(i10).m14789d()));
            }
            fVar.f32686w.setOnClickListener(new a(this, i10, fVar));
            if (!this.f32665g.equals(this.f32664f.get(i10).m14787b())) {
                relativeLayout = fVar.f32686w;
                drawable = this.f32666h.getResources().getDrawable(2131231527);
            } else {
                if (!((LiveAllDataSingleActivity) this.f32666h).m15915F0()) {
                    fVar.f32686w.setBackground(this.f32666h.getResources().getDrawable(2131099869));
                    if (!((LiveAllDataSingleActivity) this.f32666h).m15933Z0()) {
                        fVar.f32686w.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = fVar.f32686w;
                    relativeLayout2.setOnFocusChangeListener(new e(this, relativeLayout2, fVar, i10));
                }
                relativeLayout = fVar.f32686w;
                drawable = this.f32666h.getResources().getDrawable(2131099869);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout22 = fVar.f32686w;
            relativeLayout22.setOnFocusChangeListener(new e(this, relativeLayout22, fVar, i10));
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public f mo2998J(ViewGroup viewGroup, int i10) {
        return new f(LayoutInflater.from(viewGroup.getContext()).inflate(2131624511, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f32664f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n0 */
    public final void m28556n0(f fVar) {
        new c(this, fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    /* renamed from: o0 */
    public final void m28557o0(f fVar) {
        new d(this, fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    /* renamed from: p0 */
    public void m28558p0(String str) {
        this.f32665g = str;
    }
}
