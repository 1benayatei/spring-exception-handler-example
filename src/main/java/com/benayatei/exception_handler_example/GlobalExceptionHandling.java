package com.benayatei.exception_handler_example;

import com.benayatei.exception_handler_example.dto.ErrorDto;
import com.benayatei.exception_handler_example.exception.abtract.AbstractException;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandling {

    private final MessageSourceAccessor messageSourceAccessor;

    @ExceptionHandler(AbstractException.class)
    ResponseEntity<ErrorDto> handleAbstractExceptions(AbstractException e) {
        var status = e.getStatus();
        var message = messageSourceAccessor.getMessage(status);
        var error = new ErrorDto(message, status, e.getCode());

        var httpStatus = HttpStatus.valueOf(e.getCode());

        return ResponseEntity.status(httpStatus).body(error);
    }

}
