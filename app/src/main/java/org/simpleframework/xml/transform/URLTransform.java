package org.simpleframework.xml.transform;

import java.net.URL;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/URLTransform.class */
class URLTransform implements Transform<URL> {
    @Override // org.simpleframework.xml.transform.Transform
    public URL read(String str) {
        return new URL(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(URL url) {
        return url.toString();
    }
}
