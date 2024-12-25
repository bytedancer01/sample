package p142i4;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p073e4.C4612g;
import p396x3.InterfaceC9648e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/m.class
 */
/* renamed from: i4.m */
/* loaded from: combined.jar:classes1.jar:i4/m.class */
public class C5182m implements InterfaceC9648e<C4612g, Bitmap> {

    /* renamed from: a */
    public final InterfaceC9648e<InputStream, Bitmap> f29581a;

    /* renamed from: b */
    public final InterfaceC9648e<ParcelFileDescriptor, Bitmap> f29582b;

    public C5182m(InterfaceC9648e<InputStream, Bitmap> interfaceC9648e, InterfaceC9648e<ParcelFileDescriptor, Bitmap> interfaceC9648e2) {
        this.f29581a = interfaceC9648e;
        this.f29582b = interfaceC9648e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003e  */
    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p435z3.InterfaceC10048l<android.graphics.Bitmap> mo25843a(p073e4.C4612g r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = r6
            java.io.InputStream r0 = r0.m23244b()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L32
            r0 = r5
            x3.e<java.io.InputStream, android.graphics.Bitmap> r0 = r0.f29581a     // Catch: java.io.IOException -> L1d
            r1 = r9
            r2 = r7
            r3 = r8
            z3.l r0 = r0.mo25843a(r1, r2, r3)     // Catch: java.io.IOException -> L1d
            r9 = r0
            goto L35
        L1d:
            r9 = move-exception
            java.lang.String r0 = "ImageVideoDecoder"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L32
            java.lang.String r0 = "ImageVideoDecoder"
            java.lang.String r1 = "Failed to load image from stream, trying FileDescriptor"
            r2 = r9
            int r0 = android.util.Log.v(r0, r1, r2)
        L32:
            r0 = 0
            r9 = r0
        L35:
            r0 = r9
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L59
            r0 = r6
            android.os.ParcelFileDescriptor r0 = r0.m23243a()
            r6 = r0
            r0 = r9
            r10 = r0
            r0 = r6
            if (r0 == 0) goto L59
            r0 = r5
            x3.e<android.os.ParcelFileDescriptor, android.graphics.Bitmap> r0 = r0.f29582b
            r1 = r6
            r2 = r7
            r3 = r8
            z3.l r0 = r0.mo25843a(r1, r2, r3)
            r10 = r0
        L59:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p142i4.C5182m.mo25843a(e4.g, int, int):z3.l");
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
