package p024b6;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p024b6.C0811i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/o.class
 */
@AutoValue
/* renamed from: b6.o */
/* loaded from: combined.jar:classes1.jar:b6/o.class */
public abstract class AbstractC0817o {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/o$a.class
     */
    @AutoValue.Builder
    /* renamed from: b6.o$a */
    /* loaded from: combined.jar:classes1.jar:b6/o$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0817o mo5206a();

        /* renamed from: b */
        public abstract a mo5207b(b bVar);

        /* renamed from: c */
        public abstract a mo5208c(c cVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/o$b.class
     */
    /* renamed from: b6.o$b */
    /* loaded from: combined.jar:classes1.jar:b6/o$b.class */
    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        private static final SparseArray<b> valueMap;
        private final int value;

        static {
            b bVar = UNKNOWN_MOBILE_SUBTYPE;
            b bVar2 = GPRS;
            b bVar3 = EDGE;
            b bVar4 = UMTS;
            b bVar5 = CDMA;
            b bVar6 = EVDO_0;
            b bVar7 = EVDO_A;
            b bVar8 = RTT;
            b bVar9 = HSDPA;
            b bVar10 = HSUPA;
            b bVar11 = HSPA;
            b bVar12 = IDEN;
            b bVar13 = EVDO_B;
            b bVar14 = LTE;
            b bVar15 = EHRPD;
            b bVar16 = HSPAP;
            b bVar17 = GSM;
            b bVar18 = TD_SCDMA;
            b bVar19 = IWLAN;
            b bVar20 = LTE_CA;
            SparseArray<b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        b(int i10) {
            this.value = i10;
        }

        public static b forNumber(int i10) {
            return valueMap.get(i10);
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b6/o$c.class
     */
    /* renamed from: b6.o$c */
    /* loaded from: combined.jar:classes1.jar:b6/o$c.class */
    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);

        private static final SparseArray<c> valueMap;
        private final int value;

        static {
            c cVar = MOBILE;
            c cVar2 = WIFI;
            c cVar3 = MOBILE_MMS;
            c cVar4 = MOBILE_SUPL;
            c cVar5 = MOBILE_DUN;
            c cVar6 = MOBILE_HIPRI;
            c cVar7 = WIMAX;
            c cVar8 = BLUETOOTH;
            c cVar9 = DUMMY;
            c cVar10 = ETHERNET;
            c cVar11 = MOBILE_FOTA;
            c cVar12 = MOBILE_IMS;
            c cVar13 = MOBILE_CBS;
            c cVar14 = WIFI_P2P;
            c cVar15 = MOBILE_IA;
            c cVar16 = MOBILE_EMERGENCY;
            c cVar17 = PROXY;
            c cVar18 = VPN;
            c cVar19 = NONE;
            SparseArray<c> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        c(int i10) {
            this.value = i10;
        }

        public static c forNumber(int i10) {
            return valueMap.get(i10);
        }

        public int getValue() {
            return this.value;
        }
    }

    /* renamed from: a */
    public static a m5220a() {
        return new C0811i.b();
    }

    /* renamed from: b */
    public abstract b mo5204b();

    /* renamed from: c */
    public abstract c mo5205c();
}
