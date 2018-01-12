/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testappv1;

/**
 *
 * @author farhan
 */
class TestAppV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
    
     
    
}
class animal{
    void walk(){
        System.out.println("I am walking");
    }
    void sing(){
        System.out.println("I am singing");
    }
}


class Bird extends animal{
    void fly(){
        System.out.println("I am flying");
    }
}
