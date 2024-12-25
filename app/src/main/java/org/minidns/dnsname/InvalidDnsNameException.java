package org.minidns.dnsname;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnsname/InvalidDnsNameException.class */
public abstract class InvalidDnsNameException extends IllegalStateException {
    private static final long serialVersionUID = 1;
    public final String ace;

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsname/InvalidDnsNameException$DNSNameTooLongException.class */
    public static class DNSNameTooLongException extends InvalidDnsNameException {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public DNSNameTooLongException(String str, byte[] bArr) {
            super(str);
            this.bytes = bArr;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "The DNS name '" + this.ace + "' exceeds the maximum name length of 255 octets by " + (this.bytes.length - 255) + " octets.";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/dnsname/InvalidDnsNameException$LabelTooLongException.class */
    public static class LabelTooLongException extends InvalidDnsNameException {
        private static final long serialVersionUID = 1;
        private final String label;

        public LabelTooLongException(String str, String str2) {
            super(str);
            this.label = str2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "The DNS name '" + this.ace + "' contains the label '" + this.label + "' which exceeds the maximum label length of 63 octets by " + (this.label.length() - 63) + " octets.";
        }
    }

    public InvalidDnsNameException(String str) {
        this.ace = str;
    }
}
