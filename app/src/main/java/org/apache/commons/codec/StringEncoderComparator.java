package org.apache.commons.codec;

import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/StringEncoderComparator.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/StringEncoderComparator.class */
public class StringEncoderComparator implements Comparator {
    private final StringEncoder stringEncoder;

    @Deprecated
    public StringEncoderComparator() {
        this.stringEncoder = null;
    }

    public StringEncoderComparator(StringEncoder stringEncoder) {
        this.stringEncoder = stringEncoder;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i10;
        try {
            i10 = ((Comparable) this.stringEncoder.encode(obj)).compareTo((Comparable) this.stringEncoder.encode(obj2));
        } catch (EncoderException e10) {
            i10 = 0;
        }
        return i10;
    }
}
