package org.minidns.dnslabel;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.slf4j.Marker;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/DnsLabel.class */
public abstract class DnsLabel implements CharSequence, Comparable<DnsLabel> {
    public static final int MAX_LABEL_LENGTH_IN_OCTETS = 63;
    private transient byte[] byteCache;
    private transient String internationalizedRepresentation;
    public final String label;
    private transient DnsLabel lowercasedVariant;
    public static final DnsLabel WILDCARD_LABEL = from(Marker.ANY_MARKER);
    public static boolean VALIDATE = true;

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/DnsLabel$LabelToLongException.class */
    public static class LabelToLongException extends IllegalArgumentException {
        private static final long serialVersionUID = 1;
        public final String label;

        public LabelToLongException(String str) {
            this.label = str;
        }
    }

    public DnsLabel(String str) {
        this.label = str;
        if (VALIDATE) {
            setBytesIfRequired();
            if (this.byteCache.length > 63) {
                throw new LabelToLongException(str);
            }
        }
    }

    public static DnsLabel from(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Label is null or empty");
        }
        return LdhLabel.isLdhLabel(str) ? LdhLabel.fromInternal(str) : NonLdhLabel.fromInternal(str);
    }

    public static DnsLabel[] from(String[] strArr) {
        DnsLabel[] dnsLabelArr = new DnsLabel[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            dnsLabelArr[i10] = from(strArr[i10]);
        }
        return dnsLabelArr;
    }

    public static boolean isIdnAcePrefixed(String str) {
        return str.toLowerCase(Locale.US).startsWith("xn--");
    }

    private void setBytesIfRequired() {
        if (this.byteCache == null) {
            this.byteCache = this.label.getBytes(StandardCharsets.US_ASCII);
        }
    }

    public final DnsLabel asLowercaseVariant() {
        if (this.lowercasedVariant == null) {
            this.lowercasedVariant = from(this.label.toLowerCase(Locale.US));
        }
        return this.lowercasedVariant;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.label.charAt(i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(DnsLabel dnsLabel) {
        return asLowercaseVariant().label.compareTo(dnsLabel.asLowercaseVariant().label);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DnsLabel) {
            return this.label.equals(((DnsLabel) obj).label);
        }
        return false;
    }

    public final String getInternationalizedRepresentation() {
        if (this.internationalizedRepresentation == null) {
            this.internationalizedRepresentation = getInternationalizedRepresentationInternal();
        }
        return this.internationalizedRepresentation;
    }

    public String getInternationalizedRepresentationInternal() {
        return this.label;
    }

    public final String getLabelType() {
        return getClass().getSimpleName();
    }

    public final int hashCode() {
        return this.label.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.label.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.label.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.label;
    }

    public final void writeToBoas(ByteArrayOutputStream byteArrayOutputStream) {
        setBytesIfRequired();
        byteArrayOutputStream.write(this.byteCache.length);
        byte[] bArr = this.byteCache;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }
}
