package p030c0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/r0.class
 */
/* renamed from: c0.r0 */
/* loaded from: combined.jar:classes1.jar:c0/r0.class */
public final class C0965r0 {

    /* renamed from: a */
    public final String f6716a;

    /* renamed from: b */
    public final CharSequence f6717b;

    /* renamed from: c */
    public final CharSequence[] f6718c;

    /* renamed from: d */
    public final boolean f6719d;

    /* renamed from: e */
    public final int f6720e;

    /* renamed from: f */
    public final Bundle f6721f;

    /* renamed from: g */
    public final Set<String> f6722g;

    /* renamed from: a */
    public static RemoteInput m5803a(C0965r0 c0965r0) {
        Set<String> m5806d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(c0965r0.m5811i()).setLabel(c0965r0.m5810h()).setChoices(c0965r0.m5807e()).setAllowFreeFormInput(c0965r0.m5805c()).addExtras(c0965r0.m5809g());
        if (Build.VERSION.SDK_INT >= 26 && (m5806d = c0965r0.m5806d()) != null) {
            Iterator<String> it = m5806d.iterator();
            while (it.hasNext()) {
                addExtras.setAllowDataType(it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(c0965r0.m5808f());
        }
        return addExtras.build();
    }

    /* renamed from: b */
    public static RemoteInput[] m5804b(C0965r0[] c0965r0Arr) {
        if (c0965r0Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0965r0Arr.length];
        for (int i10 = 0; i10 < c0965r0Arr.length; i10++) {
            remoteInputArr[i10] = m5803a(c0965r0Arr[i10]);
        }
        return remoteInputArr;
    }

    /* renamed from: c */
    public boolean m5805c() {
        return this.f6719d;
    }

    /* renamed from: d */
    public Set<String> m5806d() {
        return this.f6722g;
    }

    /* renamed from: e */
    public CharSequence[] m5807e() {
        return this.f6718c;
    }

    /* renamed from: f */
    public int m5808f() {
        return this.f6720e;
    }

    /* renamed from: g */
    public Bundle m5809g() {
        return this.f6721f;
    }

    /* renamed from: h */
    public CharSequence m5810h() {
        return this.f6717b;
    }

    /* renamed from: i */
    public String m5811i() {
        return this.f6716a;
    }

    /* renamed from: j */
    public boolean m5812j() {
        return (m5805c() || (m5807e() != null && m5807e().length != 0) || m5806d() == null || m5806d().isEmpty()) ? false : true;
    }
}
