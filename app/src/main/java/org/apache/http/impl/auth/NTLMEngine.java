package org.apache.http.impl.auth;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/NTLMEngine.class */
public interface NTLMEngine {
    String generateType1Msg(String str, String str2);

    String generateType3Msg(String str, String str2, String str3, String str4, String str5);
}
