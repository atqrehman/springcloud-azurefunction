package io.jaylee.springcloud.model;

import lombok.*;

public class ApiDTO {
    RequestMethod requestMethod;
    String apiURL;
    String apiParams;
    String bodyJSON;
    String executionTime;

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getApiURL() {
        return apiURL;
    }

    public void setApiURL(String apiURL) {
        this.apiURL = apiURL;
    }

    public String getApiParams() {
        return apiParams;
    }

    public void setApiParams(String apiParams) {
        this.apiParams = apiParams;
    }

    public String getBodyJSON() {
        return bodyJSON;
    }

    public void setBodyJSON(String bodyJSON) {
        this.bodyJSON = bodyJSON;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return "ApiDTO{" +
                "requestMethod=" + requestMethod +
                ", apiURL='" + apiURL + '\'' +
                ", apiParams='" + apiParams + '\'' +
                ", bodyJSON='" + bodyJSON + '\'' +
                ", executionTime='" + executionTime + '\'' +
                '}';
    }
}
