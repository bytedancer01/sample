package org.pcap4j.packet.constant;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/constant/Ssh2MacAlgorithmName.class */
public final class Ssh2MacAlgorithmName {
    public static final String AEAD_AES_128_GCM = "AEAD_AES_128_GCM";
    public static final String AEAD_AES_256_GCM = "AEAD_AES_256_GCM";
    public static final String HMAC_MD5 = "hmac-md5";
    public static final String HMAC_MD5_96 = "hmac-md5-96";
    public static final String HMAC_SHA1 = "hmac-sha1";
    public static final String HMAC_SHA1_96 = "hmac-sha1-96";
    public static final String HMAC_SHA2_256 = "hmac-sha2-256";
    public static final String HMAC_SHA2_512 = "hmac-sha2-512";
    public static final String NONE = "none";

    private Ssh2MacAlgorithmName() {
        throw new AssertionError();
    }
}
