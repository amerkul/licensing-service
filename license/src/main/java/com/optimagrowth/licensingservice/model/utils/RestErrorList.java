package com.optimagrowth.licensingservice.model.utils;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class RestErrorList extends ArrayList<ErrorMessage> {

    private static final long serialVersionUID = -721424777198115589L;
    private HttpStatus status;

    public RestErrorList(HttpStatus status, ErrorMessage... errors) {
        super();
        this.status = status;
        addAll(asList(errors));
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
