/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package thread;

/**
 *
 * @author MAHE
 */
class A1 extends Thread
{
    public void run()
    {
        System.out.println("hello");
    }
}

class B1 extends Thread
{
    public void run()
    {
        System.out.println("hello1");
    }
}

class C1 extends Thread
{
    public void run()
    {
        System.out.println("hello2");
    }
}


public class threadclass {
    public static void main(String args[])
    {
        A1 ob=new A1();
        ob.start();
        B1 ob1=new B1();
        ob1.start();
        C1 ob2=new C1();
        ob2.start();
    }
}
