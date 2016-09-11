package org.e38.utils.apis;

import java.net.URL;

/**
 * Created by sergi on 9/9/16.
 */
public class UrlUtils {

    public static boolean isUrlRedirected(String url) {
        return true;
    }

    public static boolean isUrlRedirected(URL url) {
        return true;
    }

    public static URL getRedirectionLink(String url) {
        throw new RuntimeException("not impl");
    }


    public static void throwForHttpStatus(int httpStatus) throws HttpException {
        if (httpStatus >=400 ) throw new HttpException();
    }
}
