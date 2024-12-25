package p203lf;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/h.class
 */
/* renamed from: lf.h */
/* loaded from: combined.jar:classes2.jar:lf/h.class */
public class C5855h extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: e */
    public Context f32593e;

    /* renamed from: f */
    public List<Object> f32594f;

    /* renamed from: g */
    public List<Object> f32595g;

    /* renamed from: h */
    public int f32596h;

    /* renamed from: i */
    public int f32597i;

    /* renamed from: j */
    public LiveStreamDBHandler f32598j;

    /* renamed from: k */
    public DatabaseHandler f32599k;

    /* renamed from: m */
    public String f32601m;

    /* renamed from: o */
    public List<Object> f32603o;

    /* renamed from: l */
    public boolean f32600l = true;

    /* renamed from: n */
    public int f32602n = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/h$a.class
     */
    /* renamed from: lf.h$a */
    /* loaded from: combined.jar:classes2.jar:lf/h$a.class */
    public class a implements View.OnKeyListener {

        /* renamed from: b */
        public final RecyclerView f32604b;

        /* renamed from: c */
        public final C5855h f32605c;

        public a(C5855h c5855h, RecyclerView recyclerView) {
            this.f32605c = c5855h;
            this.f32604b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            C5855h c5855h;
            int i11;
            RecyclerView.AbstractC0685p layoutManager = this.f32604b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i10 == 20) {
                c5855h = this.f32605c;
                i11 = 1;
            } else {
                if (i10 != 19) {
                    return false;
                }
                c5855h = this.f32605c;
                i11 = -1;
            }
            return c5855h.m28506w0(layoutManager, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/h$b.class
     */
    /* renamed from: lf.h$b */
    /* loaded from: combined.jar:classes2.jar:lf/h$b.class */
    public class b implements Comparator<Object> {

        /* renamed from: b */
        public final C5855h f32606b;

        public b(C5855h c5855h) {
            this.f32606b = c5855h;
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
      classes2.jar:lf/h$c.class
     */
    /* renamed from: lf.h$c */
    /* loaded from: combined.jar:classes2.jar:lf/h$c.class */
    public class c implements Comparator<Object> {

        /* renamed from: b */
        public final C5855h f32607b;

        public c(C5855h c5855h) {
            this.f32607b = c5855h;
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
      classes2.jar:lf/h$d.class
     */
    /* renamed from: lf.h$d */
    /* loaded from: combined.jar:classes2.jar:lf/h$d.class */
    public class d implements View.OnClickListener {

        /* renamed from: b */
        public final RecyclerView.AbstractC0674e0 f32608b;

        /* renamed from: c */
        public final String f32609c;

        /* renamed from: d */
        public final String f32610d;

        /* renamed from: e */
        public final C5855h f32611e;

        public d(C5855h c5855h, RecyclerView.AbstractC0674e0 abstractC0674e0, String str, String str2) {
            this.f32611e = c5855h;
            this.f32608b = abstractC0674e0;
            this.f32609c = str;
            this.f32610d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f32611e.f32602n = this.f32608b.m4068r();
            Intent intent = new Intent(this.f32611e.f32593e, (Class<?>) NewEPGActivity.class);
            intent.putExtra("category_id", this.f32609c);
            intent.putExtra("category_name", this.f32610d);
            this.f32611e.f32593e.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/h$e.class
     */
    /* renamed from: lf.h$e */
    /* loaded from: combined.jar:classes2.jar:lf/h$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final String f32612b;

        /* renamed from: c */
        public final TextView f32613c;

        /* renamed from: d */
        public final C5855h f32614d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:lf/h$e$a.class
         */
        /* renamed from: lf.h$e$a */
        /* loaded from: combined.jar:classes2.jar:lf/h$e$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final e f32615b;

            public a(e eVar) {
                this.f32615b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5855h c5855h;
                List list;
                if (!TextUtils.isEmpty(this.f32615b.f32612b)) {
                    if (!this.f32615b.f32614d.f32594f.isEmpty() || this.f32615b.f32614d.f32594f.isEmpty()) {
                        c5855h = this.f32615b.f32614d;
                        list = c5855h.f32594f;
                    }
                    if (this.f32615b.f32614d.f32603o != null && this.f32615b.f32614d.f32603o.size() == 0) {
                        this.f32615b.f32613c.setVisibility(0);
                    }
                    C5855h c5855h2 = this.f32615b.f32614d;
                    c5855h2.f32596h = c5855h2.f32597i;
                    this.f32615b.f32614d.m4099w();
                }
                c5855h = this.f32615b.f32614d;
                list = c5855h.f32595g;
                c5855h.f32603o = list;
                if (this.f32615b.f32614d.f32603o != null) {
                    this.f32615b.f32613c.setVisibility(0);
                }
                C5855h c5855h22 = this.f32615b.f32614d;
                c5855h22.f32596h = c5855h22.f32597i;
                this.f32615b.f32614d.m4099w();
            }
        }

        public e(C5855h c5855h, String str, TextView textView) {
            this.f32614d = c5855h;
            this.f32612b = str;
            this.f32613c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32614d.f32594f = new ArrayList();
            this.f32614d.f32597i = this.f32612b.length();
            if (this.f32614d.f32594f != null) {
                this.f32614d.f32594f.clear();
            }
            if (TextUtils.isEmpty(this.f32612b)) {
                this.f32614d.f32594f.addAll(this.f32614d.f32595g);
            } else {
                if ((this.f32614d.f32603o != null && this.f32614d.f32603o.size() == 0) || this.f32614d.f32596h > this.f32614d.f32597i) {
                    C5855h c5855h = this.f32614d;
                    c5855h.f32603o = c5855h.f32595g;
                }
                if (this.f32614d.f32603o != null) {
                    for (int i10 = 0; i10 < this.f32614d.f32603o.size(); i10++) {
                        try {
                            C5859l c5859l = (C5859l) this.f32614d.f32603o.get(i10);
                            if (c5859l.m28564b().toLowerCase().contains(this.f32612b.toLowerCase())) {
                                this.f32614d.f32594f.add(c5859l);
                            }
                        } catch (Exception e10) {
                        }
                    }
                }
            }
            ((Activity) this.f32614d.f32593e).runOnUiThread(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/h$f.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: lf.h$f */
    /* loaded from: combined.jar:classes2.jar:lf/h$f.class */
    public class f extends AsyncTask<g, Void, Integer> {

        /* renamed from: a */
        public g f32616a;

        /* renamed from: b */
        public final C5855h f32617b;

        public f(C5855h c5855h, g gVar) {
            this.f32617b = c5855h;
            this.f32616a = gVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(g... gVarArr) {
            try {
                return SharepreferenceDBHandler.m15373f(this.f32617b.f32593e).equals("m3u") ? Integer.valueOf(this.f32617b.f32598j.m15173J1("live")) : Integer.valueOf(this.f32617b.f32599k.m15109B("live", SharepreferenceDBHandler.m15337A(this.f32617b.f32593e)));
            } catch (Exception e10) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f32616a.f32622y.setText("0");
            } else {
                this.f32616a.f32622y.setText(String.valueOf(num));
            }
            this.f32616a.f32622y.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f32616a.f32622y.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/h$g.class
     */
    /* renamed from: lf.h$g */
    /* loaded from: combined.jar:classes2.jar:lf/h$g.class */
    public static class g extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32618u;

        /* renamed from: v */
        public ProgressBar f32619v;

        /* renamed from: w */
        public RelativeLayout f32620w;

        /* renamed from: x */
        public RelativeLayout f32621x;

        /* renamed from: y */
        public TextView f32622y;

        public g(View view) {
            super(view);
            this.f32618u = (TextView) view.findViewById(2131429513);
            this.f32619v = (ProgressBar) view.findViewById(2131428840);
            this.f32620w = (RelativeLayout) view.findViewById(2131429028);
            this.f32621x = (RelativeLayout) view.findViewById(2131429008);
            this.f32622y = (TextView) view.findViewById(2131429620);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/h$h.class
     */
    /* renamed from: lf.h$h */
    /* loaded from: combined.jar:classes2.jar:lf/h$h.class */
    public class h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32623b;

        /* renamed from: c */
        public final C5855h f32624c;

        public h(C5855h c5855h, View view) {
            this.f32624c = c5855h;
            this.f32623b = view;
        }

        /* renamed from: a */
        public final void m28512a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32623b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m28513b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32623b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m28514c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32623b, "scaleY", f10);
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
                m28513b(f10);
                m28514c(f10);
                Log.e("id is", "" + this.f32623b.getTag());
                view2 = this.f32623b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m28513b(f10);
                m28514c(f10);
                m28512a(z10);
                view2 = this.f32623b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public C5855h(Context context, List<Object> list) {
        this.f32601m = "";
        this.f32603o = list;
        ArrayList arrayList = new ArrayList();
        this.f32594f = arrayList;
        arrayList.addAll(list);
        this.f32595g = list;
        this.f32593e = context;
        this.f32598j = new LiveStreamDBHandler(context);
        this.f32599k = new DatabaseHandler(context);
        this.f32601m = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        String string = context.getSharedPreferences("sortepg", 0).getString("sort", "");
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (r0.m28563a().equals("-1") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        if (r11 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        r0.f32622y.setText(java.lang.String.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0157, code lost:
    
        if (r11 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (r0.equals("-1") == false) goto L19;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r9, int r10) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5855h.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
        if (i10 == 1) {
            return new C5860m(LayoutInflater.from(viewGroup.getContext()).inflate(2131624106, viewGroup, false));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624240, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131428181);
        if (this.f32601m.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new g(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32603o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f32603o.get(i10) instanceof NativeAd ? 1 : 0;
    }

    /* renamed from: r0 */
    public void m28501r0(String str, TextView textView) {
        new Thread(new e(this, str, textView)).start();
    }

    /* renamed from: s0 */
    public final void m28502s0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: t0 */
    public final void m28503t0(float f10, RelativeLayout relativeLayout) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f10);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: u0 */
    public final void m28504u0(g gVar) {
        new f(this, gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, gVar);
    }

    /* renamed from: v0 */
    public void m28505v0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: w0 */
    public final boolean m28506w0(RecyclerView.AbstractC0685p abstractC0685p, int i10) {
        int i11 = this.f32602n + i10;
        if (i11 < 0 || i11 >= mo3013n()) {
            return false;
        }
        m4100x(this.f32602n);
        this.f32602n = i11;
        m4100x(i11);
        abstractC0685p.mo2769U1(this.f32602n);
        return true;
    }
}
