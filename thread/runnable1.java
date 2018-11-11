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

//after start also it prints values

class A implements Runnable
{
    A()
    {
        Thread t=new Thread();
        t.setName("rk");
        System.out.println(t);
        t.start();
        //System.out.println("car");
    }
    
    public void run()
    {
        System.out.println("hello");
    }
}


//unless you dont sleep or finish in main this it wont start
public class runnable1 {
    public static void main(String args[])
    {
        A ob=new A();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("kl");
        }
        System.out.println("main thread exited");
        
    }
}
