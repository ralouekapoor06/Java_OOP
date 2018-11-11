/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package thread;
//primptive multitasking means higher priority thread moving before lower one
//main thread is the last thread to finish the execution
/**
 *
 * @author MAHE
 */

//Thread group is a data structure that controls the state of collection of threads

public class basicthread
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        System.out.println(t);
        t.setName("rk");
        System.out.println(t);
        t.setName("rk1");
        System.out.println(t);
        System.out.println(t.getName());        
    }
}
