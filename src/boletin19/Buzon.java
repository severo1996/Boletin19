package boletin19;

import java.util.ArrayList;

public class Buzon {
    
    ArrayList<Correo>emails= new ArrayList<Correo>();
    
    public int numerodeCorreos(){
    return emails.size();
    }
    public void añadir(Correo c){
        emails.add(c);
    }
    public boolean ponerLeer(){
              
        for(Correo c:emails){
            if(!c.leido()){
                return true;
                
            }
            
        }
        return false;
    }
    public String primerNoLeido(){
        for(Correo c:emails){
            if(!c.leido()){
                return c.toString();
            }
        }
        return null;
        
              
    }
    public String enseña(int k){
        return emails.get(k).toString();
    }
    
   
    
}
