/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 HackerRank URL : https://www.hackerrank.com/challenges/java-method-overriding/problem
 */
package testappv1;

/**
 *
 * @author farhan
 */
public class java_interface  {
    public static void main (String args[]){
        MyCalculator myCal = new MyCalculator();
        System.out.println("I implemented:"+ myCal.getClass().getInterfaces()[0]);
        int Result = myCal.divisor_sum(20);
        
        System.out.println(Result);
    }
    
}


interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    @Override
    
    public int divisor_sum(int n){
       
        int counter = n,sum=0;
        
        while(counter > 0){
            //System.out.println(counter);
            if(n%counter == 0){
                  sum = sum + counter;  
            }
            counter--;
        }
        return sum;
    }
}
