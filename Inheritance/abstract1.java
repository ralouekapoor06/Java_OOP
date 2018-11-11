/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author MAHE
 */
//cannot create obj
//cannot create constr
//cannot make static methods
//cannot make it final
//we can add other full body methods in abstract class
//fine if only abstract class is there
//if abstract method then abstract class is necc
abstract class x123
{
    abstract void callme();
    void callmetoo()
    {
        System.out.println("hello");
    }
}

class x1111 extends x123{
    void callme()
    {
        System.out.println("cool");
    }
}


public class abstract1 {
    public static void main(String args[])
    {
         x1111 ob1=new x1111();
        ob1.callme();
        ob1.callmetoo();
    }
}
   
