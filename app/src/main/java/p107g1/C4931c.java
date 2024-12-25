package p107g1;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p221n0.C6610b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g1/c.class
 */
/* renamed from: g1.c */
/* loaded from: combined.jar:classes1.jar:g1/c.class */
public class C4931c<D> {

    /* renamed from: a */
    public int f28651a;

    /* renamed from: b */
    public c<D> f28652b;

    /* renamed from: c */
    public b<D> f28653c;

    /* renamed from: d */
    public Context f28654d;

    /* renamed from: e */
    public boolean f28655e = false;

    /* renamed from: f */
    public boolean f28656f = false;

    /* renamed from: g */
    public boolean f28657g = true;

    /* renamed from: h */
    public boolean f28658h = false;

    /* renamed from: i */
    public boolean f28659i = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/c$a.class
     */
    /* renamed from: g1.c$a */
    /* loaded from: combined.jar:classes1.jar:g1/c$a.class */
    public final class a extends ContentObserver {

        /* renamed from: a */
        public final C4931c f28660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4931c c4931c) {
            super(new Handler());
            this.f28660a = c4931c;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            this.f28660a.m24907o();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/c$b.class
     */
    /* renamed from: g1.c$b */
    /* loaded from: combined.jar:classes1.jar:g1/c$b.class */
    public interface b<D> {
        /* renamed from: a */
        void m24915a(C4931c<D> c4931c);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/c$c.class
     */
    /* renamed from: g1.c$c */
    /* loaded from: combined.jar:classes1.jar:g1/c$c.class */
    public interface c<D> {
        /* renamed from: a */
        void mo24053a(C4931c<D> c4931c, D d10);
    }

    public C4931c(Context context) {
        this.f28654d = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m24896a() {
        this.f28656f = true;
        m24906m();
    }

    /* renamed from: b */
    public boolean m24897b() {
        return mo24878n();
    }

    /* renamed from: c */
    public void m24898c() {
        this.f28659i = false;
    }

    /* renamed from: d */
    public String m24899d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        C6610b.m30515a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m24900e() {
        b<D> bVar = this.f28653c;
        if (bVar != null) {
            bVar.m24915a(this);
        }
    }

    /* renamed from: f */
    public void mo24892f(D d10) {
        c<D> cVar = this.f28652b;
        if (cVar != null) {
            cVar.mo24053a(this, d10);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo24877g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f28651a);
        printWriter.print(" mListener=");
        printWriter.println(this.f28652b);
        if (this.f28655e || this.f28658h || this.f28659i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f28655e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f28658h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f28659i);
        }
        if (this.f28656f || this.f28657g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f28656f);
            printWriter.print(" mReset=");
            printWriter.println(this.f28657g);
        }
    }

    /* renamed from: h */
    public void m24901h() {
        mo24879p();
    }

    /* renamed from: i */
    public Context m24902i() {
        return this.f28654d;
    }

    /* renamed from: j */
    public boolean m24903j() {
        return this.f28656f;
    }

    /* renamed from: k */
    public boolean m24904k() {
        return this.f28657g;
    }

    /* renamed from: l */
    public boolean m24905l() {
        return this.f28655e;
    }

    /* renamed from: m */
    public void m24906m() {
    }

    /* renamed from: n */
    public boolean mo24878n() {
        throw null;
    }

    /* renamed from: o */
    public void m24907o() {
        if (this.f28655e) {
            m24901h();
        } else {
            this.f28658h = true;
        }
    }

    /* renamed from: p */
    public void mo24879p() {
    }

    /* renamed from: q */
    public void mo24893q() {
    }

    /* renamed from: r */
    public void mo24894r() {
        throw null;
    }

    /* renamed from: s */
    public void mo24895s() {
        throw null;
    }

    /* renamed from: t */
    public void m24908t(int i10, c<D> cVar) {
        if (this.f28652b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f28652b = cVar;
        this.f28651a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C6610b.m30515a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f28651a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m24909u() {
        mo24893q();
        this.f28657g = true;
        this.f28655e = false;
        this.f28656f = false;
        this.f28658h = false;
        this.f28659i = false;
    }

    /* renamed from: v */
    public void m24910v() {
        if (this.f28659i) {
            m24907o();
        }
    }

    /* renamed from: w */
    public final void m24911w() {
        this.f28655e = true;
        this.f28657g = false;
        this.f28656f = false;
        mo24894r();
    }

    /* renamed from: x */
    public void m24912x() {
        this.f28655e = false;
        mo24895s();
    }

    /* renamed from: y */
    public boolean m24913y() {
        boolean z10 = this.f28658h;
        this.f28658h = false;
        this.f28659i |= z10;
        return z10;
    }

    /* renamed from: z */
    public void m24914z(c<D> cVar) {
        c<D> cVar2 = this.f28652b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (cVar2 != cVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f28652b = null;
    }
}
