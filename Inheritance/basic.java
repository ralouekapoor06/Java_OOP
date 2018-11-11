/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author MAHE
 */


class A{
    int x;
    void call(int x){
        this.x=x;
    }
    
    void call2()
    {
        System.out.println(x);
    }
}


public class basic {
    public static void main(String args[])
    {
        A ob=new A();
        ob.call(10);
        ob.call2();
    }
}
