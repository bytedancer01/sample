package org.minidns;

import java.io.IOException;
import org.minidns.dnsmessage.DnsMessage;
import org.minidns.dnsqueryresult.DnsQueryResult;

/* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsException.class */
public abstract class MiniDnsException extends IOException {
    private static final long serialVersionUID = 1;

    /* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsException$ErrorResponseException.class */
    public static class ErrorResponseException extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;
        private final DnsQueryResult result;

        public ErrorResponseException(DnsMessage dnsMessage, DnsQueryResult dnsQueryResult) {
            super("Received " + dnsQueryResult.response.responseCode + " error response\n" + dnsQueryResult);
            this.request = dnsMessage;
            this.result = dnsQueryResult;
        }

        public DnsMessage getRequest() {
            return this.request;
        }

        public DnsQueryResult getResult() {
            return this.result;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsException$IdMismatch.class */
    public static class IdMismatch extends MiniDnsException {
        public static final boolean $assertionsDisabled = false;
        private static final long serialVersionUID = 1;
        private final DnsMessage request;
        private final DnsMessage response;

        public IdMismatch(DnsMessage dnsMessage, DnsMessage dnsMessage2) {
            super(getString(dnsMessage, dnsMessage2));
            this.request = dnsMessage;
            this.response = dnsMessage2;
        }

        private static String getString(DnsMessage dnsMessage, DnsMessage dnsMessage2) {
            return "The response's ID doesn't matches the request ID. Request: " + dnsMessage.f36211id + ". Response: " + dnsMessage2.f36211id;
        }

        public DnsMessage getRequest() {
            return this.request;
        }

        public DnsMessage getResponse() {
            return this.response;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsException$NoQueryPossibleException.class */
    public static class NoQueryPossibleException extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;

        public NoQueryPossibleException(DnsMessage dnsMessage) {
            super("No DNS server could be queried");
            this.request = dnsMessage;
        }

        public DnsMessage getRequest() {
            return this.request;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/minidns/MiniDnsException$NullResultException.class */
    public static class NullResultException extends MiniDnsException {
        private static final long serialVersionUID = 1;
        private final DnsMessage request;

        public NullResultException(DnsMessage dnsMessage) {
            super("The request yielded a 'null' result while resolving.");
            this.request = dnsMessage;
        }

        public DnsMessage getRequest() {
            return this.request;
        }
    }

    public MiniDnsException(String str) {
        super(str);
    }
}
