package com.benayatei.exception_handler_example.config;

import com.benayatei.exception_handler_example.ExceptionHandlerExampleApplication;
import com.benayatei.exception_handler_example.repository.CountryRepository;
import com.benayatei.exception_handler_example.service.CountryService;
import com.benayatei.exception_handler_example.service.DefaultCountryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ExceptionHandlerExampleApplication.class)
public class ServiceProvider {
    @Bean
    public CountryService countryService(final CountryRepository countryRepository) {
        return new DefaultCountryService(countryRepository);
    }
}
