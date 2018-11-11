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
class exp extends Exception
{
    int a1;
    exp(int a)
    {
        a1=a;
    }
    public String toString()
    {
        return "hello";
    }
}

class lo{
    void callme() throws exp
    {
        try{
            if(42>10)
            {
                throw new exp(42);
            }
        }
        catch(exp e)
        {
            System.out.println("hello");
        }
    }
}


public class ownexp {
    public static void main(String args[])
    {
        lo ob=new lo();
        try{
            ob.callme();
        }
        catch(exp e)
        {
            System.out.println("hello");
        }
        
    }
}
