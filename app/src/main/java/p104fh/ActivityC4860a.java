package p104fh;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import de.blinkt.openvpn.LaunchVPN;
import p135hh.C5095d0;
import p135hh.C5110r;
import p135hh.C5118z;
import p135hh.InterfaceC5100h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fh/a.class
 */
/* renamed from: fh.a */
/* loaded from: combined.jar:classes2.jar:fh/a.class */
public class ActivityC4860a extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: b */
    public InterfaceC5100h f28537b;

    /* renamed from: c */
    public ServiceConnection f28538c = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fh/a$a.class
     */
    /* renamed from: fh.a$a */
    /* loaded from: combined.jar:classes2.jar:fh/a$a.class */
    public class a implements ServiceConnection {

        /* renamed from: b */
        public final ActivityC4860a f28539b;

        public a(ActivityC4860a activityC4860a) {
            this.f28539b = activityC4860a;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f28539b.f28537b = InterfaceC5100h.a.m25510Z(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f28539b.f28537b = null;
        }
    }

    /* renamed from: b */
    public final void m24731b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(2132018701);
        builder.setMessage(2132017387);
        builder.setNegativeButton(R.string.cancel, this);
        builder.setPositiveButton(2132017385, this);
        builder.setNeutralButton(2132018443, this);
        builder.setOnCancelListener(this);
        builder.show();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            C5118z.m25668p(this);
            InterfaceC5100h interfaceC5100h = this.f28537b;
            if (interfaceC5100h != null) {
                try {
                    interfaceC5100h.mo25506a(false);
                } catch (RemoteException e10) {
                    C5095d0.m25475r(e10);
                }
            }
        } else if (i10 == -3) {
            Intent intent = new Intent(this, (Class<?>) LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", C5095d0.m25464g());
            intent.setAction("android.intent.action.MAIN");
            startActivity(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f28538c);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) C5110r.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f28538c, 1);
        m24731b();
    }
}
