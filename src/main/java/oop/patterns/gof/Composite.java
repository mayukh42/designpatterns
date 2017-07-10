package oop.patterns.gof;

import oop.model.cad.Color;
import oop.model.cad.graphic.*;
import oop.model.fauna.Sex;

/**
 * Created by mayukh42 on 30/5/17.
 *
 * The Composite design pattern
 *  One parent type from which both leaf and branch types extend. Leaf and Branch both support operations (public API)
 *  defined in parent type, but are implemented differently. Branch types 'has-a' leaf type(s). Branch types delegate
 *  actual operations to leaf types, like an expression evaluator (see Backus-Naur form in language parsers).
 *
 * In general, composite design pattern is the way recursive data structures are designed. Ex. Linked List. In a list,
 *  we don't distinguish between an individual node and the entire list, as far as list type is concerned. Both are of
 *  the same type 'List'. As we traverse, the list recursively visits the next node and so on, until it hits the last
 *  node. As evident if we draw the list as a tree, this last node (sentinel) is the leaf type, because processing ends
 *  here. All other previous nodes are internal nodes.
 */
public class Composite {

    public static void paintObjects() {
        /* Leaves */
        Graphic wolf = new Animal("Wolf");
        Graphic joseph = new Person("Joseph Seed", Sex.MALE);
        Graphic rockies = new Hill("Rocky");
        Graphic peepal = new Tree("Peepal");

        /* Branches/ Internal Nodes */
        Graphic church = new Cartoon();
        church.add(joseph);
        church.add(wolf);

        /* Top-level branch (root) */
        Graphic farcry5art = new Cartoon();
        farcry5art.add(rockies);
        farcry5art.add(peepal);
        farcry5art.add(church);

        farcry5art.paint(Color.BLUE);
    }
}
