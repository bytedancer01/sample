package p408xf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p099fc.C4799b0;
import p099fc.C4803d0;
import p371vf.InterfaceC9345b;
import wf.C9571a;
import wf.C9572b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xf/a.class
 */
/* renamed from: xf.a */
/* loaded from: combined.jar:classes2.jar:xf/a.class */
public class C9746a implements InterfaceC9345b {

    /* renamed from: a */
    public List<C9571a> f44482a;

    /* renamed from: b */
    public Map<String, C9571a> f44483b = new HashMap();

    public C9746a(Map<C9571a, List<C9572b>> map) {
        this.f44482a = C4799b0.m24299h();
        this.f44482a = C4799b0.m24300i(map.keySet());
        m41051h();
    }

    @Override // p371vf.InterfaceC9345b
    /* renamed from: a */
    public C9572b mo39384a(int i10, int i11) {
        return this.f44482a.get(i10).m40156e().get(i11);
    }

    @Override // p371vf.InterfaceC9345b
    /* renamed from: b */
    public boolean mo39385b() {
        return !this.f44482a.isEmpty();
    }

    @Override // p371vf.InterfaceC9345b
    /* renamed from: c */
    public C9571a mo39386c(int i10) {
        return this.f44482a.get(i10);
    }

    @Override // p371vf.InterfaceC9345b
    /* renamed from: d */
    public List<C9572b> mo39387d(int i10) {
        if (i10 >= this.f44482a.size() || this.f44482a.get(i10) == null) {
            return null;
        }
        return this.f44482a.get(i10).m40156e();
    }

    @Override // p371vf.InterfaceC9345b
    /* renamed from: e */
    public C9571a mo39388e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C9571a c9571a = this.f44483b.get(str4);
        return c9571a != null ? c9571a : m41050g(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // p371vf.InterfaceC9345b
    /* renamed from: f */
    public int mo39389f() {
        return this.f44482a.size();
    }

    /* renamed from: g */
    public C9571a m41050g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int size = this.f44482a.size();
        C9571a c9571a = new C9571a(str2, str, size, str3, str4, str5, str6, str7, str6);
        if (size > 0) {
            C9571a c9571a2 = this.f44482a.get(size - 1);
            c9571a2.m40165n(c9571a);
            c9571a.m40166o(c9571a2);
        }
        this.f44482a.add(c9571a);
        this.f44483b.put(c9571a.m40160i(), c9571a);
        return c9571a;
    }

    /* renamed from: h */
    public final void m41051h() {
        this.f44483b = C4803d0.m24364g();
        for (int i10 = 0; i10 < this.f44482a.size(); i10++) {
            C9571a c9571a = this.f44482a.get(i10);
            this.f44483b.put(c9571a.m40160i(), c9571a);
        }
    }
}
