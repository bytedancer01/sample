package ci;

import bi.InterfaceC0906d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5391j;
import p356uh.InterfaceC9200p;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;
import p448zh.C10238c;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/d.class
 */
/* renamed from: ci.d */
/* loaded from: combined.jar:classes2.jar:ci/d.class */
public final class C1118d implements InterfaceC0906d<C10238c> {

    /* renamed from: a */
    @NotNull
    public final CharSequence f7463a;

    /* renamed from: b */
    public final int f7464b;

    /* renamed from: c */
    public final int f7465c;

    /* renamed from: d */
    @NotNull
    public final InterfaceC9200p<CharSequence, Integer, C5391j<Integer, Integer>> f7466d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/d$a.class
     */
    /* renamed from: ci.d$a */
    /* loaded from: combined.jar:classes2.jar:ci/d$a.class */
    public static final class a implements Iterator<C10238c>, InterfaceC9591a {

        /* renamed from: b */
        public int f7467b = -1;

        /* renamed from: c */
        public int f7468c;

        /* renamed from: d */
        public int f7469d;

        /* renamed from: e */
        @Nullable
        public C10238c f7470e;

        /* renamed from: f */
        public int f7471f;

        /* renamed from: g */
        public final C1118d f7472g;

        public a(C1118d c1118d) {
            this.f7472g = c1118d;
            int m42838f = C10240e.m42838f(c1118d.f7464b, 0, c1118d.f7463a.length());
            this.f7468c = m42838f;
            this.f7469d = m42838f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        
            if (r0 < r5.f7472g.f7465c) goto L9;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m6701a() {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ci.C1118d.a.m6701a():void");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10238c next() {
            if (this.f7467b == -1) {
                m6701a();
            }
            if (this.f7467b == 0) {
                throw new NoSuchElementException();
            }
            C10238c c10238c = this.f7470e;
            if (c10238c == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.f7470e = null;
            this.f7467b = -1;
            return c10238c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7467b == -1) {
                m6701a();
            }
            boolean z10 = true;
            if (this.f7467b != 1) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1118d(@NotNull CharSequence charSequence, int i10, int i11, @NotNull InterfaceC9200p<? super CharSequence, ? super Integer, C5391j<Integer, Integer>> interfaceC9200p) {
        C9367f.m39526e(charSequence, "input");
        C9367f.m39526e(interfaceC9200p, "getNextMatch");
        this.f7463a = charSequence;
        this.f7464b = i10;
        this.f7465c = i11;
        this.f7466d = interfaceC9200p;
    }

    @Override // bi.InterfaceC0906d
    @NotNull
    public Iterator<C10238c> iterator() {
        return new a(this);
    }
}
