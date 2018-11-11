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
class tryy{
    void meth()
    {
        try{
            int y;
            int c[]={1,2};
            c[99]=50;
            y=42/0;
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("hello");
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("hello123");
        }

        catch(Exception e)
        {
            System.out.println("lk1");
        }
        finally
        {
            System.out.println("car");
        }
        
    }
}

public class trycatch {
    public static void main(String args[])
    {
        tryy ob=new tryy();
        ob.meth();
    }
}
