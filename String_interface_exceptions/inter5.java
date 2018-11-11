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
interface a
{
    void info();
}

class a11 implements a{
    public void info()
    {
       System.out.println("jk"); 
    }
}

class a2 implements a{
    public void info()
    {
        System.out.println("po");
    }
}

class mainn{
    public static void main(String args[])
    {
        a11 l1=new a11();
        a2 l2=new a2();
        a l3;
        l3=l1;
        l3.info();
    }
}


public class inter5 {
    
}
