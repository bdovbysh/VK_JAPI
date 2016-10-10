package org.wtm.response;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;

/**
 * Created by dovbysh on 10/4/2016.
 */
public class ErrorResponse {

    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("error", error)
                .toString();
    }


    public class Error {

        @SerializedName("error_code")
        private int errorCode;
        @SerializedName("error_msg")
        private String errorMsg;
        @SerializedName("request_params")
        private List<SimpleEntry<String,String>> requestParams;
        @SerializedName("captcha_sid")
        private String captchaSid;
        @SerializedName("captcha_img")
        private String captchaImg;

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public List<SimpleEntry<String, String>> getRequestParams() {
            return requestParams;
        }

        public void setRequestParams(List<SimpleEntry<String, String>> requestParams) {
            this.requestParams = requestParams;
        }

        public String getCaptchaSid() {
            return captchaSid;
        }

        public void setCaptchaSid(String captchaSid) {
            this.captchaSid = captchaSid;
        }

        public String getCaptchaImg() {
            return captchaImg;
        }

        public void setCaptchaImg(String captchaImg) {
            this.captchaImg = captchaImg;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("errorCode", errorCode)
                    .append("errorMsg", errorMsg)
                .append("requestParams", requestParams)
                    .append("captchaSid", captchaSid)
                    .append("captchaImg", captchaImg)
                    .toString();
        }
    }


}
