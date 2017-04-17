/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block_code_static_code;

/**
 *
 * @author Thanh Ha
 */
/*
    static block code luon run dau tien so voi cac khoi code binh thuong
    block code run sau static code va truoc cac khoi code binh thuong
    static code luon run truoc nen khi ke thua neu o lop con co khoi static code thi no van se chay truoc cac khoi code 
khong static o lop cha
*/
public class B extends A{
    {
        System.out.println("this is class B");
    }
    static {
        System.out.println("this is class B with satic block code");
    }
    public static void main(String[] args)
    {
        new B();
    }
  
}
