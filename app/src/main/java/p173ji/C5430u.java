package p173ji;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5433x;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/u.class
 */
/* renamed from: ji.u */
/* loaded from: combined.jar:classes2.jar:ji/u.class */
public final class C5430u extends AbstractC5408e0 {

    /* renamed from: b */
    public final List<String> f31131b;

    /* renamed from: c */
    public final List<String> f31132c;

    /* renamed from: e */
    public static final b f31130e = new b(null);

    /* renamed from: d */
    public static final C5435z f31129d = C5435z.f31169g.m27178a("application/x-www-form-urlencoded");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/u$a.class
     */
    /* renamed from: ji.u$a */
    /* loaded from: combined.jar:classes2.jar:ji/u$a.class */
    public static final class a {

        /* renamed from: a */
        public final List<String> f31133a;

        /* renamed from: b */
        public final List<String> f31134b;

        /* renamed from: c */
        public final Charset f31135c;

        public a() {
            this(null, 1, null);
        }

        public a(@Nullable Charset charset) {
            this.f31135c = charset;
            this.f31133a = new ArrayList();
            this.f31134b = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, C9365d c9365d) {
            this((i10 & 1) != 0 ? null : charset);
        }

        @NotNull
        /* renamed from: a */
        public final a m27068a(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            List<String> list = this.f31133a;
            C5433x.b bVar = C5433x.f31147l;
            list.add(C5433x.b.m27156b(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f31135c, 91, null));
            this.f31134b.add(C5433x.b.m27156b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f31135c, 91, null));
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final a m27069b(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            List<String> list = this.f31133a;
            C5433x.b bVar = C5433x.f31147l;
            list.add(C5433x.b.m27156b(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f31135c, 83, null));
            this.f31134b.add(C5433x.b.m27156b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f31135c, 83, null));
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C5430u m27070c() {
            return new C5430u(this.f31133a, this.f31134b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/u$b.class
     */
    /* renamed from: ji.u$b */
    /* loaded from: combined.jar:classes2.jar:ji/u$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }
    }

    public C5430u(@NotNull List<String> list, @NotNull List<String> list2) {
        C9367f.m39526e(list, "encodedNames");
        C9367f.m39526e(list2, "encodedValues");
        this.f31131b = C5634b.m27773Q(list);
        this.f31132c = C5634b.m27773Q(list2);
    }

    @Override // p173ji.AbstractC5408e0
    /* renamed from: a */
    public long mo22935a() {
        return m27067j(null, true);
    }

    @Override // p173ji.AbstractC5408e0
    @NotNull
    /* renamed from: b */
    public C5435z mo22936b() {
        return f31129d;
    }

    @Override // p173ji.AbstractC5408e0
    /* renamed from: i */
    public void mo22937i(@NotNull InterfaceC9762f interfaceC9762f) {
        C9367f.m39526e(interfaceC9762f, "sink");
        m27067j(interfaceC9762f, false);
    }

    /* renamed from: j */
    public final long m27067j(InterfaceC9762f interfaceC9762f, boolean z10) {
        C9761e buffer;
        long j10;
        if (z10) {
            buffer = new C9761e();
        } else {
            C9367f.m39524c(interfaceC9762f);
            buffer = interfaceC9762f.getBuffer();
        }
        int size = this.f31131b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.mo41136Q(this.f31131b.get(i10));
            buffer.writeByte(61);
            buffer.mo41136Q(this.f31132c.get(i10));
        }
        if (z10) {
            j10 = buffer.size();
            buffer.m41165l();
        } else {
            j10 = 0;
        }
        return j10;
    }
}
