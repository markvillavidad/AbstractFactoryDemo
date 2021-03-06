
package com.cakes;

import com.cakes.animals.*;

public class ReptileFactory extends SpeciesFactory {
    
    @Override
    public Animal getAnimal(String type){
        if ("snake".equals(type)){
                return new Snake();
        } else {
                return new Tyrannosaurus();
        }
    }   
}
