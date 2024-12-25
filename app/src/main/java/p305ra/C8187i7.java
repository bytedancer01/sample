package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/i7.class
 */
/* renamed from: ra.i7 */
/* loaded from: combined.jar:classes2.jar:ra/i7.class */
public final class C8187i7 implements InterfaceC8113d8 {

    /* renamed from: b */
    public static final InterfaceC8277o7 f39121b = new C8157g7();

    /* renamed from: a */
    public final InterfaceC8277o7 f39122a;

    public C8187i7() {
        InterfaceC8277o7 interfaceC8277o7;
        C8171h6 m35416c = C8171h6.m35416c();
        try {
            interfaceC8277o7 = (InterfaceC8277o7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e10) {
            interfaceC8277o7 = f39121b;
        }
        C8172h7 c8172h7 = new C8172h7(m35416c, interfaceC8277o7);
        C8366u6.m35903b(c8172h7, "messageInfoFactory");
        this.f39122a = c8172h7;
    }

    /* renamed from: b */
    public static boolean m35452b(InterfaceC8262n7 interfaceC8262n7) {
        return interfaceC8262n7.mo35040l() == 1;
    }

    @Override // p305ra.InterfaceC8113d8
    /* renamed from: a */
    public final <T> InterfaceC8098c8<T> mo35207a(Class<T> cls) {
        C8397w7 m36080a;
        AbstractC8127e7 m35265c;
        AbstractC8308q8<?, ?> m35295b;
        AbstractC8440z5<?> abstractC8440z5;
        C8232l7 m35611a;
        AbstractC8440z5<?> abstractC8440z52;
        AbstractC8308q8<?, ?> abstractC8308q8;
        AbstractC8308q8<?, ?> m35293a;
        AbstractC8440z5<?> m35036b;
        C8128e8.m35267A(cls);
        InterfaceC8262n7 mo35388b = this.f39122a.mo35388b(cls);
        if (mo35388b.zza()) {
            if (AbstractC8231l6.class.isAssignableFrom(cls)) {
                m35293a = C8128e8.m35297c();
                m35036b = C8081b6.m35035a();
            } else {
                m35293a = C8128e8.m35293a();
                m35036b = C8081b6.m35036b();
            }
            return C8382v7.m35967i(m35293a, m35036b, mo35388b.mo35039k());
        }
        if (AbstractC8231l6.class.isAssignableFrom(cls)) {
            boolean m35452b = m35452b(mo35388b);
            m36080a = C8412x7.m36081b();
            m35265c = AbstractC8127e7.m35266d();
            abstractC8308q8 = C8128e8.m35297c();
            AbstractC8440z5<?> m35035a = m35452b ? C8081b6.m35035a() : null;
            m35611a = C8247m7.m35612b();
            abstractC8440z52 = m35035a;
        } else {
            boolean m35452b2 = m35452b(mo35388b);
            m36080a = C8412x7.m36080a();
            m35265c = AbstractC8127e7.m35265c();
            if (m35452b2) {
                m35295b = C8128e8.m35293a();
                abstractC8440z5 = C8081b6.m35036b();
            } else {
                m35295b = C8128e8.m35295b();
                abstractC8440z5 = null;
            }
            m35611a = C8247m7.m35611a();
            abstractC8440z52 = abstractC8440z5;
            abstractC8308q8 = m35295b;
        }
        return C8367u7.m35913E(cls, mo35388b, m36080a, m35265c, abstractC8308q8, abstractC8440z52, m35611a);
    }
}
