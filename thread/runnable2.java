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

class B implements Runnable{
    public void run()
    {
        System.out.println("ok");
    }
}

public class runnable2 {
    public static void main(String args[])
    {
        B ob=new B();
        Thread r=new Thread(ob);
        r.start();
        System.out.println("yo");
        for(int i=0;i<100;i++)
        {
            System.out.println("yo1");
        }
        /*
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("kl");
        }
*/

    }
}
