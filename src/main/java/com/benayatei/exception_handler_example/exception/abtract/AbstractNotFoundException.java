package com.benayatei.exception_handler_example.exception.abtract;

public abstract class AbstractNotFoundException extends AbstractException {
    @Override
    public int getCode() {
        return 404;
    }
}
