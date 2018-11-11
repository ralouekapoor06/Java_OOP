/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinterexc;

/**
 *
 * @author MAHE
 */


interface x{
    int f;
    void callme();
    //void call();
}

abstract class inter1 implements x{
    public void callme(){
    System.out.println("kl");
    }
}


public class inter {
    public static void main(String args[])
    {
        inter1 ob=new inter1();
        ob.callme();
    }
}
