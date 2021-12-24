package com.benayatei.exception_handler_example.controller;

import com.benayatei.exception_handler_example.entity.Country;
import com.benayatei.exception_handler_example.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "countries")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/{id}")
    public ResponseEntity<Country> get(@PathVariable Integer id) {
        var result = countryService.findOne(id);
        return ResponseEntity.ok().body(result);
    }
}
