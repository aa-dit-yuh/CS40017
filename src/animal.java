
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
 */
abstract public class animal implements cageStructure, database{
    
    protected String species;
    protected int cageID;
    
    public static String display(){
        String labelText = new String();
	
        labelText = "Animals:\n"+ mammal.display()+ piesces.display()+ bird.display()+ amphibian.display()+ reptile.display();
        return labelText;
    }
    
}