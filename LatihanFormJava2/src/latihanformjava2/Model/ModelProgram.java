/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Model;

/**
 *
 * @author user.pc
 */
public class ModelProgram {
    public String label = "please put your information to get the result";
    
    public String returnGenderNoun(String gender){
        String noun = "He";
        if(gender.toLowerCase().equals("female")){
            noun = "She";
        }
        return noun;
    }
    public String returnMental(String mental){
        switch(mental){
            case ":(":
                return "sedih";
            case ":D":
                return "senang";
            case ":/":
                return "biasa aja";
            default :
                return "in love";
                        
            
        }
    }
    
    
    
}
