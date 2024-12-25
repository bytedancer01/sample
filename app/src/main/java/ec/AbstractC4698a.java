package ec;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/a.class
 */
/* renamed from: ec.a */
/* loaded from: combined.jar:classes2.jar:ec/a.class */
public abstract class AbstractC4698a<T> implements Iterator<T> {

    /* renamed from: b */
    public b f27709b = b.NOT_READY;

    /* renamed from: c */
    @NullableDecl
    public T f27710c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/a$a.class
     */
    /* renamed from: ec.a$a */
    /* loaded from: combined.jar:classes2.jar:ec/a$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f27711a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                ec.a$b[] r0 = ec.AbstractC4698a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                ec.AbstractC4698a.a.f27711a = r0
                r0 = r4
                ec.a$b r1 = ec.AbstractC4698a.b.READY     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = ec.AbstractC4698a.a.f27711a     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                ec.a$b r1 = ec.AbstractC4698a.b.DONE     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: ec.AbstractC4698a.a.m44448clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/a$b.class
     */
    /* renamed from: ec.a$b */
    /* loaded from: combined.jar:classes2.jar:ec/a$b.class */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo23631a();

    @NullableDecl
    /* renamed from: b */
    public final T m23632b() {
        this.f27709b = b.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean m23633c() {
        this.f27709b = b.FAILED;
        this.f27710c = mo23631a();
        if (this.f27709b == b.DONE) {
            return false;
        }
        this.f27709b = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C4708k.m23673o(this.f27709b != b.FAILED);
        int i10 = a.f27711a[this.f27709b.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            return m23633c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27709b = b.NOT_READY;
        T t10 = this.f27710c;
        this.f27710c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
