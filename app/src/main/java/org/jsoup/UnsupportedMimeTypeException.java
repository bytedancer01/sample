package org.jsoup;

import java.io.IOException;

/* loaded from: combined.jar:classes3.jar:org/jsoup/UnsupportedMimeTypeException.class */
public class UnsupportedMimeTypeException extends IOException {
    private String mimeType;
    private String url;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.mimeType = str2;
        this.url = str3;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getUrl() {
        return this.url;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.mimeType + ", URL=" + this.url;
    }
}
