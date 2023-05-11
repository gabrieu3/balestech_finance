package com.balestech.finance.service.conta;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta {
    protected String agencia;
    protected String conta;

    public String getNumeroContaFormatado(){
        return StringUtils.leftPad(agencia.trim(),InfoConta.AGENCIA_SIZE.getSize(),"0")
                .concat(StringUtils.leftPad(conta.trim(),InfoConta.CONTA_SIZE.getSize(),"0"));
    }
}
