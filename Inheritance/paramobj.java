/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//pass by ref means obj
//pass by val means an value

package inherit;

/**
 *
 * @author MAHE
 */

class C{
    int x;
    C()
    {
        x=10;
    }
    C(C o)
    {
        x=o.x;
    }
    void call(C o)
    {
        System.out.println(o.x);
    }
    C call1()
    {
        System.out.println(x);
        C temp=new C();
        return temp;
    }
}


public class paramobj {
    public static void main(String args[])
    {
        C ob=new C();
        C ob1=new C();
        C ob2=new C(ob);
        System.out.println(ob.x);
        System.out.println(ob1.x);
        System.out.println(ob2.x);
        
        C ob4;
        ob4=ob.call1();
        System.out.println(ob4.x);
        
        
    }
}
