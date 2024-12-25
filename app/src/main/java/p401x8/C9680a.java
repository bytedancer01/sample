package p401x8;

import android.text.SpannedString;
import java.util.ArrayList;
import java.util.Collections;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p243o8.AbstractC6921c;
import p243o8.C6919a;
import p243o8.C6925g;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/a.class
 */
/* renamed from: x8.a */
/* loaded from: combined.jar:classes2.jar:x8/a.class */
public final class C9680a extends AbstractC6921c {

    /* renamed from: o */
    public final C4361f0 f44175o;

    public C9680a() {
        super("Mp4WebvttDecoder");
        this.f44175o = new C4361f0();
    }

    /* renamed from: B */
    public static C6919a m40711B(C4361f0 c4361f0, int i10) {
        SpannedString spannedString = null;
        C6919a.b bVar = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new C6925g("Incomplete vtt cue box header found.");
            }
            int m21998n = c4361f0.m21998n();
            int m21998n2 = c4361f0.m21998n();
            int i11 = m21998n - 8;
            String m22325G = C4401z0.m22325G(c4361f0.m21988d(), c4361f0.m21989e(), i11);
            c4361f0.m21984Q(i11);
            int i12 = (i10 - 8) - i11;
            if (m21998n2 == 1937011815) {
                bVar = C9685f.m40768o(m22325G);
                i10 = i12;
            } else {
                i10 = i12;
                if (m21998n2 == 1885436268) {
                    spannedString = C9685f.m40770q(null, m22325G.trim(), Collections.emptyList());
                    i10 = i12;
                }
            }
        }
        CharSequence charSequence = spannedString;
        if (spannedString == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.m31871o(charSequence).m31857a() : C9685f.m40765l(charSequence);
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        this.f44175o.m21981N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f44175o.m21985a() > 0) {
            if (this.f44175o.m21985a() < 8) {
                throw new C6925g("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m21998n = this.f44175o.m21998n();
            if (this.f44175o.m21998n() == 1987343459) {
                arrayList.add(m40711B(this.f44175o, m21998n - 8));
            } else {
                this.f44175o.m21984Q(m21998n - 8);
            }
        }
        return new C9681b(arrayList);
    }
}
