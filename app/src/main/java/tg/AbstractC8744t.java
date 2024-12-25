package tg;

import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/t.class
 */
/* renamed from: tg.t */
/* loaded from: combined.jar:classes2.jar:tg/t.class */
public abstract class AbstractC8744t {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/t$a.class
     */
    /* renamed from: tg.t$a */
    /* loaded from: combined.jar:classes2.jar:tg/t$a.class */
    public static final class a extends AbstractC8744t {

        /* renamed from: a */
        public final byte[] f40686a;

        public a(C8740p c8740p, byte[] bArr) {
            this.f40686a = bArr;
        }

        @Override // tg.AbstractC8744t
        /* renamed from: a */
        public long mo37484a() {
            return this.f40686a.length;
        }

        @Override // tg.AbstractC8744t
        /* renamed from: b */
        public C8740p mo37485b() {
            return null;
        }

        @Override // tg.AbstractC8744t
        /* renamed from: d */
        public void mo37486d(InterfaceC9762f interfaceC9762f) {
            interfaceC9762f.write(this.f40686a);
        }
    }

    /* renamed from: c */
    public static AbstractC8744t m37483c(C8740p c8740p, byte[] bArr) {
        if (bArr != null) {
            return new a(c8740p, bArr);
        }
        throw new NullPointerException("content == null");
    }

    /* renamed from: a */
    public abstract long mo37484a();

    /* renamed from: b */
    public abstract C8740p mo37485b();

    /* renamed from: d */
    public abstract void mo37486d(InterfaceC9762f interfaceC9762f);
}
