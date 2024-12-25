package p087f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import p069e0.C4564c;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/i.class
 */
/* renamed from: f0.i */
/* loaded from: combined.jar:classes1.jar:f0/i.class */
public class C4746i extends C4747j {
    @Override // p087f0.C4747j
    /* renamed from: a */
    public Typeface mo24008a(Context context, C4564c.b bVar, Resources resources, int i10) {
        Typeface typeface;
        FontFamily$Builder fontFamily$Builder;
        try {
            C4564c.c[] m23031a = bVar.m23031a();
            int length = m23031a.length;
            fontFamily$Builder = null;
            int i11 = 0;
            while (true) {
                int i12 = 1;
                if (i11 >= length) {
                    break;
                }
                C4564c.c cVar = m23031a[i11];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.m23033b()).setWeight(cVar.m23036e());
                    if (!cVar.m23037f()) {
                        i12 = 0;
                    }
                    Font build = weight.setSlant(i12).setTtcIndex(cVar.m23034c()).setFontVariationSettings(cVar.m23035d()).build();
                    if (fontFamily$Builder == null) {
                        fontFamily$Builder = new FontFamily$Builder(build);
                    } else {
                        fontFamily$Builder.addFont(build);
                    }
                } catch (IOException e10) {
                }
                i11++;
            }
        } catch (Exception e11) {
            typeface = null;
        }
        if (fontFamily$Builder == null) {
            return null;
        }
        int i13 = (i10 & 1) != 0 ? 700 : 400;
        int i14 = 0;
        if ((i10 & 2) != 0) {
            i14 = 1;
        }
        typeface = new Typeface$CustomFallbackBuilder(fontFamily$Builder.build()).setStyle(new FontStyle(i13, i14)).build();
        return typeface;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r0 != null) goto L12;
     */
    @Override // p087f0.C4747j
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface mo24009b(android.content.Context r6, android.os.CancellationSignal r7, p191l0.C5643f.b[] r8, int r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p087f0.C4746i.mo24009b(android.content.Context, android.os.CancellationSignal, l0.f$b[], int):android.graphics.Typeface");
    }

    @Override // p087f0.C4747j
    /* renamed from: d */
    public Typeface mo24016d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            return null;
        }
    }

    @Override // p087f0.C4747j
    /* renamed from: f */
    public C5643f.b mo24030f(C5643f.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
