package com.benayatei.exception_handler_example.exception.abtract;

public abstract class AbstractException extends RuntimeException {
    public abstract String getStatus();

    public abstract int getCode();
}
