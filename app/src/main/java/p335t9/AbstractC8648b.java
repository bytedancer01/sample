package p335t9;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import na.C6757a;
import na.C6762f;
import p079ea.ThreadFactoryC4694b;
import za.AbstractC10144i;
import za.C10148l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/b.class
 */
/* renamed from: t9.b */
/* loaded from: combined.jar:classes2.jar:t9/b.class */
public abstract class AbstractC8648b extends BroadcastReceiver {

    /* renamed from: a */
    public final ExecutorService f40394a = C6757a.m31075a().mo31076a(new ThreadFactoryC4694b("firebase-iid-executor"), C6762f.f35241a);

    /* renamed from: a */
    public Executor m37126a() {
        return this.f40394a;
    }

    /* renamed from: b */
    public abstract int mo14268b(Context context, C8646a c8646a);

    /* renamed from: c */
    public void mo14269c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    public void mo14270d(Context context, Bundle bundle) {
    }

    /* renamed from: e */
    public final int m37127e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e10) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            mo14270d(context, extras);
            return -1;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo14269c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* renamed from: f */
    public final /* synthetic */ void m37128f(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int m37127e = intent2 != null ? m37127e(context, intent2) : m37129g(context, intent);
            if (z10) {
                pendingResult.setResultCode(m37127e);
            }
        } finally {
            pendingResult.finish();
        }
    }

    /* renamed from: g */
    public final int m37129g(Context context, Intent intent) {
        AbstractC10144i<Void> m37150d;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m37150d = C10148l.m42587e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            m37150d = C8658i.m37147c(context).m37150d(2, bundle);
        }
        int mo14268b = mo14268b(context, new C8646a(intent));
        try {
            C10148l.m42584b(m37150d, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return mo14268b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m37126a().execute(new Runnable(this, intent, context, isOrderedBroadcast, goAsync) { // from class: t9.h

            /* renamed from: b */
            public final AbstractC8648b f40412b;

            /* renamed from: c */
            public final Intent f40413c;

            /* renamed from: d */
            public final Context f40414d;

            /* renamed from: e */
            public final boolean f40415e;

            /* renamed from: f */
            public final BroadcastReceiver.PendingResult f40416f;

            {
                this.f40412b = this;
                this.f40413c = intent;
                this.f40414d = context;
                this.f40415e = isOrderedBroadcast;
                this.f40416f = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f40412b.m37128f(this.f40413c, this.f40414d, this.f40415e, this.f40416f);
            }
        });
    }
}
