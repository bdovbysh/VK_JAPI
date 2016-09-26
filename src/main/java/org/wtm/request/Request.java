package org.wtm.request;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wtm.exceptions.RequestException;

import java.net.URL;


/**
 * Created by dovbysh on 08.08.14.
 */
public class Request {

    private final static Logger log = LoggerFactory.getLogger(Request.class);

    private final String apiURI;
    private final String apiVersion;
    private final String token;
    private String methodName;
    private StringBuilder queryParams;

    public Request(String token, String apiVersion, String apiURI) {
        this.apiURI = apiURI;
        this.apiVersion = apiVersion;
        this.token = token;
    }

    //TODO make methodName and queryParameters required
    // logging for query
    private String getQuery() {
        StringBuilder query = new StringBuilder(apiURI).
                append(methodName).append("?")
                .append(queryParams)
                .append("&access_token=")
                .append(token)
                .append("&v=").append(apiVersion);
        return query.toString();
    }

    /**
     * Add parameter to query with key & value separately
     *
     * @param key
     * @param value
     * @return
     */
    public Request addParameter(String key, Object value) {
        if (queryParams == null){
            queryParams = new StringBuilder();
        }
        queryParams.append("&").append(key).append("=").append(value);
        return this;
    }


    public String makeRequest() throws RequestException {
        try {
            String request = getQuery();
            log.info("Request was {}", request);
            return IOUtils.toString(new URL(request));
        } catch (Exception e) {
            throw new RequestException(e);
        }
    }

    public Request setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
}
