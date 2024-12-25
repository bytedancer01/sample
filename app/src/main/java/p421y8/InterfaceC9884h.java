package p421y8;

import java.util.List;
import p009a8.C0134z0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0840f;
import p038c8.AbstractC1020f;
import p038c8.AbstractC1028n;
import p038c8.InterfaceC1029o;
import p267p6.AbstractC7574e2;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/h.class
 */
/* renamed from: y8.h */
/* loaded from: combined.jar:classes2.jar:y8/h.class */
public interface InterfaceC9884h extends InterfaceC9887k {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/h$a.class
     */
    /* renamed from: y8.h$a */
    /* loaded from: combined.jar:classes2.jar:y8/h$a.class */
    public static final class a {

        /* renamed from: a */
        public final C0134z0 f45445a;

        /* renamed from: b */
        public final int[] f45446b;

        /* renamed from: c */
        public final int f45447c;

        public a(C0134z0 c0134z0, int... iArr) {
            this(c0134z0, iArr, 0);
        }

        public a(C0134z0 c0134z0, int[] iArr, int i10) {
            this.f45445a = c0134z0;
            this.f45446b = iArr;
            this.f45447c = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/h$b.class
     */
    /* renamed from: y8.h$b */
    /* loaded from: combined.jar:classes2.jar:y8/h$b.class */
    public interface b {
        /* renamed from: a */
        InterfaceC9884h[] mo41461a(a[] aVarArr, InterfaceC0840f interfaceC0840f, InterfaceC0127w.a aVar, AbstractC7574e2 abstractC7574e2);
    }

    /* renamed from: a */
    int mo25051a();

    /* renamed from: b */
    boolean mo41604b(int i10, long j10);

    /* renamed from: c */
    boolean mo41605c(int i10, long j10);

    /* renamed from: d */
    boolean mo41606d(long j10, AbstractC1020f abstractC1020f, List<? extends AbstractC1028n> list);

    void disable();

    void enable();

    /* renamed from: g */
    void mo41597g(float f10);

    /* renamed from: h */
    Object mo25052h();

    /* renamed from: i */
    void mo41609i();

    /* renamed from: m */
    void mo41613m(boolean z10);

    /* renamed from: n */
    void mo25053n(long j10, long j11, long j12, List<? extends AbstractC1028n> list, InterfaceC1029o[] interfaceC1029oArr);

    /* renamed from: o */
    int mo41598o(long j10, List<? extends AbstractC1028n> list);

    /* renamed from: p */
    int mo41614p();

    /* renamed from: q */
    C7629w0 mo41615q();

    /* renamed from: r */
    int mo25054r();

    /* renamed from: s */
    void mo41616s();
}
