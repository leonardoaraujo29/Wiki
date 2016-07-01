package Mediator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Araujo
 */
public class BrazilColleague extends Colleague {
 
    public BrazilColleague(Mediator m) {
        super(m);
    }
 
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Brazil recebeu: " + mensagem);
    }
}