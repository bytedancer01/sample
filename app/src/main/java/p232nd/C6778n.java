package p232nd;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import md.C6566g;
import org.slf4j.Marker;
import p188kd.AbstractC5557j;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5554g;
import p188kd.C5558k;
import p188kd.C5559l;
import p188kd.C5560m;
import p188kd.C5562o;
import p188kd.C5565r;
import p188kd.InterfaceC5570w;
import p201ld.InterfaceC5841c;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/n.class
 */
/* renamed from: nd.n */
/* loaded from: combined.jar:classes2.jar:nd/n.class */
public final class C6778n {

    /* renamed from: A */
    public static final AbstractC5569v<BigInteger> f35310A;

    /* renamed from: B */
    public static final InterfaceC5570w f35311B;

    /* renamed from: C */
    public static final AbstractC5569v<StringBuilder> f35312C;

    /* renamed from: D */
    public static final InterfaceC5570w f35313D;

    /* renamed from: E */
    public static final AbstractC5569v<StringBuffer> f35314E;

    /* renamed from: F */
    public static final InterfaceC5570w f35315F;

    /* renamed from: G */
    public static final AbstractC5569v<URL> f35316G;

    /* renamed from: H */
    public static final InterfaceC5570w f35317H;

    /* renamed from: I */
    public static final AbstractC5569v<URI> f35318I;

    /* renamed from: J */
    public static final InterfaceC5570w f35319J;

    /* renamed from: K */
    public static final AbstractC5569v<InetAddress> f35320K;

    /* renamed from: L */
    public static final InterfaceC5570w f35321L;

    /* renamed from: M */
    public static final AbstractC5569v<UUID> f35322M;

    /* renamed from: N */
    public static final InterfaceC5570w f35323N;

    /* renamed from: O */
    public static final AbstractC5569v<Currency> f35324O;

    /* renamed from: P */
    public static final InterfaceC5570w f35325P;

    /* renamed from: Q */
    public static final AbstractC5569v<Calendar> f35326Q;

    /* renamed from: R */
    public static final InterfaceC5570w f35327R;

    /* renamed from: S */
    public static final AbstractC5569v<Locale> f35328S;

    /* renamed from: T */
    public static final InterfaceC5570w f35329T;

    /* renamed from: U */
    public static final AbstractC5569v<AbstractC5557j> f35330U;

    /* renamed from: V */
    public static final InterfaceC5570w f35331V;

    /* renamed from: W */
    public static final InterfaceC5570w f35332W;

    /* renamed from: a */
    public static final AbstractC5569v<Class> f35333a;

    /* renamed from: b */
    public static final InterfaceC5570w f35334b;

    /* renamed from: c */
    public static final AbstractC5569v<BitSet> f35335c;

    /* renamed from: d */
    public static final InterfaceC5570w f35336d;

    /* renamed from: e */
    public static final AbstractC5569v<Boolean> f35337e;

    /* renamed from: f */
    public static final AbstractC5569v<Boolean> f35338f;

    /* renamed from: g */
    public static final InterfaceC5570w f35339g;

    /* renamed from: h */
    public static final AbstractC5569v<Number> f35340h;

    /* renamed from: i */
    public static final InterfaceC5570w f35341i;

    /* renamed from: j */
    public static final AbstractC5569v<Number> f35342j;

    /* renamed from: k */
    public static final InterfaceC5570w f35343k;

    /* renamed from: l */
    public static final AbstractC5569v<Number> f35344l;

    /* renamed from: m */
    public static final InterfaceC5570w f35345m;

    /* renamed from: n */
    public static final AbstractC5569v<AtomicInteger> f35346n;

    /* renamed from: o */
    public static final InterfaceC5570w f35347o;

    /* renamed from: p */
    public static final AbstractC5569v<AtomicBoolean> f35348p;

    /* renamed from: q */
    public static final InterfaceC5570w f35349q;

    /* renamed from: r */
    public static final AbstractC5569v<AtomicIntegerArray> f35350r;

    /* renamed from: s */
    public static final InterfaceC5570w f35351s;

    /* renamed from: t */
    public static final AbstractC5569v<Number> f35352t;

    /* renamed from: u */
    public static final AbstractC5569v<Number> f35353u;

    /* renamed from: v */
    public static final AbstractC5569v<Number> f35354v;

    /* renamed from: w */
    public static final AbstractC5569v<Character> f35355w;

    /* renamed from: x */
    public static final InterfaceC5570w f35356x;

    /* renamed from: y */
    public static final AbstractC5569v<String> f35357y;

    /* renamed from: z */
    public static final AbstractC5569v<BigDecimal> f35358z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$a.class
     */
    /* renamed from: nd.n$a */
    /* loaded from: combined.jar:classes2.jar:nd/n$a.class */
    public class a extends AbstractC5569v<AtomicIntegerArray> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo27561b(C8555a c8555a) {
            ArrayList arrayList = new ArrayList();
            c8555a.mo31113f();
            while (c8555a.mo31118y()) {
                try {
                    arrayList.add(Integer.valueOf(c8555a.mo31100B0()));
                } catch (NumberFormatException e10) {
                    throw new C5565r(e10);
                }
            }
            c8555a.mo31115t();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, AtomicIntegerArray atomicIntegerArray) {
            c8557c.mo31128o();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                c8557c.mo31120K0(atomicIntegerArray.get(i10));
            }
            c8557c.mo31131t();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$a0.class
     */
    /* renamed from: nd.n$a0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$a0.class */
    public class a0 extends AbstractC5569v<Boolean> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo27561b(C8555a c8555a) {
            EnumC8556b mo31105J0 = c8555a.mo31105J0();
            if (mo31105J0 != EnumC8556b.NULL) {
                return mo31105J0 == EnumC8556b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c8555a.mo31104H0())) : Boolean.valueOf(c8555a.mo31117v0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Boolean bool) {
            c8557c.mo31121L0(bool);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$b.class
     */
    /* renamed from: nd.n$b */
    /* loaded from: combined.jar:classes2.jar:nd/n$b.class */
    public class b extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return Long.valueOf(c8555a.mo31101C0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            c8557c.mo31122M0(number);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$b0.class
     */
    /* renamed from: nd.n$b0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$b0.class */
    public class b0 extends AbstractC5569v<Boolean> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return Boolean.valueOf(c8555a.mo31104H0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Boolean bool) {
            c8557c.mo31123N0(bool == null ? "null" : bool.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$c.class
     */
    /* renamed from: nd.n$c */
    /* loaded from: combined.jar:classes2.jar:nd/n$c.class */
    public class c extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return Float.valueOf((float) c8555a.mo31099A0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            c8557c.mo31122M0(number);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$c0.class
     */
    /* renamed from: nd.n$c0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$c0.class */
    public class c0 extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return Byte.valueOf((byte) c8555a.mo31100B0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            c8557c.mo31122M0(number);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$d.class
     */
    /* renamed from: nd.n$d */
    /* loaded from: combined.jar:classes2.jar:nd/n$d.class */
    public class d extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return Double.valueOf(c8555a.mo31099A0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            c8557c.mo31122M0(number);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$d0.class
     */
    /* renamed from: nd.n$d0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$d0.class */
    public class d0 extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return Short.valueOf((short) c8555a.mo31100B0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            c8557c.mo31122M0(number);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$e.class
     */
    /* renamed from: nd.n$e */
    /* loaded from: combined.jar:classes2.jar:nd/n$e.class */
    public class e extends AbstractC5569v<Character> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            String mo31104H0 = c8555a.mo31104H0();
            if (mo31104H0.length() == 1) {
                return Character.valueOf(mo31104H0.charAt(0));
            }
            throw new C5565r("Expecting character, got: " + mo31104H0);
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Character ch2) {
            c8557c.mo31123N0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$e0.class
     */
    /* renamed from: nd.n$e0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$e0.class */
    public class e0 extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return Integer.valueOf(c8555a.mo31100B0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            c8557c.mo31122M0(number);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$f.class
     */
    /* renamed from: nd.n$f */
    /* loaded from: combined.jar:classes2.jar:nd/n$f.class */
    public class f extends AbstractC5569v<String> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String mo27561b(C8555a c8555a) {
            EnumC8556b mo31105J0 = c8555a.mo31105J0();
            if (mo31105J0 != EnumC8556b.NULL) {
                return mo31105J0 == EnumC8556b.BOOLEAN ? Boolean.toString(c8555a.mo31117v0()) : c8555a.mo31104H0();
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, String str) {
            c8557c.mo31123N0(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$f0.class
     */
    /* renamed from: nd.n$f0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$f0.class */
    public class f0 extends AbstractC5569v<AtomicInteger> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo27561b(C8555a c8555a) {
            try {
                return new AtomicInteger(c8555a.mo31100B0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, AtomicInteger atomicInteger) {
            c8557c.mo31120K0(atomicInteger.get());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$g.class
     */
    /* renamed from: nd.n$g */
    /* loaded from: combined.jar:classes2.jar:nd/n$g.class */
    public class g extends AbstractC5569v<BigDecimal> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return new BigDecimal(c8555a.mo31104H0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, BigDecimal bigDecimal) {
            c8557c.mo31122M0(bigDecimal);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$g0.class
     */
    /* renamed from: nd.n$g0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$g0.class */
    public class g0 extends AbstractC5569v<AtomicBoolean> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo27561b(C8555a c8555a) {
            return new AtomicBoolean(c8555a.mo31117v0());
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, AtomicBoolean atomicBoolean) {
            c8557c.mo31124O0(atomicBoolean.get());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$h.class
     */
    /* renamed from: nd.n$h */
    /* loaded from: combined.jar:classes2.jar:nd/n$h.class */
    public class h extends AbstractC5569v<BigInteger> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return new BigInteger(c8555a.mo31104H0());
            } catch (NumberFormatException e10) {
                throw new C5565r(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, BigInteger bigInteger) {
            c8557c.mo31122M0(bigInteger);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$h0.class
     */
    /* renamed from: nd.n$h0 */
    /* loaded from: combined.jar:classes2.jar:nd/n$h0.class */
    public static final class h0<T extends Enum<T>> extends AbstractC5569v<T> {

        /* renamed from: a */
        public final Map<String, T> f35359a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f35360b = new HashMap();

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:nd/n$h0$a.class
         */
        /* renamed from: nd.n$h0$a */
        /* loaded from: combined.jar:classes2.jar:nd/n$h0$a.class */
        public class a implements PrivilegedAction<Void> {

            /* renamed from: a */
            public final Field f35361a;

            /* renamed from: b */
            public final h0 f35362b;

            public a(h0 h0Var, Field field) {
                this.f35362b = h0Var;
                this.f35361a = field;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void run() {
                this.f35361a.setAccessible(true);
                return null;
            }
        }

        public h0(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(this, field));
                        Enum r02 = (Enum) field.get(null);
                        String name = r02.name();
                        InterfaceC5841c interfaceC5841c = (InterfaceC5841c) field.getAnnotation(InterfaceC5841c.class);
                        if (interfaceC5841c != null) {
                            String value = interfaceC5841c.value();
                            String[] alternate = interfaceC5841c.alternate();
                            int length = alternate.length;
                            int i10 = 0;
                            while (true) {
                                name = value;
                                if (i10 >= length) {
                                    break;
                                }
                                this.f35359a.put(alternate[i10], r02);
                                i10++;
                            }
                        }
                        this.f35359a.put(name, r02);
                        this.f35360b.put(r02, name);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return this.f35359a.get(c8555a.mo31104H0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, T t10) {
            c8557c.mo31123N0(t10 == null ? null : this.f35360b.get(t10));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$i.class
     */
    /* renamed from: nd.n$i */
    /* loaded from: combined.jar:classes2.jar:nd/n$i.class */
    public class i extends AbstractC5569v<StringBuilder> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return new StringBuilder(c8555a.mo31104H0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, StringBuilder sb2) {
            c8557c.mo31123N0(sb2 == null ? null : sb2.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$j.class
     */
    /* renamed from: nd.n$j */
    /* loaded from: combined.jar:classes2.jar:nd/n$j.class */
    public class j extends AbstractC5569v<StringBuffer> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return new StringBuffer(c8555a.mo31104H0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, StringBuffer stringBuffer) {
            c8557c.mo31123N0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$k.class
     */
    /* renamed from: nd.n$k */
    /* loaded from: combined.jar:classes2.jar:nd/n$k.class */
    public class k extends AbstractC5569v<Class> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class mo27561b(C8555a c8555a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$l.class
     */
    /* renamed from: nd.n$l */
    /* loaded from: combined.jar:classes2.jar:nd/n$l.class */
    public class l extends AbstractC5569v<URL> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            String mo31104H0 = c8555a.mo31104H0();
            return "null".equals(mo31104H0) ? null : new URL(mo31104H0);
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, URL url) {
            c8557c.mo31123N0(url == null ? null : url.toExternalForm());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$m.class
     */
    /* renamed from: nd.n$m */
    /* loaded from: combined.jar:classes2.jar:nd/n$m.class */
    public class m extends AbstractC5569v<URI> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                String mo31104H0 = c8555a.mo31104H0();
                return "null".equals(mo31104H0) ? null : new URI(mo31104H0);
            } catch (URISyntaxException e10) {
                throw new C5558k(e10);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, URI uri) {
            c8557c.mo31123N0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$n.class
     */
    /* renamed from: nd.n$n */
    /* loaded from: combined.jar:classes2.jar:nd/n$n.class */
    public class n extends AbstractC5569v<InetAddress> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return InetAddress.getByName(c8555a.mo31104H0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, InetAddress inetAddress) {
            c8557c.mo31123N0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$o.class
     */
    /* renamed from: nd.n$o */
    /* loaded from: combined.jar:classes2.jar:nd/n$o.class */
    public class o extends AbstractC5569v<UUID> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return UUID.fromString(c8555a.mo31104H0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, UUID uuid) {
            c8557c.mo31123N0(uuid == null ? null : uuid.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$p.class
     */
    /* renamed from: nd.n$p */
    /* loaded from: combined.jar:classes2.jar:nd/n$p.class */
    public class p extends AbstractC5569v<Currency> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency mo27561b(C8555a c8555a) {
            return Currency.getInstance(c8555a.mo31104H0());
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Currency currency) {
            c8557c.mo31123N0(currency.getCurrencyCode());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$q.class
     */
    /* renamed from: nd.n$q */
    /* loaded from: combined.jar:classes2.jar:nd/n$q.class */
    public class q extends AbstractC5569v<Calendar> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            c8555a.mo31114l();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (c8555a.mo31105J0() != EnumC8556b.END_OBJECT) {
                String mo31102D0 = c8555a.mo31102D0();
                int mo31100B0 = c8555a.mo31100B0();
                if ("year".equals(mo31102D0)) {
                    i10 = mo31100B0;
                } else if ("month".equals(mo31102D0)) {
                    i11 = mo31100B0;
                } else if ("dayOfMonth".equals(mo31102D0)) {
                    i12 = mo31100B0;
                } else if ("hourOfDay".equals(mo31102D0)) {
                    i13 = mo31100B0;
                } else if ("minute".equals(mo31102D0)) {
                    i14 = mo31100B0;
                } else if ("second".equals(mo31102D0)) {
                    i15 = mo31100B0;
                }
            }
            c8555a.mo31116v();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Calendar calendar) {
            if (calendar == null) {
                c8557c.mo31133v0();
                return;
            }
            c8557c.mo31130p();
            c8557c.mo31129o0("year");
            c8557c.mo31120K0(calendar.get(1));
            c8557c.mo31129o0("month");
            c8557c.mo31120K0(calendar.get(2));
            c8557c.mo31129o0("dayOfMonth");
            c8557c.mo31120K0(calendar.get(5));
            c8557c.mo31129o0("hourOfDay");
            c8557c.mo31120K0(calendar.get(11));
            c8557c.mo31129o0("minute");
            c8557c.mo31120K0(calendar.get(12));
            c8557c.mo31129o0("second");
            c8557c.mo31120K0(calendar.get(13));
            c8557c.mo31132v();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$r.class
     */
    /* renamed from: nd.n$r */
    /* loaded from: combined.jar:classes2.jar:nd/n$r.class */
    public class r extends AbstractC5569v<Locale> {
        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.util.Locale mo27561b(
        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            */

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Locale locale) {
            c8557c.mo31123N0(locale == null ? null : locale.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$s.class
     */
    /* renamed from: nd.n$s */
    /* loaded from: combined.jar:classes2.jar:nd/n$s.class */
    public class s extends AbstractC5569v<AbstractC5557j> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC5557j mo27561b(C8555a c8555a) {
            if (c8555a instanceof C6770f) {
                return ((C6770f) c8555a).m31108W0();
            }
            switch (z.f35375a[c8555a.mo31105J0().ordinal()]) {
                case 1:
                    return new C5562o(new C6566g(c8555a.mo31104H0()));
                case 2:
                    return new C5562o(Boolean.valueOf(c8555a.mo31117v0()));
                case 3:
                    return new C5562o(c8555a.mo31104H0());
                case 4:
                    c8555a.mo31103F0();
                    return C5559l.f31648b;
                case 5:
                    C5554g c5554g = new C5554g();
                    c8555a.mo31113f();
                    while (c8555a.mo31118y()) {
                        c5554g.m27576x(mo27561b(c8555a));
                    }
                    c8555a.mo31115t();
                    return c5554g;
                case 6:
                    C5560m c5560m = new C5560m();
                    c8555a.mo31114l();
                    while (c8555a.mo31118y()) {
                        c5560m.m27585x(c8555a.mo31102D0(), mo27561b(c8555a));
                    }
                    c8555a.mo31116v();
                    return c5560m;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, AbstractC5557j abstractC5557j) {
            if (abstractC5557j == null || abstractC5557j.m27581t()) {
                c8557c.mo31133v0();
                return;
            }
            if (abstractC5557j.m27583w()) {
                C5562o m27579g = abstractC5557j.m27579g();
                if (m27579g.m27592G()) {
                    c8557c.mo31122M0(m27579g.m27590D());
                    return;
                } else if (m27579g.m27591E()) {
                    c8557c.mo31124O0(m27579g.m27594x());
                    return;
                } else {
                    c8557c.mo31123N0(m27579g.mo27575i());
                    return;
                }
            }
            if (abstractC5557j.m27580q()) {
                c8557c.mo31128o();
                Iterator<AbstractC5557j> it = abstractC5557j.m27577d().iterator();
                while (it.hasNext()) {
                    mo27562d(c8557c, it.next());
                }
                c8557c.mo31131t();
                return;
            }
            if (!abstractC5557j.m27582v()) {
                throw new IllegalArgumentException("Couldn't write " + abstractC5557j.getClass());
            }
            c8557c.mo31130p();
            for (Map.Entry<String, AbstractC5557j> entry : abstractC5557j.m27578f().m27584A()) {
                c8557c.mo31129o0(entry.getKey());
                mo27562d(c8557c, entry.getValue());
            }
            c8557c.mo31132v();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$t.class
     */
    /* renamed from: nd.n$t */
    /* loaded from: combined.jar:classes2.jar:nd/n$t.class */
    public class t implements InterfaceC5570w {
        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            Class<? super T> m36351c = c8462a.m36351c();
            if (!Enum.class.isAssignableFrom(m36351c) || m36351c == Enum.class) {
                return null;
            }
            Class<? super T> cls = m36351c;
            if (!m36351c.isEnum()) {
                cls = m36351c.getSuperclass();
            }
            return new h0(cls);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$u.class
     */
    /* renamed from: nd.n$u */
    /* loaded from: combined.jar:classes2.jar:nd/n$u.class */
    public class u extends AbstractC5569v<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (java.lang.Integer.parseInt(r0) != 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            r8 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        
            if (r5.mo31100B0() != 0) goto L24;
         */
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet mo27561b(sd.C8555a r5) {
            /*
                r4 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r1 = r0
                r1.<init>()
                r10 = r0
                r0 = r5
                r0.mo31113f()
                r0 = r5
                sd.b r0 = r0.mo31105J0()
                r9 = r0
                r0 = 0
                r6 = r0
            L15:
                r0 = r9
                sd.b r1 = sd.EnumC8556b.END_ARRAY
                if (r0 == r1) goto Lbe
                int[] r0 = p232nd.C6778n.z.f35375a
                r1 = r9
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r7 = r0
                r0 = 1
                r8 = r0
                r0 = r7
                r1 = 1
                if (r0 == r1) goto La0
                r0 = r7
                r1 = 2
                if (r0 == r1) goto L97
                r0 = r7
                r1 = 3
                if (r0 != r1) goto L75
                r0 = r5
                java.lang.String r0 = r0.mo31104H0()
                r9 = r0
                r0 = r9
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L52
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L4c
                goto La7
            L4c:
                r0 = 0
                r8 = r0
                goto La7
            L52:
                r5 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r9
                java.lang.StringBuilder r0 = r0.append(r1)
                kd.r r0 = new kd.r
                r1 = r0
                r2 = r5
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L75:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                java.lang.String r1 = "Invalid bitset value type: "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r9
                java.lang.StringBuilder r0 = r0.append(r1)
                kd.r r0 = new kd.r
                r1 = r0
                r2 = r5
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L97:
                r0 = r5
                boolean r0 = r0.mo31117v0()
                r8 = r0
                goto La7
            La0:
                r0 = r5
                int r0 = r0.mo31100B0()
                if (r0 == 0) goto L4c
            La7:
                r0 = r8
                if (r0 == 0) goto Lb2
                r0 = r10
                r1 = r6
                r0.set(r1)
            Lb2:
                int r6 = r6 + 1
                r0 = r5
                sd.b r0 = r0.mo31105J0()
                r9 = r0
                goto L15
            Lbe:
                r0 = r5
                r0.mo31115t()
                r0 = r10
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p232nd.C6778n.u.mo27561b(sd.a):java.util.BitSet");
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, BitSet bitSet) {
            c8557c.mo31128o();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                c8557c.mo31120K0(bitSet.get(i10) ? 1L : 0L);
            }
            c8557c.mo31131t();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$v.class
     */
    /* renamed from: nd.n$v */
    /* loaded from: combined.jar:classes2.jar:nd/n$v.class */
    public class v implements InterfaceC5570w {

        /* renamed from: b */
        public final Class f35363b;

        /* renamed from: c */
        public final AbstractC5569v f35364c;

        public v(Class cls, AbstractC5569v abstractC5569v) {
            this.f35363b = cls;
            this.f35364c = abstractC5569v;
        }

        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            return c8462a.m36351c() == this.f35363b ? this.f35364c : null;
        }

        public String toString() {
            return "Factory[type=" + this.f35363b.getName() + ",adapter=" + this.f35364c + "]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$w.class
     */
    /* renamed from: nd.n$w */
    /* loaded from: combined.jar:classes2.jar:nd/n$w.class */
    public class w implements InterfaceC5570w {

        /* renamed from: b */
        public final Class f35365b;

        /* renamed from: c */
        public final Class f35366c;

        /* renamed from: d */
        public final AbstractC5569v f35367d;

        public w(Class cls, Class cls2, AbstractC5569v abstractC5569v) {
            this.f35365b = cls;
            this.f35366c = cls2;
            this.f35367d = abstractC5569v;
        }

        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            Class<? super T> m36351c = c8462a.m36351c();
            return (m36351c == this.f35365b || m36351c == this.f35366c) ? this.f35367d : null;
        }

        public String toString() {
            return "Factory[type=" + this.f35366c.getName() + Marker.ANY_NON_NULL_MARKER + this.f35365b.getName() + ",adapter=" + this.f35367d + "]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$x.class
     */
    /* renamed from: nd.n$x */
    /* loaded from: combined.jar:classes2.jar:nd/n$x.class */
    public class x implements InterfaceC5570w {

        /* renamed from: b */
        public final Class f35368b;

        /* renamed from: c */
        public final Class f35369c;

        /* renamed from: d */
        public final AbstractC5569v f35370d;

        public x(Class cls, Class cls2, AbstractC5569v abstractC5569v) {
            this.f35368b = cls;
            this.f35369c = cls2;
            this.f35370d = abstractC5569v;
        }

        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            Class<? super T> m36351c = c8462a.m36351c();
            return (m36351c == this.f35368b || m36351c == this.f35369c) ? this.f35370d : null;
        }

        public String toString() {
            return "Factory[type=" + this.f35368b.getName() + Marker.ANY_NON_NULL_MARKER + this.f35369c.getName() + ",adapter=" + this.f35370d + "]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$y.class
     */
    /* renamed from: nd.n$y */
    /* loaded from: combined.jar:classes2.jar:nd/n$y.class */
    public class y implements InterfaceC5570w {

        /* renamed from: b */
        public final Class f35371b;

        /* renamed from: c */
        public final AbstractC5569v f35372c;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:nd/n$y$a.class
         */
        /* renamed from: nd.n$y$a */
        /* loaded from: combined.jar:classes2.jar:nd/n$y$a.class */
        public class a<T1> extends AbstractC5569v<T1> {

            /* renamed from: a */
            public final Class f35373a;

            /* renamed from: b */
            public final y f35374b;

            public a(y yVar, Class cls) {
                this.f35374b = yVar;
                this.f35373a = cls;
            }

            @Override // p188kd.AbstractC5569v
            /* renamed from: b */
            public T1 mo27561b(C8555a c8555a) {
                T1 t12 = (T1) this.f35374b.f35372c.mo27561b(c8555a);
                if (t12 == null || this.f35373a.isInstance(t12)) {
                    return t12;
                }
                throw new C5565r("Expected a " + this.f35373a.getName() + " but was " + t12.getClass().getName());
            }

            @Override // p188kd.AbstractC5569v
            /* renamed from: d */
            public void mo27562d(C8557c c8557c, T1 t12) {
                this.f35374b.f35372c.mo27562d(c8557c, t12);
            }
        }

        public y(Class cls, AbstractC5569v abstractC5569v) {
            this.f35371b = cls;
            this.f35372c = abstractC5569v;
        }

        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T2> AbstractC5569v<T2> mo27598a(C5552e c5552e, C8462a<T2> c8462a) {
            Class<? super T2> m36351c = c8462a.m36351c();
            if (this.f35371b.isAssignableFrom(m36351c)) {
                return new a(this, m36351c);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f35371b.getName() + ",adapter=" + this.f35372c + "]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/n$z.class
     */
    /* renamed from: nd.n$z */
    /* loaded from: combined.jar:classes2.jar:nd/n$z.class */
    public static /* synthetic */ class z {

        /* renamed from: a */
        public static final int[] f35375a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:64:0x009d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                sd.b[] r0 = sd.EnumC8556b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p232nd.C6778n.z.f35375a = r0
                r0 = r4
                sd.b r1 = sd.EnumC8556b.NUMBER     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L14:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                sd.b r1 = sd.EnumC8556b.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L1f:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L81 java.lang.NoSuchFieldError -> L85
                sd.b r1 = sd.EnumC8556b.STRING     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L2a:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L85 java.lang.NoSuchFieldError -> L89
                sd.b r1 = sd.EnumC8556b.NULL     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
            L35:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L89 java.lang.NoSuchFieldError -> L8d
                sd.b r1 = sd.EnumC8556b.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
            L40:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L8d java.lang.NoSuchFieldError -> L91
                sd.b r1 = sd.EnumC8556b.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L91
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L91
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L91
            L4c:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L91 java.lang.NoSuchFieldError -> L95
                sd.b r1 = sd.EnumC8556b.END_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L95
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L95
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L95
            L58:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L95 java.lang.NoSuchFieldError -> L99
                sd.b r1 = sd.EnumC8556b.NAME     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L64:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                sd.b r1 = sd.EnumC8556b.END_OBJECT     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L70:
                int[] r0 = p232nd.C6778n.z.f35375a     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                sd.b r1 = sd.EnumC8556b.END_ARRAY     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L7c:
                return
            L7d:
                r4 = move-exception
                goto L14
            L81:
                r4 = move-exception
                goto L1f
            L85:
                r4 = move-exception
                goto L2a
            L89:
                r4 = move-exception
                goto L35
            L8d:
                r4 = move-exception
                goto L40
            L91:
                r4 = move-exception
                goto L4c
            L95:
                r4 = move-exception
                goto L58
            L99:
                r4 = move-exception
                goto L64
            L9d:
                r4 = move-exception
                goto L70
            La1:
                r4 = move-exception
                goto L7c
            */
            throw new UnsupportedOperationException("Method not decompiled: p232nd.C6778n.z.m45123clinit():void");
        }
    }

    static {
        AbstractC5569v<Class> m27596a = new k().m27596a();
        f35333a = m27596a;
        f35334b = m31155b(Class.class, m27596a);
        AbstractC5569v<BitSet> m27596a2 = new u().m27596a();
        f35335c = m27596a2;
        f35336d = m31155b(BitSet.class, m27596a2);
        a0 a0Var = new a0();
        f35337e = a0Var;
        f35338f = new b0();
        f35339g = m31154a(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f35340h = c0Var;
        f35341i = m31154a(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f35342j = d0Var;
        f35343k = m31154a(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        f35344l = e0Var;
        f35345m = m31154a(Integer.TYPE, Integer.class, e0Var);
        AbstractC5569v<AtomicInteger> m27596a3 = new f0().m27596a();
        f35346n = m27596a3;
        f35347o = m31155b(AtomicInteger.class, m27596a3);
        AbstractC5569v<AtomicBoolean> m27596a4 = new g0().m27596a();
        f35348p = m27596a4;
        f35349q = m31155b(AtomicBoolean.class, m27596a4);
        AbstractC5569v<AtomicIntegerArray> m27596a5 = new a().m27596a();
        f35350r = m27596a5;
        f35351s = m31155b(AtomicIntegerArray.class, m27596a5);
        f35352t = new b();
        f35353u = new c();
        f35354v = new d();
        e eVar = new e();
        f35355w = eVar;
        f35356x = m31154a(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f35357y = fVar;
        f35358z = new g();
        f35310A = new h();
        f35311B = m31155b(String.class, fVar);
        i iVar = new i();
        f35312C = iVar;
        f35313D = m31155b(StringBuilder.class, iVar);
        j jVar = new j();
        f35314E = jVar;
        f35315F = m31155b(StringBuffer.class, jVar);
        l lVar = new l();
        f35316G = lVar;
        f35317H = m31155b(URL.class, lVar);
        m mVar = new m();
        f35318I = mVar;
        f35319J = m31155b(URI.class, mVar);
        n nVar = new n();
        f35320K = nVar;
        f35321L = m31157d(InetAddress.class, nVar);
        o oVar = new o();
        f35322M = oVar;
        f35323N = m31155b(UUID.class, oVar);
        AbstractC5569v<Currency> m27596a6 = new p().m27596a();
        f35324O = m27596a6;
        f35325P = m31155b(Currency.class, m27596a6);
        q qVar = new q();
        f35326Q = qVar;
        f35327R = m31156c(Calendar.class, GregorianCalendar.class, qVar);
        r rVar = new r();
        f35328S = rVar;
        f35329T = m31155b(Locale.class, rVar);
        s sVar = new s();
        f35330U = sVar;
        f35331V = m31157d(AbstractC5557j.class, sVar);
        f35332W = new t();
    }

    /* renamed from: a */
    public static <TT> InterfaceC5570w m31154a(Class<TT> cls, Class<TT> cls2, AbstractC5569v<? super TT> abstractC5569v) {
        return new w(cls, cls2, abstractC5569v);
    }

    /* renamed from: b */
    public static <TT> InterfaceC5570w m31155b(Class<TT> cls, AbstractC5569v<TT> abstractC5569v) {
        return new v(cls, abstractC5569v);
    }

    /* renamed from: c */
    public static <TT> InterfaceC5570w m31156c(Class<TT> cls, Class<? extends TT> cls2, AbstractC5569v<? super TT> abstractC5569v) {
        return new x(cls, cls2, abstractC5569v);
    }

    /* renamed from: d */
    public static <T1> InterfaceC5570w m31157d(Class<T1> cls, AbstractC5569v<T1> abstractC5569v) {
        return new y(cls, abstractC5569v);
    }
}
