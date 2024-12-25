package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces;

import dj.C4555v;
import java.util.concurrent.TimeUnit;
import p085ej.C4730a;
import p173ji.C5402b0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/ApiclientRetrofit.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/ApiclientRetrofit.class */
public class ApiclientRetrofit {

    /* renamed from: a */
    public static C4555v f16266a;

    /* renamed from: a */
    public static C4555v m14644a() {
        C5402b0.a aVar = new C5402b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C5402b0 m26827b = aVar.m26828c(120L, timeUnit).m26825M(120L, timeUnit).m26823K(120L, timeUnit).m26830e(false).m26827b();
        C4555v c4555v = f16266a;
        if (c4555v != null) {
            return c4555v;
        }
        C4555v m22970d = new C4555v.b().m22968b("https://cms.alldrama.tv/").m22967a(C4730a.m23884f()).m22972f(m26827b).m22970d();
        f16266a = m22970d;
        return m22970d;
    }
}
