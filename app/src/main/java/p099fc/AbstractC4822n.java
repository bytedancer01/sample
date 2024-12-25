package p099fc;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p168jc.C5352a;
import p168jc.C5354c;
import p168jc.C5355d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/n.class
 */
/* renamed from: fc.n */
/* loaded from: combined.jar:classes2.jar:fc/n.class */
public abstract class AbstractC4822n {

    /* renamed from: a */
    public static final AbstractC4822n f28345a = new a();

    /* renamed from: b */
    public static final AbstractC4822n f28346b = new b(-1);

    /* renamed from: c */
    public static final AbstractC4822n f28347c = new b(1);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/n$a.class
     */
    /* renamed from: fc.n$a */
    /* loaded from: combined.jar:classes2.jar:fc/n$a.class */
    public static final class a extends AbstractC4822n {
        public a() {
            super(null);
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: d */
        public AbstractC4822n mo24460d(int i10, int i11) {
            return m24466k(C5354c.m26638d(i10, i11));
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: e */
        public AbstractC4822n mo24461e(long j10, long j11) {
            return m24466k(C5355d.m26648a(j10, j11));
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: f */
        public <T> AbstractC4822n mo24462f(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator) {
            return m24466k(comparator.compare(t10, t11));
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: g */
        public AbstractC4822n mo24463g(boolean z10, boolean z11) {
            return m24466k(C5352a.m26633a(z10, z11));
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: h */
        public AbstractC4822n mo24464h(boolean z10, boolean z11) {
            return m24466k(C5352a.m26633a(z11, z10));
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: i */
        public int mo24465i() {
            return 0;
        }

        /* renamed from: k */
        public AbstractC4822n m24466k(int i10) {
            return i10 < 0 ? AbstractC4822n.f28346b : i10 > 0 ? AbstractC4822n.f28347c : AbstractC4822n.f28345a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/n$b.class
     */
    /* renamed from: fc.n$b */
    /* loaded from: combined.jar:classes2.jar:fc/n$b.class */
    public static final class b extends AbstractC4822n {

        /* renamed from: d */
        public final int f28348d;

        public b(int i10) {
            super(null);
            this.f28348d = i10;
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: d */
        public AbstractC4822n mo24460d(int i10, int i11) {
            return this;
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: e */
        public AbstractC4822n mo24461e(long j10, long j11) {
            return this;
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: f */
        public <T> AbstractC4822n mo24462f(@NullableDecl T t10, @NullableDecl T t11, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: g */
        public AbstractC4822n mo24463g(boolean z10, boolean z11) {
            return this;
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: h */
        public AbstractC4822n mo24464h(boolean z10, boolean z11) {
            return this;
        }

        @Override // p099fc.AbstractC4822n
        /* renamed from: i */
        public int mo24465i() {
            return this.f28348d;
        }
    }

    public AbstractC4822n() {
    }

    public /* synthetic */ AbstractC4822n(a aVar) {
        this();
    }

    /* renamed from: j */
    public static AbstractC4822n m24459j() {
        return f28345a;
    }

    /* renamed from: d */
    public abstract AbstractC4822n mo24460d(int i10, int i11);

    /* renamed from: e */
    public abstract AbstractC4822n mo24461e(long j10, long j11);

    /* renamed from: f */
    public abstract <T> AbstractC4822n mo24462f(@NullableDecl T t10, @NullableDecl T t11, Comparator<T> comparator);

    /* renamed from: g */
    public abstract AbstractC4822n mo24463g(boolean z10, boolean z11);

    /* renamed from: h */
    public abstract AbstractC4822n mo24464h(boolean z10, boolean z11);

    /* renamed from: i */
    public abstract int mo24465i();
}
