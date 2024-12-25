package p301r6;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$Builder;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4400z;
import p059d9.C4401z0;
import p208m1.ExecutorC5892a;
import p267p6.C7603n1;
import p267p6.C7629w0;
import p301r6.C8006x;
import p301r6.InterfaceC7980h;
import p301r6.InterfaceC8003u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/f0.class
 */
/* renamed from: r6.f0 */
/* loaded from: combined.jar:classes2.jar:r6/f0.class */
public final class C7977f0 implements InterfaceC8003u {

    /* renamed from: a0 */
    public static boolean f38517a0;

    /* renamed from: A */
    public long f38518A;

    /* renamed from: B */
    public long f38519B;

    /* renamed from: C */
    public long f38520C;

    /* renamed from: D */
    public int f38521D;

    /* renamed from: E */
    public boolean f38522E;

    /* renamed from: F */
    public boolean f38523F;

    /* renamed from: G */
    public long f38524G;

    /* renamed from: H */
    public float f38525H;

    /* renamed from: I */
    public InterfaceC7980h[] f38526I;

    /* renamed from: J */
    public ByteBuffer[] f38527J;

    /* renamed from: K */
    public ByteBuffer f38528K;

    /* renamed from: L */
    public int f38529L;

    /* renamed from: M */
    public ByteBuffer f38530M;

    /* renamed from: N */
    public byte[] f38531N;

    /* renamed from: O */
    public int f38532O;

    /* renamed from: P */
    public int f38533P;

    /* renamed from: Q */
    public boolean f38534Q;

    /* renamed from: R */
    public boolean f38535R;

    /* renamed from: S */
    public boolean f38536S;

    /* renamed from: T */
    public boolean f38537T;

    /* renamed from: U */
    public int f38538U;

    /* renamed from: V */
    public C8007y f38539V;

    /* renamed from: W */
    public boolean f38540W;

    /* renamed from: X */
    public long f38541X;

    /* renamed from: Y */
    public boolean f38542Y;

    /* renamed from: Z */
    public boolean f38543Z;

    /* renamed from: a */
    public final C7976f f38544a;

    /* renamed from: b */
    public final b f38545b;

    /* renamed from: c */
    public final boolean f38546c;

    /* renamed from: d */
    public final C7967a0 f38547d;

    /* renamed from: e */
    public final C7997p0 f38548e;

    /* renamed from: f */
    public final InterfaceC7980h[] f38549f;

    /* renamed from: g */
    public final InterfaceC7980h[] f38550g;

    /* renamed from: h */
    public final ConditionVariable f38551h;

    /* renamed from: i */
    public final C8006x f38552i;

    /* renamed from: j */
    public final ArrayDeque<f> f38553j;

    /* renamed from: k */
    public final boolean f38554k;

    /* renamed from: l */
    public final int f38555l;

    /* renamed from: m */
    public i f38556m;

    /* renamed from: n */
    public final g<InterfaceC8003u.b> f38557n;

    /* renamed from: o */
    public final g<InterfaceC8003u.e> f38558o;

    /* renamed from: p */
    public InterfaceC8003u.c f38559p;

    /* renamed from: q */
    public c f38560q;

    /* renamed from: r */
    public c f38561r;

    /* renamed from: s */
    public AudioTrack f38562s;

    /* renamed from: t */
    public C7972d f38563t;

    /* renamed from: u */
    public f f38564u;

    /* renamed from: v */
    public f f38565v;

    /* renamed from: w */
    public C7603n1 f38566w;

    /* renamed from: x */
    public ByteBuffer f38567x;

    /* renamed from: y */
    public int f38568y;

    /* renamed from: z */
    public long f38569z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$a.class
     */
    /* renamed from: r6.f0$a */
    /* loaded from: combined.jar:classes2.jar:r6/f0$a.class */
    public class a extends Thread {

        /* renamed from: b */
        public final AudioTrack f38570b;

        /* renamed from: c */
        public final C7977f0 f38571c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7977f0 c7977f0, String str, AudioTrack audioTrack) {
            super(str);
            this.f38571c = c7977f0;
            this.f38570b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f38570b.flush();
                this.f38570b.release();
            } finally {
                this.f38571c.f38551h.open();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$b.class
     */
    /* renamed from: r6.f0$b */
    /* loaded from: combined.jar:classes2.jar:r6/f0$b.class */
    public interface b {
        /* renamed from: a */
        long mo34655a(long j10);

        /* renamed from: b */
        InterfaceC7980h[] mo34656b();

        /* renamed from: c */
        C7603n1 mo34657c(C7603n1 c7603n1);

        /* renamed from: d */
        long mo34658d();

        /* renamed from: e */
        boolean mo34659e(boolean z10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$c.class
     */
    /* renamed from: r6.f0$c */
    /* loaded from: combined.jar:classes2.jar:r6/f0$c.class */
    public static final class c {

        /* renamed from: a */
        public final C7629w0 f38572a;

        /* renamed from: b */
        public final int f38573b;

        /* renamed from: c */
        public final int f38574c;

        /* renamed from: d */
        public final int f38575d;

        /* renamed from: e */
        public final int f38576e;

        /* renamed from: f */
        public final int f38577f;

        /* renamed from: g */
        public final int f38578g;

        /* renamed from: h */
        public final int f38579h;

        /* renamed from: i */
        public final InterfaceC7980h[] f38580i;

        public c(C7629w0 c7629w0, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, InterfaceC7980h[] interfaceC7980hArr) {
            this.f38572a = c7629w0;
            this.f38573b = i10;
            this.f38574c = i11;
            this.f38575d = i12;
            this.f38576e = i13;
            this.f38577f = i14;
            this.f38578g = i15;
            this.f38580i = interfaceC7980hArr;
            this.f38579h = m34664c(i16, z10);
        }

        /* renamed from: j */
        public static AudioAttributes m34660j(C7972d c7972d, boolean z10) {
            return z10 ? m34661k() : c7972d.m34575a();
        }

        /* renamed from: k */
        public static AudioAttributes m34661k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0059
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        /* renamed from: a */
        public android.media.AudioTrack m34662a(boolean r11, p301r6.C7972d r12, int r13) {
            /*
                r10 = this;
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                android.media.AudioTrack r0 = r0.m34665d(r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L36 java.lang.UnsupportedOperationException -> L3a
                r12 = r0
                r0 = r12
                int r0 = r0.getState()
                r13 = r0
                r0 = r13
                r1 = 1
                if (r0 != r1) goto L14
                r0 = r12
                return r0
            L14:
                r0 = r12
                r0.release()     // Catch: java.lang.Exception -> L59
            L18:
                r6.u$b r0 = new r6.u$b     // Catch: java.lang.Exception -> L59
                r1 = r0
                r2 = r13
                r3 = r10
                int r3 = r3.f38576e
                r4 = r10
                int r4 = r4.f38577f
                r5 = r10
                int r5 = r5.f38579h
                r6 = r10
                p6.w0 r6 = r6.f38572a
                r7 = r10
                boolean r7 = r7.m34674o()
                r8 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                throw r0
            L36:
                r12 = move-exception
                goto L3b
            L3a:
                r12 = move-exception
            L3b:
                r6.u$b r0 = new r6.u$b
                r1 = r0
                r2 = 0
                r3 = r10
                int r3 = r3.f38576e
                r4 = r10
                int r4 = r4.f38577f
                r5 = r10
                int r5 = r5.f38579h
                r6 = r10
                p6.w0 r6 = r6.f38572a
                r7 = r10
                boolean r7 = r7.m34674o()
                r8 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                throw r0
            L59:
                r12 = move-exception
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: p301r6.C7977f0.c.m34662a(boolean, r6.d, int):android.media.AudioTrack");
        }

        /* renamed from: b */
        public boolean m34663b(c cVar) {
            return cVar.f38574c == this.f38574c && cVar.f38578g == this.f38578g && cVar.f38576e == this.f38576e && cVar.f38577f == this.f38577f && cVar.f38575d == this.f38575d;
        }

        /* renamed from: c */
        public final int m34664c(int i10, boolean z10) {
            long j10;
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f38574c;
            if (i11 == 0) {
                return m34672m(z10 ? 8.0f : 1.0f);
            }
            if (i11 == 1) {
                j10 = 50000000;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                j10 = 250000;
            }
            return m34671l(j10);
        }

        /* renamed from: d */
        public final AudioTrack m34665d(boolean z10, C7972d c7972d, int i10) {
            int i11 = C4401z0.f26679a;
            return i11 >= 29 ? m34667f(z10, c7972d, i10) : i11 >= 21 ? m34666e(z10, c7972d, i10) : m34668g(c7972d, i10);
        }

        /* renamed from: e */
        public final AudioTrack m34666e(boolean z10, C7972d c7972d, int i10) {
            return new AudioTrack(m34660j(c7972d, z10), C7977f0.m34589I(this.f38576e, this.f38577f, this.f38578g), this.f38579h, 1, i10);
        }

        /* renamed from: f */
        public final AudioTrack m34667f(boolean z10, C7972d c7972d, int i10) {
            AudioTrack$Builder offloadedPlayback;
            AudioFormat m34589I = C7977f0.m34589I(this.f38576e, this.f38577f, this.f38578g);
            AudioAttributes m34660j = m34660j(c7972d, z10);
            boolean z11 = true;
            AudioTrack$Builder sessionId = new AudioTrack$Builder().setAudioAttributes(m34660j).setAudioFormat(m34589I).setTransferMode(1).setBufferSizeInBytes(this.f38579h).setSessionId(i10);
            if (this.f38574c != 1) {
                z11 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z11);
            return offloadedPlayback.build();
        }

        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        /* renamed from: g */
        public final android.media.AudioTrack m34668g(
        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
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

        /* renamed from: h */
        public long m34669h(long j10) {
            return (j10 * this.f38576e) / 1000000;
        }

        /* renamed from: i */
        public long m34670i(long j10) {
            return (j10 * 1000000) / this.f38576e;
        }

        /* renamed from: l */
        public final int m34671l(long j10) {
            int m34594O = C7977f0.m34594O(this.f38578g);
            int i10 = m34594O;
            if (this.f38578g == 5) {
                i10 = m34594O * 2;
            }
            return (int) ((j10 * i10) / 1000000);
        }

        /* renamed from: m */
        public final int m34672m(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f38576e, this.f38577f, this.f38578g);
            C4349a.m21884g(minBufferSize != -2);
            int m22409s = C4401z0.m22409s(minBufferSize * 4, ((int) m34669h(250000L)) * this.f38575d, Math.max(minBufferSize, ((int) m34669h(750000L)) * this.f38575d));
            int i10 = m22409s;
            if (f10 != 1.0f) {
                i10 = Math.round(m22409s * f10);
            }
            return i10;
        }

        /* renamed from: n */
        public long m34673n(long j10) {
            return (j10 * 1000000) / this.f38572a.f37068A;
        }

        /* renamed from: o */
        public boolean m34674o() {
            boolean z10 = true;
            if (this.f38574c != 1) {
                z10 = false;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$d.class
     */
    /* renamed from: r6.f0$d */
    /* loaded from: combined.jar:classes2.jar:r6/f0$d.class */
    public static class d implements b {

        /* renamed from: a */
        public final InterfaceC7980h[] f38581a;

        /* renamed from: b */
        public final C7991m0 f38582b;

        /* renamed from: c */
        public final C7995o0 f38583c;

        public d(InterfaceC7980h... interfaceC7980hArr) {
            this(interfaceC7980hArr, new C7991m0(), new C7995o0());
        }

        public d(InterfaceC7980h[] interfaceC7980hArr, C7991m0 c7991m0, C7995o0 c7995o0) {
            InterfaceC7980h[] interfaceC7980hArr2 = new InterfaceC7980h[interfaceC7980hArr.length + 2];
            this.f38581a = interfaceC7980hArr2;
            System.arraycopy(interfaceC7980hArr, 0, interfaceC7980hArr2, 0, interfaceC7980hArr.length);
            this.f38582b = c7991m0;
            this.f38583c = c7995o0;
            interfaceC7980hArr2[interfaceC7980hArr.length] = c7991m0;
            interfaceC7980hArr2[interfaceC7980hArr.length + 1] = c7995o0;
        }

        @Override // p301r6.C7977f0.b
        /* renamed from: a */
        public long mo34655a(long j10) {
            return this.f38583c.m34773f(j10);
        }

        @Override // p301r6.C7977f0.b
        /* renamed from: b */
        public InterfaceC7980h[] mo34656b() {
            return this.f38581a;
        }

        @Override // p301r6.C7977f0.b
        /* renamed from: c */
        public C7603n1 mo34657c(C7603n1 c7603n1) {
            this.f38583c.m34775h(c7603n1.f36896a);
            this.f38583c.m34774g(c7603n1.f36897b);
            return c7603n1;
        }

        @Override // p301r6.C7977f0.b
        /* renamed from: d */
        public long mo34658d() {
            return this.f38582b.m34742o();
        }

        @Override // p301r6.C7977f0.b
        /* renamed from: e */
        public boolean mo34659e(boolean z10) {
            this.f38582b.m34748u(z10);
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$e.class
     */
    /* renamed from: r6.f0$e */
    /* loaded from: combined.jar:classes2.jar:r6/f0$e.class */
    public static final class e extends RuntimeException {
        public e(String str) {
            super(str);
        }

        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$f.class
     */
    /* renamed from: r6.f0$f */
    /* loaded from: combined.jar:classes2.jar:r6/f0$f.class */
    public static final class f {

        /* renamed from: a */
        public final C7603n1 f38584a;

        /* renamed from: b */
        public final boolean f38585b;

        /* renamed from: c */
        public final long f38586c;

        /* renamed from: d */
        public final long f38587d;

        public f(C7603n1 c7603n1, boolean z10, long j10, long j11) {
            this.f38584a = c7603n1;
            this.f38585b = z10;
            this.f38586c = j10;
            this.f38587d = j11;
        }

        public /* synthetic */ f(C7603n1 c7603n1, boolean z10, long j10, long j11, a aVar) {
            this(c7603n1, z10, j10, j11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$g.class
     */
    /* renamed from: r6.f0$g */
    /* loaded from: combined.jar:classes2.jar:r6/f0$g.class */
    public static final class g<T extends Exception> {

        /* renamed from: a */
        public final long f38588a;

        /* renamed from: b */
        public T f38589b;

        /* renamed from: c */
        public long f38590c;

        public g(long j10) {
            this.f38588a = j10;
        }

        /* renamed from: a */
        public void m34675a() {
            this.f38589b = null;
        }

        /* renamed from: b */
        public void m34676b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f38589b == null) {
                this.f38589b = t10;
                this.f38590c = this.f38588a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f38590c) {
                T t11 = this.f38589b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f38589b;
                m34675a();
                throw t12;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$h.class
     */
    /* renamed from: r6.f0$h */
    /* loaded from: combined.jar:classes2.jar:r6/f0$h.class */
    public final class h implements C8006x.a {

        /* renamed from: a */
        public final C7977f0 f38591a;

        public h(C7977f0 c7977f0) {
            this.f38591a = c7977f0;
        }

        public /* synthetic */ h(C7977f0 c7977f0, a aVar) {
            this(c7977f0);
        }

        @Override // p301r6.C8006x.a
        /* renamed from: a */
        public void mo34677a(int i10, long j10) {
            if (this.f38591a.f38559p != null) {
                this.f38591a.f38559p.mo34565e(i10, j10, SystemClock.elapsedRealtime() - this.f38591a.f38541X);
            }
        }

        @Override // p301r6.C8006x.a
        /* renamed from: b */
        public void mo34678b(long j10) {
            C4392v.m22275i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // p301r6.C8006x.a
        /* renamed from: c */
        public void mo34679c(long j10) {
            if (this.f38591a.f38559p != null) {
                this.f38591a.f38559p.mo34563c(j10);
            }
        }

        @Override // p301r6.C8006x.a
        /* renamed from: d */
        public void mo34680d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + this.f38591a.m34618R() + ", " + this.f38591a.m34619S();
            if (C7977f0.f38517a0) {
                throw new e(str, null);
            }
            C4392v.m22275i("DefaultAudioSink", str);
        }

        @Override // p301r6.C8006x.a
        /* renamed from: e */
        public void mo34681e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + this.f38591a.m34618R() + ", " + this.f38591a.m34619S();
            if (C7977f0.f38517a0) {
                throw new e(str, null);
            }
            C4392v.m22275i("DefaultAudioSink", str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/f0$i.class
     */
    /* renamed from: r6.f0$i */
    /* loaded from: combined.jar:classes2.jar:r6/f0$i.class */
    public final class i {

        /* renamed from: a */
        public final Handler f38592a = new Handler();

        /* renamed from: b */
        public final AudioTrack$StreamEventCallback f38593b;

        /* renamed from: c */
        public final C7977f0 f38594c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:r6/f0$i$a.class
         */
        /* renamed from: r6.f0$i$a */
        /* loaded from: combined.jar:classes2.jar:r6/f0$i$a.class */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a */
            public final C7977f0 f38595a;

            /* renamed from: b */
            public final i f38596b;

            public a(i iVar, C7977f0 c7977f0) {
                this.f38596b = iVar;
                this.f38595a = c7977f0;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                C4349a.m21884g(audioTrack == this.f38596b.f38594c.f38562s);
                if (this.f38596b.f38594c.f38559p == null || !this.f38596b.f38594c.f38536S) {
                    return;
                }
                this.f38596b.f38594c.f38559p.mo34567g();
            }

            public void onTearDown(AudioTrack audioTrack) {
                C4349a.m21884g(audioTrack == this.f38596b.f38594c.f38562s);
                if (this.f38596b.f38594c.f38559p == null || !this.f38596b.f38594c.f38536S) {
                    return;
                }
                this.f38596b.f38594c.f38559p.mo34567g();
            }
        }

        public i(C7977f0 c7977f0) {
            this.f38594c = c7977f0;
            this.f38593b = new a(this, c7977f0);
        }

        /* renamed from: a */
        public void m34682a(AudioTrack audioTrack) {
            Handler handler = this.f38592a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC5892a(handler), this.f38593b);
        }

        /* renamed from: b */
        public void m34683b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f38593b);
            this.f38592a.removeCallbacksAndMessages(null);
        }
    }

    public C7977f0(C7976f c7976f, b bVar, boolean z10, boolean z11, int i10) {
        this.f38544a = c7976f;
        this.f38545b = (b) C4349a.m21882e(bVar);
        int i11 = C4401z0.f26679a;
        this.f38546c = i11 >= 21 && z10;
        this.f38554k = i11 >= 23 && z11;
        this.f38555l = i11 < 29 ? 0 : i10;
        this.f38551h = new ConditionVariable(true);
        this.f38552i = new C8006x(new h(this, null));
        C7967a0 c7967a0 = new C7967a0();
        this.f38547d = c7967a0;
        C7997p0 c7997p0 = new C7997p0();
        this.f38548e = c7997p0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C7989l0(), c7967a0, c7997p0);
        Collections.addAll(arrayList, bVar.mo34656b());
        this.f38549f = (InterfaceC7980h[]) arrayList.toArray(new InterfaceC7980h[0]);
        this.f38550g = new InterfaceC7980h[]{new C7981h0()};
        this.f38525H = 1.0f;
        this.f38563t = C7972d.f38501f;
        this.f38538U = 0;
        this.f38539V = new C8007y(0, 0.0f);
        C7603n1 c7603n1 = C7603n1.f36894d;
        this.f38565v = new f(c7603n1, false, 0L, 0L, null);
        this.f38566w = c7603n1;
        this.f38533P = -1;
        this.f38526I = new InterfaceC7980h[0];
        this.f38527J = new ByteBuffer[0];
        this.f38553j = new ArrayDeque<>();
        this.f38557n = new g<>(100L);
        this.f38558o = new g<>(100L);
    }

    public C7977f0(C7976f c7976f, InterfaceC7980h[] interfaceC7980hArr) {
        this(c7976f, interfaceC7980hArr, false);
    }

    public C7977f0(C7976f c7976f, InterfaceC7980h[] interfaceC7980hArr, boolean z10) {
        this(c7976f, new d(interfaceC7980hArr), z10, false, 0);
    }

    /* renamed from: I */
    public static AudioFormat m34589I(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r3 == 5) goto L13;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m34590K(int r3) {
        /*
            int r0 = p059d9.C4401z0.f26679a
            r5 = r0
            r0 = r3
            r4 = r0
            r0 = r5
            r1 = 28
            if (r0 > r1) goto L2c
            r0 = r3
            r1 = 7
            if (r0 != r1) goto L18
            r0 = 8
            r4 = r0
            goto L2c
        L18:
            r0 = r3
            r1 = 3
            if (r0 == r1) goto L29
            r0 = r3
            r1 = 4
            if (r0 == r1) goto L29
            r0 = r3
            r4 = r0
            r0 = r3
            r1 = 5
            if (r0 != r1) goto L2c
        L29:
            r0 = 6
            r4 = r0
        L2c:
            r0 = r4
            r3 = r0
            r0 = r5
            r1 = 26
            if (r0 > r1) goto L4b
            r0 = r4
            r3 = r0
            java.lang.String r0 = "fugu"
            java.lang.String r1 = p059d9.C4401z0.f26680b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r4
            r3 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L4b
            r0 = 2
            r3 = r0
        L4b:
            r0 = r3
            int r0 = p059d9.C4401z0.m22329I(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C7977f0.m34590K(int):int");
    }

    /* renamed from: L */
    public static Pair<Integer, Integer> m34591L(C7629w0 c7629w0, C7976f c7976f) {
        int i10;
        if (c7976f == null) {
            return null;
        }
        int m22298f = C4400z.m22298f((String) C4349a.m21882e(c7629w0.f37086m), c7629w0.f37083j);
        int i11 = 6;
        if (!(m22298f == 5 || m22298f == 6 || m22298f == 18 || m22298f == 17 || m22298f == 7 || m22298f == 8 || m22298f == 14)) {
            return null;
        }
        if (m22298f != 18 || c7976f.m34585f(18)) {
            i10 = m22298f;
            if (m22298f == 8) {
                i10 = m22298f;
                if (!c7976f.m34585f(8)) {
                    i10 = 7;
                }
            }
        } else {
            i10 = 6;
        }
        if (!c7976f.m34585f(i10)) {
            return null;
        }
        if (i10 != 18) {
            int i12 = c7629w0.f37099z;
            i11 = i12;
            if (i12 > c7976f.m34584e()) {
                return null;
            }
        } else if (C4401z0.f26679a >= 29) {
            int m34593N = m34593N(18, c7629w0.f37068A);
            i11 = m34593N;
            if (m34593N == 0) {
                C4392v.m22275i("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        }
        int m34590K = m34590K(i11);
        if (m34590K == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(i10), Integer.valueOf(m34590K));
    }

    /* renamed from: M */
    public static int m34592M(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return C7968b.m34539d(byteBuffer);
            case 7:
            case 8:
                return C7979g0.m34688e(byteBuffer);
            case 9:
                int m34728m = C7985j0.m34728m(C4401z0.m22331J(byteBuffer, byteBuffer.position()));
                if (m34728m != -1) {
                    return m34728m;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int m34536a = C7968b.m34536a(byteBuffer);
                return m34536a == -1 ? 0 : C7968b.m34543h(byteBuffer, m34536a) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C7970c.m34570c(byteBuffer);
        }
    }

    /* renamed from: N */
    public static int m34593N(int i10, int i11) {
        boolean isDirectPlaybackSupported;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(C4401z0.m22329I(i12)).build(), build);
            if (isDirectPlaybackSupported) {
                return i12;
            }
        }
        return 0;
    }

    /* renamed from: O */
    public static int m34594O(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    /* renamed from: U */
    public static boolean m34595U(int i10) {
        return (C4401z0.f26679a >= 24 && i10 == -6) || i10 == -32;
    }

    /* renamed from: W */
    public static boolean m34596W() {
        return C4401z0.f26679a >= 30 && C4401z0.f26682d.startsWith("Pixel");
    }

    /* renamed from: X */
    public static boolean m34597X(AudioTrack audioTrack) {
        boolean z10;
        boolean isOffloadedPlayback;
        if (C4401z0.f26679a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: Y */
    public static boolean m34598Y(C7629w0 c7629w0, C7976f c7976f) {
        return m34591L(c7629w0, c7976f) != null;
    }

    /* renamed from: h0 */
    public static void m34599h0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    /* renamed from: i0 */
    public static void m34600i0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    /* renamed from: o0 */
    public static int m34601o0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    /* renamed from: C */
    public final void m34609C(long j10) {
        C7603n1 mo34657c = m34642k0() ? this.f38545b.mo34657c(m34615J()) : C7603n1.f36894d;
        boolean mo34659e = m34642k0() ? this.f38545b.mo34659e(m34617Q()) : false;
        this.f38553j.add(new f(mo34657c, mo34659e, Math.max(0L, j10), this.f38561r.m34670i(m34619S()), null));
        m34640j0();
        InterfaceC8003u.c cVar = this.f38559p;
        if (cVar != null) {
            cVar.mo34561a(mo34659e);
        }
    }

    /* renamed from: D */
    public final long m34610D(long j10) {
        while (!this.f38553j.isEmpty() && j10 >= this.f38553j.getFirst().f38587d) {
            this.f38565v = this.f38553j.remove();
        }
        f fVar = this.f38565v;
        long j11 = j10 - fVar.f38587d;
        if (fVar.f38584a.equals(C7603n1.f36894d)) {
            return this.f38565v.f38586c + j11;
        }
        if (this.f38553j.isEmpty()) {
            return this.f38565v.f38586c + this.f38545b.mo34655a(j11);
        }
        f first = this.f38553j.getFirst();
        return first.f38586c - C4401z0.m22363Z(first.f38587d - j10, this.f38565v.f38584a.f36896a);
    }

    /* renamed from: E */
    public final long m34611E(long j10) {
        return j10 + this.f38561r.m34670i(this.f38545b.mo34658d());
    }

    /* renamed from: F */
    public final AudioTrack m34612F() {
        try {
            return ((c) C4349a.m21882e(this.f38561r)).m34662a(this.f38540W, this.f38563t, this.f38538U);
        } catch (InterfaceC8003u.b e10) {
            m34622Z();
            InterfaceC8003u.c cVar = this.f38559p;
            if (cVar != null) {
                cVar.mo34562b(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0044 -> B:4:0x000d). Please report as a decompilation issue!!! */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m34613G() {
        /*
            r5 = this;
            r0 = r5
            int r0 = r0.f38533P
            r1 = -1
            if (r0 != r1) goto L12
            r0 = r5
            r1 = 0
            r0.f38533P = r1
        Ld:
            r0 = 1
            r6 = r0
            goto L14
        L12:
            r0 = 0
            r6 = r0
        L14:
            r0 = r5
            int r0 = r0.f38533P
            r7 = r0
            r0 = r5
            r6.h[] r0 = r0.f38526I
            r8 = r0
            r0 = r7
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L51
            r0 = r8
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L32
            r0 = r8
            r0.mo34694e()
        L32:
            r0 = r5
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.m34626b0(r1)
            r0 = r8
            boolean r0 = r0.mo34693d()
            if (r0 != 0) goto L44
            r0 = 0
            return r0
        L44:
            r0 = r5
            r1 = r5
            int r1 = r1.f38533P
            r2 = 1
            int r1 = r1 + r2
            r0.f38533P = r1
            goto Ld
        L51:
            r0 = r5
            java.nio.ByteBuffer r0 = r0.f38530M
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6b
            r0 = r5
            r1 = r8
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.m34648n0(r1, r2)
            r0 = r5
            java.nio.ByteBuffer r0 = r0.f38530M
            if (r0 == 0) goto L6b
            r0 = 0
            return r0
        L6b:
            r0 = r5
            r1 = -1
            r0.f38533P = r1
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C7977f0.m34613G():boolean");
    }

    /* renamed from: H */
    public final void m34614H() {
        int i10 = 0;
        while (true) {
            InterfaceC7980h[] interfaceC7980hArr = this.f38526I;
            if (i10 >= interfaceC7980hArr.length) {
                return;
            }
            InterfaceC7980h interfaceC7980h = interfaceC7980hArr[i10];
            interfaceC7980h.flush();
            this.f38527J[i10] = interfaceC7980h.mo34691a();
            i10++;
        }
    }

    /* renamed from: J */
    public final C7603n1 m34615J() {
        return m34616P().f38584a;
    }

    /* renamed from: P */
    public final f m34616P() {
        f fVar = this.f38564u;
        if (fVar == null) {
            fVar = !this.f38553j.isEmpty() ? this.f38553j.getLast() : this.f38565v;
        }
        return fVar;
    }

    /* renamed from: Q */
    public boolean m34617Q() {
        return m34616P().f38585b;
    }

    /* renamed from: R */
    public final long m34618R() {
        return this.f38561r.f38574c == 0 ? this.f38569z / r0.f38573b : this.f38518A;
    }

    /* renamed from: S */
    public final long m34619S() {
        return this.f38561r.f38574c == 0 ? this.f38519B / r0.f38575d : this.f38520C;
    }

    /* renamed from: T */
    public final void m34620T() {
        this.f38551h.block();
        AudioTrack m34612F = m34612F();
        this.f38562s = m34612F;
        if (m34597X(m34612F)) {
            m34628c0(this.f38562s);
            if (this.f38555l != 3) {
                AudioTrack audioTrack = this.f38562s;
                C7629w0 c7629w0 = this.f38561r.f38572a;
                audioTrack.setOffloadDelayPadding(c7629w0.f37070C, c7629w0.f37071D);
            }
        }
        this.f38538U = this.f38562s.getAudioSessionId();
        C8006x c8006x = this.f38552i;
        AudioTrack audioTrack2 = this.f38562s;
        c cVar = this.f38561r;
        c8006x.m34842t(audioTrack2, cVar.f38574c == 2, cVar.f38578g, cVar.f38575d, cVar.f38579h);
        m34636g0();
        int i10 = this.f38539V.f38769a;
        if (i10 != 0) {
            this.f38562s.attachAuxEffect(i10);
            this.f38562s.setAuxEffectSendLevel(this.f38539V.f38770b);
        }
        this.f38523F = true;
    }

    /* renamed from: V */
    public final boolean m34621V() {
        return this.f38562s != null;
    }

    /* renamed from: Z */
    public final void m34622Z() {
        if (this.f38561r.m34674o()) {
            this.f38542Y = true;
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: a */
    public boolean mo34623a(C7629w0 c7629w0) {
        return mo34650p(c7629w0) != 0;
    }

    /* renamed from: a0 */
    public final void m34624a0() {
        if (this.f38535R) {
            return;
        }
        this.f38535R = true;
        this.f38552i.m34831h(m34619S());
        this.f38562s.stop();
        this.f38568y = 0;
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: b */
    public C7603n1 mo34625b() {
        return this.f38554k ? this.f38566w : m34615J();
    }

    /* renamed from: b0 */
    public final void m34626b0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.f38526I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.f38527J[i10 - 1];
            } else {
                byteBuffer = this.f38528K;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC7980h.f38600a;
                }
            }
            if (i10 == length) {
                m34648n0(byteBuffer, j10);
            } else {
                InterfaceC7980h interfaceC7980h = this.f38526I[i10];
                if (i10 > this.f38533P) {
                    interfaceC7980h.mo34531c(byteBuffer);
                }
                ByteBuffer mo34691a = interfaceC7980h.mo34691a();
                this.f38527J[i10] = mo34691a;
                if (mo34691a.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: c */
    public void mo34627c(C7603n1 c7603n1) {
        C7603n1 c7603n12 = new C7603n1(C4401z0.m22407r(c7603n1.f36896a, 0.1f, 8.0f), C4401z0.m22407r(c7603n1.f36897b, 0.1f, 8.0f));
        if (!this.f38554k || C4401z0.f26679a < 23) {
            m34632e0(c7603n12, m34617Q());
        } else {
            m34634f0(c7603n12);
        }
    }

    /* renamed from: c0 */
    public final void m34628c0(AudioTrack audioTrack) {
        if (this.f38556m == null) {
            this.f38556m = new i(this);
        }
        this.f38556m.m34682a(audioTrack);
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: d */
    public boolean mo34629d() {
        return !m34621V() || (this.f38534Q && !mo34631e());
    }

    /* renamed from: d0 */
    public final void m34630d0() {
        this.f38569z = 0L;
        this.f38518A = 0L;
        this.f38519B = 0L;
        this.f38520C = 0L;
        this.f38543Z = false;
        this.f38521D = 0;
        this.f38565v = new f(m34615J(), m34617Q(), 0L, 0L, null);
        this.f38524G = 0L;
        this.f38564u = null;
        this.f38553j.clear();
        this.f38528K = null;
        this.f38529L = 0;
        this.f38530M = null;
        this.f38535R = false;
        this.f38534Q = false;
        this.f38533P = -1;
        this.f38567x = null;
        this.f38568y = 0;
        this.f38548e.m34777m();
        m34614H();
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: e */
    public boolean mo34631e() {
        return m34621V() && this.f38552i.m34832i(m34619S());
    }

    /* renamed from: e0 */
    public final void m34632e0(C7603n1 c7603n1, boolean z10) {
        f m34616P = m34616P();
        if (c7603n1.equals(m34616P.f38584a) && z10 == m34616P.f38585b) {
            return;
        }
        f fVar = new f(c7603n1, z10, -9223372036854775807L, -9223372036854775807L, null);
        if (m34621V()) {
            this.f38564u = fVar;
        } else {
            this.f38565v = fVar;
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: f */
    public void mo34633f(InterfaceC8003u.c cVar) {
        this.f38559p = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.media.PlaybackParams] */
    /* renamed from: f0 */
    public final void m34634f0(C7603n1 c7603n1) {
        PlaybackParams playbackParams;
        PlaybackParams playbackParams2;
        C7603n1 c7603n12 = c7603n1;
        if (m34621V()) {
            try {
                this.f38562s.setPlaybackParams(new Parcelable() { // from class: android.media.PlaybackParams
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public native /* synthetic */ PlaybackParams allowDefaults();

                    public native /* synthetic */ float getPitch();

                    public native /* synthetic */ float getSpeed();

                    public native /* synthetic */ PlaybackParams setAudioFallbackMode(int i10);

                    public native /* synthetic */ PlaybackParams setPitch(float f10);

                    public native /* synthetic */ PlaybackParams setSpeed(float f10);
                }.allowDefaults().setSpeed(c7603n1.f36896a).setPitch(c7603n1.f36897b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                C4392v.m22276j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            playbackParams = this.f38562s.getPlaybackParams();
            float speed = playbackParams.getSpeed();
            playbackParams2 = this.f38562s.getPlaybackParams();
            c7603n12 = new C7603n1(speed, playbackParams2.getPitch());
            this.f38552i.m34843u(c7603n12.f36896a);
        }
        this.f38566w = c7603n12;
    }

    @Override // p301r6.InterfaceC8003u
    public void flush() {
        if (m34621V()) {
            m34630d0();
            if (this.f38552i.m34833j()) {
                this.f38562s.pause();
            }
            if (m34597X(this.f38562s)) {
                ((i) C4349a.m21882e(this.f38556m)).m34683b(this.f38562s);
            }
            AudioTrack audioTrack = this.f38562s;
            this.f38562s = null;
            if (C4401z0.f26679a < 21 && !this.f38537T) {
                this.f38538U = 0;
            }
            c cVar = this.f38560q;
            if (cVar != null) {
                this.f38561r = cVar;
                this.f38560q = null;
            }
            this.f38552i.m34840r();
            this.f38551h.close();
            new a(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f38558o.m34675a();
        this.f38557n.m34675a();
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: g */
    public void mo34635g(int i10) {
        if (this.f38538U != i10) {
            this.f38538U = i10;
            this.f38537T = i10 != 0;
            flush();
        }
    }

    /* renamed from: g0 */
    public final void m34636g0() {
        if (m34621V()) {
            if (C4401z0.f26679a >= 21) {
                m34599h0(this.f38562s, this.f38525H);
            } else {
                m34600i0(this.f38562s, this.f38525H);
            }
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: h */
    public void mo34637h() {
        if (this.f38540W) {
            this.f38540W = false;
            flush();
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: i */
    public void mo34638i(C7629w0 c7629w0, int i10, int[] iArr) {
        InterfaceC7980h[] interfaceC7980hArr;
        int intValue;
        int intValue2;
        int i11;
        int i12;
        int i13;
        int i14;
        if ("audio/raw".equals(c7629w0.f37086m)) {
            C4349a.m21878a(C4401z0.m22410s0(c7629w0.f37069B));
            int m22375d0 = C4401z0.m22375d0(c7629w0.f37069B, c7629w0.f37099z);
            InterfaceC7980h[] interfaceC7980hArr2 = m34644l0(c7629w0.f37069B) ? this.f38550g : this.f38549f;
            this.f38548e.m34778n(c7629w0.f37070C, c7629w0.f37071D);
            if (C4401z0.f26679a < 21 && c7629w0.f37099z == 8 && iArr == null) {
                int[] iArr2 = new int[6];
                int i15 = 0;
                while (true) {
                    iArr = iArr2;
                    if (i15 >= 6) {
                        break;
                    }
                    iArr2[i15] = i15;
                    i15++;
                }
            }
            this.f38547d.m34535l(iArr);
            InterfaceC7980h.a aVar = new InterfaceC7980h.a(c7629w0.f37068A, c7629w0.f37099z, c7629w0.f37069B);
            for (InterfaceC7980h interfaceC7980h : interfaceC7980hArr2) {
                try {
                    InterfaceC7980h.a mo34692b = interfaceC7980h.mo34692b(aVar);
                    if (interfaceC7980h.isActive()) {
                        aVar = mo34692b;
                    }
                } catch (InterfaceC7980h.b e10) {
                    throw new InterfaceC8003u.a(e10, c7629w0);
                }
            }
            intValue = aVar.f38604c;
            i13 = aVar.f38602a;
            intValue2 = C4401z0.m22329I(aVar.f38603b);
            i11 = C4401z0.m22375d0(intValue, aVar.f38603b);
            interfaceC7980hArr = interfaceC7980hArr2;
            i14 = m22375d0;
            i12 = 0;
        } else {
            interfaceC7980hArr = new InterfaceC7980h[0];
            int i16 = c7629w0.f37068A;
            if (m34646m0(c7629w0, this.f38563t)) {
                intValue = C4400z.m22298f((String) C4349a.m21882e(c7629w0.f37086m), c7629w0.f37083j);
                intValue2 = C4401z0.m22329I(c7629w0.f37099z);
                i11 = -1;
                i13 = i16;
                i12 = 1;
                i14 = -1;
            } else {
                Pair<Integer, Integer> m34591L = m34591L(c7629w0, this.f38544a);
                if (m34591L == null) {
                    throw new InterfaceC8003u.a("Unable to configure passthrough for: " + c7629w0, c7629w0);
                }
                intValue = ((Integer) m34591L.first).intValue();
                intValue2 = ((Integer) m34591L.second).intValue();
                i11 = -1;
                i12 = 2;
                i13 = i16;
                i14 = -1;
            }
        }
        if (intValue == 0) {
            throw new InterfaceC8003u.a("Invalid output encoding (mode=" + i12 + ") for: " + c7629w0, c7629w0);
        }
        if (intValue2 == 0) {
            throw new InterfaceC8003u.a("Invalid output channel config (mode=" + i12 + ") for: " + c7629w0, c7629w0);
        }
        this.f38542Y = false;
        c cVar = new c(c7629w0, i14, i12, i11, i13, intValue2, intValue, i10, this.f38554k, interfaceC7980hArr);
        if (m34621V()) {
            this.f38560q = cVar;
        } else {
            this.f38561r = cVar;
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: j */
    public void mo34639j(C8007y c8007y) {
        if (this.f38539V.equals(c8007y)) {
            return;
        }
        int i10 = c8007y.f38769a;
        float f10 = c8007y.f38770b;
        AudioTrack audioTrack = this.f38562s;
        if (audioTrack != null) {
            if (this.f38539V.f38769a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f38562s.setAuxEffectSendLevel(f10);
            }
        }
        this.f38539V = c8007y;
    }

    /* renamed from: j0 */
    public final void m34640j0() {
        InterfaceC7980h[] interfaceC7980hArr = this.f38561r.f38580i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7980h interfaceC7980h : interfaceC7980hArr) {
            if (interfaceC7980h.isActive()) {
                arrayList.add(interfaceC7980h);
            } else {
                interfaceC7980h.flush();
            }
        }
        int size = arrayList.size();
        this.f38526I = (InterfaceC7980h[]) arrayList.toArray(new InterfaceC7980h[size]);
        this.f38527J = new ByteBuffer[size];
        m34614H();
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: k */
    public boolean mo34641k(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.f38528K;
        C4349a.m21878a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f38560q != null) {
            if (!m34613G()) {
                return false;
            }
            if (this.f38560q.m34663b(this.f38561r)) {
                this.f38561r = this.f38560q;
                this.f38560q = null;
                if (m34597X(this.f38562s) && this.f38555l != 3) {
                    this.f38562s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f38562s;
                    C7629w0 c7629w0 = this.f38561r.f38572a;
                    audioTrack.setOffloadDelayPadding(c7629w0.f37070C, c7629w0.f37071D);
                    this.f38543Z = true;
                }
            } else {
                m34624a0();
                if (mo34631e()) {
                    return false;
                }
                flush();
            }
            m34609C(j10);
        }
        if (!m34621V()) {
            try {
                m34620T();
            } catch (InterfaceC8003u.b e10) {
                if (e10.f38719c) {
                    throw e10;
                }
                this.f38557n.m34676b(e10);
                return false;
            }
        }
        this.f38557n.m34675a();
        if (this.f38523F) {
            this.f38524G = Math.max(0L, j10);
            this.f38522E = false;
            this.f38523F = false;
            if (this.f38554k && C4401z0.f26679a >= 23) {
                m34634f0(this.f38566w);
            }
            m34609C(j10);
            if (this.f38536S) {
                play();
            }
        }
        if (!this.f38552i.m34835l(m34619S())) {
            return false;
        }
        if (this.f38528K == null) {
            C4349a.m21878a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f38561r;
            if (cVar.f38574c != 0 && this.f38521D == 0) {
                int m34592M = m34592M(cVar.f38578g, byteBuffer);
                this.f38521D = m34592M;
                if (m34592M == 0) {
                    return true;
                }
            }
            if (this.f38564u != null) {
                if (!m34613G()) {
                    return false;
                }
                m34609C(j10);
                this.f38564u = null;
            }
            long m34673n = this.f38524G + this.f38561r.m34673n(m34618R() - this.f38548e.m34776l());
            if (!this.f38522E && Math.abs(m34673n - j10) > 200000) {
                this.f38559p.mo34562b(new InterfaceC8003u.d(j10, m34673n));
                this.f38522E = true;
            }
            if (this.f38522E) {
                if (!m34613G()) {
                    return false;
                }
                long j11 = j10 - m34673n;
                this.f38524G += j11;
                this.f38522E = false;
                m34609C(j10);
                InterfaceC8003u.c cVar2 = this.f38559p;
                if (cVar2 != null && j11 != 0) {
                    cVar2.mo34566f();
                }
            }
            if (this.f38561r.f38574c == 0) {
                this.f38569z += byteBuffer.remaining();
            } else {
                this.f38518A += this.f38521D * i10;
            }
            this.f38528K = byteBuffer;
            this.f38529L = i10;
        }
        m34626b0(j10);
        if (!this.f38528K.hasRemaining()) {
            this.f38528K = null;
            this.f38529L = 0;
            return true;
        }
        if (!this.f38552i.m34834k(m34619S())) {
            return false;
        }
        C4392v.m22275i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    /* renamed from: k0 */
    public final boolean m34642k0() {
        return (this.f38540W || !"audio/raw".equals(this.f38561r.f38572a.f37086m) || m34644l0(this.f38561r.f38572a.f37069B)) ? false : true;
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: l */
    public void mo34643l() {
        if (C4401z0.f26679a < 25) {
            flush();
            return;
        }
        this.f38558o.m34675a();
        this.f38557n.m34675a();
        if (m34621V()) {
            m34630d0();
            if (this.f38552i.m34833j()) {
                this.f38562s.pause();
            }
            this.f38562s.flush();
            this.f38552i.m34840r();
            C8006x c8006x = this.f38552i;
            AudioTrack audioTrack = this.f38562s;
            c cVar = this.f38561r;
            c8006x.m34842t(audioTrack, cVar.f38574c == 2, cVar.f38578g, cVar.f38575d, cVar.f38579h);
            this.f38523F = true;
        }
    }

    /* renamed from: l0 */
    public final boolean m34644l0(int i10) {
        return this.f38546c && C4401z0.m22408r0(i10);
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: m */
    public void mo34645m() {
        if (!this.f38534Q && m34621V() && m34613G()) {
            m34624a0();
            this.f38534Q = true;
        }
    }

    /* renamed from: m0 */
    public final boolean m34646m0(C7629w0 c7629w0, C7972d c7972d) {
        int m22298f;
        int m22329I;
        boolean isOffloadedPlaybackSupported;
        if (C4401z0.f26679a < 29 || this.f38555l == 0 || (m22298f = C4400z.m22298f((String) C4349a.m21882e(c7629w0.f37086m), c7629w0.f37083j)) == 0 || (m22329I = C4401z0.m22329I(c7629w0.f37099z)) == 0) {
            return false;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(m34589I(c7629w0.f37068A, m22329I, m22298f), c7972d.m34575a());
        if (isOffloadedPlaybackSupported) {
            return ((c7629w0.f37070C != 0 || c7629w0.f37071D != 0) && (this.f38555l == 1) && !m34596W()) ? false : true;
        }
        return false;
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: n */
    public long mo34647n(boolean z10) {
        if (!m34621V() || this.f38523F) {
            return Long.MIN_VALUE;
        }
        return m34611E(m34610D(Math.min(this.f38552i.m34827d(z10), this.f38561r.m34670i(m34619S()))));
    }

    /* renamed from: n0 */
    public final void m34648n0(ByteBuffer byteBuffer, long j10) {
        int m34601o0;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f38530M;
            if (byteBuffer2 != null) {
                C4349a.m21878a(byteBuffer2 == byteBuffer);
            } else {
                this.f38530M = byteBuffer;
                if (C4401z0.f26679a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f38531N;
                    if (bArr == null || bArr.length < remaining) {
                        this.f38531N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f38531N, 0, remaining);
                    byteBuffer.position(position);
                    this.f38532O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C4401z0.f26679a < 21) {
                int m34826c = this.f38552i.m34826c(this.f38519B);
                if (m34826c > 0) {
                    int write = this.f38562s.write(this.f38531N, this.f38532O, Math.min(remaining2, m34826c));
                    m34601o0 = write;
                    if (write > 0) {
                        this.f38532O += write;
                        byteBuffer.position(byteBuffer.position() + write);
                        m34601o0 = write;
                    }
                } else {
                    m34601o0 = 0;
                }
            } else if (this.f38540W) {
                C4349a.m21884g(j10 != -9223372036854775807L);
                m34601o0 = m34651p0(this.f38562s, byteBuffer, remaining2, j10);
            } else {
                m34601o0 = m34601o0(this.f38562s, byteBuffer, remaining2);
            }
            this.f38541X = SystemClock.elapsedRealtime();
            if (m34601o0 < 0) {
                boolean m34595U = m34595U(m34601o0);
                if (m34595U) {
                    m34622Z();
                }
                InterfaceC8003u.e eVar = new InterfaceC8003u.e(m34601o0, this.f38561r.f38572a, m34595U);
                InterfaceC8003u.c cVar = this.f38559p;
                if (cVar != null) {
                    cVar.mo34562b(eVar);
                }
                if (eVar.f38724c) {
                    throw eVar;
                }
                this.f38558o.m34676b(eVar);
                return;
            }
            this.f38558o.m34675a();
            if (m34597X(this.f38562s)) {
                long j11 = this.f38520C;
                if (j11 > 0) {
                    this.f38543Z = false;
                }
                if (this.f38536S && this.f38559p != null && m34601o0 < remaining2 && !this.f38543Z) {
                    this.f38559p.mo34564d(this.f38552i.m34828e(j11));
                }
            }
            int i10 = this.f38561r.f38574c;
            if (i10 == 0) {
                this.f38519B += m34601o0;
            }
            if (m34601o0 == remaining2) {
                if (i10 != 0) {
                    C4349a.m21884g(byteBuffer == this.f38528K);
                    this.f38520C += this.f38521D * this.f38529L;
                }
                this.f38530M = null;
            }
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: o */
    public void mo34649o() {
        this.f38522E = true;
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: p */
    public int mo34650p(C7629w0 c7629w0) {
        if (!"audio/raw".equals(c7629w0.f37086m)) {
            return ((this.f38542Y || !m34646m0(c7629w0, this.f38563t)) && !m34598Y(c7629w0, this.f38544a)) ? 0 : 2;
        }
        if (C4401z0.m22410s0(c7629w0.f37069B)) {
            int i10 = c7629w0.f37069B;
            if (i10 != 2) {
                return (this.f38546c && i10 == 4) ? 2 : 1;
            }
            return 2;
        }
        C4392v.m22275i("DefaultAudioSink", "Invalid PCM encoding: " + c7629w0.f37069B);
        return 0;
    }

    /* renamed from: p0 */
    public final int m34651p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        int write;
        if (C4401z0.f26679a >= 26) {
            write = audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
            return write;
        }
        if (this.f38567x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f38567x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f38567x.putInt(1431633921);
        }
        if (this.f38568y == 0) {
            this.f38567x.putInt(4, i10);
            this.f38567x.putLong(8, j10 * 1000);
            this.f38567x.position(0);
            this.f38568y = i10;
        }
        int remaining = this.f38567x.remaining();
        if (remaining > 0) {
            int write2 = audioTrack.write(this.f38567x, remaining, 1);
            if (write2 < 0) {
                this.f38568y = 0;
                return write2;
            }
            if (write2 < remaining) {
                return 0;
            }
        }
        int m34601o0 = m34601o0(audioTrack, byteBuffer, i10);
        if (m34601o0 < 0) {
            this.f38568y = 0;
            return m34601o0;
        }
        this.f38568y -= m34601o0;
        return m34601o0;
    }

    @Override // p301r6.InterfaceC8003u
    public void pause() {
        this.f38536S = false;
        if (m34621V() && this.f38552i.m34839q()) {
            this.f38562s.pause();
        }
    }

    @Override // p301r6.InterfaceC8003u
    public void play() {
        this.f38536S = true;
        if (m34621V()) {
            this.f38552i.m34844v();
            this.f38562s.play();
        }
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: q */
    public void mo34652q() {
        C4349a.m21884g(C4401z0.f26679a >= 21);
        C4349a.m21884g(this.f38537T);
        if (this.f38540W) {
            return;
        }
        this.f38540W = true;
        flush();
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: r */
    public void mo34653r(C7972d c7972d) {
        if (this.f38563t.equals(c7972d)) {
            return;
        }
        this.f38563t = c7972d;
        if (this.f38540W) {
            return;
        }
        flush();
    }

    @Override // p301r6.InterfaceC8003u
    public void reset() {
        flush();
        for (InterfaceC7980h interfaceC7980h : this.f38549f) {
            interfaceC7980h.reset();
        }
        for (InterfaceC7980h interfaceC7980h2 : this.f38550g) {
            interfaceC7980h2.reset();
        }
        this.f38536S = false;
        this.f38542Y = false;
    }

    @Override // p301r6.InterfaceC8003u
    /* renamed from: s */
    public void mo34654s(boolean z10) {
        m34632e0(m34615J(), z10);
    }

    @Override // p301r6.InterfaceC8003u
    public void setVolume(float f10) {
        if (this.f38525H != f10) {
            this.f38525H = f10;
            m34636g0();
        }
    }
}
