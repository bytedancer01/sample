package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.Serializable;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/q.class
 */
/* renamed from: androidx.navigation.q */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/q.class */
public abstract class AbstractC0637q<T> {

    /* renamed from: b */
    public static final AbstractC0637q<Integer> f4297b = new c(false);

    /* renamed from: c */
    public static final AbstractC0637q<Integer> f4298c = new d(false);

    /* renamed from: d */
    public static final AbstractC0637q<int[]> f4299d = new e(true);

    /* renamed from: e */
    public static final AbstractC0637q<Long> f4300e = new f(false);

    /* renamed from: f */
    public static final AbstractC0637q<long[]> f4301f = new g(true);

    /* renamed from: g */
    public static final AbstractC0637q<Float> f4302g = new h(false);

    /* renamed from: h */
    public static final AbstractC0637q<float[]> f4303h = new i(true);

    /* renamed from: i */
    public static final AbstractC0637q<Boolean> f4304i = new j(false);

    /* renamed from: j */
    public static final AbstractC0637q<boolean[]> f4305j = new k(true);

    /* renamed from: k */
    public static final AbstractC0637q<String> f4306k = new a(true);

    /* renamed from: l */
    public static final AbstractC0637q<String[]> f4307l = new b(true);

    /* renamed from: a */
    public final boolean f4308a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$a.class
     */
    /* renamed from: androidx.navigation.q$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$a.class */
    public class a extends AbstractC0637q<String> {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "string";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String mo3610b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String mo3649k(String str) {
            return str;
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$b.class
     */
    /* renamed from: androidx.navigation.q$b */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$b.class */
    public class b extends AbstractC0637q<String[]> {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "string[]";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] mo3610b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$c.class
     */
    /* renamed from: androidx.navigation.q$c */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$c.class */
    public class c extends AbstractC0637q<Integer> {
        public c(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "integer";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer mo3610b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer mo3649k(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$d.class
     */
    /* renamed from: androidx.navigation.q$d */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$d.class */
    public class d extends AbstractC0637q<Integer> {
        public d(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return Name.REFER;
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer mo3610b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer mo3649k(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$e.class
     */
    /* renamed from: androidx.navigation.q$e */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$e.class */
    public class e extends AbstractC0637q<int[]> {
        public e(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "integer[]";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] mo3610b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$f.class
     */
    /* renamed from: androidx.navigation.q$f */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$f.class */
    public class f extends AbstractC0637q<Long> {
        public f(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "long";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long mo3610b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long mo3649k(String str) {
            String str2 = str;
            if (str.endsWith("L")) {
                str2 = str.substring(0, str.length() - 1);
            }
            return Long.valueOf(str2.startsWith("0x") ? Long.parseLong(str2.substring(2), 16) : Long.parseLong(str2));
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, Long l10) {
            bundle.putLong(str, l10.longValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$g.class
     */
    /* renamed from: androidx.navigation.q$g */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$g.class */
    public class g extends AbstractC0637q<long[]> {
        public g(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "long[]";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] mo3610b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$h.class
     */
    /* renamed from: androidx.navigation.q$h */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$h.class */
    public class h extends AbstractC0637q<Float> {
        public h(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "float";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float mo3610b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float mo3649k(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, Float f10) {
            bundle.putFloat(str, f10.floatValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$i.class
     */
    /* renamed from: androidx.navigation.q$i */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$i.class */
    public class i extends AbstractC0637q<float[]> {
        public i(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "float[]";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] mo3610b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$j.class
     */
    /* renamed from: androidx.navigation.q$j */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$j.class */
    public class j extends AbstractC0637q<Boolean> {
        public j(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "boolean";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean mo3610b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean mo3649k(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$k.class
     */
    /* renamed from: androidx.navigation.q$k */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$k.class */
    public class k extends AbstractC0637q<boolean[]> {
        public k(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] mo3610b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$l.class
     */
    /* renamed from: androidx.navigation.q$l */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$l.class */
    public static final class l<D extends Enum> extends p<D> {

        /* renamed from: n */
        public final Class<D> f4309n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f4309n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.AbstractC0637q.p, androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return this.f4309n.getName();
        }

        @Override // androidx.navigation.AbstractC0637q.p
        /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D mo3649k(String str) {
            for (D d10 : this.f4309n.getEnumConstants()) {
                if (d10.name().equals(str)) {
                    return d10;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f4309n.getName() + InstructionFileId.DOT);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$m.class
     */
    /* renamed from: androidx.navigation.q$m */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$m.class */
    public static final class m<D extends Parcelable> extends AbstractC0637q<D[]> {

        /* renamed from: m */
        public final Class<D[]> f4310m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f4310m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return this.f4310m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f4310m.equals(((m) obj).f4310m);
        }

        public int hashCode() {
            return this.f4310m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] mo3610b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public D[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, D[] dArr) {
            this.f4310m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$n.class
     */
    /* renamed from: androidx.navigation.q$n */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$n.class */
    public static final class n<D> extends AbstractC0637q<D> {

        /* renamed from: m */
        public final Class<D> f4311m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f4311m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: b */
        public D mo3610b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return this.f4311m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f4311m.equals(((n) obj).f4311m);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: h */
        public D mo3649k(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f4311m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: i */
        public void mo3615i(Bundle bundle, String str, D d10) {
            this.f4311m.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$o.class
     */
    /* renamed from: androidx.navigation.q$o */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$o.class */
    public static final class o<D extends Serializable> extends AbstractC0637q<D[]> {

        /* renamed from: m */
        public final Class<D[]> f4312m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f4312m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return this.f4312m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f4312m.equals(((o) obj).f4312m);
        }

        public int hashCode() {
            return this.f4312m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] mo3610b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public D[] mo3649k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, D[] dArr) {
            this.f4312m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/q$p.class
     */
    /* renamed from: androidx.navigation.q$p */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/q$p.class */
    public static class p<D extends Serializable> extends AbstractC0637q<D> {

        /* renamed from: m */
        public final Class<D> f4313m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (!cls.isEnum()) {
                this.f4313m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
        }

        public p(boolean z10, Class<D> cls) {
            super(z10);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f4313m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: c */
        public String mo3611c() {
            return this.f4313m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f4313m.equals(((p) obj).f4313m);
            }
            return false;
        }

        public int hashCode() {
            return this.f4313m.hashCode();
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D mo3610b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: k */
        public D mo3649k(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.AbstractC0637q
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo3615i(Bundle bundle, String str, D d10) {
            this.f4313m.cast(d10);
            bundle.putSerializable(str, d10);
        }
    }

    public AbstractC0637q(boolean z10) {
        this.f4308a = z10;
    }

    /* renamed from: a */
    public static AbstractC0637q<?> m3607a(String str, String str2) {
        String str3;
        AbstractC0637q<Integer> abstractC0637q = f4297b;
        if (abstractC0637q.mo3611c().equals(str)) {
            return abstractC0637q;
        }
        AbstractC0637q abstractC0637q2 = f4299d;
        if (abstractC0637q2.mo3611c().equals(str)) {
            return abstractC0637q2;
        }
        AbstractC0637q<Long> abstractC0637q3 = f4300e;
        if (abstractC0637q3.mo3611c().equals(str)) {
            return abstractC0637q3;
        }
        AbstractC0637q abstractC0637q4 = f4301f;
        if (abstractC0637q4.mo3611c().equals(str)) {
            return abstractC0637q4;
        }
        AbstractC0637q<Boolean> abstractC0637q5 = f4304i;
        if (abstractC0637q5.mo3611c().equals(str)) {
            return abstractC0637q5;
        }
        AbstractC0637q abstractC0637q6 = f4305j;
        if (abstractC0637q6.mo3611c().equals(str)) {
            return abstractC0637q6;
        }
        AbstractC0637q<String> abstractC0637q7 = f4306k;
        if (abstractC0637q7.mo3611c().equals(str)) {
            return abstractC0637q7;
        }
        AbstractC0637q abstractC0637q8 = f4307l;
        if (abstractC0637q8.mo3611c().equals(str)) {
            return abstractC0637q8;
        }
        AbstractC0637q<Float> abstractC0637q9 = f4302g;
        if (abstractC0637q9.mo3611c().equals(str)) {
            return abstractC0637q9;
        }
        AbstractC0637q abstractC0637q10 = f4303h;
        if (abstractC0637q10.mo3611c().equals(str)) {
            return abstractC0637q10;
        }
        AbstractC0637q<Integer> abstractC0637q11 = f4298c;
        if (abstractC0637q11.mo3611c().equals(str)) {
            return abstractC0637q11;
        }
        if (str == null || str.isEmpty()) {
            return abstractC0637q7;
        }
        try {
            if (!str.startsWith(InstructionFileId.DOT) || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: d */
    public static AbstractC0637q m3608d(String str) {
        try {
            AbstractC0637q<Integer> abstractC0637q = f4297b;
            abstractC0637q.mo3649k(str);
            return abstractC0637q;
        } catch (IllegalArgumentException e10) {
            try {
                AbstractC0637q<Long> abstractC0637q2 = f4300e;
                abstractC0637q2.mo3649k(str);
                return abstractC0637q2;
            } catch (IllegalArgumentException e11) {
                try {
                    AbstractC0637q<Float> abstractC0637q3 = f4302g;
                    abstractC0637q3.mo3649k(str);
                    return abstractC0637q3;
                } catch (IllegalArgumentException e12) {
                    try {
                        AbstractC0637q<Boolean> abstractC0637q4 = f4304i;
                        abstractC0637q4.mo3649k(str);
                        return abstractC0637q4;
                    } catch (IllegalArgumentException e13) {
                        return f4306k;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static AbstractC0637q m3609e(Object obj) {
        if (obj instanceof Integer) {
            return f4297b;
        }
        if (obj instanceof int[]) {
            return f4299d;
        }
        if (obj instanceof Long) {
            return f4300e;
        }
        if (obj instanceof long[]) {
            return f4301f;
        }
        if (obj instanceof Float) {
            return f4302g;
        }
        if (obj instanceof float[]) {
            return f4303h;
        }
        if (obj instanceof Boolean) {
            return f4304i;
        }
        if (obj instanceof boolean[]) {
            return f4305j;
        }
        if ((obj instanceof String) || obj == null) {
            return f4306k;
        }
        if (obj instanceof String[]) {
            return f4307l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    /* renamed from: b */
    public abstract T mo3610b(Bundle bundle, String str);

    /* renamed from: c */
    public abstract String mo3611c();

    /* renamed from: f */
    public boolean m3612f() {
        return this.f4308a;
    }

    /* renamed from: g */
    public T m3613g(Bundle bundle, String str, String str2) {
        T mo3649k = mo3649k(str2);
        mo3615i(bundle, str, mo3649k);
        return mo3649k;
    }

    /* renamed from: h */
    public abstract T mo3649k(String str);

    /* renamed from: i */
    public abstract void mo3615i(Bundle bundle, String str, T t10);

    public String toString() {
        return mo3611c();
    }
}
