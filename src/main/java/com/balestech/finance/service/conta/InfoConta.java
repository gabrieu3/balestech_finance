package com.balestech.finance.service.conta;

public enum InfoConta {
    AGENCIA_SIZE(4),
    CONTA_SIZE(7);

    private Integer size;

    private InfoConta(Integer size){
        this.size = size;
    }

    public Integer getSize(){
        return this.size;
    }

}
