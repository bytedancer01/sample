package p269p8;

import com.google.android.exoplayer2.decoder.AbstractC2328a;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p059d9.C4349a;
import p059d9.C4401z0;
import p243o8.AbstractC6928j;
import p243o8.C6927i;
import p243o8.InterfaceC6923e;
import p243o8.InterfaceC6924f;
import p269p8.AbstractC7668e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p8/e.class
 */
/* renamed from: p8.e */
/* loaded from: combined.jar:classes2.jar:p8/e.class */
public abstract class AbstractC7668e implements InterfaceC6924f {

    /* renamed from: a */
    public final ArrayDeque<b> f37396a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<AbstractC6928j> f37397b;

    /* renamed from: c */
    public final PriorityQueue<b> f37398c;

    /* renamed from: d */
    public b f37399d;

    /* renamed from: e */
    public long f37400e;

    /* renamed from: f */
    public long f37401f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p8/e$b.class
     */
    /* renamed from: p8.e$b */
    /* loaded from: combined.jar:classes2.jar:p8/e$b.class */
    public static final class b extends C6927i implements Comparable<b> {

        /* renamed from: j */
        public long f37402j;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i10 = 1;
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.f40329e - bVar.f40329e;
            long j11 = j10;
            if (j10 == 0) {
                long j12 = this.f37402j - bVar.f37402j;
                j11 = j12;
                if (j12 == 0) {
                    return 0;
                }
            }
            if (j11 <= 0) {
                i10 = -1;
            }
            return i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p8/e$c.class
     */
    /* renamed from: p8.e$c */
    /* loaded from: combined.jar:classes2.jar:p8/e$c.class */
    public static final class c extends AbstractC6928j {

        /* renamed from: d */
        public AbstractC2328a.a<c> f37403d;

        public c(AbstractC2328a.a<c> aVar) {
            this.f37403d = aVar;
        }

        @Override // com.google.android.exoplayer2.decoder.AbstractC2328a
        public final void release() {
            this.f37403d.mo301a(this);
        }
    }

    public AbstractC7668e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f37396a.add(new b());
        }
        this.f37397b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f37397b.add(new c(new AbstractC2328a.a(this) { // from class: p8.d

                /* renamed from: a */
                public final AbstractC7668e f37395a;

                {
                    this.f37395a = this;
                }

                @Override // com.google.android.exoplayer2.decoder.AbstractC2328a.a
                /* renamed from: a */
                public final void mo301a(AbstractC2328a abstractC2328a) {
                    this.f37395a.m33551n((AbstractC7668e.c) abstractC2328a);
                }
            }));
        }
        this.f37398c = new PriorityQueue<>();
    }

    @Override // p243o8.InterfaceC6924f
    /* renamed from: a */
    public void mo31878a(long j10) {
        this.f37400e = j10;
    }

    /* renamed from: e */
    public abstract InterfaceC6923e mo33482e();

    /* renamed from: f */
    public abstract void mo33483f(C6927i c6927i);

    @Override // p332t6.InterfaceC8635c
    public void flush() {
        this.f37401f = 0L;
        this.f37400e = 0L;
        while (!this.f37398c.isEmpty()) {
            m33550m((b) C4401z0.m22391j(this.f37398c.poll()));
        }
        b bVar = this.f37399d;
        if (bVar != null) {
            m33550m(bVar);
            this.f37399d = null;
        }
    }

    @Override // p332t6.InterfaceC8635c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C6927i mo33547d() {
        C4349a.m21884g(this.f37399d == null);
        if (this.f37396a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f37396a.pollFirst();
        this.f37399d = pollFirst;
        return pollFirst;
    }

    @Override // p332t6.InterfaceC8635c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC6928j mo33481b() {
        AbstractC6928j abstractC6928j;
        if (this.f37397b.isEmpty()) {
            return null;
        }
        while (!this.f37398c.isEmpty() && ((b) C4401z0.m22391j(this.f37398c.peek())).f40329e <= this.f37400e) {
            b bVar = (b) C4401z0.m22391j(this.f37398c.poll());
            if (bVar.isEndOfStream()) {
                abstractC6928j = (AbstractC6928j) C4401z0.m22391j(this.f37397b.pollFirst());
                abstractC6928j.addFlag(4);
            } else {
                mo33483f(bVar);
                if (mo33486k()) {
                    InterfaceC6923e mo33482e = mo33482e();
                    abstractC6928j = (AbstractC6928j) C4401z0.m22391j(this.f37397b.pollFirst());
                    abstractC6928j.m31889e(bVar.f40329e, mo33482e, Long.MAX_VALUE);
                } else {
                    m33550m(bVar);
                }
            }
            m33550m(bVar);
            return abstractC6928j;
        }
        return null;
    }

    /* renamed from: i */
    public final AbstractC6928j m33548i() {
        return this.f37397b.pollFirst();
    }

    /* renamed from: j */
    public final long m33549j() {
        return this.f37400e;
    }

    /* renamed from: k */
    public abstract boolean mo33486k();

    @Override // p332t6.InterfaceC8635c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo33546c(C6927i c6927i) {
        C4349a.m21878a(c6927i == this.f37399d);
        b bVar = (b) c6927i;
        if (bVar.isDecodeOnly()) {
            m33550m(bVar);
        } else {
            long j10 = this.f37401f;
            this.f37401f = 1 + j10;
            bVar.f37402j = j10;
            this.f37398c.add(bVar);
        }
        this.f37399d = null;
    }

    /* renamed from: m */
    public final void m33550m(b bVar) {
        bVar.clear();
        this.f37396a.add(bVar);
    }

    /* renamed from: n */
    public void m33551n(AbstractC6928j abstractC6928j) {
        abstractC6928j.clear();
        this.f37397b.add(abstractC6928j);
    }

    @Override // p332t6.InterfaceC8635c
    public void release() {
    }
}
