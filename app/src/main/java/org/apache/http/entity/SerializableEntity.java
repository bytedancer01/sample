package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/entity/SerializableEntity.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/entity/SerializableEntity.class */
public class SerializableEntity extends AbstractHttpEntity {
    private Serializable objRef;
    private byte[] objSer;

    public SerializableEntity(Serializable serializable) {
        Args.notNull(serializable, "Source object");
        this.objRef = serializable;
    }

    public SerializableEntity(Serializable serializable, boolean z10) {
        Args.notNull(serializable, "Source object");
        if (z10) {
            createBytes(serializable);
        } else {
            this.objRef = serializable;
        }
    }

    private void createBytes(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.objSer = byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        if (this.objSer == null) {
            createBytes(this.objRef);
        }
        return new ByteArrayInputStream(this.objSer);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        if (this.objSer == null) {
            return -1L;
        }
        return r0.length;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.objSer == null;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        byte[] bArr = this.objSer;
        if (bArr != null) {
            outputStream.write(bArr);
            outputStream.flush();
        } else {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.objRef);
            objectOutputStream.flush();
        }
    }
}
