package org.simpleframework.xml.strategy;

import org.simpleframework.xml.util.WeakCache;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/WriteState.class */
class WriteState extends WeakCache<WriteGraph> {
    private Contract contract;

    public WriteState(Contract contract) {
        this.contract = contract;
    }

    public WriteGraph find(Object obj) {
        WriteGraph fetch = fetch(obj);
        WriteGraph writeGraph = fetch;
        if (fetch == null) {
            writeGraph = new WriteGraph(this.contract);
            cache(obj, writeGraph);
        }
        return writeGraph;
    }
}
