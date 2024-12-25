package p421y8;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p009a8.C0083a1;
import p009a8.C0134z0;
import p009a8.InterfaceC0127w;
import p059d9.C4349a;
import p059d9.C4401z0;
import p099fc.AbstractC4817k0;
import p099fc.AbstractC4822n;
import p168jc.C5354c;
import p267p6.AbstractC7574e2;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p267p6.C7636y1;
import p421y8.AbstractC9886j;
import p421y8.C9877a;
import p421y8.C9889m;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/f.class
 */
/* renamed from: y8.f */
/* loaded from: combined.jar:classes2.jar:y8/f.class */
public class C9882f extends AbstractC9886j {

    /* renamed from: f */
    public static final int[] f45376f = new int[0];

    /* renamed from: g */
    public static final AbstractC4817k0<Integer> f45377g = AbstractC4817k0.m24408a(new Comparator() { // from class: y8.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m41637z;
            m41637z = C9882f.m41637z((Integer) obj, (Integer) obj2);
            return m41637z;
        }
    });

    /* renamed from: h */
    public static final AbstractC4817k0<Integer> f45378h = AbstractC4817k0.m24408a(new Comparator() { // from class: y8.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m41617A;
            m41617A = C9882f.m41617A((Integer) obj, (Integer) obj2);
            return m41617A;
        }
    });

    /* renamed from: d */
    public final InterfaceC9884h.b f45379d;

    /* renamed from: e */
    public final AtomicReference<d> f45380e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$b.class
     */
    /* renamed from: y8.f$b */
    /* loaded from: combined.jar:classes2.jar:y8/f$b.class */
    public static final class b implements Comparable<b> {

        /* renamed from: b */
        public final boolean f45381b;

        /* renamed from: c */
        public final String f45382c;

        /* renamed from: d */
        public final d f45383d;

        /* renamed from: e */
        public final boolean f45384e;

        /* renamed from: f */
        public final int f45385f;

        /* renamed from: g */
        public final int f45386g;

        /* renamed from: h */
        public final int f45387h;

        /* renamed from: i */
        public final int f45388i;

        /* renamed from: j */
        public final int f45389j;

        /* renamed from: k */
        public final boolean f45390k;

        /* renamed from: l */
        public final int f45391l;

        /* renamed from: m */
        public final int f45392m;

        /* renamed from: n */
        public final int f45393n;

        /* renamed from: o */
        public final int f45394o;

        /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x015c A[EDGE_INSN: B:39:0x015c->B:33:0x015c BREAK  A[LOOP:2: B:25:0x0124->B:37:0x0156], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0110 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(p267p6.C7629w0 r5, p421y8.C9882f.d r6, int r7) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.b.<init>(p6.w0, y8.f$d, int):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            AbstractC4817k0 mo24396f = (this.f45381b && this.f45384e) ? C9882f.f45377g : C9882f.f45377g.mo24396f();
            AbstractC4822n mo24462f = AbstractC4822n.m24459j().mo24463g(this.f45384e, bVar.f45384e).mo24462f(Integer.valueOf(this.f45386g), Integer.valueOf(bVar.f45386g), AbstractC4817k0.m24409c().mo24396f()).mo24460d(this.f45385f, bVar.f45385f).mo24460d(this.f45387h, bVar.f45387h).mo24463g(this.f45381b, bVar.f45381b).mo24462f(Integer.valueOf(this.f45394o), Integer.valueOf(bVar.f45394o), AbstractC4817k0.m24409c().mo24396f()).mo24462f(Integer.valueOf(this.f45393n), Integer.valueOf(bVar.f45393n), this.f45383d.f45483v ? C9882f.f45377g.mo24396f() : C9882f.f45378h).mo24463g(this.f45390k, bVar.f45390k).mo24462f(Integer.valueOf(this.f45388i), Integer.valueOf(bVar.f45388i), AbstractC4817k0.m24409c().mo24396f()).mo24460d(this.f45389j, bVar.f45389j).mo24462f(Integer.valueOf(this.f45391l), Integer.valueOf(bVar.f45391l), mo24396f).mo24462f(Integer.valueOf(this.f45392m), Integer.valueOf(bVar.f45392m), mo24396f);
            int i10 = this.f45393n;
            int i11 = bVar.f45393n;
            if (!C4401z0.m22371c(this.f45382c, bVar.f45382c)) {
                mo24396f = C9882f.f45378h;
            }
            return mo24462f.mo24462f(Integer.valueOf(i10), Integer.valueOf(i11), mo24396f).mo24465i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$c.class
     */
    /* renamed from: y8.f$c */
    /* loaded from: combined.jar:classes2.jar:y8/f$c.class */
    public static final class c implements Comparable<c> {

        /* renamed from: b */
        public final boolean f45395b;

        /* renamed from: c */
        public final boolean f45396c;

        public c(C7629w0 c7629w0, int i10) {
            this.f45395b = (c7629w0.f37078e & 1) == 0 ? false : true;
            this.f45396c = C9882f.m41634w(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return AbstractC4822n.m24459j().mo24463g(this.f45396c, cVar.f45396c).mo24463g(this.f45395b, cVar.f45395b).mo24465i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$d.class
     */
    /* renamed from: y8.f$d */
    /* loaded from: combined.jar:classes2.jar:y8/f$d.class */
    public static final class d extends C9889m {
        public static final Parcelable.Creator<d> CREATOR;

        /* renamed from: M */
        public static final d f45397M;

        /* renamed from: N */
        @Deprecated
        public static final d f45398N;

        /* renamed from: A */
        public final boolean f45399A;

        /* renamed from: B */
        public final boolean f45400B;

        /* renamed from: C */
        public final boolean f45401C;

        /* renamed from: D */
        public final boolean f45402D;

        /* renamed from: E */
        public final boolean f45403E;

        /* renamed from: F */
        public final boolean f45404F;

        /* renamed from: G */
        public final boolean f45405G;

        /* renamed from: H */
        public final boolean f45406H;

        /* renamed from: I */
        public final boolean f45407I;

        /* renamed from: J */
        public final boolean f45408J;

        /* renamed from: K */
        public final SparseArray<Map<C0083a1, f>> f45409K;

        /* renamed from: L */
        public final SparseBooleanArray f45410L;

        /* renamed from: z */
        public final int f45411z;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:y8/f$d$a.class
         */
        /* renamed from: y8.f$d$a */
        /* loaded from: combined.jar:classes2.jar:y8/f$d$a.class */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        static {
            d mo41689w = new e().mo41689w();
            f45397M = mo41689w;
            f45398N = mo41689w;
            CREATOR = new a();
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f45399A = C4401z0.m22338M0(parcel);
            this.f45400B = C4401z0.m22338M0(parcel);
            this.f45401C = C4401z0.m22338M0(parcel);
            this.f45402D = C4401z0.m22338M0(parcel);
            this.f45403E = C4401z0.m22338M0(parcel);
            this.f45404F = C4401z0.m22338M0(parcel);
            this.f45405G = C4401z0.m22338M0(parcel);
            this.f45411z = parcel.readInt();
            this.f45406H = C4401z0.m22338M0(parcel);
            this.f45407I = C4401z0.m22338M0(parcel);
            this.f45408J = C4401z0.m22338M0(parcel);
            this.f45409K = m41655s(parcel);
            this.f45410L = (SparseBooleanArray) C4401z0.m22391j(parcel.readSparseBooleanArray());
        }

        public d(e eVar) {
            super(eVar);
            this.f45399A = eVar.f45421w;
            this.f45400B = eVar.f45422x;
            this.f45401C = eVar.f45423y;
            this.f45402D = eVar.f45424z;
            this.f45403E = eVar.f45412A;
            this.f45404F = eVar.f45413B;
            this.f45405G = eVar.f45414C;
            this.f45411z = eVar.f45415D;
            this.f45406H = eVar.f45416E;
            this.f45407I = eVar.f45417F;
            this.f45408J = eVar.f45418G;
            this.f45409K = eVar.f45419H;
            this.f45410L = eVar.f45420I;
        }

        /* renamed from: j */
        public static boolean m41651j(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: k */
        public static boolean m41652k(SparseArray<Map<C0083a1, f>> sparseArray, SparseArray<Map<C0083a1, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !m41653l(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: l */
        public static boolean m41653l(Map<C0083a1, f> map, Map<C0083a1, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C0083a1, f> entry : map.entrySet()) {
                C0083a1 key = entry.getKey();
                if (!map2.containsKey(key) || !C4401z0.m22371c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: n */
        public static d m41654n(Context context) {
            return new e(context).mo41689w();
        }

        /* renamed from: s */
        public static SparseArray<Map<C0083a1, f>> m41655s(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<C0083a1, f>> sparseArray = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i11 = 0; i11 < readInt3; i11++) {
                    hashMap.put((C0083a1) C4349a.m21882e((C0083a1) parcel.readParcelable(C0083a1.class.getClassLoader())), (f) parcel.readParcelable(f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: u */
        public static void m41656u(Parcel parcel, SparseArray<Map<C0083a1, f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                Map<C0083a1, f> valueAt = sparseArray.valueAt(i10);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<C0083a1, f> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // p421y8.C9889m, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p421y8.C9889m
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (!super.equals(dVar) || this.f45399A != dVar.f45399A || this.f45400B != dVar.f45400B || this.f45401C != dVar.f45401C || this.f45402D != dVar.f45402D || this.f45403E != dVar.f45403E || this.f45404F != dVar.f45404F || this.f45405G != dVar.f45405G || this.f45411z != dVar.f45411z || this.f45406H != dVar.f45406H || this.f45407I != dVar.f45407I || this.f45408J != dVar.f45408J || !m41651j(this.f45410L, dVar.f45410L) || !m41652k(this.f45409K, dVar.f45409K)) {
                z10 = false;
            }
            return z10;
        }

        @Override // p421y8.C9889m
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f45399A ? 1 : 0)) * 31) + (this.f45400B ? 1 : 0)) * 31) + (this.f45401C ? 1 : 0)) * 31) + (this.f45402D ? 1 : 0)) * 31) + (this.f45403E ? 1 : 0)) * 31) + (this.f45404F ? 1 : 0)) * 31) + (this.f45405G ? 1 : 0)) * 31) + this.f45411z) * 31) + (this.f45406H ? 1 : 0)) * 31) + (this.f45407I ? 1 : 0)) * 31) + (this.f45408J ? 1 : 0);
        }

        /* renamed from: m */
        public e m41657m() {
            return new e(this);
        }

        /* renamed from: o */
        public final boolean m41658o(int i10) {
            return this.f45410L.get(i10);
        }

        /* renamed from: p */
        public final f m41659p(int i10, C0083a1 c0083a1) {
            Map<C0083a1, f> map = this.f45409K.get(i10);
            return map != null ? map.get(c0083a1) : null;
        }

        /* renamed from: r */
        public final boolean m41660r(int i10, C0083a1 c0083a1) {
            Map<C0083a1, f> map = this.f45409K.get(i10);
            return map != null && map.containsKey(c0083a1);
        }

        @Override // p421y8.C9889m, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            C4401z0.m22388h1(parcel, this.f45399A);
            C4401z0.m22388h1(parcel, this.f45400B);
            C4401z0.m22388h1(parcel, this.f45401C);
            C4401z0.m22388h1(parcel, this.f45402D);
            C4401z0.m22388h1(parcel, this.f45403E);
            C4401z0.m22388h1(parcel, this.f45404F);
            C4401z0.m22388h1(parcel, this.f45405G);
            parcel.writeInt(this.f45411z);
            C4401z0.m22388h1(parcel, this.f45406H);
            C4401z0.m22388h1(parcel, this.f45407I);
            C4401z0.m22388h1(parcel, this.f45408J);
            m41656u(parcel, this.f45409K);
            parcel.writeSparseBooleanArray(this.f45410L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$e.class
     */
    /* renamed from: y8.f$e */
    /* loaded from: combined.jar:classes2.jar:y8/f$e.class */
    public static final class e extends C9889m.b {

        /* renamed from: A */
        public boolean f45412A;

        /* renamed from: B */
        public boolean f45413B;

        /* renamed from: C */
        public boolean f45414C;

        /* renamed from: D */
        public int f45415D;

        /* renamed from: E */
        public boolean f45416E;

        /* renamed from: F */
        public boolean f45417F;

        /* renamed from: G */
        public boolean f45418G;

        /* renamed from: H */
        public final SparseArray<Map<C0083a1, f>> f45419H;

        /* renamed from: I */
        public final SparseBooleanArray f45420I;

        /* renamed from: w */
        public boolean f45421w;

        /* renamed from: x */
        public boolean f45422x;

        /* renamed from: y */
        public boolean f45423y;

        /* renamed from: z */
        public boolean f45424z;

        @Deprecated
        public e() {
            this.f45419H = new SparseArray<>();
            this.f45420I = new SparseBooleanArray();
            m41681S();
        }

        public e(Context context) {
            super(context);
            this.f45419H = new SparseArray<>();
            this.f45420I = new SparseBooleanArray();
            m41681S();
        }

        public e(d dVar) {
            super(dVar);
            this.f45415D = dVar.f45411z;
            this.f45421w = dVar.f45399A;
            this.f45422x = dVar.f45400B;
            this.f45423y = dVar.f45401C;
            this.f45424z = dVar.f45402D;
            this.f45412A = dVar.f45403E;
            this.f45413B = dVar.f45404F;
            this.f45414C = dVar.f45405G;
            this.f45416E = dVar.f45406H;
            this.f45417F = dVar.f45407I;
            this.f45418G = dVar.f45408J;
            this.f45419H = m41676R(dVar.f45409K);
            this.f45420I = dVar.f45410L.clone();
        }

        /* renamed from: R */
        public static SparseArray<Map<C0083a1, f>> m41676R(SparseArray<Map<C0083a1, f>> sparseArray) {
            SparseArray<Map<C0083a1, f>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        @Override // p421y8.C9889m.b
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public d mo41689w() {
            return new d(this);
        }

        /* renamed from: Q */
        public final e m41680Q(int i10) {
            Map<C0083a1, f> map = this.f45419H.get(i10);
            if (map != null && !map.isEmpty()) {
                this.f45419H.remove(i10);
            }
            return this;
        }

        /* renamed from: S */
        public final void m41681S() {
            this.f45421w = true;
            this.f45422x = false;
            this.f45423y = true;
            this.f45424z = true;
            this.f45412A = false;
            this.f45413B = false;
            this.f45414C = false;
            this.f45415D = 0;
            this.f45416E = true;
            this.f45417F = false;
            this.f45418G = true;
        }

        /* renamed from: T */
        public e m41682T(int i10) {
            this.f45415D = i10;
            return this;
        }

        /* renamed from: U */
        public e m41683U(boolean z10) {
            super.m41741x(z10);
            return this;
        }

        @Override // p421y8.C9889m.b
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public e mo41690y(Context context) {
            super.mo41690y(context);
            return this;
        }

        /* renamed from: W */
        public final e m41685W(int i10, boolean z10) {
            if (this.f45420I.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.f45420I.put(i10, true);
            } else {
                this.f45420I.delete(i10);
            }
            return this;
        }

        /* renamed from: X */
        public final e m41686X(int i10, C0083a1 c0083a1, f fVar) {
            Map<C0083a1, f> map = this.f45419H.get(i10);
            Map<C0083a1, f> map2 = map;
            if (map == null) {
                map2 = new HashMap();
                this.f45419H.put(i10, map2);
            }
            if (map2.containsKey(c0083a1) && C4401z0.m22371c(map2.get(c0083a1), fVar)) {
                return this;
            }
            map2.put(c0083a1, fVar);
            return this;
        }

        @Override // p421y8.C9889m.b
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public e mo41677A(int i10, int i11, boolean z10) {
            super.mo41677A(i10, i11, z10);
            return this;
        }

        @Override // p421y8.C9889m.b
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public e mo41678B(Context context, boolean z10) {
            super.mo41678B(context, z10);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$f.class
     */
    /* renamed from: y8.f$f */
    /* loaded from: combined.jar:classes2.jar:y8/f$f.class */
    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b */
        public final int f45425b;

        /* renamed from: c */
        public final int[] f45426c;

        /* renamed from: d */
        public final int f45427d;

        /* renamed from: e */
        public final int f45428e;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:y8/f$f$a.class
         */
        /* renamed from: y8.f$f$a */
        /* loaded from: combined.jar:classes2.jar:y8/f$f$a.class */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public f(int i10, int[] iArr, int i11) {
            this.f45425b = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f45426c = copyOf;
            this.f45427d = iArr.length;
            this.f45428e = i11;
            Arrays.sort(copyOf);
        }

        public f(Parcel parcel) {
            this.f45425b = parcel.readInt();
            int readByte = parcel.readByte();
            this.f45427d = readByte;
            int[] iArr = new int[readByte];
            this.f45426c = iArr;
            parcel.readIntArray(iArr);
            this.f45428e = parcel.readInt();
        }

        /* renamed from: b */
        public boolean m41691b(int i10) {
            for (int i11 : this.f45426c) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f45425b != fVar.f45425b || !Arrays.equals(this.f45426c, fVar.f45426c) || this.f45428e != fVar.f45428e) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (((this.f45425b * 31) + Arrays.hashCode(this.f45426c)) * 31) + this.f45428e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f45425b);
            parcel.writeInt(this.f45426c.length);
            parcel.writeIntArray(this.f45426c);
            parcel.writeInt(this.f45428e);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$g.class
     */
    /* renamed from: y8.f$g */
    /* loaded from: combined.jar:classes2.jar:y8/f$g.class */
    public static final class g implements Comparable<g> {

        /* renamed from: b */
        public final boolean f45429b;

        /* renamed from: c */
        public final boolean f45430c;

        /* renamed from: d */
        public final boolean f45431d;

        /* renamed from: e */
        public final boolean f45432e;

        /* renamed from: f */
        public final int f45433f;

        /* renamed from: g */
        public final int f45434g;

        /* renamed from: h */
        public final int f45435h;

        /* renamed from: i */
        public final int f45436i;

        /* renamed from: j */
        public final boolean f45437j;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
        
            if (r0 > 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public g(p267p6.C7629w0 r5, p421y8.C9882f.d r6, int r7, java.lang.String r8) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.g.<init>(p6.w0, y8.f$d, int, java.lang.String):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            AbstractC4822n mo24460d = AbstractC4822n.m24459j().mo24463g(this.f45430c, gVar.f45430c).mo24462f(Integer.valueOf(this.f45433f), Integer.valueOf(gVar.f45433f), AbstractC4817k0.m24409c().mo24396f()).mo24460d(this.f45434g, gVar.f45434g).mo24460d(this.f45435h, gVar.f45435h).mo24463g(this.f45431d, gVar.f45431d).mo24462f(Boolean.valueOf(this.f45432e), Boolean.valueOf(gVar.f45432e), this.f45434g == 0 ? AbstractC4817k0.m24409c() : AbstractC4817k0.m24409c().mo24396f()).mo24460d(this.f45436i, gVar.f45436i);
            AbstractC4822n abstractC4822n = mo24460d;
            if (this.f45435h == 0) {
                abstractC4822n = mo24460d.mo24464h(this.f45437j, gVar.f45437j);
            }
            return abstractC4822n.mo24465i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/f$h.class
     */
    /* renamed from: y8.f$h */
    /* loaded from: combined.jar:classes2.jar:y8/f$h.class */
    public static final class h implements Comparable<h> {

        /* renamed from: b */
        public final boolean f45438b;

        /* renamed from: c */
        public final d f45439c;

        /* renamed from: d */
        public final boolean f45440d;

        /* renamed from: e */
        public final boolean f45441e;

        /* renamed from: f */
        public final int f45442f;

        /* renamed from: g */
        public final int f45443g;

        /* renamed from: h */
        public final int f45444h;

        /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0144 A[EDGE_INSN: B:54:0x0144->B:48:0x0144 BREAK  A[LOOP:0: B:40:0x010c->B:52:0x013e], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(p267p6.C7629w0 r5, p421y8.C9882f.d r6, int r7, boolean r8) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.h.<init>(p6.w0, y8.f$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC4817k0 mo24396f = (this.f45438b && this.f45441e) ? C9882f.f45377g : C9882f.f45377g.mo24396f();
            return AbstractC4822n.m24459j().mo24463g(this.f45441e, hVar.f45441e).mo24463g(this.f45438b, hVar.f45438b).mo24463g(this.f45440d, hVar.f45440d).mo24462f(Integer.valueOf(this.f45444h), Integer.valueOf(hVar.f45444h), AbstractC4817k0.m24409c().mo24396f()).mo24462f(Integer.valueOf(this.f45442f), Integer.valueOf(hVar.f45442f), this.f45439c.f45483v ? C9882f.f45377g.mo24396f() : C9882f.f45378h).mo24462f(Integer.valueOf(this.f45443g), Integer.valueOf(hVar.f45443g), mo24396f).mo24462f(Integer.valueOf(this.f45442f), Integer.valueOf(hVar.f45442f), mo24396f).mo24465i();
        }
    }

    @Deprecated
    public C9882f() {
        this(d.f45397M, new C9877a.b());
    }

    public C9882f(Context context) {
        this(context, new C9877a.b());
    }

    public C9882f(Context context, InterfaceC9884h.b bVar) {
        this(d.m41654n(context), bVar);
    }

    public C9882f(d dVar, InterfaceC9884h.b bVar) {
        this.f45379d = bVar;
        this.f45380e = new AtomicReference<>(dVar);
    }

    /* renamed from: A */
    public static /* synthetic */ int m41617A(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: B */
    public static void m41618B(AbstractC9886j.a aVar, int[][][] iArr, C7636y1[] c7636y1Arr, InterfaceC9884h[] interfaceC9884hArr) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            i10 = i15;
            if (i13 >= aVar.m41708c()) {
                z10 = true;
                break;
            }
            int m41711f = aVar.m41711f(i13);
            InterfaceC9884h interfaceC9884h = interfaceC9884hArr[i13];
            if (m41711f != 1) {
                i11 = i14;
                i12 = i10;
                if (m41711f != 2) {
                    continue;
                    i13++;
                    i14 = i11;
                    i15 = i12;
                }
            }
            i11 = i14;
            i12 = i10;
            if (interfaceC9884h != null) {
                i11 = i14;
                i12 = i10;
                if (!m41620D(iArr[i13], aVar.m41712g(i13), interfaceC9884h)) {
                    continue;
                } else if (m41711f == 1) {
                    if (i10 != -1) {
                        break;
                    }
                    i12 = i13;
                    i11 = i14;
                } else {
                    if (i14 != -1) {
                        break;
                    }
                    i11 = i13;
                    i12 = i10;
                }
            } else {
                continue;
            }
            i13++;
            i14 = i11;
            i15 = i12;
        }
        z10 = false;
        boolean z11 = false;
        if (i10 != -1) {
            z11 = false;
            if (i14 != -1) {
                z11 = true;
            }
        }
        if (z10 && z11) {
            C7636y1 c7636y1 = new C7636y1(true);
            c7636y1Arr[i10] = c7636y1;
            c7636y1Arr[i14] = c7636y1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (android.text.TextUtils.equals(r3, "und") != false) goto L6;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m41619C(java.lang.String r3) {
        /*
            r0 = r3
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L12
            r0 = r3
            r4 = r0
            r0 = r3
            java.lang.String r1 = "und"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L14
        L12:
            r0 = 0
            r4 = r0
        L14:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.m41619C(java.lang.String):java.lang.String");
    }

    /* renamed from: D */
    public static boolean m41620D(int[][] iArr, C0083a1 c0083a1, InterfaceC9884h interfaceC9884h) {
        if (interfaceC9884h == null) {
            return false;
        }
        int m324c = c0083a1.m324c(interfaceC9884h.mo41612l());
        for (int i10 = 0; i10 < interfaceC9884h.length(); i10++) {
            if (C7630w1.m33230e(iArr[m324c][interfaceC9884h.mo41608f(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public static InterfaceC9884h.a m41621E(C0083a1 c0083a1, int[][] iArr, int i10, d dVar) {
        int i11 = dVar.f45401C ? 24 : 16;
        boolean z10 = dVar.f45400B && (i10 & i11) != 0;
        for (int i12 = 0; i12 < c0083a1.f261b; i12++) {
            C0134z0 m323b = c0083a1.m323b(i12);
            int[] m41630r = m41630r(m323b, iArr[i12], z10, i11, dVar.f45463b, dVar.f45464c, dVar.f45465d, dVar.f45466e, dVar.f45467f, dVar.f45468g, dVar.f45469h, dVar.f45470i, dVar.f45471j, dVar.f45472k, dVar.f45473l);
            if (m41630r.length > 0) {
                return new InterfaceC9884h.a(m323b, m41630r);
            }
        }
        return null;
    }

    /* renamed from: H */
    public static InterfaceC9884h.a m41622H(C0083a1 c0083a1, int[][] iArr, d dVar) {
        int i10;
        C0134z0 c0134z0;
        h hVar;
        int i11 = -1;
        C0134z0 c0134z02 = null;
        h hVar2 = null;
        for (int i12 = 0; i12 < c0083a1.f261b; i12++) {
            C0134z0 m323b = c0083a1.m323b(i12);
            List<Integer> m41633v = m41633v(m323b, dVar.f45471j, dVar.f45472k, dVar.f45473l);
            int[] iArr2 = iArr[i12];
            int i13 = 0;
            while (i13 < m323b.f618b) {
                C7629w0 m663b = m323b.m663b(i13);
                if ((m663b.f37079f & 16384) != 0) {
                    i10 = i11;
                    c0134z0 = c0134z02;
                    hVar = hVar2;
                } else {
                    i10 = i11;
                    c0134z0 = c0134z02;
                    hVar = hVar2;
                    if (m41634w(iArr2[i13], dVar.f45406H)) {
                        h hVar3 = new h(m663b, dVar, iArr2[i13], m41633v.contains(Integer.valueOf(i13)));
                        if (hVar3.f45438b || dVar.f45399A) {
                            if (hVar2 != null) {
                                i10 = i11;
                                c0134z0 = c0134z02;
                                hVar = hVar2;
                                if (hVar3.compareTo(hVar2) <= 0) {
                                }
                            }
                            c0134z0 = m323b;
                            i10 = i13;
                            hVar = hVar3;
                        } else {
                            i10 = i11;
                            c0134z0 = c0134z02;
                            hVar = hVar2;
                        }
                    }
                }
                i13++;
                i11 = i10;
                c0134z02 = c0134z0;
                hVar2 = hVar;
            }
        }
        return c0134z02 == null ? null : new InterfaceC9884h.a(c0134z02, i11);
    }

    /* renamed from: o */
    public static void m41627o(C0134z0 c0134z0, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!m41636y(c0134z0.m663b(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    /* renamed from: p */
    public static int[] m41628p(C0134z0 c0134z0, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        C7629w0 m663b = c0134z0.m663b(i10);
        int[] iArr2 = new int[c0134z0.f618b];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i14;
            if (i13 >= c0134z0.f618b) {
                return Arrays.copyOf(iArr2, i15);
            }
            if (i13 != i10) {
                i12 = i15;
                if (!m41635x(c0134z0.m663b(i13), iArr[i13], m663b, i11, z10, z11, z12)) {
                    i13++;
                    i14 = i12;
                }
            }
            iArr2[i15] = i13;
            i12 = i15 + 1;
            i13++;
            i14 = i12;
        }
    }

    /* renamed from: q */
    public static int m41629q(C0134z0 c0134z0, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        int i20 = 0;
        while (true) {
            int i21 = i20;
            if (i19 >= list.size()) {
                return i21;
            }
            int intValue = list.get(i19).intValue();
            int i22 = i21;
            if (m41636y(c0134z0.m663b(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i22 = i21 + 1;
            }
            i19++;
            i20 = i22;
        }
    }

    /* renamed from: r */
    public static int[] m41630r(C0134z0 c0134z0, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        int m41629q;
        if (c0134z0.f618b < 2) {
            return f45376f;
        }
        List<Integer> m41633v = m41633v(c0134z0, i19, i20, z11);
        if (m41633v.size() < 2) {
            return f45376f;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            str = null;
            int i21 = 0;
            for (int i22 = 0; i22 < m41633v.size(); i22++) {
                String str2 = c0134z0.m663b(m41633v.get(i22).intValue()).f37086m;
                if (hashSet.add(str2) && (m41629q = m41629q(c0134z0, iArr, i10, str2, i11, i12, i13, i14, i15, i16, i17, i18, m41633v)) > i21) {
                    i21 = m41629q;
                    str = str2;
                }
            }
        }
        m41627o(c0134z0, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, m41633v);
        return m41633v.size() < 2 ? f45376f : C5354c.m26644j(m41633v);
    }

    /* renamed from: s */
    public static int m41631s(C7629w0 c7629w0, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c7629w0.f37077d)) {
            return 4;
        }
        String m41619C = m41619C(str);
        String m41619C2 = m41619C(c7629w0.f37077d);
        if (m41619C2 != null && m41619C != null) {
            if (m41619C2.startsWith(m41619C) || m41619C.startsWith(m41619C2)) {
                return 3;
            }
            return C4401z0.m22358W0(m41619C2, "-")[0].equals(C4401z0.m22358W0(m41619C, "-")[0]) ? 2 : 0;
        }
        int i10 = 0;
        if (z10) {
            i10 = 0;
            if (m41619C2 == null) {
                i10 = 1;
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r11 != r12) goto L16;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point m41632t(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r0 = r6
            if (r0 == 0) goto L2b
            r0 = 1
            r12 = r0
            r0 = r9
            r1 = r10
            if (r0 <= r1) goto L13
            r0 = 1
            r11 = r0
            goto L16
        L13:
            r0 = 0
            r11 = r0
        L16:
            r0 = r7
            r1 = r8
            if (r0 <= r1) goto L1e
            goto L21
        L1e:
            r0 = 0
            r12 = r0
        L21:
            r0 = r11
            r1 = r12
            if (r0 == r1) goto L2b
            goto L33
        L2b:
            r0 = r7
            r11 = r0
            r0 = r8
            r7 = r0
            r0 = r11
            r8 = r0
        L33:
            r0 = r9
            r1 = r7
            int r0 = r0 * r1
            r11 = r0
            r0 = r10
            r1 = r8
            int r0 = r0 * r1
            r12 = r0
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L54
            android.graphics.Point r0 = new android.graphics.Point
            r1 = r0
            r2 = r8
            r3 = r12
            r4 = r9
            int r3 = p059d9.C4401z0.m22395l(r3, r4)
            r1.<init>(r2, r3)
            return r0
        L54:
            android.graphics.Point r0 = new android.graphics.Point
            r1 = r0
            r2 = r11
            r3 = r10
            int r2 = p059d9.C4401z0.m22395l(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.m41632t(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: v */
    public static List<Integer> m41633v(C0134z0 c0134z0, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(c0134z0.f618b);
        int i13 = 0;
        for (int i14 = 0; i14 < c0134z0.f618b; i14++) {
            arrayList.add(Integer.valueOf(i14));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i15 = Integer.MAX_VALUE;
            while (true) {
                i12 = i15;
                if (i13 >= c0134z0.f618b) {
                    break;
                }
                C7629w0 m663b = c0134z0.m663b(i13);
                int i16 = m663b.f37091r;
                int i17 = i12;
                if (i16 > 0) {
                    int i18 = m663b.f37092s;
                    i17 = i12;
                    if (i18 > 0) {
                        Point m41632t = m41632t(z10, i10, i11, i16, i18);
                        int i19 = m663b.f37091r;
                        int i20 = m663b.f37092s;
                        int i21 = i19 * i20;
                        i17 = i12;
                        if (i19 >= ((int) (m41632t.x * 0.98f))) {
                            i17 = i12;
                            if (i20 >= ((int) (m41632t.y * 0.98f))) {
                                i17 = i12;
                                if (i21 < i12) {
                                    i17 = i21;
                                }
                            }
                        }
                    }
                }
                i13++;
                i15 = i17;
            }
            if (i12 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int m33159j = c0134z0.m663b(((Integer) arrayList.get(size)).intValue()).m33159j();
                    if (m33159j == -1 || m33159j > i12) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public static boolean m41634w(int i10, boolean z10) {
        int m33229d = C7630w1.m33229d(i10);
        return m33229d == 4 || (z10 && m33229d == 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r0 == r5.f37099z) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, r5.f37086m) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r0 == r5.f37068A) goto L26;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m41635x(p267p6.C7629w0 r3, int r4, p267p6.C7629w0 r5, int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r0 = 0
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = 0
            boolean r0 = m41634w(r0, r1)
            if (r0 == 0) goto L8b
            r0 = r3
            int r0 = r0.f37082i
            r4 = r0
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = -1
            if (r0 == r1) goto L8b
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = r6
            if (r0 > r1) goto L8b
            r0 = r9
            if (r0 != 0) goto L45
            r0 = r3
            int r0 = r0.f37099z
            r4 = r0
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = -1
            if (r0 == r1) goto L8b
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = r5
            int r1 = r1.f37099z
            if (r0 != r1) goto L8b
        L45:
            r0 = r7
            if (r0 != 0) goto L69
            r0 = r3
            java.lang.String r0 = r0.f37086m
            r12 = r0
            r0 = r11
            r10 = r0
            r0 = r12
            if (r0 == 0) goto L8b
            r0 = r11
            r10 = r0
            r0 = r12
            r1 = r5
            java.lang.String r1 = r1.f37086m
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L8b
        L69:
            r0 = r8
            if (r0 != 0) goto L88
            r0 = r3
            int r0 = r0.f37068A
            r4 = r0
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = -1
            if (r0 == r1) goto L8b
            r0 = r11
            r10 = r0
            r0 = r4
            r1 = r5
            int r1 = r1.f37068A
            if (r0 != r1) goto L8b
        L88:
            r0 = 1
            r10 = r0
        L8b:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.m41635x(p6.w0, int, p6.w0, int, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (p059d9.C4401z0.m22371c(r3.f37086m, r4) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r0 <= r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r0 <= r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r0 <= r9) goto L32;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m41636y(p267p6.C7629w0 r3, java.lang.String r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p421y8.C9882f.m41636y(p6.w0, java.lang.String, int, int, int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: z */
    public static /* synthetic */ int m41637z(Integer num, Integer num2) {
        int i10 = -1;
        if (num.intValue() != -1) {
            i10 = num2.intValue() == -1 ? 1 : num.intValue() - num2.intValue();
        } else if (num2.intValue() == -1) {
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: F */
    public InterfaceC9884h.a[] m41638F(AbstractC9886j.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        boolean z10;
        int i10;
        g gVar;
        int m41708c = aVar.m41708c();
        InterfaceC9884h.a[] aVarArr = new InterfaceC9884h.a[m41708c];
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            z10 = z12;
            if (i11 >= m41708c) {
                break;
            }
            boolean z13 = z11;
            boolean z14 = z10;
            if (2 == aVar.m41711f(i11)) {
                z13 = z11;
                if (!z11) {
                    InterfaceC9884h.a m41642K = m41642K(aVar.m41712g(i11), iArr[i11], iArr2[i11], dVar, true);
                    aVarArr[i11] = m41642K;
                    z13 = m41642K != null;
                }
                z14 = z10 | (aVar.m41712g(i11).f261b > 0);
            }
            i11++;
            z11 = z13;
            z12 = z14;
        }
        b bVar = null;
        String str = null;
        int i12 = -1;
        for (int i13 = 0; i13 < m41708c; i13++) {
            if (1 == aVar.m41711f(i13)) {
                Pair<InterfaceC9884h.a, b> m41639G = m41639G(aVar.m41712g(i13), iArr[i13], iArr2[i13], dVar, dVar.f45408J || !z10);
                if (m41639G != null && (bVar == null || ((b) m41639G.second).compareTo(bVar) > 0)) {
                    if (i12 != -1) {
                        aVarArr[i12] = null;
                    }
                    InterfaceC9884h.a aVar2 = (InterfaceC9884h.a) m41639G.first;
                    aVarArr[i13] = aVar2;
                    str = aVar2.f45445a.m663b(aVar2.f45446b[0]).f37077d;
                    bVar = (b) m41639G.second;
                    i12 = i13;
                }
            }
        }
        String str2 = str;
        g gVar2 = null;
        int i14 = -1;
        int i15 = 0;
        while (i15 < m41708c) {
            int m41711f = aVar.m41711f(i15);
            if (m41711f != 1) {
                if (m41711f != 2) {
                    if (m41711f != 3) {
                        aVarArr[i15] = m41640I(m41711f, aVar.m41712g(i15), iArr[i15], dVar);
                    } else {
                        Pair<InterfaceC9884h.a, g> m41641J = m41641J(aVar.m41712g(i15), iArr[i15], dVar, str2);
                        gVar = gVar2;
                        i10 = i14;
                        if (m41641J != null) {
                            if (gVar2 != null) {
                                gVar = gVar2;
                                i10 = i14;
                                if (((g) m41641J.second).compareTo(gVar2) <= 0) {
                                }
                            }
                            if (i14 != -1) {
                                aVarArr[i14] = null;
                            }
                            aVarArr[i15] = (InterfaceC9884h.a) m41641J.first;
                            gVar = (g) m41641J.second;
                            i10 = i15;
                        }
                    }
                }
                gVar = gVar2;
                i10 = i14;
            } else {
                i10 = i14;
                gVar = gVar2;
            }
            i15++;
            gVar2 = gVar;
            i14 = i10;
        }
        return aVarArr;
    }

    /* renamed from: G */
    public Pair<InterfaceC9884h.a, b> m41639G(C0083a1 c0083a1, int[][] iArr, int i10, d dVar, boolean z10) {
        b bVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < c0083a1.f261b; i13++) {
            C0134z0 m323b = c0083a1.m323b(i13);
            int[] iArr2 = iArr[i13];
            int i14 = 0;
            while (i14 < m323b.f618b) {
                int i15 = i11;
                int i16 = i12;
                b bVar2 = bVar;
                if (m41634w(iArr2[i14], dVar.f45406H)) {
                    b bVar3 = new b(m323b.m663b(i14), dVar, iArr2[i14]);
                    if (bVar3.f45381b || dVar.f45402D) {
                        if (bVar != null) {
                            i15 = i11;
                            i16 = i12;
                            bVar2 = bVar;
                            if (bVar3.compareTo(bVar) <= 0) {
                            }
                        }
                        i15 = i13;
                        i16 = i14;
                        bVar2 = bVar3;
                    } else {
                        i15 = i11;
                        i16 = i12;
                        bVar2 = bVar;
                    }
                }
                i14++;
                i11 = i15;
                i12 = i16;
                bVar = bVar2;
            }
        }
        if (i11 == -1) {
            return null;
        }
        C0134z0 m323b2 = c0083a1.m323b(i11);
        InterfaceC9884h.a aVar = null;
        if (!dVar.f45484w) {
            aVar = null;
            if (!dVar.f45483v) {
                aVar = null;
                if (z10) {
                    int[] m41628p = m41628p(m323b2, iArr[i11], i12, dVar.f45478q, dVar.f45403E, dVar.f45404F, dVar.f45405G);
                    aVar = null;
                    if (m41628p.length > 1) {
                        aVar = new InterfaceC9884h.a(m323b2, m41628p);
                    }
                }
            }
        }
        InterfaceC9884h.a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = new InterfaceC9884h.a(m323b2, i12);
        }
        return Pair.create(aVar2, (b) C4349a.m21882e(bVar));
    }

    /* renamed from: I */
    public InterfaceC9884h.a m41640I(int i10, C0083a1 c0083a1, int[][] iArr, d dVar) {
        C0134z0 c0134z0 = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < c0083a1.f261b; i12++) {
            C0134z0 m323b = c0083a1.m323b(i12);
            int[] iArr2 = iArr[i12];
            int i13 = 0;
            while (i13 < m323b.f618b) {
                C0134z0 c0134z02 = c0134z0;
                int i14 = i11;
                c cVar2 = cVar;
                if (m41634w(iArr2[i13], dVar.f45406H)) {
                    c cVar3 = new c(m323b.m663b(i13), iArr2[i13]);
                    if (cVar != null) {
                        c0134z02 = c0134z0;
                        i14 = i11;
                        cVar2 = cVar;
                        if (cVar3.compareTo(cVar) <= 0) {
                        }
                    }
                    c0134z02 = m323b;
                    i14 = i13;
                    cVar2 = cVar3;
                }
                i13++;
                c0134z0 = c0134z02;
                i11 = i14;
                cVar = cVar2;
            }
        }
        return c0134z0 == null ? null : new InterfaceC9884h.a(c0134z0, i11);
    }

    /* renamed from: J */
    public Pair<InterfaceC9884h.a, g> m41641J(C0083a1 c0083a1, int[][] iArr, d dVar, String str) {
        g gVar;
        C0134z0 c0134z0;
        int i10;
        int i11 = -1;
        C0134z0 c0134z02 = null;
        g gVar2 = null;
        for (int i12 = 0; i12 < c0083a1.f261b; i12++) {
            C0134z0 m323b = c0083a1.m323b(i12);
            int[] iArr2 = iArr[i12];
            int i13 = 0;
            while (i13 < m323b.f618b) {
                if (m41634w(iArr2[i13], dVar.f45406H)) {
                    g gVar3 = new g(m323b.m663b(i13), dVar, iArr2[i13], str);
                    i10 = i11;
                    c0134z0 = c0134z02;
                    gVar = gVar2;
                    if (gVar3.f45429b) {
                        if (gVar2 != null) {
                            i10 = i11;
                            c0134z0 = c0134z02;
                            gVar = gVar2;
                            if (gVar3.compareTo(gVar2) <= 0) {
                            }
                        }
                        c0134z0 = m323b;
                        i10 = i13;
                        gVar = gVar3;
                    }
                } else {
                    gVar = gVar2;
                    c0134z0 = c0134z02;
                    i10 = i11;
                }
                i13++;
                i11 = i10;
                c0134z02 = c0134z0;
                gVar2 = gVar;
            }
        }
        return c0134z02 == null ? null : Pair.create(new InterfaceC9884h.a(c0134z02, i11), (g) C4349a.m21882e(gVar2));
    }

    /* renamed from: K */
    public InterfaceC9884h.a m41642K(C0083a1 c0083a1, int[][] iArr, int i10, d dVar, boolean z10) {
        InterfaceC9884h.a m41621E = (dVar.f45484w || dVar.f45483v || !z10) ? null : m41621E(c0083a1, iArr, i10, dVar);
        InterfaceC9884h.a aVar = m41621E;
        if (m41621E == null) {
            aVar = m41622H(c0083a1, iArr, dVar);
        }
        return aVar;
    }

    /* renamed from: L */
    public void m41643L(d dVar) {
        C4349a.m21882e(dVar);
        if (this.f45380e.getAndSet(dVar).equals(dVar)) {
            return;
        }
        m41747c();
    }

    /* renamed from: M */
    public void m41644M(e eVar) {
        m41643L(eVar.mo41689w());
    }

    @Override // p421y8.AbstractC9886j
    /* renamed from: j */
    public final Pair<C7636y1[], InterfaceC9884h[]> mo41645j(AbstractC9886j.a aVar, int[][][] iArr, int[] iArr2, InterfaceC0127w.a aVar2, AbstractC7574e2 abstractC7574e2) {
        d dVar = this.f45380e.get();
        int m41708c = aVar.m41708c();
        InterfaceC9884h.a[] m41638F = m41638F(aVar, iArr, iArr2, dVar);
        int i10 = 0;
        while (true) {
            if (i10 >= m41708c) {
                break;
            }
            if (dVar.m41658o(i10)) {
                m41638F[i10] = null;
            } else {
                C0083a1 m41712g = aVar.m41712g(i10);
                if (dVar.m41660r(i10, m41712g)) {
                    f m41659p = dVar.m41659p(i10, m41712g);
                    m41638F[i10] = m41659p != null ? new InterfaceC9884h.a(m41712g.m323b(m41659p.f45425b), m41659p.f45426c, m41659p.f45428e) : null;
                }
            }
            i10++;
        }
        InterfaceC9884h[] mo41461a = this.f45379d.mo41461a(m41638F, m41745a(), aVar2, abstractC7574e2);
        C7636y1[] c7636y1Arr = new C7636y1[m41708c];
        for (int i11 = 0; i11 < m41708c; i11++) {
            c7636y1Arr[i11] = !dVar.m41658o(i11) && (aVar.m41711f(i11) == 7 || mo41461a[i11] != null) ? C7636y1.f37137b : null;
        }
        if (dVar.f45407I) {
            m41618B(aVar, iArr, c7636y1Arr, mo41461a);
        }
        return Pair.create(c7636y1Arr, mo41461a);
    }

    /* renamed from: u */
    public d m41646u() {
        return this.f45380e.get();
    }
}
