package p386wc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p352uc.InterfaceC9152a;
import p352uc.InterfaceC9153b;
import p386wc.C9567h;
import tc.C8680c;
import tc.InterfaceC8682e;
import tc.InterfaceC8683f;
import tc.InterfaceC8684g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wc/h.class
 */
/* renamed from: wc.h */
/* loaded from: combined.jar:classes2.jar:wc/h.class */
public class C9567h {

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC8682e<?>> f43559a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC8684g<?>> f43560b;

    /* renamed from: c */
    public final InterfaceC8682e<Object> f43561c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wc/h$a.class
     */
    /* renamed from: wc.h$a */
    /* loaded from: combined.jar:classes2.jar:wc/h$a.class */
    public static final class a implements InterfaceC9153b<a> {

        /* renamed from: d */
        public static final InterfaceC8682e<Object> f43562d = new InterfaceC8682e() { // from class: wc.g
            @Override // tc.InterfaceC8679b
            /* renamed from: a */
            public final void mo5160a(Object obj, InterfaceC8683f interfaceC8683f) {
                C9567h.a.m40124e(obj, interfaceC8683f);
            }
        };

        /* renamed from: a */
        public final Map<Class<?>, InterfaceC8682e<?>> f43563a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, InterfaceC8684g<?>> f43564b = new HashMap();

        /* renamed from: c */
        public InterfaceC8682e<Object> f43565c = f43562d;

        /* renamed from: e */
        public static /* synthetic */ void m40124e(Object obj, InterfaceC8683f interfaceC8683f) {
            throw new C8680c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C9567h m40125c() {
            return new C9567h(new HashMap(this.f43563a), new HashMap(this.f43564b), this.f43565c);
        }

        /* renamed from: d */
        public a m40126d(InterfaceC9152a interfaceC9152a) {
            interfaceC9152a.mo5159a(this);
            return this;
        }

        @Override // p352uc.InterfaceC9153b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a mo38497a(Class<U> cls, InterfaceC8682e<? super U> interfaceC8682e) {
            this.f43563a.put(cls, interfaceC8682e);
            this.f43564b.remove(cls);
            return this;
        }
    }

    public C9567h(Map<Class<?>, InterfaceC8682e<?>> map, Map<Class<?>, InterfaceC8684g<?>> map2, InterfaceC8682e<Object> interfaceC8682e) {
        this.f43559a = map;
        this.f43560b = map2;
        this.f43561c = interfaceC8682e;
    }

    /* renamed from: a */
    public static a m40120a() {
        return new a();
    }

    /* renamed from: b */
    public void m40121b(Object obj, OutputStream outputStream) {
        new C9565f(outputStream, this.f43559a, this.f43560b, this.f43561c).m40117r(obj);
    }

    /* renamed from: c */
    public byte[] m40122c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m40121b(obj, byteArrayOutputStream);
        } catch (IOException e10) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
