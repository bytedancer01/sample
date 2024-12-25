package p301r6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/h.class
 */
/* renamed from: r6.h */
/* loaded from: combined.jar:classes2.jar:r6/h.class */
public interface InterfaceC7980h {

    /* renamed from: a */
    public static final ByteBuffer f38600a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/h$a.class
     */
    /* renamed from: r6.h$a */
    /* loaded from: combined.jar:classes2.jar:r6/h$a.class */
    public static final class a {

        /* renamed from: e */
        public static final a f38601e = new a(-1, -1, -1);

        /* renamed from: a */
        public final int f38602a;

        /* renamed from: b */
        public final int f38603b;

        /* renamed from: c */
        public final int f38604c;

        /* renamed from: d */
        public final int f38605d;

        public a(int i10, int i11, int i12) {
            this.f38602a = i10;
            this.f38603b = i11;
            this.f38604c = i12;
            this.f38605d = C4401z0.m22410s0(i12) ? C4401z0.m22375d0(i12, i11) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f38602a + ", channelCount=" + this.f38603b + ", encoding=" + this.f38604c + ']';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/h$b.class
     */
    /* renamed from: r6.h$b */
    /* loaded from: combined.jar:classes2.jar:r6/h$b.class */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: a */
    ByteBuffer mo34691a();

    /* renamed from: b */
    a mo34692b(a aVar);

    /* renamed from: c */
    void mo34531c(ByteBuffer byteBuffer);

    /* renamed from: d */
    boolean mo34693d();

    /* renamed from: e */
    void mo34694e();

    void flush();

    boolean isActive();

    void reset();
}
