package p365v6;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.UUID;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/h0.class
 */
/* renamed from: v6.h0 */
/* loaded from: combined.jar:classes2.jar:v6/h0.class */
public final class C9262h0 implements ExoMediaCrypto {

    /* renamed from: d */
    public static final boolean f42292d;

    /* renamed from: a */
    public final UUID f42293a;

    /* renamed from: b */
    public final byte[] f42294b;

    /* renamed from: c */
    public final boolean f42295c;

    static {
        boolean z10;
        if ("Amazon".equals(C4401z0.f26681c)) {
            String str = C4401z0.f26682d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f42292d = z10;
            }
        }
        z10 = false;
        f42292d = z10;
    }

    public C9262h0(UUID uuid, byte[] bArr, boolean z10) {
        this.f42293a = uuid;
        this.f42294b = bArr;
        this.f42295c = z10;
    }
}
