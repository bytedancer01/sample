package p142i4;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import p005a4.InterfaceC0065b;
import p396x3.EnumC9644a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/s.class
 */
/* renamed from: i4.s */
/* loaded from: combined.jar:classes1.jar:i4/s.class */
public class C5188s implements InterfaceC5170a<ParcelFileDescriptor> {

    /* renamed from: c */
    public static final a f29600c = new a();

    /* renamed from: a */
    public a f29601a;

    /* renamed from: b */
    public int f29602b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/s$a.class
     */
    /* renamed from: i4.s$a */
    /* loaded from: combined.jar:classes1.jar:i4/s$a.class */
    public static class a {
        /* renamed from: a */
        public MediaMetadataRetriever m25880a() {
            return new MediaMetadataRetriever();
        }
    }

    public C5188s() {
        this(f29600c, -1);
    }

    public C5188s(a aVar, int i10) {
        this.f29601a = aVar;
        this.f29602b = i10;
    }

    /* renamed from: a */
    public Bitmap m25879a(ParcelFileDescriptor parcelFileDescriptor, InterfaceC0065b interfaceC0065b, int i10, int i11, EnumC9644a enumC9644a) {
        MediaMetadataRetriever m25880a = this.f29601a.m25880a();
        m25880a.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i12 = this.f29602b;
        Bitmap frameAtTime = i12 >= 0 ? m25880a.getFrameAtTime(i12) : m25880a.getFrameAtTime();
        m25880a.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }
}
