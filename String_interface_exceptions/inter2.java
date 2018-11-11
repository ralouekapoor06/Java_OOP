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
class A{
    interface x
    {
        void call();
    }
}


//if you extend it will get inherited
class B extends A{
    public void call()
    {
        System.out.println("hello");
    }
}



public class inter2 {
    public static void main(String args[])
    {
        B ob=new B();
        ob.call();
    }
}
