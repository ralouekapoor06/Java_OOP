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
//inner class or non static class can access bahar ka
//static class needs obj to access outside ka

class Av{
    int x=10;
    
    void show()
    {
        B ob=new B();
        ob.call();
    }
    static class B{
        void call()
        {
            Av ob4=new Av();
            System.out.println(ob4.x);
            //System.out.println(x);
        }
    }
}

public class nested {
    public static void main(String args[])
    {
        Av ob1=new Av();
        ob1.show();
        
    }
}
