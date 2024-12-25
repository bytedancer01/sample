package p268p7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p267p6.C7629w0;
import p268p7.C7663x;
import p332t6.C8634b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/l.class
 */
/* renamed from: p7.l */
/* loaded from: combined.jar:classes2.jar:p7/l.class */
public interface InterfaceC7651l {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/l$a.class
     */
    /* renamed from: p7.l$a */
    /* loaded from: combined.jar:classes2.jar:p7/l$a.class */
    public static final class a {

        /* renamed from: a */
        public final C7653n f37192a;

        /* renamed from: b */
        public final MediaFormat f37193b;

        /* renamed from: c */
        public final C7629w0 f37194c;

        /* renamed from: d */
        public final Surface f37195d;

        /* renamed from: e */
        public final MediaCrypto f37196e;

        /* renamed from: f */
        public final int f37197f;

        public a(C7653n c7653n, MediaFormat mediaFormat, C7629w0 c7629w0, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f37192a = c7653n;
            this.f37193b = mediaFormat;
            this.f37194c = c7629w0;
            this.f37195d = surface;
            this.f37196e = mediaCrypto;
            this.f37197f = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/l$b.class
     */
    /* renamed from: p7.l$b */
    /* loaded from: combined.jar:classes2.jar:p7/l$b.class */
    public interface b {

        /* renamed from: a */
        public static final b f37198a = new C7663x.b();

        /* renamed from: a */
        InterfaceC7651l mo33260a(a aVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/l$c.class
     */
    /* renamed from: p7.l$c */
    /* loaded from: combined.jar:classes2.jar:p7/l$c.class */
    public interface c {
        /* renamed from: a */
        void mo23572a(InterfaceC7651l interfaceC7651l, long j10, long j11);
    }

    /* renamed from: a */
    MediaFormat mo33240a();

    /* renamed from: b */
    void mo33241b(c cVar, Handler handler);

    /* renamed from: c */
    void mo33242c(int i10, int i11, C8634b c8634b, long j10, int i12);

    /* renamed from: d */
    void mo33243d(int i10);

    /* renamed from: e */
    ByteBuffer mo33244e(int i10);

    /* renamed from: f */
    void mo33245f(Surface surface);

    void flush();

    /* renamed from: g */
    void mo33246g(int i10, int i11, int i12, long j10, int i13);

    /* renamed from: h */
    boolean mo33247h();

    /* renamed from: i */
    void mo33248i(Bundle bundle);

    /* renamed from: j */
    void mo33249j(int i10, long j10);

    /* renamed from: k */
    int mo33250k();

    /* renamed from: l */
    int mo33251l(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: m */
    void mo33252m(int i10, boolean z10);

    /* renamed from: n */
    ByteBuffer mo33253n(int i10);

    void release();
}
