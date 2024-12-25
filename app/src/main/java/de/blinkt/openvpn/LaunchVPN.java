package de.blinkt.openvpn;

import ag.C0164a;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import bg.C0900a;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cf.C1084h;
import com.maxdigitall.maxdigitaliptvbox.model.VPNSingleton;
import com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity;
import com.skyfishjy.library.RippleBackground;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import mbanje.kurt.fabbutton.FabButton;
import nf.C6783a;
import p083eh.C4726a;
import p135hh.C5093c0;
import p135hh.C5095d0;
import p135hh.C5110r;
import p135hh.C5117y;
import p135hh.C5118z;
import p135hh.EnumC5096e;
import p135hh.InterfaceC5100h;
import p135hh.InterfaceC5101i;
import p135hh.ServiceC5111s;
import p151if.C5251a;
import p151if.C5255e;
import p154ii.C5264c;
import p427yf.AsyncTaskC9986d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/blinkt/openvpn/LaunchVPN.class
 */
/* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN.class */
public class LaunchVPN extends ActivityC0243b implements C5095d0.e, C5095d0.b {

    /* renamed from: A */
    public static C6783a f26755A;

    /* renamed from: d */
    public C4726a f26756d;

    /* renamed from: g */
    public String f26759g;

    /* renamed from: h */
    public String f26760h;

    /* renamed from: i */
    public String f26761i;

    /* renamed from: j */
    public String f26762j;

    /* renamed from: k */
    public String f26763k;

    /* renamed from: l */
    public String f26764l;

    @BindView
    public LinearLayout llConnecting;

    @BindView
    public LinearLayout llTapToConnect;

    /* renamed from: m */
    public String f26765m;

    /* renamed from: n */
    public String f26766n;

    /* renamed from: o */
    public int f26767o;

    /* renamed from: p */
    public InterfaceC5100h f26768p;

    /* renamed from: q */
    public AsyncTaskC9986d f26769q;

    /* renamed from: r */
    public Context f26770r;

    @BindView
    public RippleBackground ripplePulseLayoutConnected;

    /* renamed from: s */
    public FabButton f26771s;

    /* renamed from: t */
    public C1084h f26772t;

    @BindView
    public TextView tv_touch_status;

    /* renamed from: u */
    public C0164a f26773u;

    /* renamed from: v */
    public C0900a f26774v;

    /* renamed from: x */
    public PopupWindow f26776x;

    /* renamed from: e */
    public boolean f26757e = false;

    /* renamed from: f */
    public boolean f26758f = false;

    /* renamed from: w */
    public FileInputStream f26775w = null;

    /* renamed from: y */
    public ServiceConnection f26777y = new ServiceConnectionC4437j(this);

    /* renamed from: z */
    public ServiceConnection f26778z = new ServiceConnectionC4438k(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$a.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$a */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$a.class */
    public class ViewOnClickListenerC4428a implements View.OnClickListener {

        /* renamed from: b */
        public final LaunchVPN f26779b;

        public ViewOnClickListenerC4428a(LaunchVPN launchVPN) {
            this.f26779b = launchVPN;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26779b.f26776x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$b.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$b */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$b.class */
    public class ViewOnClickListenerC4429b implements View.OnClickListener {

        /* renamed from: b */
        public final LaunchVPN f26780b;

        public ViewOnClickListenerC4429b(LaunchVPN launchVPN) {
            this.f26780b = launchVPN;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26780b.f26776x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$c.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$c */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$c.class */
    public class ViewOnClickListenerC4430c implements View.OnClickListener {

        /* renamed from: b */
        public final String f26781b;

        /* renamed from: c */
        public final C0900a f26782c;

        /* renamed from: d */
        public final String[] f26783d;

        /* renamed from: e */
        public final String[] f26784e;

        /* renamed from: f */
        public final EditText f26785f;

        /* renamed from: g */
        public final EditText f26786g;

        /* renamed from: h */
        public final LaunchVPN f26787h;

        public ViewOnClickListenerC4430c(LaunchVPN launchVPN, String str, C0900a c0900a, String[] strArr, String[] strArr2, EditText editText, EditText editText2) {
            this.f26787h = launchVPN;
            this.f26781b = str;
            this.f26782c = c0900a;
            this.f26783d = strArr;
            this.f26784e = strArr2;
            this.f26785f = editText;
            this.f26786g = editText2;
        }

        /* renamed from: a */
        public final boolean m22573a() {
            Context context;
            String string;
            if (this.f26781b.equals("AUTH_FAILED")) {
                this.f26783d[0] = String.valueOf(this.f26785f.getText());
                this.f26784e[0] = String.valueOf(this.f26786g.getText());
                String str = this.f26783d[0];
                if (str != null && str.equals("")) {
                    context = this.f26787h.f26770r;
                    string = this.f26787h.f26770r.getResources().getString(2132017654);
                    Toast.makeText(context, string, 1).show();
                    return false;
                }
                String str2 = this.f26784e[0];
                if (str2 == null || !str2.equals("")) {
                    String str3 = this.f26783d[0];
                    return (str3 == null || this.f26784e[0] == null || str3.equals("") || this.f26784e[0].equals("")) ? false : true;
                }
            } else {
                this.f26784e[0] = String.valueOf(this.f26786g.getText());
                String str4 = this.f26784e[0];
                if (str4 == null || !str4.equals("")) {
                    String str5 = this.f26784e[0];
                    return (str5 == null || str5.equals("")) ? false : true;
                }
            }
            context = this.f26787h.f26770r;
            string = this.f26787h.f26770r.getResources().getString(2132017649);
            Toast.makeText(context, string, 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0900a c0900a;
            String str;
            if (m22573a()) {
                if (this.f26781b.equals("AUTH_FAILED")) {
                    this.f26782c.m5571t(this.f26783d[0]);
                    c0900a = this.f26782c;
                    str = this.f26784e[0];
                } else {
                    this.f26782c.m5571t("");
                    c0900a = this.f26782c;
                    str = this.f26784e[0];
                }
                c0900a.m5570s(str);
                this.f26787h.f26773u.m740q0(this.f26782c);
                this.f26787h.f26776x.dismiss();
                this.f26787h.f26774v = this.f26782c;
                this.f26787h.m22560P0();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$d.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$d */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$d.class */
    public class DialogInterfaceOnClickListenerC4431d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final LaunchVPN f26788b;

        public DialogInterfaceOnClickListenerC4431d(LaunchVPN launchVPN) {
            this.f26788b = launchVPN;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f26788b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$e.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$e */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$e.class */
    public class DialogInterfaceOnCancelListenerC4432e implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        public final LaunchVPN f26789b;

        public DialogInterfaceOnCancelListenerC4432e(LaunchVPN launchVPN) {
            this.f26789b = launchVPN;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f26789b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$f.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$f */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$f.class */
    public class DialogInterfaceOnDismissListenerC4433f implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final LaunchVPN f26790b;

        public DialogInterfaceOnDismissListenerC4433f(LaunchVPN launchVPN) {
            this.f26790b = launchVPN;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f26790b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$g.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$g */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$g.class */
    public class C4434g implements AsyncTaskC9986d.a {

        /* renamed from: a */
        public final LaunchVPN f26791a;

        public C4434g(LaunchVPN launchVPN) {
            this.f26791a = launchVPN;
        }

        @Override // p427yf.AsyncTaskC9986d.a
        /* renamed from: a */
        public void mo19845a() {
            this.f26791a.m22568X0();
        }

        @Override // p427yf.AsyncTaskC9986d.a
        /* renamed from: b */
        public void mo19846b(String str) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$h.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$h */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$h.class */
    public class RunnableC4435h implements Runnable {

        /* renamed from: b */
        public final String f26792b;

        /* renamed from: c */
        public final LaunchVPN f26793c;

        public RunnableC4435h(LaunchVPN launchVPN, String str) {
            this.f26793c = launchVPN;
            this.f26792b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26792b.equalsIgnoreCase(this.f26793c.getString(2132018630))) {
                this.f26793c.m22567W0();
                LaunchVPN launchVPN = this.f26793c;
                launchVPN.m22557M0(true, launchVPN.getResources().getString(2132018630));
                this.f26793c.ripplePulseLayoutConnected.setVisibility(0);
            } else {
                if (!this.f26792b.equals("USERPAUSE")) {
                    String str = "AUTH_FAILED";
                    if (!this.f26792b.equals("AUTH_FAILED")) {
                        str = "AUTH_FAILED_PRIVATE_KEY";
                        if (!this.f26792b.equals("AUTH_FAILED_PRIVATE_KEY")) {
                            if (this.f26792b.equalsIgnoreCase("Not running") || this.f26792b.equalsIgnoreCase(this.f26793c.getString(2132018633)) || this.f26792b.equalsIgnoreCase("NOPROCESS")) {
                                this.f26793c.m22571Z0();
                                this.f26793c.f26772t.m6473c();
                                this.f26793c.m22557M0(false, "");
                                return;
                            }
                            if (this.f26792b.equalsIgnoreCase("WAIT") || this.f26792b.equalsIgnoreCase("AUTH") || this.f26792b.equalsIgnoreCase("GET_CONFIG") || this.f26792b.equalsIgnoreCase("NONETWORK") || this.f26792b.equalsIgnoreCase("VPN_GENERATE_CONFIG") || this.f26792b.equalsIgnoreCase("RECONNECTING") || this.f26792b.equalsIgnoreCase("RESOLVE") || this.f26792b.equalsIgnoreCase("AUTH_PENDING") || this.f26792b.equalsIgnoreCase("TCP_CONNECT")) {
                                this.f26793c.m22571Z0();
                                LaunchVPN launchVPN2 = this.f26793c;
                                launchVPN2.m22557M0(true, launchVPN2.getResources().getString(2132018631));
                                if (this.f26793c.f26772t.m6471a()) {
                                    return;
                                }
                            } else {
                                this.f26793c.m22571Z0();
                                LaunchVPN launchVPN3 = this.f26793c;
                                launchVPN3.m22557M0(true, launchVPN3.getResources().getString(2132018631));
                                if (this.f26793c.f26772t.m6471a()) {
                                    return;
                                }
                            }
                            this.f26793c.f26772t.m6472b();
                            return;
                        }
                    }
                    this.f26793c.m22571Z0();
                    this.f26793c.f26772t.m6473c();
                    this.f26793c.m22557M0(false, "");
                    this.f26793c.m22563S0(str);
                    return;
                }
                this.f26793c.m22571Z0();
                LaunchVPN launchVPN4 = this.f26793c;
                launchVPN4.m22557M0(true, launchVPN4.getResources().getString(2132018791));
                if (!this.f26793c.f26772t.m6471a()) {
                    return;
                }
            }
            this.f26793c.f26772t.m6473c();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$i.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$i */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$i.class */
    public class ServiceConnectionC4436i implements ServiceConnection {

        /* renamed from: b */
        public final LaunchVPN f26794b;

        public ServiceConnectionC4436i(LaunchVPN launchVPN) {
            this.f26794b = launchVPN;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC5100h m25510Z = InterfaceC5100h.a.m25510Z(iBinder);
            if (m25510Z != null) {
                try {
                    m25510Z.mo25506a(false);
                } catch (RemoteException e10) {
                    C5095d0.m25475r(e10);
                }
            }
            this.f26794b.unbindService(this);
            if (!this.f26794b.f26772t.m6471a()) {
                this.f26794b.f26772t.m6472b();
            }
            this.f26794b.m22562R0();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$j.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$j */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$j.class */
    public class ServiceConnectionC4437j implements ServiceConnection {

        /* renamed from: b */
        public final LaunchVPN f26795b;

        public ServiceConnectionC4437j(LaunchVPN launchVPN) {
            this.f26795b = launchVPN;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f26795b.f26768p = InterfaceC5100h.a.m25510Z(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f26795b.f26768p = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$k.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$k */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$k.class */
    public class ServiceConnectionC4438k implements ServiceConnection {

        /* renamed from: b */
        public final LaunchVPN f26796b;

        public ServiceConnectionC4438k(LaunchVPN launchVPN) {
            this.f26796b = launchVPN;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC5101i m25517Z = InterfaceC5101i.a.m25517Z(iBinder);
            try {
                if (this.f26796b.f26759g != null) {
                    m25517Z.mo25512G0(this.f26796b.f26756d.m23855F(), 3, this.f26796b.f26759g);
                }
                if (this.f26796b.f26760h != null) {
                    m25517Z.mo25512G0(this.f26796b.f26756d.m23855F(), 2, this.f26796b.f26760h);
                }
                this.f26796b.onActivityResult(70, -1, null);
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
            this.f26796b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$l.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$l */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$l.class */
    public class ViewOnClickListenerC4439l implements View.OnClickListener {

        /* renamed from: b */
        public final LaunchVPN f26797b;

        public ViewOnClickListenerC4439l(LaunchVPN launchVPN) {
            this.f26797b = launchVPN;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26797b.f26776x.dismiss();
            C5095d0.m25456J("USER_VPN_PASSWORD_CANCELLED", "", 2132018642, EnumC5096e.LEVEL_NOTCONNECTED);
            this.f26797b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$m.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$m */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$m.class */
    public class ViewOnClickListenerC4440m implements View.OnClickListener {

        /* renamed from: b */
        public final LaunchVPN f26798b;

        public ViewOnClickListenerC4440m(LaunchVPN launchVPN) {
            this.f26798b = launchVPN;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26798b.f26776x.dismiss();
            C5095d0.m25456J("USER_VPN_PASSWORD_CANCELLED", "", 2132018642, EnumC5096e.LEVEL_NOTCONNECTED);
            this.f26798b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$n.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$n */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$n.class */
    public class ViewOnClickListenerC4441n implements View.OnClickListener {

        /* renamed from: b */
        public final C0900a f26799b;

        /* renamed from: c */
        public final String[] f26800c;

        /* renamed from: d */
        public final EditText f26801d;

        /* renamed from: e */
        public final LaunchVPN f26802e;

        public ViewOnClickListenerC4441n(LaunchVPN launchVPN, C0900a c0900a, String[] strArr, EditText editText) {
            this.f26802e = launchVPN;
            this.f26799b = c0900a;
            this.f26800c = strArr;
            this.f26801d = editText;
        }

        /* renamed from: a */
        public final boolean m22574a() {
            this.f26800c[0] = String.valueOf(this.f26801d.getText());
            String str = this.f26800c[0];
            if (str == null || !str.equals("")) {
                String str2 = this.f26800c[0];
                return (str2 == null || str2.equals("")) ? false : true;
            }
            Toast.makeText(this.f26802e.f26770r, this.f26802e.f26770r.getResources().getString(2132017649), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m22574a()) {
                this.f26799b.m5571t("");
                this.f26799b.m5570s(this.f26800c[0]);
                this.f26802e.f26773u.m740q0(this.f26799b);
                this.f26802e.f26776x.dismiss();
                this.f26802e.f26760h = this.f26800c[0];
                Intent intent = new Intent(this.f26802e, (Class<?>) ServiceC5111s.class);
                LaunchVPN launchVPN = this.f26802e;
                launchVPN.bindService(intent, launchVPN.f26778z, 1);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$o.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$o */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$o.class */
    public class ViewOnClickListenerC4442o implements View.OnClickListener {

        /* renamed from: b */
        public final String f26803b;

        /* renamed from: c */
        public final LaunchVPN f26804c;

        public ViewOnClickListenerC4442o(LaunchVPN launchVPN, String str) {
            this.f26804c = launchVPN;
            this.f26803b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f26804c.f26776x != null && this.f26804c.f26776x.isShowing()) {
                this.f26804c.f26776x.dismiss();
            }
            LaunchVPN launchVPN = this.f26804c;
            launchVPN.m22555K0(launchVPN.f26774v, this.f26803b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$p.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$p */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$p.class */
    public class ViewOnClickListenerC4443p implements View.OnClickListener {

        /* renamed from: b */
        public final LaunchVPN f26805b;

        public ViewOnClickListenerC4443p(LaunchVPN launchVPN) {
            this.f26805b = launchVPN;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f26805b.f26776x == null || !this.f26805b.f26776x.isShowing()) {
                return;
            }
            this.f26805b.f26776x.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:de/blinkt/openvpn/LaunchVPN$q.class
     */
    /* renamed from: de.blinkt.openvpn.LaunchVPN$q */
    /* loaded from: combined.jar:classes2.jar:de/blinkt/openvpn/LaunchVPN$q.class */
    public class C4444q implements PopupWindow.OnDismissListener {

        /* renamed from: b */
        public final LaunchVPN f26806b;

        public C4444q(LaunchVPN launchVPN) {
            this.f26806b = launchVPN;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* renamed from: I0 */
    public final void m22553I0(int i10) {
        try {
            View inflate = ((LayoutInflater) this.f26770r.getSystemService("layout_inflater")).inflate(2131624234, (RelativeLayout) ((Activity) this.f26770r).findViewById(2131428953));
            PopupWindow popupWindow = new PopupWindow(this.f26770r);
            this.f26776x = popupWindow;
            popupWindow.setContentView(inflate);
            this.f26776x.setWidth(-1);
            this.f26776x.setHeight(-1);
            this.f26776x.setFocusable(true);
            this.f26776x.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427619);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, (Activity) this.f26770r));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, (Activity) this.f26770r));
            }
            ((TextView) inflate.findViewById(2131429517)).setText("Need Private Key Password");
            EditText editText = (EditText) inflate.findViewById(2131429640);
            editText.setVisibility(8);
            EditText editText2 = (EditText) inflate.findViewById(2131429639);
            TextView textView = (TextView) inflate.findViewById(2131427905);
            ImageView imageView = (ImageView) inflate.findViewById(2131428154);
            textView.setText(this.f26770r.getResources().getString(2132018793) + " " + this.f26756d.f27826d);
            if (this.f26770r.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            if (button2 != null) {
                button2.setOnClickListener(new ViewOnClickListenerC4439l(this));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new ViewOnClickListenerC4440m(this));
            }
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC4441n(this, this.f26774v, new String[]{""}, editText2));
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: J0 */
    public void m22554J0() {
        Intent intent = new Intent(this, (Class<?>) C5110r.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new ServiceConnectionC4436i(this), 1);
    }

    /* renamed from: K0 */
    public final void m22555K0(C0900a c0900a, String str) {
        new C0900a();
        try {
            View inflate = ((LayoutInflater) this.f26770r.getSystemService("layout_inflater")).inflate(2131624234, (RelativeLayout) ((Activity) this.f26770r).findViewById(2131428953));
            PopupWindow popupWindow = new PopupWindow(this.f26770r);
            this.f26776x = popupWindow;
            popupWindow.setContentView(inflate);
            this.f26776x.setWidth(-1);
            this.f26776x.setHeight(-1);
            this.f26776x.setFocusable(true);
            this.f26776x.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427619);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, (Activity) this.f26770r));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, (Activity) this.f26770r));
            }
            EditText editText = (EditText) inflate.findViewById(2131429640);
            EditText editText2 = (EditText) inflate.findViewById(2131429639);
            TextView textView = (TextView) inflate.findViewById(2131427905);
            ImageView imageView = (ImageView) inflate.findViewById(2131428154);
            if (str.equals("AUTH_FAILED")) {
                editText.setVisibility(0);
            } else if (str.equals("AUTH_FAILED_PRIVATE_KEY")) {
                editText.setVisibility(8);
            }
            editText.setText(c0900a.m5559h());
            editText2.setText(c0900a.m5558g());
            textView.setText(this.f26770r.getResources().getString(2132018793) + " " + c0900a.m5556e());
            if (this.f26770r.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            if (button2 != null) {
                button2.setOnClickListener(new ViewOnClickListenerC4428a(this));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new ViewOnClickListenerC4429b(this));
            }
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC4430c(this, str, c0900a, new String[]{""}, new String[]{""}, editText, editText2));
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: L0 */
    public final void m22556L0(String str) {
        try {
            if (new ProcessBuilder("su", "-c", str).start().waitFor() == 0) {
                this.f26758f = true;
            }
        } catch (IOException | InterruptedException e10) {
            C5095d0.m25476s("SU command", e10);
        }
    }

    /* renamed from: M0 */
    public void m22557M0(boolean z10, String str) {
        if (!z10) {
            this.llConnecting.setVisibility(8);
            this.llTapToConnect.setVisibility(0);
        } else {
            this.llConnecting.setVisibility(0);
            this.llTapToConnect.setVisibility(8);
            this.tv_touch_status.setText(str);
        }
    }

    /* renamed from: N0 */
    public final void m22558N0() {
        if (!C5095d0.m25468k()) {
            this.llConnecting.setVisibility(0);
            this.llTapToConnect.setVisibility(8);
            if (!this.f26772t.m6471a()) {
                this.f26772t.m6472b();
            }
            m22562R0();
            return;
        }
        C5118z.m25668p(this.f26770r);
        InterfaceC5100h interfaceC5100h = this.f26768p;
        if (interfaceC5100h != null) {
            try {
                interfaceC5100h.mo25506a(false);
            } catch (RemoteException e10) {
                C5095d0.m25475r(e10);
            }
        }
    }

    /* renamed from: O0 */
    public void m22559O0() {
        int m23865b = this.f26756d.m23865b(this);
        if (m23865b != 2132018199) {
            m22564T0(m23865b);
            return;
        }
        Intent prepare = VpnService.prepare(this);
        SharedPreferences m25656a = C5117y.m25656a(this);
        boolean z10 = m25656a.getBoolean("useCM9Fix", false);
        if (m25656a.getBoolean("loadTunModule", false)) {
            m22556L0("insmod /system/lib/modules/tun.ko");
        }
        if (z10 && !this.f26758f) {
            m22556L0("chown system /dev/tun");
        }
        if (prepare == null) {
            onActivityResult(70, -1, null);
            return;
        }
        C5095d0.m25456J("USER_VPN_PERMISSION", "", 2132018643, EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT);
        try {
            startActivityForResult(prepare, 70);
        } catch (ActivityNotFoundException e10) {
            C5095d0.m25471n(2132018237);
        }
    }

    /* renamed from: P0 */
    public void m22560P0() {
        C0900a c0900a;
        if (!C5095d0.m25468k()) {
            if (!this.f26772t.m6471a()) {
                this.f26772t.m6472b();
            }
            m22562R0();
            return;
        }
        C4726a m25665i = C5118z.m25665i();
        if (m25665i == null || m25665i.f27826d == null || (c0900a = this.f26774v) == null || c0900a.m5556e() == null || m25665i.f27826d.equals(this.f26774v.m5556e())) {
            return;
        }
        C5118z.m25668p(this.f26770r);
        m22554J0();
    }

    @TargetApi(17)
    /* renamed from: Q0 */
    public final void m22561Q0(AlertDialog.Builder builder) {
        builder.setOnDismissListener(new DialogInterfaceOnDismissListenerC4433f(this));
    }

    /* renamed from: R0 */
    public final void m22562R0() {
        C0900a c0900a = this.f26774v;
        if (c0900a != null) {
            this.f26766n = c0900a.m5559h();
            this.f26765m = this.f26774v.m5558g();
            this.f26763k = this.f26774v.m5556e();
            this.f26764l = this.f26774v.m5555d();
            this.f26767o = this.f26774v.m5554c();
            this.f26775w = null;
            try {
                this.f26775w = new FileInputStream(this.f26764l);
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            if (this.f26775w != null) {
                FileInputStream fileInputStream = this.f26775w;
                String str = this.f26763k;
                AsyncTaskC9986d asyncTaskC9986d = new AsyncTaskC9986d(this, fileInputStream, str, this.f26764l, str, new C4434g(this));
                this.f26769q = asyncTaskC9986d;
                asyncTaskC9986d.execute(new Void[0]);
                return;
            }
            Toast.makeText(this.f26770r, this.f26763k + " profile not found.", 0).show();
            m22571Z0();
            this.f26772t.m6473c();
            m22557M0(false, "");
        }
    }

    /* renamed from: S0 */
    public final void m22563S0(String str) {
        String str2;
        try {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624548, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f26776x = popupWindow;
            popupWindow.setContentView(inflate);
            this.f26776x.setWidth(-1);
            this.f26776x.setHeight(-1);
            this.f26776x.setFocusable(true);
            this.f26776x.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427654);
            TextView textView = (TextView) inflate.findViewById(2131429524);
            if (!str.equals("AUTH_FAILED")) {
                str2 = str.equals("AUTH_FAILED_PRIVATE_KEY") ? "Authenticate failed ! Invalid private key password" : "Authenticate failed ! Invalid Username or password";
                Button button2 = (Button) inflate.findViewById(2131427642);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button2.setOnClickListener(new ViewOnClickListenerC4442o(this, str));
                button.setOnClickListener(new ViewOnClickListenerC4443p(this));
                this.f26776x.setOnDismissListener(new C4444q(this));
            }
            textView.setText(str2);
            Button button22 = (Button) inflate.findViewById(2131427642);
            button.setOnFocusChangeListener(new C5255e.i(button, this));
            button22.setOnFocusChangeListener(new C5255e.i(button22, this));
            button22.setOnClickListener(new ViewOnClickListenerC4442o(this, str));
            button.setOnClickListener(new ViewOnClickListenerC4443p(this));
            this.f26776x.setOnDismissListener(new C4444q(this));
        } catch (Exception e10) {
        }
    }

    /* renamed from: T0 */
    public void m22564T0(int i10) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(2132017511);
        builder.setMessage(i10);
        builder.setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC4431d(this));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC4432e(this));
        if (Build.VERSION.SDK_INT >= 22) {
            m22561Q0(builder);
        }
        builder.show();
    }

    @Override // p135hh.C5095d0.e
    /* renamed from: U0 */
    public void mo22565U0(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent) {
        runOnUiThread(new RunnableC4435h(this, str));
    }

    /* renamed from: V0 */
    public final void m22566V0() {
        this.f26772t.m6473c();
        m22571Z0();
        m22557M0(false, "");
    }

    /* renamed from: W0 */
    public final void m22567W0() {
        this.ripplePulseLayoutConnected.m21326e();
    }

    /* renamed from: X0 */
    public void m22568X0() {
        try {
            m22569Y0(C5118z.m25663g(this).m25671j(this.f26763k));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: Y0 */
    public void m22569Y0(C4726a c4726a) {
        C5251a.f30018Q = this.f26766n;
        C5251a.f30017P = this.f26765m;
        C5251a.f30015N = this.f26767o;
        String str = this.f26763k;
        if (str != null && str.contains(".ovpn")) {
            this.f26763k = this.f26763k.replaceAll(".ovpn", "");
        }
        C5251a.f30016O = this.f26763k;
        C5251a.f30019R = this.f26764l;
        C5251a.f30015N = this.f26767o;
        if (C5117y.m25656a(this).getBoolean("clearlogconnect", true)) {
            C5095d0.m25461d();
        }
        C4726a m25659c = C5118z.m25659c(this, c4726a.m23854E().toString());
        if (m25659c == null) {
            C5095d0.m25471n(2132018566);
            return;
        }
        this.f26756d = m25659c;
        this.f26761i = this.f26766n;
        this.f26762j = this.f26765m;
        m22559O0();
    }

    @Override // p135hh.C5095d0.b
    /* renamed from: Z */
    public void mo22570Z(long j10, long j11, long j12, long j13) {
    }

    /* renamed from: Z0 */
    public final void m22571Z0() {
        this.ripplePulseLayoutConnected.m21327f();
        this.ripplePulseLayoutConnected.clearAnimation();
    }

    public final void init() {
        this.f26770r = this;
        FabButton fabButton = (FabButton) findViewById(2131427849);
        this.f26771s = fabButton;
        this.f26772t = new C1084h(fabButton, this);
        this.f26773u = new C0164a(this.f26770r);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Intent intent2;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 70) {
            if (i11 != -1) {
                if (i11 == 0) {
                    C5095d0.m25456J("USER_VPN_PERMISSION_CANCELLED", "", 2132018644, EnumC5096e.LEVEL_NOTCONNECTED);
                    if (Build.VERSION.SDK_INT >= 24) {
                        C5095d0.m25471n(2132018248);
                    }
                    m22566V0();
                    return;
                }
                return;
            }
            C4726a c4726a = this.f26756d;
            if (c4726a != null) {
                int m23858L = c4726a.m23858L(this.f26760h, this.f26759g);
                if (m23858L == 0) {
                    C5095d0.m25456J("USER_VPN_PASSWORD", "", 2132018641, EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT);
                    C4726a c4726a2 = this.f26756d;
                    c4726a2.f27799B = this.f26761i;
                    String str = this.f26762j;
                    c4726a2.f27797A = str;
                    this.f26759g = str;
                    C5117y.m25656a(this);
                    C5118z.m25669q(this, this.f26756d);
                    C5093c0.m25440f(this.f26756d, getBaseContext());
                    return;
                }
                if (m23858L == 2132018411) {
                    C5095d0.m25456J("USER_VPN_PASSWORD", "", 2132018641, EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT);
                    if (this.f26762j.equals("")) {
                        this.f26756d.f27799B = "";
                        m22553I0(m23858L);
                        return;
                    } else {
                        this.f26756d.f27799B = "";
                        this.f26760h = this.f26762j;
                        intent2 = new Intent(this, (Class<?>) ServiceC5111s.class);
                    }
                } else {
                    C5095d0.m25456J("USER_VPN_PASSWORD", "", 2132018641, EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT);
                    C4726a c4726a3 = this.f26756d;
                    c4726a3.f27799B = this.f26761i;
                    String str2 = this.f26762j;
                    c4726a3.f27797A = str2;
                    this.f26759g = str2;
                    intent2 = new Intent(this, (Class<?>) ServiceC5111s.class);
                }
                bindService(intent2, this.f26778z, 1);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26770r = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f26770r);
        f26755A = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624102 : 2131624101);
        ButterKnife.m5626a(this);
        init();
        Intent intent = getIntent();
        if (this.f26774v == null) {
            C0900a c0900a = (C0900a) intent.getSerializableExtra("vpnProfile");
            this.f26774v = c0900a;
            if (c0900a == null) {
                this.f26774v = VPNSingleton.m14906a().m14907b();
            }
            VPNSingleton.m14906a().m14908c(this.f26774v);
        }
        m22560P0();
        try {
            overridePendingTransition(2130772003, 2130772000);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        ServiceConnection serviceConnection = this.f26777y;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5095d0.m25460c(this);
        C5095d0.m25458a(this);
        Intent intent = new Intent(this, (Class<?>) C5110r.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f26777y, 1);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        C5095d0.m25451E(this);
        C5095d0.m25449C(this);
        super.onStop();
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case 2131427849:
            case C5264c.f30186a /* 2131427996 */:
            case C5264c.f30187b /* 2131427997 */:
                m22558N0();
                break;
            case 2131428134:
            case 2131428438:
            case 2131429352:
                startActivity(new Intent(this, (Class<?>) ProfileActivity.class));
                break;
        }
    }

    @Override // p135hh.C5095d0.e
    /* renamed from: y0 */
    public void mo22572y0(String str) {
    }
}
