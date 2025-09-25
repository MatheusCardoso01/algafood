package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import com.algaworks.algafoodapi.di.notificacao.TipoDeNotificador;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class AtivacaoClienteService implements Ativacao {

    @TipoDeNotificador(NivelUrgencia.PADRAO)
    @Autowired
    private Notificador notificador;

    //PostConstruct
    public void init(){
        System.out.println("INIT");
    }

    //@PreDestroy
    public void destroy() {
        System.out.println("DESTROY");
    }

    @Override
    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
