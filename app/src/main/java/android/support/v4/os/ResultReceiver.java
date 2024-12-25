package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/os/ResultReceiver.class
 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: combined.jar:classes1.jar:android/support/v4/os/ResultReceiver.class */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    };
    public final Handler mHandler;
    public final boolean mLocal;
    public IResultReceiver mReceiver;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/os/ResultReceiver$MyResultReceiver.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/os/ResultReceiver$MyResultReceiver.class */
    public class MyResultReceiver extends IResultReceiver.Stub {
        public final ResultReceiver this$0;

        public MyResultReceiver(ResultReceiver resultReceiver) {
            this.this$0 = resultReceiver;
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = this.this$0;
            Handler handler = resultReceiver.mHandler;
            if (handler != null) {
                handler.post(new MyRunnable(resultReceiver, i10, bundle));
            } else {
                resultReceiver.onReceiveResult(i10, bundle);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/os/ResultReceiver$MyRunnable.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/os/ResultReceiver$MyRunnable.class */
    public class MyRunnable implements Runnable {
        public final int mResultCode;
        public final Bundle mResultData;
        public final ResultReceiver this$0;

        public MyRunnable(ResultReceiver resultReceiver, int i10, Bundle bundle) {
            this.this$0 = resultReceiver;
            this.mResultCode = i10;
            this.mResultData = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.onReceiveResult(this.mResultCode, this.mResultData);
        }
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    public ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        this.mHandler = null;
        this.mReceiver = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i10, Bundle bundle) {
    }

    public void send(int i10, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new MyRunnable(this, i10, bundle));
                return;
            } else {
                onReceiveResult(i10, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.mReceiver;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i10, bundle);
            } catch (RemoteException e10) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.mReceiver == null) {
                this.mReceiver = new MyResultReceiver(this);
            }
            parcel.writeStrongBinder(this.mReceiver.asBinder());
        }
    }
}
