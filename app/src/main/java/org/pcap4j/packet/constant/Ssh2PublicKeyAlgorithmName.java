package org.pcap4j.packet.constant;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/constant/Ssh2PublicKeyAlgorithmName.class */
public final class Ssh2PublicKeyAlgorithmName {
    public static final String ECDSA_SHA2_PREFIX = "ecdsa-sha2-";
    public static final String NULL = "null";
    public static final String PGP_SIGN_DSS = "pgp-sign-dss";
    public static final String PGP_SIGN_RSA = "pgp-sign-rsa";
    public static final String SPKI_SIGN_DSS = "spki-sign-dss";
    public static final String SPKI_SIGN_RSA = "spki-sign-rsa";
    public static final String SSH_DSS = "ssh-dss";
    public static final String SSH_RSA = "ssh-rsa";
    public static final String X509V3_ECDSA_SHA2_PREFIX = "x509v3-ecdsa-sha2-";
    public static final String X509V3_RSA2048_SHA256 = "x509v3-rsa2048-sha256";
    public static final String X509V3_SSH_DSS = "x509v3-ssh-dss";
    public static final String X509V3_SSH_RSA = "x509v3-ssh-rsa";

    private Ssh2PublicKeyAlgorithmName() {
        throw new AssertionError();
    }
}
