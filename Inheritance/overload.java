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

class A1{
    int x;
    A1()
    {
        x=10;
    }
    void test()
    {
        System.out.println(x+10);
    }
    void test(int a)
    {
        System.out.println(x+a+10);
    }
    void test(double a)
    {
        //return(x+a);
        //a=(int)a;
        System.out.println(a);
        //return a;
    }
    
}

public class overload {
    public static void main(String args[])
    {
        int y;
        A1 ob=new A1();
        ob.test();
        ob.test(10);
        ob.test(100.0);
        //System.out.println(y);
    }
}
