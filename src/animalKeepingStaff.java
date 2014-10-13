
import java.util.*;
import java.util.Iterator;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
 */
public class animalKeepingStaff extends staff implements database{
    
    static HashMap instances;
    static{
       instances = new HashMap(); 
    }
    
    public animalKeepingStaff(String fname, String lname){
        this.firstName= fname;
        this.lastName= lname;
        this.department="Animal Keeping";
        addToDB();
    }

    @Override
    public void addToDB() {
        instances.put(this.hashCode(),this);
    }

    @Override
    public void removeFromDB() {
        instances.remove(this);
    }
    
    static public String display(){
        String labelText = new String();
	
        for (Object value : instances.values()) {
            labelText= labelText + "\n" + ((animalKeepingStaff)value).hashCode() + "\t" +((animalKeepingStaff)value).firstName +" "+ ((animalKeepingStaff)value).lastName;
        }
        return labelText;
    }


    static public Object getInstanceFromDB(int uniqueID) {
        return instances.get(uniqueID);
    }
}
