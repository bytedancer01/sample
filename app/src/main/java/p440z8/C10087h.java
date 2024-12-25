package p440z8;

import android.graphics.Color;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/h.class
 */
/* renamed from: z8.h */
/* loaded from: combined.jar:classes2.jar:z8/h.class */
public final class C10087h {
    /* renamed from: a */
    public static String m42413a(String str) {
        return InstructionFileId.DOT + str + ",." + str + " *";
    }

    /* renamed from: b */
    public static String m42414b(int i10) {
        return C4401z0.m22321E("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
