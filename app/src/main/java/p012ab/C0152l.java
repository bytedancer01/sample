package p012ab;

import android.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ab/l.class
 */
/* renamed from: ab.l */
/* loaded from: combined.jar:classes2.jar:ab/l.class */
public final class C0152l {

    /* renamed from: A0 */
    public static final int f843A0 = 23;

    /* renamed from: A1 */
    public static final int f844A1 = 1;

    /* renamed from: A2 */
    public static final int f845A2 = 8;

    /* renamed from: A3 */
    public static final int f846A3 = 2;

    /* renamed from: A5 */
    public static final int f848A5 = 1;

    /* renamed from: A6 */
    public static final int f849A6 = 55;

    /* renamed from: B0 */
    public static final int f851B0 = 24;

    /* renamed from: B1 */
    public static final int f852B1 = 2;

    /* renamed from: B2 */
    public static final int f853B2 = 9;

    /* renamed from: B5 */
    public static final int f856B5 = 2;

    /* renamed from: B6 */
    public static final int f857B6 = 56;

    /* renamed from: C0 */
    public static final int f859C0 = 25;

    /* renamed from: C1 */
    public static final int f860C1 = 3;

    /* renamed from: C2 */
    public static final int f861C2 = 10;

    /* renamed from: C5 */
    public static final int f864C5 = 3;

    /* renamed from: C6 */
    public static final int f865C6 = 57;

    /* renamed from: D */
    public static final int f866D = 0;

    /* renamed from: D0 */
    public static final int f867D0 = 26;

    /* renamed from: D1 */
    public static final int f868D1 = 4;

    /* renamed from: D2 */
    public static final int f869D2 = 11;

    /* renamed from: D3 */
    public static final int f870D3 = 0;

    /* renamed from: D5 */
    public static final int f872D5 = 4;

    /* renamed from: D6 */
    public static final int f873D6 = 58;

    /* renamed from: E */
    public static final int f874E = 1;

    /* renamed from: E0 */
    public static final int f875E0 = 27;

    /* renamed from: E1 */
    public static final int f876E1 = 5;

    /* renamed from: E2 */
    public static final int f877E2 = 12;

    /* renamed from: E5 */
    public static final int f880E5 = 5;

    /* renamed from: E6 */
    public static final int f881E6 = 59;

    /* renamed from: F */
    public static final int f882F = 2;

    /* renamed from: F0 */
    public static final int f883F0 = 28;

    /* renamed from: F1 */
    public static final int f884F1 = 6;

    /* renamed from: F2 */
    public static final int f885F2 = 13;

    /* renamed from: F5 */
    public static final int f888F5 = 6;

    /* renamed from: F6 */
    public static final int f889F6 = 60;

    /* renamed from: G */
    public static final int f890G = 3;

    /* renamed from: G0 */
    public static final int f891G0 = 29;

    /* renamed from: G1 */
    public static final int f892G1 = 7;

    /* renamed from: G2 */
    public static final int f893G2 = 14;

    /* renamed from: G5 */
    public static final int f896G5 = 7;

    /* renamed from: G6 */
    public static final int f897G6 = 61;

    /* renamed from: H */
    public static final int f898H = 4;

    /* renamed from: H0 */
    public static final int f899H0 = 30;

    /* renamed from: H1 */
    public static final int f900H1 = 8;

    /* renamed from: H2 */
    public static final int f901H2 = 15;

    /* renamed from: H5 */
    public static final int f904H5 = 8;

    /* renamed from: H6 */
    public static final int f905H6 = 62;

    /* renamed from: I */
    public static final int f906I = 5;

    /* renamed from: I0 */
    public static final int f907I0 = 31;

    /* renamed from: I1 */
    public static final int f908I1 = 9;

    /* renamed from: I2 */
    public static final int f909I2 = 16;

    /* renamed from: I4 */
    public static final int f911I4 = 0;

    /* renamed from: I5 */
    public static final int f912I5 = 9;

    /* renamed from: J */
    public static final int f914J = 6;

    /* renamed from: J0 */
    public static final int f915J0 = 32;

    /* renamed from: J1 */
    public static final int f916J1 = 10;

    /* renamed from: J2 */
    public static final int f917J2 = 19;

    /* renamed from: J4 */
    public static final int f919J4 = 1;

    /* renamed from: J5 */
    public static final int f920J5 = 10;

    /* renamed from: J6 */
    public static final int f921J6 = 0;

    /* renamed from: K0 */
    public static final int f923K0 = 33;

    /* renamed from: K1 */
    public static final int f924K1 = 11;

    /* renamed from: K2 */
    public static final int f925K2 = 20;

    /* renamed from: K4 */
    public static final int f927K4 = 2;

    /* renamed from: K5 */
    public static final int f928K5 = 11;

    /* renamed from: K6 */
    public static final int f929K6 = 1;

    /* renamed from: L0 */
    public static final int f931L0 = 34;

    /* renamed from: L1 */
    public static final int f932L1 = 12;

    /* renamed from: L4 */
    public static final int f935L4 = 3;

    /* renamed from: L5 */
    public static final int f936L5 = 12;

    /* renamed from: L6 */
    public static final int f937L6 = 2;

    /* renamed from: M0 */
    public static final int f939M0 = 35;

    /* renamed from: M1 */
    public static final int f940M1 = 15;

    /* renamed from: M2 */
    public static final int f941M2 = 0;

    /* renamed from: M4 */
    public static final int f943M4 = 4;

    /* renamed from: M5 */
    public static final int f944M5 = 13;

    /* renamed from: N0 */
    public static final int f947N0 = 36;

    /* renamed from: N1 */
    public static final int f948N1 = 16;

    /* renamed from: N2 */
    public static final int f949N2 = 1;

    /* renamed from: N4 */
    public static final int f951N4 = 5;

    /* renamed from: N5 */
    public static final int f952N5 = 14;

    /* renamed from: O */
    public static final int f954O = 0;

    /* renamed from: O0 */
    public static final int f955O0 = 37;

    /* renamed from: O2 */
    public static final int f957O2 = 2;

    /* renamed from: O4 */
    public static final int f959O4 = 6;

    /* renamed from: O5 */
    public static final int f960O5 = 15;

    /* renamed from: P */
    public static final int f962P = 1;

    /* renamed from: P0 */
    public static final int f963P0 = 39;

    /* renamed from: P1 */
    public static final int f964P1 = 0;

    /* renamed from: P4 */
    public static final int f967P4 = 7;

    /* renamed from: P5 */
    public static final int f968P5 = 16;

    /* renamed from: Q */
    public static final int f970Q = 2;

    /* renamed from: Q0 */
    public static final int f971Q0 = 40;

    /* renamed from: Q2 */
    public static final int f973Q2 = 1;

    /* renamed from: Q4 */
    public static final int f975Q4 = 8;

    /* renamed from: Q5 */
    public static final int f976Q5 = 17;

    /* renamed from: R */
    public static final int f978R = 3;

    /* renamed from: R0 */
    public static final int f979R0 = 41;

    /* renamed from: R1 */
    public static final int f980R1 = 0;

    /* renamed from: R2 */
    public static final int f981R2 = 2;

    /* renamed from: R4 */
    public static final int f983R4 = 9;

    /* renamed from: R5 */
    public static final int f984R5 = 18;

    /* renamed from: S */
    public static final int f986S = 4;

    /* renamed from: S1 */
    public static final int f988S1 = 1;

    /* renamed from: S2 */
    public static final int f989S2 = 3;

    /* renamed from: S4 */
    public static final int f991S4 = 10;

    /* renamed from: S5 */
    public static final int f992S5 = 19;

    /* renamed from: T */
    public static final int f994T = 5;

    /* renamed from: T0 */
    public static final int f995T0 = 0;

    /* renamed from: T2 */
    public static final int f997T2 = 4;

    /* renamed from: T4 */
    public static final int f999T4 = 11;

    /* renamed from: T5 */
    public static final int f1000T5 = 20;

    /* renamed from: U */
    public static final int f1002U = 6;

    /* renamed from: U0 */
    public static final int f1003U0 = 1;

    /* renamed from: U2 */
    public static final int f1005U2 = 6;

    /* renamed from: U3 */
    public static final int f1006U3 = 0;

    /* renamed from: U4 */
    public static final int f1007U4 = 12;

    /* renamed from: U5 */
    public static final int f1008U5 = 21;

    /* renamed from: V */
    public static final int f1010V = 7;

    /* renamed from: V0 */
    public static final int f1011V0 = 2;

    /* renamed from: V2 */
    public static final int f1013V2 = 7;

    /* renamed from: V4 */
    public static final int f1015V4 = 13;

    /* renamed from: V5 */
    public static final int f1016V5 = 22;

    /* renamed from: W */
    public static final int f1017W = 8;

    /* renamed from: W0 */
    public static final int f1018W0 = 3;

    /* renamed from: W1 */
    public static final int f1019W1 = 0;

    /* renamed from: W2 */
    public static final int f1020W2 = 8;

    /* renamed from: W4 */
    public static final int f1022W4 = 14;

    /* renamed from: W5 */
    public static final int f1023W5 = 23;

    /* renamed from: X */
    public static final int f1024X = 9;

    /* renamed from: X0 */
    public static final int f1025X0 = 4;

    /* renamed from: X1 */
    public static final int f1026X1 = 1;

    /* renamed from: X2 */
    public static final int f1027X2 = 9;

    /* renamed from: X4 */
    public static final int f1029X4 = 15;

    /* renamed from: X5 */
    public static final int f1030X5 = 24;

    /* renamed from: Y */
    public static final int f1031Y = 10;

    /* renamed from: Y0 */
    public static final int f1032Y0 = 5;

    /* renamed from: Y1 */
    public static final int f1033Y1 = 2;

    /* renamed from: Y4 */
    public static final int f1036Y4 = 16;

    /* renamed from: Y5 */
    public static final int f1037Y5 = 25;

    /* renamed from: Z */
    public static final int f1038Z = 11;

    /* renamed from: Z0 */
    public static final int f1039Z0 = 6;

    /* renamed from: Z2 */
    public static final int f1041Z2 = 0;

    /* renamed from: Z4 */
    public static final int f1043Z4 = 17;

    /* renamed from: Z5 */
    public static final int f1044Z5 = 26;

    /* renamed from: a3 */
    public static final int f1049a3 = 1;

    /* renamed from: a4 */
    public static final int f1050a4 = 0;

    /* renamed from: a5 */
    public static final int f1051a5 = 18;

    /* renamed from: a6 */
    public static final int f1052a6 = 27;

    /* renamed from: b3 */
    public static final int f1057b3 = 2;

    /* renamed from: b5 */
    public static final int f1059b5 = 19;

    /* renamed from: b6 */
    public static final int f1060b6 = 28;

    /* renamed from: c1 */
    public static final int f1063c1 = 0;

    /* renamed from: c3 */
    public static final int f1065c3 = 3;

    /* renamed from: c5 */
    public static final int f1067c5 = 20;

    /* renamed from: c6 */
    public static final int f1068c6 = 29;

    /* renamed from: d0 */
    public static final int f1070d0 = 0;

    /* renamed from: d1 */
    public static final int f1071d1 = 1;

    /* renamed from: d3 */
    public static final int f1073d3 = 4;

    /* renamed from: d4 */
    public static final int f1074d4 = 0;

    /* renamed from: d5 */
    public static final int f1075d5 = 21;

    /* renamed from: d6 */
    public static final int f1076d6 = 30;

    /* renamed from: e0 */
    public static final int f1078e0 = 1;

    /* renamed from: e3 */
    public static final int f1081e3 = 5;

    /* renamed from: e4 */
    public static final int f1082e4 = 1;

    /* renamed from: e5 */
    public static final int f1083e5 = 22;

    /* renamed from: e6 */
    public static final int f1084e6 = 31;

    /* renamed from: f0 */
    public static final int f1086f0 = 2;

    /* renamed from: f1 */
    public static final int f1087f1 = 0;

    /* renamed from: f3 */
    public static final int f1089f3 = 6;

    /* renamed from: f4 */
    public static final int f1090f4 = 2;

    /* renamed from: f5 */
    public static final int f1091f5 = 23;

    /* renamed from: f6 */
    public static final int f1092f6 = 32;

    /* renamed from: g0 */
    public static final int f1094g0 = 3;

    /* renamed from: g1 */
    public static final int f1095g1 = 1;

    /* renamed from: g3 */
    public static final int f1097g3 = 7;

    /* renamed from: g4 */
    public static final int f1098g4 = 3;

    /* renamed from: g5 */
    public static final int f1099g5 = 24;

    /* renamed from: g6 */
    public static final int f1100g6 = 33;

    /* renamed from: h0 */
    public static final int f1102h0 = 4;

    /* renamed from: h1 */
    public static final int f1103h1 = 2;

    /* renamed from: h3 */
    public static final int f1105h3 = 8;

    /* renamed from: h4 */
    public static final int f1106h4 = 4;

    /* renamed from: h5 */
    public static final int f1107h5 = 25;

    /* renamed from: h6 */
    public static final int f1108h6 = 34;

    /* renamed from: i0 */
    public static final int f1110i0 = 5;

    /* renamed from: i3 */
    public static final int f1113i3 = 9;

    /* renamed from: i4 */
    public static final int f1114i4 = 5;

    /* renamed from: i6 */
    public static final int f1116i6 = 35;

    /* renamed from: j0 */
    public static final int f1118j0 = 6;

    /* renamed from: j4 */
    public static final int f1122j4 = 6;

    /* renamed from: j5 */
    public static final int f1123j5 = 0;

    /* renamed from: j6 */
    public static final int f1124j6 = 36;

    /* renamed from: k0 */
    public static final int f1126k0 = 7;

    /* renamed from: k4 */
    public static final int f1130k4 = 7;

    /* renamed from: k5 */
    public static final int f1131k5 = 1;

    /* renamed from: k6 */
    public static final int f1132k6 = 37;

    /* renamed from: l */
    public static final int f1133l = 0;

    /* renamed from: l0 */
    public static final int f1134l0 = 8;

    /* renamed from: l3 */
    public static final int f1137l3 = 0;

    /* renamed from: l4 */
    public static final int f1138l4 = 8;

    /* renamed from: l5 */
    public static final int f1139l5 = 2;

    /* renamed from: l6 */
    public static final int f1140l6 = 38;

    /* renamed from: m */
    public static final int f1141m = 1;

    /* renamed from: m0 */
    public static final int f1142m0 = 9;

    /* renamed from: m3 */
    public static final int f1145m3 = 1;

    /* renamed from: m4 */
    public static final int f1146m4 = 9;

    /* renamed from: m5 */
    public static final int f1147m5 = 3;

    /* renamed from: m6 */
    public static final int f1148m6 = 39;

    /* renamed from: n */
    public static final int f1149n = 2;

    /* renamed from: n0 */
    public static final int f1150n0 = 10;

    /* renamed from: n5 */
    public static final int f1155n5 = 4;

    /* renamed from: n6 */
    public static final int f1156n6 = 40;

    /* renamed from: o */
    public static final int f1157o = 3;

    /* renamed from: o0 */
    public static final int f1158o0 = 11;

    /* renamed from: o3 */
    public static final int f1161o3 = 0;

    /* renamed from: o5 */
    public static final int f1163o5 = 5;

    /* renamed from: o6 */
    public static final int f1164o6 = 41;

    /* renamed from: p */
    public static final int f1165p = 4;

    /* renamed from: p0 */
    public static final int f1166p0 = 12;

    /* renamed from: p3 */
    public static final int f1169p3 = 1;

    /* renamed from: p5 */
    public static final int f1171p5 = 6;

    /* renamed from: p6 */
    public static final int f1172p6 = 42;

    /* renamed from: q */
    public static final int f1173q = 5;

    /* renamed from: q0 */
    public static final int f1174q0 = 13;

    /* renamed from: q2 */
    public static final int f1176q2 = 0;

    /* renamed from: q5 */
    public static final int f1179q5 = 7;

    /* renamed from: q6 */
    public static final int f1180q6 = 43;

    /* renamed from: r */
    public static final int f1181r = 6;

    /* renamed from: r0 */
    public static final int f1182r0 = 14;

    /* renamed from: r3 */
    public static final int f1185r3 = 0;

    /* renamed from: r4 */
    public static final int f1186r4 = 0;

    /* renamed from: r5 */
    public static final int f1187r5 = 8;

    /* renamed from: r6 */
    public static final int f1188r6 = 44;

    /* renamed from: s */
    public static final int f1189s = 7;

    /* renamed from: s0 */
    public static final int f1190s0 = 15;

    /* renamed from: s2 */
    public static final int f1192s2 = 0;

    /* renamed from: s3 */
    public static final int f1193s3 = 1;

    /* renamed from: s4 */
    public static final int f1194s4 = 1;

    /* renamed from: s5 */
    public static final int f1195s5 = 9;

    /* renamed from: s6 */
    public static final int f1196s6 = 45;

    /* renamed from: t0 */
    public static final int f1198t0 = 16;

    /* renamed from: t2 */
    public static final int f1200t2 = 1;

    /* renamed from: t4 */
    public static final int f1202t4 = 2;

    /* renamed from: t5 */
    public static final int f1203t5 = 10;

    /* renamed from: t6 */
    public static final int f1204t6 = 46;

    /* renamed from: u0 */
    public static final int f1206u0 = 17;

    /* renamed from: u2 */
    public static final int f1208u2 = 2;

    /* renamed from: u3 */
    public static final int f1209u3 = 0;

    /* renamed from: u4 */
    public static final int f1210u4 = 3;

    /* renamed from: u5 */
    public static final int f1211u5 = 12;

    /* renamed from: u6 */
    public static final int f1212u6 = 47;

    /* renamed from: v */
    public static final int f1213v = 0;

    /* renamed from: v0 */
    public static final int f1214v0 = 18;

    /* renamed from: v2 */
    public static final int f1216v2 = 3;

    /* renamed from: v3 */
    public static final int f1217v3 = 1;

    /* renamed from: v4 */
    public static final int f1218v4 = 4;

    /* renamed from: v5 */
    public static final int f1219v5 = 14;

    /* renamed from: v6 */
    public static final int f1220v6 = 48;

    /* renamed from: w */
    public static final int f1221w = 1;

    /* renamed from: w0 */
    public static final int f1222w0 = 19;

    /* renamed from: w1 */
    public static final int f1223w1 = 0;

    /* renamed from: w2 */
    public static final int f1224w2 = 4;

    /* renamed from: w3 */
    public static final int f1225w3 = 2;

    /* renamed from: w4 */
    public static final int f1226w4 = 5;

    /* renamed from: w6 */
    public static final int f1228w6 = 49;

    /* renamed from: x0 */
    public static final int f1230x0 = 20;

    /* renamed from: x1 */
    public static final int f1231x1 = 1;

    /* renamed from: x2 */
    public static final int f1232x2 = 5;

    /* renamed from: x4 */
    public static final int f1234x4 = 6;

    /* renamed from: x5 */
    public static final int f1235x5 = 0;

    /* renamed from: x6 */
    public static final int f1236x6 = 50;

    /* renamed from: y0 */
    public static final int f1238y0 = 21;

    /* renamed from: y2 */
    public static final int f1240y2 = 6;

    /* renamed from: y3 */
    public static final int f1241y3 = 0;

    /* renamed from: y4 */
    public static final int f1242y4 = 7;

    /* renamed from: y6 */
    public static final int f1244y6 = 51;

    /* renamed from: z0 */
    public static final int f1246z0 = 22;

    /* renamed from: z1 */
    public static final int f1247z1 = 0;

    /* renamed from: z2 */
    public static final int f1248z2 = 7;

    /* renamed from: z3 */
    public static final int f1249z3 = 1;

    /* renamed from: z5 */
    public static final int f1251z5 = 0;

    /* renamed from: z6 */
    public static final int f1252z6 = 52;

    /* renamed from: a */
    public static final int[] f1045a = {2130968655, 2130968662, 2130968663, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130968927, 2130968969, 2130968970, 2130969010, 2130969178, 2130969185, 2130969194, 2130969195, 2130969199, 2130969219, 2130969244, 2130969373, 2130969505, 2130969617, 2130969634, 2130969635, 2130969812, 2130969815, 2130969920, 2130969930};

    /* renamed from: b */
    public static final int[] f1053b = {R.attr.layout_gravity};

    /* renamed from: c */
    public static final int[] f1061c = {R.attr.minWidth};

    /* renamed from: d */
    public static final int[] f1069d = new int[0];

    /* renamed from: e */
    public static final int[] f1077e = {2130968655, 2130968662, 2130968843, 2130969178, 2130969815, 2130969930};

    /* renamed from: f */
    public static final int[] f1085f = {2130969037, 2130969228};

    /* renamed from: g */
    public static final int[] f1093g = {R.attr.layout, 2130968725, 2130968726, 2130969362, 2130969363, 2130969500, 2130969758, 2130969773};

    /* renamed from: h */
    public static final int[] f1101h = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: i */
    public static final int[] f1109i = {R.attr.id, R.attr.drawable};

    /* renamed from: j */
    public static final int[] f1117j = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};

    /* renamed from: k */
    public static final int[] f1125k = {R.attr.background, R.attr.touchscreenBlocksFocus, R.attr.keyboardNavigationCluster, 2130969010, 2130969038, 2130969351, 2130969352, 2130969805};

    /* renamed from: t */
    public static final int[] f1197t = {2130969799, 2130969800, 2130969802, 2130969803};

    /* renamed from: u */
    public static final int[] f1205u = {2130969344, 2130969345};

    /* renamed from: x */
    public static final int[] f1229x = {R.attr.src, 2130969789, 2130969918, 2130969919};

    /* renamed from: y */
    public static final int[] f1237y = {R.attr.thumb, 2130969913, 2130969914, 2130969915};

    /* renamed from: z */
    public static final int[] f1245z = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};

    /* renamed from: A */
    public static final int[] f842A = {R.attr.textAppearance, 2130968648, 2130968649, 2130968650, 2130968651, 2130968652, 2130968991, 2130968992, 2130968993, 2130968994, 2130968996, 2130968997, 2130968998, 2130968999, 2130969073, 2130969101, 2130969110, 2130969270, 2130969354, 2130969865, 2130969893};

    /* renamed from: B */
    public static final int[] f850B = $d2j$hex$61bf4a5d$decode_I("57000101ae0001010400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1000047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2900047f2d00047f2e00047f2f00047f3000047f4700047f7100047f8e00047f8f00047f9000047f9100047f9200047f9800047f9900047fda00047fe300047f1401047f1501047f1601047f1701047f1801047f1901047f1a01047f2101047f2201047f2901047f4201047f8001047f8501047f8601047f8e01047f9001047faa01047fab01047fae01047faf01047fb101047f6a02047f7b02047f0e03047f0f03047f1003047f1103047f1403047f1503047f1603047f1703047f1803047f1903047f1a03047f1b03047f1c03047fca03047fcb03047fcc03047f1004047f1204047f2804047f2a04047f2b04047f2c04047f6004047f6404047f6604047f6704047fba04047fbb04047fe404047f1405047f1605047f1705047f1805047f1a05047f1b05047f1c05047f1d05047f2005047f2105047f4c05047f4d05047f4e05047f4f05047f7505047f7f05047f8005047f8105047f8205047f8305047f8405047f8505047f8605047f8705047f8805047f");

    /* renamed from: C */
    public static final int[] f858C = {2130968656, 2130968667, 2130968669, 2130969197, 2130969408, 2130969513, 2130969972};

    /* renamed from: K */
    public static final int[] f922K = {R.attr.indeterminate, 2130969183, 2130969220, 2130969468, 2130969747, 2130969749, 2130969943, 2130969946, 2130969948};

    /* renamed from: L */
    public static final int[] f930L = {2130968664, 2130969010, 2130969052, 2130969053, 2130969054, 2130969055, 2130969056, 2130969186, 2130969540, 2130969542, 2130969543};

    /* renamed from: M */
    public static final int[] f938M = {2130968664, 2130969010, 2130969236, 2130969239, 2130969241, 2130969242, 2130969245, 2130969257, 2130969258, 2130969259, 2130969269, 2130969461};

    /* renamed from: N */
    public static final int[] f946N = {R.attr.elevation, 2130968664, 2130968679, 2130968680, 2130968681, 2130968682, 2130968683, 2130968685, 2130968686, 2130968687, 2130969118, 2130969720, 2130969723};

    /* renamed from: a0 */
    public static final int[] f1046a0 = {2130968630};

    /* renamed from: b0 */
    public static final int[] f1054b0 = {R.attr.minWidth, R.attr.minHeight, 2130968734, 2130968735, 2130968736, 2130968739, 2130968740, 2130968742, 2130968889, 2130968890, 2130968892, 2130968893, 2130968895};

    /* renamed from: c0 */
    public static final int[] f1062c0 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, 2130968797, 2130968798, 2130968801, 2130968802, 2130968804, 2130968805, 2130968806, 2130968808, 2130968809, 2130968810, 2130968811, 2130968812, 2130968813, 2130968814, 2130968819, 2130968820, 2130968821, 2130968823, 2130968836, 2130968837, 2130968838, 2130968839, 2130968840, 2130968841, 2130968842, 2130969023, 2130969184, 2130969200, 2130969205, 2130969668, 2130969720, 2130969723, 2130969754, 2130969890, 2130969894};

    /* renamed from: S0 */
    public static final int[] f987S0 = {2130968796, 2130968815, 2130968816, 2130968817, 2130969707, 2130969774, 2130969776};

    /* renamed from: a1 */
    public static final int[] f1047a1 = {2130969221, 2130969223, 2130969225};

    /* renamed from: b1 */
    public static final int[] f1055b1 = {2130968832, 2130968835};

    /* renamed from: e1 */
    public static final int[] f1079e1 = {2130968833, 2130969400, 2130969708};

    /* renamed from: i1 */
    public static final int[] f1111i1 = {2130968848, 2130968849, 2130968896, 2130969040, 2130969041, 2130969042, 2130969043, 2130969044, 2130969045, 2130969046, 2130969412, 2130969681, 2130969683, 2130969806, 2130969920, 2130969921, 2130969931};

    /* renamed from: j1 */
    public static final int[] f1119j1 = {2130969280, 2130969281};

    /* renamed from: k1 */
    public static final int[] f1127k1 = {R.attr.color, R.attr.alpha, 2130968631};

    /* renamed from: l1 */
    public static final int[] f1135l1 = {R.attr.button, 2130968723, 2130968730, 2130968731};

    /* renamed from: m1 */
    public static final int[] f1143m1 = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, 2130968634, 2130968673, 2130968674, 2130968675, 2130968792, 2130968879, 2130968990, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087, 2130969088, 2130969089, 2130969091, 2130969092, 2130969093, 2130969094, 2130969095, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969313, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969481, 2130969482, 2130969554, 2130969580, 2130969952, 2130969954, 2130969974};

    /* renamed from: n1 */
    public static final int[] f1151n1 = {R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, 2130968673, 2130968674, 2130968675, 2130968792, 2130968876, 2130968879, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087, 2130969088, 2130969089, 2130969091, 2130969092, 2130969093, 2130969094, 2130969095, 2130969273, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969313, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969342};

    /* renamed from: o1 */
    public static final int[] f1159o1 = {2130968881, 2130969584};

    /* renamed from: p1 */
    public static final int[] f1167p1 = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.pivotX, R.attr.pivotY, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, 2130968634, 2130968673, 2130968674, 2130968675, 2130968792, 2130968879, 2130968954, 2130968990, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087, 2130969088, 2130969089, 2130969091, 2130969092, 2130969093, 2130969094, 2130969095, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969313, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969481, 2130969482, 2130969554, 2130969580, 2130969952, 2130969954};

    /* renamed from: q1 */
    public static final int[] f1175q1 = {2130969266, 2130969804};

    /* renamed from: r1 */
    public static final int[] f1183r1 = {R.attr.layout_gravity, 2130969277, 2130969278, 2130969279, 2130969324, 2130969336, 2130969337};

    /* renamed from: s1 */
    public static final int[] f1191s1 = {2130968646, 2130968921, 2130968922, 2130968923, 2130968924, 2130968925, 2130968926, 2130968928, 2130968929};

    /* renamed from: t1 */
    public static final int[] f1199t1 = {2130968643, 2130968645, 2130968670, 2130968851, 2130968995, 2130969117, 2130969785, 2130969897};

    /* renamed from: u1 */
    public static final int[] f1207u1 = {2130968847, 2130969010, 2130969047, 2130969184, 2130969754, 2130969768};

    /* renamed from: v1 */
    public static final int[] f1215v1 = {2130968677, 2130968678};

    /* renamed from: y1 */
    public static final int[] f1239y1 = {R.attr.enabled, 2130968664, 2130968665, 2130968688, 2130969010, 2130969023, 2130969057, 2130969058, 2130969184, 2130969198, 2130969410, 2130969633, 2130969668, 2130969720, 2130969723, 2130969754, 2130969963};

    /* renamed from: O1 */
    public static final int[] f956O1 = {2130968677};

    /* renamed from: Q1 */
    public static final int[] f972Q1 = {2130969253, 2130969355};

    /* renamed from: T1 */
    public static final int[] f996T1 = {2130969102, 2130969103, 2130969104, 2130969105, 2130969106, 2130969107, 2130969108};

    /* renamed from: U1 */
    public static final int[] f1004U1 = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130969100, 2130969109, 2130969110, 2130969111, 2130969959};

    /* renamed from: V1 */
    public static final int[] f1012V1 = {R.attr.foreground, R.attr.foregroundGravity, 2130969112};

    /* renamed from: Z1 */
    public static final int[] f1040Z1 = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};

    /* renamed from: a2 */
    public static final int[] f1048a2 = {R.attr.color, R.attr.offset};

    /* renamed from: b2 */
    public static final int[] f1056b2 = {2130968633, 2130968705, 2130968897, 2130968918, 2130969535, 2130969669, 2130969670, 2130969679, 2130969976};

    /* renamed from: c2 */
    public static final int[] f1064c2 = {2130969540, 2130969542, 2130969543};

    /* renamed from: d2 */
    public static final int[] f1072d2 = {R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968920, 2130969115, 2130969481, 2130969483, 2130969952, 2130969954};

    /* renamed from: e2 */
    public static final int[] f1080e2 = {R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968920, 2130969115, 2130969481, 2130969483, 2130969952, 2130969954, 2130969978, 2130969979, 2130969980, 2130969981};

    /* renamed from: f2 */
    public static final int[] f1088f2 = {2130968920, 2130968990, 2130969115, 2130969264, 2130969483, 2130969554, 2130969557, 2130969558, 2130969559, 2130969560, 2130969777, 2130969952};

    /* renamed from: g2 */
    public static final int[] f1096g2 = {R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968920, 2130969115, 2130969481, 2130969483, 2130969952, 2130969954, 2130969977, 2130969978, 2130969979, 2130969980};

    /* renamed from: h2 */
    public static final int[] f1104h2 = {2130969115, 2130969483, 2130969484, 2130969485, 2130969517, 2130969519, 2130969520, 2130969956, 2130969957, 2130969958};

    /* renamed from: i2 */
    public static final int[] f1112i2 = {R.attr.orientation, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.layout_marginStart, R.attr.layout_marginEnd, 2130968673, 2130968674, 2130968675, 2130968792, 2130968879, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969409, 2130969414, 2130969467, 2130969471};

    /* renamed from: j2 */
    public static final int[] f1120j2 = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130968970, 2130968975, 2130969444, 2130969753};

    /* renamed from: k2 */
    public static final int[] f1128k2 = {R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};

    /* renamed from: l2 */
    public static final int[] f1136l2 = {2130969218, 2130969222};

    /* renamed from: m2 */
    public static final int[] f1144m2 = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: n2 */
    public static final int[] f1152n2 = {2130968657, 2130968658, 2130968659, 2130968660};

    /* renamed from: o2 */
    public static final int[] f1160o2 = {2130969377, 2130969378, 2130969379, 2130969380, 2130969381};

    /* renamed from: p2 */
    public static final int[] f1168p2 = {R.attr.inputType};

    /* renamed from: r2 */
    public static final int[] f1184r2 = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, 2130968664, 2130968665, 2130968906, 2130969010, 2130969199, 2130969201, 2130969202, 2130969203, 2130969206, 2130969207, 2130969668, 2130969720, 2130969723, 2130969808, 2130969809};

    /* renamed from: L2 */
    public static final int[] f933L2 = {2130968795, 2130969707, 2130969776};

    /* renamed from: P2 */
    public static final int[] f965P2 = {R.attr.windowFullscreen, 2130968934, 2130968935, 2130968936, 2130968937, C0142b.f664x, 2130969641, 2130969993, 2130969994, 2130969995};

    /* renamed from: Y2 */
    public static final int[] f1034Y2 = {R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, 2130969237, 2130969246, 2130969247, 2130969254, 2130969255, 2130969259};

    /* renamed from: j3 */
    public static final int[] f1121j3 = {R.attr.checkable, 2130968738, 2130968797, 2130968799, 2130968800, 2130968801, 2130969668, 2130969720, 2130969723, C0142b.f633B, 2130969808, 2130969809};

    /* renamed from: k3 */
    public static final int[] f1129k3 = {2130968730, 2130969965};

    /* renamed from: n3 */
    public static final int[] f1153n3 = {2130968730, 2130969965};

    /* renamed from: q3 */
    public static final int[] f1177q3 = {2130969720, 2130969723};

    /* renamed from: t3 */
    public static final int[] f1201t3 = {R.attr.letterSpacing, R.attr.lineHeight, 2130969354};

    /* renamed from: x3 */
    public static final int[] f1233x3 = {R.attr.textAppearance, R.attr.lineHeight, 2130969354};

    /* renamed from: B3 */
    public static final int[] f854B3 = {2130968834, 2130969265};

    /* renamed from: C3 */
    public static final int[] f862C3 = {2130969504};

    /* renamed from: E3 */
    public static final int[] f878E3 = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: F3 */
    public static final int[] f886F3 = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, 2130968593, 2130968613, 2130968615, 2130968632, 2130968882, 2130969206, 2130969207, 2130969516, 2130969748, 2130969937};

    /* renamed from: G3 */
    public static final int[] f894G3 = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130969632, 2130969810};

    /* renamed from: H3 */
    public static final int[] f902H3 = {2130969472, 2130969473, 2130969474, 2130969475, 2130969476, 2130969477};

    /* renamed from: I3 */
    public static final int[] f910I3 = {2130968634, 2130968990, 2130969480, 2130969482, 2130969554, 2130969952};

    /* renamed from: J3 */
    public static final int[] f918J3 = {2130969518, 2130969521};

    /* renamed from: K3 */
    public static final int[] f926K3 = {2130968638, 2130968919, 2130969273, 2130969478, 2130969481, 2130969755};

    /* renamed from: L3 */
    public static final int[] f934L3 = {2130968940, 2130969274};

    /* renamed from: M3 */
    public static final int[] f942M3 = {2130969861, 2130969862, 2130969863};

    /* renamed from: N3 */
    public static final int[] f950N3 = {R.attr.background, R.attr.fitsSystemWindows, R.attr.maxWidth, 2130969010, 2130969175, 2130969236, 2130969238, 2130969240, 2130969241, 2130969242, 2130969243, 2130969246, 2130969247, 2130969248, 2130969249, 2130969250, 2130969251, 2130969252, 2130969256, 2130969259, 2130969461, 2130969720, 2130969723};

    /* renamed from: O3 */
    public static final int[] f958O3 = {2130968831, 2130969859};

    /* renamed from: P3 */
    public static final int[] f966P3 = {2130968987, 2130968988, 2130968989, 2130969353, 2130969405, 2130969413, 2130969486, 2130969509, 2130969522, 2130969938, 2130969939, 2130969940};

    /* renamed from: Q3 */
    public static final int[] f974Q3 = {R.attr.popupBackground, R.attr.popupAnimationStyle, 2130969534};

    /* renamed from: R3 */
    public static final int[] f982R3 = {2130969798};

    /* renamed from: S3 */
    public static final int[] f990S3 = {R.attr.visibility, R.attr.alpha, 2130969313, 2130969481, 2130969974};

    /* renamed from: T3 */
    public static final int[] f998T3 = {2130969400};

    /* renamed from: V3 */
    public static final int[] f1014V3 = {2130969469, 2130969970};

    /* renamed from: W3 */
    public static final int[] f1021W3 = {2130969539, 2130969545};

    /* renamed from: X3 */
    public static final int[] f1028X3 = {R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, 2130969059, 2130969060, 2130969061, 2130969062, 2130969063, 2130969275, 2130969666, 2130969784, 2130969790};

    /* renamed from: Y3 */
    public static final int[] f1035Y3 = {2130969230};

    /* renamed from: Z3 */
    public static final int[] f1042Z3 = {2130968684};

    /* renamed from: b4 */
    public static final int[] f1058b4 = {R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130968836, 2130968875, 2130968942, 2130969120, 2130969208, 2130969272, 2130969637, 2130969638, 2130969689, 2130969690, 2130969811, 2130969819, 2130969975};

    /* renamed from: c4 */
    public static final int[] f1066c4 = {2130968901, 2130968902, 2130968903, 2130968904, 2130968905, 2130968907, 2130968908, 2130968909, 2130968910, 2130968911};

    /* renamed from: n4 */
    public static final int[] f1154n4 = {2130968889, 2130968890, 2130968891, 2130968892, 2130968893, 2130968894, 2130968895, 2130969720, 2130969723, 2130969808, 2130969809};

    /* renamed from: o4 */
    public static final int[] f1162o4 = {R.attr.enabled, R.attr.value, R.attr.stepSize, R.attr.valueFrom, R.attr.valueTo, 2130969173, 2130969174, 2130969267, 2130969268, 2130969898, 2130969899, 2130969900, 2130969901, 2130969902, 2130969910, 2130969911, 2130969912, 2130969916, 2130969943, 2130969944, 2130969945, 2130969947};

    /* renamed from: p4 */
    public static final int[] f1170p4 = {2130969781, 2130969782, 2130969783};

    /* renamed from: q4 */
    public static final int[] f1178q4 = {R.attr.maxWidth, 2130968614, 2130968635, 2130968661, 2130968664, 2130968665, 2130969010, 2130969406};

    /* renamed from: z4 */
    public static final int[] f1250z4 = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130969617};

    /* renamed from: A4 */
    public static final int[] f847A4 = {R.attr.id, 2130968880};

    /* renamed from: B4 */
    public static final int[] f855B4 = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: C4 */
    public static final int[] f863C4 = {R.attr.drawable};

    /* renamed from: D4 */
    public static final int[] f871D4 = {2130968948};

    /* renamed from: E4 */
    public static final int[] f879E4 = {R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130969757, 2130969788, 2130969824, 2130969825, 2130969829, 2130969903, 2130969904, 2130969905, 2130969942, 2130969949, 2130969950};

    /* renamed from: F4 */
    public static final int[] f887F4 = {2130969965};

    /* renamed from: G4 */
    public static final int[] f895G4 = {R.attr.icon, R.attr.layout, R.attr.text};

    /* renamed from: H4 */
    public static final int[] f903H4 = {2130969832, 2130969833, 2130969834, 2130969835, 2130969836, 2130969837, 2130969838, 2130969839, 2130969840, 2130969841, 2130969842, 2130969843, 2130969844, 2130969845, 2130969846, 2130969847, 2130969848, 2130969849, 2130969850, 2130969851, 2130969852, 2130969853, 2130969854, 2130969856, 2130969857, 2130969858};

    /* renamed from: i5 */
    public static final int[] f1115i5 = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, 2130969101, 2130969110, 2130969865, 2130969893};

    /* renamed from: w5 */
    public static final int[] f1227w5 = {2130969891};

    /* renamed from: y5 */
    public static final int[] f1243y5 = {R.attr.enabled, R.attr.textColorHint, R.attr.hint, 2130968694, 2130968695, 2130968696, 2130968697, 2130968698, 2130968699, 2130968700, 2130968701, 2130968702, 2130968703, 2130968704, 2130968912, 2130968913, 2130968914, 2130968915, 2130968916, 2130968917, 2130969015, 2130969016, 2130969017, 2130969018, 2130969019, 2130969020, 2130969028, 2130969029, 2130969030, 2130969031, 2130969032, 2130969034, 2130969035, 2130969039, 2130969179, 2130969180, 2130969181, 2130969182, 2130969190, 2130969191, 2130969192, 2130969193, 2130969549, 2130969550, 2130969551, 2130969552, 2130969553, 2130969581, 2130969582, 2130969583, 2130969629, 2130969630, 2130969631, 2130969720, 2130969723, 2130969793, 2130969794, 2130969795, 2130969796, 2130969797, 2130969816, 2130969817, 2130969818};

    /* renamed from: I6 */
    public static final int[] f913I6 = {R.attr.textAppearance, 2130969021, 2130969022};

    /* renamed from: M6 */
    public static final int[] f945M6 = {R.attr.gravity, R.attr.minHeight, 2130968724, 2130968845, 2130968846, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130969373, 2130969374, 2130969407, 2130969461, 2130969502, 2130969503, 2130969617, 2130969812, 2130969813, 2130969814, 2130969920, 2130969922, 2130969923, 2130969924, 2130969925, 2130969926, 2130969927, 2130969928, 2130969929};

    /* renamed from: N6 */
    public static final int[] f953N6 = {R.attr.textAppearance, R.attr.padding, R.attr.layout_margin, R.attr.minWidth, R.attr.minHeight, R.attr.text, 2130968664};

    /* renamed from: O6 */
    public static final int[] f961O6 = {R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation};

    /* renamed from: P6 */
    public static final int[] f969P6 = {R.attr.id, 2130968653, 2130968877, 2130968878, 2130969005, 2130969274, 2130969479, 2130969554, 2130969791, 2130969951, 2130969953};

    /* renamed from: Q6 */
    public static final int[] f977Q6 = {2130968880, 2130969653, 2130969654, 2130969655, 2130969656};

    /* renamed from: R6 */
    public static final int[] f985R6 = {R.attr.theme, R.attr.focusable, 2130969541, 2130969544, 2130969895};

    /* renamed from: S6 */
    public static final int[] f993S6 = {R.attr.background, 2130968664, 2130968665};

    /* renamed from: T6 */
    public static final int[] f1001T6 = {R.attr.orientation};

    /* renamed from: U6 */
    public static final int[] f1009U6 = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    private static long[] $d2j$hex$61bf4a5d$decode_J(String src) {
        byte[] d10 = $d2j$hex$61bf4a5d$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$61bf4a5d$decode_I(String src) {
        byte[] d10 = $d2j$hex$61bf4a5d$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$61bf4a5d$decode_S(String src) {
        byte[] d10 = $d2j$hex$61bf4a5d$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$61bf4a5d$decode_B(String src) {
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
