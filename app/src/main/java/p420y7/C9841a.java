package p420y7;

import android.net.Uri;
import java.io.DataInputStream;
import java.io.File;
import p059d9.C4352b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/a.class
 */
@Deprecated
/* renamed from: y7.a */
/* loaded from: combined.jar:classes2.jar:y7/a.class */
public final class C9841a {

    /* renamed from: a */
    public final C4352b f45169a;

    public C9841a(File file) {
        this.f45169a = new C4352b(file);
    }

    /* renamed from: c */
    public static String m41365c(Uri uri, String str) {
        if (str == null) {
            str = uri.toString();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static String m41366d(String str) {
        boolean z10;
        int hashCode = str.hashCode();
        if (hashCode == 3680) {
            if (str.equals("ss")) {
                z10 = 2;
            }
            z10 = -1;
        } else if (hashCode == 103407) {
            if (str.equals("hls")) {
                z10 = true;
            }
            z10 = -1;
        } else if (hashCode != 3075986) {
            if (hashCode == 1131547531 && str.equals("progressive")) {
                z10 = 3;
            }
            z10 = -1;
        } else {
            if (str.equals("dash")) {
                z10 = false;
            }
            z10 = -1;
        }
        return z10 ? !z10 ? z10 != 2 ? "video/x-unknown" : "application/vnd.ms-sstr+xml" : "application/x-mpegURL" : "application/dash+xml";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p420y7.C9874x m41367f(java.io.DataInputStream r5) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p420y7.C9841a.m41367f(java.io.DataInputStream):y7.x");
    }

    /* renamed from: g */
    public static C9858i0 m41368g(String str, int i10, DataInputStream dataInputStream) {
        return new C9858i0((("hls".equals(str) || "ss".equals(str)) && i10 == 0) ? 0 : dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
    }

    /* renamed from: a */
    public void m41369a() {
        this.f45169a.m21907a();
    }

    /* renamed from: b */
    public boolean m41370b() {
        return this.f45169a.m21909c();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x00cc
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: e */
    public p420y7.C9874x[] m41371e() {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p420y7.C9841a.m41371e():y7.x[]");
    }
}
