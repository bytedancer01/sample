package p162j6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p036c6.AbstractC0998i;
import p036c6.AbstractC1004o;
import p036c6.C1009t;
import p056d6.InterfaceC4309e;
import p056d6.InterfaceC4317m;
import p181k6.InterfaceC5509x;
import p197l6.InterfaceC5689d;
import p213m6.InterfaceC5931b;
import p437z5.InterfaceC10060h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j6/c.class
 */
/* renamed from: j6.c */
/* loaded from: combined.jar:classes1.jar:j6/c.class */
public class C5298c implements InterfaceC5300e {

    /* renamed from: f */
    public static final Logger f30456f = Logger.getLogger(C1009t.class.getName());

    /* renamed from: a */
    public final InterfaceC5509x f30457a;

    /* renamed from: b */
    public final Executor f30458b;

    /* renamed from: c */
    public final InterfaceC4309e f30459c;

    /* renamed from: d */
    public final InterfaceC5689d f30460d;

    /* renamed from: e */
    public final InterfaceC5931b f30461e;

    public C5298c(Executor executor, InterfaceC4309e interfaceC4309e, InterfaceC5509x interfaceC5509x, InterfaceC5689d interfaceC5689d, InterfaceC5931b interfaceC5931b) {
        this.f30458b = executor;
        this.f30459c = interfaceC4309e;
        this.f30457a = interfaceC5509x;
        this.f30460d = interfaceC5689d;
        this.f30461e = interfaceC5931b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m26481d(AbstractC1004o abstractC1004o, AbstractC0998i abstractC0998i) {
        this.f30460d.mo27963N(abstractC1004o, abstractC0998i);
        this.f30457a.mo27292b(abstractC1004o, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m26482e(final AbstractC1004o abstractC1004o, InterfaceC10060h interfaceC10060h, AbstractC0998i abstractC0998i) {
        try {
            InterfaceC4317m interfaceC4317m = this.f30459c.get(abstractC1004o.mo5927b());
            if (interfaceC4317m == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC1004o.mo5927b());
                f30456f.warning(format);
                interfaceC10060h.mo5964a(new IllegalArgumentException(format));
            } else {
                final AbstractC0998i mo290a = interfaceC4317m.mo290a(abstractC0998i);
                this.f30461e.mo28062p(new InterfaceC5931b.a(this, abstractC1004o, mo290a) { // from class: j6.b

                    /* renamed from: a */
                    public final C5298c f30453a;

                    /* renamed from: b */
                    public final AbstractC1004o f30454b;

                    /* renamed from: c */
                    public final AbstractC0998i f30455c;

                    {
                        this.f30453a = this;
                        this.f30454b = abstractC1004o;
                        this.f30455c = mo290a;
                    }

                    @Override // p213m6.InterfaceC5931b.a
                    public final Object execute() {
                        Object m26481d;
                        m26481d = this.f30453a.m26481d(this.f30454b, this.f30455c);
                        return m26481d;
                    }
                });
                interfaceC10060h.mo5964a(null);
            }
        } catch (Exception e10) {
            f30456f.warning("Error scheduling event " + e10.getMessage());
            interfaceC10060h.mo5964a(e10);
        }
    }

    @Override // p162j6.InterfaceC5300e
    /* renamed from: a */
    public void mo26483a(final AbstractC1004o abstractC1004o, final AbstractC0998i abstractC0998i, final InterfaceC10060h interfaceC10060h) {
        this.f30458b.execute(new Runnable(this, abstractC1004o, interfaceC10060h, abstractC0998i) { // from class: j6.a

            /* renamed from: b */
            public final C5298c f30449b;

            /* renamed from: c */
            public final AbstractC1004o f30450c;

            /* renamed from: d */
            public final InterfaceC10060h f30451d;

            /* renamed from: e */
            public final AbstractC0998i f30452e;

            {
                this.f30449b = this;
                this.f30450c = abstractC1004o;
                this.f30451d = interfaceC10060h;
                this.f30452e = abstractC0998i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f30449b.m26482e(this.f30450c, this.f30451d, this.f30452e);
            }
        });
    }
}
