package p203lf;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
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
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivitNewFlowSubCat;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/u.class
 */
/* renamed from: lf.u */
/* loaded from: combined.jar:classes2.jar:lf/u.class */
public class C5868u extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: e */
    public List<Object> f32806e;

    /* renamed from: f */
    public Context f32807f;

    /* renamed from: g */
    public LiveStreamDBHandler f32808g;

    /* renamed from: h */
    public List<Object> f32809h;

    /* renamed from: i */
    public List<Object> f32810i;

    /* renamed from: j */
    public int f32811j;

    /* renamed from: k */
    public int f32812k;

    /* renamed from: l */
    public DatabaseHandler f32813l;

    /* renamed from: o */
    public SeriesRecentWatchDatabase f32816o;

    /* renamed from: m */
    public String f32814m = "";

    /* renamed from: n */
    public int f32815n = 0;

    /* renamed from: p */
    public int f32817p = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/u$a.class
     */
    /* renamed from: lf.u$a */
    /* loaded from: combined.jar:classes2.jar:lf/u$a.class */
    public class a implements View.OnKeyListener {

        /* renamed from: b */
        public final RecyclerView f32818b;

        /* renamed from: c */
        public final C5868u f32819c;

        public a(C5868u c5868u, RecyclerView recyclerView) {
            this.f32819c = c5868u;
            this.f32818b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            C5868u c5868u;
            int i11;
            RecyclerView.AbstractC0685p layoutManager = this.f32818b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i10 == 20) {
                c5868u = this.f32819c;
                i11 = 1;
            } else {
                if (i10 != 19) {
                    return false;
                }
                c5868u = this.f32819c;
                i11 = -1;
            }
            return c5868u.m28630q0(layoutManager, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/u$b.class
     */
    /* renamed from: lf.u$b */
    /* loaded from: combined.jar:classes2.jar:lf/u$b.class */
    public class b implements Comparator<Object> {

        /* renamed from: b */
        public final C5868u f32820b;

        public b(C5868u c5868u) {
            this.f32820b = c5868u;
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
      classes2.jar:lf/u$c.class
     */
    /* renamed from: lf.u$c */
    /* loaded from: combined.jar:classes2.jar:lf/u$c.class */
    public class c implements Comparator<Object> {

        /* renamed from: b */
        public final C5868u f32821b;

        public c(C5868u c5868u) {
            this.f32821b = c5868u;
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
      classes2.jar:lf/u$d.class
     */
    /* renamed from: lf.u$d */
    /* loaded from: combined.jar:classes2.jar:lf/u$d.class */
    public class d implements View.OnClickListener {

        /* renamed from: b */
        public final RecyclerView.AbstractC0674e0 f32822b;

        /* renamed from: c */
        public final String f32823c;

        /* renamed from: d */
        public final String f32824d;

        /* renamed from: e */
        public final C5868u f32825e;

        public d(C5868u c5868u, RecyclerView.AbstractC0674e0 abstractC0674e0, String str, String str2) {
            this.f32825e = c5868u;
            this.f32822b = abstractC0674e0;
            this.f32823c = str;
            this.f32824d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32825e.f32817p = this.f32822b.m4068r();
            Intent intent = SharepreferenceDBHandler.m15373f(this.f32825e.f32807f).equals("m3u") ? new Intent(this.f32825e.f32807f, (Class<?>) SeriesActivityNewFlowSubCategoriesM3U.class) : new Intent(this.f32825e.f32807f, (Class<?>) SeriesActivitNewFlowSubCat.class);
            intent.putExtra("category_id", this.f32823c);
            intent.putExtra("category_name", this.f32824d);
            this.f32825e.f32807f.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/u$e.class
     */
    /* renamed from: lf.u$e */
    /* loaded from: combined.jar:classes2.jar:lf/u$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final String f32826b;

        /* renamed from: c */
        public final TextView f32827c;

        /* renamed from: d */
        public final C5868u f32828d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:lf/u$e$a.class
         */
        /* renamed from: lf.u$e$a */
        /* loaded from: combined.jar:classes2.jar:lf/u$e$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final e f32829b;

            public a(e eVar) {
                this.f32829b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5868u c5868u;
                List list;
                if (!TextUtils.isEmpty(this.f32829b.f32826b)) {
                    if (!this.f32829b.f32828d.f32809h.isEmpty() || this.f32829b.f32828d.f32809h.isEmpty()) {
                        c5868u = this.f32829b.f32828d;
                        list = c5868u.f32809h;
                    }
                    if (this.f32829b.f32828d.f32806e != null && this.f32829b.f32828d.f32806e.size() == 0) {
                        this.f32829b.f32827c.setVisibility(0);
                        e eVar = this.f32829b;
                        eVar.f32827c.setText(eVar.f32828d.f32807f.getResources().getString(2132018219));
                    }
                    C5868u c5868u2 = this.f32829b.f32828d;
                    c5868u2.f32811j = c5868u2.f32812k;
                    c5868u2.m4099w();
                }
                c5868u = this.f32829b.f32828d;
                list = c5868u.f32810i;
                c5868u.f32806e = list;
                if (this.f32829b.f32828d.f32806e != null) {
                    this.f32829b.f32827c.setVisibility(0);
                    e eVar2 = this.f32829b;
                    eVar2.f32827c.setText(eVar2.f32828d.f32807f.getResources().getString(2132018219));
                }
                C5868u c5868u22 = this.f32829b.f32828d;
                c5868u22.f32811j = c5868u22.f32812k;
                c5868u22.m4099w();
            }
        }

        public e(C5868u c5868u, String str, TextView textView) {
            this.f32828d = c5868u;
            this.f32826b = str;
            this.f32827c = textView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        
            if (r0.f32811j > r0.f32812k) goto L14;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                r0 = r5
                lf.u r0 = r0.f32828d
                r1 = r5
                java.lang.String r1 = r1.f32826b
                int r1 = r1.length()
                r0.f32812k = r1
                r0 = r5
                lf.u r0 = r0.f32828d
                java.util.List r0 = p203lf.C5868u.m28620g0(r0)
                if (r0 == 0) goto L24
                r0 = r5
                lf.u r0 = r0.f32828d
                java.util.List r0 = p203lf.C5868u.m28620g0(r0)
                r0.clear()
            L24:
                r0 = r5
                java.lang.String r0 = r0.f32826b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L45
                r0 = r5
                lf.u r0 = r0.f32828d
                java.util.List r0 = p203lf.C5868u.m28620g0(r0)
                r1 = r5
                lf.u r1 = r1.f32828d
                java.util.List r1 = p203lf.C5868u.m28621h0(r1)
                boolean r0 = r0.addAll(r1)
                goto Ld1
            L45:
                r0 = r5
                lf.u r0 = r0.f32828d
                java.util.List r0 = p203lf.C5868u.m28622i0(r0)
                if (r0 == 0) goto L5e
                r0 = r5
                lf.u r0 = r0.f32828d
                java.util.List r0 = p203lf.C5868u.m28622i0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L6e
            L5e:
                r0 = r5
                lf.u r0 = r0.f32828d
                r7 = r0
                r0 = r7
                int r0 = r0.f32811j
                r1 = r7
                int r1 = r1.f32812k
                if (r0 <= r1) goto L7c
            L6e:
                r0 = r5
                lf.u r0 = r0.f32828d
                r7 = r0
                r0 = r7
                r1 = r7
                java.util.List r1 = p203lf.C5868u.m28621h0(r1)
                java.util.List r0 = p203lf.C5868u.m28623j0(r0, r1)
            L7c:
                r0 = r5
                lf.u r0 = r0.f32828d
                java.util.List r0 = p203lf.C5868u.m28622i0(r0)
                if (r0 == 0) goto Ld1
                r0 = 0
                r6 = r0
            L88:
                r0 = r6
                r1 = r5
                lf.u r1 = r1.f32828d
                java.util.List r1 = p203lf.C5868u.m28622i0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto Ld1
                r0 = r5
                lf.u r0 = r0.f32828d     // Catch: java.lang.Exception -> Le7
                java.util.List r0 = p203lf.C5868u.m28622i0(r0)     // Catch: java.lang.Exception -> Le7
                r1 = r6
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Le7
                lf.l r0 = (p203lf.C5859l) r0     // Catch: java.lang.Exception -> Le7
                r7 = r0
                r0 = r7
                java.lang.String r0 = r0.m28564b()     // Catch: java.lang.Exception -> Le7
                java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Exception -> Le7
                r1 = r5
                java.lang.String r1 = r1.f32826b     // Catch: java.lang.Exception -> Le7
                java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Exception -> Le7
                boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> Le7
                if (r0 == 0) goto Lcb
                r0 = r5
                lf.u r0 = r0.f32828d     // Catch: java.lang.Exception -> Le7
                java.util.List r0 = p203lf.C5868u.m28620g0(r0)     // Catch: java.lang.Exception -> Le7
                r1 = r7
                boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> Le7
            Lcb:
                int r6 = r6 + 1
                goto L88
            Ld1:
                r0 = r5
                lf.u r0 = r0.f32828d
                android.content.Context r0 = p203lf.C5868u.m28619f0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                lf.u$e$a r1 = new lf.u$e$a
                r2 = r1
                r3 = r5
                r2.<init>(r3)
                r0.runOnUiThread(r1)
                return
            Le7:
                r7 = move-exception
                goto Lcb
            */
            throw new UnsupportedOperationException("Method not decompiled: p203lf.C5868u.e.run():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/u$f.class
     */
    /* renamed from: lf.u$f */
    /* loaded from: combined.jar:classes2.jar:lf/u$f.class */
    public class f implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32830b;

        /* renamed from: c */
        public final C5868u f32831c;

        public f(C5868u c5868u, View view) {
            this.f32831c = c5868u;
            this.f32830b = view;
        }

        /* renamed from: a */
        public final void m28631a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32830b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m28632b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32830b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m28633c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32830b, "scaleY", f10);
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
                m28632b(f10);
                m28633c(f10);
                Log.e("id is", "" + this.f32830b.getTag());
                view2 = this.f32830b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m28632b(f10);
                m28633c(f10);
                m28631a(z10);
                view2 = this.f32830b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/u$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.u$g */
    /* loaded from: combined.jar:classes2.jar:lf/u$g.class */
    public class g extends AsyncTask<h, Void, Integer> {

        /* renamed from: a */
        public h f32832a;

        /* renamed from: b */
        public final C5868u f32833b;

        public g(C5868u c5868u, h hVar) {
            this.f32833b = c5868u;
            this.f32832a = hVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(h... hVarArr) {
            try {
                return Integer.valueOf(this.f32833b.f32808g.m15173J1("series"));
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32832a.f32841z.setText("0");
            } else {
                this.f32832a.f32841z.setText(String.valueOf(num));
            }
            this.f32832a.f32841z.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32832a.f32841z.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/u$h.class
     */
    /* renamed from: lf.u$h */
    /* loaded from: combined.jar:classes2.jar:lf/u$h.class */
    public static class h extends RecyclerView.AbstractC0674e0 {

        /* renamed from: A */
        public ImageView f32834A;

        /* renamed from: B */
        public ImageView f32835B;

        /* renamed from: u */
        public TextView f32836u;

        /* renamed from: v */
        public ProgressBar f32837v;

        /* renamed from: w */
        public RelativeLayout f32838w;

        /* renamed from: x */
        public RelativeLayout f32839x;

        /* renamed from: y */
        public RelativeLayout f32840y;

        /* renamed from: z */
        public TextView f32841z;

        public h(View view) {
            super(view);
            this.f32836u = (TextView) view.findViewById(2131429513);
            this.f32837v = (ProgressBar) view.findViewById(2131428840);
            this.f32838w = (RelativeLayout) view.findViewById(2131429028);
            this.f32840y = (RelativeLayout) view.findViewById(2131429278);
            this.f32839x = (RelativeLayout) view.findViewById(2131429008);
            this.f32841z = (TextView) view.findViewById(2131429620);
            this.f32835B = (ImageView) view.findViewById(2131428181);
            this.f32834A = (ImageView) view.findViewById(2131428237);
            m4048L(false);
        }
    }

    public C5868u(List<Object> list, Context context) {
        ArrayList arrayList = new ArrayList();
        this.f32809h = arrayList;
        arrayList.addAll(list);
        this.f32810i = list;
        this.f32806e = list;
        this.f32807f = context;
        this.f32808g = new LiveStreamDBHandler(context);
        this.f32813l = new DatabaseHandler(context);
        this.f32816o = new SeriesRecentWatchDatabase(context);
        String m15345I = SharepreferenceDBHandler.m15345I(context);
        if (m15345I.equals("1")) {
            Collections.sort(list, new b(this));
        }
        if (m15345I.equals("2")) {
            Collections.sort(list, new c(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: F */
    public void mo4088F(RecyclerView recyclerView) {
        super.mo4088F(recyclerView);
        recyclerView.setOnKeyListener(new a(this, recyclerView));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
    
        if (r11 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        r12 = r0.f32841z;
        r13 = java.lang.String.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        if (r11 != (-1)) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r9, @android.annotation.SuppressLint({"RecyclerView"}) int r10) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5868u.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
        if (i10 == 1) {
            return new C5860m(LayoutInflater.from(viewGroup.getContext()).inflate(2131624106, viewGroup, false));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624250, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131428181);
        if (SharepreferenceDBHandler.m15397t(this.f32807f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new h(inflate);
    }

    /* renamed from: l0 */
    public void m28625l0(String str, TextView textView) {
        new Thread(new e(this, str, textView)).start();
    }

    /* renamed from: m0 */
    public final void m28626m0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32806e.size();
    }

    /* renamed from: n0 */
    public final void m28627n0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: o0 */
    public final void m28628o0(h hVar) {
        new g(this, hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, hVar);
    }

    /* renamed from: p0 */
    public void m28629p0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f32806e.get(i10) instanceof NativeAd ? 1 : 0;
    }

    /* renamed from: q0 */
    public final boolean m28630q0(RecyclerView.AbstractC0685p abstractC0685p, int i10) {
        int i11 = this.f32817p + i10;
        if (i11 < 0 || i11 >= mo3013n()) {
            return false;
        }
        m4100x(this.f32817p);
        this.f32817p = i11;
        m4100x(i11);
        abstractC0685p.mo2769U1(this.f32817p);
        return true;
    }
}
