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
class x{
    void show()
    {
        System.out.println("hello");
    }
}

class y extends x{
    void show()
    {
        super.show();
        System.out.println("hello123");
    }
}


public class overridesuper {
    public static void main(String args[])
    {
        y ob=new y();
        ob.show();
    }
}
