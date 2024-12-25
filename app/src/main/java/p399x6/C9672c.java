package p399x6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x6/c.class
 */
/* renamed from: x6.c */
/* loaded from: combined.jar:classes2.jar:x6/c.class */
public final class C9672c {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x6/c$a.class
     */
    /* renamed from: x6.c$a */
    /* loaded from: combined.jar:classes2.jar:x6/c$a.class */
    public static class a implements Comparator<CronetProvider> {

        /* renamed from: b */
        public final boolean f44136b;

        public a(boolean z10) {
            this.f44136b = z10;
        }

        /* renamed from: b */
        public static int m40681b(String str, String str2) {
            if (str == null || str2 == null) {
                return 0;
            }
            String[] m22356V0 = C4401z0.m22356V0(str, "\\.");
            String[] m22356V02 = C4401z0.m22356V0(str2, "\\.");
            int min = Math.min(m22356V0.length, m22356V02.length);
            for (int i10 = 0; i10 < min; i10++) {
                if (!m22356V0[i10].equals(m22356V02[i10])) {
                    try {
                        return Integer.parseInt(m22356V0[i10]) - Integer.parseInt(m22356V02[i10]);
                    } catch (NumberFormatException e10) {
                        return 0;
                    }
                }
            }
            return 0;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
            int m40683c = m40683c(cronetProvider) - m40683c(cronetProvider2);
            return m40683c != 0 ? m40683c : -m40681b(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }

        /* renamed from: c */
        public final int m40683c(CronetProvider cronetProvider) {
            String name = cronetProvider.getName();
            if (CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(name)) {
                return 1;
            }
            if ("Google-Play-Services-Cronet-Provider".equals(name)) {
                return this.f44136b ? 0 : 2;
            }
            return 3;
        }
    }

    /* renamed from: a */
    public static CronetEngine m40680a(Context context, String str, boolean z10) {
        String str2;
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList, new a(z10));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String name = ((CronetProvider) arrayList.get(i10)).getName();
            try {
                CronetEngine.Builder createBuilder = ((CronetProvider) arrayList.get(i10)).createBuilder();
                if (str != null) {
                    createBuilder.setUserAgent(str);
                }
                CronetEngine build = createBuilder.build();
                C4392v.m22268b("CronetUtil", "CronetEngine built using " + name);
                return build;
            } catch (SecurityException e10) {
                str2 = "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE.";
                C4392v.m22275i("CronetUtil", str2);
            } catch (UnsatisfiedLinkError e11) {
                str2 = "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app.";
                C4392v.m22275i("CronetUtil", str2);
            }
        }
        C4392v.m22275i("CronetUtil", "CronetEngine could not be built.");
        return null;
    }
}
