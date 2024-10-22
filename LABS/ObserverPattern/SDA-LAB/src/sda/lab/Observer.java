/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sda.lab;

/**
 *
 * @author fa22-bse-051
 */
public abstract class Observer {
   protected Subject subject;
   protected boolean active = true;
   public abstract void update();
   
   public void unActive() {
       this.active = false;
   }
   
   public void active() {
       this.active = true;
   }
}