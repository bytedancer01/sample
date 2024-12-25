package p427yf;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import nf.C6783a;
import p151if.C5251a;
import p446zf.InterfaceC10207a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yf/a.class
 */
/* renamed from: yf.a */
/* loaded from: combined.jar:classes2.jar:yf/a.class */
public class C9983a {

    /* renamed from: e */
    public static InterfaceC10207a f45706e;

    /* renamed from: a */
    public File f45707a;

    /* renamed from: b */
    public InputStream f45708b;

    /* renamed from: c */
    public Context f45709c;

    /* renamed from: d */
    public String f45710d;

    public C9983a(Context context, File file, InterfaceC10207a interfaceC10207a) {
        this.f45707a = file;
        this.f45709c = context;
        String name = file.getName();
        this.f45710d = name;
        if (name != null && name.endsWith(".zip")) {
            this.f45710d = this.f45710d.replaceAll(".zip", "");
        }
        m41930a("");
        f45706e = interfaceC10207a;
    }

    /* renamed from: a */
    public final void m41930a(String str) {
        File file = new File(str);
        Log.i("UNZIPUTIL", "creating dir " + str);
        if (str.length() < 0 || file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: b */
    public void m41931b() {
        File file;
        if (new C6783a(this.f45709c).m31288z().equals(C5251a.f30065s0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                file = new File(this.f45709c.getFilesDir() + "/VPNMAXDIGITAL/" + this.f45710d);
            } else {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNMAXDIGITAL/" + this.f45710d);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            file = new File(this.f45709c.getFilesDir() + "/VPNMAXDIGITAL/" + this.f45710d);
        } else {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNMAXDIGITAL/" + this.f45710d);
        }
        try {
            m41930a(String.valueOf(file));
            Log.i("UNZIPUTIL", "Starting to unzip");
            InputStream inputStream = this.f45708b;
            InputStream inputStream2 = inputStream;
            if (inputStream == null) {
                inputStream2 = new FileInputStream(this.f45707a);
            }
            ZipInputStream zipInputStream = new ZipInputStream(inputStream2);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    f45706e.mo19808S(String.valueOf(file));
                    Log.i("UNZIPUTIL", "Finished unzip");
                    return;
                }
                Log.v("UNZIPUTIL", "Unzipping " + nextEntry.getName());
                if (!nextEntry.isDirectory()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, nextEntry.getName()));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (Exception e10) {
            Log.e("UNZIPUTIL", "Unzip Error", e10);
            f45706e.mo19809T(this.f45709c.getResources().getString(2132018606));
            f45706e.mo19808S(String.valueOf(file));
        }
    }
}
