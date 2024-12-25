package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import org.minidns.dnsname.DnsName;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/NSEC.class */
public class NSEC extends Data {
    private static final Logger LOGGER = Logger.getLogger(NSEC.class.getName());
    public final DnsName next;
    private final byte[] typeBitmap;
    public final List<Record.TYPE> types;

    public NSEC(String str, List<Record.TYPE> list) {
        this(DnsName.from(str), list);
    }

    public NSEC(String str, Record.TYPE... typeArr) {
        this(DnsName.from(str), (List<Record.TYPE>) Arrays.asList(typeArr));
    }

    public NSEC(DnsName dnsName, List<Record.TYPE> list) {
        this.next = dnsName;
        this.types = Collections.unmodifiableList(list);
        this.typeBitmap = createTypeBitMap(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        if ((r0.intValue() >> 8) != r8) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] createTypeBitMap(java.util.List<org.minidns.record.Record.TYPE> r6) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.record.NSEC.createTypeBitMap(java.util.List):byte[]");
    }

    public static NSEC parse(DataInputStream dataInputStream, byte[] bArr, int i10) {
        DnsName parse = DnsName.parse(dataInputStream, bArr);
        int size = i10 - parse.size();
        byte[] bArr2 = new byte[size];
        if (dataInputStream.read(bArr2) == size) {
            return new NSEC(parse, readTypeBitMap(bArr2));
        }
        throw new IOException();
    }

    public static List<Record.TYPE> readTypeBitMap(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (bArr.length <= i11) {
                return arrayList;
            }
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            for (int i12 = 0; i12 < readUnsignedByte2; i12++) {
                int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                for (int i13 = 0; i13 < 8; i13++) {
                    if (((readUnsignedByte3 >> i13) & 1) > 0) {
                        int i14 = (readUnsignedByte << 8) + (i12 * 8) + (7 - i13);
                        Record.TYPE type = Record.TYPE.getType(i14);
                        if (type == Record.TYPE.UNKNOWN) {
                            LOGGER.warning("Skipping unknown type in type bitmap: " + i14);
                        } else {
                            arrayList.add(type);
                        }
                    }
                }
            }
            i10 = i11 + readUnsignedByte2 + 2;
        }
    }

    private static void writeOutBlock(byte[] bArr, DataOutputStream dataOutputStream) {
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] != 0) {
                i10 = i11 + 1;
            }
        }
        dataOutputStream.writeByte(i10);
        for (int i12 = 0; i12 < i10; i12++) {
            dataOutputStream.writeByte(bArr[i12]);
        }
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.NSEC;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        this.next.writeToStream(dataOutputStream);
        dataOutputStream.write(this.typeBitmap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.next);
        sb2.append('.');
        for (Record.TYPE type : this.types) {
            sb2.append(' ');
            sb2.append(type);
        }
        return sb2.toString();
    }
}
