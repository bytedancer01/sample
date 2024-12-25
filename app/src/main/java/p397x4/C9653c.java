package p397x4;

import java.io.Serializable;
import java.lang.ref.SoftReference;
import p023b5.C0801a;
import p023b5.C0802b;
import p055d5.C4304b;
import p397x4.AbstractC9654d;
import p397x4.AbstractC9656f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x4/c.class
 */
/* renamed from: x4.c */
/* loaded from: combined.jar:classes1.jar:x4/c.class */
public class C9653c implements Serializable {

    /* renamed from: i */
    public static final int f44042i = a.collectDefaults();

    /* renamed from: j */
    public static final int f44043j = AbstractC9656f.a.collectDefaults();

    /* renamed from: k */
    public static final int f44044k = AbstractC9654d.a.collectDefaults();

    /* renamed from: l */
    public static final InterfaceC9661k f44045l = C4304b.f26431f;

    /* renamed from: m */
    public static final ThreadLocal<SoftReference<Object>> f44046m = new ThreadLocal<>();

    /* renamed from: b */
    public final transient C0802b f44047b;

    /* renamed from: c */
    public final transient C0801a f44048c;

    /* renamed from: d */
    public AbstractC9659i f44049d;

    /* renamed from: e */
    public int f44050e;

    /* renamed from: f */
    public int f44051f;

    /* renamed from: g */
    public int f44052g;

    /* renamed from: h */
    public InterfaceC9661k f44053h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x4/c$a.class
     */
    /* renamed from: x4.c$a */
    /* loaded from: combined.jar:classes1.jar:x4/c$a.class */
    public enum a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        a(boolean z10) {
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            a[] values = values();
            int length = values.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i10 >= length) {
                    return i12;
                }
                a aVar = values[i10];
                int i13 = i12;
                if (aVar.enabledByDefault()) {
                    i13 = i12 | aVar.getMask();
                }
                i10++;
                i11 = i13;
            }
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            return (i10 & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public C9653c() {
        this(null);
    }

    public C9653c(AbstractC9659i abstractC9659i) {
        this.f44047b = C0802b.m5129b();
        this.f44048c = C0801a.m5119c();
        this.f44050e = f44042i;
        this.f44051f = f44043j;
        this.f44052g = f44044k;
        this.f44053h = f44045l;
        this.f44049d = abstractC9659i;
    }

    /* renamed from: a */
    public AbstractC9659i mo23274a() {
        return this.f44049d;
    }

    /* renamed from: b */
    public boolean m40586b() {
        return false;
    }

    /* renamed from: c */
    public C9653c m40587c(AbstractC9659i abstractC9659i) {
        this.f44049d = abstractC9659i;
        return this;
    }
}
