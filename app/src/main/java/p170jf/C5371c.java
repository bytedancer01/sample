package p170jf;

import android.content.Context;
import android.content.SharedPreferences;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.webrequest.RetrofitPost;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p151if.C5255e;
import p324sf.InterfaceC8567f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jf/c.class
 */
/* renamed from: jf.c */
/* loaded from: combined.jar:classes2.jar:jf/c.class */
public class C5371c {

    /* renamed from: a */
    public InterfaceC8567f f30701a;

    /* renamed from: b */
    public Context f30702b;

    /* renamed from: c */
    public SharedPreferences.Editor f30703c;

    /* renamed from: d */
    public SharedPreferences f30704d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/c$a.class
     */
    /* renamed from: jf.c$a */
    /* loaded from: combined.jar:classes2.jar:jf/c$a.class */
    public class a implements InterfaceC4537d<LoginCallback> {

        /* renamed from: a */
        public final String f30705a;

        /* renamed from: b */
        public final String f30706b;

        /* renamed from: c */
        public final C5371c f30707c;

        public a(C5371c c5371c, String str, String str2) {
            this.f30707c = c5371c;
            this.f30705a = str;
            this.f30706b = str2;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<LoginCallback> interfaceC4535b, C4554u<LoginCallback> c4554u) {
            String str;
            InterfaceC8567f interfaceC8567f;
            if (c4554u.m22954d()) {
                this.f30707c.f30701a.mo15999i(c4554u.m22952a(), "validateLogin");
                return;
            }
            if (c4554u.m22953b() == 404) {
                interfaceC8567f = this.f30707c.f30701a;
                str = this.f30707c.f30702b.getResources().getString(2132017877);
            } else if (c4554u.m22953b() == 301 || c4554u.m22953b() == 302) {
                String m26930w = c4554u.m22956f().m26930w("Location");
                str = "ERROR Code 301 || 302: Network error occured! Please try again";
                if (m26930w != null) {
                    String[] split = m26930w.split("/player_api.php");
                    C5371c c5371c = this.f30707c;
                    c5371c.f30704d = c5371c.f30702b.getSharedPreferences("loginPrefsserverurl", 0);
                    C5371c c5371c2 = this.f30707c;
                    c5371c2.f30703c = c5371c2.f30704d.edit();
                    this.f30707c.f30703c.putString(C5251a.f30066t, split[0]);
                    this.f30707c.f30703c.apply();
                    try {
                        this.f30707c.m26703g(this.f30705a, this.f30706b);
                        return;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                interfaceC8567f = this.f30707c.f30701a;
            } else {
                if (c4554u.m22952a() != null) {
                    return;
                }
                interfaceC8567f = this.f30707c.f30701a;
                str = "No Response from server";
            }
            interfaceC8567f.mo16003t(str);
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<LoginCallback> interfaceC4535b, Throwable th2) {
            this.f30707c.f30701a.mo16003t(this.f30707c.f30702b.getResources().getString(2132018177));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jf/c$b.class
     */
    /* renamed from: jf.c$b */
    /* loaded from: combined.jar:classes2.jar:jf/c$b.class */
    public class b implements InterfaceC4537d<LoginCallback> {

        /* renamed from: a */
        public final ArrayList f30708a;

        /* renamed from: b */
        public final String f30709b;

        /* renamed from: c */
        public final String f30710c;

        /* renamed from: d */
        public final C5371c f30711d;

        public b(C5371c c5371c, ArrayList arrayList, String str, String str2) {
            this.f30711d = c5371c;
            this.f30708a = arrayList;
            this.f30709b = str;
            this.f30710c = str2;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(@NotNull InterfaceC4535b<LoginCallback> interfaceC4535b, @NotNull C4554u<LoginCallback> c4554u) {
            InterfaceC8567f interfaceC8567f;
            ArrayList<String> arrayList;
            String str;
            if (c4554u.m22954d()) {
                this.f30711d.f30701a.mo15980D(c4554u.m22952a(), "validateLogin", this.f30708a);
                return;
            }
            if (c4554u.m22953b() == 404) {
                interfaceC8567f = this.f30711d.f30701a;
                arrayList = this.f30708a;
                str = this.f30711d.f30702b.getResources().getString(2132017877);
            } else {
                if (c4554u.m22953b() == 301 || c4554u.m22953b() == 302) {
                    String m26930w = c4554u.m22956f().m26930w("Location");
                    if (m26930w != null) {
                        String[] split = m26930w.split("/player_api.php");
                        C5371c c5371c = this.f30711d;
                        c5371c.f30704d = c5371c.f30702b.getSharedPreferences("loginPrefsserverurl", 0);
                        C5371c c5371c2 = this.f30711d;
                        c5371c2.f30703c = c5371c2.f30704d.edit();
                        this.f30711d.f30703c.putString(C5251a.f30066t, split[0]);
                        this.f30711d.f30703c.apply();
                        try {
                            this.f30711d.m26704h(this.f30709b, this.f30710c, this.f30708a);
                            return;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    this.f30711d.f30701a.mo15993Q(this.f30708a, "ERROR Code 301 || 302: Network error occured! Please try again");
                    return;
                }
                if (c4554u.m22952a() != null) {
                    return;
                }
                interfaceC8567f = this.f30711d.f30701a;
                arrayList = this.f30708a;
                str = "No Response from server";
            }
            interfaceC8567f.mo15993Q(arrayList, str);
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(@NotNull InterfaceC4535b<LoginCallback> interfaceC4535b, @NotNull Throwable th2) {
            this.f30711d.f30701a.mo15993Q(this.f30708a, this.f30711d.f30702b.getResources().getString(2132018177));
        }
    }

    public C5371c(InterfaceC8567f interfaceC8567f, Context context) {
        this.f30701a = interfaceC8567f;
        this.f30702b = context;
    }

    /* renamed from: g */
    public void m26703g(String str, String str2) {
        Context context;
        C4555v m26223Z = C5255e.m26223Z(this.f30702b);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15534f("application/x-www-form-urlencoded", str, str2).mo22862f(new a(this, str, str2));
        } else {
            if (m26223Z != null || (context = this.f30702b) == null) {
                return;
            }
            this.f30701a.mo15991P(context.getResources().getString(2132018758));
        }
    }

    /* renamed from: h */
    public void m26704h(String str, String str2, ArrayList<String> arrayList) {
        Context context;
        C4555v m26223Z = C5255e.m26223Z(this.f30702b);
        if (m26223Z != null) {
            ((RetrofitPost) m26223Z.m22958b(RetrofitPost.class)).m15534f("application/x-www-form-urlencoded", str, str2).mo22862f(new b(this, arrayList, str, str2));
        } else {
            if (m26223Z != null || (context = this.f30702b) == null) {
                return;
            }
            this.f30701a.mo15984H(arrayList, context.getResources().getString(2132018758));
        }
    }
}
