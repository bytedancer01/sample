package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/DocumentProvider.class */
class DocumentProvider implements Provider {
    private final DocumentBuilderFactory factory;

    public DocumentProvider() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.factory = newInstance;
        newInstance.setNamespaceAware(true);
    }

    private EventReader provide(InputSource inputSource) {
        return new DocumentReader(this.factory.newDocumentBuilder().parse(inputSource));
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) {
        return provide(new InputSource(inputStream));
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) {
        return provide(new InputSource(reader));
    }
}
