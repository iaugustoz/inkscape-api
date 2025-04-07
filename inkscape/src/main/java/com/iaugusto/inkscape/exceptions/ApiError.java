package com.iaugusto.inkscape.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * Modelo padrão para exceptions fornecendo "feedback" compreensível do erro.
 *
 * @author Igor A. Santana
 * @version 1.2.0
 * @since Mar 30, 2025
 */
@Builder
public record ApiError(
        @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime timestamp,

        Integer code,

        String status,

        List<String> errors
) {}
