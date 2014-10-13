
import java.util.WeakHashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
 */

class reptile extends animal{
    
    private static final WeakHashMap instances;
    
    static{
       instances = new WeakHashMap(); 
    }
    
    reptile(){
        this.species= "Reptilia";
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
    
    public reptile getInstanceFromDB(int uniqueID) {
        return (reptile) instances.get(uniqueID);
    }

    @Override
    public void assignCage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static public String display(){
        String labelText = new String("");
        labelText= labelText + "Reptiles:\n";
        for (Object value : instances.values()) {
            labelText= labelText + "\n" + ((reptile)value).hashCode();
        }
        return labelText;
    }

}

