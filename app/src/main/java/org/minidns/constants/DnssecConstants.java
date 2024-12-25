package org.minidns.constants;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: combined.jar:classes3.jar:org/minidns/constants/DnssecConstants.class */
public final class DnssecConstants {
    private static final Map<Byte, SignatureAlgorithm> SIGNATURE_ALGORITHM_LUT = new HashMap();
    private static final Map<Byte, DigestAlgorithm> DELEGATION_DIGEST_LUT = new HashMap();

    /* loaded from: combined.jar:classes3.jar:org/minidns/constants/DnssecConstants$DigestAlgorithm.class */
    public enum DigestAlgorithm {
        SHA1(1, MessageDigestAlgorithms.SHA_1),
        SHA256(2, MessageDigestAlgorithms.SHA_256),
        GOST(3, "GOST R 34.11-94"),
        SHA384(4, MessageDigestAlgorithms.SHA_384);

        public final String description;
        public final byte value;

        DigestAlgorithm(int i10, String str) {
            if (i10 < 0 || i10 > 255) {
                throw new IllegalArgumentException();
            }
            byte b10 = (byte) i10;
            this.value = b10;
            this.description = str;
            DnssecConstants.DELEGATION_DIGEST_LUT.put(Byte.valueOf(b10), this);
        }

        public static DigestAlgorithm forByte(byte b10) {
            return (DigestAlgorithm) DnssecConstants.DELEGATION_DIGEST_LUT.get(Byte.valueOf(b10));
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/constants/DnssecConstants$SignatureAlgorithm.class */
    public enum SignatureAlgorithm {
        RSAMD5(1, "RSA/MD5"),
        DH(2, "Diffie-Hellman"),
        DSA(3, "DSA/SHA1"),
        RSASHA1(5, "RSA/SHA-1"),
        DSA_NSEC3_SHA1(6, "DSA_NSEC3-SHA1"),
        RSASHA1_NSEC3_SHA1(7, "RSASHA1-NSEC3-SHA1"),
        RSASHA256(8, "RSA/SHA-256"),
        RSASHA512(10, "RSA/SHA-512"),
        ECC_GOST(12, "GOST R 34.10-2001"),
        ECDSAP256SHA256(13, "ECDSA Curve P-256 with SHA-256"),
        ECDSAP384SHA384(14, "ECDSA Curve P-384 with SHA-384"),
        INDIRECT(TelnetCommand.WONT, "Reserved for Indirect Keys"),
        PRIVATEDNS(TelnetCommand.f36137DO, "private algorithm"),
        PRIVATEOID(TelnetCommand.DONT, "private algorithm oid");

        public final String description;
        public final byte number;

        SignatureAlgorithm(int i10, String str) {
            if (i10 < 0 || i10 > 255) {
                throw new IllegalArgumentException();
            }
            byte b10 = (byte) i10;
            this.number = b10;
            this.description = str;
            DnssecConstants.SIGNATURE_ALGORITHM_LUT.put(Byte.valueOf(b10), this);
        }

        public static SignatureAlgorithm forByte(byte b10) {
            return (SignatureAlgorithm) DnssecConstants.SIGNATURE_ALGORITHM_LUT.get(Byte.valueOf(b10));
        }
    }

    private DnssecConstants() {
    }
}
