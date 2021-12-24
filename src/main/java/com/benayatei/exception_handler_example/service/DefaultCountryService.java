package com.benayatei.exception_handler_example.service;

import com.benayatei.exception_handler_example.entity.Country;
import com.benayatei.exception_handler_example.repository.CountryRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DefaultCountryService implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public Country findOne(Integer id) {
        return this.countryRepository.findById(id).get();
    }
}
