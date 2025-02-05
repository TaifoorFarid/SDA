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
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      Observer ob1 = new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
//      subject.deAttach(ob1);
      System.out.println("Third state change: 10");	
      subject.setState(10);
       System.out.println("");
      ob1.unActive();
      subject.setState(10);
   }
}
