package p203lf;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAd;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/j.class
 */
/* renamed from: lf.j */
/* loaded from: combined.jar:classes2.jar:lf/j.class */
public class C5857j extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: e */
    public List<Object> f32630e;

    /* renamed from: f */
    public Context f32631f;

    /* renamed from: g */
    public List<Object> f32632g;

    /* renamed from: h */
    public List<Object> f32633h;

    /* renamed from: i */
    public int f32634i;

    /* renamed from: j */
    public int f32635j;

    /* renamed from: k */
    public LiveStreamDBHandler f32636k;

    /* renamed from: l */
    public DatabaseHandler f32637l;

    /* renamed from: m */
    public boolean f32638m = true;

    /* renamed from: n */
    public int f32639n = 0;

    /* renamed from: o */
    public AsyncTask f32640o = null;

    /* renamed from: p */
    public int f32641p = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$a.class
     */
    /* renamed from: lf.j$a */
    /* loaded from: combined.jar:classes2.jar:lf/j$a.class */
    public class a implements Comparator<Object> {

        /* renamed from: b */
        public final C5857j f32642b;

        public a(C5857j c5857j) {
            this.f32642b = c5857j;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            try {
                return ((C5859l) obj).m28564b().compareTo(((C5859l) obj2).m28564b());
            } catch (Exception e10) {
                return -1;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$b.class
     */
    /* renamed from: lf.j$b */
    /* loaded from: combined.jar:classes2.jar:lf/j$b.class */
    public class b implements Comparator<Object> {

        /* renamed from: b */
        public final C5857j f32643b;

        public b(C5857j c5857j) {
            this.f32643b = c5857j;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            try {
                return ((C5859l) obj2).m28564b().compareTo(((C5859l) obj).m28564b());
            } catch (Exception e10) {
                return -1;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$c.class
     */
    /* renamed from: lf.j$c */
    /* loaded from: combined.jar:classes2.jar:lf/j$c.class */
    public class c implements View.OnClickListener {

        /* renamed from: b */
        public final g f32644b;

        /* renamed from: c */
        public final String f32645c;

        /* renamed from: d */
        public final String f32646d;

        /* renamed from: e */
        public final C5857j f32647e;

        public c(C5857j c5857j, g gVar, String str, String str2) {
            this.f32647e = c5857j;
            this.f32644b = gVar;
            this.f32645c = str;
            this.f32646d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32647e.f32641p = this.f32644b.m4068r();
            C5255e.m26221X(this.f32647e.f32631f, "Built-in Player ( Default )", -1, "live", 0, "", "", "", this.f32645c, "", this.f32646d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$d.class
     */
    /* renamed from: lf.j$d */
    /* loaded from: combined.jar:classes2.jar:lf/j$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final String f32648b;

        /* renamed from: c */
        public final TextView f32649c;

        /* renamed from: d */
        public final C5857j f32650d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:lf/j$d$a.class
         */
        /* renamed from: lf.j$d$a */
        /* loaded from: combined.jar:classes2.jar:lf/j$d$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final d f32651b;

            public a(d dVar) {
                this.f32651b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5857j c5857j;
                List list;
                if (!TextUtils.isEmpty(this.f32651b.f32648b)) {
                    if (!this.f32651b.f32650d.f32632g.isEmpty() || this.f32651b.f32650d.f32632g.isEmpty()) {
                        c5857j = this.f32651b.f32650d;
                        list = c5857j.f32632g;
                    }
                    if (this.f32651b.f32650d.f32630e != null && this.f32651b.f32650d.f32630e.size() == 0) {
                        this.f32651b.f32649c.setVisibility(0);
                    }
                    C5857j c5857j2 = this.f32651b.f32650d;
                    c5857j2.f32634i = c5857j2.f32635j;
                    this.f32651b.f32650d.m4099w();
                }
                c5857j = this.f32651b.f32650d;
                list = c5857j.f32633h;
                c5857j.f32630e = list;
                if (this.f32651b.f32650d.f32630e != null) {
                    this.f32651b.f32649c.setVisibility(0);
                }
                C5857j c5857j22 = this.f32651b.f32650d;
                c5857j22.f32634i = c5857j22.f32635j;
                this.f32651b.f32650d.m4099w();
            }
        }

        public d(C5857j c5857j, String str, TextView textView) {
            this.f32650d = c5857j;
            this.f32648b = str;
            this.f32649c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32650d.f32632g = new ArrayList();
            this.f32650d.f32635j = this.f32648b.length();
            if (this.f32650d.f32632g != null) {
                this.f32650d.f32632g.clear();
            }
            if (TextUtils.isEmpty(this.f32648b)) {
                this.f32650d.f32632g.addAll(this.f32650d.f32633h);
            } else {
                if ((this.f32650d.f32630e != null && this.f32650d.f32630e.size() == 0) || this.f32650d.f32634i > this.f32650d.f32635j) {
                    C5857j c5857j = this.f32650d;
                    c5857j.f32630e = c5857j.f32633h;
                }
                if (this.f32650d.f32630e != null) {
                    for (int i10 = 0; i10 < this.f32650d.f32630e.size(); i10++) {
                        try {
                            C5859l c5859l = (C5859l) this.f32650d.f32630e.get(i10);
                            if (c5859l.m28564b().toLowerCase().contains(this.f32648b.toLowerCase())) {
                                this.f32650d.f32632g.add(c5859l);
                            }
                        } catch (Exception e10) {
                        }
                    }
                }
            }
            ((Activity) this.f32650d.f32631f).runOnUiThread(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$e.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.j$e */
    /* loaded from: combined.jar:classes2.jar:lf/j$e.class */
    public class e extends AsyncTask<g, Void, Integer> {

        /* renamed from: a */
        public g f32652a;

        /* renamed from: b */
        public final C5857j f32653b;

        public e(C5857j c5857j, g gVar) {
            this.f32653b = c5857j;
            this.f32652a = gVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(g... gVarArr) {
            try {
                return SharepreferenceDBHandler.m15373f(this.f32653b.f32631f).equals("m3u") ? Integer.valueOf(this.f32653b.f32636k.m15173J1("live")) : Integer.valueOf(this.f32653b.f32637l.m15109B("live", SharepreferenceDBHandler.m15337A(this.f32653b.f32631f)));
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32652a.f32662z.setText("0");
            } else {
                this.f32652a.f32662z.setText(String.valueOf(num));
            }
            this.f32652a.f32662z.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32652a.f32662z.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$f.class
     */
    /* renamed from: lf.j$f */
    /* loaded from: combined.jar:classes2.jar:lf/j$f.class */
    public class f implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32654b;

        /* renamed from: c */
        public final C5857j f32655c;

        public f(C5857j c5857j, View view) {
            this.f32655c = c5857j;
            this.f32654b = view;
        }

        /* renamed from: a */
        public final void m28540a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32654b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m28541b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32654b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m28542c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32654b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            if (z10) {
                m28541b(1.09f);
                m28542c(1.09f);
                Log.e("id is", "" + this.f32654b.getTag());
                view2 = this.f32654b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                m28541b(1.0f);
                m28542c(1.0f);
                m28540a(false);
                view2 = this.f32654b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/j$g.class
     */
    /* renamed from: lf.j$g */
    /* loaded from: combined.jar:classes2.jar:lf/j$g.class */
    public static class g extends RecyclerView.AbstractC0674e0 {

        /* renamed from: A */
        public ImageView f32656A;

        /* renamed from: u */
        public TextView f32657u;

        /* renamed from: v */
        public ProgressBar f32658v;

        /* renamed from: w */
        public RelativeLayout f32659w;

        /* renamed from: x */
        public RelativeLayout f32660x;

        /* renamed from: y */
        public RelativeLayout f32661y;

        /* renamed from: z */
        public TextView f32662z;

        public g(View view) {
            super(view);
            this.f32657u = (TextView) view.findViewById(2131429513);
            this.f32658v = (ProgressBar) view.findViewById(2131428840);
            this.f32659w = (RelativeLayout) view.findViewById(2131429028);
            this.f32661y = (RelativeLayout) view.findViewById(2131429278);
            this.f32660x = (RelativeLayout) view.findViewById(2131429008);
            this.f32662z = (TextView) view.findViewById(2131429620);
            this.f32656A = (ImageView) view.findViewById(2131428181);
            m4048L(false);
        }
    }

    public C5857j(List<Object> list, Context context) {
        ArrayList arrayList = new ArrayList();
        this.f32632g = arrayList;
        arrayList.addAll(list);
        this.f32633h = list;
        this.f32630e = list;
        this.f32631f = context;
        this.f32636k = new LiveStreamDBHandler(context);
        this.f32637l = new DatabaseHandler(context);
        String m15381j = SharepreferenceDBHandler.m15381j(context);
        if (m15381j.equals("1")) {
            Collections.sort(list, new a(this));
        }
        if (m15381j.equals("2")) {
            Collections.sort(list, new b(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: G */
    public void mo2996G(RecyclerView.AbstractC0674e0 abstractC0674e0, @SuppressLint({"RecyclerView"}) int i10) {
        try {
            if (mo3018q(i10) == 1) {
                C5860m c5860m = (C5860m) abstractC0674e0;
                NativeAd nativeAd = (NativeAd) this.f32630e.get(i10);
                c5860m.m28570V().setText(nativeAd.getAdvertiserName());
                c5860m.m28569U().setText(nativeAd.getAdSocialContext());
                c5860m.m28567S().setText(nativeAd.getAdCallToAction());
                c5860m.m28567S().setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
                ArrayList arrayList = new ArrayList();
                arrayList.add(c5860m.m28567S());
                arrayList.add(c5860m.m28566R());
                nativeAd.registerViewForInteraction(c5860m.m28566R(), c5860m.m28568T(), arrayList);
                return;
            }
            g gVar = (g) abstractC0674e0;
            C5859l c5859l = (C5859l) this.f32630e.get(i10);
            String m28564b = c5859l.m28564b();
            String m28563a = c5859l.m28563a();
            int m28565c = c5859l.m28565c();
            if (m28564b != null && !m28564b.equals("") && !m28564b.isEmpty()) {
                gVar.f32657u.setText(m28564b);
            }
            if (SharepreferenceDBHandler.m15373f(this.f32631f).equals("m3u")) {
                if (m28563a.equals("-1")) {
                    m28536t0(gVar);
                } else {
                    gVar.f32662z.setText(String.valueOf(m28565c));
                }
                if (m28563a.equals("0")) {
                    this.f32639n = m28565c;
                }
            } else {
                if (m28563a.equals("-1")) {
                    m28536t0(gVar);
                } else {
                    gVar.f32662z.setText(String.valueOf(m28565c));
                }
                if (m28563a.equals("0")) {
                    int m15205Z1 = this.f32636k.m15205Z1("live");
                    if (m15205Z1 == 0 || m15205Z1 == -1) {
                        gVar.f32662z.setText("");
                    } else {
                        gVar.f32662z.setText(String.valueOf(m15205Z1));
                    }
                }
            }
            if (new C6783a(this.f32631f).m31288z().equals(C5251a.f30065s0) && this.f32635j == 0 && !C5251a.f30021T.booleanValue() && i10 == this.f32641p) {
                gVar.f32659w.requestFocus();
                m28534r0(1.09f, gVar.f32659w);
                m28535s0(1.09f, gVar.f32659w);
                gVar.f32659w.setBackgroundResource(2131231896);
            }
            gVar.f32659w.setOnClickListener(new c(this, gVar, m28563a, m28564b));
            gVar.f32659w.setOnFocusChangeListener(new f(this, gVar.f32659w));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
        if (i10 == 1) {
            return new C5860m(LayoutInflater.from(viewGroup.getContext()).inflate(2131624106, viewGroup, false));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624240, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131428181);
        if (SharepreferenceDBHandler.m15397t(this.f32631f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new g(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        List<Object> list = this.f32630e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f32630e.get(i10) instanceof NativeAd ? 1 : 0;
    }

    /* renamed from: q0 */
    public void m28533q0(String str, TextView textView) {
        new Thread(new d(this, str, textView)).start();
    }

    /* renamed from: r0 */
    public final void m28534r0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: s0 */
    public final void m28535s0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: t0 */
    public final void m28536t0(g gVar) {
        new e(this, gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, gVar);
    }

    /* renamed from: u0 */
    public void m28537u0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
