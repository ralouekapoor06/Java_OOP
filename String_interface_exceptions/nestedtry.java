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

class A12{
    int c;
    void call(int f)
    {
        try{
            c=42/f;
            try{
                int c[]={1,2,3};
                c[42]=90;
            }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("hello");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("cool");
        }
    }
}


public class nestedtry {
    public static void main(String args[])
    {
        int p;
        A12 ob=new A12();
        try{
            p=42/0;
            ob.call(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("pou");
        }    
    }
}
