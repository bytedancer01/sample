package p302r7;

import ec.C4701d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p059d9.C4359e0;
import p283q7.AbstractC7846h;
import p283q7.C7839a;
import p283q7.C7843e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r7/b.class
 */
/* renamed from: r7.b */
/* loaded from: combined.jar:classes2.jar:r7/b.class */
public final class C8010b extends AbstractC7846h {
    /* renamed from: c */
    public static C7839a m34849c(C4359e0 c4359e0) {
        String str;
        String str2;
        String str3;
        c4359e0.m21960r(12);
        int m21950h = c4359e0.m21950h(12);
        int m21946d = c4359e0.m21946d();
        c4359e0.m21960r(44);
        c4359e0.m21961s(c4359e0.m21950h(12));
        c4359e0.m21960r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str4 = null;
            if (c4359e0.m21946d() >= (m21946d + m21950h) - 4) {
                break;
            }
            c4359e0.m21960r(48);
            int m21950h2 = c4359e0.m21950h(8);
            c4359e0.m21960r(4);
            int m21946d2 = c4359e0.m21946d() + c4359e0.m21950h(12);
            String str5 = null;
            while (true) {
                str = str5;
                if (c4359e0.m21946d() >= m21946d2) {
                    break;
                }
                int m21950h3 = c4359e0.m21950h(8);
                int m21950h4 = c4359e0.m21950h(8);
                int m21946d3 = c4359e0.m21946d() + m21950h4;
                if (m21950h3 == 2) {
                    int m21950h5 = c4359e0.m21950h(16);
                    c4359e0.m21960r(8);
                    str2 = str4;
                    str3 = str;
                    if (m21950h5 == 3) {
                        while (true) {
                            str2 = str4;
                            str3 = str;
                            if (c4359e0.m21946d() < m21946d3) {
                                String m21954l = c4359e0.m21954l(c4359e0.m21950h(8), C4701d.f27715a);
                                int m21950h6 = c4359e0.m21950h(8);
                                int i10 = 0;
                                while (true) {
                                    str4 = m21954l;
                                    if (i10 < m21950h6) {
                                        c4359e0.m21961s(c4359e0.m21950h(8));
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str2 = str4;
                    str3 = str;
                    if (m21950h3 == 21) {
                        str3 = c4359e0.m21954l(m21950h4, C4701d.f27715a);
                        str2 = str4;
                    }
                }
                c4359e0.m21958p(m21946d3 * 8);
                str4 = str2;
                str5 = str3;
            }
            c4359e0.m21958p(m21946d2 * 8);
            if (str4 != null && str != null) {
                arrayList.add(new C8009a(m21950h2, str4 + str));
            }
        }
        return arrayList.isEmpty() ? null : new C7839a(arrayList);
    }

    @Override // p283q7.AbstractC7846h
    /* renamed from: b */
    public C7839a mo34101b(C7843e c7843e, ByteBuffer byteBuffer) {
        return byteBuffer.get() == 116 ? m34849c(new C4359e0(byteBuffer.array(), byteBuffer.limit())) : null;
    }
}
