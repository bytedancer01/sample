package org.apache.http.client.utils;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/URIUtils.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/URIUtils.class */
public class URIUtils {
    private URIUtils() {
    }

    @Deprecated
    public static URI createURI(String str, String str2, int i10, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            }
            sb2.append(str2);
            if (i10 > 0) {
                sb2.append(':');
                sb2.append(i10);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb2.append('/');
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append('?');
            sb2.append(str4);
        }
        if (str5 != null) {
            sb2.append('#');
            sb2.append(str5);
        }
        return new URI(sb2.toString());
    }

    public static HttpHost extractHost(URI uri) {
        if (uri == null) {
            return null;
        }
        HttpHost httpHost = null;
        if (uri.isAbsolute()) {
            int port = uri.getPort();
            String host = uri.getHost();
            int i10 = port;
            String str = host;
            if (host == null) {
                String authority = uri.getAuthority();
                i10 = port;
                str = authority;
                if (authority != null) {
                    int indexOf = authority.indexOf(64);
                    String str2 = authority;
                    if (indexOf >= 0) {
                        int i11 = indexOf + 1;
                        str2 = authority.length() > i11 ? authority.substring(i11) : null;
                    }
                    i10 = port;
                    str = str2;
                    if (str2 != null) {
                        int indexOf2 = str2.indexOf(58);
                        i10 = port;
                        str = str2;
                        if (indexOf2 >= 0) {
                            int i12 = indexOf2 + 1;
                            int i13 = 0;
                            for (int i14 = i12; i14 < str2.length() && Character.isDigit(str2.charAt(i14)); i14++) {
                                i13++;
                            }
                            i10 = port;
                            if (i13 > 0) {
                                try {
                                    i10 = Integer.parseInt(str2.substring(i12, i13 + i12));
                                } catch (NumberFormatException e10) {
                                    i10 = port;
                                }
                            }
                            str = str2.substring(0, indexOf2);
                        }
                    }
                }
            }
            String scheme = uri.getScheme();
            httpHost = null;
            if (!TextUtils.isBlank(str)) {
                try {
                    httpHost = new HttpHost(str, i10, scheme);
                } catch (IllegalArgumentException e11) {
                    httpHost = null;
                }
            }
        }
        return httpHost;
    }

    public static URI normalizeSyntax(URI uri) {
        URI uri2 = uri;
        if (!uri.isOpaque()) {
            if (uri.getAuthority() == null) {
                uri2 = uri;
            } else {
                Args.check(uri.isAbsolute(), "Base URI must be absolute");
                URIBuilder uRIBuilder = new URIBuilder(uri);
                String path = uRIBuilder.getPath();
                if (path != null && !path.equals("/")) {
                    String[] split = path.split("/");
                    Stack stack = new Stack();
                    for (String str : split) {
                        if (!str.isEmpty() && !InstructionFileId.DOT.equals(str)) {
                            if (!"..".equals(str)) {
                                stack.push(str);
                            } else if (!stack.isEmpty()) {
                                stack.pop();
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = stack.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        sb2.append('/');
                        sb2.append(str2);
                    }
                    if (path.lastIndexOf(47) == path.length() - 1) {
                        sb2.append('/');
                    }
                    uRIBuilder.setPath(sb2.toString());
                }
                if (uRIBuilder.getScheme() != null) {
                    uRIBuilder.setScheme(uRIBuilder.getScheme().toLowerCase(Locale.ROOT));
                }
                if (uRIBuilder.getHost() != null) {
                    uRIBuilder.setHost(uRIBuilder.getHost().toLowerCase(Locale.ROOT));
                }
                uri2 = uRIBuilder.build();
            }
        }
        return uri2;
    }

    public static URI resolve(URI uri, String str) {
        return resolve(uri, URI.create(str));
    }

    public static URI resolve(URI uri, URI uri2) {
        URI resolve;
        Args.notNull(uri, "Base URI");
        Args.notNull(uri2, "Reference URI");
        String aSCIIString = uri2.toASCIIString();
        if (!aSCIIString.startsWith("?")) {
            if (aSCIIString.isEmpty()) {
                String aSCIIString2 = uri.resolve(URI.create(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)).toASCIIString();
                resolve = URI.create(aSCIIString2.substring(0, aSCIIString2.indexOf(35)));
            } else {
                resolve = uri.resolve(uri2);
            }
            try {
                return normalizeSyntax(resolve);
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        String aSCIIString3 = uri.toASCIIString();
        int indexOf = aSCIIString3.indexOf(63);
        String str = aSCIIString3;
        if (indexOf > -1) {
            str = aSCIIString3.substring(0, indexOf);
        }
        return URI.create(str + aSCIIString);
    }

    public static URI resolve(URI uri, HttpHost httpHost, List<URI> list) {
        URIBuilder uRIBuilder;
        Args.notNull(uri, "Request URI");
        if (list == null || list.isEmpty()) {
            uRIBuilder = new URIBuilder(uri);
        } else {
            URIBuilder uRIBuilder2 = new URIBuilder(list.get(list.size() - 1));
            String fragment = uRIBuilder2.getFragment();
            for (int size = list.size() - 1; fragment == null && size >= 0; size--) {
                fragment = list.get(size).getFragment();
            }
            uRIBuilder2.setFragment(fragment);
            uRIBuilder = uRIBuilder2;
        }
        if (uRIBuilder.getFragment() == null) {
            uRIBuilder.setFragment(uri.getFragment());
        }
        if (httpHost != null && !uRIBuilder.isAbsolute()) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            uRIBuilder.setPort(httpHost.getPort());
        }
        return uRIBuilder.build();
    }

    public static URI rewriteURI(URI uri) {
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (uRIBuilder.getUserInfo() != null) {
            uRIBuilder.setUserInfo(null);
        }
        if (TextUtils.isEmpty(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        if (uRIBuilder.getHost() != null) {
            uRIBuilder.setHost(uRIBuilder.getHost().toLowerCase(Locale.ROOT));
        }
        uRIBuilder.setFragment(null);
        return uRIBuilder.build();
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost) {
        return rewriteURI(uri, httpHost, false);
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost, boolean z10) {
        int i10;
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (httpHost != null) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            i10 = httpHost.getPort();
        } else {
            uRIBuilder.setScheme(null);
            uRIBuilder.setHost(null);
            i10 = -1;
        }
        uRIBuilder.setPort(i10);
        if (z10) {
            uRIBuilder.setFragment(null);
        }
        if (TextUtils.isEmpty(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        return uRIBuilder.build();
    }

    public static URI rewriteURIForRoute(URI uri, RouteInfo routeInfo) {
        if (uri == null) {
            return null;
        }
        return (routeInfo.getProxyHost() == null || routeInfo.isTunnelled()) ? uri.isAbsolute() ? rewriteURI(uri, null, true) : rewriteURI(uri) : !uri.isAbsolute() ? rewriteURI(uri, routeInfo.getTargetHost(), true) : rewriteURI(uri);
    }
}
