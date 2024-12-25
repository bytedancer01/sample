package p069e0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p018b0.C0779d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/d.class
 */
/* renamed from: e0.d */
/* loaded from: combined.jar:classes1.jar:e0/d.class */
public final class C4565d {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e0/d$a.class
     */
    /* renamed from: e0.d$a */
    /* loaded from: combined.jar:classes1.jar:e0/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final int[] f27178a;

        /* renamed from: b */
        public final float[] f27179b;

        public a(int i10, int i11) {
            this.f27178a = new int[]{i10, i11};
            this.f27179b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f27178a = new int[]{i10, i11, i12};
            this.f27179b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f27178a = new int[size];
            this.f27179b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f27178a[i10] = list.get(i10).intValue();
                this.f27179b[i10] = list2.get(i10).floatValue();
            }
        }
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
    /* renamed from: a */
    public static p069e0.C4565d.a m23042a(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
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

    /* renamed from: b */
    public static Shader m23043b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0779d.f5390y);
        float m23078j = C4570i.m23078j(m23087s, xmlPullParser, "startX", C0779d.f5359H, 0.0f);
        float m23078j2 = C4570i.m23078j(m23087s, xmlPullParser, "startY", C0779d.f5360I, 0.0f);
        float m23078j3 = C4570i.m23078j(m23087s, xmlPullParser, "endX", C0779d.f5361J, 0.0f);
        float m23078j4 = C4570i.m23078j(m23087s, xmlPullParser, "endY", C0779d.f5362K, 0.0f);
        float m23078j5 = C4570i.m23078j(m23087s, xmlPullParser, "centerX", C0779d.f5354C, 0.0f);
        float m23078j6 = C4570i.m23078j(m23087s, xmlPullParser, "centerY", C0779d.f5355D, 0.0f);
        int m23079k = C4570i.m23079k(m23087s, xmlPullParser, "type", C0779d.f5353B, 0);
        int m23074f = C4570i.m23074f(m23087s, xmlPullParser, "startColor", C0779d.f5391z, 0);
        boolean m23086r = C4570i.m23086r(xmlPullParser, "centerColor");
        int m23074f2 = C4570i.m23074f(m23087s, xmlPullParser, "centerColor", C0779d.f5358G, 0);
        int m23074f3 = C4570i.m23074f(m23087s, xmlPullParser, "endColor", C0779d.f5352A, 0);
        int m23079k2 = C4570i.m23079k(m23087s, xmlPullParser, "tileMode", C0779d.f5357F, 0);
        float m23078j7 = C4570i.m23078j(m23087s, xmlPullParser, "gradientRadius", C0779d.f5356E, 0.0f);
        m23087s.recycle();
        a m23042a = m23042a(m23044c(resources, xmlPullParser, attributeSet, theme), m23074f, m23074f3, m23086r, m23074f2);
        if (m23079k != 1) {
            return m23079k != 2 ? new LinearGradient(m23078j, m23078j2, m23078j3, m23078j4, m23042a.f27178a, m23042a.f27179b, m23045d(m23079k2)) : new SweepGradient(m23078j5, m23078j6, m23042a.f27178a, m23042a.f27179b);
        }
        if (m23078j7 > 0.0f) {
            return new RadialGradient(m23078j5, m23078j6, m23078j7, m23042a.f27178a, m23042a.f27179b, m23045d(m23079k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r6.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p069e0.C4565d.a m23044c(android.content.res.Resources r5, org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.content.res.Resources.Theme r8) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p069e0.C4565d.m23044c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):e0.d$a");
    }

    /* renamed from: d */
    public static Shader.TileMode m23045d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
