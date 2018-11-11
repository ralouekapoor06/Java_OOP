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

interface a1{
    int x=100;
    int t=1000;
    //boolean j;
    void call();
}

class h implements a1{
    public void call()
    {
        System.out.println(x);
    }
}


public class inter3 {
    public static void main(String args[])
    {
        h on=new h();
        on.call();
    }
}
