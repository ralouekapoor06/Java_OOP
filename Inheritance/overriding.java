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

class d{
    int i,j;
    d(int a1,int b1)
    {
        i=a1;
        j=b1;
    }
}

class d1 extends d{
    int k;
    int i;
    d1(int a,int b,int c){
        super(a,b);
        k=c;
        //super.i=30;
    }
    void show()
    {
        //System.out.println(j);
        System.out.println(super.i);
    }
}

//super needs to be always the 1st ele
public class overriding {
    public static void main(String args[])
    {
        d1 ob=new d1(1,2,3);
        ob.show();
        
    }
    
    
}
