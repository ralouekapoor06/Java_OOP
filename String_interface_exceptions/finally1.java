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
//hello is anyways printed
class g
{
    void call()
    {
        try{
            int x=42/2;
            throw new RuntimeException("demo");
        }
        catch(RuntimeException e)
        {
            System.out.println("jk");
        }
        finally
        {
            System.out.println("hello");
        }
    }
}


public class finally1 {
   public static void main(String args[])
   {
       g ob=new g();
       ob.call();
   }
}
