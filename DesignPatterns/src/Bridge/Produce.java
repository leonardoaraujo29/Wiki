package Bridge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Araujo
 */
public class Produce implements Workshop {

    @Override
    public void work() {
            System.out.print("Produced");
    }

}
