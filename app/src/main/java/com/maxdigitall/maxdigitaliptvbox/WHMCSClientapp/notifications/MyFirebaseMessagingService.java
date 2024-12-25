package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.notifications;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C2575e;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyTicketActivity;
import org.achartengine.ChartFactory;
import org.json.JSONException;
import org.json.JSONObject;
import p119h1.C5019a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/notifications/MyFirebaseMessagingService.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/notifications/MyFirebaseMessagingService.class */
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: i */
    public static final String f16338i = MyFirebaseMessagingService.class.getSimpleName();

    /* renamed from: h */
    public NotificationUtils f16339h;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: p */
    public void mo14316p(C2575e c2575e) {
        String str = f16338i;
        Log.e(str, "From: " + c2575e.m14382Q());
        if (c2575e.m14383R() != null) {
            Log.e(str, "Notification Body: " + c2575e.m14383R().m14385a());
            m14714v(c2575e.m14383R().m14385a());
        }
        if (c2575e.m14381P().size() > 0) {
            Log.e(str, "Data Payload: " + c2575e.m14381P().toString());
            try {
                m14713u(new JSONObject(c2575e.m14381P().toString()));
            } catch (Exception e10) {
                Log.e(f16338i, "Exception: " + e10.getMessage());
            }
        }
    }

    /* renamed from: u */
    public final void m14713u(JSONObject jSONObject) {
        String str;
        StringBuilder sb2;
        String str2;
        String str3 = f16338i;
        Log.e(str3, "push json: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString(ChartFactory.TITLE);
            String string2 = jSONObject2.getString("message");
            boolean z10 = jSONObject2.getBoolean("is_background");
            String string3 = jSONObject2.getString("image");
            String string4 = jSONObject2.getString("timestamp");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("payload");
            Log.e(str3, "title: " + string);
            Log.e(str3, "message: " + string2);
            Log.e(str3, "isBackground: " + z10);
            Log.e(str3, "payload: " + jSONObject3.toString());
            Log.e(str3, "imageUrl: " + string3);
            Log.e(str3, "timestamp: " + string4);
            Intent intent = new Intent(getApplicationContext(), (Class<?>) MyTicketActivity.class);
            intent.setAction("notification_action");
            intent.putExtra("ticketid", "4");
            if (TextUtils.isEmpty(string3)) {
                m14715w(getApplicationContext(), string, string2, string4, intent);
            } else {
                m14716x(getApplicationContext(), string, string2, string4, intent, string3);
            }
        } catch (JSONException e10) {
            e = e10;
            str = f16338i;
            sb2 = new StringBuilder();
            str2 = "Json Exception: ";
            sb2.append(str2);
            sb2.append(e.getMessage());
            Log.e(str, sb2.toString());
        } catch (Exception e11) {
            e = e11;
            str = f16338i;
            sb2 = new StringBuilder();
            str2 = "Exception: ";
            sb2.append(str2);
            sb2.append(e.getMessage());
            Log.e(str, sb2.toString());
        }
    }

    /* renamed from: v */
    public final void m14714v(String str) {
        if (NotificationUtils.m14717b(getApplicationContext())) {
            return;
        }
        Intent intent = new Intent("pushNotification");
        intent.putExtra("message", str);
        C5019a.m25220b(this).m25222c(intent);
        new NotificationUtils(getApplicationContext()).m14719c();
    }

    /* renamed from: w */
    public final void m14715w(Context context, String str, String str2, String str3, Intent intent) {
        this.f16339h = new NotificationUtils(context);
        intent.setFlags(268468224);
        this.f16339h.m14721e(str, str2, str3, intent);
    }

    /* renamed from: x */
    public final void m14716x(Context context, String str, String str2, String str3, Intent intent, String str4) {
        this.f16339h = new NotificationUtils(context);
        intent.setFlags(268468224);
        this.f16339h.m14722f(str, str2, str3, intent, str4);
    }
}
