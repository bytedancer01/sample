package p435z3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p225n4.InterfaceC6650c;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;
import p396x3.InterfaceC9650g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/f.class
 */
/* renamed from: z3.f */
/* loaded from: combined.jar:classes1.jar:z3/f.class */
public class C10042f implements InterfaceC9646c {

    /* renamed from: a */
    public final String f46086a;

    /* renamed from: b */
    public final int f46087b;

    /* renamed from: c */
    public final int f46088c;

    /* renamed from: d */
    public final InterfaceC9648e f46089d;

    /* renamed from: e */
    public final InterfaceC9648e f46090e;

    /* renamed from: f */
    public final InterfaceC9650g f46091f;

    /* renamed from: g */
    public final InterfaceC9649f f46092g;

    /* renamed from: h */
    public final InterfaceC6650c f46093h;

    /* renamed from: i */
    public final InterfaceC9645b f46094i;

    /* renamed from: j */
    public final InterfaceC9646c f46095j;

    /* renamed from: k */
    public String f46096k;

    /* renamed from: l */
    public int f46097l;

    /* renamed from: m */
    public InterfaceC9646c f46098m;

    public C10042f(String str, InterfaceC9646c interfaceC9646c, int i10, int i11, InterfaceC9648e interfaceC9648e, InterfaceC9648e interfaceC9648e2, InterfaceC9650g interfaceC9650g, InterfaceC9649f interfaceC9649f, InterfaceC6650c interfaceC6650c, InterfaceC9645b interfaceC9645b) {
        this.f46086a = str;
        this.f46095j = interfaceC9646c;
        this.f46087b = i10;
        this.f46088c = i11;
        this.f46089d = interfaceC9648e;
        this.f46090e = interfaceC9648e2;
        this.f46091f = interfaceC9650g;
        this.f46092g = interfaceC9649f;
        this.f46093h = interfaceC6650c;
        this.f46094i = interfaceC9645b;
    }

    @Override // p396x3.InterfaceC9646c
    /* renamed from: a */
    public void mo27922a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f46087b).putInt(this.f46088c).array();
        this.f46095j.mo27922a(messageDigest);
        messageDigest.update(this.f46086a.getBytes("UTF-8"));
        messageDigest.update(array);
        InterfaceC9648e interfaceC9648e = this.f46089d;
        messageDigest.update((interfaceC9648e != null ? interfaceC9648e.getId() : "").getBytes("UTF-8"));
        InterfaceC9648e interfaceC9648e2 = this.f46090e;
        messageDigest.update((interfaceC9648e2 != null ? interfaceC9648e2.getId() : "").getBytes("UTF-8"));
        InterfaceC9650g interfaceC9650g = this.f46091f;
        messageDigest.update((interfaceC9650g != null ? interfaceC9650g.getId() : "").getBytes("UTF-8"));
        InterfaceC9649f interfaceC9649f = this.f46092g;
        messageDigest.update((interfaceC9649f != null ? interfaceC9649f.getId() : "").getBytes("UTF-8"));
        InterfaceC9645b interfaceC9645b = this.f46094i;
        messageDigest.update((interfaceC9645b != null ? interfaceC9645b.getId() : "").getBytes("UTF-8"));
    }

    /* renamed from: b */
    public InterfaceC9646c m42248b() {
        if (this.f46098m == null) {
            this.f46098m = new C10047k(this.f46086a, this.f46095j);
        }
        return this.f46098m;
    }

    @Override // p396x3.InterfaceC9646c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10042f c10042f = (C10042f) obj;
        if (!this.f46086a.equals(c10042f.f46086a) || !this.f46095j.equals(c10042f.f46095j) || this.f46088c != c10042f.f46088c || this.f46087b != c10042f.f46087b) {
            return false;
        }
        InterfaceC9650g interfaceC9650g = this.f46091f;
        if ((interfaceC9650g == null) ^ (c10042f.f46091f == null)) {
            return false;
        }
        if (interfaceC9650g != null && !interfaceC9650g.getId().equals(c10042f.f46091f.getId())) {
            return false;
        }
        InterfaceC9648e interfaceC9648e = this.f46090e;
        if ((interfaceC9648e == null) ^ (c10042f.f46090e == null)) {
            return false;
        }
        if (interfaceC9648e != null && !interfaceC9648e.getId().equals(c10042f.f46090e.getId())) {
            return false;
        }
        InterfaceC9648e interfaceC9648e2 = this.f46089d;
        if ((interfaceC9648e2 == null) ^ (c10042f.f46089d == null)) {
            return false;
        }
        if (interfaceC9648e2 != null && !interfaceC9648e2.getId().equals(c10042f.f46089d.getId())) {
            return false;
        }
        InterfaceC9649f interfaceC9649f = this.f46092g;
        if ((interfaceC9649f == null) ^ (c10042f.f46092g == null)) {
            return false;
        }
        if (interfaceC9649f != null && !interfaceC9649f.getId().equals(c10042f.f46092g.getId())) {
            return false;
        }
        InterfaceC6650c interfaceC6650c = this.f46093h;
        if ((interfaceC6650c == null) ^ (c10042f.f46093h == null)) {
            return false;
        }
        if (interfaceC6650c != null && !interfaceC6650c.getId().equals(c10042f.f46093h.getId())) {
            return false;
        }
        InterfaceC9645b interfaceC9645b = this.f46094i;
        if ((interfaceC9645b == null) ^ (c10042f.f46094i == null)) {
            return false;
        }
        return interfaceC9645b == null || interfaceC9645b.getId().equals(c10042f.f46094i.getId());
    }

    @Override // p396x3.InterfaceC9646c
    public int hashCode() {
        if (this.f46097l == 0) {
            int hashCode = this.f46086a.hashCode();
            this.f46097l = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f46095j.hashCode()) * 31) + this.f46087b) * 31) + this.f46088c;
            this.f46097l = hashCode2;
            InterfaceC9648e interfaceC9648e = this.f46089d;
            int hashCode3 = (hashCode2 * 31) + (interfaceC9648e != null ? interfaceC9648e.getId().hashCode() : 0);
            this.f46097l = hashCode3;
            InterfaceC9648e interfaceC9648e2 = this.f46090e;
            int hashCode4 = (hashCode3 * 31) + (interfaceC9648e2 != null ? interfaceC9648e2.getId().hashCode() : 0);
            this.f46097l = hashCode4;
            InterfaceC9650g interfaceC9650g = this.f46091f;
            int hashCode5 = (hashCode4 * 31) + (interfaceC9650g != null ? interfaceC9650g.getId().hashCode() : 0);
            this.f46097l = hashCode5;
            InterfaceC9649f interfaceC9649f = this.f46092g;
            int hashCode6 = (hashCode5 * 31) + (interfaceC9649f != null ? interfaceC9649f.getId().hashCode() : 0);
            this.f46097l = hashCode6;
            InterfaceC6650c interfaceC6650c = this.f46093h;
            int hashCode7 = (hashCode6 * 31) + (interfaceC6650c != null ? interfaceC6650c.getId().hashCode() : 0);
            this.f46097l = hashCode7;
            InterfaceC9645b interfaceC9645b = this.f46094i;
            int i10 = 0;
            if (interfaceC9645b != null) {
                i10 = interfaceC9645b.getId().hashCode();
            }
            this.f46097l = (hashCode7 * 31) + i10;
        }
        return this.f46097l;
    }

    public String toString() {
        if (this.f46096k == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EngineKey{");
            sb2.append(this.f46086a);
            sb2.append('+');
            sb2.append(this.f46095j);
            sb2.append("+[");
            sb2.append(this.f46087b);
            sb2.append('x');
            sb2.append(this.f46088c);
            sb2.append("]+");
            sb2.append('\'');
            InterfaceC9648e interfaceC9648e = this.f46089d;
            sb2.append(interfaceC9648e != null ? interfaceC9648e.getId() : "");
            sb2.append('\'');
            sb2.append('+');
            sb2.append('\'');
            InterfaceC9648e interfaceC9648e2 = this.f46090e;
            sb2.append(interfaceC9648e2 != null ? interfaceC9648e2.getId() : "");
            sb2.append('\'');
            sb2.append('+');
            sb2.append('\'');
            InterfaceC9650g interfaceC9650g = this.f46091f;
            sb2.append(interfaceC9650g != null ? interfaceC9650g.getId() : "");
            sb2.append('\'');
            sb2.append('+');
            sb2.append('\'');
            InterfaceC9649f interfaceC9649f = this.f46092g;
            sb2.append(interfaceC9649f != null ? interfaceC9649f.getId() : "");
            sb2.append('\'');
            sb2.append('+');
            sb2.append('\'');
            InterfaceC6650c interfaceC6650c = this.f46093h;
            sb2.append(interfaceC6650c != null ? interfaceC6650c.getId() : "");
            sb2.append('\'');
            sb2.append('+');
            sb2.append('\'');
            InterfaceC9645b interfaceC9645b = this.f46094i;
            sb2.append(interfaceC9645b != null ? interfaceC9645b.getId() : "");
            sb2.append('\'');
            sb2.append('}');
            this.f46096k = sb2.toString();
        }
        return this.f46096k;
    }
}
