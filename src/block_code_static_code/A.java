/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block_code_static_code;

public class A {
    {
        System.out.println("this is class A");
    }
    static 
    {
        System.out.println("this is class A with static block code");
    }
    public A()
    {
         System.out.println("this is class A by method construct ");
    }
    public static void main(String[] args)
    {
        A a=new A();
        System.out.println("main");
    }
    
}
