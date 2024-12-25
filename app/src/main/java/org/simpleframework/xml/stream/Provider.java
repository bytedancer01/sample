package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Provider.class */
interface Provider {
    EventReader provide(InputStream inputStream);

    EventReader provide(Reader reader);
}
