/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superduck;

/**
 *
 * @author PC220557
 */
public class SuperDuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
    
}
