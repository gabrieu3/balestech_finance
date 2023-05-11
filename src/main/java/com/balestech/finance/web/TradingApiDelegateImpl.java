package com.balestech.finance.web;

import com.balestech.finance.model.dto.TradingStocksRequest;
import com.balestech.finance.model.dto.TradingStocksResponse;
import com.balestech.finance.rest.TradingApiDelegate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TradingApiDelegateImpl implements TradingApiDelegate {

    @Override
    public ResponseEntity<TradingStocksResponse> insertTrading(TradingStocksRequest tradingStocksRequest) {

        return new ResponseEntity<>(new TradingStocksResponse(), HttpStatus.OK);

    }
}
