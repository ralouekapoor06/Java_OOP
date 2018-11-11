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

//int is 0
//float is 0.0
//boolean is false
//String is NULL
//static method can have only static var
class s{
    static int a;
    static int b;
    s()
    {
        //a=20;
        b=20;
    }
    
    static void inc()
    {
        a=a+10;
        b=b+10;
    }
    //only gets initialized if not previously initilaized
    static{
        System.out.println("hello");
        a=a+10;
    }
    
    /*
    static void call()
    {
        System.out.println(a);
    }
    */
}


public class static1 {
    public static void main(String args[])
    {
        /*
        System.out.println(Math.max(2,3));
        System.out.println(Math.min(2,3));
        System.out.println(Math.pow(2,3));
        s.call();
        System.out.println(s.a);
        */
        s ob=new s();
        s ob1=new s();
        System.out.println(ob.a);
        System.out.println(ob1.a);
        
        ob.inc();
        ob1.inc();
        System.out.println(ob.a);
        System.out.println(ob1.b);
        
    }
}
