package p383w9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import p350u9.C8808d;
import p422y9.AbstractC9899c;
import p422y9.C9935o;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/k.class
 */
/* renamed from: w9.k */
/* loaded from: combined.jar:classes2.jar:w9/k.class */
public final class ServiceConnectionC9482k implements C2414a.f, ServiceConnection {

    /* renamed from: m */
    public static final String f43306m = ServiceConnectionC9482k.class.getSimpleName();

    /* renamed from: b */
    public final String f43307b;

    /* renamed from: c */
    public final String f43308c;

    /* renamed from: d */
    public final ComponentName f43309d;

    /* renamed from: e */
    public final Context f43310e;

    /* renamed from: f */
    public final InterfaceC9452e f43311f;

    /* renamed from: g */
    public final Handler f43312g;

    /* renamed from: h */
    public final InterfaceC9487l f43313h;

    /* renamed from: i */
    public IBinder f43314i;

    /* renamed from: j */
    public boolean f43315j;

    /* renamed from: k */
    public String f43316k;

    /* renamed from: l */
    public String f43317l;

    /* renamed from: c */
    public final /* synthetic */ void m39931c() {
        this.f43315j = false;
        this.f43314i = null;
        m39935h("Disconnected.");
        this.f43311f.onConnectionSuspended(1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:10:0x0082
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.google.android.gms.common.api.C2414a.f
    public final void connect(p422y9.AbstractC9899c.c r6) {
        /*
            r5 = this;
            r0 = r5
            r0.m39934g()
            r0 = r5
            java.lang.String r1 = "Connect started."
            r0.m39935h(r1)
            r0 = r5
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L17
            r0 = r5
            java.lang.String r1 = "connect() called when already connected"
            r0.disconnect(r1)     // Catch: java.lang.Exception -> L82
        L17:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.SecurityException -> L75 java.lang.Exception -> L82
            r8 = r0
            r0 = r8
            r0.<init>()     // Catch: java.lang.SecurityException -> L75
            r0 = r5
            android.content.ComponentName r0 = r0.f43309d     // Catch: java.lang.SecurityException -> L75
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L31
            r0 = r8
            r1 = r6
            android.content.Intent r0 = r0.setComponent(r1)     // Catch: java.lang.SecurityException -> L75
            goto L41
        L31:
            r0 = r8
            r1 = r5
            java.lang.String r1 = r1.f43307b     // Catch: java.lang.SecurityException -> L75
            android.content.Intent r0 = r0.setPackage(r1)     // Catch: java.lang.SecurityException -> L75
            r1 = r5
            java.lang.String r1 = r1.f43308c     // Catch: java.lang.SecurityException -> L75
            android.content.Intent r0 = r0.setAction(r1)     // Catch: java.lang.SecurityException -> L75
        L41:
            r0 = r5
            android.content.Context r0 = r0.f43310e     // Catch: java.lang.SecurityException -> L75
            r1 = r8
            r2 = r5
            int r3 = p422y9.AbstractC9914h.m41789a()     // Catch: java.lang.SecurityException -> L75
            boolean r0 = r0.bindService(r1, r2, r3)     // Catch: java.lang.SecurityException -> L75
            r7 = r0
            r0 = r5
            r1 = r7
            r0.f43315j = r1     // Catch: java.lang.SecurityException -> L75
            r0 = r7
            if (r0 != 0) goto L6e
            r0 = r5
            r1 = 0
            r0.f43314i = r1
            r0 = r5
            w9.l r0 = r0.f43313h
            u9.b r1 = new u9.b
            r2 = r1
            r3 = 16
            r2.<init>(r3)
            r0.onConnectionFailed(r1)
        L6e:
            r0 = r5
            java.lang.String r1 = "Finished connect."
            r0.m39935h(r1)
            return
        L75:
            r6 = move-exception
            r0 = r5
            r1 = 0
            r0.f43315j = r1
            r0 = r5
            r1 = 0
            r0.f43314i = r1
            r0 = r6
            throw r0
        L82:
            r6 = move-exception
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.ServiceConnectionC9482k.connect(y9.c$c):void");
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final void disconnect() {
        m39934g();
        m39935h("Disconnect called.");
        try {
            this.f43310e.unbindService(this);
        } catch (IllegalArgumentException e10) {
        }
        this.f43315j = false;
        this.f43314i = null;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final void disconnect(String str) {
        m39934g();
        this.f43316k = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public final /* synthetic */ void m39932e(IBinder iBinder) {
        this.f43315j = false;
        this.f43314i = iBinder;
        m39935h("Connected.");
        this.f43311f.onConnected(new Bundle());
    }

    /* renamed from: f */
    public final void m39933f(String str) {
        this.f43317l = str;
    }

    /* renamed from: g */
    public final void m39934g() {
        if (Thread.currentThread() != this.f43312g.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final C8808d[] getAvailableFeatures() {
        return new C8808d[0];
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final String getEndpointPackageName() {
        String str = this.f43307b;
        if (str != null) {
            return str;
        }
        C9935o.m41850j(this.f43309d);
        return this.f43309d.getPackageName();
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final String getLastDisconnectMessage() {
        return this.f43316k;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final void getRemoteService(InterfaceC9917i interfaceC9917i, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final Intent getSignInIntent() {
        return new Intent();
    }

    /* renamed from: h */
    public final void m39935h(String str) {
        String.valueOf(this.f43314i);
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final boolean isConnected() {
        m39934g();
        return this.f43314i != null;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final boolean isConnecting() {
        m39934g();
        return this.f43315j;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f43312g.post(new Runnable(this, iBinder) { // from class: w9.u1

            /* renamed from: b */
            public final ServiceConnectionC9482k f43460b;

            /* renamed from: c */
            public final IBinder f43461c;

            {
                this.f43460b = this;
                this.f43461c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f43460b.m39932e(this.f43461c);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f43312g.post(new Runnable(this) { // from class: w9.t1

            /* renamed from: b */
            public final ServiceConnectionC9482k f43432b;

            {
                this.f43432b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f43432b.m39931c();
            }
        });
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final void onUserSignOut(AbstractC9899c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.C2414a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
