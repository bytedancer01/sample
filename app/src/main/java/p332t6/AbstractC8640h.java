package p332t6;

import com.google.android.exoplayer2.decoder.AbstractC2328a;
import java.util.ArrayDeque;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p332t6.C8637e;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t6/h.class
 */
/* renamed from: t6.h */
/* loaded from: combined.jar:classes2.jar:t6/h.class */
public abstract class AbstractC8640h<I extends C8638f, O extends AbstractC2328a, E extends C8637e> implements InterfaceC8635c<I, O, E> {

    /* renamed from: a */
    public final Thread f40340a;

    /* renamed from: b */
    public final Object f40341b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f40342c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f40343d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f40344e;

    /* renamed from: f */
    public final O[] f40345f;

    /* renamed from: g */
    public int f40346g;

    /* renamed from: h */
    public int f40347h;

    /* renamed from: i */
    public I f40348i;

    /* renamed from: j */
    public E f40349j;

    /* renamed from: k */
    public boolean f40350k;

    /* renamed from: l */
    public boolean f40351l;

    /* renamed from: m */
    public int f40352m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t6/h$a.class
     */
    /* renamed from: t6.h$a */
    /* loaded from: combined.jar:classes2.jar:t6/h$a.class */
    public class a extends Thread {

        /* renamed from: b */
        public final AbstractC8640h f40353b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8640h abstractC8640h, String str) {
            super(str);
            this.f40353b = abstractC8640h;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f40353b.m37095t();
        }
    }

    public AbstractC8640h(I[] iArr, O[] oArr) {
        this.f40344e = iArr;
        this.f40346g = iArr.length;
        for (int i10 = 0; i10 < this.f40346g; i10++) {
            this.f40344e[i10] = mo11981g();
        }
        this.f40345f = oArr;
        this.f40347h = oArr.length;
        for (int i11 = 0; i11 < this.f40347h; i11++) {
            this.f40345f[i11] = mo11982h();
        }
        a aVar = new a(this, "ExoPlayer:SimpleDecoder");
        this.f40340a = aVar;
        aVar.start();
    }

    /* renamed from: f */
    public final boolean m37086f() {
        return !this.f40342c.isEmpty() && this.f40347h > 0;
    }

    @Override // p332t6.InterfaceC8635c
    public final void flush() {
        synchronized (this.f40341b) {
            this.f40350k = true;
            this.f40352m = 0;
            I i10 = this.f40348i;
            if (i10 != null) {
                m37093q(i10);
                this.f40348i = null;
            }
            while (!this.f40342c.isEmpty()) {
                m37093q(this.f40342c.removeFirst());
            }
            while (!this.f40343d.isEmpty()) {
                this.f40343d.removeFirst().release();
            }
        }
    }

    /* renamed from: g */
    public abstract I mo11981g();

    /* renamed from: h */
    public abstract O mo11982h();

    /* renamed from: i */
    public abstract E mo11983i(Throwable th2);

    /* renamed from: j */
    public abstract E mo11984j(I i10, O o10, boolean z10);

    /* renamed from: k */
    public final boolean m37087k() {
        E mo11983i;
        synchronized (this.f40341b) {
            while (!this.f40351l && !m37086f()) {
                this.f40341b.wait();
            }
            if (this.f40351l) {
                return false;
            }
            I removeFirst = this.f40342c.removeFirst();
            O[] oArr = this.f40345f;
            int i10 = this.f40347h - 1;
            this.f40347h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f40350k;
            this.f40350k = false;
            if (removeFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o10.addFlag(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
                }
                try {
                    mo11983i = mo11984j(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e10) {
                    mo11983i = mo11983i(e10);
                }
                if (mo11983i != null) {
                    synchronized (this.f40341b) {
                        this.f40349j = mo11983i;
                    }
                    return false;
                }
            }
            synchronized (this.f40341b) {
                if (!this.f40350k) {
                    if (o10.isDecodeOnly()) {
                        this.f40352m++;
                    } else {
                        o10.skippedOutputBufferCount = this.f40352m;
                        this.f40352m = 0;
                        this.f40343d.addLast(o10);
                        m37093q(removeFirst);
                    }
                }
                o10.release();
                m37093q(removeFirst);
            }
            return true;
        }
    }

    @Override // p332t6.InterfaceC8635c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I mo33547d() {
        I i10;
        synchronized (this.f40341b) {
            m37091o();
            C4349a.m21884g(this.f40348i == null);
            int i11 = this.f40346g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f40344e;
                int i12 = i11 - 1;
                this.f40346g = i12;
                i10 = iArr[i12];
            }
            this.f40348i = i10;
        }
        return i10;
    }

    @Override // p332t6.InterfaceC8635c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O mo33481b() {
        synchronized (this.f40341b) {
            m37091o();
            if (this.f40343d.isEmpty()) {
                return null;
            }
            return this.f40343d.removeFirst();
        }
    }

    /* renamed from: n */
    public final void m37090n() {
        if (m37086f()) {
            this.f40341b.notify();
        }
    }

    /* renamed from: o */
    public final void m37091o() {
        E e10 = this.f40349j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // p332t6.InterfaceC8635c
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo33546c(I i10) {
        synchronized (this.f40341b) {
            m37091o();
            C4349a.m21878a(i10 == this.f40348i);
            this.f40342c.addLast(i10);
            m37090n();
            this.f40348i = null;
        }
    }

    /* renamed from: q */
    public final void m37093q(I i10) {
        i10.clear();
        I[] iArr = this.f40344e;
        int i11 = this.f40346g;
        this.f40346g = i11 + 1;
        iArr[i11] = i10;
    }

    /* renamed from: r */
    public void mo11985r(O o10) {
        synchronized (this.f40341b) {
            m37094s(o10);
            m37090n();
        }
    }

    @Override // p332t6.InterfaceC8635c
    public void release() {
        synchronized (this.f40341b) {
            this.f40351l = true;
            this.f40341b.notify();
        }
        try {
            this.f40340a.join();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: s */
    public final void m37094s(O o10) {
        o10.clear();
        O[] oArr = this.f40345f;
        int i10 = this.f40347h;
        this.f40347h = i10 + 1;
        oArr[i10] = o10;
    }

    /* renamed from: t */
    public final void m37095t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m37087k());
    }

    /* renamed from: u */
    public final void m37096u(int i10) {
        C4349a.m21884g(this.f40346g == this.f40344e.length);
        for (I i11 : this.f40344e) {
            i11.m37081f(i10);
        }
    }
}
