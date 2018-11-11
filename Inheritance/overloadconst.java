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

class A11{
    int x;
    double x1;
    long x11;
    A11()
    {
        x=1;
    }
    A11(int p)
    {
        x=p;
    }
    A11(double p)
    {
        x1=p;
        System.out.println(x1);
    }
    A11(long p)
    {
        //x1=p;
        x11=p;
        System.out.println(x11);
    }
    void display()
    {
        System.out.println(x);
    }
}

public class overloadconst {
    public static void main(String args[])
    {
        A11 ob=new A11();
        A11 ob1=new A11(10);
        A11 ob2=new A11(2);
        ob.display();
        ob1.display();
        //ob2.display();
    }
}
