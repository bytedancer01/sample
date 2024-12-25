package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p373w.C9385e;
import p373w.C9386f;
import p373w.C9387g;
import p392x.C9601b;
import p412y.AbstractC9784b;
import p412y.C9783a;
import p412y.C9786d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/ConstraintLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/ConstraintLayout.class */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    public SparseArray<View> f2365b;

    /* renamed from: c */
    public ArrayList<AbstractC0375b> f2366c;

    /* renamed from: d */
    public C9386f f2367d;

    /* renamed from: e */
    public int f2368e;

    /* renamed from: f */
    public int f2369f;

    /* renamed from: g */
    public int f2370g;

    /* renamed from: h */
    public int f2371h;

    /* renamed from: i */
    public boolean f2372i;

    /* renamed from: j */
    public int f2373j;

    /* renamed from: k */
    public C0376c f2374k;

    /* renamed from: l */
    public C9783a f2375l;

    /* renamed from: m */
    public int f2376m;

    /* renamed from: n */
    public HashMap<String, Integer> f2377n;

    /* renamed from: o */
    public int f2378o;

    /* renamed from: p */
    public int f2379p;

    /* renamed from: q */
    public int f2380q;

    /* renamed from: r */
    public int f2381r;

    /* renamed from: s */
    public int f2382s;

    /* renamed from: t */
    public int f2383t;

    /* renamed from: u */
    public SparseArray<C9385e> f2384u;

    /* renamed from: v */
    public C0373c f2385v;

    /* renamed from: w */
    public int f2386w;

    /* renamed from: x */
    public int f2387x;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$a.class
     */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$a.class */
    public static /* synthetic */ class C0371a {

        /* renamed from: a */
        public static final int[] f2388a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                w.e$b[] r0 = p373w.C9385e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.constraintlayout.widget.ConstraintLayout.C0371a.f2388a = r0
                r0 = r4
                w.e$b r1 = p373w.C9385e.b.FIXED     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C0371a.f2388a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                w.e$b r1 = p373w.C9385e.b.WRAP_CONTENT     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C0371a.f2388a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                w.e$b r1 = p373w.C9385e.b.MATCH_PARENT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C0371a.f2388a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                w.e$b r1 = p373w.C9385e.b.MATCH_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0371a.m42998clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$b.class
     */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$b.class */
    public static class C0372b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2389A;

        /* renamed from: B */
        public String f2390B;

        /* renamed from: C */
        public float f2391C;

        /* renamed from: D */
        public int f2392D;

        /* renamed from: E */
        public float f2393E;

        /* renamed from: F */
        public float f2394F;

        /* renamed from: G */
        public int f2395G;

        /* renamed from: H */
        public int f2396H;

        /* renamed from: I */
        public int f2397I;

        /* renamed from: J */
        public int f2398J;

        /* renamed from: K */
        public int f2399K;

        /* renamed from: L */
        public int f2400L;

        /* renamed from: M */
        public int f2401M;

        /* renamed from: N */
        public int f2402N;

        /* renamed from: O */
        public float f2403O;

        /* renamed from: P */
        public float f2404P;

        /* renamed from: Q */
        public int f2405Q;

        /* renamed from: R */
        public int f2406R;

        /* renamed from: S */
        public int f2407S;

        /* renamed from: T */
        public boolean f2408T;

        /* renamed from: U */
        public boolean f2409U;

        /* renamed from: V */
        public String f2410V;

        /* renamed from: W */
        public boolean f2411W;

        /* renamed from: X */
        public boolean f2412X;

        /* renamed from: Y */
        public boolean f2413Y;

        /* renamed from: Z */
        public boolean f2414Z;

        /* renamed from: a */
        public int f2415a;

        /* renamed from: a0 */
        public boolean f2416a0;

        /* renamed from: b */
        public int f2417b;

        /* renamed from: b0 */
        public boolean f2418b0;

        /* renamed from: c */
        public float f2419c;

        /* renamed from: c0 */
        public boolean f2420c0;

        /* renamed from: d */
        public int f2421d;

        /* renamed from: d0 */
        public int f2422d0;

        /* renamed from: e */
        public int f2423e;

        /* renamed from: e0 */
        public int f2424e0;

        /* renamed from: f */
        public int f2425f;

        /* renamed from: f0 */
        public int f2426f0;

        /* renamed from: g */
        public int f2427g;

        /* renamed from: g0 */
        public int f2428g0;

        /* renamed from: h */
        public int f2429h;

        /* renamed from: h0 */
        public int f2430h0;

        /* renamed from: i */
        public int f2431i;

        /* renamed from: i0 */
        public int f2432i0;

        /* renamed from: j */
        public int f2433j;

        /* renamed from: j0 */
        public float f2434j0;

        /* renamed from: k */
        public int f2435k;

        /* renamed from: k0 */
        public int f2436k0;

        /* renamed from: l */
        public int f2437l;

        /* renamed from: l0 */
        public int f2438l0;

        /* renamed from: m */
        public int f2439m;

        /* renamed from: m0 */
        public float f2440m0;

        /* renamed from: n */
        public int f2441n;

        /* renamed from: n0 */
        public C9385e f2442n0;

        /* renamed from: o */
        public float f2443o;

        /* renamed from: o0 */
        public boolean f2444o0;

        /* renamed from: p */
        public int f2445p;

        /* renamed from: q */
        public int f2446q;

        /* renamed from: r */
        public int f2447r;

        /* renamed from: s */
        public int f2448s;

        /* renamed from: t */
        public int f2449t;

        /* renamed from: u */
        public int f2450u;

        /* renamed from: v */
        public int f2451v;

        /* renamed from: w */
        public int f2452w;

        /* renamed from: x */
        public int f2453x;

        /* renamed from: y */
        public int f2454y;

        /* renamed from: z */
        public float f2455z;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$b$a.class
         */
        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$b$a.class */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f2456a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2456a = sparseIntArray;
                sparseIntArray.append(C9786d.f44669M1, 8);
                sparseIntArray.append(C9786d.f44675N1, 9);
                sparseIntArray.append(C9786d.f44687P1, 10);
                sparseIntArray.append(C9786d.f44693Q1, 11);
                sparseIntArray.append(C9786d.f44729W1, 12);
                sparseIntArray.append(C9786d.f44723V1, 13);
                sparseIntArray.append(C9786d.f44882u1, 14);
                sparseIntArray.append(C9786d.f44876t1, 15);
                sparseIntArray.append(C9786d.f44864r1, 16);
                sparseIntArray.append(C9786d.f44888v1, 2);
                sparseIntArray.append(C9786d.f44900x1, 3);
                sparseIntArray.append(C9786d.f44894w1, 4);
                sparseIntArray.append(C9786d.f44782e2, 49);
                sparseIntArray.append(C9786d.f44789f2, 50);
                sparseIntArray.append(C9786d.f44603B1, 5);
                sparseIntArray.append(C9786d.f44609C1, 6);
                sparseIntArray.append(C9786d.f44615D1, 7);
                sparseIntArray.append(C9786d.f44760b1, 1);
                sparseIntArray.append(C9786d.f44699R1, 17);
                sparseIntArray.append(C9786d.f44705S1, 18);
                sparseIntArray.append(C9786d.f44597A1, 19);
                sparseIntArray.append(C9786d.f44912z1, 20);
                sparseIntArray.append(C9786d.f44810i2, 21);
                sparseIntArray.append(C9786d.f44829l2, 22);
                sparseIntArray.append(C9786d.f44817j2, 23);
                sparseIntArray.append(C9786d.f44796g2, 24);
                sparseIntArray.append(C9786d.f44823k2, 25);
                sparseIntArray.append(C9786d.f44803h2, 26);
                sparseIntArray.append(C9786d.f44645I1, 29);
                sparseIntArray.append(C9786d.f44735X1, 30);
                sparseIntArray.append(C9786d.f44906y1, 44);
                sparseIntArray.append(C9786d.f44657K1, 45);
                sparseIntArray.append(C9786d.f44747Z1, 46);
                sparseIntArray.append(C9786d.f44651J1, 47);
                sparseIntArray.append(C9786d.f44741Y1, 48);
                sparseIntArray.append(C9786d.f44852p1, 27);
                sparseIntArray.append(C9786d.f44846o1, 28);
                sparseIntArray.append(C9786d.f44754a2, 31);
                sparseIntArray.append(C9786d.f44621E1, 32);
                sparseIntArray.append(C9786d.f44768c2, 33);
                sparseIntArray.append(C9786d.f44761b2, 34);
                sparseIntArray.append(C9786d.f44775d2, 35);
                sparseIntArray.append(C9786d.f44633G1, 36);
                sparseIntArray.append(C9786d.f44627F1, 37);
                sparseIntArray.append(C9786d.f44639H1, 38);
                sparseIntArray.append(C9786d.f44663L1, 39);
                sparseIntArray.append(C9786d.f44717U1, 40);
                sparseIntArray.append(C9786d.f44681O1, 41);
                sparseIntArray.append(C9786d.f44870s1, 42);
                sparseIntArray.append(C9786d.f44858q1, 43);
                sparseIntArray.append(C9786d.f44711T1, 51);
            }
        }

        public C0372b(int i10, int i11) {
            super(i10, i11);
            this.f2415a = -1;
            this.f2417b = -1;
            this.f2419c = -1.0f;
            this.f2421d = -1;
            this.f2423e = -1;
            this.f2425f = -1;
            this.f2427g = -1;
            this.f2429h = -1;
            this.f2431i = -1;
            this.f2433j = -1;
            this.f2435k = -1;
            this.f2437l = -1;
            this.f2439m = -1;
            this.f2441n = 0;
            this.f2443o = 0.0f;
            this.f2445p = -1;
            this.f2446q = -1;
            this.f2447r = -1;
            this.f2448s = -1;
            this.f2449t = -1;
            this.f2450u = -1;
            this.f2451v = -1;
            this.f2452w = -1;
            this.f2453x = -1;
            this.f2454y = -1;
            this.f2455z = 0.5f;
            this.f2389A = 0.5f;
            this.f2390B = null;
            this.f2391C = 0.0f;
            this.f2392D = 1;
            this.f2393E = -1.0f;
            this.f2394F = -1.0f;
            this.f2395G = 0;
            this.f2396H = 0;
            this.f2397I = 0;
            this.f2398J = 0;
            this.f2399K = 0;
            this.f2400L = 0;
            this.f2401M = 0;
            this.f2402N = 0;
            this.f2403O = 1.0f;
            this.f2404P = 1.0f;
            this.f2405Q = -1;
            this.f2406R = -1;
            this.f2407S = -1;
            this.f2408T = false;
            this.f2409U = false;
            this.f2410V = null;
            this.f2411W = true;
            this.f2412X = true;
            this.f2413Y = false;
            this.f2414Z = false;
            this.f2416a0 = false;
            this.f2418b0 = false;
            this.f2420c0 = false;
            this.f2422d0 = -1;
            this.f2424e0 = -1;
            this.f2426f0 = -1;
            this.f2428g0 = -1;
            this.f2430h0 = -1;
            this.f2432i0 = -1;
            this.f2434j0 = 0.5f;
            this.f2442n0 = new C9385e();
            this.f2444o0 = false;
        }

        public C0372b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i10;
            float parseFloat;
            this.f2415a = -1;
            this.f2417b = -1;
            this.f2419c = -1.0f;
            this.f2421d = -1;
            this.f2423e = -1;
            this.f2425f = -1;
            this.f2427g = -1;
            this.f2429h = -1;
            this.f2431i = -1;
            this.f2433j = -1;
            this.f2435k = -1;
            this.f2437l = -1;
            this.f2439m = -1;
            this.f2441n = 0;
            this.f2443o = 0.0f;
            this.f2445p = -1;
            this.f2446q = -1;
            this.f2447r = -1;
            this.f2448s = -1;
            this.f2449t = -1;
            this.f2450u = -1;
            this.f2451v = -1;
            this.f2452w = -1;
            this.f2453x = -1;
            this.f2454y = -1;
            this.f2455z = 0.5f;
            this.f2389A = 0.5f;
            this.f2390B = null;
            this.f2391C = 0.0f;
            this.f2392D = 1;
            this.f2393E = -1.0f;
            this.f2394F = -1.0f;
            this.f2395G = 0;
            this.f2396H = 0;
            this.f2397I = 0;
            this.f2398J = 0;
            this.f2399K = 0;
            this.f2400L = 0;
            this.f2401M = 0;
            this.f2402N = 0;
            this.f2403O = 1.0f;
            this.f2404P = 1.0f;
            this.f2405Q = -1;
            this.f2406R = -1;
            this.f2407S = -1;
            this.f2408T = false;
            this.f2409U = false;
            this.f2410V = null;
            this.f2411W = true;
            this.f2412X = true;
            this.f2413Y = false;
            this.f2414Z = false;
            this.f2416a0 = false;
            this.f2418b0 = false;
            this.f2420c0 = false;
            this.f2422d0 = -1;
            this.f2424e0 = -1;
            this.f2426f0 = -1;
            this.f2428g0 = -1;
            this.f2430h0 = -1;
            this.f2432i0 = -1;
            this.f2434j0 = 0.5f;
            this.f2442n0 = new C9385e();
            this.f2444o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44753a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f2456a.get(index);
                switch (i12) {
                    case 1:
                        this.f2407S = obtainStyledAttributes.getInt(index, this.f2407S);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2439m);
                        this.f2439m = resourceId;
                        if (resourceId == -1) {
                            this.f2439m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        this.f2441n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2441n);
                        continue;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f2443o) % 360.0f;
                        this.f2443o = f10;
                        if (f10 < 0.0f) {
                            this.f2443o = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f2415a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2415a);
                        continue;
                    case 6:
                        this.f2417b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2417b);
                        continue;
                    case 7:
                        this.f2419c = obtainStyledAttributes.getFloat(index, this.f2419c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2421d);
                        this.f2421d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2421d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2423e);
                        this.f2423e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2423e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2425f);
                        this.f2425f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2425f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2427g);
                        this.f2427g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2427g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2429h);
                        this.f2429h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2429h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2431i);
                        this.f2431i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2431i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2433j);
                        this.f2433j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2433j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2435k);
                        this.f2435k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2435k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2437l);
                        this.f2437l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2437l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2445p);
                        this.f2445p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2445p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2446q);
                        this.f2446q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2446q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2447r);
                        this.f2447r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2447r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2448s);
                        this.f2448s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2448s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        this.f2449t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2449t);
                        continue;
                    case 22:
                        this.f2450u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2450u);
                        continue;
                    case 23:
                        this.f2451v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2451v);
                        continue;
                    case 24:
                        this.f2452w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2452w);
                        continue;
                    case 25:
                        this.f2453x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2453x);
                        continue;
                    case 26:
                        this.f2454y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2454y);
                        continue;
                    case 27:
                        this.f2408T = obtainStyledAttributes.getBoolean(index, this.f2408T);
                        continue;
                    case 28:
                        this.f2409U = obtainStyledAttributes.getBoolean(index, this.f2409U);
                        continue;
                    case 29:
                        this.f2455z = obtainStyledAttributes.getFloat(index, this.f2455z);
                        continue;
                    case 30:
                        this.f2389A = obtainStyledAttributes.getFloat(index, this.f2389A);
                        continue;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f2397I = i13;
                        if (i13 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.f2398J = i14;
                        if (i14 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f2399K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2399K);
                            continue;
                        } catch (Exception e10) {
                            if (obtainStyledAttributes.getInt(index, this.f2399K) == -2) {
                                this.f2399K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2401M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2401M);
                            continue;
                        } catch (Exception e11) {
                            if (obtainStyledAttributes.getInt(index, this.f2401M) == -2) {
                                this.f2401M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2403O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2403O));
                        this.f2397I = 2;
                        continue;
                    case 36:
                        try {
                            this.f2400L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2400L);
                            continue;
                        } catch (Exception e12) {
                            if (obtainStyledAttributes.getInt(index, this.f2400L) == -2) {
                                this.f2400L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2402N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2402N);
                            continue;
                        } catch (Exception e13) {
                            if (obtainStyledAttributes.getInt(index, this.f2402N) == -2) {
                                this.f2402N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f2404P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2404P));
                        this.f2398J = 2;
                        continue;
                    default:
                        switch (i12) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2390B = string;
                                this.f2391C = Float.NaN;
                                this.f2392D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2390B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String substring = this.f2390B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2392D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2392D = 1;
                                        }
                                        i10 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2390B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f2390B.substring(i10, indexOf2);
                                        String substring3 = this.f2390B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.f2392D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException e14) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f2390B.substring(i10);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.f2391C = parseFloat;
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f2393E = obtainStyledAttributes.getFloat(index, this.f2393E);
                                break;
                            case 46:
                                this.f2394F = obtainStyledAttributes.getFloat(index, this.f2394F);
                                break;
                            case 47:
                                this.f2395G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f2396H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f2405Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2405Q);
                                break;
                            case 50:
                                this.f2406R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2406R);
                                break;
                            case 51:
                                this.f2410V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            m1713a();
        }

        public C0372b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2415a = -1;
            this.f2417b = -1;
            this.f2419c = -1.0f;
            this.f2421d = -1;
            this.f2423e = -1;
            this.f2425f = -1;
            this.f2427g = -1;
            this.f2429h = -1;
            this.f2431i = -1;
            this.f2433j = -1;
            this.f2435k = -1;
            this.f2437l = -1;
            this.f2439m = -1;
            this.f2441n = 0;
            this.f2443o = 0.0f;
            this.f2445p = -1;
            this.f2446q = -1;
            this.f2447r = -1;
            this.f2448s = -1;
            this.f2449t = -1;
            this.f2450u = -1;
            this.f2451v = -1;
            this.f2452w = -1;
            this.f2453x = -1;
            this.f2454y = -1;
            this.f2455z = 0.5f;
            this.f2389A = 0.5f;
            this.f2390B = null;
            this.f2391C = 0.0f;
            this.f2392D = 1;
            this.f2393E = -1.0f;
            this.f2394F = -1.0f;
            this.f2395G = 0;
            this.f2396H = 0;
            this.f2397I = 0;
            this.f2398J = 0;
            this.f2399K = 0;
            this.f2400L = 0;
            this.f2401M = 0;
            this.f2402N = 0;
            this.f2403O = 1.0f;
            this.f2404P = 1.0f;
            this.f2405Q = -1;
            this.f2406R = -1;
            this.f2407S = -1;
            this.f2408T = false;
            this.f2409U = false;
            this.f2410V = null;
            this.f2411W = true;
            this.f2412X = true;
            this.f2413Y = false;
            this.f2414Z = false;
            this.f2416a0 = false;
            this.f2418b0 = false;
            this.f2420c0 = false;
            this.f2422d0 = -1;
            this.f2424e0 = -1;
            this.f2426f0 = -1;
            this.f2428g0 = -1;
            this.f2430h0 = -1;
            this.f2432i0 = -1;
            this.f2434j0 = 0.5f;
            this.f2442n0 = new C9385e();
            this.f2444o0 = false;
        }

        /* renamed from: a */
        public void m1713a() {
            this.f2414Z = false;
            this.f2411W = true;
            this.f2412X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f2408T) {
                this.f2411W = false;
                if (this.f2397I == 0) {
                    this.f2397I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f2409U) {
                this.f2412X = false;
                if (this.f2398J == 0) {
                    this.f2398J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2411W = false;
                if (i10 == 0 && this.f2397I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2408T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2412X = false;
                if (i11 == 0 && this.f2398J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2409U = true;
                }
            }
            if (this.f2419c == -1.0f && this.f2415a == -1 && this.f2417b == -1) {
                return;
            }
            this.f2414Z = true;
            this.f2411W = true;
            this.f2412X = true;
            if (!(this.f2442n0 instanceof C9387g)) {
                this.f2442n0 = new C9387g();
            }
            ((C9387g) this.f2442n0).m39698O0(this.f2407S);
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x01e6, code lost:
        
            if (r0 > 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01e9, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r4).rightMargin = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x020a, code lost:
        
            if (r0 > 0) goto L76;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r5) {
            /*
                Method dump skipped, instructions count: 595
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0372b.resolveLayoutDirection(int):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$c.class
     */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/ConstraintLayout$c.class */
    public class C0373c implements C9601b.b {

        /* renamed from: a */
        public ConstraintLayout f2457a;

        /* renamed from: b */
        public int f2458b;

        /* renamed from: c */
        public int f2459c;

        /* renamed from: d */
        public int f2460d;

        /* renamed from: e */
        public int f2461e;

        /* renamed from: f */
        public int f2462f;

        /* renamed from: g */
        public int f2463g;

        /* renamed from: h */
        public final ConstraintLayout f2464h;

        public C0373c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f2464h = constraintLayout;
            this.f2457a = constraintLayout2;
        }

        @Override // p392x.C9601b.b
        /* renamed from: a */
        public final void mo1714a() {
            int childCount = this.f2457a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2457a.getChildAt(i10);
                if (childAt instanceof C0378e) {
                    ((C0378e) childAt).m1766a(this.f2457a);
                }
            }
            int size = this.f2457a.f2366c.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0375b) this.f2457a.f2366c.get(i11)).m1728j(this.f2457a);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:160:0x01df, code lost:
        
            if (r13 != false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x00f2, code lost:
        
            if (r11 != false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x03a3  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x03c2  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x03d6  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0403  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0454  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0474  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0484  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x042c  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x03e2  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03af  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0388  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x04b4  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x04e9  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x04f4  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x04ba  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0349  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0373  */
        @Override // p392x.C9601b.b
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo1715b(p373w.C9385e r6, p392x.C9601b.a r7) {
            /*
                Method dump skipped, instructions count: 1313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0373c.mo1715b(w.e, x.b$a):void");
        }

        /* renamed from: c */
        public void m1716c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2458b = i12;
            this.f2459c = i13;
            this.f2460d = i14;
            this.f2461e = i15;
            this.f2462f = i10;
            this.f2463g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2365b = new SparseArray<>();
        this.f2366c = new ArrayList<>(4);
        this.f2367d = new C9386f();
        this.f2368e = 0;
        this.f2369f = 0;
        this.f2370g = Integer.MAX_VALUE;
        this.f2371h = Integer.MAX_VALUE;
        this.f2372i = true;
        this.f2373j = 263;
        this.f2374k = null;
        this.f2375l = null;
        this.f2376m = -1;
        this.f2377n = new HashMap<>();
        this.f2378o = -1;
        this.f2379p = -1;
        this.f2380q = -1;
        this.f2381r = -1;
        this.f2382s = 0;
        this.f2383t = 0;
        this.f2384u = new SparseArray<>();
        this.f2385v = new C0373c(this, this);
        this.f2386w = 0;
        this.f2387x = 0;
        m1703j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2365b = new SparseArray<>();
        this.f2366c = new ArrayList<>(4);
        this.f2367d = new C9386f();
        this.f2368e = 0;
        this.f2369f = 0;
        this.f2370g = Integer.MAX_VALUE;
        this.f2371h = Integer.MAX_VALUE;
        this.f2372i = true;
        this.f2373j = 263;
        this.f2374k = null;
        this.f2375l = null;
        this.f2376m = -1;
        this.f2377n = new HashMap<>();
        this.f2378o = -1;
        this.f2379p = -1;
        this.f2380q = -1;
        this.f2381r = -1;
        this.f2382s = 0;
        this.f2383t = 0;
        this.f2384u = new SparseArray<>();
        this.f2385v = new C0373c(this, this);
        this.f2386w = 0;
        this.f2387x = 0;
        m1703j(attributeSet, i10, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            max = max2;
        }
        return max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1696c(boolean r8, android.view.View r9, p373w.C9385e r10, androidx.constraintlayout.widget.ConstraintLayout.C0372b r11, android.util.SparseArray<p373w.C9385e> r12) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1696c(boolean, android.view.View, w.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0372b;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0372b generateDefaultLayoutParams() {
        return new C0372b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0375b> arrayList = this.f2366c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f2366c.get(i10).m1729k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        int i14 = (int) ((parseInt3 / 1080.0f) * width);
                        int i15 = (int) ((parseInt4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + i14;
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i13 + i15;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0372b generateLayoutParams(AttributeSet attributeSet) {
        return new C0372b(getContext(), attributeSet);
    }

    /* renamed from: f */
    public Object m1699f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2377n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2377n.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        m1705l();
        super.forceLayout();
    }

    /* renamed from: g */
    public final C9385e m1700g(int i10) {
        if (i10 == 0) {
            return this.f2367d;
        }
        View view = this.f2365b.get(i10);
        View view2 = view;
        if (view == null) {
            View findViewById = findViewById(i10);
            view2 = findViewById;
            if (findViewById != null) {
                view2 = findViewById;
                if (findViewById != this) {
                    view2 = findViewById;
                    if (findViewById.getParent() == this) {
                        onViewAdded(findViewById);
                        view2 = findViewById;
                    }
                }
            }
        }
        if (view2 == this) {
            return this.f2367d;
        }
        return view2 == null ? null : ((C0372b) view2.getLayoutParams()).f2442n0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0372b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f2371h;
    }

    public int getMaxWidth() {
        return this.f2370g;
    }

    public int getMinHeight() {
        return this.f2369f;
    }

    public int getMinWidth() {
        return this.f2368e;
    }

    public int getOptimizationLevel() {
        return this.f2367d.m39677S0();
    }

    /* renamed from: h */
    public View m1701h(int i10) {
        return this.f2365b.get(i10);
    }

    /* renamed from: i */
    public final C9385e m1702i(View view) {
        if (view == this) {
            return this.f2367d;
        }
        return view == null ? null : ((C0372b) view.getLayoutParams()).f2442n0;
    }

    /* renamed from: j */
    public final void m1703j(AttributeSet attributeSet, int i10, int i11) {
        this.f2367d.m39620Z(this);
        this.f2367d.m39686b1(this.f2385v);
        this.f2365b.put(getId(), this);
        this.f2374k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9786d.f44753a1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == C9786d.f44788f1) {
                    this.f2368e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2368e);
                } else if (index == C9786d.f44795g1) {
                    this.f2369f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2369f);
                } else if (index == C9786d.f44774d1) {
                    this.f2370g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2370g);
                } else if (index == C9786d.f44781e1) {
                    this.f2371h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2371h);
                } else if (index == C9786d.f44835m2) {
                    this.f2373j = obtainStyledAttributes.getInt(index, this.f2373j);
                } else if (index == C9786d.f44840n1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1706m(resourceId);
                        } catch (Resources.NotFoundException e10) {
                            this.f2375l = null;
                        }
                    }
                } else if (index == C9786d.f44828l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0376c c0376c = new C0376c();
                        this.f2374k = c0376c;
                        c0376c.m1745m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException e11) {
                        this.f2374k = null;
                    }
                    this.f2376m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2367d.m39687c1(this.f2373j);
    }

    /* renamed from: k */
    public boolean m1704k() {
        boolean z10 = false;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = false;
            if (1 == getLayoutDirection()) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: l */
    public final void m1705l() {
        this.f2372i = true;
        this.f2378o = -1;
        this.f2379p = -1;
        this.f2380q = -1;
        this.f2381r = -1;
        this.f2382s = 0;
        this.f2383t = 0;
    }

    /* renamed from: m */
    public void m1706m(int i10) {
        this.f2375l = new C9783a(getContext(), this, i10);
    }

    /* renamed from: n */
    public void m1707n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        C0373c c0373c = this.f2385v;
        int i14 = c0373c.f2461e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + c0373c.f2460d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0);
        int min = Math.min(this.f2370g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f2371h, resolveSizeAndState2 & 16777215);
        int i15 = min;
        if (z10) {
            i15 = min | 16777216;
        }
        int i16 = min2;
        if (z11) {
            i16 = min2 | 16777216;
        }
        setMeasuredDimension(i15, i16);
        this.f2378o = i15;
        this.f2379p = i16;
    }

    /* renamed from: o */
    public void m1708o(C9386f c9386f, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2385v.m1716c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max4 = Math.max(0, getPaddingLeft());
        } else if (!m1704k()) {
            max4 = max3;
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        m1711r(c9386f, mode, i14, mode2, i15);
        c9386f.m39683Y0(i10, mode, i14, mode2, i15, this.f2378o, this.f2379p, max4, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C0372b c0372b = (C0372b) childAt.getLayoutParams();
            C9385e c9385e = c0372b.f2442n0;
            if ((childAt.getVisibility() != 8 || c0372b.f2414Z || c0372b.f2416a0 || c0372b.f2420c0 || isInEditMode) && !c0372b.f2418b0) {
                int m39609O = c9385e.m39609O();
                int m39610P = c9385e.m39610P();
                int m39608N = c9385e.m39608N() + m39609O;
                int m39654t = c9385e.m39654t() + m39610P;
                childAt.layout(m39609O, m39610P, m39608N, m39654t);
                if ((childAt instanceof C0378e) && (content = ((C0378e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m39609O, m39610P, m39608N, m39654t);
                }
            }
        }
        int size = this.f2366c.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f2366c.get(i15).m1727i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f2386w = i10;
        this.f2387x = i11;
        this.f2367d.m39688d1(m1704k());
        if (this.f2372i) {
            this.f2372i = false;
            if (m1712s()) {
                this.f2367d.m39690f1();
            }
        }
        m1708o(this.f2367d, this.f2373j, i10, i11);
        m1707n(i10, i11, this.f2367d.m39608N(), this.f2367d.m39654t(), this.f2367d.m39682X0(), this.f2367d.m39680V0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C9385e m1702i = m1702i(view);
        if ((view instanceof Guideline) && !(m1702i instanceof C9387g)) {
            C0372b c0372b = (C0372b) view.getLayoutParams();
            C9387g c9387g = new C9387g();
            c0372b.f2442n0 = c9387g;
            c0372b.f2414Z = true;
            c9387g.m39698O0(c0372b.f2407S);
        }
        if (view instanceof AbstractC0375b) {
            AbstractC0375b abstractC0375b = (AbstractC0375b) view;
            abstractC0375b.m1731m();
            ((C0372b) view.getLayoutParams()).f2416a0 = true;
            if (!this.f2366c.contains(abstractC0375b)) {
                this.f2366c.add(abstractC0375b);
            }
        }
        this.f2365b.put(view.getId(), view);
        this.f2372i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2365b.remove(view.getId());
        this.f2367d.m39706I0(m1702i(view));
        this.f2366c.remove(view);
        this.f2372i = true;
    }

    /* renamed from: p */
    public final void m1709p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C9385e m1702i = m1702i(getChildAt(i10));
            if (m1702i != null) {
                m1702i.mo39617W();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m1710q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    String str = resourceName;
                    if (indexOf != -1) {
                        str = resourceName.substring(indexOf + 1);
                    }
                    m1700g(childAt.getId()).m39621a0(str);
                } catch (Resources.NotFoundException e10) {
                }
            }
        }
        if (this.f2376m != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2376m && (childAt2 instanceof C0377d)) {
                    this.f2374k = ((C0377d) childAt2).getConstraintSet();
                }
            }
        }
        C0376c c0376c = this.f2374k;
        if (c0376c != null) {
            c0376c.m1736d(this, true);
        }
        this.f2367d.m39707J0();
        int size = this.f2366c.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f2366c.get(i13).m1730l(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof C0378e) {
                ((C0378e) childAt3).m1767b(this);
            }
        }
        this.f2384u.clear();
        this.f2384u.put(0, this.f2367d);
        this.f2384u.put(getId(), this.f2367d);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2384u.put(childAt4.getId(), m1702i(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            C9385e m1702i2 = m1702i(childAt5);
            if (m1702i2 != null) {
                C0372b c0372b = (C0372b) childAt5.getLayoutParams();
                this.f2367d.m39708b(m1702i2);
                m1696c(isInEditMode, childAt5, m1702i2, c0372b, this.f2384u);
            }
        }
    }

    /* renamed from: q */
    public void m1710q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2377n == null) {
                this.f2377n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            String str2 = str;
            if (indexOf != -1) {
                str2 = str.substring(indexOf + 1);
            }
            this.f2377n.put(str2, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: r */
    public void m1711r(C9386f c9386f, int i10, int i11, int i12, int i13) {
        C9385e.b bVar;
        C0373c c0373c = this.f2385v;
        int i14 = c0373c.f2461e;
        int i15 = c0373c.f2460d;
        C9385e.b bVar2 = C9385e.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 0) {
                C9385e.b bVar3 = C9385e.b.WRAP_CONTENT;
                bVar = bVar3;
                if (childCount == 0) {
                    bVar = bVar3;
                    i11 = Math.max(0, this.f2368e);
                }
            } else if (i10 != 1073741824) {
                bVar = bVar2;
            } else {
                i11 = Math.min(this.f2370g - i15, i11);
                bVar = bVar2;
            }
            i11 = 0;
        } else {
            C9385e.b bVar4 = C9385e.b.WRAP_CONTENT;
            bVar = bVar4;
            if (childCount == 0) {
                bVar = bVar4;
                i11 = Math.max(0, this.f2368e);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 == 0) {
                C9385e.b bVar5 = C9385e.b.WRAP_CONTENT;
                bVar2 = bVar5;
                if (childCount == 0) {
                    bVar2 = bVar5;
                    i13 = Math.max(0, this.f2369f);
                }
            } else if (i12 == 1073741824) {
                i13 = Math.min(this.f2371h - i14, i13);
            }
            i13 = 0;
        } else {
            C9385e.b bVar6 = C9385e.b.WRAP_CONTENT;
            bVar2 = bVar6;
            if (childCount == 0) {
                bVar2 = bVar6;
                i13 = Math.max(0, this.f2369f);
            }
        }
        if (i11 != c9386f.m39608N() || i13 != c9386f.m39654t()) {
            c9386f.m39679U0();
        }
        c9386f.m39593C0(0);
        c9386f.m39595D0(0);
        c9386f.m39647p0(this.f2370g - i15);
        c9386f.m39645o0(this.f2371h - i14);
        c9386f.m39651r0(0);
        c9386f.m39649q0(0);
        c9386f.m39633i0(bVar);
        c9386f.m39591B0(i11);
        c9386f.m39663x0(bVar2);
        c9386f.m39627e0(i13);
        c9386f.m39651r0(this.f2368e - i15);
        c9386f.m39649q0(this.f2369f - i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m1705l();
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m1712s() {
        boolean z10;
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            m1709p();
        }
        return z10;
    }

    public void setConstraintSet(C0376c c0376c) {
        this.f2374k = c0376c;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f2365b.remove(getId());
        super.setId(i10);
        this.f2365b.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f2371h) {
            return;
        }
        this.f2371h = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f2370g) {
            return;
        }
        this.f2370g = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2369f) {
            return;
        }
        this.f2369f = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2368e) {
            return;
        }
        this.f2368e = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC9784b abstractC9784b) {
        C9783a c9783a = this.f2375l;
        if (c9783a != null) {
            c9783a.m41281c(abstractC9784b);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2373j = i10;
        this.f2367d.m39687c1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
