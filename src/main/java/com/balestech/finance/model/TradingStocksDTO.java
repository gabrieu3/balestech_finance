package com.balestech.finance.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class TradingStocksDTO {
    private UUID id;
    private LocalDate date;
    private String codeStock;
    private BigDecimal value;

}
