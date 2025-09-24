package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

}
