/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverse;
import java.util.*;
/**
 *
 * @author STUDENT1
 */
public class Inverse {

    /**
     * @param args the command line arguments
     */
    static int r2;
    static int extendedEuclidean(int a, int b){
        int r1 = b; r2 = a;
        int t1 = 0, t2 = 1;
        int q,r,t;
        while(r2>0){
            q=r1/r2;
            r=r1-q*r2;
            r1=r2;
            r2=r;
            t=t1-q*t2;
            t1=t2;
            t2=t;
        }
        //System.out.println(s1+"     "+t1);
         
            return t1;
    }
    static int additiveInverse(int n, int num){
     for(int i=0;i<n;i++){
         if((num+i)%n==0)
             return i;
     }
     return -1;
    }
    static int multiplicativeInverse(int n,int num){
        int inverse = extendedEuclidean(num,n);
        //System.out.println(" t1 "+inverse);
        if(r2==0){
            if(inverse<0)
                return inverse+n;
            else
                 return inverse;
        }else
            return -1;
    }
    static void findInverse(int n,int num){
        int ai = additiveInverse(n,num);
        int mi = multiplicativeInverse(n,num);
        if(ai==-1)
            System.out.println("Additive inverse of "+num+" doesn't exist!!");
        else
            System.out.println("Additive inverse of "+num+" : "+ai);
        if(mi==-1)
            System.out.println("Multiplicative inverse of "+num+" doesn't exist!!");
        else
            System.out.println("Multiplicative inverse of "+num+" : "+mi);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of num in Zn: ");
        int num = sc.nextInt();
        findInverse(n,num);
    }
    
}
