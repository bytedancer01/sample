package p135hh;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Vector;
import p083eh.C4726a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/e0.class
 */
/* renamed from: hh.e0 */
/* loaded from: combined.jar:classes2.jar:hh/e0.class */
public class C5097e0 {
    /* renamed from: a */
    public static Certificate[] m25487a(String str) {
        int indexOf;
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Vector vector = new Vector();
        if (!C4726a.m23847I(str)) {
            return new Certificate[]{certificateFactory.generateCertificate(new FileInputStream(str))};
        }
        int indexOf2 = str.indexOf("-----BEGIN CERTIFICATE-----");
        do {
            int max = Math.max(0, indexOf2);
            vector.add(certificateFactory.generateCertificate(new ByteArrayInputStream(str.substring(max).getBytes())));
            indexOf = str.indexOf("-----BEGIN CERTIFICATE-----", max + 1);
            indexOf2 = indexOf;
        } while (indexOf > 0);
        return (Certificate[]) vector.toArray(new Certificate[vector.size()]);
    }
}
