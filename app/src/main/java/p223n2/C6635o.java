package p223n2;

import androidx.work.C0757b;
import p327t1.AbstractC8594b;
import p327t1.AbstractC8597e;
import p327t1.AbstractC8603k;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/o.class
 */
/* renamed from: n2.o */
/* loaded from: combined.jar:classes1.jar:n2/o.class */
public final class C6635o implements InterfaceC6634n {

    /* renamed from: a */
    public final AbstractC8597e f34564a;

    /* renamed from: b */
    public final AbstractC8594b<C6633m> f34565b;

    /* renamed from: c */
    public final AbstractC8603k f34566c;

    /* renamed from: d */
    public final AbstractC8603k f34567d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/o$a.class
     */
    /* renamed from: n2.o$a */
    /* loaded from: combined.jar:classes1.jar:n2/o$a.class */
    public class a extends AbstractC8594b<C6633m> {

        /* renamed from: d */
        public final C6635o f34568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6635o c6635o, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34568d = c6635o;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p327t1.AbstractC8594b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo30571g(InterfaceC9401f interfaceC9401f, C6633m c6633m) {
            String str = c6633m.f34562a;
            if (str == null) {
                interfaceC9401f.mo36945t0(1);
            } else {
                interfaceC9401f.mo36938h0(1, str);
            }
            byte[] m4871n = C0757b.m4871n(c6633m.f34563b);
            if (m4871n == null) {
                interfaceC9401f.mo36945t0(2);
            } else {
                interfaceC9401f.mo36942n0(2, m4871n);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/o$b.class
     */
    /* renamed from: n2.o$b */
    /* loaded from: combined.jar:classes1.jar:n2/o$b.class */
    public class b extends AbstractC8603k {

        /* renamed from: d */
        public final C6635o f34569d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6635o c6635o, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34569d = c6635o;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/o$c.class
     */
    /* renamed from: n2.o$c */
    /* loaded from: combined.jar:classes1.jar:n2/o$c.class */
    public class c extends AbstractC8603k {

        /* renamed from: d */
        public final C6635o f34570d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6635o c6635o, AbstractC8597e abstractC8597e) {
            super(abstractC8597e);
            this.f34570d = c6635o;
        }

        @Override // p327t1.AbstractC8603k
        /* renamed from: d */
        public String mo30570d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C6635o(AbstractC8597e abstractC8597e) {
        this.f34564a = abstractC8597e;
        this.f34565b = new a(this, abstractC8597e);
        this.f34566c = new b(this, abstractC8597e);
        this.f34567d = new c(this, abstractC8597e);
    }

    @Override // p223n2.InterfaceC6634n
    /* renamed from: a */
    public void mo30584a(String str) {
        this.f34564a.m36897b();
        InterfaceC9401f m36949a = this.f34566c.m36949a();
        if (str == null) {
            m36949a.mo36945t0(1);
        } else {
            m36949a.mo36938h0(1, str);
        }
        this.f34564a.m36898c();
        try {
            m36949a.mo39729H();
            this.f34564a.m36910r();
        } finally {
            this.f34564a.m36900g();
            this.f34566c.m36953f(m36949a);
        }
    }

    @Override // p223n2.InterfaceC6634n
    /* renamed from: b */
    public void mo30585b() {
        this.f34564a.m36897b();
        InterfaceC9401f m36949a = this.f34567d.m36949a();
        this.f34564a.m36898c();
        try {
            m36949a.mo39729H();
            this.f34564a.m36910r();
        } finally {
            this.f34564a.m36900g();
            this.f34567d.m36953f(m36949a);
        }
    }
}
