package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0377d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p325t.C8589a;
import p340u.C8782a;
import p412y.C9785c;
import p412y.C9786d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/c.class
 */
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/c.class */
public class C0376c {

    /* renamed from: d */
    public static final int[] f2481d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f2482e;

    /* renamed from: a */
    public HashMap<String, C0374a> f2483a = new HashMap<>();

    /* renamed from: b */
    public boolean f2484b = true;

    /* renamed from: c */
    public HashMap<Integer, a> f2485c = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/c$a.class
     */
    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/c$a.class */
    public static class a {

        /* renamed from: a */
        public int f2486a;

        /* renamed from: b */
        public final d f2487b = new d();

        /* renamed from: c */
        public final c f2488c = new c();

        /* renamed from: d */
        public final b f2489d = new b();

        /* renamed from: e */
        public final e f2490e = new e();

        /* renamed from: f */
        public HashMap<String, C0374a> f2491f = new HashMap<>();

        /* renamed from: d */
        public void m1751d(ConstraintLayout.C0372b c0372b) {
            b bVar = this.f2489d;
            c0372b.f2421d = bVar.f2533h;
            c0372b.f2423e = bVar.f2535i;
            c0372b.f2425f = bVar.f2537j;
            c0372b.f2427g = bVar.f2539k;
            c0372b.f2429h = bVar.f2540l;
            c0372b.f2431i = bVar.f2541m;
            c0372b.f2433j = bVar.f2542n;
            c0372b.f2435k = bVar.f2543o;
            c0372b.f2437l = bVar.f2544p;
            c0372b.f2445p = bVar.f2545q;
            c0372b.f2446q = bVar.f2546r;
            c0372b.f2447r = bVar.f2547s;
            c0372b.f2448s = bVar.f2548t;
            ((ViewGroup.MarginLayoutParams) c0372b).leftMargin = bVar.f2496D;
            ((ViewGroup.MarginLayoutParams) c0372b).rightMargin = bVar.f2497E;
            ((ViewGroup.MarginLayoutParams) c0372b).topMargin = bVar.f2498F;
            ((ViewGroup.MarginLayoutParams) c0372b).bottomMargin = bVar.f2499G;
            c0372b.f2453x = bVar.f2507O;
            c0372b.f2454y = bVar.f2506N;
            c0372b.f2450u = bVar.f2503K;
            c0372b.f2452w = bVar.f2505M;
            c0372b.f2455z = bVar.f2549u;
            c0372b.f2389A = bVar.f2550v;
            c0372b.f2439m = bVar.f2552x;
            c0372b.f2441n = bVar.f2553y;
            c0372b.f2443o = bVar.f2554z;
            c0372b.f2390B = bVar.f2551w;
            c0372b.f2405Q = bVar.f2493A;
            c0372b.f2406R = bVar.f2494B;
            c0372b.f2394F = bVar.f2508P;
            c0372b.f2393E = bVar.f2509Q;
            c0372b.f2396H = bVar.f2511S;
            c0372b.f2395G = bVar.f2510R;
            c0372b.f2408T = bVar.f2534h0;
            c0372b.f2409U = bVar.f2536i0;
            c0372b.f2397I = bVar.f2512T;
            c0372b.f2398J = bVar.f2513U;
            c0372b.f2401M = bVar.f2514V;
            c0372b.f2402N = bVar.f2515W;
            c0372b.f2399K = bVar.f2516X;
            c0372b.f2400L = bVar.f2517Y;
            c0372b.f2403O = bVar.f2518Z;
            c0372b.f2404P = bVar.f2520a0;
            c0372b.f2407S = bVar.f2495C;
            c0372b.f2419c = bVar.f2531g;
            c0372b.f2415a = bVar.f2527e;
            c0372b.f2417b = bVar.f2529f;
            ((ViewGroup.MarginLayoutParams) c0372b).width = bVar.f2523c;
            ((ViewGroup.MarginLayoutParams) c0372b).height = bVar.f2525d;
            String str = bVar.f2532g0;
            if (str != null) {
                c0372b.f2410V = str;
            }
            c0372b.setMarginStart(bVar.f2501I);
            c0372b.setMarginEnd(this.f2489d.f2500H);
            c0372b.m1713a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2489d.m1756a(this.f2489d);
            aVar.f2488c.m1758a(this.f2488c);
            aVar.f2487b.m1760a(this.f2487b);
            aVar.f2490e.m1762a(this.f2490e);
            aVar.f2486a = this.f2486a;
            return aVar;
        }

        /* renamed from: f */
        public final void m1753f(int i10, ConstraintLayout.C0372b c0372b) {
            this.f2486a = i10;
            b bVar = this.f2489d;
            bVar.f2533h = c0372b.f2421d;
            bVar.f2535i = c0372b.f2423e;
            bVar.f2537j = c0372b.f2425f;
            bVar.f2539k = c0372b.f2427g;
            bVar.f2540l = c0372b.f2429h;
            bVar.f2541m = c0372b.f2431i;
            bVar.f2542n = c0372b.f2433j;
            bVar.f2543o = c0372b.f2435k;
            bVar.f2544p = c0372b.f2437l;
            bVar.f2545q = c0372b.f2445p;
            bVar.f2546r = c0372b.f2446q;
            bVar.f2547s = c0372b.f2447r;
            bVar.f2548t = c0372b.f2448s;
            bVar.f2549u = c0372b.f2455z;
            bVar.f2550v = c0372b.f2389A;
            bVar.f2551w = c0372b.f2390B;
            bVar.f2552x = c0372b.f2439m;
            bVar.f2553y = c0372b.f2441n;
            bVar.f2554z = c0372b.f2443o;
            bVar.f2493A = c0372b.f2405Q;
            bVar.f2494B = c0372b.f2406R;
            bVar.f2495C = c0372b.f2407S;
            bVar.f2531g = c0372b.f2419c;
            bVar.f2527e = c0372b.f2415a;
            bVar.f2529f = c0372b.f2417b;
            bVar.f2523c = ((ViewGroup.MarginLayoutParams) c0372b).width;
            bVar.f2525d = ((ViewGroup.MarginLayoutParams) c0372b).height;
            bVar.f2496D = ((ViewGroup.MarginLayoutParams) c0372b).leftMargin;
            bVar.f2497E = ((ViewGroup.MarginLayoutParams) c0372b).rightMargin;
            bVar.f2498F = ((ViewGroup.MarginLayoutParams) c0372b).topMargin;
            bVar.f2499G = ((ViewGroup.MarginLayoutParams) c0372b).bottomMargin;
            bVar.f2508P = c0372b.f2394F;
            bVar.f2509Q = c0372b.f2393E;
            bVar.f2511S = c0372b.f2396H;
            bVar.f2510R = c0372b.f2395G;
            bVar.f2534h0 = c0372b.f2408T;
            bVar.f2536i0 = c0372b.f2409U;
            bVar.f2512T = c0372b.f2397I;
            bVar.f2513U = c0372b.f2398J;
            bVar.f2514V = c0372b.f2401M;
            bVar.f2515W = c0372b.f2402N;
            bVar.f2516X = c0372b.f2399K;
            bVar.f2517Y = c0372b.f2400L;
            bVar.f2518Z = c0372b.f2403O;
            bVar.f2520a0 = c0372b.f2404P;
            bVar.f2532g0 = c0372b.f2410V;
            bVar.f2503K = c0372b.f2450u;
            bVar.f2505M = c0372b.f2452w;
            bVar.f2502J = c0372b.f2449t;
            bVar.f2504L = c0372b.f2451v;
            bVar.f2507O = c0372b.f2453x;
            bVar.f2506N = c0372b.f2454y;
            bVar.f2500H = c0372b.getMarginEnd();
            this.f2489d.f2501I = c0372b.getMarginStart();
        }

        /* renamed from: g */
        public final void m1754g(int i10, C0377d.a aVar) {
            m1753f(i10, aVar);
            this.f2487b.f2566d = aVar.f2585p0;
            e eVar = this.f2490e;
            eVar.f2570b = aVar.f2588s0;
            eVar.f2571c = aVar.f2589t0;
            eVar.f2572d = aVar.f2590u0;
            eVar.f2573e = aVar.f2591v0;
            eVar.f2574f = aVar.f2592w0;
            eVar.f2575g = aVar.f2593x0;
            eVar.f2576h = aVar.f2594y0;
            eVar.f2577i = aVar.f2595z0;
            eVar.f2578j = aVar.f2583A0;
            eVar.f2579k = aVar.f2584B0;
            eVar.f2581m = aVar.f2587r0;
            eVar.f2580l = aVar.f2586q0;
        }

        /* renamed from: h */
        public final void m1755h(AbstractC0375b abstractC0375b, int i10, C0377d.a aVar) {
            m1754g(i10, aVar);
            if (abstractC0375b instanceof Barrier) {
                b bVar = this.f2489d;
                bVar.f2526d0 = 1;
                Barrier barrier = (Barrier) abstractC0375b;
                bVar.f2522b0 = barrier.getType();
                this.f2489d.f2528e0 = barrier.getReferencedIds();
                this.f2489d.f2524c0 = barrier.getMargin();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/c$b.class
     */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/c$b.class */
    public static class b {

        /* renamed from: k0 */
        public static SparseIntArray f2492k0;

        /* renamed from: c */
        public int f2523c;

        /* renamed from: d */
        public int f2525d;

        /* renamed from: e0 */
        public int[] f2528e0;

        /* renamed from: f0 */
        public String f2530f0;

        /* renamed from: g0 */
        public String f2532g0;

        /* renamed from: a */
        public boolean f2519a = false;

        /* renamed from: b */
        public boolean f2521b = false;

        /* renamed from: e */
        public int f2527e = -1;

        /* renamed from: f */
        public int f2529f = -1;

        /* renamed from: g */
        public float f2531g = -1.0f;

        /* renamed from: h */
        public int f2533h = -1;

        /* renamed from: i */
        public int f2535i = -1;

        /* renamed from: j */
        public int f2537j = -1;

        /* renamed from: k */
        public int f2539k = -1;

        /* renamed from: l */
        public int f2540l = -1;

        /* renamed from: m */
        public int f2541m = -1;

        /* renamed from: n */
        public int f2542n = -1;

        /* renamed from: o */
        public int f2543o = -1;

        /* renamed from: p */
        public int f2544p = -1;

        /* renamed from: q */
        public int f2545q = -1;

        /* renamed from: r */
        public int f2546r = -1;

        /* renamed from: s */
        public int f2547s = -1;

        /* renamed from: t */
        public int f2548t = -1;

        /* renamed from: u */
        public float f2549u = 0.5f;

        /* renamed from: v */
        public float f2550v = 0.5f;

        /* renamed from: w */
        public String f2551w = null;

        /* renamed from: x */
        public int f2552x = -1;

        /* renamed from: y */
        public int f2553y = 0;

        /* renamed from: z */
        public float f2554z = 0.0f;

        /* renamed from: A */
        public int f2493A = -1;

        /* renamed from: B */
        public int f2494B = -1;

        /* renamed from: C */
        public int f2495C = -1;

        /* renamed from: D */
        public int f2496D = -1;

        /* renamed from: E */
        public int f2497E = -1;

        /* renamed from: F */
        public int f2498F = -1;

        /* renamed from: G */
        public int f2499G = -1;

        /* renamed from: H */
        public int f2500H = -1;

        /* renamed from: I */
        public int f2501I = -1;

        /* renamed from: J */
        public int f2502J = -1;

        /* renamed from: K */
        public int f2503K = -1;

        /* renamed from: L */
        public int f2504L = -1;

        /* renamed from: M */
        public int f2505M = -1;

        /* renamed from: N */
        public int f2506N = -1;

        /* renamed from: O */
        public int f2507O = -1;

        /* renamed from: P */
        public float f2508P = -1.0f;

        /* renamed from: Q */
        public float f2509Q = -1.0f;

        /* renamed from: R */
        public int f2510R = 0;

        /* renamed from: S */
        public int f2511S = 0;

        /* renamed from: T */
        public int f2512T = 0;

        /* renamed from: U */
        public int f2513U = 0;

        /* renamed from: V */
        public int f2514V = -1;

        /* renamed from: W */
        public int f2515W = -1;

        /* renamed from: X */
        public int f2516X = -1;

        /* renamed from: Y */
        public int f2517Y = -1;

        /* renamed from: Z */
        public float f2518Z = 1.0f;

        /* renamed from: a0 */
        public float f2520a0 = 1.0f;

        /* renamed from: b0 */
        public int f2522b0 = -1;

        /* renamed from: c0 */
        public int f2524c0 = 0;

        /* renamed from: d0 */
        public int f2526d0 = -1;

        /* renamed from: h0 */
        public boolean f2534h0 = false;

        /* renamed from: i0 */
        public boolean f2536i0 = false;

        /* renamed from: j0 */
        public boolean f2538j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2492k0 = sparseIntArray;
            sparseIntArray.append(C9786d.f44623E3, 24);
            f2492k0.append(C9786d.f44629F3, 25);
            f2492k0.append(C9786d.f44641H3, 28);
            f2492k0.append(C9786d.f44647I3, 29);
            f2492k0.append(C9786d.f44677N3, 35);
            f2492k0.append(C9786d.f44671M3, 34);
            f2492k0.append(C9786d.f44854p3, 4);
            f2492k0.append(C9786d.f44848o3, 3);
            f2492k0.append(C9786d.f44836m3, 1);
            f2492k0.append(C9786d.f44707S3, 6);
            f2492k0.append(C9786d.f44713T3, 7);
            f2492k0.append(C9786d.f44896w3, 17);
            f2492k0.append(C9786d.f44902x3, 18);
            f2492k0.append(C9786d.f44908y3, 19);
            f2492k0.append(C9786d.f44736X2, 26);
            f2492k0.append(C9786d.f44653J3, 31);
            f2492k0.append(C9786d.f44659K3, 32);
            f2492k0.append(C9786d.f44890v3, 10);
            f2492k0.append(C9786d.f44884u3, 9);
            f2492k0.append(C9786d.f44731W3, 13);
            f2492k0.append(C9786d.f44749Z3, 16);
            f2492k0.append(C9786d.f44737X3, 14);
            f2492k0.append(C9786d.f44719U3, 11);
            f2492k0.append(C9786d.f44743Y3, 15);
            f2492k0.append(C9786d.f44725V3, 12);
            f2492k0.append(C9786d.f44695Q3, 38);
            f2492k0.append(C9786d.f44611C3, 37);
            f2492k0.append(C9786d.f44605B3, 39);
            f2492k0.append(C9786d.f44689P3, 40);
            f2492k0.append(C9786d.f44599A3, 20);
            f2492k0.append(C9786d.f44683O3, 36);
            f2492k0.append(C9786d.f44878t3, 5);
            f2492k0.append(C9786d.f44617D3, 76);
            f2492k0.append(C9786d.f44665L3, 76);
            f2492k0.append(C9786d.f44635G3, 76);
            f2492k0.append(C9786d.f44842n3, 76);
            f2492k0.append(C9786d.f44830l3, 76);
            f2492k0.append(C9786d.f44755a3, 23);
            f2492k0.append(C9786d.f44769c3, 27);
            f2492k0.append(C9786d.f44783e3, 30);
            f2492k0.append(C9786d.f44790f3, 8);
            f2492k0.append(C9786d.f44762b3, 33);
            f2492k0.append(C9786d.f44776d3, 2);
            f2492k0.append(C9786d.f44742Y2, 22);
            f2492k0.append(C9786d.f44748Z2, 21);
            f2492k0.append(C9786d.f44860q3, 61);
            f2492k0.append(C9786d.f44872s3, 62);
            f2492k0.append(C9786d.f44866r3, 63);
            f2492k0.append(C9786d.f44701R3, 69);
            f2492k0.append(C9786d.f44914z3, 70);
            f2492k0.append(C9786d.f44818j3, 71);
            f2492k0.append(C9786d.f44804h3, 72);
            f2492k0.append(C9786d.f44811i3, 73);
            f2492k0.append(C9786d.f44824k3, 74);
            f2492k0.append(C9786d.f44797g3, 75);
        }

        /* renamed from: a */
        public void m1756a(b bVar) {
            this.f2519a = bVar.f2519a;
            this.f2523c = bVar.f2523c;
            this.f2521b = bVar.f2521b;
            this.f2525d = bVar.f2525d;
            this.f2527e = bVar.f2527e;
            this.f2529f = bVar.f2529f;
            this.f2531g = bVar.f2531g;
            this.f2533h = bVar.f2533h;
            this.f2535i = bVar.f2535i;
            this.f2537j = bVar.f2537j;
            this.f2539k = bVar.f2539k;
            this.f2540l = bVar.f2540l;
            this.f2541m = bVar.f2541m;
            this.f2542n = bVar.f2542n;
            this.f2543o = bVar.f2543o;
            this.f2544p = bVar.f2544p;
            this.f2545q = bVar.f2545q;
            this.f2546r = bVar.f2546r;
            this.f2547s = bVar.f2547s;
            this.f2548t = bVar.f2548t;
            this.f2549u = bVar.f2549u;
            this.f2550v = bVar.f2550v;
            this.f2551w = bVar.f2551w;
            this.f2552x = bVar.f2552x;
            this.f2553y = bVar.f2553y;
            this.f2554z = bVar.f2554z;
            this.f2493A = bVar.f2493A;
            this.f2494B = bVar.f2494B;
            this.f2495C = bVar.f2495C;
            this.f2496D = bVar.f2496D;
            this.f2497E = bVar.f2497E;
            this.f2498F = bVar.f2498F;
            this.f2499G = bVar.f2499G;
            this.f2500H = bVar.f2500H;
            this.f2501I = bVar.f2501I;
            this.f2502J = bVar.f2502J;
            this.f2503K = bVar.f2503K;
            this.f2504L = bVar.f2504L;
            this.f2505M = bVar.f2505M;
            this.f2506N = bVar.f2506N;
            this.f2507O = bVar.f2507O;
            this.f2508P = bVar.f2508P;
            this.f2509Q = bVar.f2509Q;
            this.f2510R = bVar.f2510R;
            this.f2511S = bVar.f2511S;
            this.f2512T = bVar.f2512T;
            this.f2513U = bVar.f2513U;
            this.f2514V = bVar.f2514V;
            this.f2515W = bVar.f2515W;
            this.f2516X = bVar.f2516X;
            this.f2517Y = bVar.f2517Y;
            this.f2518Z = bVar.f2518Z;
            this.f2520a0 = bVar.f2520a0;
            this.f2522b0 = bVar.f2522b0;
            this.f2524c0 = bVar.f2524c0;
            this.f2526d0 = bVar.f2526d0;
            this.f2532g0 = bVar.f2532g0;
            int[] iArr = bVar.f2528e0;
            if (iArr != null) {
                this.f2528e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2528e0 = null;
            }
            this.f2530f0 = bVar.f2530f0;
            this.f2534h0 = bVar.f2534h0;
            this.f2536i0 = bVar.f2536i0;
            this.f2538j0 = bVar.f2538j0;
        }

        /* renamed from: b */
        public void m1757b(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44730W2);
            this.f2521b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2492k0.get(index);
                if (i11 == 80) {
                    this.f2534h0 = obtainStyledAttributes.getBoolean(index, this.f2534h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f2544p = C0376c.m1734o(obtainStyledAttributes, index, this.f2544p);
                            break;
                        case 2:
                            this.f2499G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2499G);
                            break;
                        case 3:
                            this.f2543o = C0376c.m1734o(obtainStyledAttributes, index, this.f2543o);
                            break;
                        case 4:
                            this.f2542n = C0376c.m1734o(obtainStyledAttributes, index, this.f2542n);
                            break;
                        case 5:
                            this.f2551w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f2493A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2493A);
                            break;
                        case 7:
                            this.f2494B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2494B);
                            break;
                        case 8:
                            this.f2500H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2500H);
                            break;
                        case 9:
                            this.f2548t = C0376c.m1734o(obtainStyledAttributes, index, this.f2548t);
                            break;
                        case 10:
                            this.f2547s = C0376c.m1734o(obtainStyledAttributes, index, this.f2547s);
                            break;
                        case 11:
                            this.f2505M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2505M);
                            break;
                        case 12:
                            this.f2506N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2506N);
                            break;
                        case 13:
                            this.f2502J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2502J);
                            break;
                        case 14:
                            this.f2504L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2504L);
                            break;
                        case 15:
                            this.f2507O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2507O);
                            break;
                        case 16:
                            this.f2503K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2503K);
                            break;
                        case 17:
                            this.f2527e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2527e);
                            break;
                        case 18:
                            this.f2529f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2529f);
                            break;
                        case 19:
                            this.f2531g = obtainStyledAttributes.getFloat(index, this.f2531g);
                            break;
                        case 20:
                            this.f2549u = obtainStyledAttributes.getFloat(index, this.f2549u);
                            break;
                        case 21:
                            this.f2525d = obtainStyledAttributes.getLayoutDimension(index, this.f2525d);
                            break;
                        case 22:
                            this.f2523c = obtainStyledAttributes.getLayoutDimension(index, this.f2523c);
                            break;
                        case 23:
                            this.f2496D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2496D);
                            break;
                        case 24:
                            this.f2533h = C0376c.m1734o(obtainStyledAttributes, index, this.f2533h);
                            break;
                        case 25:
                            this.f2535i = C0376c.m1734o(obtainStyledAttributes, index, this.f2535i);
                            break;
                        case 26:
                            this.f2495C = obtainStyledAttributes.getInt(index, this.f2495C);
                            break;
                        case 27:
                            this.f2497E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2497E);
                            break;
                        case 28:
                            this.f2537j = C0376c.m1734o(obtainStyledAttributes, index, this.f2537j);
                            break;
                        case 29:
                            this.f2539k = C0376c.m1734o(obtainStyledAttributes, index, this.f2539k);
                            break;
                        case 30:
                            this.f2501I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2501I);
                            break;
                        case 31:
                            this.f2545q = C0376c.m1734o(obtainStyledAttributes, index, this.f2545q);
                            break;
                        case 32:
                            this.f2546r = C0376c.m1734o(obtainStyledAttributes, index, this.f2546r);
                            break;
                        case 33:
                            this.f2498F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2498F);
                            break;
                        case 34:
                            this.f2541m = C0376c.m1734o(obtainStyledAttributes, index, this.f2541m);
                            break;
                        case 35:
                            this.f2540l = C0376c.m1734o(obtainStyledAttributes, index, this.f2540l);
                            break;
                        case 36:
                            this.f2550v = obtainStyledAttributes.getFloat(index, this.f2550v);
                            break;
                        case 37:
                            this.f2509Q = obtainStyledAttributes.getFloat(index, this.f2509Q);
                            break;
                        case 38:
                            this.f2508P = obtainStyledAttributes.getFloat(index, this.f2508P);
                            break;
                        case 39:
                            this.f2510R = obtainStyledAttributes.getInt(index, this.f2510R);
                            break;
                        case 40:
                            this.f2511S = obtainStyledAttributes.getInt(index, this.f2511S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f2512T = obtainStyledAttributes.getInt(index, this.f2512T);
                                    break;
                                case 55:
                                    this.f2513U = obtainStyledAttributes.getInt(index, this.f2513U);
                                    break;
                                case 56:
                                    this.f2514V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2514V);
                                    break;
                                case 57:
                                    this.f2515W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2515W);
                                    break;
                                case 58:
                                    this.f2516X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2516X);
                                    break;
                                case 59:
                                    this.f2517Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2517Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f2552x = C0376c.m1734o(obtainStyledAttributes, index, this.f2552x);
                                            break;
                                        case 62:
                                            this.f2553y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2553y);
                                            break;
                                        case 63:
                                            this.f2554z = obtainStyledAttributes.getFloat(index, this.f2554z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f2518Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2520a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f2522b0 = obtainStyledAttributes.getInt(index, this.f2522b0);
                                                    continue;
                                                case 73:
                                                    this.f2524c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2524c0);
                                                    continue;
                                                case 74:
                                                    this.f2530f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2538j0 = obtainStyledAttributes.getBoolean(index, this.f2538j0);
                                                    continue;
                                                case 76:
                                                    sb2 = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f2532g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb2 = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb2.append(str);
                                            sb2.append(Integer.toHexString(index));
                                            sb2.append("   ");
                                            sb2.append(f2492k0.get(index));
                                            Log.w("ConstraintSet", sb2.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f2536i0 = obtainStyledAttributes.getBoolean(index, this.f2536i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/c$c.class
     */
    /* renamed from: androidx.constraintlayout.widget.c$c */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/c$c.class */
    public static class c {

        /* renamed from: h */
        public static SparseIntArray f2555h;

        /* renamed from: a */
        public boolean f2556a = false;

        /* renamed from: b */
        public int f2557b = -1;

        /* renamed from: c */
        public String f2558c = null;

        /* renamed from: d */
        public int f2559d = -1;

        /* renamed from: e */
        public int f2560e = 0;

        /* renamed from: f */
        public float f2561f = Float.NaN;

        /* renamed from: g */
        public float f2562g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2555h = sparseIntArray;
            sparseIntArray.append(C9786d.f44825k4, 1);
            f2555h.append(C9786d.f44837m4, 2);
            f2555h.append(C9786d.f44843n4, 3);
            f2555h.append(C9786d.f44819j4, 4);
            f2555h.append(C9786d.f44812i4, 5);
            f2555h.append(C9786d.f44831l4, 6);
        }

        /* renamed from: a */
        public void m1758a(c cVar) {
            this.f2556a = cVar.f2556a;
            this.f2557b = cVar.f2557b;
            this.f2558c = cVar.f2558c;
            this.f2559d = cVar.f2559d;
            this.f2560e = cVar.f2560e;
            this.f2562g = cVar.f2562g;
            this.f2561f = cVar.f2561f;
        }

        /* renamed from: b */
        public void m1759b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44805h4);
            this.f2556a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2555h.get(index)) {
                    case 1:
                        this.f2562g = obtainStyledAttributes.getFloat(index, this.f2562g);
                        break;
                    case 2:
                        this.f2559d = obtainStyledAttributes.getInt(index, this.f2559d);
                        break;
                    case 3:
                        this.f2558c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C8589a.f40044c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f2560e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2557b = C0376c.m1734o(obtainStyledAttributes, index, this.f2557b);
                        break;
                    case 6:
                        this.f2561f = obtainStyledAttributes.getFloat(index, this.f2561f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/c$d.class
     */
    /* renamed from: androidx.constraintlayout.widget.c$d */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/c$d.class */
    public static class d {

        /* renamed from: a */
        public boolean f2563a = false;

        /* renamed from: b */
        public int f2564b = 0;

        /* renamed from: c */
        public int f2565c = 0;

        /* renamed from: d */
        public float f2566d = 1.0f;

        /* renamed from: e */
        public float f2567e = Float.NaN;

        /* renamed from: a */
        public void m1760a(d dVar) {
            this.f2563a = dVar.f2563a;
            this.f2564b = dVar.f2564b;
            this.f2566d = dVar.f2566d;
            this.f2567e = dVar.f2567e;
            this.f2565c = dVar.f2565c;
        }

        /* renamed from: b */
        public void m1761b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44897w4);
            this.f2563a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44909y4) {
                    this.f2566d = obtainStyledAttributes.getFloat(index, this.f2566d);
                } else if (index == C9786d.f44903x4) {
                    this.f2564b = obtainStyledAttributes.getInt(index, this.f2564b);
                    this.f2564b = C0376c.f2481d[this.f2564b];
                } else if (index == C9786d.f44600A4) {
                    this.f2565c = obtainStyledAttributes.getInt(index, this.f2565c);
                } else if (index == C9786d.f44915z4) {
                    this.f2567e = obtainStyledAttributes.getFloat(index, this.f2567e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/c$e.class
     */
    /* renamed from: androidx.constraintlayout.widget.c$e */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/c$e.class */
    public static class e {

        /* renamed from: n */
        public static SparseIntArray f2568n;

        /* renamed from: a */
        public boolean f2569a = false;

        /* renamed from: b */
        public float f2570b = 0.0f;

        /* renamed from: c */
        public float f2571c = 0.0f;

        /* renamed from: d */
        public float f2572d = 0.0f;

        /* renamed from: e */
        public float f2573e = 1.0f;

        /* renamed from: f */
        public float f2574f = 1.0f;

        /* renamed from: g */
        public float f2575g = Float.NaN;

        /* renamed from: h */
        public float f2576h = Float.NaN;

        /* renamed from: i */
        public float f2577i = 0.0f;

        /* renamed from: j */
        public float f2578j = 0.0f;

        /* renamed from: k */
        public float f2579k = 0.0f;

        /* renamed from: l */
        public boolean f2580l = false;

        /* renamed from: m */
        public float f2581m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2568n = sparseIntArray;
            sparseIntArray.append(C9786d.f44720U4, 1);
            f2568n.append(C9786d.f44726V4, 2);
            f2568n.append(C9786d.f44732W4, 3);
            f2568n.append(C9786d.f44708S4, 4);
            f2568n.append(C9786d.f44714T4, 5);
            f2568n.append(C9786d.f44684O4, 6);
            f2568n.append(C9786d.f44690P4, 7);
            f2568n.append(C9786d.f44696Q4, 8);
            f2568n.append(C9786d.f44702R4, 9);
            f2568n.append(C9786d.f44738X4, 10);
            f2568n.append(C9786d.f44744Y4, 11);
        }

        /* renamed from: a */
        public void m1762a(e eVar) {
            this.f2569a = eVar.f2569a;
            this.f2570b = eVar.f2570b;
            this.f2571c = eVar.f2571c;
            this.f2572d = eVar.f2572d;
            this.f2573e = eVar.f2573e;
            this.f2574f = eVar.f2574f;
            this.f2575g = eVar.f2575g;
            this.f2576h = eVar.f2576h;
            this.f2577i = eVar.f2577i;
            this.f2578j = eVar.f2578j;
            this.f2579k = eVar.f2579k;
            this.f2580l = eVar.f2580l;
            this.f2581m = eVar.f2581m;
        }

        /* renamed from: b */
        public void m1763b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44678N4);
            this.f2569a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2568n.get(index)) {
                    case 1:
                        this.f2570b = obtainStyledAttributes.getFloat(index, this.f2570b);
                        break;
                    case 2:
                        this.f2571c = obtainStyledAttributes.getFloat(index, this.f2571c);
                        break;
                    case 3:
                        this.f2572d = obtainStyledAttributes.getFloat(index, this.f2572d);
                        break;
                    case 4:
                        this.f2573e = obtainStyledAttributes.getFloat(index, this.f2573e);
                        break;
                    case 5:
                        this.f2574f = obtainStyledAttributes.getFloat(index, this.f2574f);
                        break;
                    case 6:
                        this.f2575g = obtainStyledAttributes.getDimension(index, this.f2575g);
                        break;
                    case 7:
                        this.f2576h = obtainStyledAttributes.getDimension(index, this.f2576h);
                        break;
                    case 8:
                        this.f2577i = obtainStyledAttributes.getDimension(index, this.f2577i);
                        break;
                    case 9:
                        this.f2578j = obtainStyledAttributes.getDimension(index, this.f2578j);
                        break;
                    case 10:
                        this.f2579k = obtainStyledAttributes.getDimension(index, this.f2579k);
                        break;
                    case 11:
                        this.f2580l = true;
                        this.f2581m = obtainStyledAttributes.getDimension(index, this.f2581m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2482e = sparseIntArray;
        sparseIntArray.append(C9786d.f44881u0, 25);
        f2482e.append(C9786d.f44887v0, 26);
        f2482e.append(C9786d.f44899x0, 29);
        f2482e.append(C9786d.f44905y0, 30);
        f2482e.append(C9786d.f44620E0, 36);
        f2482e.append(C9786d.f44614D0, 35);
        f2482e.append(C9786d.f44766c0, 4);
        f2482e.append(C9786d.f44759b0, 3);
        f2482e.append(C9786d.f44745Z, 1);
        f2482e.append(C9786d.f44668M0, 6);
        f2482e.append(C9786d.f44674N0, 7);
        f2482e.append(C9786d.f44815j0, 17);
        f2482e.append(C9786d.f44821k0, 18);
        f2482e.append(C9786d.f44827l0, 19);
        f2482e.append(C9786d.f44868s, 27);
        f2482e.append(C9786d.f44911z0, 32);
        f2482e.append(C9786d.f44596A0, 33);
        f2482e.append(C9786d.f44808i0, 10);
        f2482e.append(C9786d.f44801h0, 9);
        f2482e.append(C9786d.f44692Q0, 13);
        f2482e.append(C9786d.f44710T0, 16);
        f2482e.append(C9786d.f44698R0, 14);
        f2482e.append(C9786d.f44680O0, 11);
        f2482e.append(C9786d.f44704S0, 15);
        f2482e.append(C9786d.f44686P0, 12);
        f2482e.append(C9786d.f44638H0, 40);
        f2482e.append(C9786d.f44869s0, 39);
        f2482e.append(C9786d.f44863r0, 41);
        f2482e.append(C9786d.f44632G0, 42);
        f2482e.append(C9786d.f44857q0, 20);
        f2482e.append(C9786d.f44626F0, 37);
        f2482e.append(C9786d.f44794g0, 5);
        f2482e.append(C9786d.f44875t0, 82);
        f2482e.append(C9786d.f44608C0, 82);
        f2482e.append(C9786d.f44893w0, 82);
        f2482e.append(C9786d.f44752a0, 82);
        f2482e.append(C9786d.f44739Y, 82);
        f2482e.append(C9786d.f44898x, 24);
        f2482e.append(C9786d.f44910z, 28);
        f2482e.append(C9786d.f44661L, 31);
        f2482e.append(C9786d.f44667M, 8);
        f2482e.append(C9786d.f44904y, 34);
        f2482e.append(C9786d.f44595A, 2);
        f2482e.append(C9786d.f44886v, 23);
        f2482e.append(C9786d.f44892w, 21);
        f2482e.append(C9786d.f44880u, 22);
        f2482e.append(C9786d.f44601B, 43);
        f2482e.append(C9786d.f44679O, 44);
        f2482e.append(C9786d.f44649J, 45);
        f2482e.append(C9786d.f44655K, 46);
        f2482e.append(C9786d.f44643I, 60);
        f2482e.append(C9786d.f44631G, 47);
        f2482e.append(C9786d.f44637H, 48);
        f2482e.append(C9786d.f44607C, 49);
        f2482e.append(C9786d.f44613D, 50);
        f2482e.append(C9786d.f44619E, 51);
        f2482e.append(C9786d.f44625F, 52);
        f2482e.append(C9786d.f44673N, 53);
        f2482e.append(C9786d.f44644I0, 54);
        f2482e.append(C9786d.f44833m0, 55);
        f2482e.append(C9786d.f44650J0, 56);
        f2482e.append(C9786d.f44839n0, 57);
        f2482e.append(C9786d.f44656K0, 58);
        f2482e.append(C9786d.f44845o0, 59);
        f2482e.append(C9786d.f44773d0, 61);
        f2482e.append(C9786d.f44787f0, 62);
        f2482e.append(C9786d.f44780e0, 63);
        f2482e.append(C9786d.f44685P, 64);
        f2482e.append(C9786d.f44734X0, 65);
        f2482e.append(C9786d.f44721V, 66);
        f2482e.append(C9786d.f44740Y0, 67);
        f2482e.append(C9786d.f44722V0, 79);
        f2482e.append(C9786d.f44874t, 38);
        f2482e.append(C9786d.f44716U0, 68);
        f2482e.append(C9786d.f44662L0, 69);
        f2482e.append(C9786d.f44851p0, 70);
        f2482e.append(C9786d.f44709T, 71);
        f2482e.append(C9786d.f44697R, 72);
        f2482e.append(C9786d.f44703S, 73);
        f2482e.append(C9786d.f44715U, 74);
        f2482e.append(C9786d.f44691Q, 75);
        f2482e.append(C9786d.f44728W0, 76);
        f2482e.append(C9786d.f44602B0, 77);
        f2482e.append(C9786d.f44746Z0, 78);
        f2482e.append(C9786d.f44733X, 80);
        f2482e.append(C9786d.f44727W, 81);
    }

    /* renamed from: o */
    public static int m1734o(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        int i12 = resourceId;
        if (resourceId == -1) {
            i12 = typedArray.getInt(i10, -1);
        }
        return i12;
    }

    /* renamed from: c */
    public void m1735c(ConstraintLayout constraintLayout) {
        m1736d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: d */
    public void m1736d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2485c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f2485c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C8782a.m37585a(childAt));
            } else {
                if (this.f2484b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f2485c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f2485c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            aVar.f2489d.f2526d0 = 1;
                        }
                        int i11 = aVar.f2489d.f2526d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f2489d.f2522b0);
                            barrier.setMargin(aVar.f2489d.f2524c0);
                            barrier.setAllowsGoneWidget(aVar.f2489d.f2538j0);
                            b bVar = aVar.f2489d;
                            int[] iArr = bVar.f2528e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2530f0;
                                if (str != null) {
                                    bVar.f2528e0 = m1742j(barrier, str);
                                    barrier.setReferencedIds(aVar.f2489d.f2528e0);
                                }
                            }
                        }
                        ConstraintLayout.C0372b c0372b = (ConstraintLayout.C0372b) childAt.getLayoutParams();
                        c0372b.m1713a();
                        aVar.m1751d(c0372b);
                        if (z10) {
                            C0374a.m1719c(childAt, aVar.f2491f);
                        }
                        childAt.setLayoutParams(c0372b);
                        d dVar = aVar.f2487b;
                        if (dVar.f2565c == 0) {
                            childAt.setVisibility(dVar.f2564b);
                        }
                        childAt.setAlpha(aVar.f2487b.f2566d);
                        childAt.setRotation(aVar.f2490e.f2570b);
                        childAt.setRotationX(aVar.f2490e.f2571c);
                        childAt.setRotationY(aVar.f2490e.f2572d);
                        childAt.setScaleX(aVar.f2490e.f2573e);
                        childAt.setScaleY(aVar.f2490e.f2574f);
                        if (!Float.isNaN(aVar.f2490e.f2575g)) {
                            childAt.setPivotX(aVar.f2490e.f2575g);
                        }
                        if (!Float.isNaN(aVar.f2490e.f2576h)) {
                            childAt.setPivotY(aVar.f2490e.f2576h);
                        }
                        childAt.setTranslationX(aVar.f2490e.f2577i);
                        childAt.setTranslationY(aVar.f2490e.f2578j);
                        childAt.setTranslationZ(aVar.f2490e.f2579k);
                        e eVar = aVar.f2490e;
                        if (eVar.f2580l) {
                            childAt.setElevation(eVar.f2581m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f2485c.get(num);
            int i12 = aVar2.f2489d.f2526d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f2489d;
                int[] iArr2 = bVar2.f2528e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2530f0;
                    if (str2 != null) {
                        bVar2.f2528e0 = m1742j(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f2489d.f2528e0);
                    }
                }
                barrier2.setType(aVar2.f2489d.f2522b0);
                barrier2.setMargin(aVar2.f2489d.f2524c0);
                ConstraintLayout.C0372b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m1731m();
                aVar2.m1751d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2489d.f2519a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0372b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.m1751d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: e */
    public void m1737e(int i10, int i11) {
        if (this.f2485c.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f2485c.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f2489d;
                    bVar.f2535i = -1;
                    bVar.f2533h = -1;
                    bVar.f2496D = -1;
                    bVar.f2502J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f2489d;
                    bVar2.f2539k = -1;
                    bVar2.f2537j = -1;
                    bVar2.f2497E = -1;
                    bVar2.f2504L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f2489d;
                    bVar3.f2541m = -1;
                    bVar3.f2540l = -1;
                    bVar3.f2498F = -1;
                    bVar3.f2503K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f2489d;
                    bVar4.f2542n = -1;
                    bVar4.f2543o = -1;
                    bVar4.f2499G = -1;
                    bVar4.f2505M = -1;
                    return;
                case 5:
                    aVar.f2489d.f2544p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f2489d;
                    bVar5.f2545q = -1;
                    bVar5.f2546r = -1;
                    bVar5.f2501I = -1;
                    bVar5.f2507O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f2489d;
                    bVar6.f2547s = -1;
                    bVar6.f2548t = -1;
                    bVar6.f2500H = -1;
                    bVar6.f2506N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m1738f(Context context, int i10) {
        m1739g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m1739g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2485c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.C0372b c0372b = (ConstraintLayout.C0372b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2484b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2485c.containsKey(Integer.valueOf(id2))) {
                this.f2485c.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f2485c.get(Integer.valueOf(id2));
            aVar.f2491f = C0374a.m1717a(this.f2483a, childAt);
            aVar.m1753f(id2, c0372b);
            aVar.f2487b.f2564b = childAt.getVisibility();
            aVar.f2487b.f2566d = childAt.getAlpha();
            aVar.f2490e.f2570b = childAt.getRotation();
            aVar.f2490e.f2571c = childAt.getRotationX();
            aVar.f2490e.f2572d = childAt.getRotationY();
            aVar.f2490e.f2573e = childAt.getScaleX();
            aVar.f2490e.f2574f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f2490e;
                eVar.f2575g = pivotX;
                eVar.f2576h = pivotY;
            }
            aVar.f2490e.f2577i = childAt.getTranslationX();
            aVar.f2490e.f2578j = childAt.getTranslationY();
            aVar.f2490e.f2579k = childAt.getTranslationZ();
            e eVar2 = aVar.f2490e;
            if (eVar2.f2580l) {
                eVar2.f2581m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f2489d.f2538j0 = barrier.m1693n();
                aVar.f2489d.f2528e0 = barrier.getReferencedIds();
                aVar.f2489d.f2522b0 = barrier.getType();
                aVar.f2489d.f2524c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: h */
    public void m1740h(C0377d c0377d) {
        int childCount = c0377d.getChildCount();
        this.f2485c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c0377d.getChildAt(i10);
            C0377d.a aVar = (C0377d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2484b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2485c.containsKey(Integer.valueOf(id2))) {
                this.f2485c.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f2485c.get(Integer.valueOf(id2));
            if (childAt instanceof AbstractC0375b) {
                aVar2.m1755h((AbstractC0375b) childAt, id2, aVar);
            }
            aVar2.m1754g(id2, aVar);
        }
    }

    /* renamed from: i */
    public void m1741i(int i10, int i11, int i12, float f10) {
        b bVar = m1744l(i10).f2489d;
        bVar.f2552x = i11;
        bVar.f2553y = i12;
        bVar.f2554z = f10;
    }

    /* renamed from: j */
    public final int[] m1742j(View view, String str) {
        int i10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = C9785c.class.getField(trim).getInt(null);
            } catch (Exception e10) {
                i10 = 0;
            }
            int i13 = i10;
            if (i10 == 0) {
                i13 = context.getResources().getIdentifier(trim, Name.MARK, context.getPackageName());
            }
            int i14 = i13;
            if (i13 == 0) {
                i14 = i13;
                if (view.isInEditMode()) {
                    i14 = i13;
                    if (view.getParent() instanceof ConstraintLayout) {
                        Object m1699f = ((ConstraintLayout) view.getParent()).m1699f(0, trim);
                        i14 = i13;
                        if (m1699f != null) {
                            i14 = i13;
                            if (m1699f instanceof Integer) {
                                i14 = ((Integer) m1699f).intValue();
                            }
                        }
                    }
                }
            }
            iArr[i12] = i14;
            i11++;
            i12++;
        }
        int[] iArr2 = iArr;
        if (i12 != split.length) {
            iArr2 = Arrays.copyOf(iArr, i12);
        }
        return iArr2;
    }

    /* renamed from: k */
    public final a m1743k(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9786d.f44862r);
        m1747p(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: l */
    public final a m1744l(int i10) {
        if (!this.f2485c.containsKey(Integer.valueOf(i10))) {
            this.f2485c.put(Integer.valueOf(i10), new a());
        }
        return this.f2485c.get(Integer.valueOf(i10));
    }

    /* renamed from: m */
    public void m1745m(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a m1743k = m1743k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m1743k.f2489d.f2519a = true;
                    }
                    this.f2485c.put(Integer.valueOf(m1743k.f2486a), m1743k);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public void m1746n(Context context, XmlPullParser xmlPullParser) {
        a aVar;
        boolean z10;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar2 = null;
            while (true) {
                a aVar3 = aVar2;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                    aVar = aVar3;
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (name.equals("Layout")) {
                                z10 = 5;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1984451626:
                            if (name.equals("Motion")) {
                                z10 = 6;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1269513683:
                            if (name.equals("PropertySet")) {
                                z10 = 3;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -1238332596:
                            if (name.equals("Transform")) {
                                z10 = 4;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -71750448:
                            if (name.equals("Guideline")) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z10 = 7;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        default:
                            z10 = -1;
                            break;
                    }
                    switch (z10) {
                        case false:
                            aVar = m1743k(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                        case true:
                            aVar = m1743k(context, Xml.asAttributeSet(xmlPullParser));
                            b bVar = aVar.f2489d;
                            bVar.f2519a = true;
                            bVar.f2521b = true;
                            break;
                        case true:
                            aVar = m1743k(context, Xml.asAttributeSet(xmlPullParser));
                            aVar.f2489d.f2526d0 = 1;
                            break;
                        case true:
                            if (aVar3 == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar3.f2487b.m1761b(context, Xml.asAttributeSet(xmlPullParser));
                            aVar = aVar3;
                            break;
                        case true:
                            if (aVar3 == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar3.f2490e.m1763b(context, Xml.asAttributeSet(xmlPullParser));
                            aVar = aVar3;
                            break;
                        case true:
                            if (aVar3 == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar3.f2489d.m1757b(context, Xml.asAttributeSet(xmlPullParser));
                            aVar = aVar3;
                            break;
                        case true:
                            if (aVar3 == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar3.f2488c.m1759b(context, Xml.asAttributeSet(xmlPullParser));
                            aVar = aVar3;
                            break;
                        case true:
                            if (aVar3 == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            C0374a.m1718b(context, xmlPullParser, aVar3.f2491f);
                            aVar = aVar3;
                            break;
                        default:
                            aVar = aVar3;
                            break;
                    }
                } else if (eventType != 3) {
                    aVar = aVar3;
                } else {
                    String name2 = xmlPullParser.getName();
                    if ("ConstraintSet".equals(name2)) {
                        return;
                    }
                    aVar = aVar3;
                    if (name2.equalsIgnoreCase("Constraint")) {
                        this.f2485c.put(Integer.valueOf(aVar3.f2486a), aVar3);
                        aVar = null;
                    }
                }
                eventType = xmlPullParser.next();
                aVar2 = aVar;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public final void m1747p(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String str;
        StringBuilder sb2;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != C9786d.f44874t && C9786d.f44661L != index && C9786d.f44667M != index) {
                aVar.f2488c.f2556a = true;
                aVar.f2489d.f2521b = true;
                aVar.f2487b.f2563a = true;
                aVar.f2490e.f2569a = true;
            }
            switch (f2482e.get(index)) {
                case 1:
                    b bVar = aVar.f2489d;
                    bVar.f2544p = m1734o(typedArray, index, bVar.f2544p);
                    continue;
                case 2:
                    b bVar2 = aVar.f2489d;
                    bVar2.f2499G = typedArray.getDimensionPixelSize(index, bVar2.f2499G);
                    continue;
                case 3:
                    b bVar3 = aVar.f2489d;
                    bVar3.f2543o = m1734o(typedArray, index, bVar3.f2543o);
                    continue;
                case 4:
                    b bVar4 = aVar.f2489d;
                    bVar4.f2542n = m1734o(typedArray, index, bVar4.f2542n);
                    continue;
                case 5:
                    aVar.f2489d.f2551w = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f2489d;
                    bVar5.f2493A = typedArray.getDimensionPixelOffset(index, bVar5.f2493A);
                    continue;
                case 7:
                    b bVar6 = aVar.f2489d;
                    bVar6.f2494B = typedArray.getDimensionPixelOffset(index, bVar6.f2494B);
                    continue;
                case 8:
                    b bVar7 = aVar.f2489d;
                    bVar7.f2500H = typedArray.getDimensionPixelSize(index, bVar7.f2500H);
                    continue;
                case 9:
                    b bVar8 = aVar.f2489d;
                    bVar8.f2548t = m1734o(typedArray, index, bVar8.f2548t);
                    continue;
                case 10:
                    b bVar9 = aVar.f2489d;
                    bVar9.f2547s = m1734o(typedArray, index, bVar9.f2547s);
                    continue;
                case 11:
                    b bVar10 = aVar.f2489d;
                    bVar10.f2505M = typedArray.getDimensionPixelSize(index, bVar10.f2505M);
                    continue;
                case 12:
                    b bVar11 = aVar.f2489d;
                    bVar11.f2506N = typedArray.getDimensionPixelSize(index, bVar11.f2506N);
                    continue;
                case 13:
                    b bVar12 = aVar.f2489d;
                    bVar12.f2502J = typedArray.getDimensionPixelSize(index, bVar12.f2502J);
                    continue;
                case 14:
                    b bVar13 = aVar.f2489d;
                    bVar13.f2504L = typedArray.getDimensionPixelSize(index, bVar13.f2504L);
                    continue;
                case 15:
                    b bVar14 = aVar.f2489d;
                    bVar14.f2507O = typedArray.getDimensionPixelSize(index, bVar14.f2507O);
                    continue;
                case 16:
                    b bVar15 = aVar.f2489d;
                    bVar15.f2503K = typedArray.getDimensionPixelSize(index, bVar15.f2503K);
                    continue;
                case 17:
                    b bVar16 = aVar.f2489d;
                    bVar16.f2527e = typedArray.getDimensionPixelOffset(index, bVar16.f2527e);
                    continue;
                case 18:
                    b bVar17 = aVar.f2489d;
                    bVar17.f2529f = typedArray.getDimensionPixelOffset(index, bVar17.f2529f);
                    continue;
                case 19:
                    b bVar18 = aVar.f2489d;
                    bVar18.f2531g = typedArray.getFloat(index, bVar18.f2531g);
                    continue;
                case 20:
                    b bVar19 = aVar.f2489d;
                    bVar19.f2549u = typedArray.getFloat(index, bVar19.f2549u);
                    continue;
                case 21:
                    b bVar20 = aVar.f2489d;
                    bVar20.f2525d = typedArray.getLayoutDimension(index, bVar20.f2525d);
                    continue;
                case 22:
                    d dVar = aVar.f2487b;
                    dVar.f2564b = typedArray.getInt(index, dVar.f2564b);
                    d dVar2 = aVar.f2487b;
                    dVar2.f2564b = f2481d[dVar2.f2564b];
                    continue;
                case 23:
                    b bVar21 = aVar.f2489d;
                    bVar21.f2523c = typedArray.getLayoutDimension(index, bVar21.f2523c);
                    continue;
                case 24:
                    b bVar22 = aVar.f2489d;
                    bVar22.f2496D = typedArray.getDimensionPixelSize(index, bVar22.f2496D);
                    continue;
                case 25:
                    b bVar23 = aVar.f2489d;
                    bVar23.f2533h = m1734o(typedArray, index, bVar23.f2533h);
                    continue;
                case 26:
                    b bVar24 = aVar.f2489d;
                    bVar24.f2535i = m1734o(typedArray, index, bVar24.f2535i);
                    continue;
                case 27:
                    b bVar25 = aVar.f2489d;
                    bVar25.f2495C = typedArray.getInt(index, bVar25.f2495C);
                    continue;
                case 28:
                    b bVar26 = aVar.f2489d;
                    bVar26.f2497E = typedArray.getDimensionPixelSize(index, bVar26.f2497E);
                    continue;
                case 29:
                    b bVar27 = aVar.f2489d;
                    bVar27.f2537j = m1734o(typedArray, index, bVar27.f2537j);
                    continue;
                case 30:
                    b bVar28 = aVar.f2489d;
                    bVar28.f2539k = m1734o(typedArray, index, bVar28.f2539k);
                    continue;
                case 31:
                    b bVar29 = aVar.f2489d;
                    bVar29.f2501I = typedArray.getDimensionPixelSize(index, bVar29.f2501I);
                    continue;
                case 32:
                    b bVar30 = aVar.f2489d;
                    bVar30.f2545q = m1734o(typedArray, index, bVar30.f2545q);
                    continue;
                case 33:
                    b bVar31 = aVar.f2489d;
                    bVar31.f2546r = m1734o(typedArray, index, bVar31.f2546r);
                    continue;
                case 34:
                    b bVar32 = aVar.f2489d;
                    bVar32.f2498F = typedArray.getDimensionPixelSize(index, bVar32.f2498F);
                    continue;
                case 35:
                    b bVar33 = aVar.f2489d;
                    bVar33.f2541m = m1734o(typedArray, index, bVar33.f2541m);
                    continue;
                case 36:
                    b bVar34 = aVar.f2489d;
                    bVar34.f2540l = m1734o(typedArray, index, bVar34.f2540l);
                    continue;
                case 37:
                    b bVar35 = aVar.f2489d;
                    bVar35.f2550v = typedArray.getFloat(index, bVar35.f2550v);
                    continue;
                case 38:
                    aVar.f2486a = typedArray.getResourceId(index, aVar.f2486a);
                    continue;
                case 39:
                    b bVar36 = aVar.f2489d;
                    bVar36.f2509Q = typedArray.getFloat(index, bVar36.f2509Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f2489d;
                    bVar37.f2508P = typedArray.getFloat(index, bVar37.f2508P);
                    continue;
                case 41:
                    b bVar38 = aVar.f2489d;
                    bVar38.f2510R = typedArray.getInt(index, bVar38.f2510R);
                    continue;
                case 42:
                    b bVar39 = aVar.f2489d;
                    bVar39.f2511S = typedArray.getInt(index, bVar39.f2511S);
                    continue;
                case 43:
                    d dVar3 = aVar.f2487b;
                    dVar3.f2566d = typedArray.getFloat(index, dVar3.f2566d);
                    continue;
                case 44:
                    e eVar = aVar.f2490e;
                    eVar.f2580l = true;
                    eVar.f2581m = typedArray.getDimension(index, eVar.f2581m);
                    continue;
                case 45:
                    e eVar2 = aVar.f2490e;
                    eVar2.f2571c = typedArray.getFloat(index, eVar2.f2571c);
                    continue;
                case 46:
                    e eVar3 = aVar.f2490e;
                    eVar3.f2572d = typedArray.getFloat(index, eVar3.f2572d);
                    continue;
                case 47:
                    e eVar4 = aVar.f2490e;
                    eVar4.f2573e = typedArray.getFloat(index, eVar4.f2573e);
                    continue;
                case 48:
                    e eVar5 = aVar.f2490e;
                    eVar5.f2574f = typedArray.getFloat(index, eVar5.f2574f);
                    continue;
                case 49:
                    e eVar6 = aVar.f2490e;
                    eVar6.f2575g = typedArray.getDimension(index, eVar6.f2575g);
                    continue;
                case 50:
                    e eVar7 = aVar.f2490e;
                    eVar7.f2576h = typedArray.getDimension(index, eVar7.f2576h);
                    continue;
                case 51:
                    e eVar8 = aVar.f2490e;
                    eVar8.f2577i = typedArray.getDimension(index, eVar8.f2577i);
                    continue;
                case 52:
                    e eVar9 = aVar.f2490e;
                    eVar9.f2578j = typedArray.getDimension(index, eVar9.f2578j);
                    continue;
                case 53:
                    e eVar10 = aVar.f2490e;
                    eVar10.f2579k = typedArray.getDimension(index, eVar10.f2579k);
                    continue;
                case 54:
                    b bVar40 = aVar.f2489d;
                    bVar40.f2512T = typedArray.getInt(index, bVar40.f2512T);
                    continue;
                case 55:
                    b bVar41 = aVar.f2489d;
                    bVar41.f2513U = typedArray.getInt(index, bVar41.f2513U);
                    continue;
                case 56:
                    b bVar42 = aVar.f2489d;
                    bVar42.f2514V = typedArray.getDimensionPixelSize(index, bVar42.f2514V);
                    continue;
                case 57:
                    b bVar43 = aVar.f2489d;
                    bVar43.f2515W = typedArray.getDimensionPixelSize(index, bVar43.f2515W);
                    continue;
                case 58:
                    b bVar44 = aVar.f2489d;
                    bVar44.f2516X = typedArray.getDimensionPixelSize(index, bVar44.f2516X);
                    continue;
                case 59:
                    b bVar45 = aVar.f2489d;
                    bVar45.f2517Y = typedArray.getDimensionPixelSize(index, bVar45.f2517Y);
                    continue;
                case 60:
                    e eVar11 = aVar.f2490e;
                    eVar11.f2570b = typedArray.getFloat(index, eVar11.f2570b);
                    continue;
                case 61:
                    b bVar46 = aVar.f2489d;
                    bVar46.f2552x = m1734o(typedArray, index, bVar46.f2552x);
                    continue;
                case 62:
                    b bVar47 = aVar.f2489d;
                    bVar47.f2553y = typedArray.getDimensionPixelSize(index, bVar47.f2553y);
                    continue;
                case 63:
                    b bVar48 = aVar.f2489d;
                    bVar48.f2554z = typedArray.getFloat(index, bVar48.f2554z);
                    continue;
                case 64:
                    c cVar2 = aVar.f2488c;
                    cVar2.f2557b = m1734o(typedArray, index, cVar2.f2557b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f2488c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f2488c;
                        str = C8589a.f40044c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f2558c = str;
                    continue;
                case 66:
                    aVar.f2488c.f2560e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f2488c;
                    cVar3.f2562g = typedArray.getFloat(index, cVar3.f2562g);
                    continue;
                case 68:
                    d dVar4 = aVar.f2487b;
                    dVar4.f2567e = typedArray.getFloat(index, dVar4.f2567e);
                    continue;
                case 69:
                    aVar.f2489d.f2518Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f2489d.f2520a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f2489d;
                    bVar49.f2522b0 = typedArray.getInt(index, bVar49.f2522b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f2489d;
                    bVar50.f2524c0 = typedArray.getDimensionPixelSize(index, bVar50.f2524c0);
                    continue;
                case 74:
                    aVar.f2489d.f2530f0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f2489d;
                    bVar51.f2538j0 = typedArray.getBoolean(index, bVar51.f2538j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f2488c;
                    cVar4.f2559d = typedArray.getInt(index, cVar4.f2559d);
                    continue;
                case 77:
                    aVar.f2489d.f2532g0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f2487b;
                    dVar5.f2565c = typedArray.getInt(index, dVar5.f2565c);
                    continue;
                case 79:
                    c cVar5 = aVar.f2488c;
                    cVar5.f2561f = typedArray.getFloat(index, cVar5.f2561f);
                    continue;
                case 80:
                    b bVar52 = aVar.f2489d;
                    bVar52.f2534h0 = typedArray.getBoolean(index, bVar52.f2534h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f2489d;
                    bVar53.f2536i0 = typedArray.getBoolean(index, bVar53.f2536i0);
                    continue;
                case 82:
                    sb2 = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb2 = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb2.append(str2);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(f2482e.get(index));
            Log.w("ConstraintSet", sb2.toString());
        }
    }
}
