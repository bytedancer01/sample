package p386wc;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wc/d.class
 */
/* renamed from: wc.d */
/* loaded from: combined.jar:classes2.jar:wc/d.class */
public @interface InterfaceC9563d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wc/d$a.class
     */
    /* renamed from: wc.d$a */
    /* loaded from: combined.jar:classes2.jar:wc/d$a.class */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
