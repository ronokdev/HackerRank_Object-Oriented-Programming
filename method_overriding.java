/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 HackerRank URl :: https://www.hackerrank.com/challenges/java-method-overriding/problem
 
 */
package testappv1;

/**
 *
 * @author farhan
 */
public class method_overriding {
     public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}

class Sports
{
    String getName()
    {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }
    
    @Override
    public void getNumberOfTeamMembers()
    {
         System.out.println( "Each team has 11 players in " + getName() );
         
    }
}


