package p203lf;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAd;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivityLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import nf.C6783a;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/x.class
 */
/* renamed from: lf.x */
/* loaded from: combined.jar:classes2.jar:lf/x.class */
public class C5871x extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: e */
    public List<Object> f32876e;

    /* renamed from: f */
    public Context f32877f;

    /* renamed from: g */
    public List<Object> f32878g;

    /* renamed from: h */
    public List<Object> f32879h;

    /* renamed from: i */
    public int f32880i;

    /* renamed from: j */
    public int f32881j;

    /* renamed from: k */
    public LiveStreamDBHandler f32882k;

    /* renamed from: l */
    public DatabaseHandler f32883l;

    /* renamed from: o */
    public String f32886o;

    /* renamed from: m */
    public boolean f32884m = true;

    /* renamed from: n */
    public ArrayList<String> f32885n = new ArrayList<>();

    /* renamed from: p */
    public int f32887p = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/x$a.class
     */
    /* renamed from: lf.x$a */
    /* loaded from: combined.jar:classes2.jar:lf/x$a.class */
    public class a implements View.OnKeyListener {

        /* renamed from: b */
        public final RecyclerView f32888b;

        /* renamed from: c */
        public final C5871x f32889c;

        public a(C5871x c5871x, RecyclerView recyclerView) {
            this.f32889c = c5871x;
            this.f32888b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            C5871x c5871x;
            int i11;
            RecyclerView.AbstractC0685p layoutManager = this.f32888b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i10 == 20) {
                c5871x = this.f32889c;
                i11 = 1;
            } else {
                if (i10 != 19) {
                    return false;
                }
                c5871x = this.f32889c;
                i11 = -1;
            }
            return c5871x.m28668t0(layoutManager, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/x$b.class
     */
    /* renamed from: lf.x$b */
    /* loaded from: combined.jar:classes2.jar:lf/x$b.class */
    public class b implements Comparator<Object> {

        /* renamed from: b */
        public final C5871x f32890b;

        public b(C5871x c5871x) {
            this.f32890b = c5871x;
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
      classes2.jar:lf/x$c.class
     */
    /* renamed from: lf.x$c */
    /* loaded from: combined.jar:classes2.jar:lf/x$c.class */
    public class c implements Comparator<Object> {

        /* renamed from: b */
        public final C5871x f32891b;

        public c(C5871x c5871x) {
            this.f32891b = c5871x;
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
      classes2.jar:lf/x$d.class
     */
    /* renamed from: lf.x$d */
    /* loaded from: combined.jar:classes2.jar:lf/x$d.class */
    public class d implements View.OnClickListener {

        /* renamed from: b */
        public final RecyclerView.AbstractC0674e0 f32892b;

        /* renamed from: c */
        public final String f32893c;

        /* renamed from: d */
        public final String f32894d;

        /* renamed from: e */
        public final C5871x f32895e;

        public d(C5871x c5871x, RecyclerView.AbstractC0674e0 abstractC0674e0, String str, String str2) {
            this.f32895e = c5871x;
            this.f32892b = abstractC0674e0;
            this.f32893c = str;
            this.f32894d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32895e.f32887p = this.f32892b.m4068r();
            Intent intent = new Intent(this.f32895e.f32877f, (Class<?>) TVArchiveActivityLayout.class);
            intent.putExtra("category_id", this.f32893c);
            intent.putExtra("category_name", this.f32894d);
            this.f32895e.f32877f.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/x$e.class
     */
    /* renamed from: lf.x$e */
    /* loaded from: combined.jar:classes2.jar:lf/x$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final String f32896b;

        /* renamed from: c */
        public final TextView f32897c;

        /* renamed from: d */
        public final C5871x f32898d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:lf/x$e$a.class
         */
        /* renamed from: lf.x$e$a */
        /* loaded from: combined.jar:classes2.jar:lf/x$e$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final e f32899b;

            public a(e eVar) {
                this.f32899b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5871x c5871x;
                List list;
                if (!TextUtils.isEmpty(this.f32899b.f32896b)) {
                    if (!this.f32899b.f32898d.f32878g.isEmpty() || this.f32899b.f32898d.f32878g.isEmpty()) {
                        c5871x = this.f32899b.f32898d;
                        list = c5871x.f32878g;
                    }
                    if (this.f32899b.f32898d.f32876e != null && this.f32899b.f32898d.f32876e.size() == 0) {
                        this.f32899b.f32897c.setVisibility(0);
                    }
                    C5871x c5871x2 = this.f32899b.f32898d;
                    c5871x2.f32880i = c5871x2.f32881j;
                    this.f32899b.f32898d.m4099w();
                }
                c5871x = this.f32899b.f32898d;
                list = c5871x.f32879h;
                c5871x.f32876e = list;
                if (this.f32899b.f32898d.f32876e != null) {
                    this.f32899b.f32897c.setVisibility(0);
                }
                C5871x c5871x22 = this.f32899b.f32898d;
                c5871x22.f32880i = c5871x22.f32881j;
                this.f32899b.f32898d.m4099w();
            }
        }

        public e(C5871x c5871x, String str, TextView textView) {
            this.f32898d = c5871x;
            this.f32896b = str;
            this.f32897c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32898d.f32878g = new ArrayList();
            this.f32898d.f32881j = this.f32896b.length();
            if (this.f32898d.f32878g != null) {
                this.f32898d.f32878g.clear();
            }
            if (TextUtils.isEmpty(this.f32896b)) {
                this.f32898d.f32878g.addAll(this.f32898d.f32879h);
            } else {
                if ((this.f32898d.f32876e != null && this.f32898d.f32876e.size() == 0) || this.f32898d.f32880i > this.f32898d.f32881j) {
                    C5871x c5871x = this.f32898d;
                    c5871x.f32876e = c5871x.f32879h;
                }
                if (this.f32898d.f32876e != null) {
                    for (int i10 = 0; i10 < this.f32898d.f32876e.size(); i10++) {
                        try {
                            C5859l c5859l = (C5859l) this.f32898d.f32876e.get(i10);
                            if (c5859l.m28564b().toLowerCase().contains(this.f32896b.toLowerCase())) {
                                this.f32898d.f32878g.add(c5859l);
                            }
                        } catch (Exception e10) {
                        }
                    }
                }
            }
            ((Activity) this.f32898d.f32877f).runOnUiThread(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/x$f.class
     */
    /* renamed from: lf.x$f */
    /* loaded from: combined.jar:classes2.jar:lf/x$f.class */
    public class f implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32900b;

        /* renamed from: c */
        public final C5871x f32901c;

        public f(C5871x c5871x, View view) {
            this.f32901c = c5871x;
            this.f32900b = view;
        }

        /* renamed from: a */
        public final void m28669a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32900b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m28670b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32900b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m28671c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32900b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.09f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m28670b(f10);
                m28671c(f10);
                Log.e("id is", "" + this.f32900b.getTag());
                view2 = this.f32900b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m28670b(f10);
                m28671c(f10);
                m28669a(z10);
                view2 = this.f32900b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/x$g.class
     */
    /* renamed from: lf.x$g */
    /* loaded from: combined.jar:classes2.jar:lf/x$g.class */
    public static class g extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32902u;

        /* renamed from: v */
        public ProgressBar f32903v;

        /* renamed from: w */
        public RelativeLayout f32904w;

        /* renamed from: x */
        public RelativeLayout f32905x;

        /* renamed from: y */
        public RelativeLayout f32906y;

        /* renamed from: z */
        public TextView f32907z;

        public g(View view) {
            super(view);
            this.f32902u = (TextView) view.findViewById(2131429513);
            this.f32903v = (ProgressBar) view.findViewById(2131428840);
            this.f32904w = (RelativeLayout) view.findViewById(2131429028);
            this.f32906y = (RelativeLayout) view.findViewById(2131429278);
            this.f32905x = (RelativeLayout) view.findViewById(2131429008);
            this.f32907z = (TextView) view.findViewById(2131429620);
            m4048L(false);
        }
    }

    public C5871x(List<Object> list, Context context) {
        this.f32886o = "";
        ArrayList arrayList = new ArrayList();
        this.f32878g = arrayList;
        arrayList.addAll(list);
        this.f32879h = list;
        this.f32876e = list;
        this.f32877f = context;
        this.f32882k = new LiveStreamDBHandler(context);
        this.f32883l = new DatabaseHandler(context);
        this.f32886o = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        String string = context.getSharedPreferences("sortcatch", 0).getString("sort", "");
        if (string.equals("1")) {
            Collections.sort(list, new b(this));
        }
        if (string.equals("2")) {
            Collections.sort(list, new c(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: F */
    public void mo4088F(RecyclerView recyclerView) {
        super.mo4088F(recyclerView);
        recyclerView.setOnKeyListener(new a(this, recyclerView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: G */
    public void mo2996G(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        TextView textView;
        int size;
        try {
            Bundle bundle = new Bundle();
            if (mo3018q(i10) == 1) {
                C5860m c5860m = (C5860m) abstractC0674e0;
                NativeAd nativeAd = (NativeAd) this.f32876e.get(i10);
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
            C5859l c5859l = (C5859l) this.f32876e.get(i10);
            String m28564b = c5859l.m28564b();
            String m28563a = c5859l.m28563a();
            int m28565c = c5859l.m28565c();
            bundle.putString("category_id", m28563a);
            bundle.putString("category_name", m28564b);
            if (m28564b != null && !m28564b.equals("") && !m28564b.isEmpty()) {
                gVar.f32902u.setText(m28564b);
            }
            boolean z10 = -1;
            if (m28563a.hashCode() == 48 && m28563a.equals("0")) {
                z10 = false;
            }
            if (z10) {
                textView = gVar.f32907z;
                size = m28565c;
            } else {
                ArrayList<LiveStreamsDBModel> m15212d1 = this.f32882k.m15212d1("0");
                if (m15212d1 == null || m15212d1.size() == 0) {
                    gVar.f32907z.setText("");
                    if (new C6783a(this.f32877f).m31288z().equals(C5251a.f30065s0) && this.f32881j == 0 && !C5251a.f30021T.booleanValue() && i10 == this.f32887p) {
                        gVar.f32904w.requestFocus();
                        m28665q0(1.09f, gVar.f32904w);
                        m28666r0(1.09f, gVar.f32904w);
                        gVar.f32904w.setBackgroundResource(2131231896);
                    }
                    gVar.f32904w.setOnClickListener(new d(this, abstractC0674e0, m28563a, m28564b));
                    gVar.f32904w.setOnFocusChangeListener(new f(this, gVar.f32904w));
                    if (i10 == 0 || !this.f32884m) {
                    }
                    gVar.f32904w.requestFocus();
                    this.f32884m = false;
                    return;
                }
                textView = gVar.f32907z;
                size = m15212d1.size();
            }
            textView.setText(String.valueOf(size));
            if (new C6783a(this.f32877f).m31288z().equals(C5251a.f30065s0)) {
                gVar.f32904w.requestFocus();
                m28665q0(1.09f, gVar.f32904w);
                m28666r0(1.09f, gVar.f32904w);
                gVar.f32904w.setBackgroundResource(2131231896);
            }
            gVar.f32904w.setOnClickListener(new d(this, abstractC0674e0, m28563a, m28564b));
            gVar.f32904w.setOnFocusChangeListener(new f(this, gVar.f32904w));
            if (i10 == 0) {
            }
        } catch (NullPointerException | Exception e10) {
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
        if (SharepreferenceDBHandler.m15397t(this.f32877f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new g(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32876e.size();
    }

    /* renamed from: p0 */
    public void m28664p0(String str, TextView textView) {
        new Thread(new e(this, str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f32876e.get(i10) instanceof NativeAd ? 1 : 0;
    }

    /* renamed from: q0 */
    public final void m28665q0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: r0 */
    public final void m28666r0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: s0 */
    public void m28667s0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: t0 */
    public final boolean m28668t0(RecyclerView.AbstractC0685p abstractC0685p, int i10) {
        int i11 = this.f32887p + i10;
        if (i11 < 0 || i11 >= mo3013n()) {
            return false;
        }
        m4100x(this.f32887p);
        this.f32887p = i11;
        m4100x(i11);
        abstractC0685p.mo2769U1(this.f32887p);
        return true;
    }
}
