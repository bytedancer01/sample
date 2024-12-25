package org.minidns.dnsmessage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsmessage/Question.class */
public class Question {
    public static final boolean $assertionsDisabled = false;
    private byte[] byteArray;
    public final Record.CLASS clazz;
    public final DnsName name;
    public final Record.TYPE type;
    private final boolean unicastQuery;

    public Question(DataInputStream dataInputStream, byte[] bArr) {
        this.name = DnsName.parse(dataInputStream, bArr);
        this.type = Record.TYPE.getType(dataInputStream.readUnsignedShort());
        this.clazz = Record.CLASS.getClass(dataInputStream.readUnsignedShort());
        this.unicastQuery = false;
    }

    public Question(CharSequence charSequence, Record.TYPE type) {
        this(DnsName.from(charSequence), type);
    }

    public Question(CharSequence charSequence, Record.TYPE type, Record.CLASS r82) {
        this(DnsName.from(charSequence), type, r82);
    }

    public Question(CharSequence charSequence, Record.TYPE type, Record.CLASS r92, boolean z10) {
        this(DnsName.from(charSequence), type, r92, z10);
    }

    public Question(DnsName dnsName, Record.TYPE type) {
        this(dnsName, type, Record.CLASS.IN);
    }

    public Question(DnsName dnsName, Record.TYPE type, Record.CLASS r92) {
        this(dnsName, type, r92, false);
    }

    public Question(DnsName dnsName, Record.TYPE type, Record.CLASS r62, boolean z10) {
        this.name = dnsName;
        this.type = type;
        this.clazz = r62;
        this.unicastQuery = z10;
    }

    public DnsMessage.Builder asMessageBuilder() {
        DnsMessage.Builder builder = DnsMessage.builder();
        builder.setQuestion(this);
        return builder;
    }

    public DnsMessage asQueryMessage() {
        return asMessageBuilder().build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Question) {
            return Arrays.equals(toByteArray(), ((Question) obj).toByteArray());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(toByteArray());
    }

    public byte[] toByteArray() {
        if (this.byteArray == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                this.name.writeToStream(dataOutputStream);
                dataOutputStream.writeShort(this.type.getValue());
                dataOutputStream.writeShort(this.clazz.getValue() | (this.unicastQuery ? 32768 : 0));
                dataOutputStream.flush();
                this.byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return this.byteArray;
    }

    public String toString() {
        return this.name.getRawAce() + ".\t" + this.clazz + '\t' + this.type;
    }
}
