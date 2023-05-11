package com.balestech.finance.service.conta;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ContaCorrente extends Conta{

    public ContaCorrente(String agencia, String conta) {
        super(agencia, conta);
    }
}
