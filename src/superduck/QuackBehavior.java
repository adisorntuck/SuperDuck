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
public interface QuackBehavior {
    public void quack();
public class Quack implements QuackBehavior{

        @Override
        public void quack() {
            System.out.println("Qauck");
        }
public class MuteQauck implements QuackBehavior{

            @Override
            public void quack() {
                System.out.println("<< silence >>");
            }
public class Squeak implements QuackBehavior{

                @Override
                public void quack() {
                    System.out.println("Squeak");
                }
    
}
    
}
    
}
}
