/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superduck;

import superduck.QuackBehavior.Quack;

/**
 *
 * @author PC220557
 */
class MallardDuck extends Duck {

    public MallardDuck() {
       quackBehavior = new Quack();
       flyBehavior = new FlyBehavior.FlyWithwings();
        
    }
    
}
