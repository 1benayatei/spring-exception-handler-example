package com.benayatei.exception_handler_example.exception.abtract;

public abstract class AbstractBadRequestException extends AbstractException {
    @Override
    public int getCode() {
        return 400;
    }
}
