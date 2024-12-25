package p435z3;

import java.security.MessageDigest;
import p396x3.InterfaceC9646c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/k.class
 */
/* renamed from: z3.k */
/* loaded from: combined.jar:classes1.jar:z3/k.class */
public class C10047k implements InterfaceC9646c {

    /* renamed from: a */
    public final String f46110a;

    /* renamed from: b */
    public final InterfaceC9646c f46111b;

    public C10047k(String str, InterfaceC9646c interfaceC9646c) {
        this.f46110a = str;
        this.f46111b = interfaceC9646c;
    }

    @Override // p396x3.InterfaceC9646c
    /* renamed from: a */
    public void mo27922a(MessageDigest messageDigest) {
        messageDigest.update(this.f46110a.getBytes("UTF-8"));
        this.f46111b.mo27922a(messageDigest);
    }

    @Override // p396x3.InterfaceC9646c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10047k c10047k = (C10047k) obj;
        return this.f46110a.equals(c10047k.f46110a) && this.f46111b.equals(c10047k.f46111b);
    }

    @Override // p396x3.InterfaceC9646c
    public int hashCode() {
        return (this.f46110a.hashCode() * 31) + this.f46111b.hashCode();
    }
}
