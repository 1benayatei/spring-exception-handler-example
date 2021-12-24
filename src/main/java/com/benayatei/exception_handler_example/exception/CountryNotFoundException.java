package com.benayatei.exception_handler_example.exception;

import com.benayatei.exception_handler_example.exception.abtract.AbstractNotFoundException;

public class CountryNotFoundException extends AbstractNotFoundException {
    @Override
    public String getStatus() {
        return "COUNTRY_NOT_FOUND";
    }
}
