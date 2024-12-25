package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/ProviderFactory.class */
final class ProviderFactory {
    public static Provider getInstance() {
        try {
            return new StreamProvider();
        } catch (Throwable th2) {
            try {
                return new PullProvider();
            } catch (Throwable th3) {
                return new DocumentProvider();
            }
        }
    }
}
