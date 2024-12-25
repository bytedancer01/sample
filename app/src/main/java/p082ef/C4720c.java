package p082ef;

import android.content.Context;
import android.content.Intent;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.castserver.CastServerService;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ef/c.class
 */
/* renamed from: ef.c */
/* loaded from: combined.jar:classes2.jar:ef/c.class */
public class C4720c {

    /* renamed from: a */
    public final Context f27784a;

    public C4720c(Context context) {
        this.f27784a = context;
    }

    /* renamed from: a */
    public void m23790a(String str, String str2) {
        Intent intent = new Intent(this.f27784a, (Class<?>) CastServerService.class);
        intent.putExtra("127.0.0.1", str);
        intent.putExtra(InstructionFileId.DOT, str2);
        this.f27784a.startService(intent);
    }

    /* renamed from: b */
    public void m23791b() {
        this.f27784a.stopService(new Intent(this.f27784a, (Class<?>) CastServerService.class));
    }
}
