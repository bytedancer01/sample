package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess;

import com.amazonaws.services.p045s3.model.BucketVersioningConfiguration;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass.class */
public class ServicesIncoiveTicketCoutModelClass {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("result")
    public String f16306a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("data")
    public Data f16307b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data.class */
    public class Data {

        /* renamed from: a */
        @InterfaceC5839a
        @InterfaceC5841c("servicescount")
        public Servicescount f16308a;

        /* renamed from: b */
        @InterfaceC5839a
        @InterfaceC5841c("invoicescount")
        public Invoicescount f16309b;

        /* renamed from: c */
        @InterfaceC5839a
        @InterfaceC5841c("ticketscount")
        public Ticketscount f16310c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data$Invoicescount.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data$Invoicescount.class */
        public class Invoicescount {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c("Paid")
            public Integer f16311a;

            /* renamed from: b */
            @InterfaceC5839a
            @InterfaceC5841c("Unpaid")
            public Integer f16312b;

            /* renamed from: c */
            @InterfaceC5839a
            @InterfaceC5841c("Cancelled")
            public Integer f16313c;

            /* renamed from: d */
            @InterfaceC5839a
            @InterfaceC5841c("Refunded")
            public Integer f16314d;

            /* renamed from: a */
            public Integer m14687a() {
                return this.f16313c;
            }

            /* renamed from: b */
            public Integer m14688b() {
                return this.f16311a;
            }

            /* renamed from: c */
            public Integer m14689c() {
                return this.f16314d;
            }

            /* renamed from: d */
            public Integer m14690d() {
                return this.f16312b;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data$Servicescount.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data$Servicescount.class */
        public class Servicescount {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c("Active")
            public Integer f16315a;

            /* renamed from: b */
            @InterfaceC5839a
            @InterfaceC5841c("Pending")
            public Integer f16316b;

            /* renamed from: c */
            @InterfaceC5839a
            @InterfaceC5841c(BucketVersioningConfiguration.SUSPENDED)
            public Integer f16317c;

            /* renamed from: d */
            @InterfaceC5839a
            @InterfaceC5841c("Cancelled")
            public Integer f16318d;

            /* renamed from: e */
            @InterfaceC5839a
            @InterfaceC5841c("Fraud")
            public Integer f16319e;

            /* renamed from: f */
            @InterfaceC5839a
            @InterfaceC5841c("Terminated")
            public Integer f16320f;

            /* renamed from: a */
            public Integer m14691a() {
                return this.f16315a;
            }

            /* renamed from: b */
            public Integer m14692b() {
                return this.f16318d;
            }

            /* renamed from: c */
            public Integer m14693c() {
                return this.f16319e;
            }

            /* renamed from: d */
            public Integer m14694d() {
                return this.f16316b;
            }

            /* renamed from: e */
            public Integer m14695e() {
                return this.f16317c;
            }

            /* renamed from: f */
            public Integer m14696f() {
                return this.f16320f;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data$Ticketscount.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/ServicesIncoiveTicketCoutModelClass$Data$Ticketscount.class */
        public class Ticketscount {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c("totalresults")
            public String f16321a;

            /* renamed from: a */
            public String m14697a() {
                return this.f16321a;
            }
        }

        /* renamed from: a */
        public Invoicescount m14684a() {
            return this.f16309b;
        }

        /* renamed from: b */
        public Servicescount m14685b() {
            return this.f16308a;
        }

        /* renamed from: c */
        public Ticketscount m14686c() {
            return this.f16310c;
        }
    }

    /* renamed from: a */
    public Data m14682a() {
        return this.f16307b;
    }

    /* renamed from: b */
    public String m14683b() {
        return this.f16306a;
    }
}
