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

class my extends Thread
{
    String s1;
    my(String s)
    {
        s1=s;
        Thread t=new Thread(this);
        t.setName(s);
        System.out.println(t.getName());
        t.start();
    }
    
    public void run()
    {
        System.out.println("hello");
    }
}

public class multiple {
    public static void main(String args[])
    {
       new my("one");
       new my("two");
       new my("three");
       try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("kl");
        }
    }
}
