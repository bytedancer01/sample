package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.minidns.edns.EdnsOption;
import org.minidns.record.Record;

/* loaded from: combined.jar:classes3.jar:org/minidns/record/OPT.class */
public class OPT extends Data {
    public static final boolean $assertionsDisabled = false;
    public final List<EdnsOption> variablePart;

    public OPT() {
        this(Collections.emptyList());
    }

    public OPT(List<EdnsOption> list) {
        this.variablePart = Collections.unmodifiableList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    public static OPT parse(DataInputStream dataInputStream, int i10) {
        ArrayList arrayList;
        if (i10 == 0) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(4);
            while (i10 > 0) {
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort2];
                dataInputStream.read(bArr);
                arrayList2.add(EdnsOption.parse(readUnsignedShort, bArr));
                i10 -= readUnsignedShort2 + 4;
            }
            arrayList = arrayList2;
        }
        return new OPT(arrayList);
    }

    @Override // org.minidns.record.Data
    public Record.TYPE getType() {
        return Record.TYPE.OPT;
    }

    @Override // org.minidns.record.Data
    public void serialize(DataOutputStream dataOutputStream) {
        Iterator<EdnsOption> it = this.variablePart.iterator();
        while (it.hasNext()) {
            it.next().writeToDos(dataOutputStream);
        }
    }
}
