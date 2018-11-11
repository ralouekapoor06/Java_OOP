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

class A12{
    int i,j;
    //private int j;
}

class B extends A12{
    int k;
    void show()
    {
        System.out.println(i+j+k);
    }
}

public class inhertstart {
    public static void main(String args[])
    {
       // A12 ob=new A12();
        
        B ob=new B();
        ob.i=10;
        ob.j=20;
        ob.k=30;
        ob.show();
        
        A12 ob4=new A12();
        ob4=ob;
        System.out.println(ob4.i);
    }
}
