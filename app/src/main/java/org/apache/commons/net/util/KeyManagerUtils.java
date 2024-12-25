package org.apache.commons.net.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509ExtendedKeyManager;
import org.apache.commons.net.p255io.Util;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/KeyManagerUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/KeyManagerUtils.class */
public final class KeyManagerUtils {
    private static final String DEFAULT_STORE_TYPE = KeyStore.getDefaultType();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/util/KeyManagerUtils$ClientKeyStore.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/KeyManagerUtils$ClientKeyStore.class */
    public static class ClientKeyStore {
        private final X509Certificate[] certChain;
        private final PrivateKey key;
        private final String keyAlias;

        public ClientKeyStore(KeyStore keyStore, String str, String str2) {
            this.keyAlias = str;
            this.key = (PrivateKey) keyStore.getKey(str, str2.toCharArray());
            Certificate[] certificateChain = keyStore.getCertificateChain(str);
            X509Certificate[] x509CertificateArr = new X509Certificate[certificateChain.length];
            for (int i10 = 0; i10 < certificateChain.length; i10++) {
                x509CertificateArr[i10] = (X509Certificate) certificateChain[i10];
            }
            this.certChain = x509CertificateArr;
        }

        public final String getAlias() {
            return this.keyAlias;
        }

        public final X509Certificate[] getCertificateChain() {
            return this.certChain;
        }

        public final PrivateKey getPrivateKey() {
            return this.key;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/util/KeyManagerUtils$X509KeyManager.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/KeyManagerUtils$X509KeyManager.class */
    public static class X509KeyManager extends X509ExtendedKeyManager {
        private final ClientKeyStore keyStore;

        public X509KeyManager(ClientKeyStore clientKeyStore) {
            this.keyStore = clientKeyStore;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return this.keyStore.getAlias();
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.keyStore.getCertificateChain();
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return new String[]{this.keyStore.getAlias()};
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.keyStore.getPrivateKey();
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return null;
        }
    }

    private KeyManagerUtils() {
    }

    public static KeyManager createClientKeyManager(File file, String str) {
        return createClientKeyManager(DEFAULT_STORE_TYPE, file, str, null, str);
    }

    public static KeyManager createClientKeyManager(File file, String str, String str2) {
        return createClientKeyManager(DEFAULT_STORE_TYPE, file, str, str2, str);
    }

    public static KeyManager createClientKeyManager(String str, File file, String str2, String str3, String str4) {
        return createClientKeyManager(loadStore(str, file, str2), str3, str4);
    }

    public static KeyManager createClientKeyManager(KeyStore keyStore, String str, String str2) {
        if (str == null) {
            str = findAlias(keyStore);
        }
        return new X509KeyManager(new ClientKeyStore(keyStore, str, str2));
    }

    private static String findAlias(KeyStore keyStore) {
        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            if (keyStore.isKeyEntry(nextElement)) {
                return nextElement;
            }
        }
        throw new KeyStoreException("Cannot find a private key entry");
    }

    private static KeyStore loadStore(String str, File file, String str2) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        KeyStore keyStore = KeyStore.getInstance(str);
        try {
            fileInputStream2 = new FileInputStream(file);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            keyStore.load(fileInputStream2, str2.toCharArray());
            Util.closeQuietly(fileInputStream2);
            return keyStore;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = fileInputStream2;
            Util.closeQuietly(fileInputStream);
            throw th;
        }
    }
}
