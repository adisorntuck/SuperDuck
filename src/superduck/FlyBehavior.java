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
public interface FlyBehavior {
    public void fly();
public class FlyWithwings implements FlyBehavior{

        @Override
        public void fly() {
            System.out.println(" I'm flying!!");
        }
public class FlyNoway implements FlyBehavior{

            @Override
            public void fly() {
                System.out.println("I can't fly ");
            }
    
}
    
}
}
