package com.d3f4ult.recursions;

public class Recursion {
static  int count=0;
    static  void  print(){
//       base case
        if(count==5){
            return;
        }
        count++;
        System.out.println("print name");
        print();
    }
// !   print linearly from 1 to N using back tracking

    static  void p(int n){
        if(n<=0){
            return;
        }

        System.out.println("number is ==> "+n);
        p(n-1);

    }
//  !  print linearly from 1 to n wohut bak tracking
    static  void  p2(int i,int n){
        if(i>n) return;
        System.out.println("we are Printing ===> "+ i);
        p2(i+1,n);

    }
//    ! sum of n numbers with recursion
    public  static void sm(int n,int sum)
    {
        if(n<1){
            System.out.println("total sum is===> "+sum );
            return;
        }
        sm(n-1,sum+n);
    }
    public static void main(String[] args) {
        print();
        System.out.println();
        System.out.println("\n<------Back Tracking Recursion--->\n".toUpperCase());
        p(5);
        System.out.println("\n<---recursion with parametrization----->\n".toUpperCase());
        p2(1,5);
        sm(4,0);
    }
}
