/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinterexc;
//explicitely thrown
/**
 *
 * @author MAHE
 */
class d12{
    void meth()throws IllegalAccessException
    {
        try{
            throw new IllegalAccessException("demo");
        }
        catch(IllegalAccessException e)
        {
            System.out.println("car");
            throw e;
        }
    }
}



public class illegalnull {
    public static void main(String args[])
    {
        d12 ob=new d12();
        try{
            ob.meth();
        }
        catch(IllegalAccessException e1)
        {
            System.out.println("hello");
        }
        
    }
}
