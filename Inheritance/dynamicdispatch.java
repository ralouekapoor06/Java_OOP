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

class x1
{
    void show()
    {
        System.out.println("hello");
    }
}

class x2 extends x1{
    void show()
    {
        System.out.println("hello1");
    }
}

class x3 extends x2{
    void show()
    {
        System.out.println("hello12");
    }
}

public class dynamicdispatch {
    public static void main(String args[])
    {
        x3 ob3=new x3();
        x2 ob2=new x2();
        x1 ob1=new x1();
        x1 ob;
        ob=ob1;
        ob.show();
        ob=ob2;
        ob.show();
        ob=ob3;
        ob.show();
        
    }
    
    
}
