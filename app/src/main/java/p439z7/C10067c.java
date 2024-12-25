package p439z7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z7/c.class
 */
/* renamed from: z7.c */
/* loaded from: combined.jar:classes2.jar:z7/c.class */
public final class C10067c implements Parcelable {
    public static final Parcelable.Creator<C10067c> CREATOR = new a();

    /* renamed from: b */
    public final int f46224b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z7/c$a.class
     */
    /* renamed from: z7.c$a */
    /* loaded from: combined.jar:classes2.jar:z7/c$a.class */
    public class a implements Parcelable.Creator<C10067c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10067c createFromParcel(Parcel parcel) {
            return new C10067c(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10067c[] newArray(int i10) {
            return new C10067c[i10];
        }
    }

    public C10067c(int i10) {
        this.f46224b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    /* renamed from: p */
    public static boolean m42363p(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        boolean z10 = true;
        if (C4401z0.f26679a < 24) {
            return true;
        }
        activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: b */
    public C10067c m42364b(int i10) {
        int i11 = this.f46224b;
        int i12 = i10 & i11;
        return i12 == i11 ? this : new C10067c(i12);
    }

    /* renamed from: c */
    public final int m42365c(Context context) {
        if (!m42372r()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C4349a.m21882e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m42363p(connectivityManager)) ? (m42375w() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f46224b & 3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C10067c.class != obj.getClass()) {
            return false;
        }
        if (this.f46224b != ((C10067c) obj).f46224b) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.f46224b;
    }

    /* renamed from: j */
    public int m42366j(Context context) {
        int m42365c = m42365c(context);
        int i10 = m42365c;
        if (m42368l()) {
            i10 = m42365c;
            if (!m42369m(context)) {
                i10 = m42365c | 8;
            }
        }
        int i11 = i10;
        if (m42371o()) {
            i11 = i10;
            if (!m42370n(context)) {
                i11 = i10 | 4;
            }
        }
        int i12 = i11;
        if (m42374u()) {
            i12 = i11;
            if (!m42373s(context)) {
                i12 = i11 | 16;
            }
        }
        return i12;
    }

    /* renamed from: k */
    public int m42367k() {
        return this.f46224b;
    }

    /* renamed from: l */
    public boolean m42368l() {
        return (this.f46224b & 8) != 0;
    }

    /* renamed from: m */
    public final boolean m42369m(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: n */
    public final boolean m42370n(Context context) {
        boolean isDeviceIdleMode;
        PowerManager powerManager = (PowerManager) C4349a.m21882e(context.getSystemService("power"));
        int i10 = C4401z0.f26679a;
        boolean z10 = true;
        if (i10 >= 23) {
            isDeviceIdleMode = powerManager.isDeviceIdleMode();
            z10 = isDeviceIdleMode;
        } else if (i10 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive()) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: o */
    public boolean m42371o() {
        return (this.f46224b & 4) != 0;
    }

    /* renamed from: r */
    public boolean m42372r() {
        boolean z10 = true;
        if ((this.f46224b & 1) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: s */
    public final boolean m42373s(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    /* renamed from: u */
    public boolean m42374u() {
        return (this.f46224b & 16) != 0;
    }

    /* renamed from: w */
    public boolean m42375w() {
        return (this.f46224b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46224b);
    }
}
