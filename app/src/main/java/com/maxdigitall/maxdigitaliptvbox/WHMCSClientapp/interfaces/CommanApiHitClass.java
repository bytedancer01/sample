package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/CommanApiHitClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/CommanApiHitClass.class */
public class CommanApiHitClass {

    /* renamed from: a */
    public AllServiceApiCallBack f16267a;

    /* renamed from: b */
    public Context f16268b;

    /* renamed from: c */
    public String f16269c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/CommanApiHitClass$2.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.CommanApiHitClass$2 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/CommanApiHitClass$2.class */
    class C26522 implements InterfaceC4537d<HashMap> {
        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<HashMap> interfaceC4535b, C4554u<HashMap> c4554u) {
            c4554u.m22954d();
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<HashMap> interfaceC4535b, Throwable th2) {
        }
    }

    public CommanApiHitClass() {
    }

    public CommanApiHitClass(AllServiceApiCallBack allServiceApiCallBack, Context context, String str) {
        this.f16267a = allServiceApiCallBack;
        this.f16268b = context;
        this.f16269c = str;
    }

    /* renamed from: a */
    public void m14647a() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14636d("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetClientproductwithStatus", "yes", ClientSharepreferenceHandler.m14490a(this.f16268b), this.f16269c).mo22862f(new InterfaceC4537d<ArrayList<ActiveServiceModelClass>>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.CommanApiHitClass.1

            /* renamed from: a */
            public final CommanApiHitClass f16270a;

            {
                this.f16270a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<ArrayList<ActiveServiceModelClass>> interfaceC4535b, C4554u<ArrayList<ActiveServiceModelClass>> c4554u) {
                if (!c4554u.m22954d() || c4554u.m22952a() == null) {
                    this.f16270a.f16267a.mo14487l("Network Error");
                } else {
                    this.f16270a.f16267a.mo14486A(c4554u.m22952a());
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<ArrayList<ActiveServiceModelClass>> interfaceC4535b, Throwable th2) {
                this.f16270a.f16267a.mo14487l(this.f16270a.f16268b.getResources().getString(2132018606));
            }
        });
    }
}
