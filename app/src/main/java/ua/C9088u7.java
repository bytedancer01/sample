package ua;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.simpleframework.xml.strategy.Name;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u7.class
 */
/* renamed from: ua.u7 */
/* loaded from: combined.jar:classes2.jar:ua/u7.class */
public final class C9088u7 extends AbstractC8905f4 {

    /* renamed from: c */
    public volatile C9004n7 f41666c;

    /* renamed from: d */
    public C9004n7 f41667d;

    /* renamed from: e */
    public C9004n7 f41668e;

    /* renamed from: f */
    public final Map<Activity, C9004n7> f41669f;

    /* renamed from: g */
    public Activity f41670g;

    /* renamed from: h */
    public volatile boolean f41671h;

    /* renamed from: i */
    public volatile C9004n7 f41672i;

    /* renamed from: j */
    public C9004n7 f41673j;

    /* renamed from: k */
    public boolean f41674k;

    /* renamed from: l */
    public final Object f41675l;

    /* renamed from: m */
    public C9004n7 f41676m;

    /* renamed from: n */
    public String f41677n;

    public C9088u7(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41675l = new Object();
        this.f41669f = new ConcurrentHashMap();
    }

    /* renamed from: E */
    public static /* synthetic */ void m38259E(C9088u7 c9088u7, Bundle bundle, C9004n7 c9004n7, C9004n7 c9004n72, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c9088u7.m38270p(c9004n7, c9004n72, j10, true, c9088u7.f41723a.m37765G().m37868t(null, "screen_view", bundle, null, true));
    }

    /* renamed from: I */
    public static /* synthetic */ C9004n7 m38263I(C9088u7 c9088u7, C9004n7 c9004n7) {
        c9088u7.f41673j = null;
        return null;
    }

    /* renamed from: x */
    public static void m38264x(C9004n7 c9004n7, Bundle bundle, boolean z10) {
        boolean z11 = z10;
        if (c9004n7 != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = c9004n7.f41445a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c9004n7.f41446b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c9004n7.f41447c);
                return;
            }
            z11 = false;
        }
        if (c9004n7 == null && z11) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void m38265A(Activity activity) {
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41394v0)) {
            synchronized (this.f41675l) {
                this.f41674k = true;
                if (activity != this.f41670g) {
                    synchronized (this.f41675l) {
                        this.f41670g = activity;
                        this.f41671h = false;
                    }
                    if (this.f41723a.m37797z().m37900w(null, C8988m3.f41392u0) && this.f41723a.m37797z().m37881C()) {
                        this.f41672i = null;
                        this.f41723a.mo37782e().m38436r(new RunnableC9076t7(this));
                    }
                }
            }
        }
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41392u0) && !this.f41723a.m37797z().m37881C()) {
            this.f41666c = this.f41672i;
            this.f41723a.mo37782e().m38436r(new RunnableC9040q7(this));
        } else {
            m38269o(activity, m38272r(activity), false);
            C8879d2 m37784g = this.f41723a.m37784g();
            m37784g.f41723a.mo37782e().m38436r(new RunnableC8866c1(m37784g, m37784g.f41723a.mo37778a().mo22433b()));
        }
    }

    /* renamed from: B */
    public final void m38266B(Activity activity) {
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41394v0)) {
            synchronized (this.f41675l) {
                this.f41674k = false;
                this.f41671h = true;
            }
        }
        long mo22433b = this.f41723a.mo37778a().mo22433b();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41392u0) && !this.f41723a.m37797z().m37881C()) {
            this.f41666c = null;
            this.f41723a.mo37782e().m38436r(new RunnableC9052r7(this, mo22433b));
        } else {
            C9004n7 m38272r = m38272r(activity);
            this.f41667d = this.f41666c;
            this.f41666c = null;
            this.f41723a.mo37782e().m38436r(new RunnableC9064s7(this, m38272r, mo22433b));
        }
    }

    /* renamed from: C */
    public final void m38267C(Activity activity, Bundle bundle) {
        C9004n7 c9004n7;
        if (!this.f41723a.m37797z().m37881C() || bundle == null || (c9004n7 = this.f41669f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(Name.MARK, c9004n7.f41447c);
        bundle2.putString("name", c9004n7.f41445a);
        bundle2.putString("referrer_name", c9004n7.f41446b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: D */
    public final void m38268D(Activity activity) {
        synchronized (this.f41675l) {
            if (activity == this.f41670g) {
                this.f41670g = null;
            }
        }
        if (this.f41723a.m37797z().m37881C()) {
            this.f41669f.remove(activity);
        }
    }

    @Override // ua.AbstractC8905f4
    /* renamed from: m */
    public final boolean mo37908m() {
        return false;
    }

    /* renamed from: o */
    public final void m38269o(Activity activity, C9004n7 c9004n7, boolean z10) {
        C9004n7 c9004n72;
        C9004n7 c9004n73 = this.f41666c == null ? this.f41667d : this.f41666c;
        if (c9004n7.f41446b == null) {
            c9004n72 = new C9004n7(c9004n7.f41445a, activity != null ? m38274t(activity.getClass(), "Activity") : null, c9004n7.f41447c, c9004n7.f41449e, c9004n7.f41450f);
        } else {
            c9004n72 = c9004n7;
        }
        this.f41667d = this.f41666c;
        this.f41666c = c9004n72;
        this.f41723a.mo37782e().m38436r(new RunnableC9028p7(this, c9004n72, c9004n73, this.f41723a.mo37778a().mo22433b(), z10));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    /* renamed from: p */
    public final void m38270p(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
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

    /* renamed from: q */
    public final void m38271q(C9004n7 c9004n7, boolean z10, long j10) {
        this.f41723a.m37784g().m37804k(this.f41723a.mo37778a().mo22433b());
        if (!this.f41723a.m37761C().f41271e.m38040d(c9004n7 != null && c9004n7.f41448d, z10, j10) || c9004n7 == null) {
            return;
        }
        c9004n7.f41448d = false;
    }

    /* renamed from: r */
    public final C9004n7 m38272r(Activity activity) {
        C9935o.m41850j(activity);
        C9004n7 c9004n7 = this.f41669f.get(activity);
        C9004n7 c9004n72 = c9004n7;
        if (c9004n7 == null) {
            c9004n72 = new C9004n7(null, m38274t(activity.getClass(), "Activity"), this.f41723a.m37765G().m37849g0());
            this.f41669f.put(activity, c9004n72);
        }
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41394v0) && this.f41672i != null) {
            return this.f41672i;
        }
        return c9004n72;
    }

    /* renamed from: s */
    public final C9004n7 m38273s(boolean z10) {
        m37905j();
        mo37811h();
        if (!this.f41723a.m37797z().m37900w(null, C8988m3.f41394v0) || !z10) {
            return this.f41668e;
        }
        C9004n7 c9004n7 = this.f41668e;
        return c9004n7 != null ? c9004n7 : this.f41673j;
    }

    /* renamed from: t */
    public final String m38274t(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f41723a.m37797z();
        String str3 = str2;
        if (length2 > 100) {
            this.f41723a.m37797z();
            str3 = str2.substring(0, 100);
        }
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0 > 100) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r0 > 100) goto L30;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38275u(android.os.Bundle r11, long r12) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C9088u7.m38275u(android.os.Bundle, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r0 <= 100) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (r0 <= 100) goto L42;
     */
    @java.lang.Deprecated
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38276v(android.app.Activity r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C9088u7.m38276v(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: w */
    public final C9004n7 m38277w() {
        return this.f41666c;
    }

    /* renamed from: y */
    public final void m38278y(String str, C9004n7 c9004n7) {
        mo37811h();
        synchronized (this) {
            String str2 = this.f41677n;
            if (str2 == null || str2.equals(str) || c9004n7 != null) {
                this.f41677n = str;
                this.f41676m = c9004n7;
            }
        }
    }

    /* renamed from: z */
    public final void m38279z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f41723a.m37797z().m37881C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f41669f.put(activity, new C9004n7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(Name.MARK)));
    }
}
