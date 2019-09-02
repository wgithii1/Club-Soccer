/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fireb
 */
import java.util.*;
public class HeadQuarters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
           System.out.println(" Welcome to the Lord Academy soccer club!"); 
           System.out.println(" Press 1 to register");
           int num = input.nextInt(); 
            if( num == 1 ){ 
                welcome(1);
            }
           
        
     
        
        
        //Coaches coach = new Coaches(); 
    }
    
    public static void welcome(int num){
        Scanner input = new Scanner(System.in); 
      //  System.out.println(" Welcome to the Lord Academy soccer club!"); 
      //  System.out.println(" Press 1 to register");
       
      // int num = input.nextInt(); 
        if( num == 1 ){ 
            System.out.println(" Are you a coach or a Player?"); 
            String choice = input.nextLine(); 
            if("coach".equalsIgnoreCase(choice)){
                coaches(); 
            }else{
                players();
            }
                
            
        }
        else{
            System.out.println(" GoodBye"); 
        }
        
        
    }
    
    public static void coaches(){ 
        Scanner input = new Scanner(System.in);
        String name; 
        int age; 
        String email; 
        String gender;
    
        System.out.println(" Hello Coach"); 
        System.out.println(" Please enter your name"); 
        name = input.nextLine();
         System.out.println(" Please enter your email"); 
        email = input.nextLine(); 
        System.out.println(" Please enter your age in numbers"); 
        age = input.nextInt(); 
       // input.nextLine(); 
        System.out.println(" Please enter your gender"); 
        gender = input.next();
        
         Coaches coach = new Coaches(name,age,email,gender); 
      
       
        
    }
    public static void players() {
          Scanner input = new Scanner(System.in);
        String name; 
        int age; 
        String email; 
        String gender;
    
        System.out.println(" Please enter your name"); 
        name = input.nextLine();
        System.out.println(" Please enter your age in numbers"); 
        age = input.nextInt(); 
        System.out.println(" Please enter your email"); 
        input.next(); 
        email = input.nextLine(); 
      
       // input.nextLine(); 
        System.out.println(" Please enter your gender"); 
        gender = input.next();
        
        
        
        Players player = new Players(name,age,email,gender,true); 
    }
            
    
}
