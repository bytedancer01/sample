package p029c;

import android.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c/j.class
 */
/* renamed from: c.j */
/* loaded from: combined.jar:classes1.jar:c/j.class */
public final class C0929j {

    /* renamed from: A */
    public static final int f6282A = 2;

    /* renamed from: A0 */
    public static final int f6283A0 = 0;

    /* renamed from: A1 */
    public static final int f6284A1 = 0;

    /* renamed from: A2 */
    public static final int f6285A2 = 9;

    /* renamed from: A3 */
    public static final int f6286A3 = 8;

    /* renamed from: B */
    public static final int f6287B = 3;

    /* renamed from: B0 */
    public static final int f6288B0 = 1;

    /* renamed from: B1 */
    public static final int f6289B1 = 1;

    /* renamed from: B2 */
    public static final int f6290B2 = 10;

    /* renamed from: B3 */
    public static final int f6291B3 = 9;

    /* renamed from: C */
    public static final int f6292C = 4;

    /* renamed from: C0 */
    public static final int f6293C0 = 86;

    /* renamed from: C1 */
    public static final int f6294C1 = 2;

    /* renamed from: C2 */
    public static final int f6295C2 = 11;

    /* renamed from: C3 */
    public static final int f6296C3 = 10;

    /* renamed from: D */
    public static final int f6297D = 5;

    /* renamed from: D0 */
    public static final int f6298D0 = 116;

    /* renamed from: D1 */
    public static final int f6299D1 = 3;

    /* renamed from: D2 */
    public static final int f6300D2 = 12;

    /* renamed from: D3 */
    public static final int f6301D3 = 11;

    /* renamed from: E0 */
    public static final int f6303E0 = 117;

    /* renamed from: E1 */
    public static final int f6304E1 = 4;

    /* renamed from: E2 */
    public static final int f6305E2 = 13;

    /* renamed from: E3 */
    public static final int f6306E3 = 12;

    /* renamed from: F0 */
    public static final int f6308F0 = 118;

    /* renamed from: F1 */
    public static final int f6309F1 = 5;

    /* renamed from: F2 */
    public static final int f6310F2 = 14;

    /* renamed from: F3 */
    public static final int f6311F3 = 13;

    /* renamed from: G */
    public static final int f6312G = 0;

    /* renamed from: G0 */
    public static final int f6313G0 = 119;

    /* renamed from: G2 */
    public static final int f6315G2 = 15;

    /* renamed from: G3 */
    public static final int f6316G3 = 14;

    /* renamed from: H */
    public static final int f6317H = 1;

    /* renamed from: H0 */
    public static final int f6318H0 = 120;

    /* renamed from: H1 */
    public static final int f6319H1 = 0;

    /* renamed from: H2 */
    public static final int f6320H2 = 16;

    /* renamed from: H3 */
    public static final int f6321H3 = 15;

    /* renamed from: I */
    public static final int f6322I = 2;

    /* renamed from: I0 */
    public static final int f6323I0 = 121;

    /* renamed from: I1 */
    public static final int f6324I1 = 1;

    /* renamed from: I3 */
    public static final int f6326I3 = 16;

    /* renamed from: J */
    public static final int f6327J = 3;

    /* renamed from: J0 */
    public static final int f6328J0 = 122;

    /* renamed from: J1 */
    public static final int f6329J1 = 2;

    /* renamed from: J2 */
    public static final int f6330J2 = 0;

    /* renamed from: J3 */
    public static final int f6331J3 = 17;

    /* renamed from: K */
    public static final int f6332K = 4;

    /* renamed from: K0 */
    public static final int f6333K0 = 123;

    /* renamed from: K1 */
    public static final int f6334K1 = 3;

    /* renamed from: K2 */
    public static final int f6335K2 = 1;

    /* renamed from: K3 */
    public static final int f6336K3 = 18;

    /* renamed from: L */
    public static final int f6337L = 5;

    /* renamed from: L0 */
    public static final int f6338L0 = 124;

    /* renamed from: L1 */
    public static final int f6339L1 = 4;

    /* renamed from: L2 */
    public static final int f6340L2 = 2;

    /* renamed from: L3 */
    public static final int f6341L3 = 19;

    /* renamed from: M */
    public static final int f6342M = 6;

    /* renamed from: M0 */
    public static final int f6343M0 = 125;

    /* renamed from: M1 */
    public static final int f6344M1 = 5;

    /* renamed from: M2 */
    public static final int f6345M2 = 3;

    /* renamed from: M3 */
    public static final int f6346M3 = 20;

    /* renamed from: N */
    public static final int f6347N = 7;

    /* renamed from: N0 */
    public static final int f6348N0 = 126;

    /* renamed from: N1 */
    public static final int f6349N1 = 6;

    /* renamed from: N2 */
    public static final int f6350N2 = 4;

    /* renamed from: N3 */
    public static final int f6351N3 = 21;

    /* renamed from: O1 */
    public static final int f6354O1 = 7;

    /* renamed from: O3 */
    public static final int f6356O3 = 22;

    /* renamed from: P0 */
    public static final int f6358P0 = 0;

    /* renamed from: P1 */
    public static final int f6359P1 = 8;

    /* renamed from: P3 */
    public static final int f6361P3 = 23;

    /* renamed from: Q1 */
    public static final int f6364Q1 = 9;

    /* renamed from: Q3 */
    public static final int f6366Q3 = 24;

    /* renamed from: R1 */
    public static final int f6369R1 = 10;

    /* renamed from: R2 */
    public static final int f6370R2 = 0;

    /* renamed from: R3 */
    public static final int f6371R3 = 25;

    /* renamed from: S */
    public static final int f6372S = 1;

    /* renamed from: S0 */
    public static final int f6373S0 = 0;

    /* renamed from: S1 */
    public static final int f6374S1 = 11;

    /* renamed from: S2 */
    public static final int f6375S2 = 1;

    /* renamed from: S3 */
    public static final int f6376S3 = 26;

    /* renamed from: T */
    public static final int f6377T = 2;

    /* renamed from: T0 */
    public static final int f6378T0 = 1;

    /* renamed from: T1 */
    public static final int f6379T1 = 12;

    /* renamed from: T2 */
    public static final int f6380T2 = 2;

    /* renamed from: T3 */
    public static final int f6381T3 = 27;

    /* renamed from: U */
    public static final int f6382U = 3;

    /* renamed from: U0 */
    public static final int f6383U0 = 2;

    /* renamed from: U1 */
    public static final int f6384U1 = 13;

    /* renamed from: U2 */
    public static final int f6385U2 = 3;

    /* renamed from: U3 */
    public static final int f6386U3 = 28;

    /* renamed from: V0 */
    public static final int f6388V0 = 3;

    /* renamed from: V1 */
    public static final int f6389V1 = 14;

    /* renamed from: V2 */
    public static final int f6390V2 = 4;

    /* renamed from: V3 */
    public static final int f6391V3 = 29;

    /* renamed from: W */
    public static final int f6392W = 0;

    /* renamed from: W1 */
    public static final int f6394W1 = 15;

    /* renamed from: W2 */
    public static final int f6395W2 = 5;

    /* renamed from: X */
    public static final int f6397X = 1;

    /* renamed from: X0 */
    public static final int f6398X0 = 0;

    /* renamed from: X1 */
    public static final int f6399X1 = 16;

    /* renamed from: X2 */
    public static final int f6400X2 = 6;

    /* renamed from: X3 */
    public static final int f6401X3 = 0;

    /* renamed from: Y */
    public static final int f6402Y = 2;

    /* renamed from: Y0 */
    public static final int f6403Y0 = 1;

    /* renamed from: Y1 */
    public static final int f6404Y1 = 17;

    /* renamed from: Y2 */
    public static final int f6405Y2 = 7;

    /* renamed from: Y3 */
    public static final int f6406Y3 = 4;

    /* renamed from: Z */
    public static final int f6407Z = 3;

    /* renamed from: Z0 */
    public static final int f6408Z0 = 2;

    /* renamed from: Z1 */
    public static final int f6409Z1 = 18;

    /* renamed from: Z2 */
    public static final int f6410Z2 = 8;

    /* renamed from: a1 */
    public static final int f6414a1 = 3;

    /* renamed from: a2 */
    public static final int f6415a2 = 19;

    /* renamed from: a3 */
    public static final int f6416a3 = 9;

    /* renamed from: a4 */
    public static final int f6417a4 = 0;

    /* renamed from: b */
    public static final int f6418b = 0;

    /* renamed from: b0 */
    public static final int f6419b0 = 0;

    /* renamed from: b1 */
    public static final int f6420b1 = 4;

    /* renamed from: b2 */
    public static final int f6421b2 = 20;

    /* renamed from: b3 */
    public static final int f6422b3 = 10;

    /* renamed from: b4 */
    public static final int f6423b4 = 1;

    /* renamed from: c */
    public static final int f6424c = 1;

    /* renamed from: c0 */
    public static final int f6425c0 = 1;

    /* renamed from: c1 */
    public static final int f6426c1 = 5;

    /* renamed from: c2 */
    public static final int f6427c2 = 21;

    /* renamed from: c3 */
    public static final int f6428c3 = 11;

    /* renamed from: c4 */
    public static final int f6429c4 = 2;

    /* renamed from: d */
    public static final int f6430d = 2;

    /* renamed from: d0 */
    public static final int f6431d0 = 2;

    /* renamed from: d1 */
    public static final int f6432d1 = 6;

    /* renamed from: d2 */
    public static final int f6433d2 = 22;

    /* renamed from: d3 */
    public static final int f6434d3 = 12;

    /* renamed from: e */
    public static final int f6436e = 3;

    /* renamed from: e0 */
    public static final int f6437e0 = 3;

    /* renamed from: e1 */
    public static final int f6438e1 = 7;

    /* renamed from: e3 */
    public static final int f6440e3 = 13;

    /* renamed from: e4 */
    public static final int f6441e4 = 0;

    /* renamed from: f */
    public static final int f6442f = 7;

    /* renamed from: f0 */
    public static final int f6443f0 = 4;

    /* renamed from: f2 */
    public static final int f6445f2 = 1;

    /* renamed from: f4 */
    public static final int f6447f4 = 1;

    /* renamed from: g */
    public static final int f6448g = 9;

    /* renamed from: g0 */
    public static final int f6449g0 = 5;

    /* renamed from: g2 */
    public static final int f6451g2 = 5;

    /* renamed from: g3 */
    public static final int f6452g3 = 0;

    /* renamed from: g4 */
    public static final int f6453g4 = 2;

    /* renamed from: h */
    public static final int f6454h = 10;

    /* renamed from: h0 */
    public static final int f6455h0 = 6;

    /* renamed from: h2 */
    public static final int f6457h2 = 7;

    /* renamed from: h3 */
    public static final int f6458h3 = 1;

    /* renamed from: i */
    public static final int f6459i = 12;

    /* renamed from: i2 */
    public static final int f6462i2 = 8;

    /* renamed from: i3 */
    public static final int f6463i3 = 2;

    /* renamed from: j */
    public static final int f6464j = 13;

    /* renamed from: j0 */
    public static final int f6465j0 = 1;

    /* renamed from: j3 */
    public static final int f6468j3 = 3;

    /* renamed from: k */
    public static final int f6469k = 14;

    /* renamed from: k0 */
    public static final int f6470k0 = 2;

    /* renamed from: k2 */
    public static final int f6472k2 = 0;

    /* renamed from: k3 */
    public static final int f6473k3 = 4;

    /* renamed from: l */
    public static final int f6474l = 15;

    /* renamed from: l0 */
    public static final int f6475l0 = 3;

    /* renamed from: l2 */
    public static final int f6477l2 = 2;

    /* renamed from: l3 */
    public static final int f6478l3 = 5;

    /* renamed from: m */
    public static final int f6479m = 17;

    /* renamed from: m0 */
    public static final int f6480m0 = 4;

    /* renamed from: m1 */
    public static final int f6481m1 = 0;

    /* renamed from: m3 */
    public static final int f6483m3 = 10;

    /* renamed from: n */
    public static final int f6484n = 20;

    /* renamed from: n0 */
    public static final int f6485n0 = 5;

    /* renamed from: n1 */
    public static final int f6486n1 = 1;

    /* renamed from: n3 */
    public static final int f6488n3 = 11;

    /* renamed from: o */
    public static final int f6489o = 22;

    /* renamed from: o0 */
    public static final int f6490o0 = 6;

    /* renamed from: o1 */
    public static final int f6491o1 = 2;

    /* renamed from: o2 */
    public static final int f6492o2 = 0;

    /* renamed from: o3 */
    public static final int f6493o3 = 12;

    /* renamed from: p */
    public static final int f6494p = 25;

    /* renamed from: p0 */
    public static final int f6495p0 = 7;

    /* renamed from: p1 */
    public static final int f6496p1 = 3;

    /* renamed from: p2 */
    public static final int f6497p2 = 1;

    /* renamed from: p3 */
    public static final int f6498p3 = 13;

    /* renamed from: q */
    public static final int f6499q = 26;

    /* renamed from: q0 */
    public static final int f6500q0 = 8;

    /* renamed from: q1 */
    public static final int f6501q1 = 4;

    /* renamed from: q3 */
    public static final int f6503q3 = 14;

    /* renamed from: r */
    public static final int f6504r = 27;

    /* renamed from: r0 */
    public static final int f6505r0 = 9;

    /* renamed from: r1 */
    public static final int f6506r1 = 5;

    /* renamed from: r2 */
    public static final int f6507r2 = 0;

    /* renamed from: r3 */
    public static final int f6508r3 = 15;

    /* renamed from: s */
    public static final int f6509s = 28;

    /* renamed from: s0 */
    public static final int f6510s0 = 10;

    /* renamed from: s1 */
    public static final int f6511s1 = 6;

    /* renamed from: s2 */
    public static final int f6512s2 = 1;

    /* renamed from: t0 */
    public static final int f6515t0 = 11;

    /* renamed from: t1 */
    public static final int f6516t1 = 7;

    /* renamed from: t2 */
    public static final int f6517t2 = 2;

    /* renamed from: t3 */
    public static final int f6518t3 = 0;

    /* renamed from: u */
    public static final int f6519u = 0;

    /* renamed from: u0 */
    public static final int f6520u0 = 12;

    /* renamed from: u1 */
    public static final int f6521u1 = 8;

    /* renamed from: u2 */
    public static final int f6522u2 = 3;

    /* renamed from: u3 */
    public static final int f6523u3 = 2;

    /* renamed from: v0 */
    public static final int f6525v0 = 13;

    /* renamed from: v2 */
    public static final int f6527v2 = 4;

    /* renamed from: v3 */
    public static final int f6528v3 = 3;

    /* renamed from: w */
    public static final int f6529w = 0;

    /* renamed from: w0 */
    public static final int f6530w0 = 14;

    /* renamed from: w2 */
    public static final int f6532w2 = 5;

    /* renamed from: w3 */
    public static final int f6533w3 = 4;

    /* renamed from: x0 */
    public static final int f6535x0 = 17;

    /* renamed from: x1 */
    public static final int f6536x1 = 0;

    /* renamed from: x2 */
    public static final int f6537x2 = 6;

    /* renamed from: x3 */
    public static final int f6538x3 = 5;

    /* renamed from: y0 */
    public static final int f6540y0 = 18;

    /* renamed from: y1 */
    public static final int f6541y1 = 1;

    /* renamed from: y2 */
    public static final int f6542y2 = 7;

    /* renamed from: y3 */
    public static final int f6543y3 = 6;

    /* renamed from: z */
    public static final int f6544z = 0;

    /* renamed from: z2 */
    public static final int f6547z2 = 8;

    /* renamed from: z3 */
    public static final int f6548z3 = 7;

    /* renamed from: a */
    public static final int[] f6412a = {2130968655, 2130968662, 2130968663, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130968927, 2130968969, 2130968970, 2130969010, 2130969178, 2130969185, 2130969194, 2130969195, 2130969199, 2130969219, 2130969244, 2130969373, 2130969505, 2130969617, 2130969634, 2130969635, 2130969812, 2130969815, 2130969920, 2130969930};

    /* renamed from: t */
    public static final int[] f6514t = {R.attr.layout_gravity};

    /* renamed from: v */
    public static final int[] f6524v = {R.attr.minWidth};

    /* renamed from: x */
    public static final int[] f6534x = new int[0];

    /* renamed from: y */
    public static final int[] f6539y = {2130968655, 2130968662, 2130968843, 2130969178, 2130969815, 2130969930};

    /* renamed from: E */
    public static final int[] f6302E = {2130969037, 2130969228};

    /* renamed from: F */
    public static final int[] f6307F = {R.attr.layout, 2130968725, 2130968726, 2130969362, 2130969363, 2130969500, 2130969758, 2130969773};

    /* renamed from: O */
    public static final int[] f6352O = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: P */
    public static final int[] f6357P = {R.attr.id, R.attr.drawable};

    /* renamed from: Q */
    public static final int[] f6362Q = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};

    /* renamed from: R */
    public static final int[] f6367R = {R.attr.src, 2130969789, 2130969918, 2130969919};

    /* renamed from: V */
    public static final int[] f6387V = {R.attr.thumb, 2130969913, 2130969914, 2130969915};

    /* renamed from: a0 */
    public static final int[] f6413a0 = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};

    /* renamed from: i0 */
    public static final int[] f6460i0 = {R.attr.textAppearance, 2130968648, 2130968649, 2130968650, 2130968651, 2130968652, 2130968991, 2130968992, 2130968993, 2130968994, 2130968996, 2130968997, 2130968998, 2130968999, 2130969073, 2130969101, 2130969110, 2130969270, 2130969354, 2130969865, 2130969893};

    /* renamed from: z0 */
    public static final int[] f6545z0 = $d2j$hex$d19c1f99$decode_I("57000101ae0001010400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1000047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2900047f2d00047f2e00047f2f00047f3000047f4700047f7100047f8e00047f8f00047f9000047f9100047f9200047f9800047f9900047fda00047fe300047f1401047f1501047f1601047f1701047f1801047f1901047f1a01047f2101047f2201047f2901047f4201047f8001047f8501047f8601047f8e01047f9001047faa01047fab01047fae01047faf01047fb101047f6a02047f7b02047f0e03047f0f03047f1003047f1103047f1403047f1503047f1603047f1703047f1803047f1903047f1a03047f1b03047f1c03047fca03047fcb03047fcc03047f1004047f1204047f2804047f2a04047f2b04047f2c04047f6004047f6404047f6604047f6704047fba04047fbb04047fe404047f1405047f1605047f1705047f1805047f1a05047f1b05047f1c05047f1d05047f2005047f2105047f4c05047f4d05047f4e05047f4f05047f7505047f7f05047f8005047f8105047f8205047f8305047f8405047f8505047f8605047f8705047f8805047f");

    /* renamed from: O0 */
    public static final int[] f6353O0 = {2130968630};

    /* renamed from: Q0 */
    public static final int[] f6363Q0 = {R.attr.color, R.attr.alpha, 2130968631};

    /* renamed from: R0 */
    public static final int[] f6368R0 = {R.attr.button, 2130968723, 2130968730, 2130968731};

    /* renamed from: W0 */
    public static final int[] f6393W0 = {2130968643, 2130968645, 2130968670, 2130968851, 2130968995, 2130969117, 2130969785, 2130969897};

    /* renamed from: f1 */
    public static final int[] f6444f1 = {2130969102, 2130969103, 2130969104, 2130969105, 2130969106, 2130969107, 2130969108};

    /* renamed from: g1 */
    public static final int[] f6450g1 = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130969100, 2130969109, 2130969110, 2130969111, 2130969959};

    /* renamed from: h1 */
    public static final int[] f6456h1 = {R.attr.name, R.attr.id, R.attr.tag};

    /* renamed from: i1 */
    public static final int[] f6461i1 = {R.attr.name, R.attr.tag};

    /* renamed from: j1 */
    public static final int[] f6466j1 = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};

    /* renamed from: k1 */
    public static final int[] f6471k1 = {R.attr.color, R.attr.offset};

    /* renamed from: l1 */
    public static final int[] f6476l1 = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130968970, 2130968975, 2130969444, 2130969753};

    /* renamed from: v1 */
    public static final int[] f6526v1 = {R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};

    /* renamed from: w1 */
    public static final int[] f6531w1 = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: z1 */
    public static final int[] f6546z1 = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: G1 */
    public static final int[] f6314G1 = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, 2130968593, 2130968613, 2130968615, 2130968632, 2130968882, 2130969206, 2130969207, 2130969516, 2130969748, 2130969937};

    /* renamed from: e2 */
    public static final int[] f6439e2 = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130969632, 2130969810};

    /* renamed from: j2 */
    public static final int[] f6467j2 = {R.attr.popupBackground, R.attr.popupAnimationStyle, 2130969534};

    /* renamed from: m2 */
    public static final int[] f6482m2 = {2130969798};

    /* renamed from: n2 */
    public static final int[] f6487n2 = {2130969539, 2130969545};

    /* renamed from: q2 */
    public static final int[] f6502q2 = {R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130968836, 2130968875, 2130968942, 2130969120, 2130969208, 2130969272, 2130969637, 2130969638, 2130969689, 2130969690, 2130969811, 2130969819, 2130969975};

    /* renamed from: I2 */
    public static final int[] f6325I2 = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130969617};

    /* renamed from: O2 */
    public static final int[] f6355O2 = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: P2 */
    public static final int[] f6360P2 = {R.attr.drawable};

    /* renamed from: Q2 */
    public static final int[] f6365Q2 = {R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130969757, 2130969788, 2130969824, 2130969825, 2130969829, 2130969903, 2130969904, 2130969905, 2130969942, 2130969949, 2130969950};

    /* renamed from: f3 */
    public static final int[] f6446f3 = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, 2130969101, 2130969110, 2130969865, 2130969893};

    /* renamed from: s3 */
    public static final int[] f6513s3 = {R.attr.gravity, R.attr.minHeight, 2130968724, 2130968845, 2130968846, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130969373, 2130969374, 2130969407, 2130969461, 2130969502, 2130969503, 2130969617, 2130969812, 2130969813, 2130969814, 2130969920, 2130969922, 2130969923, 2130969924, 2130969925, 2130969926, 2130969927, 2130969928, 2130969929};

    /* renamed from: W3 */
    public static final int[] f6396W3 = {R.attr.theme, R.attr.focusable, 2130969541, 2130969544, 2130969895};

    /* renamed from: Z3 */
    public static final int[] f6411Z3 = {R.attr.background, 2130968664, 2130968665};

    /* renamed from: d4 */
    public static final int[] f6435d4 = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    private static long[] $d2j$hex$d19c1f99$decode_J(String src) {
        byte[] d10 = $d2j$hex$d19c1f99$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$d19c1f99$decode_I(String src) {
        byte[] d10 = $d2j$hex$d19c1f99$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$d19c1f99$decode_S(String src) {
        byte[] d10 = $d2j$hex$d19c1f99$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$d19c1f99$decode_B(String src) {
        int hh2;
        int i10;
        char[] d10 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i11 = 0; i11 < ret.length; i11++) {
            char h10 = d10[2 * i11];
            char l10 = d10[(2 * i11) + 1];
            if (h10 >= '0' && h10 <= '9') {
                hh2 = h10 - '0';
            } else if (h10 >= 'a' && h10 <= 'f') {
                hh2 = (h10 - 'a') + 10;
            } else if (h10 >= 'A' && h10 <= 'F') {
                hh2 = (h10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l10 >= '0' && l10 <= '9') {
                i10 = l10 - '0';
            } else if (l10 >= 'a' && l10 <= 'f') {
                i10 = (l10 - 'a') + 10;
            } else if (l10 >= 'A' && l10 <= 'F') {
                i10 = (l10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i10;
            ret[i11] = (byte) ((hh2 << 4) | ll);
        }
        return ret;
    }
}
