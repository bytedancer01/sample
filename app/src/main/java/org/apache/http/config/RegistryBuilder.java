package org.apache.http.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/config/RegistryBuilder.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/config/RegistryBuilder.class */
public final class RegistryBuilder<I> {
    private final Map<String, I> items = new HashMap();

    public static <I> RegistryBuilder<I> create() {
        return new RegistryBuilder<>();
    }

    public Registry<I> build() {
        return new Registry<>(this.items);
    }

    public RegistryBuilder<I> register(String str, I i10) {
        Args.notEmpty(str, "ID");
        Args.notNull(i10, "Item");
        this.items.put(str.toLowerCase(Locale.ROOT), i10);
        return this;
    }

    public String toString() {
        return this.items.toString();
    }
}
