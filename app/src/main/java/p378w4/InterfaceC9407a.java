package p378w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w4/a.class
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: w4.a */
/* loaded from: combined.jar:classes1.jar:w4/a.class */
public @interface InterfaceC9407a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w4/a$a.class
     */
    /* renamed from: w4.a$a */
    /* loaded from: combined.jar:classes1.jar:w4/a$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f43156a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                w4.a$b[] r0 = p378w4.InterfaceC9407a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p378w4.InterfaceC9407a.a.f43156a = r0
                r0 = r4
                w4.a$b r1 = p378w4.InterfaceC9407a.b.ANY     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = p378w4.InterfaceC9407a.a.f43156a     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                w4.a$b r1 = p378w4.InterfaceC9407a.b.NONE     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = p378w4.InterfaceC9407a.a.f43156a     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                w4.a$b r1 = p378w4.InterfaceC9407a.b.NON_PRIVATE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = p378w4.InterfaceC9407a.a.f43156a     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                w4.a$b r1 = p378w4.InterfaceC9407a.b.PROTECTED_AND_PUBLIC     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = p378w4.InterfaceC9407a.a.f43156a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                w4.a$b r1 = p378w4.InterfaceC9407a.b.PUBLIC_ONLY     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: p378w4.InterfaceC9407a.a.m46314clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w4/a$b.class
     */
    /* renamed from: w4.a$b */
    /* loaded from: combined.jar:classes1.jar:w4/a$b.class */
    public enum b {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int i10 = a.f43156a[ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    b creatorVisibility() default b.DEFAULT;

    b fieldVisibility() default b.DEFAULT;

    b getterVisibility() default b.DEFAULT;

    b isGetterVisibility() default b.DEFAULT;

    b setterVisibility() default b.DEFAULT;
}
