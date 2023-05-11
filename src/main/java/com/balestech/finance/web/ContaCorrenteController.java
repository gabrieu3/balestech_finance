package com.balestech.finance.web;

import com.balestech.finance.web.common.dto.BalestechRestResponseDTO;
import com.balestech.finance.web.common.rest.BalestechRestController;
import com.balestech.finance.service.conta.ContaCorrente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("apis/v1")
public class ContaCorrenteController extends BalestechRestController {

    @GetMapping("contas/{id}")
    public ResponseEntity<BalestechRestResponseDTO> getContas(@PathVariable("id") Integer id){
        List contas = new ArrayList();
        ContaCorrente cc = new ContaCorrente("1","126457");
        contas.add(cc);

        if(id.equals(2))
            throw new RuntimeException("Teste Gabriel");

        return ResponseEntity.ok(new BalestechRestResponseDTO(contas, null));

    }

}
