package Mediator;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Araujo
 */
public class MensagemMediator implements Mediator {
 
    protected ArrayList<Colleague> contatos;
 
    public MensagemMediator() {
        contatos = new ArrayList<Colleague>();
    }
 
    public void adicionarColleague(Colleague colleague) {
        contatos.add(colleague);
    }
 
    @Override
    public void enviar(String mensagem, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }
 
    private void definirProtocolo(Colleague contato) {
        if (contato instanceof BrazilColleague) {
            System.out.println("Protocolo iOS");
        } else if (contato instanceof SpainColleague) {
            System.out.println("Protocolo Android");
        } else if (contato instanceof ChinaColleague) {
            System.out.println("Protocolo Symbian");
        }
    }
 
}
