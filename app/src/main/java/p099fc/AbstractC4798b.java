package p099fc;

import ec.C4708k;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/b.class
 */
/* renamed from: fc.b */
/* loaded from: combined.jar:classes2.jar:fc/b.class */
public abstract class AbstractC4798b<T> extends AbstractC4841w0<T> {

    /* renamed from: b */
    public b f28260b = b.NOT_READY;

    /* renamed from: c */
    @NullableDecl
    public T f28261c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/b$a.class
     */
    /* renamed from: fc.b$a */
    /* loaded from: combined.jar:classes2.jar:fc/b$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f28262a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                fc.b$b[] r0 = p099fc.AbstractC4798b.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p099fc.AbstractC4798b.a.f28262a = r0
                r0 = r4
                fc.b$b r1 = p099fc.AbstractC4798b.b.DONE     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = p099fc.AbstractC4798b.a.f28262a     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                fc.b$b r1 = p099fc.AbstractC4798b.b.READY     // Catch: java.lang.NoSuchFieldError -> L24
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
            throw new UnsupportedOperationException("Method not decompiled: p099fc.AbstractC4798b.a.m44486clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/b$b.class
     */
    /* renamed from: fc.b$b */
    /* loaded from: combined.jar:classes2.jar:fc/b$b.class */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo24289a();

    /* renamed from: b */
    public final T m24290b() {
        this.f28260b = b.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean m24291c() {
        this.f28260b = b.FAILED;
        this.f28261c = mo24289a();
        if (this.f28260b == b.DONE) {
            return false;
        }
        this.f28260b = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C4708k.m23673o(this.f28260b != b.FAILED);
        int i10 = a.f28262a[this.f28260b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m24291c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f28260b = b.NOT_READY;
        T t10 = this.f28261c;
        this.f28261c = null;
        return t10;
    }
}
