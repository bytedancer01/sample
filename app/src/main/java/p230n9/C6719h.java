package p230n9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ma.AbstractC6344q2;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/h.class
 */
/* renamed from: n9.h */
/* loaded from: combined.jar:classes2.jar:n9/h.class */
public class C6719h extends AbstractC10125a {

    /* renamed from: A */
    public final int f35104A;

    /* renamed from: B */
    public final int f35105B;

    /* renamed from: C */
    public final int f35106C;

    /* renamed from: D */
    public final int f35107D;

    /* renamed from: E */
    public final int f35108E;

    /* renamed from: F */
    public final int f35109F;

    /* renamed from: G */
    public final int f35110G;

    /* renamed from: H */
    public final int f35111H;

    /* renamed from: I */
    public final InterfaceC6752x0 f35112I;

    /* renamed from: J */
    public final boolean f35113J;

    /* renamed from: K */
    public final boolean f35114K;

    /* renamed from: d */
    public final List f35115d;

    /* renamed from: e */
    public final int[] f35116e;

    /* renamed from: f */
    public final long f35117f;

    /* renamed from: g */
    public final String f35118g;

    /* renamed from: h */
    public final int f35119h;

    /* renamed from: i */
    public final int f35120i;

    /* renamed from: j */
    public final int f35121j;

    /* renamed from: k */
    public final int f35122k;

    /* renamed from: l */
    public final int f35123l;

    /* renamed from: m */
    public final int f35124m;

    /* renamed from: n */
    public final int f35125n;

    /* renamed from: o */
    public final int f35126o;

    /* renamed from: p */
    public final int f35127p;

    /* renamed from: q */
    public final int f35128q;

    /* renamed from: r */
    public final int f35129r;

    /* renamed from: s */
    public final int f35130s;

    /* renamed from: t */
    public final int f35131t;

    /* renamed from: u */
    public final int f35132u;

    /* renamed from: v */
    public final int f35133v;

    /* renamed from: w */
    public final int f35134w;

    /* renamed from: x */
    public final int f35135x;

    /* renamed from: y */
    public final int f35136y;

    /* renamed from: z */
    public final int f35137z;

    /* renamed from: L */
    public static final AbstractC6344q2 f35102L = AbstractC6344q2.m29976v(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* renamed from: M */
    public static final int[] f35103M = {0, 1};
    public static final Parcelable.Creator<C6719h> CREATOR = new C6727l();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/h$a.class
     */
    /* renamed from: n9.h$a */
    /* loaded from: combined.jar:classes2.jar:n9/h$a.class */
    public static final class a {

        /* renamed from: a */
        public String f35138a;

        /* renamed from: c */
        public AbstractC6716g f35140c;

        /* renamed from: s */
        public boolean f35156s;

        /* renamed from: t */
        public boolean f35157t;

        /* renamed from: b */
        public List f35139b = C6719h.f35102L;

        /* renamed from: d */
        public int[] f35141d = C6719h.f35103M;

        /* renamed from: e */
        public int f35142e = m30959c("smallIconDrawableResId");

        /* renamed from: f */
        public int f35143f = m30959c("stopLiveStreamDrawableResId");

        /* renamed from: g */
        public int f35144g = m30959c("pauseDrawableResId");

        /* renamed from: h */
        public int f35145h = m30959c("playDrawableResId");

        /* renamed from: i */
        public int f35146i = m30959c("skipNextDrawableResId");

        /* renamed from: j */
        public int f35147j = m30959c("skipPrevDrawableResId");

        /* renamed from: k */
        public int f35148k = m30959c("forwardDrawableResId");

        /* renamed from: l */
        public int f35149l = m30959c("forward10DrawableResId");

        /* renamed from: m */
        public int f35150m = m30959c("forward30DrawableResId");

        /* renamed from: n */
        public int f35151n = m30959c("rewindDrawableResId");

        /* renamed from: o */
        public int f35152o = m30959c("rewind10DrawableResId");

        /* renamed from: p */
        public int f35153p = m30959c("rewind30DrawableResId");

        /* renamed from: q */
        public int f35154q = m30959c("disconnectDrawableResId");

        /* renamed from: r */
        public long f35155r = 10000;

        /* renamed from: c */
        public static int m30959c(String str) {
            int i10;
            try {
                Map map = ResourceProvider.f14725a;
                Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
                i10 = num == null ? 0 : num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                i10 = 0;
            }
            return i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r33v0, types: [android.os.IBinder] */
        /* renamed from: a */
        public C6719h m30960a() {
            AbstractC6716g abstractC6716g = this.f35140c;
            return new C6719h(this.f35139b, this.f35141d, this.f35155r, this.f35138a, this.f35142e, this.f35143f, this.f35144g, this.f35145h, this.f35146i, this.f35147j, this.f35148k, this.f35149l, this.f35150m, this.f35151n, this.f35152o, this.f35153p, this.f35154q, m30959c("notificationImageSizeDimenResId"), m30959c("castingToDeviceStringResId"), m30959c("stopLiveStreamStringResId"), m30959c("pauseStringResId"), m30959c("playStringResId"), m30959c("skipNextStringResId"), m30959c("skipPrevStringResId"), m30959c("forwardStringResId"), m30959c("forward10StringResId"), m30959c("forward30StringResId"), m30959c("rewindStringResId"), m30959c("rewind10StringResId"), m30959c("rewind30StringResId"), m30959c("disconnectStringResId"), abstractC6716g == null ? null : abstractC6716g.m30922a(), this.f35156s, this.f35157t);
        }

        /* renamed from: b */
        public a m30961b(String str) {
            this.f35138a = str;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [n9.x0] */
    public C6719h(List list, int[] iArr, long j10, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder, boolean z10, boolean z11) {
        this.f35115d = new ArrayList(list);
        this.f35116e = Arrays.copyOf(iArr, iArr.length);
        this.f35117f = j10;
        this.f35118g = str;
        this.f35119h = i10;
        this.f35120i = i11;
        this.f35121j = i12;
        this.f35122k = i13;
        this.f35123l = i14;
        this.f35124m = i15;
        this.f35125n = i16;
        this.f35126o = i17;
        this.f35127p = i18;
        this.f35128q = i19;
        this.f35129r = i20;
        this.f35130s = i21;
        this.f35131t = i22;
        this.f35132u = i23;
        this.f35133v = i24;
        this.f35134w = i25;
        this.f35135x = i26;
        this.f35136y = i27;
        this.f35137z = i28;
        this.f35104A = i29;
        this.f35105B = i30;
        this.f35106C = i31;
        this.f35107D = i32;
        this.f35108E = i33;
        this.f35109F = i34;
        this.f35110G = i35;
        this.f35111H = i36;
        this.f35113J = z10;
        this.f35114K = z11;
        if (iBinder == null) {
            this.f35112I = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            this.f35112I = queryLocalInterface instanceof InterfaceC6752x0 ? (InterfaceC6752x0) queryLocalInterface : new C6750w0(iBinder);
        }
    }

    /* renamed from: P */
    public List<String> m30925P() {
        return this.f35115d;
    }

    /* renamed from: Q */
    public int m30926Q() {
        return this.f35133v;
    }

    /* renamed from: R */
    public int[] m30927R() {
        int[] iArr = this.f35116e;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: S */
    public int m30928S() {
        return this.f35131t;
    }

    /* renamed from: T */
    public int m30929T() {
        return this.f35126o;
    }

    /* renamed from: U */
    public int m30930U() {
        return this.f35127p;
    }

    /* renamed from: V */
    public int m30931V() {
        return this.f35125n;
    }

    /* renamed from: W */
    public int m30932W() {
        return this.f35121j;
    }

    /* renamed from: X */
    public int m30933X() {
        return this.f35122k;
    }

    /* renamed from: Y */
    public int m30934Y() {
        return this.f35129r;
    }

    /* renamed from: Z */
    public int m30935Z() {
        return this.f35130s;
    }

    /* renamed from: a0 */
    public int m30936a0() {
        return this.f35128q;
    }

    /* renamed from: b0 */
    public int m30937b0() {
        return this.f35123l;
    }

    /* renamed from: c0 */
    public int m30938c0() {
        return this.f35124m;
    }

    /* renamed from: d0 */
    public long m30939d0() {
        return this.f35117f;
    }

    /* renamed from: e0 */
    public int m30940e0() {
        return this.f35119h;
    }

    /* renamed from: f0 */
    public int m30941f0() {
        return this.f35120i;
    }

    /* renamed from: g0 */
    public int m30942g0() {
        return this.f35134w;
    }

    /* renamed from: h0 */
    public String m30943h0() {
        return this.f35118g;
    }

    /* renamed from: i0 */
    public final int m30944i0() {
        return this.f35111H;
    }

    /* renamed from: j0 */
    public final int m30945j0() {
        return this.f35106C;
    }

    /* renamed from: k0 */
    public final int m30946k0() {
        return this.f35107D;
    }

    /* renamed from: l0 */
    public final int m30947l0() {
        return this.f35105B;
    }

    /* renamed from: m0 */
    public final int m30948m0() {
        return this.f35132u;
    }

    /* renamed from: n0 */
    public final int m30949n0() {
        return this.f35135x;
    }

    /* renamed from: o0 */
    public final int m30950o0() {
        return this.f35136y;
    }

    /* renamed from: p0 */
    public final int m30951p0() {
        return this.f35109F;
    }

    /* renamed from: q0 */
    public final int m30952q0() {
        return this.f35110G;
    }

    /* renamed from: r0 */
    public final int m30953r0() {
        return this.f35108E;
    }

    /* renamed from: s0 */
    public final int m30954s0() {
        return this.f35137z;
    }

    /* renamed from: t0 */
    public final int m30955t0() {
        return this.f35104A;
    }

    /* renamed from: u0 */
    public final InterfaceC6752x0 m30956u0() {
        return this.f35112I;
    }

    /* renamed from: w0 */
    public final boolean m30957w0() {
        return this.f35114K;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42538u(parcel, 2, m30925P(), false);
        C10127c.m42530m(parcel, 3, m30927R(), false);
        C10127c.m42532o(parcel, 4, m30939d0());
        C10127c.m42536s(parcel, 5, m30943h0(), false);
        C10127c.m42529l(parcel, 6, m30940e0());
        C10127c.m42529l(parcel, 7, m30941f0());
        C10127c.m42529l(parcel, 8, m30932W());
        C10127c.m42529l(parcel, 9, m30933X());
        C10127c.m42529l(parcel, 10, m30937b0());
        C10127c.m42529l(parcel, 11, m30938c0());
        C10127c.m42529l(parcel, 12, m30931V());
        C10127c.m42529l(parcel, 13, m30929T());
        C10127c.m42529l(parcel, 14, m30930U());
        C10127c.m42529l(parcel, 15, m30936a0());
        C10127c.m42529l(parcel, 16, m30934Y());
        C10127c.m42529l(parcel, 17, m30935Z());
        C10127c.m42529l(parcel, 18, m30928S());
        C10127c.m42529l(parcel, 19, this.f35132u);
        C10127c.m42529l(parcel, 20, m30926Q());
        C10127c.m42529l(parcel, 21, m30942g0());
        C10127c.m42529l(parcel, 22, this.f35135x);
        C10127c.m42529l(parcel, 23, this.f35136y);
        C10127c.m42529l(parcel, 24, this.f35137z);
        C10127c.m42529l(parcel, 25, this.f35104A);
        C10127c.m42529l(parcel, 26, this.f35105B);
        C10127c.m42529l(parcel, 27, this.f35106C);
        C10127c.m42529l(parcel, 28, this.f35107D);
        C10127c.m42529l(parcel, 29, this.f35108E);
        C10127c.m42529l(parcel, 30, this.f35109F);
        C10127c.m42529l(parcel, 31, this.f35110G);
        C10127c.m42529l(parcel, 32, this.f35111H);
        InterfaceC6752x0 interfaceC6752x0 = this.f35112I;
        C10127c.m42528k(parcel, 33, interfaceC6752x0 == null ? null : interfaceC6752x0.asBinder(), false);
        C10127c.m42520c(parcel, 34, this.f35113J);
        C10127c.m42520c(parcel, 35, this.f35114K);
        C10127c.m42519b(parcel, m42518a);
    }

    /* renamed from: x0 */
    public final boolean m30958x0() {
        return this.f35113J;
    }
}
