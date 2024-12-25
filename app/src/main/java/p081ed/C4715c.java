package p081ed;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import mc.C6553c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ed/c.class
 */
/* renamed from: ed.c */
/* loaded from: combined.jar:classes2.jar:ed/c.class */
public class C4715c {

    /* renamed from: a */
    public final File f27754a;

    /* renamed from: b */
    public final C6553c f27755b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ed/c$a.class
     */
    /* renamed from: ed.c$a */
    /* loaded from: combined.jar:classes2.jar:ed/c$a.class */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C4715c(C6553c c6553c) {
        this.f27754a = new File(c6553c.m30238g().getFilesDir(), "PersistedInstallation." + c6553c.m30241k() + ".json");
        this.f27755b = c6553c;
    }

    /* renamed from: a */
    public AbstractC4716d m23716a(AbstractC4716d abstractC4716d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC4716d.mo23693d());
            jSONObject.put("Status", abstractC4716d.mo23696g().ordinal());
            jSONObject.put("AuthToken", abstractC4716d.mo23691b());
            jSONObject.put("RefreshToken", abstractC4716d.mo23695f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC4716d.mo23697h());
            jSONObject.put("ExpiresInSecs", abstractC4716d.mo23692c());
            jSONObject.put("FisError", abstractC4716d.mo23694e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f27755b.m30238g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException e10) {
        }
        if (createTempFile.renameTo(this.f27754a)) {
            return abstractC4716d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: b */
    public final JSONObject m23717b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f27754a);
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException e10) {
            return new JSONObject();
        }
    }

    /* renamed from: c */
    public AbstractC4716d m23718c() {
        JSONObject m23717b = m23717b();
        String optString = m23717b.optString("Fid", null);
        int optInt = m23717b.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m23717b.optString("AuthToken", null);
        String optString3 = m23717b.optString("RefreshToken", null);
        long optLong = m23717b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m23717b.optLong("ExpiresInSecs", 0L);
        return AbstractC4716d.m23719a().mo23702d(optString).mo23705g(a.values()[optInt]).mo23700b(optString2).mo23704f(optString3).mo23706h(optLong).mo23701c(optLong2).mo23703e(m23717b.optString("FisError", null)).mo23699a();
    }
}
