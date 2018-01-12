/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 HackerRank URL :: https://www.hackerrank.com/challenges/java-abstract-class
 */
package testappv1;

/**
 *
 * @author farhan
 */
public class java_abstract_class {
    public static void main(String args[]){
        MyBook new_novel = new MyBook();
        new_novel.setTitle("A tale of two cities");
        System.out.println("The title is: "+new_novel.getTitle());
        
    }
}
abstract class Book{
	String title;
        
	abstract void setTitle(String s);
        
	String getTitle(){
	   return title;
	}
}


class MyBook extends Book{
    void setTitle(String s){
        title = s ;
    }
}
