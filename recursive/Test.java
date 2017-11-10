/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Test {

//这是关于尾递归的有关方法了解
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int wow=factorial2(n,1);
        System.out.println(wow);
    }
/*
    平常的递归程序 会造成大量的栈的垃圾堆叠  造成大量的浪费
    而尾递归会很好的解决这个问题
    */    
    //首先考虑一般的阶乘code
    
       public static int factorial(int mm)
       {
           if (mm==1) {
               return 1;
           }
           else {
           return factorial(mm-1)*mm;
           
           }
       }
     /*
       考虑这个递归程序 n=5的时候
       5*fact(4)
       5*4*fact(3)
       5*4*3*fact(2)
       5*4*3*2*fact(1)
       在栈中调用下一个函数时  这些参数都会大量堆叠在栈中
       产生垃圾数据
       */
       //现在考虑尾递归
       public static int factorial2(int n,int a)
       {
           if (n==0) {
               return a;
           }
           else {
           return factorial2(n-1,a*n);
           } 
       }
       /*
       考虑尾递归 n=5
       factorial2(4,5)
       factorila2(3,20)
       factorial2(2,60)
       factorial2(1,120)
       factorial2(0,120)=120  不产生辣鸡数据
       */
    
    
    }
    

