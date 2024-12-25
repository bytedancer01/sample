package com.maxdigitall.maxdigitaliptvbox.view.demo;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0428n;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p009a8.C0083a1;
import p009a8.C0134z0;
import p027b9.InterfaceC0831a0;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p218mf.C6597k;
import p218mf.ServiceC6587a;
import p267p6.C7561b1;
import p267p6.C7629w0;
import p267p6.InterfaceC7639z1;
import p365v6.C9273n;
import p365v6.C9280q0;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;
import p420y7.AbstractServiceC9875y;
import p420y7.C9849e;
import p420y7.C9865o;
import p420y7.C9870t;
import p420y7.C9872v;
import p420y7.C9874x;
import p420y7.InterfaceC9853g;
import p420y7.InterfaceC9867q;
import p421y8.AbstractC9886j;
import p421y8.C9882f;
import p439z7.C10067c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a.class
 */
/* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.a */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a.class */
public class C3662a {

    /* renamed from: a */
    public final Context f22032a;

    /* renamed from: b */
    public final InterfaceC0831a0.b f22033b;

    /* renamed from: c */
    public final CopyOnWriteArraySet<c> f22034c = new CopyOnWriteArraySet<>();

    /* renamed from: d */
    public final HashMap<Uri, C9849e> f22035d = new HashMap<>();

    /* renamed from: e */
    public final InterfaceC9867q f22036e;

    /* renamed from: f */
    public final C9882f.d f22037f;

    /* renamed from: g */
    public d f22038g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.a$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$b.class */
    public class b implements C9870t.d {

        /* renamed from: a */
        public final C3662a f22039a;

        public b(C3662a c3662a) {
            this.f22039a = c3662a;
        }

        @Override // p420y7.C9870t.d
        /* renamed from: a */
        public void mo18030a(C9870t c9870t, C9849e c9849e, Exception exc) {
            this.f22039a.f22035d.put(c9849e.f45182a.f45310c, c9849e);
            Iterator it = this.f22039a.f22034c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).mo18004d0();
            }
        }

        @Override // p420y7.C9870t.d
        /* renamed from: b */
        public /* synthetic */ void mo18031b(C9870t c9870t, C10067c c10067c, int i10) {
            C9872v.m41532e(this, c9870t, c10067c, i10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: c */
        public /* synthetic */ void mo18032c(C9870t c9870t, boolean z10) {
            C9872v.m41533f(this, c9870t, z10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: d */
        public void mo18033d(C9870t c9870t, C9849e c9849e) {
            this.f22039a.f22035d.remove(c9849e.f45182a.f45310c);
            Iterator it = this.f22039a.f22034c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).mo18004d0();
            }
        }

        @Override // p420y7.C9870t.d
        /* renamed from: e */
        public /* synthetic */ void mo18034e(C9870t c9870t, boolean z10) {
            C9872v.m41529b(this, c9870t, z10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: f */
        public /* synthetic */ void mo18035f(C9870t c9870t) {
            C9872v.m41530c(this, c9870t);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: g */
        public /* synthetic */ void mo18036g(C9870t c9870t) {
            C9872v.m41531d(this, c9870t);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.a$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$c.class */
    public interface c {
        /* renamed from: d0 */
        void mo18004d0();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.a$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$d.class */
    public final class d implements C9865o.c, DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final AbstractC0428n f22040b;

        /* renamed from: c */
        public final C9865o f22041c;

        /* renamed from: d */
        public final C7561b1 f22042d;

        /* renamed from: e */
        public C6597k f22043e;

        /* renamed from: f */
        public AbstractC9886j.a f22044f;

        /* renamed from: g */
        public e f22045g;

        /* renamed from: h */
        public byte[] f22046h;

        /* renamed from: i */
        public final C3662a f22047i;

        public d(C3662a c3662a, AbstractC0428n abstractC0428n, C9865o c9865o, C7561b1 c7561b1) {
            this.f22047i = c3662a;
            this.f22040b = abstractC0428n;
            this.f22041c = c9865o;
            this.f22042d = c7561b1;
            c9865o.m41449E(this);
        }

        @Override // p420y7.C9865o.c
        /* renamed from: a */
        public void mo18039a(C9865o c9865o, IOException iOException) {
            boolean z10 = iOException instanceof C9865o.f;
            int i10 = z10 ? 2132017594 : 2132017597;
            String str = z10 ? "Downloading live content unsupported" : "Failed to start download";
            Toast.makeText(this.f22047i.f22032a, i10, 1).show();
            C4392v.m22271e("DownloadTracker", str, iOException);
        }

        @Override // p420y7.C9865o.c
        /* renamed from: b */
        public void mo18040b(C9865o c9865o) {
            C7629w0 m18042f = m18042f(c9865o);
            if (m18042f == null) {
                m18044h(c9865o);
                return;
            }
            if (C4401z0.f26679a < 18) {
                Toast.makeText(this.f22047i.f22032a, 2132017681, 1).show();
                C4392v.m22270d("DownloadTracker", "Downloading DRM protected content is not supported on API versions below 18");
            } else if (!m18043g(m18042f.f37089p)) {
                Toast.makeText(this.f22047i.f22032a, 2132017598, 1).show();
                C4392v.m22270d("DownloadTracker", "Downloading content where DRM scheme data is not located in the manifest is not supported");
            } else {
                e eVar = new e(m18042f, this.f22042d.f36449b.f36506c, this.f22047i.f22033b, this, c9865o);
                this.f22045g = eVar;
                eVar.execute(new Void[0]);
            }
        }

        /* renamed from: e */
        public final C9874x m18041e() {
            return this.f22041c.m41458r(C4401z0.m22396l0((String) C4349a.m21882e(this.f22042d.f36451d.f36602a.toString()))).m41535c(this.f22046h);
        }

        /* renamed from: f */
        public final C7629w0 m18042f(C9865o c9865o) {
            for (int i10 = 0; i10 < c9865o.m41460t(); i10++) {
                AbstractC9886j.a m41459s = c9865o.m41459s(i10);
                for (int i11 = 0; i11 < m41459s.m41708c(); i11++) {
                    C0083a1 m41712g = m41459s.m41712g(i11);
                    for (int i12 = 0; i12 < m41712g.f261b; i12++) {
                        C0134z0 m323b = m41712g.m323b(i12);
                        for (int i13 = 0; i13 < m323b.f618b; i13++) {
                            C7629w0 m663b = m323b.m663b(i13);
                            if (m663b.f37089p != null) {
                                return m663b;
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m18043g(C9273n c9273n) {
            for (int i10 = 0; i10 < c9273n.f42359e; i10++) {
                if (c9273n.m39139l(i10).m39145j()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public final void m18044h(C9865o c9865o) {
            if (c9865o.m41460t() == 0) {
                C4392v.m22268b("DownloadTracker", "No periods found. Downloading entire stream.");
                m18048l();
                this.f22041c.m41450F();
                return;
            }
            AbstractC9886j.a m41459s = this.f22041c.m41459s(0);
            this.f22044f = m41459s;
            if (C6597k.m30470l0(m41459s)) {
                C6597k m30463Y = C6597k.m30463Y(2132017727, this.f22044f, this.f22047i.f22037f, false, true, this, this);
                this.f22043e = m30463Y;
                m30463Y.mo2024M(this.f22040b, null);
            } else {
                C4392v.m22268b("DownloadTracker", "No dialog content. Downloading entire stream.");
                m18048l();
                this.f22041c.m41450F();
            }
        }

        /* renamed from: i */
        public final void m18045i(C9865o c9865o, byte[] bArr) {
            this.f22046h = bArr;
            m18044h(c9865o);
        }

        /* renamed from: j */
        public final void m18046j(InterfaceC9277p.a aVar) {
            Toast.makeText(this.f22047i.f22032a, 2132017598, 1).show();
            C4392v.m22271e("DownloadTracker", "Failed to fetch offline DRM license", aVar);
        }

        /* renamed from: k */
        public void m18047k() {
            this.f22041c.m41450F();
            C6597k c6597k = this.f22043e;
            if (c6597k != null) {
                c6597k.m2025q();
            }
            e eVar = this.f22045g;
            if (eVar != null) {
                eVar.cancel(false);
            }
        }

        /* renamed from: l */
        public final void m18048l() {
            m18049m(m18041e());
        }

        /* renamed from: m */
        public final void m18049m(C9874x c9874x) {
            AbstractServiceC9875y.m41561x(this.f22047i.f22032a, ServiceC6587a.class, c9874x, false);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            for (int i11 = 0; i11 < this.f22041c.m41460t(); i11++) {
                this.f22041c.m41456l(i11);
                for (int i12 = 0; i12 < this.f22044f.m41708c(); i12++) {
                    if (!this.f22043e.m30471d0(i12)) {
                        this.f22041c.m41454j(i11, i12, this.f22047i.f22037f, this.f22043e.m30472e0(i12));
                    }
                }
            }
            C9874x m18041e = m18041e();
            if (m18041e.f45312e.isEmpty()) {
                return;
            }
            m18049m(m18041e);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f22043e = null;
            this.f22041c.m41450F();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.a$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/a$e.class */
    public static final class e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public final C7629w0 f22048a;

        /* renamed from: b */
        public final C7561b1.e f22049b;

        /* renamed from: c */
        public final InterfaceC0831a0.b f22050c;

        /* renamed from: d */
        public final d f22051d;

        /* renamed from: e */
        public final C9865o f22052e;

        /* renamed from: f */
        public byte[] f22053f;

        /* renamed from: g */
        public InterfaceC9277p.a f22054g;

        public e(C7629w0 c7629w0, C7561b1.e eVar, InterfaceC0831a0.b bVar, d dVar, C9865o c9865o) {
            this.f22048a = c7629w0;
            this.f22049b = eVar;
            this.f22050c = bVar;
            this.f22051d = dVar;
            this.f22052e = c9865o;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            String uri = this.f22049b.f36490b.toString();
            C7561b1.e eVar = this.f22049b;
            C9280q0 m39154d = C9280q0.m39154d(uri, eVar.f36494f, this.f22050c, eVar.f36491c, new InterfaceC9290x.a());
            try {
                try {
                    this.f22053f = m39154d.m39156c(this.f22048a);
                } catch (InterfaceC9277p.a e10) {
                    this.f22054g = e10;
                }
                m39154d.m39158f();
                return null;
            } catch (Throwable th2) {
                m39154d.m39158f();
                throw th2;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r52) {
            InterfaceC9277p.a aVar = this.f22054g;
            if (aVar != null) {
                this.f22051d.m18046j(aVar);
            } else {
                this.f22051d.m18045i(this.f22052e, (byte[]) C4349a.m21886i(this.f22053f));
            }
        }
    }

    public C3662a(Context context, InterfaceC0831a0.b bVar, C9870t c9870t) {
        this.f22032a = context.getApplicationContext();
        this.f22033b = bVar;
        this.f22036e = c9870t.m41473f();
        this.f22037f = C9865o.m41440p(context);
        c9870t.m41471d(new b());
        m18027i();
    }

    /* renamed from: f */
    public void m18024f(c cVar) {
        C4349a.m21882e(cVar);
        this.f22034c.add(cVar);
    }

    /* renamed from: g */
    public C9874x m18025g(Uri uri) {
        C9849e c9849e = this.f22035d.get(uri);
        return (c9849e == null || c9849e.f45183b == 4) ? null : c9849e.f45182a;
    }

    /* renamed from: h */
    public boolean m18026h(C7561b1 c7561b1) {
        C9849e c9849e = this.f22035d.get(((C7561b1.g) C4349a.m21882e(c7561b1.f36449b)).f36504a);
        return (c9849e == null || c9849e.f45183b == 4) ? false : true;
    }

    /* renamed from: i */
    public final void m18027i() {
        try {
            InterfaceC9853g mo41388e = this.f22036e.mo41388e(new int[0]);
            while (mo41388e.moveToNext()) {
                try {
                    C9849e mo41396Y = mo41388e.mo41396Y();
                    this.f22035d.put(mo41396Y.f45182a.f45310c, mo41396Y);
                } finally {
                }
            }
            mo41388e.close();
        } catch (IOException e10) {
            C4392v.m22276j("DownloadTracker", "Failed to query downloads", e10);
        }
    }

    /* renamed from: j */
    public void m18028j(c cVar) {
        this.f22034c.remove(cVar);
    }

    /* renamed from: k */
    public void m18029k(AbstractC0428n abstractC0428n, C7561b1 c7561b1, InterfaceC7639z1 interfaceC7639z1) {
        C9849e c9849e = this.f22035d.get(((C7561b1.g) C4349a.m21882e(c7561b1.f36449b)).f36504a);
        if (c9849e != null && c9849e.f45183b != 4) {
            AbstractServiceC9875y.m41562y(this.f22032a, ServiceC6587a.class, c9849e.f45182a.f45309b, false);
            return;
        }
        d dVar = this.f22038g;
        if (dVar != null) {
            dVar.m18047k();
        }
        this.f22038g = new d(this, abstractC0428n, C9865o.m41438n(this.f22032a, c7561b1, interfaceC7639z1, this.f22033b), c7561b1);
    }
}
