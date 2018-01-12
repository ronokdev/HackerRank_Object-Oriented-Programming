/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
  HackerRank Url :: https://www.hackerrank.com/challenges/java-inheritance-1/problem
 
 
 */
package testappv1;

/**
 *
 * @author farhan
 */
public class Solution {
    public static void main (String args[]){
        System.out.println("My superclass is: Arithmetic");
        Adder adder = new Adder();
        //int addAnswer = adder.add(10,20);
        //System.out.println(addAnswer);
        
    }
}
class Arithmetic{
    int add(int a, int b){
        int x1,sum=0;
        sum = a+b;
        return sum;
    }
} 

class Adder extends Arithmetic{
     
}

