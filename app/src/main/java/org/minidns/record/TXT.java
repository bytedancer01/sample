package org.minidns.record;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/TXT.class */
public class TXT extends Data {
    private final byte[] blob;
    private transient List<String> characterStringsCache;
    private transient String textCache;

    public TXT(byte[] bArr) {
        this.blob = bArr;
    }

    public static TXT parse(DataInputStream dataInputStream, int i10) {
        byte[] bArr = new byte[i10];
        dataInputStream.readFully(bArr);
        return new TXT(bArr);
    }

    public byte[] getBlob() {
        return (byte[]) this.blob.clone();
    }

    public List<String> getCharacterStrings() {
        if (this.characterStringsCache == null) {
            List<byte[]> extents = getExtents();
            ArrayList arrayList = new ArrayList(extents.size());
            Iterator<byte[]> it = extents.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new String(it.next(), "UTF-8"));
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError(e10);
                }
            }
            this.characterStringsCache = Collections.unmodifiableList(arrayList);
        }
        return this.characterStringsCache;
    }

    public List<byte[]> getExtents() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.blob;
            if (i10 >= bArr.length) {
                return arrayList;
            }
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            i10 = (b10 & 255) + i11;
            arrayList.add(Arrays.copyOfRange(bArr, i11, i10));
        }
    }

    public String getText() {
        if (this.textCache == null) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = getCharacterStrings().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                if (it.hasNext()) {
                    sb2.append(" / ");
                }
            }
            this.textCache = sb2.toString();
        }
        return this.textCache;
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.TXT;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.blob);
    }

    public String toString() {
        return ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + getText() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }
}
