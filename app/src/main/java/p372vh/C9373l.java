package p372vh;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vh/l.class
 */
/* renamed from: vh.l */
/* loaded from: combined.jar:classes2.jar:vh/l.class */
public class C9373l {
    /* renamed from: a */
    public String m39541a(InterfaceC9366e interfaceC9366e) {
        String obj = interfaceC9366e.getClass().getGenericInterfaces()[0].toString();
        String str = obj;
        if (obj.startsWith("kotlin.jvm.functions.")) {
            str = obj.substring(21);
        }
        return str;
    }

    /* renamed from: b */
    public String m39542b(AbstractC9368g abstractC9368g) {
        return m39541a(abstractC9368g);
    }
}
