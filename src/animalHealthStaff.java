
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
    protected static HashMap instances;
 */
public class animalHealthStaff extends staff implements database{
    
    private static final HashMap instances;
    
    static{
       instances = new HashMap(); 
    }
    
    public animalHealthStaff(String fname, String lname){
        this.firstName= fname;
        this.lastName= lname;
        this.department="Animal Keeping";
        addToDB();
    }

    @Override
    public final void addToDB() {
        instances.put(this.hashCode(),this);
    }
    
    @Override
    public void removeFromDB() {
        instances.remove(this);
    }
    
    static public String display(){
        String labelText = new String();
	
        for (Object value : instances.values()) {
            labelText= labelText + "\n" + ((animalHealthStaff)value).hashCode() + "\t" +((animalHealthStaff)value).firstName +" "+ ((animalHealthStaff)value).lastName;
        }
        return labelText;
    }

    static public animalHealthStaff getInstanceFromDB(int uniqueID) {
        return (animalHealthStaff) instances.get(uniqueID);
    }
    
    
}
