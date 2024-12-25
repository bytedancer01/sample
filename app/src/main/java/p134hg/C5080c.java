package p134hg;

import com.onesignal.InterfaceC4168l3;
import com.onesignal.InterfaceC4198q3;
import com.onesignal.InterfaceC4216t2;
import com.onesignal.InterfaceC4239x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152ig.InterfaceC5258c;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/c.class
 */
/* renamed from: hg.c */
/* loaded from: combined.jar:classes2.jar:hg/c.class */
public final class C5080c {

    /* renamed from: a */
    @NotNull
    public final InterfaceC4239x1 f29202a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC4168l3 f29203b;

    /* renamed from: c */
    @NotNull
    public final C5078a f29204c;

    /* renamed from: d */
    @Nullable
    public InterfaceC5258c f29205d;

    public C5080c(@NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull InterfaceC4168l3 interfaceC4168l3, @Nullable InterfaceC4198q3 interfaceC4198q3, @Nullable InterfaceC4216t2 interfaceC4216t2) {
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(interfaceC4168l3, "apiClient");
        this.f29202a = interfaceC4239x1;
        this.f29203b = interfaceC4168l3;
        C9367f.m39524c(interfaceC4198q3);
        C9367f.m39524c(interfaceC4216t2);
        this.f29204c = new C5078a(interfaceC4239x1, interfaceC4198q3, interfaceC4216t2);
    }

    /* renamed from: a */
    public final AbstractC5081d m25373a() {
        return this.f29204c.m25368j() ? new C5084g(this.f29202a, this.f29204c, new C5085h(this.f29203b)) : new C5082e(this.f29202a, this.f29204c, new C5083f(this.f29203b));
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC5258c m25374b() {
        return this.f29205d != null ? m25375c() : m25373a();
    }

    /* renamed from: c */
    public final InterfaceC5258c m25375c() {
        if (!this.f29204c.m25368j()) {
            InterfaceC5258c interfaceC5258c = this.f29205d;
            if (interfaceC5258c instanceof C5082e) {
                C9367f.m39524c(interfaceC5258c);
                return interfaceC5258c;
            }
        }
        if (this.f29204c.m25368j()) {
            InterfaceC5258c interfaceC5258c2 = this.f29205d;
            if (interfaceC5258c2 instanceof C5084g) {
                C9367f.m39524c(interfaceC5258c2);
                return interfaceC5258c2;
            }
        }
        return m25373a();
    }
}
