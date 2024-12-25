package ec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/m.class
 */
/* renamed from: ec.m */
/* loaded from: combined.jar:classes2.jar:ec/m.class */
public final class C4710m {

    /* renamed from: a */
    public final AbstractC4700c f27726a;

    /* renamed from: b */
    public final boolean f27727b;

    /* renamed from: c */
    public final c f27728c;

    /* renamed from: d */
    public final int f27729d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/m$a.class
     */
    /* renamed from: ec.m$a */
    /* loaded from: combined.jar:classes2.jar:ec/m$a.class */
    public static final class a implements c {

        /* renamed from: a */
        public final AbstractC4700c f27730a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ec/m$a$a.class
         */
        /* renamed from: ec.m$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ec/m$a$a.class */
        public class C10289a extends b {

            /* renamed from: i */
            public final a f27731i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10289a(a aVar, C4710m c4710m, CharSequence charSequence) {
                super(c4710m, charSequence);
                this.f27731i = aVar;
            }

            @Override // ec.C4710m.b
            /* renamed from: e */
            public int mo23685e(int i10) {
                return i10 + 1;
            }

            @Override // ec.C4710m.b
            /* renamed from: f */
            public int mo23686f(int i10) {
                return this.f27731i.f27730a.mo23645c(this.f27732d, i10);
            }
        }

        public a(AbstractC4700c abstractC4700c) {
            this.f27730a = abstractC4700c;
        }

        @Override // ec.C4710m.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo23683a(C4710m c4710m, CharSequence charSequence) {
            return new C10289a(this, c4710m, charSequence);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/m$b.class
     */
    /* renamed from: ec.m$b */
    /* loaded from: combined.jar:classes2.jar:ec/m$b.class */
    public static abstract class b extends AbstractC4698a<String> {

        /* renamed from: d */
        public final CharSequence f27732d;

        /* renamed from: e */
        public final AbstractC4700c f27733e;

        /* renamed from: f */
        public final boolean f27734f;

        /* renamed from: g */
        public int f27735g = 0;

        /* renamed from: h */
        public int f27736h;

        public b(C4710m c4710m, CharSequence charSequence) {
            this.f27733e = c4710m.f27726a;
            this.f27734f = c4710m.f27727b;
            this.f27736h = c4710m.f27729d;
            this.f27732d = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        
            r7 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        
            if (r8 >= r6) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        
            r7 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            if (r5.f27733e.mo23646e(r5.f27732d.charAt(r8)) == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        
            r8 = r8 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        
            if (r7 <= r8) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (r5.f27733e.mo23646e(r5.f27732d.charAt(r7 - 1)) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        
            r7 = r7 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        
            if (r5.f27734f == false) goto L43;
         */
        @Override // ec.AbstractC4698a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String mo23631a() {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ec.C4710m.b.mo23631a():java.lang.String");
        }

        /* renamed from: e */
        public abstract int mo23685e(int i10);

        /* renamed from: f */
        public abstract int mo23686f(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/m$c.class
     */
    /* renamed from: ec.m$c */
    /* loaded from: combined.jar:classes2.jar:ec/m$c.class */
    public interface c {
        /* renamed from: a */
        Iterator<String> mo23683a(C4710m c4710m, CharSequence charSequence);
    }

    public C4710m(c cVar) {
        this(cVar, false, AbstractC4700c.m23642f(), Integer.MAX_VALUE);
    }

    public C4710m(c cVar, boolean z10, AbstractC4700c abstractC4700c, int i10) {
        this.f27728c = cVar;
        this.f27727b = z10;
        this.f27726a = abstractC4700c;
        this.f27729d = i10;
    }

    /* renamed from: d */
    public static C4710m m23679d(char c10) {
        return m23680e(AbstractC4700c.m23641d(c10));
    }

    /* renamed from: e */
    public static C4710m m23680e(AbstractC4700c abstractC4700c) {
        C4708k.m23668j(abstractC4700c);
        return new C4710m(new a(abstractC4700c));
    }

    /* renamed from: f */
    public List<String> m23681f(CharSequence charSequence) {
        C4708k.m23668j(charSequence);
        Iterator<String> m23682g = m23682g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m23682g.hasNext()) {
            arrayList.add(m23682g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public final Iterator<String> m23682g(CharSequence charSequence) {
        return this.f27728c.mo23683a(this, charSequence);
    }
}
