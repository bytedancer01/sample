package org.pcap4j.packet;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.pcap4j.packet.Packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/BuilderIterator.class */
public final class BuilderIterator implements Iterator<Packet.Builder> {
    private Packet.Builder next;
    private Packet.Builder previous = null;

    public BuilderIterator(Packet.Builder builder) {
        this.next = builder;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public Packet.Builder next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Packet.Builder builder = this.next;
        this.previous = builder;
        this.next = builder.getPayloadBuilder();
        return this.previous;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
