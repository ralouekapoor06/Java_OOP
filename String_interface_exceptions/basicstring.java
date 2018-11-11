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
//cannot duplicate in java
public class basicstring {
    public static void main(String args[])
    {
        String s="abcd";
        System.out.println(s);
        String s1=new String("helllo");
        System.out.println(s1);
        char ch[]={'a','b','c'};
        String h=new String(ch);
        System.out.println(h);
        char ch1[]={'p','q','r'};
        String s100=new String(ch1,2,1);
        System.out.println(s100);
        String s12="hello"+"world";
        System.out.println(s12);
        String s33="hello";
        System.out.println(s33+(2+2));
        System.out.println(s12.toUpperCase());
        System.out.println(s12.toLowerCase());
        System.out.println(s12.charAt(3));
        System.out.println(s12.replace('h', 'a'));
        System.out.println(s12.equalsIgnoreCase(s33));
        //if both the strings are same and one ends the no.of extra is printed
        String x="caa";
        String x1="caa";
        System.out.println(x.compareTo(x1));
        String h1="abcabc";
        String h2="cv";
        System.out.println(h1.substring(3));
        System.out.println(h1.substring(3,4));
        System.out.println(h1.substring(0,h1.length()));
        System.out.println(h1.concat(h2));
        System.out.println(h1);
        //take both the points
        System.out.println(h1.indexOf('b',2));
        System.out.println(h1.lastIndexOf('a',3));
        System.out.println(x.equals(x1));
        String x100=new String("caa");
        System.out.println(x.equals(x100));
        System.out.println(x==x100);
        
        StringBuffer sp=new StringBuffer("ab");
        System.out.println(sp.length());
        System.out.println(sp.charAt(1));
        //System.out.println(sp.setCharAt(0,'h'));
        sp.setCharAt(1, 'h');
        //even if 2nd string not a string buffer you can add it
        System.out.println(sp);
        System.out.println(sp.append(x100));
        System.out.println(sp);
        
        String s45[]={"abc","ver"};
        System.out.println(s45[0]);
    }
}
