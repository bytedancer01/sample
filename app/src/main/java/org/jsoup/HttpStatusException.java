package org.jsoup;

import java.io.IOException;

/* loaded from: combined.jar:classes3.jar:org/jsoup/HttpStatusException.class */
public class HttpStatusException extends IOException {
    private int statusCode;
    private String url;

    public HttpStatusException(String str, int i10, String str2) {
        super(str);
        this.statusCode = i10;
        this.url = str2;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Status=" + this.statusCode + ", URL=" + this.url;
    }
}
