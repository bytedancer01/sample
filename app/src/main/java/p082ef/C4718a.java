package p082ef;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p173ji.C5402b0;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5409f;
import p200l9.C5779k;
import p200l9.C5782l;
import p216m9.C5947e;
import p230n9.C6721i;
import p402x9.C9691a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ef/a.class
 */
/* renamed from: ef.a */
/* loaded from: combined.jar:classes2.jar:ef/a.class */
public class C4718a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ef/a$a.class
     */
    /* renamed from: ef.a$a */
    /* loaded from: combined.jar:classes2.jar:ef/a$a.class */
    public class a implements C6721i.b {

        /* renamed from: a */
        public final Context f27759a;

        /* renamed from: b */
        public final C6721i f27760b;

        public a(Context context, C6721i c6721i) {
            this.f27759a = context;
            this.f27760b = c6721i;
        }

        @Override // p230n9.C6721i.b
        /* renamed from: c */
        public void mo23745c() {
            Log.e("", "onAdBreakStatusUpdated()");
        }

        @Override // p230n9.C6721i.b
        /* renamed from: g */
        public void mo23746g() {
            Log.e("", "onMetadataUpdated()");
        }

        @Override // p230n9.C6721i.b
        /* renamed from: h */
        public void mo23747h() {
            Log.e("", "onQueueStatusUpdated()");
        }

        @Override // p230n9.C6721i.b
        /* renamed from: i */
        public void mo23748i() {
            Log.e("", "onSendingRemoteMediaRequest()");
        }

        @Override // p230n9.C6721i.b
        /* renamed from: k */
        public void mo23749k() {
            Log.e("", "onPreloadStatusUpdated()");
        }

        @Override // p230n9.C6721i.b
        /* renamed from: m */
        public void mo23750m() {
            Log.e("", "onStatusUpdated()");
            this.f27759a.startActivity(new Intent(this.f27759a, (Class<?>) ExpandedControlsActivity.class));
            this.f27760b.m30987N(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ef/a$b.class
     */
    /* renamed from: ef.a$b */
    /* loaded from: combined.jar:classes2.jar:ef/a$b.class */
    public class b extends C6721i.a {

        /* renamed from: a */
        public final Context f27761a;

        /* renamed from: b */
        public final C6721i f27762b;

        public b(Context context, C6721i c6721i) {
            this.f27761a = context;
            this.f27762b = c6721i;
        }

        @Override // p230n9.C6721i.a
        /* renamed from: g */
        public void mo14733g() {
            Intent intent = new Intent(this.f27761a, (Class<?>) ExpandedControlsActivity.class);
            if (((Activity) this.f27761a).getClass().getSimpleName().equals("HoneyPlayer")) {
                ((Activity) this.f27761a).finish();
            }
            this.f27761a.startActivity(intent);
            this.f27762b.m30996W(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ef/a$c.class
     */
    /* renamed from: ef.a$c */
    /* loaded from: combined.jar:classes2.jar:ef/a$c.class */
    public class c implements InterfaceC5409f {

        /* renamed from: a */
        public final Context f27763a;

        /* renamed from: b */
        public final C5782l f27764b;

        /* renamed from: c */
        public final Handler f27765c;

        /* renamed from: d */
        public final C6721i f27766d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ef/a$c$a.class
         */
        /* renamed from: ef.a$c$a */
        /* loaded from: combined.jar:classes2.jar:ef/a$c$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final MediaInfo f27767b;

            /* renamed from: c */
            public final c f27768c;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:ef/a$c$a$a.class
             */
            /* renamed from: ef.a$c$a$a, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:ef/a$c$a$a.class */
            public class C10290a extends C6721i.a {

                /* renamed from: a */
                public final a f27769a;

                public C10290a(a aVar) {
                    this.f27769a = aVar;
                }

                @Override // p230n9.C6721i.a
                /* renamed from: g */
                public void mo14733g() {
                    Intent intent = new Intent(this.f27769a.f27768c.f27763a, (Class<?>) ExpandedControlsActivity.class);
                    if (((Activity) this.f27769a.f27768c.f27763a).getClass().getSimpleName().equals("NSTIJKPlayerSkyActivity") || ((Activity) this.f27769a.f27768c.f27763a).getClass().getSimpleName().equals("NSTEXOPlayerSkyActivity")) {
                        ((Activity) this.f27769a.f27768c.f27763a).finish();
                    }
                    this.f27769a.f27768c.f27763a.startActivity(intent);
                    this.f27769a.f27768c.f27766d.m30996W(this);
                }
            }

            public a(c cVar, MediaInfo mediaInfo) {
                this.f27768c = cVar;
                this.f27767b = mediaInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27768c.f27766d.m30986M(new C10290a(this));
                this.f27768c.f27766d.m31033y(new C5779k.a().m28239h(this.f27767b).m28234c(Boolean.TRUE).m28237f(0L).m28232a());
            }
        }

        public c(Context context, C5782l c5782l, Handler handler, C6721i c6721i) {
            this.f27763a = context;
            this.f27764b = c5782l;
            this.f27765c = handler;
            this.f27766d = c6721i;
        }

        @Override // p173ji.InterfaceC5409f
        public void onFailure(@NotNull InterfaceC5407e interfaceC5407e, @NotNull IOException iOException) {
            try {
                iOException.printStackTrace();
                Log.e("chrome cast ====>  ", "Unable to cast,please try again");
                Toast.makeText(this.f27763a, "Unable to cast,please try again ", 0).show();
            } catch (Exception e10) {
            }
        }

        @Override // p173ji.InterfaceC5409f
        public void onResponse(@NotNull InterfaceC5407e interfaceC5407e, @NotNull C5410f0 c5410f0) {
            Log.e("url with token==> ", "" + c5410f0.m26918F0().m26880j().toString());
            this.f27765c.post(new a(this, new MediaInfo.C2408a(c5410f0.m26918F0().m26880j().toString()).m13078e(1).m13075b("application/x-mpegurl").m13077d(this.f27764b).m13074a()));
        }
    }

    /* renamed from: a */
    public static MediaInfo m23741a(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, List<MediaTrack> list) {
        JSONObject jSONObject;
        C5782l c5782l = new C5782l(1);
        c5782l.m28249V("com.google.android.gms.cast.metadata.SUBTITLE", str2);
        c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", str);
        c5782l.m28253b(new C9691a(Uri.parse(str6)));
        c5782l.m28253b(new C9691a(Uri.parse(str7)));
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("description", str3);
            } catch (JSONException e10) {
                e = e10;
                Log.e("honey", "Failed to add description to the json object", e);
                return new MediaInfo.C2408a(str4).m13078e(1).m13075b(str5).m13077d(c5782l).m13076c(jSONObject).m13074a();
            }
        } catch (JSONException e11) {
            e = e11;
            jSONObject = null;
        }
        return new MediaInfo.C2408a(str4).m13078e(1).m13075b(str5).m13077d(c5782l).m13076c(jSONObject).m13074a();
    }

    /* renamed from: b */
    public static void m23742b(Handler handler, C6721i c6721i, String str, C5782l c5782l, Context context) {
        new C5402b0().mo26796a(new C5406d0.a().m26892l(str).m26883b()).mo26894w(new c(context, c5782l, handler, c6721i));
    }

    /* renamed from: c */
    public static void m23743c(int i10, boolean z10, MediaInfo mediaInfo, C5947e c5947e, Context context) {
        C6721i m29290r;
        if (c5947e == null || (m29290r = c5947e.m29290r()) == null) {
            return;
        }
        m29290r.m30986M(new b(context, m29290r));
        m29290r.m31033y(new C5779k.a().m28239h(mediaInfo).m28234c(Boolean.valueOf(z10)).m28237f(i10).m28232a());
    }

    /* renamed from: d */
    public static void m23744d(MediaInfo mediaInfo, C5947e c5947e, Context context) {
        C6721i m29290r;
        if (c5947e == null || (m29290r = c5947e.m29290r()) == null) {
            return;
        }
        m29290r.m30998b(new a(context, m29290r));
        m29290r.m31032x(mediaInfo, true, 0L);
    }
}
