package com.benayatei.exception_handler_example.service;

import com.benayatei.exception_handler_example.entity.Country;


public interface CountryService {
    public Country findOne(Integer uuid);
}
