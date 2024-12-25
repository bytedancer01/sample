package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p049d.DialogC4281g;
import p192l1.C5650f;
import p192l1.C5653i;
import p192l1.C5654j;
import p208m1.C5900i;
import p208m1.C5901j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/g.class
 */
/* renamed from: androidx.mediarouter.app.g */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g.class */
public class DialogC0610g extends DialogC4281g {

    /* renamed from: d */
    public final C5901j f4007d;

    /* renamed from: e */
    public final c f4008e;

    /* renamed from: f */
    public Context f4009f;

    /* renamed from: g */
    public C5900i f4010g;

    /* renamed from: h */
    public List<C5901j.h> f4011h;

    /* renamed from: i */
    public ImageButton f4012i;

    /* renamed from: j */
    public d f4013j;

    /* renamed from: k */
    public RecyclerView f4014k;

    /* renamed from: l */
    public boolean f4015l;

    /* renamed from: m */
    public C5901j.h f4016m;

    /* renamed from: n */
    public long f4017n;

    /* renamed from: o */
    public long f4018o;

    /* renamed from: p */
    public final Handler f4019p;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/g$a.class
     */
    /* renamed from: androidx.mediarouter.app.g$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$a.class */
    public class a extends Handler {

        /* renamed from: a */
        public final DialogC0610g f4020a;

        public a(DialogC0610g dialogC0610g) {
            this.f4020a = dialogC0610g;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            this.f4020a.m3352k((List) message.obj);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/g$b.class
     */
    /* renamed from: androidx.mediarouter.app.g$b */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$b.class */
    public class b implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0610g f4021b;

        public b(DialogC0610g dialogC0610g) {
            this.f4021b = dialogC0610g;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4021b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/g$c.class
     */
    /* renamed from: androidx.mediarouter.app.g$c */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$c.class */
    public final class c extends C5901j.a {

        /* renamed from: a */
        public final DialogC0610g f4022a;

        public c(DialogC0610g dialogC0610g) {
            this.f4022a = dialogC0610g;
        }

        @Override // p208m1.C5901j.a
        /* renamed from: d */
        public void mo3234d(C5901j c5901j, C5901j.h hVar) {
            this.f4022a.m3349h();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: e */
        public void mo3235e(C5901j c5901j, C5901j.h hVar) {
            this.f4022a.m3349h();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: g */
        public void mo3236g(C5901j c5901j, C5901j.h hVar) {
            this.f4022a.m3349h();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: h */
        public void mo3250h(C5901j c5901j, C5901j.h hVar) {
            this.f4022a.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/g$d.class
     */
    /* renamed from: androidx.mediarouter.app.g$d */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$d.class */
    public final class d extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

        /* renamed from: e */
        public final ArrayList<b> f4023e = new ArrayList<>();

        /* renamed from: f */
        public final LayoutInflater f4024f;

        /* renamed from: g */
        public final Drawable f4025g;

        /* renamed from: h */
        public final Drawable f4026h;

        /* renamed from: i */
        public final Drawable f4027i;

        /* renamed from: j */
        public final Drawable f4028j;

        /* renamed from: k */
        public final DialogC0610g f4029k;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/g$d$a.class
         */
        /* renamed from: androidx.mediarouter.app.g$d$a */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$d$a.class */
        public class a extends RecyclerView.AbstractC0674e0 {

            /* renamed from: u */
            public TextView f4030u;

            /* renamed from: v */
            public final d f4031v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, View view) {
                super(view);
                this.f4031v = dVar;
                this.f4030u = (TextView) view.findViewById(C5650f.f31824P);
            }

            /* renamed from: R */
            public void m3357R(b bVar) {
                this.f4030u.setText(bVar.m3358a().toString());
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/g$d$b.class
         */
        /* renamed from: androidx.mediarouter.app.g$d$b */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$d$b.class */
        public class b {

            /* renamed from: a */
            public final Object f4032a;

            /* renamed from: b */
            public final int f4033b;

            /* renamed from: c */
            public final d f4034c;

            public b(d dVar, Object obj) {
                int i10;
                this.f4034c = dVar;
                this.f4032a = obj;
                if (obj instanceof String) {
                    i10 = 1;
                } else {
                    if (!(obj instanceof C5901j.h)) {
                        this.f4033b = 0;
                        Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                        return;
                    }
                    i10 = 2;
                }
                this.f4033b = i10;
            }

            /* renamed from: a */
            public Object m3358a() {
                return this.f4032a;
            }

            /* renamed from: b */
            public int m3359b() {
                return this.f4033b;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/g$d$c.class
         */
        /* renamed from: androidx.mediarouter.app.g$d$c */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$d$c.class */
        public class c extends RecyclerView.AbstractC0674e0 {

            /* renamed from: u */
            public final View f4035u;

            /* renamed from: v */
            public final ImageView f4036v;

            /* renamed from: w */
            public final ProgressBar f4037w;

            /* renamed from: x */
            public final TextView f4038x;

            /* renamed from: y */
            public final d f4039y;

            /* JADX WARN: Classes with same name are omitted:
              classes1.jar:androidx/mediarouter/app/g$d$c$a.class
             */
            /* renamed from: androidx.mediarouter.app.g$d$c$a */
            /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$d$c$a.class */
            public class a implements View.OnClickListener {

                /* renamed from: b */
                public final C5901j.h f4040b;

                /* renamed from: c */
                public final c f4041c;

                public a(c cVar, C5901j.h hVar) {
                    this.f4041c = cVar;
                    this.f4040b = hVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogC0610g dialogC0610g = this.f4041c.f4039y.f4029k;
                    C5901j.h hVar = this.f4040b;
                    dialogC0610g.f4016m = hVar;
                    hVar.m28981I();
                    this.f4041c.f4036v.setVisibility(4);
                    this.f4041c.f4037w.setVisibility(0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar, View view) {
                super(view);
                this.f4039y = dVar;
                this.f4035u = view;
                this.f4036v = (ImageView) view.findViewById(C5650f.f31826R);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C5650f.f31828T);
                this.f4037w = progressBar;
                this.f4038x = (TextView) view.findViewById(C5650f.f31827S);
                C0612i.m3426t(dVar.f4029k.f4009f, progressBar);
            }

            /* renamed from: R */
            public void m3360R(b bVar) {
                C5901j.h hVar = (C5901j.h) bVar.m3358a();
                this.f4035u.setVisibility(0);
                this.f4037w.setVisibility(4);
                this.f4035u.setOnClickListener(new a(this, hVar));
                this.f4038x.setText(hVar.m28997m());
                this.f4036v.setImageDrawable(this.f4039y.m3354e0(hVar));
            }
        }

        public d(DialogC0610g dialogC0610g) {
            this.f4029k = dialogC0610g;
            this.f4024f = LayoutInflater.from(dialogC0610g.f4009f);
            this.f4025g = C0612i.m3413g(dialogC0610g.f4009f);
            this.f4026h = C0612i.m3423q(dialogC0610g.f4009f);
            this.f4027i = C0612i.m3419m(dialogC0610g.f4009f);
            this.f4028j = C0612i.m3420n(dialogC0610g.f4009f);
            m3356g0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: G */
        public void mo2996G(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
            int mo3018q = mo3018q(i10);
            b m3355f0 = m3355f0(i10);
            if (mo3018q == 1) {
                ((a) abstractC0674e0).m3357R(m3355f0);
            } else if (mo3018q != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((c) abstractC0674e0).m3360R(m3355f0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: J */
        public RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
            if (i10 == 1) {
                return new a(this, this.f4024f.inflate(C5653i.f31878k, viewGroup, false));
            }
            if (i10 == 2) {
                return new c(this, this.f4024f.inflate(C5653i.f31879l, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        /* renamed from: d0 */
        public final Drawable m3353d0(C5901j.h hVar) {
            int m28990f = hVar.m28990f();
            return m28990f != 1 ? m28990f != 2 ? hVar.m29009y() ? this.f4028j : this.f4025g : this.f4027i : this.f4026h;
        }

        /* renamed from: e0 */
        public Drawable m3354e0(C5901j.h hVar) {
            Uri m28994j = hVar.m28994j();
            if (m28994j != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(this.f4029k.f4009f.getContentResolver().openInputStream(m28994j), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e10) {
                    Log.w("RecyclerAdapter", "Failed to load " + m28994j, e10);
                }
            }
            return m3353d0(hVar);
        }

        /* renamed from: f0 */
        public b m3355f0(int i10) {
            return this.f4023e.get(i10);
        }

        /* renamed from: g0 */
        public void m3356g0() {
            this.f4023e.clear();
            this.f4023e.add(new b(this, this.f4029k.f4009f.getString(C5654j.f31884e)));
            Iterator<C5901j.h> it = this.f4029k.f4011h.iterator();
            while (it.hasNext()) {
                this.f4023e.add(new b(this, it.next()));
            }
            m4099w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: n */
        public int mo3013n() {
            return this.f4023e.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: q */
        public int mo3018q(int i10) {
            return this.f4023e.get(i10).m3359b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/g$e.class
     */
    /* renamed from: androidx.mediarouter.app.g$e */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/g$e.class */
    public static final class e implements Comparator<C5901j.h> {

        /* renamed from: b */
        public static final e f4042b = new e();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C5901j.h hVar, C5901j.h hVar2) {
            return hVar.m28997m().compareToIgnoreCase(hVar2.m28997m());
        }
    }

    public DialogC0610g(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0610g(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            android.content.Context r0 = androidx.mediarouter.app.C0612i.m3408b(r0, r1, r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r6
            int r2 = androidx.mediarouter.app.C0612i.m3409c(r2)
            r0.<init>(r1, r2)
            r0 = r5
            m1.i r1 = p208m1.C5900i.f33081c
            r0.f4010g = r1
            r0 = r5
            androidx.mediarouter.app.g$a r1 = new androidx.mediarouter.app.g$a
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f4019p = r1
            r0 = r5
            android.content.Context r0 = r0.getContext()
            r6 = r0
            r0 = r5
            r1 = r6
            m1.j r1 = p208m1.C5901j.m28867j(r1)
            r0.f4007d = r1
            r0 = r5
            androidx.mediarouter.app.g$c r1 = new androidx.mediarouter.app.g$c
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f4008e = r1
            r0 = r5
            r1 = r6
            r0.f4009f = r1
            r0 = r5
            r1 = r6
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p192l1.C5651g.f31865e
            int r1 = r1.getInteger(r2)
            long r1 = (long) r1
            r0.f4017n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0610g.<init>(android.content.Context, int):void");
    }

    /* renamed from: e */
    public boolean m3347e(C5901j.h hVar) {
        return !hVar.m29007w() && hVar.m29008x() && hVar.m28977E(this.f4010g);
    }

    /* renamed from: f */
    public void m3348f(List<C5901j.h> list) {
        int size = list.size();
        while (true) {
            int i10 = size;
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            if (!m3347e(list.get(i11))) {
                list.remove(i11);
            }
            size = i11;
        }
    }

    /* renamed from: h */
    public void m3349h() {
        if (this.f4016m == null && this.f4015l) {
            ArrayList arrayList = new ArrayList(this.f4007d.m28879m());
            m3348f(arrayList);
            Collections.sort(arrayList, e.f4042b);
            if (SystemClock.uptimeMillis() - this.f4018o >= this.f4017n) {
                m3352k(arrayList);
                return;
            }
            this.f4019p.removeMessages(1);
            Handler handler = this.f4019p;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f4018o + this.f4017n);
        }
    }

    /* renamed from: i */
    public void m3350i(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4010g.equals(c5900i)) {
            return;
        }
        this.f4010g = c5900i;
        if (this.f4015l) {
            this.f4007d.m28882s(this.f4008e);
            this.f4007d.m28872b(c5900i, this.f4008e, 1);
        }
        m3349h();
    }

    /* renamed from: j */
    public void m3351j() {
        getWindow().setLayout(C0609f.m3340c(this.f4009f), C0609f.m3338a(this.f4009f));
    }

    /* renamed from: k */
    public void m3352k(List<C5901j.h> list) {
        this.f4018o = SystemClock.uptimeMillis();
        this.f4011h.clear();
        this.f4011h.addAll(list);
        this.f4013j.m3356g0();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4015l = true;
        this.f4007d.m28872b(this.f4010g, this.f4008e, 1);
        m3349h();
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5653i.f31877j);
        C0612i.m3425s(this.f4009f, this);
        this.f4011h = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(C5650f.f31823O);
        this.f4012i = imageButton;
        imageButton.setOnClickListener(new b(this));
        this.f4013j = new d(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C5650f.f31825Q);
        this.f4014k = recyclerView;
        recyclerView.setAdapter(this.f4013j);
        this.f4014k.setLayoutManager(new LinearLayoutManager(this.f4009f));
        m3351j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4015l = false;
        this.f4007d.m28882s(this.f4008e);
        this.f4019p.removeMessages(1);
    }
}
