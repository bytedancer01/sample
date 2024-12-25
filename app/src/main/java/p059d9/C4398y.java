package p059d9;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p078e9.C4665b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/y.class
 */
/* renamed from: d9.y */
/* loaded from: combined.jar:classes2.jar:d9/y.class */
public final class C4398y {
    /* renamed from: a */
    public static void m22288a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m22289b(MediaFormat mediaFormat, C4665b c4665b) {
        if (c4665b != null) {
            m22291d(mediaFormat, "color-transfer", c4665b.f27510d);
            m22291d(mediaFormat, "color-standard", c4665b.f27508b);
            m22291d(mediaFormat, "color-range", c4665b.f27509c);
            m22288a(mediaFormat, "hdr-static-info", c4665b.f27511e);
        }
    }

    /* renamed from: c */
    public static void m22290c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    /* renamed from: d */
    public static void m22291d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* renamed from: e */
    public static void m22292e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
