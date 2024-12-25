package bj;

import android.os.Build;
import bj.C0915c;

/* renamed from: bj.e */
/* loaded from: combined.jar:classes3.jar:bj/e.class */
public final class C0917e implements C0915c.b {
    @Override // bj.C0915c.b
    /* renamed from: a */
    public String mo5609a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // bj.C0915c.b
    /* renamed from: b */
    public String mo5610b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // bj.C0915c.b
    /* renamed from: c */
    public String[] mo5611c() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !C0918f.m5625a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // bj.C0915c.b
    /* renamed from: d */
    public void mo5612d(String str) {
        System.load(str);
    }

    @Override // bj.C0915c.b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
