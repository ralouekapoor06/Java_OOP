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
interface d{
    void call();
}

interface u extends d{
    void notcall();
}

class f implements u
{
    public void call()
    {
        System.out.println("po");
    }
    public void notcall()
    {
        System.out.println("pot");
    }
}


public class inter4 {
    public static void main(String args[])
    {
        f ob5=new f();
        ob5.call();
    }
}
