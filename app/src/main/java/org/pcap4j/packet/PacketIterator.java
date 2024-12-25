package org.pcap4j.packet;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/PacketIterator.class */
public final class PacketIterator implements Iterator<Packet> {
    private Packet next;
    private Packet previous = null;

    public PacketIterator(Packet packet) {
        this.next = packet;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public Packet next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Packet packet = this.next;
        this.previous = packet;
        this.next = packet.getPayload();
        return this.previous;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
