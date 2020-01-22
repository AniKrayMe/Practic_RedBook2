package com.company;

import com.company.Animals.Animal;
import com.company.Animals.Birds.Eagle;
import com.company.Animals.Birds.Seagul;
import com.company.Animals.Mamalls.Leopard;
import com.company.Animals.Mamalls.Lion;
import com.company.Animals.Riptilies.Anaconda;
import com.company.Animals.Riptilies.Krokodile;
import com.company.Animals.Riptilies.Moghes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Eagle eagle = new Eagle( RiskLevel.MEDIUM );
        Seagul seagul = new Seagul( RiskLevel.LOW );
        Leopard leopard = new Leopard( RiskLevel.HIGH );
        Lion lion = new Lion( RiskLevel.MEDIUM );
        Anaconda anaconda = new Anaconda( RiskLevel.MEDIUM );
        Krokodile krokodile = new Krokodile( RiskLevel.HIGH );
        Moghes moghes = new Moghes( RiskLevel.LOW );
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add( eagle );
        animals.add( leopard );
        animals.add( seagul );
        animals.add( lion );
        animals.add( anaconda );
        animals.add( krokodile );
        animals.add( moghes );

        RedBook.getAnimalsByRiskLevel( RiskLevel.LOW );

    }


}
