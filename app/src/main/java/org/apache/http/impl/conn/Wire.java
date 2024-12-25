package org.apache.http.impl.conn;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/Wire.class */
public class Wire {

    /* renamed from: id */
    private final String f36164id;
    private final Log log;

    public Wire(Log log) {
        this(log, "");
    }

    public Wire(Log log, String str) {
        this.log = log;
        this.f36164id = str;
    }

    private void wire(String str, InputStream inputStream) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            if (read == 13) {
                str2 = "[\\r]";
            } else if (read == 10) {
                sb2.append("[\\n]\"");
                sb2.insert(0, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                sb2.insert(0, str);
                this.log.debug(this.f36164id + " " + sb2.toString());
                sb2.setLength(0);
            } else if (read < 32 || read > 127) {
                sb2.append("[0x");
                sb2.append(Integer.toHexString(read));
                str2 = "]";
            } else {
                sb2.append((char) read);
            }
            sb2.append(str2);
        }
        if (sb2.length() > 0) {
            sb2.append('\"');
            sb2.insert(0, '\"');
            sb2.insert(0, str);
            this.log.debug(this.f36164id + " " + sb2.toString());
        }
    }

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public void input(int i10) {
        input(new byte[]{(byte) i10});
    }

    public void input(InputStream inputStream) {
        Args.notNull(inputStream, "Input");
        wire("<< ", inputStream);
    }

    public void input(String str) {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }

    public void input(byte[] bArr) {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr));
    }

    public void input(byte[] bArr, int i10, int i11) {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr, i10, i11));
    }

    public void output(int i10) {
        output(new byte[]{(byte) i10});
    }

    public void output(InputStream inputStream) {
        Args.notNull(inputStream, "Output");
        wire(">> ", inputStream);
    }

    public void output(String str) {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }

    public void output(byte[] bArr) {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr));
    }

    public void output(byte[] bArr, int i10, int i11) {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr, i10, i11));
    }
}
