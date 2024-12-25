package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/SessionManager.class */
class SessionManager {
    private ThreadLocal<Reference> local = new ThreadLocal<>();

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/SessionManager$Reference.class */
    public static class Reference {
        private int count;
        private Session session;

        public Reference(boolean z10) {
            this.session = new Session(z10);
        }

        public int clear() {
            int i10 = this.count - 1;
            this.count = i10;
            return i10;
        }

        public Session get() {
            int i10 = this.count;
            if (i10 >= 0) {
                this.count = i10 + 1;
            }
            return this.session;
        }
    }

    private Session create(boolean z10) {
        Reference reference = new Reference(z10);
        this.local.set(reference);
        return reference.get();
    }

    public void close() {
        Reference reference = this.local.get();
        if (reference == null) {
            throw new PersistenceException("Session does not exist", new Object[0]);
        }
        if (reference.clear() == 0) {
            this.local.remove();
        }
    }

    public Session open() {
        return open(true);
    }

    public Session open(boolean z10) {
        Reference reference = this.local.get();
        return reference != null ? reference.get() : create(z10);
    }
}
