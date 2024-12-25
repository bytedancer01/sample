package p030c0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.achartengine.ChartFactory;
import p030c0.C0964r;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/l0.class
 */
/* renamed from: c0.l0 */
/* loaded from: combined.jar:classes1.jar:c0/l0.class */
public class C0953l0 {

    /* renamed from: a */
    public static final Object f6582a = new Object();

    /* renamed from: b */
    public static final Object f6583b = new Object();

    /* renamed from: a */
    public static Bundle m5680a(C0964r.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat m5741d = aVar.m5741d();
        bundle.putInt("icon", m5741d != null ? m5741d.m1889f() : 0);
        bundle.putCharSequence(ChartFactory.TITLE, aVar.m5745h());
        bundle.putParcelable("actionIntent", aVar.m5738a());
        Bundle bundle2 = aVar.m5740c() != null ? new Bundle(aVar.m5740c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m5739b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m5682c(aVar.m5742e()));
        bundle.putBoolean("showsUserInterface", aVar.m5744g());
        bundle.putInt("semanticAction", aVar.m5743f());
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m5681b(C0965r0 c0965r0) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c0965r0.m5811i());
        bundle.putCharSequence("label", c0965r0.m5810h());
        bundle.putCharSequenceArray("choices", c0965r0.m5807e());
        bundle.putBoolean("allowFreeFormInput", c0965r0.m5805c());
        bundle.putBundle("extras", c0965r0.m5809g());
        Set<String> m5806d = c0965r0.m5806d();
        if (m5806d != null && !m5806d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m5806d.size());
            Iterator<String> it = m5806d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public static Bundle[] m5682c(C0965r0[] c0965r0Arr) {
        if (c0965r0Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0965r0Arr.length];
        for (int i10 = 0; i10 < c0965r0Arr.length; i10++) {
            bundleArr[i10] = m5681b(c0965r0Arr[i10]);
        }
        return bundleArr;
    }
}
