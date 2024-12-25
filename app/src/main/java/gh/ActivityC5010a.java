package gh;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.CompoundButton;
import p135hh.C5110r;
import p135hh.InterfaceC5100h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gh/a.class
 */
/* renamed from: gh.a */
/* loaded from: combined.jar:classes2.jar:gh/a.class */
public class ActivityC5010a extends Activity implements CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener {

    /* renamed from: b */
    public String f29040b;

    /* renamed from: c */
    public Button f29041c;

    /* renamed from: d */
    public InterfaceC5100h f29042d;

    /* renamed from: e */
    public ServiceConnection f29043e = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gh/a$a.class
     */
    /* renamed from: gh.a$a */
    /* loaded from: combined.jar:classes2.jar:gh/a$a.class */
    public class a implements ServiceConnection {

        /* renamed from: b */
        public final ActivityC5010a f29044b;

        public a(ActivityC5010a activityC5010a) {
            this.f29044b = activityC5010a;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f29044b.f29042d = InterfaceC5100h.a.m25510Z(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f29044b.f29042d = null;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        this.f29041c.setEnabled(z10);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        if (i10 == -1) {
            try {
                this.f29042d.mo25507k1(this.f29040b);
                setResult(-1);
                finish();
            } catch (RemoteException e10) {
                e10.printStackTrace();
                throw new RuntimeException(e10);
            }
        }
        if (i10 == -2) {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f29043e);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) C5110r.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f29043e, 1);
        Intent intent2 = getIntent();
        if (intent2.getStringExtra("android.intent.extra.PACKAGE_NAME") != null) {
            this.f29040b = intent2.getStringExtra("android.intent.extra.PACKAGE_NAME");
            return;
        }
        String callingPackage = getCallingPackage();
        this.f29040b = callingPackage;
        if (callingPackage == null) {
            finish();
        }
    }
}
