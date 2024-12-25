package org.spongycastle.util.p259io.pem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.spongycastle.util.encoders.Base64;

/* loaded from: combined.jar:classes3.jar:org/spongycastle/util/io/pem/PemReader.class */
public class PemReader extends BufferedReader {
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) {
        String readLine;
        String str2 = END + str;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
            if (readLine.indexOf(":") >= 0) {
                int indexOf = readLine.indexOf(58);
                arrayList.add(new PemHeader(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else {
                if (readLine.indexOf(str2) != -1) {
                    break;
                }
                sb2.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new PemObject(str, arrayList, Base64.decode(sb2.toString()));
        }
        throw new IOException(str2 + " not found");
    }

    public PemObject readPemObject() {
        String readLine;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith(BEGIN));
        if (readLine == null) {
            return null;
        }
        String substring = readLine.substring(11);
        int indexOf = substring.indexOf(45);
        String substring2 = substring.substring(0, indexOf);
        if (indexOf > 0) {
            return loadObject(substring2);
        }
        return null;
    }
}
