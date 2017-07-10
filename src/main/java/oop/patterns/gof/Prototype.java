package oop.patterns.gof;

import oop.model.fauna.Eukaryote;
import oop.model.fauna.Prokaryote;
import oop.model.fauna.Sex;
import oop.model.fauna.Species;

/**
 * Created by mayukh42 on 14/5/17.
 *
 * The Prototype design pattern
 *  The prototype pattern is software version of cell division. We want to create new objects without calling 'new';
 *  It is not the same as Factories because they only 'mask' the 'new' operator which they call internally (only once,
 *  if it is a singleton). To implement it properly, it should be a language construct, that allows allocation of memory
 *  without using 'new'. Java supports it with the Cloneable interface.
 *
 *  The Cloneable interface requires each subclass to implement the clone() method, even if the outcome of that method
 *  is the parent type. This parent type can be abstract.
 *
 *  Organic growth is prototyped; i.e. each individual object has a parent from which it is created. No entity can be
 *  created out of scratch.
 */
public class Prototype {

    public static Species[] cloneProkaryotes() {
        /* The first is always with 'new', i.e. create from scratch. The old man with long beard is not irrelevant, yet!
         */
        Species myco = new Prokaryote();
        myco.setName("Bacteria");
        myco.setSex(Sex.FEMALE);

        Species thermo = myco.create();

        return new Species[]{myco, thermo};
    }

    public static Species[] cloneEukaryotes() {
        Species adam = new Eukaryote();
        adam.setName("Adam");
        adam.setSex(Sex.MALE);

        Species eve = adam.create();

        /* once the memory is allocated, we can use the object as if it was created using 'new' */
        if (eve != null) {
            eve.setName("Eve");
            eve.setSex(Sex.FEMALE);
        }
        return new Species[]{adam, eve};
    }
}
