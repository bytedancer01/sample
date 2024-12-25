package p152ig;

import org.jetbrains.annotations.NotNull;
import p103fg.EnumC4858b;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ig/a.class
 */
/* renamed from: ig.a */
/* loaded from: combined.jar:classes2.jar:ig/a.class */
public class C5256a {

    /* renamed from: a */
    @NotNull
    public final String f30172a;

    /* renamed from: b */
    @NotNull
    public final EnumC4858b f30173b;

    public C5256a(@NotNull String str, @NotNull EnumC4858b enumC4858b) {
        C9367f.m39526e(str, "influenceId");
        C9367f.m39526e(enumC4858b, "channel");
        this.f30172a = str;
        this.f30173b = enumC4858b;
    }

    @NotNull
    /* renamed from: a */
    public EnumC4858b m26307a() {
        return this.f30173b;
    }

    @NotNull
    /* renamed from: b */
    public String m26308b() {
        return this.f30172a;
    }
}
