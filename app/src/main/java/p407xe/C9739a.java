package p407xe;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpGet;
import p173ji.AbstractC5408e0;
import p173ji.C5400a0;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5430u;
import p173ji.C5435z;
import p407xe.C9745g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xe/a.class
 */
@SuppressLint({"SimpleDateFormat"})
/* renamed from: xe.a */
/* loaded from: combined.jar:classes2.jar:xe/a.class */
public class C9739a {

    /* renamed from: a */
    public static InterfaceC9741c<String> f44451a;

    /* renamed from: b */
    public static String f44452b = C9745g.a.f44479a;

    /* renamed from: a */
    public static String m41029a(Context context, String str, int i10, String str2, List<C9743e> list) {
        String str3;
        try {
            C5402b0 c5402b0 = new C5402b0();
            C5402b0.a m26782E = c5402b0.m26782E();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            m26782E.m26828c(30L, timeUnit).m26823K(30L, timeUnit).m26824L(true).m26827b();
            C5406d0 m26883b = str2.equals("") ? new C5406d0.a().m26892l(f44452b + str).m26886f("User-Agent", "IPTV Smarters Pro").m26883b() : null;
            if (str2.equalsIgnoreCase(HttpGet.METHOD_NAME)) {
                C5406d0.a aVar = new C5406d0.a();
                aVar.m26892l(f44452b + str);
                aVar.m26886f("User-Agent", "IPTV Smarters Pro");
                if (list != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        aVar.m26882a(list.get(i11).m41035b(), list.get(i11).m41036c());
                    }
                }
                aVar.m26882a("Content-Type", "application/json; charset=utf-8");
                m26883b = aVar.m26883b();
            }
            if (str2.equalsIgnoreCase("Form")) {
                C5430u.a aVar2 = new C5430u.a();
                for (int i12 = 0; i12 < list.size(); i12++) {
                    aVar2.m27068a(list.get(i12).m41035b(), list.get(i12).m41036c());
                }
                m26883b = new C5406d0.a().m26892l(f44452b + str).m26886f("User-Agent", "IPTV Smarters Pro").m26882a("Content-Type", "application/json; charset=utf-8").m26889i(aVar2.m27070c()).m26883b();
            }
            if (str2.equalsIgnoreCase("FormAPI")) {
                C5430u.a aVar3 = new C5430u.a();
                for (int i13 = 0; i13 < list.size(); i13++) {
                    aVar3.m27068a(list.get(i13).m41035b(), list.get(i13).m41036c());
                }
                m26883b = new C5406d0.a().m26892l(f44452b + str).m26886f("User-Agent", "IPTV Smarters Pro").m26882a("Content-Type", "application/json; charset=utf-8").m26889i(aVar3.m27070c()).m26883b();
            }
            if (str2.equalsIgnoreCase("DEL")) {
                C5406d0.a aVar4 = new C5406d0.a();
                aVar4.m26892l(f44452b + str);
                aVar4.m26886f("User-Agent", "IPTV Smarters Pro");
                if (list != null) {
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        aVar4.m26882a(list.get(i14).m41035b(), list.get(i14).m41036c());
                    }
                }
                aVar4.m26882a("Content-Type", "application/json; charset=utf-8");
                aVar4.m26884c();
                m26883b = aVar4.m26883b();
            }
            if (str2.equalsIgnoreCase("Multipart")) {
                C5435z m27174g = C5435z.m27174g("image/png");
                C5435z m27174g2 = C5435z.m27174g("video/*");
                C5400a0.a aVar5 = new C5400a0.a();
                for (int i15 = 0; i15 < list.size(); i15++) {
                    if (list.get(i15).m41034a() != null) {
                        if (list.get(i15).m41034a().getAbsolutePath().endsWith(".png") || list.get(i15).m41034a().getAbsolutePath().endsWith(".jpg") || list.get(i15).m41034a().getAbsolutePath().endsWith(".jpeg")) {
                            aVar5.m26768f(C5400a0.f30786k).m26764b(list.get(i15).m41035b(), list.get(i15).m41034a().getName(), AbstractC5408e0.m26895c(m27174g, list.get(i15).m41034a()));
                        }
                        if (list.get(i15).m41034a().getAbsolutePath().endsWith(".mp4") || list.get(i15).m41034a().getAbsolutePath().endsWith(".mpeg") || list.get(i15).m41034a().getAbsolutePath().endsWith(".3gp") || list.get(i15).m41034a().getAbsolutePath().endsWith(".avi")) {
                            aVar5.m26768f(C5400a0.f30786k).m26764b(list.get(i15).m41035b(), list.get(i15).m41034a().getName(), AbstractC5408e0.m26895c(m27174g2, list.get(i15).m41034a()));
                        }
                    } else {
                        aVar5.m26768f(C5400a0.f30786k).m26763a(list.get(i15).m41035b(), list.get(i15).m41036c());
                    }
                }
                m26883b = new C5406d0.a().m26892l(f44452b + str).m26886f("User-Agent", "IPTV Smarters Pro").m26889i(aVar5.m26767e()).m26883b();
            }
            str3 = c5402b0.mo26796a(m26883b).execute().m26920f().m26968w();
        } catch (SocketTimeoutException | IOException | Exception e10) {
            e10.printStackTrace();
            f44451a.mo15570E(i10);
            str3 = "";
        }
        return str3;
    }
}
