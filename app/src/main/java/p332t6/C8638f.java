package p332t6;

import java.nio.ByteBuffer;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t6/f.class
 */
/* renamed from: t6.f */
/* loaded from: combined.jar:classes2.jar:t6/f.class */
public class C8638f extends AbstractC8633a {

    /* renamed from: b */
    public final C8634b f40326b;

    /* renamed from: c */
    public ByteBuffer f40327c;

    /* renamed from: d */
    public boolean f40328d;

    /* renamed from: e */
    public long f40329e;

    /* renamed from: f */
    public ByteBuffer f40330f;

    /* renamed from: g */
    public final int f40331g;

    /* renamed from: h */
    public final int f40332h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t6/f$a.class
     */
    /* renamed from: t6.f$a */
    /* loaded from: combined.jar:classes2.jar:t6/f$a.class */
    public static final class a extends IllegalStateException {

        /* renamed from: b */
        public final int f40333b;

        /* renamed from: c */
        public final int f40334c;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f40333b = i10;
            this.f40334c = i11;
        }
    }

    public C8638f(int i10) {
        this(i10, 0);
    }

    public C8638f(int i10, int i11) {
        this.f40326b = new C8634b();
        this.f40331g = i10;
        this.f40332h = i11;
    }

    /* renamed from: i */
    public static C8638f m37079i() {
        return new C8638f(0);
    }

    @Override // p332t6.AbstractC8633a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f40327c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f40330f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f40328d = false;
    }

    /* renamed from: e */
    public final ByteBuffer m37080e(int i10) {
        int i11 = this.f40331g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f40327c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @EnsuresNonNull({"data"})
    /* renamed from: f */
    public void m37081f(int i10) {
        int i11 = i10 + this.f40332h;
        ByteBuffer byteBuffer = this.f40327c;
        if (byteBuffer == null) {
            this.f40327c = m37080e(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f40327c = byteBuffer;
            return;
        }
        ByteBuffer m37080e = m37080e(i12);
        m37080e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m37080e.put(byteBuffer);
        }
        this.f40327c = m37080e;
    }

    /* renamed from: g */
    public final void m37082g() {
        ByteBuffer byteBuffer = this.f40327c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f40330f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: h */
    public final boolean m37083h() {
        return getFlag(NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
    }

    @EnsuresNonNull({"supplementalData"})
    /* renamed from: j */
    public void m37084j(int i10) {
        ByteBuffer byteBuffer = this.f40330f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f40330f = ByteBuffer.allocate(i10);
        } else {
            this.f40330f.clear();
        }
    }
}
