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

class Threadclass extends Thread
{
    //Thread t;
    String s1;
    Threadclass(String s)
    {
        s1=s;
        Thread t= new Thread(this);
        t.setName(s1);
        t.start();
    }
    
    public void run()
    {
        System.out.println("hello");
    }
}


public class threadclass2 {
    public static void main(String args[])
    {
        new Threadclass("one");
        new Threadclass("two");
        new Threadclass("three");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("kl");
        }
        
        //System.out.println("kl");
    }
}
