package org.pcap4j.packet.namednumber;

import java.io.Serializable;
import java.lang.Number;
import org.pcap4j.packet.namednumber.NamedNumber;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/namednumber/NamedNumber.class */
public abstract class NamedNumber<T extends Number, U extends NamedNumber<T, ?>> implements Comparable<U>, Serializable {
    private static final long serialVersionUID = 3858426889927624965L;
    private final String name;
    private final T value;

    public NamedNumber(T t10, String str) {
        if (t10 == null) {
            throw new IllegalArgumentException("value is null.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name is null.");
        }
        this.value = t10;
        this.name = str;
    }

    @Override // java.lang.Comparable
    public abstract int compareTo(U u10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamedNumber namedNumber = (NamedNumber) obj;
        return this.name.equals(namedNumber.name) && this.value.equals(namedNumber.value);
    }

    public int hashCode() {
        return ((this.name.hashCode() + 31) * 31) + this.value.hashCode();
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append(valueAsString());
        sb2.append(" (");
        sb2.append(this.name);
        sb2.append(")");
        return sb2.toString();
    }

    public T value() {
        return this.value;
    }

    public String valueAsString() {
        return this.value.toString();
    }
}
