package com.balestech.finance.web.common.rest;

import com.balestech.finance.web.common.dto.BalestechRestResponseDTO;
import com.balestech.finance.web.common.rest.error.BalestechGenericExceptionHandler;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BalestechRestController{

    @Autowired
    private BalestechGenericExceptionHandler exceptionHandler;

    @ExceptionHandler({Exception.class})
    public ResponseEntity<BalestechRestResponseDTO<Object>> handle(Exception ex, HttpServletRequest req) {
        return this.exceptionHandler.handleException(ex, req);
    }
}
