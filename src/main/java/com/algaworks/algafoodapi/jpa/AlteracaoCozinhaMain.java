package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Cozinha;
import com.algaworks.algafoodapi.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class AlteracaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

        Cozinha cozinha1 = new Cozinha();
        Cozinha cozinha3 = new Cozinha();
        cozinha1.setId(1L);
        cozinha1.setNome("Brasileira");
        cozinha3.setId(3L);
        cozinha3.setNome("Lusitana");

        cozinhaRepository.adicionar(cozinha1);
        cozinhaRepository.adicionar(cozinha3);

        List<Cozinha> cozinhas = cozinhaRepository.listarTodasAsCozinhas();

        for (Cozinha cozinha : cozinhas) {
            System.out.println(cozinha.getNome());
        }

        cozinhaRepository.remover(cozinha3);

        System.out.println("==========================");
        cozinhas = cozinhaRepository.listarTodasAsCozinhas();

        for (Cozinha cozinha : cozinhas) {
            System.out.println(cozinha.getNome());
        }

    }

}
