package org.icode.msp.api_gateway.dto;

import java.util.List;
import java.util.Map;

public class Logger {
    private String path;
    private Map<String, String[]> params;
    private String content;
    private String token;

    public Logger() {
    }

    public Logger(String path, Map<String, String[]> params, String content, String token) {
        this.path = path;
        this.params = params;
        this.content = content;
        this.token = token;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String[]> getParams() {
        return params;
    }

    public void setParams(Map<String, String[]> params) {
        this.params = params;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "{" +
                "path='" + path + '\'' +
                ", params=" + params +
                ", content='" + content + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}