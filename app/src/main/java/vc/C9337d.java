package vc;

import com.amazonaws.util.DateUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p352uc.InterfaceC9152a;
import p352uc.InterfaceC9153b;
import tc.C8680c;
import tc.InterfaceC8678a;
import tc.InterfaceC8682e;
import tc.InterfaceC8683f;
import tc.InterfaceC8684g;
import tc.InterfaceC8685h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vc/d.class
 */
/* renamed from: vc.d */
/* loaded from: combined.jar:classes2.jar:vc/d.class */
public final class C9337d implements InterfaceC9153b<C9337d> {

    /* renamed from: e */
    public static final InterfaceC8682e<Object> f42537e = new InterfaceC8682e() { // from class: vc.a
        @Override // tc.InterfaceC8679b
        /* renamed from: a */
        public final void mo5160a(Object obj, InterfaceC8683f interfaceC8683f) {
            C9337d.m39339l(obj, interfaceC8683f);
        }
    };

    /* renamed from: f */
    public static final InterfaceC8684g<String> f42538f = new InterfaceC8684g() { // from class: vc.b
        @Override // tc.InterfaceC8679b
        /* renamed from: a */
        public final void mo5160a(Object obj, InterfaceC8685h interfaceC8685h) {
            interfaceC8685h.mo37182b((String) obj);
        }
    };

    /* renamed from: g */
    public static final InterfaceC8684g<Boolean> f42539g = new InterfaceC8684g() { // from class: vc.c
        @Override // tc.InterfaceC8679b
        /* renamed from: a */
        public final void mo5160a(Object obj, InterfaceC8685h interfaceC8685h) {
            C9337d.m39341n((Boolean) obj, interfaceC8685h);
        }
    };

    /* renamed from: h */
    public static final b f42540h = new b(null);

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC8682e<?>> f42541a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC8684g<?>> f42542b = new HashMap();

    /* renamed from: c */
    public InterfaceC8682e<Object> f42543c = f42537e;

    /* renamed from: d */
    public boolean f42544d = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vc/d$a.class
     */
    /* renamed from: vc.d$a */
    /* loaded from: combined.jar:classes2.jar:vc/d$a.class */
    public class a implements InterfaceC8678a {

        /* renamed from: a */
        public final C9337d f42545a;

        public a(C9337d c9337d) {
            this.f42545a = c9337d;
        }

        @Override // tc.InterfaceC8678a
        /* renamed from: a */
        public void mo37171a(Object obj, Writer writer) {
            C9338e c9338e = new C9338e(writer, this.f42545a.f42541a, this.f42545a.f42542b, this.f42545a.f42543c, this.f42545a.f42544d);
            c9338e.m39350i(obj, false);
            c9338e.m39358q();
        }

        @Override // tc.InterfaceC8678a
        public String encode(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo37171a(obj, stringWriter);
            } catch (IOException e10) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vc/d$b.class
     */
    /* renamed from: vc.d$b */
    /* loaded from: combined.jar:classes2.jar:vc/d$b.class */
    public static final class b implements InterfaceC8684g<Date> {

        /* renamed from: a */
        public static final DateFormat f42546a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
            f42546a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // tc.InterfaceC8679b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5160a(Date date, InterfaceC8685h interfaceC8685h) {
            interfaceC8685h.mo37182b(f42546a.format(date));
        }
    }

    public C9337d() {
        m39346p(String.class, f42538f);
        m39346p(Boolean.class, f42539g);
        m39346p(Date.class, f42540h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m39339l(Object obj, InterfaceC8683f interfaceC8683f) {
        throw new C8680c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m39341n(Boolean bool, InterfaceC8685h interfaceC8685h) {
        interfaceC8685h.mo37183e(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC8678a m39342i() {
        return new a(this);
    }

    /* renamed from: j */
    public C9337d m39343j(InterfaceC9152a interfaceC9152a) {
        interfaceC9152a.mo5159a(this);
        return this;
    }

    /* renamed from: k */
    public C9337d m39344k(boolean z10) {
        this.f42544d = z10;
        return this;
    }

    @Override // p352uc.InterfaceC9153b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public <T> C9337d mo38497a(Class<T> cls, InterfaceC8682e<? super T> interfaceC8682e) {
        this.f42541a.put(cls, interfaceC8682e);
        this.f42542b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C9337d m39346p(Class<T> cls, InterfaceC8684g<? super T> interfaceC8684g) {
        this.f42542b.put(cls, interfaceC8684g);
        this.f42541a.remove(cls);
        return this;
    }
}
