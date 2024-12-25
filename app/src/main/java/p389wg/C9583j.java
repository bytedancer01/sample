package p389wg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import p411xi.AbstractC9767k;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9770n;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/j.class
 */
/* renamed from: wg.j */
/* loaded from: combined.jar:classes2.jar:wg/j.class */
public class C9583j {

    /* renamed from: a */
    public final C9770n f43650a;

    /* renamed from: b */
    public int f43651b;

    /* renamed from: c */
    public final InterfaceC9763g f43652c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/j$a.class
     */
    /* renamed from: wg.j$a */
    /* loaded from: combined.jar:classes2.jar:wg/j$a.class */
    public class a extends AbstractC9767k {

        /* renamed from: c */
        public final C9583j f43653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9583j c9583j, InterfaceC9756b0 interfaceC9756b0) {
            super(interfaceC9756b0);
            this.f43653c = c9583j;
        }

        @Override // p411xi.AbstractC9767k, p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            if (this.f43653c.f43651b == 0) {
                return -1L;
            }
            long mo22901x = super.mo22901x(c9761e, Math.min(j10, this.f43653c.f43651b));
            if (mo22901x == -1) {
                return -1L;
            }
            C9583j.m40269b(this.f43653c, mo22901x);
            return mo22901x;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wg/j$b.class
     */
    /* renamed from: wg.j$b */
    /* loaded from: combined.jar:classes2.jar:wg/j$b.class */
    public class b extends Inflater {

        /* renamed from: a */
        public final C9583j f43654a;

        public b(C9583j c9583j) {
            this.f43654a = c9583j;
        }

        @Override // java.util.zip.Inflater
        public int inflate(byte[] bArr, int i10, int i11) {
            int inflate = super.inflate(bArr, i10, i11);
            int i12 = inflate;
            if (inflate == 0) {
                i12 = inflate;
                if (needsDictionary()) {
                    setDictionary(C9587n.f43663a);
                    i12 = super.inflate(bArr, i10, i11);
                }
            }
            return i12;
        }
    }

    public C9583j(InterfaceC9763g interfaceC9763g) {
        C9770n c9770n = new C9770n(new a(this, interfaceC9763g), new b(this));
        this.f43650a = c9770n;
        this.f43652c = C9772p.m41229c(c9770n);
    }

    /* renamed from: b */
    public static /* synthetic */ int m40269b(C9583j c9583j, long j10) {
        int i10 = (int) (c9583j.f43651b - j10);
        c9583j.f43651b = i10;
        return i10;
    }

    /* renamed from: c */
    public void m40270c() {
        this.f43652c.close();
    }

    /* renamed from: d */
    public final void m40271d() {
        if (this.f43651b > 0) {
            this.f43650a.m41225l();
            if (this.f43651b == 0) {
                return;
            }
            throw new IOException("compressedLimit > 0: " + this.f43651b);
        }
    }

    /* renamed from: e */
    public final C9764h m40272e() {
        return this.f43652c.mo41159g0(this.f43652c.readInt());
    }

    /* renamed from: f */
    public List<C9577d> m40273f(int i10) {
        this.f43651b += i10;
        int readInt = this.f43652c.readInt();
        if (readInt < 0) {
            throw new IOException("numberOfPairs < 0: " + readInt);
        }
        if (readInt > 1024) {
            throw new IOException("numberOfPairs > 1024: " + readInt);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            C9764h mo41186B = m40272e().mo41186B();
            C9764h m40272e = m40272e();
            if (mo41186B.size() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new C9577d(mo41186B, m40272e));
        }
        m40271d();
        return arrayList;
    }
}
