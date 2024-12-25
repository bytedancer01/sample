package de.blinkt.openvpn;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.skyfishjy.library.RippleBackground;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding.class */
public class LaunchVPN_ViewBinding implements Unbinder {

    /* renamed from: b */
    public LaunchVPN f26807b;

    /* renamed from: c */
    public View f26808c;

    /* renamed from: d */
    public View f26809d;

    /* renamed from: e */
    public View f26810e;

    /* renamed from: f */
    public View f26811f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$a.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$a.class */
    public class C4445a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final LaunchVPN f26812d;

        /* renamed from: e */
        public final LaunchVPN_ViewBinding f26813e;

        public C4445a(LaunchVPN_ViewBinding launchVPN_ViewBinding, LaunchVPN launchVPN) {
            this.f26813e = launchVPN_ViewBinding;
            this.f26812d = launchVPN;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f26812d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$b.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$b.class */
    public class C4446b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final LaunchVPN f26814d;

        /* renamed from: e */
        public final LaunchVPN_ViewBinding f26815e;

        public C4446b(LaunchVPN_ViewBinding launchVPN_ViewBinding, LaunchVPN launchVPN) {
            this.f26815e = launchVPN_ViewBinding;
            this.f26814d = launchVPN;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f26814d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$c.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$c.class */
    public class C4447c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final LaunchVPN f26816d;

        /* renamed from: e */
        public final LaunchVPN_ViewBinding f26817e;

        public C4447c(LaunchVPN_ViewBinding launchVPN_ViewBinding, LaunchVPN launchVPN) {
            this.f26817e = launchVPN_ViewBinding;
            this.f26816d = launchVPN;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f26816d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$d.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN_ViewBinding$d */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN_ViewBinding$d.class */
    public class C4448d extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final LaunchVPN f26818d;

        /* renamed from: e */
        public final LaunchVPN_ViewBinding f26819e;

        public C4448d(LaunchVPN_ViewBinding launchVPN_ViewBinding, LaunchVPN launchVPN) {
            this.f26819e = launchVPN_ViewBinding;
            this.f26818d = launchVPN;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f26818d.onclick(view);
        }
    }

    public LaunchVPN_ViewBinding(LaunchVPN launchVPN, View view) {
        this.f26807b = launchVPN;
        launchVPN.llTapToConnect = (LinearLayout) C8522c.m36739c(view, 2131428519, "field 'llTapToConnect'", LinearLayout.class);
        launchVPN.llConnecting = (LinearLayout) C8522c.m36739c(view, 2131428515, "field 'llConnecting'", LinearLayout.class);
        launchVPN.tv_touch_status = (TextView) C8522c.m36739c(view, 2131429632, "field 'tv_touch_status'", TextView.class);
        launchVPN.ripplePulseLayoutConnected = (RippleBackground) C8522c.m36739c(view, 2131428941, "field 'ripplePulseLayoutConnected'", RippleBackground.class);
        View m36738b = C8522c.m36738b(view, 2131427849, "method 'onclick'");
        this.f26808c = m36738b;
        m36738b.setOnClickListener(new C4445a(this, launchVPN));
        View m36738b2 = C8522c.m36738b(view, 2131429352, "method 'onclick'");
        this.f26809d = m36738b2;
        m36738b2.setOnClickListener(new C4446b(this, launchVPN));
        View m36738b3 = C8522c.m36738b(view, 2131428438, "method 'onclick'");
        this.f26810e = m36738b3;
        m36738b3.setOnClickListener(new C4447c(this, launchVPN));
        View m36738b4 = C8522c.m36738b(view, 2131428134, "method 'onclick'");
        this.f26811f = m36738b4;
        m36738b4.setOnClickListener(new C4448d(this, launchVPN));
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        LaunchVPN launchVPN = this.f26807b;
        if (launchVPN == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26807b = null;
        launchVPN.llTapToConnect = null;
        launchVPN.llConnecting = null;
        launchVPN.tv_touch_status = null;
        launchVPN.ripplePulseLayoutConnected = null;
        this.f26808c.setOnClickListener(null);
        this.f26808c = null;
        this.f26809d.setOnClickListener(null);
        this.f26809d = null;
        this.f26810e.setOnClickListener(null);
        this.f26810e = null;
        this.f26811f.setOnClickListener(null);
        this.f26811f = null;
    }
}
