package org.e38.utils.apis.shortlinks;

import org.e38.utils.apis.HttpException;
import org.e38.utils.apis.RestApi;


public abstract class ShortLinkApi extends RestApi {
    public  String expand(String url){
        return null;//TODO implement default expand via "location" key of header
    }

    public abstract String shorted(String url) throws HttpException;

}
