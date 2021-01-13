package q.Server.Request;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.List;

public class Request {

    public Hashtable getQueryParams(String url) {
        Hashtable parameter = new Hashtable();
        List<NameValuePair> params;
        try {
            params = URLEncodedUtils.parse(new URI(url), "UTF-8");
            for (NameValuePair param : params) {
                if (param.getName() != null && param.getValue() != null)
                    parameter.put(param.getName(), param.getValue());
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return parameter;
    }

    public String getQueryParamsPath(String url) {
        String result;
        int i = url.indexOf("?");
        result = url.substring(0, i);
        return result;
    }
}
