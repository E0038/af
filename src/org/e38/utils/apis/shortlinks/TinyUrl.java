package org.e38.utils.apis.shortlinks;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.MultipartBody;
import org.e38.utils.apis.HttpException;


/**
 * Created by sergi on 9/9/16.
 */
public class TinyUrl extends ShortLinkApi {

    @Override
    public String shorted(String url) throws HttpException {
//todo error handling
        MultipartBody request = Unirest.post("http://tinyurl.com/api-create.php").field("url", url);
        HttpResponse<String> response = null;
        try {
            response = request.asString();
        } catch (UnirestException e) {
            throw new HttpException();
        }
        return response.getBody();
    }
}
