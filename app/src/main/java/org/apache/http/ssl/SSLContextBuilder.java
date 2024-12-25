package org.apache.http.ssl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/ssl/SSLContextBuilder.class */
public class SSLContextBuilder {
    public static final String TLS = "TLS";
    private String protocol;
    private Provider provider;
    private SecureRandom secureRandom;
    private String keyManagerFactoryAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
    private String keyStoreType = KeyStore.getDefaultType();
    private String trustManagerFactoryAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
    private final Set<KeyManager> keyManagers = new LinkedHashSet();
    private final Set<TrustManager> trustManagers = new LinkedHashSet();

    /* loaded from: combined.jar:classes3.jar:org/apache/http/ssl/SSLContextBuilder$KeyManagerDelegate.class */
    public static class KeyManagerDelegate extends X509ExtendedKeyManager {
        private final PrivateKeyStrategy aliasStrategy;
        private final X509ExtendedKeyManager keyManager;

        public KeyManagerDelegate(X509ExtendedKeyManager x509ExtendedKeyManager, PrivateKeyStrategy privateKeyStrategy) {
            this.keyManager = x509ExtendedKeyManager;
            this.aliasStrategy = privateKeyStrategy;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return this.aliasStrategy.chooseAlias(getClientAliasMap(strArr, principalArr), socket);
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
            return this.aliasStrategy.chooseAlias(getClientAliasMap(strArr, principalArr), null);
        }

        @Override // javax.net.ssl.X509ExtendedKeyManager
        public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
            return this.aliasStrategy.chooseAlias(getServerAliasMap(str, principalArr), null);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return this.aliasStrategy.chooseAlias(getServerAliasMap(str, principalArr), socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.keyManager.getCertificateChain(str);
        }

        public Map<String, PrivateKeyDetails> getClientAliasMap(String[] strArr, Principal[] principalArr) {
            HashMap hashMap = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.keyManager.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        hashMap.put(str2, new PrivateKeyDetails(str, this.keyManager.getCertificateChain(str2)));
                    }
                }
            }
            return hashMap;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.keyManager.getClientAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.keyManager.getPrivateKey(str);
        }

        public Map<String, PrivateKeyDetails> getServerAliasMap(String str, Principal[] principalArr) {
            HashMap hashMap = new HashMap();
            String[] serverAliases = this.keyManager.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (String str2 : serverAliases) {
                    hashMap.put(str2, new PrivateKeyDetails(str, this.keyManager.getCertificateChain(str2)));
                }
            }
            return hashMap;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.keyManager.getServerAliases(str, principalArr);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/apache/http/ssl/SSLContextBuilder$TrustManagerDelegate.class */
    public static class TrustManagerDelegate implements X509TrustManager {
        private final X509TrustManager trustManager;
        private final TrustStrategy trustStrategy;

        public TrustManagerDelegate(X509TrustManager x509TrustManager, TrustStrategy trustStrategy) {
            this.trustManager = x509TrustManager;
            this.trustStrategy = trustStrategy;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.trustManager.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (this.trustStrategy.isTrusted(x509CertificateArr, str)) {
                return;
            }
            this.trustManager.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.trustManager.getAcceptedIssuers();
        }
    }

    public static SSLContextBuilder create() {
        return new SSLContextBuilder();
    }

    public SSLContext build() {
        String str = this.protocol;
        if (str == null) {
            str = "TLS";
        }
        Provider provider = this.provider;
        SSLContext sSLContext = provider != null ? SSLContext.getInstance(str, provider) : SSLContext.getInstance(str);
        initSSLContext(sSLContext, this.keyManagers, this.trustManagers, this.secureRandom);
        return sSLContext;
    }

    public void initSSLContext(SSLContext sSLContext, Collection<KeyManager> collection, Collection<TrustManager> collection2, SecureRandom secureRandom) {
        TrustManager[] trustManagerArr = null;
        KeyManager[] keyManagerArr = !collection.isEmpty() ? (KeyManager[]) collection.toArray(new KeyManager[collection.size()]) : null;
        if (!collection2.isEmpty()) {
            trustManagerArr = (TrustManager[]) collection2.toArray(new TrustManager[collection2.size()]);
        }
        sSLContext.init(keyManagerArr, trustManagerArr, secureRandom);
    }

    public SSLContextBuilder loadKeyMaterial(File file, char[] cArr, char[] cArr2) {
        return loadKeyMaterial(file, cArr, cArr2, (PrivateKeyStrategy) null);
    }

    public SSLContextBuilder loadKeyMaterial(File file, char[] cArr, char[] cArr2, PrivateKeyStrategy privateKeyStrategy) {
        Args.notNull(file, "Keystore file");
        KeyStore keyStore = KeyStore.getInstance(this.keyStoreType);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            keyStore.load(fileInputStream, cArr);
            fileInputStream.close();
            return loadKeyMaterial(keyStore, cArr2, privateKeyStrategy);
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public SSLContextBuilder loadKeyMaterial(URL url, char[] cArr, char[] cArr2) {
        return loadKeyMaterial(url, cArr, cArr2, (PrivateKeyStrategy) null);
    }

    public SSLContextBuilder loadKeyMaterial(URL url, char[] cArr, char[] cArr2, PrivateKeyStrategy privateKeyStrategy) {
        Args.notNull(url, "Keystore URL");
        KeyStore keyStore = KeyStore.getInstance(this.keyStoreType);
        InputStream openStream = url.openStream();
        try {
            keyStore.load(openStream, cArr);
            openStream.close();
            return loadKeyMaterial(keyStore, cArr2, privateKeyStrategy);
        } catch (Throwable th2) {
            openStream.close();
            throw th2;
        }
    }

    public SSLContextBuilder loadKeyMaterial(KeyStore keyStore, char[] cArr) {
        return loadKeyMaterial(keyStore, cArr, (PrivateKeyStrategy) null);
    }

    public SSLContextBuilder loadKeyMaterial(KeyStore keyStore, char[] cArr, PrivateKeyStrategy privateKeyStrategy) {
        String str = this.keyManagerFactoryAlgorithm;
        String str2 = str;
        if (str == null) {
            str2 = KeyManagerFactory.getDefaultAlgorithm();
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(str2);
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            if (privateKeyStrategy != null) {
                for (int i10 = 0; i10 < keyManagers.length; i10++) {
                    KeyManager keyManager = keyManagers[i10];
                    if (keyManager instanceof X509ExtendedKeyManager) {
                        keyManagers[i10] = new KeyManagerDelegate((X509ExtendedKeyManager) keyManager, privateKeyStrategy);
                    }
                }
            }
            for (KeyManager keyManager2 : keyManagers) {
                this.keyManagers.add(keyManager2);
            }
        }
        return this;
    }

    public SSLContextBuilder loadTrustMaterial(File file) {
        return loadTrustMaterial(file, (char[]) null);
    }

    public SSLContextBuilder loadTrustMaterial(File file, char[] cArr) {
        return loadTrustMaterial(file, cArr, (TrustStrategy) null);
    }

    public SSLContextBuilder loadTrustMaterial(File file, char[] cArr, TrustStrategy trustStrategy) {
        Args.notNull(file, "Truststore file");
        KeyStore keyStore = KeyStore.getInstance(this.keyStoreType);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            keyStore.load(fileInputStream, cArr);
            fileInputStream.close();
            return loadTrustMaterial(keyStore, trustStrategy);
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public SSLContextBuilder loadTrustMaterial(URL url, char[] cArr) {
        return loadTrustMaterial(url, cArr, (TrustStrategy) null);
    }

    public SSLContextBuilder loadTrustMaterial(URL url, char[] cArr, TrustStrategy trustStrategy) {
        Args.notNull(url, "Truststore URL");
        KeyStore keyStore = KeyStore.getInstance(this.keyStoreType);
        InputStream openStream = url.openStream();
        try {
            keyStore.load(openStream, cArr);
            openStream.close();
            return loadTrustMaterial(keyStore, trustStrategy);
        } catch (Throwable th2) {
            openStream.close();
            throw th2;
        }
    }

    public SSLContextBuilder loadTrustMaterial(KeyStore keyStore, TrustStrategy trustStrategy) {
        String str = this.trustManagerFactoryAlgorithm;
        String str2 = str;
        if (str == null) {
            str2 = TrustManagerFactory.getDefaultAlgorithm();
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(str2);
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (trustStrategy != null) {
                for (int i10 = 0; i10 < trustManagers.length; i10++) {
                    TrustManager trustManager = trustManagers[i10];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i10] = new TrustManagerDelegate((X509TrustManager) trustManager, trustStrategy);
                    }
                }
            }
            for (TrustManager trustManager2 : trustManagers) {
                this.trustManagers.add(trustManager2);
            }
        }
        return this;
    }

    public SSLContextBuilder loadTrustMaterial(TrustStrategy trustStrategy) {
        return loadTrustMaterial((KeyStore) null, trustStrategy);
    }

    public SSLContextBuilder setKeyManagerFactoryAlgorithm(String str) {
        this.keyManagerFactoryAlgorithm = str;
        return this;
    }

    public SSLContextBuilder setKeyStoreType(String str) {
        this.keyStoreType = str;
        return this;
    }

    public SSLContextBuilder setProtocol(String str) {
        this.protocol = str;
        return this;
    }

    public SSLContextBuilder setProvider(String str) {
        this.provider = Security.getProvider(str);
        return this;
    }

    public SSLContextBuilder setProvider(Provider provider) {
        this.provider = provider;
        return this;
    }

    public SSLContextBuilder setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }

    public SSLContextBuilder setTrustManagerFactoryAlgorithm(String str) {
        this.trustManagerFactoryAlgorithm = str;
        return this;
    }

    public String toString() {
        return "[provider=" + this.provider + ", protocol=" + this.protocol + ", keyStoreType=" + this.keyStoreType + ", keyManagerFactoryAlgorithm=" + this.keyManagerFactoryAlgorithm + ", keyManagers=" + this.keyManagers + ", trustManagerFactoryAlgorithm=" + this.trustManagerFactoryAlgorithm + ", trustManagers=" + this.trustManagers + ", secureRandom=" + this.secureRandom + "]";
    }

    @Deprecated
    public SSLContextBuilder useProtocol(String str) {
        this.protocol = str;
        return this;
    }
}
