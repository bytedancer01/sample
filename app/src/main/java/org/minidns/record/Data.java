package org.minidns.record;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/Data.class */
public abstract class Data {
    private byte[] bytes;
    private transient Integer hashCodeCache;

    private void setBytes() {
        if (this.bytes != null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serialize(new DataOutputStream(byteArrayOutputStream));
            this.bytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Data)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Data data = (Data) obj;
        data.setBytes();
        setBytes();
        return Arrays.equals(this.bytes, data.bytes);
    }

    public abstract Record.TYPE getType();

    public final int hashCode() {
        if (this.hashCodeCache == null) {
            setBytes();
            this.hashCodeCache = Integer.valueOf(Arrays.hashCode(this.bytes));
        }
        return this.hashCodeCache.intValue();
    }

    public final int length() {
        setBytes();
        return this.bytes.length;
    }

    public abstract void serialize(DataOutputStream dataOutputStream);

    public final byte[] toByteArray() {
        setBytes();
        return (byte[]) this.bytes.clone();
    }

    public final void toOutputStream(DataOutputStream dataOutputStream) {
        setBytes();
        dataOutputStream.write(this.bytes);
    }

    public final void toOutputStream(OutputStream outputStream) {
        toOutputStream(new DataOutputStream(outputStream));
    }
}
