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

class exp1 extends Exception
{
    int a;
    exp1(int a1)
    {
        a=a1;
    }
    
    public String toString()
    {
        return "exp["+a+"]";
    }
}

class pq{
    void meth(int q1) throws exp1
    {
        if(q1>9)
        {
          throw new exp1(q1);  
        }
        
    }
}
public class ownexp1 {
    public static void main(String args[])
    {
        pq ob=new pq();
    try{
        ob.meth(10);
    }
    catch(exp1 e)
    {
        System.out.println("hello");
    }
    }
    
    
}
