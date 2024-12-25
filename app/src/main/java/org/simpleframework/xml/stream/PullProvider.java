package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/PullProvider.class */
class PullProvider implements Provider {
    private final XmlPullParserFactory factory;

    public PullProvider() {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        this.factory = newInstance;
        newInstance.setNamespaceAware(true);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) {
        XmlPullParser newPullParser = this.factory.newPullParser();
        if (inputStream != null) {
            newPullParser.setInput(inputStream, null);
        }
        return new PullReader(newPullParser);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) {
        XmlPullParser newPullParser = this.factory.newPullParser();
        if (reader != null) {
            newPullParser.setInput(reader);
        }
        return new PullReader(newPullParser);
    }
}
