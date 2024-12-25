package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces;

import android.content.Context;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.InvoiceData;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/InvoicesApiHitClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/InvoicesApiHitClass.class */
public class InvoicesApiHitClass {

    /* renamed from: a */
    public InvoiceData f16271a;

    /* renamed from: b */
    public Context f16272b;

    /* renamed from: c */
    public String f16273c;

    public InvoicesApiHitClass(InvoiceData invoiceData, Context context, String str) {
        this.f16272b = context;
        this.f16273c = str;
        this.f16271a = invoiceData;
    }

    /* renamed from: a */
    public void m14650a() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14642j("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetInvoices", "no", ClientSharepreferenceHandler.m14490a(this.f16272b), this.f16273c).mo22862f(new InterfaceC4537d<InvoicesModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.InvoicesApiHitClass.1

            /* renamed from: a */
            public final InvoicesApiHitClass f16274a;

            {
                this.f16274a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<InvoicesModelClass> interfaceC4535b, C4554u<InvoicesModelClass> c4554u) {
                if (c4554u.m22952a() == null || !c4554u.m22954d()) {
                    this.f16274a.f16271a.mo14488J(this.f16274a.f16272b.getResources().getString(2132018606));
                } else {
                    this.f16274a.f16271a.mo14489n(c4554u.m22952a().m14666a().m14667a());
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<InvoicesModelClass> interfaceC4535b, Throwable th2) {
                this.f16274a.f16271a.mo14488J(this.f16274a.f16272b.getResources().getString(2132018606));
            }
        });
    }
}
