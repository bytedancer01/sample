package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess;

import java.util.List;
import org.simpleframework.xml.strategy.Name;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5841c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TicketModelClass.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TicketModelClass.class */
public class TicketModelClass {

    /* renamed from: a */
    @InterfaceC5839a
    @InterfaceC5841c("result")
    public String f16329a;

    /* renamed from: b */
    @InterfaceC5839a
    @InterfaceC5841c("tickets")
    public Tickets f16330b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TicketModelClass$Tickets.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TicketModelClass$Tickets.class */
    public class Tickets {

        /* renamed from: a */
        @InterfaceC5839a
        @InterfaceC5841c("ticket")
        public List<Ticket> f16331a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TicketModelClass$Tickets$Ticket.class
         */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/modelclassess/TicketModelClass$Tickets$Ticket.class */
        public class Ticket {

            /* renamed from: a */
            @InterfaceC5839a
            @InterfaceC5841c(Name.MARK)
            public String f16332a;

            /* renamed from: b */
            @InterfaceC5839a
            @InterfaceC5841c("tid")
            public String f16333b;

            /* renamed from: c */
            @InterfaceC5839a
            @InterfaceC5841c("subject")
            public String f16334c;

            /* renamed from: d */
            @InterfaceC5839a
            @InterfaceC5841c("status")
            public String f16335d;

            /* renamed from: e */
            @InterfaceC5839a
            @InterfaceC5841c("lastreply")
            public String f16336e;

            /* renamed from: a */
            public String m14708a() {
                return this.f16332a;
            }

            /* renamed from: b */
            public String m14709b() {
                return this.f16336e;
            }

            /* renamed from: c */
            public String m14710c() {
                return this.f16335d;
            }

            /* renamed from: d */
            public String m14711d() {
                return this.f16334c;
            }

            /* renamed from: e */
            public String m14712e() {
                return this.f16333b;
            }
        }

        /* renamed from: a */
        public List<Ticket> m14707a() {
            return this.f16331a;
        }
    }

    /* renamed from: a */
    public String m14705a() {
        return this.f16329a;
    }

    /* renamed from: b */
    public Tickets m14706b() {
        return this.f16330b;
    }
}
