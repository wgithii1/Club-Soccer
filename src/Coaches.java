/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilson Githiiyi
 */

import java.util.*; 

public class Coaches {
    
    private String name; 
    private int age; 
    private String email; 
    private String gender; 
     
   ArrayList<String> names = new ArrayList<>(); 
    
    public Coaches( String coachName, int coachAge, String coachEmail, String coachGender){ 
        name = coachName; 
        age = coachAge; 
        email = coachEmail; 
        gender = coachGender; 
        
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String coachName) {
        name = coachName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int coachAge) {
        age = coachAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String coachEmail) {
        email = coachEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String coachGender) {
       gender = coachGender;
    }
    
    public void addNames(){ 
        names.add(getName());
    }
    
    
}
