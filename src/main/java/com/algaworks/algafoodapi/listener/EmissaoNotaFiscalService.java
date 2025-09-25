package com.algaworks.algafoodapi.listener;

import com.algaworks.algafoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    @Order(2)
    public void notaFiscalEmitidaListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo Nota Fiscal para o cliente: " + event.getCliente().getNome());
    }

}
