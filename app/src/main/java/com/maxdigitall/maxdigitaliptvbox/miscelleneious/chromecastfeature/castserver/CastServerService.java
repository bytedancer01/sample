package com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.castserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.File;
import java.io.IOException;
import p102ff.AbstractC4854b;
import p102ff.C4855c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/castserver/CastServerService.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/castserver/CastServerService.class */
public class CastServerService extends Service {

    /* renamed from: b */
    public AbstractC4854b f16343b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("HTTPSERVICE", "Destroying httpService");
        this.f16343b.m24684p();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Log.i("HTTPSERVICE", "Creating and starting httpService");
        super.onCreate();
        C4855c c4855c = new C4855c(intent.getStringExtra("127.0.0.1"), 8080, new File(intent.getStringExtra(InstructionFileId.DOT)), false);
        this.f16343b = c4855c;
        try {
            c4855c.m24683o();
            return 2;
        } catch (IOException e10) {
            Log.i("HTTPSERVICE", "IOException: " + e10.getMessage());
            return 2;
        }
    }
}
