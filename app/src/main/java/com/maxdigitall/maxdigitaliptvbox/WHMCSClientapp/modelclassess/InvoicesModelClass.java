package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess;

import java.util.List;
import org.simpleframework.xml.strategy.Name;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/InvoicesModelClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/InvoicesModelClass.class */
public class InvoicesModelClass {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("invoices")
    public Invoices f16290a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/InvoicesModelClass$Invoices.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/InvoicesModelClass$Invoices.class */
    public class Invoices {

        /* renamed from: a */
        @InterfaceC5839a
        @InterfaceC5841c("invoice")
        public List<Invoice> f16291a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/InvoicesModelClass$Invoices$Invoice.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/InvoicesModelClass$Invoices$Invoice.class */
        public class Invoice {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c(Name.MARK)
            public String f16292a;

            /* renamed from: b */
            @InterfaceC5839a
            @InterfaceC5841c("date")
            public String f16293b;

            /* renamed from: c */
            @InterfaceC5839a
            @InterfaceC5841c("duedate")
            public String f16294c;

            /* renamed from: d */
            @InterfaceC5839a
            @InterfaceC5841c("total")
            public String f16295d;

            /* renamed from: e */
            @InterfaceC5839a
            @InterfaceC5841c("status")
            public String f16296e;

            /* renamed from: a */
            public String m14668a() {
                return this.f16293b;
            }

            /* renamed from: b */
            public String m14669b() {
                return this.f16294c;
            }

            /* renamed from: c */
            public String m14670c() {
                return this.f16292a;
            }

            /* renamed from: d */
            public String m14671d() {
                return this.f16296e;
            }

            /* renamed from: e */
            public String m14672e() {
                return this.f16295d;
            }
        }

        /* renamed from: a */
        public List<Invoice> m14667a() {
            return this.f16291a;
        }
    }

    /* renamed from: a */
    public Invoices m14666a() {
        return this.f16290a;
    }
}
