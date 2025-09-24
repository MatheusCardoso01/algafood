package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.service.Ativacao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private Ativacao atividacaoService;

    public MeuPrimeiroController(Ativacao atividacaoService) {
        this.atividacaoService = atividacaoService;

        System.out.println("MeuPrimeiroController: " + this.atividacaoService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        Cliente joao = new Cliente("João","joao@email.com","11998556633");

        atividacaoService.ativar(joao);

        return "Olá meu Senhor Jesus!!!";
    }
}
