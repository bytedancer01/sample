package p382w8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import ec.C4701d;
import java.util.List;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p243o8.AbstractC6921c;
import p243o8.C6919a;
import p243o8.C6925g;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w8/a.class
 */
/* renamed from: w8.a */
/* loaded from: combined.jar:classes2.jar:w8/a.class */
public final class C9430a extends AbstractC6921c {

    /* renamed from: o */
    public final C4361f0 f43195o;

    /* renamed from: p */
    public final boolean f43196p;

    /* renamed from: q */
    public final int f43197q;

    /* renamed from: r */
    public final int f43198r;

    /* renamed from: s */
    public final String f43199s;

    /* renamed from: t */
    public final float f43200t;

    /* renamed from: u */
    public final int f43201u;

    public C9430a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f43195o = new C4361f0();
        boolean z10 = true;
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f43197q = 0;
            this.f43198r = -1;
            this.f43199s = "sans-serif";
            this.f43196p = false;
            this.f43200t = 0.85f;
            this.f43201u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f43197q = bArr[24];
        this.f43198r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f43199s = "Serif".equals(C4401z0.m22325G(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f43201u = i10;
        z10 = (bArr[0] & 32) == 0 ? false : z10;
        this.f43196p = z10;
        if (z10) {
            this.f43200t = C4401z0.m22407r(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f43200t = 0.85f;
        }
    }

    /* renamed from: C */
    public static void m39790C(boolean z10) {
        if (!z10) {
            throw new C6925g("Unexpected subtitle format.");
        }
    }

    /* renamed from: D */
    public static void m39791D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    /* renamed from: E */
    public static void m39792E(
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* renamed from: F */
    public static void m39793F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    /* renamed from: G */
    public static String m39794G(C4361f0 c4361f0) {
        char m21991g;
        m39790C(c4361f0.m21985a() >= 2);
        int m21977J = c4361f0.m21977J();
        if (m21977J == 0) {
            return "";
        }
        return c4361f0.m21969B(m21977J, (c4361f0.m21985a() < 2 || !((m21991g = c4361f0.m21991g()) == 65279 || m21991g == 65534)) ? C4701d.f27717c : C4701d.f27720f);
    }

    /* renamed from: B */
    public final void m39795B(C4361f0 c4361f0, SpannableStringBuilder spannableStringBuilder) {
        m39790C(c4361f0.m21985a() >= 12);
        int m21977J = c4361f0.m21977J();
        int m21977J2 = c4361f0.m21977J();
        c4361f0.m21984Q(2);
        int m21971D = c4361f0.m21971D();
        c4361f0.m21984Q(1);
        int m21998n = c4361f0.m21998n();
        if (m21977J2 > spannableStringBuilder.length()) {
            C4392v.m22275i("Tx3gDecoder", "Truncating styl end (" + m21977J2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            m21977J2 = spannableStringBuilder.length();
        }
        if (m21977J < m21977J2) {
            m39792E(spannableStringBuilder, m21971D, this.f43197q, m21977J, m21977J2, 0);
            m39791D(spannableStringBuilder, m21998n, this.f43198r, m21977J, m21977J2, 0);
            return;
        }
        C4392v.m22275i("Tx3gDecoder", "Ignoring styl with start (" + m21977J + ") >= end (" + m21977J2 + ").");
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        float f10;
        this.f43195o.m21981N(bArr, i10);
        String m39794G = m39794G(this.f43195o);
        if (m39794G.isEmpty()) {
            return C9431b.f43202c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m39794G);
        m39792E(spannableStringBuilder, this.f43197q, 0, 0, spannableStringBuilder.length(), 16711680);
        m39791D(spannableStringBuilder, this.f43198r, -1, 0, spannableStringBuilder.length(), 16711680);
        m39793F(spannableStringBuilder, this.f43199s, 0, spannableStringBuilder.length());
        float f11 = this.f43200t;
        while (true) {
            float f12 = f11;
            if (this.f43195o.m21985a() < 8) {
                return new C9431b(new C6919a.b().m31871o(spannableStringBuilder).m31864h(f12, 0).m31865i(0).m31857a());
            }
            int m21989e = this.f43195o.m21989e();
            int m21998n = this.f43195o.m21998n();
            int m21998n2 = this.f43195o.m21998n();
            boolean z11 = true;
            if (m21998n2 == 1937013100) {
                m39790C(this.f43195o.m21985a() >= 2);
                int m21977J = this.f43195o.m21977J();
                int i11 = 0;
                while (true) {
                    f10 = f12;
                    if (i11 < m21977J) {
                        m39795B(this.f43195o, spannableStringBuilder);
                        i11++;
                    }
                }
            } else {
                f10 = f12;
                if (m21998n2 == 1952608120) {
                    f10 = f12;
                    if (this.f43196p) {
                        if (this.f43195o.m21985a() < 2) {
                            z11 = false;
                        }
                        m39790C(z11);
                        f10 = C4401z0.m22407r(this.f43195o.m21977J() / this.f43201u, 0.0f, 0.95f);
                    }
                }
            }
            this.f43195o.m21983P(m21989e + m21998n);
            f11 = f10;
        }
    }
}
