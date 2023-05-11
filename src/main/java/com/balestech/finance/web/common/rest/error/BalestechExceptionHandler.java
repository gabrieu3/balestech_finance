package com.balestech.finance.web.common.rest.error;

import com.balestech.finance.web.common.dto.BalestechRestResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface BalestechExceptionHandler {

    ResponseEntity<BalestechRestResponseDTO<Object>> handleException(Exception var1, HttpServletRequest var2);

    boolean supports(Exception var1);
}
