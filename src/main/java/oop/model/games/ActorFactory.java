package oop.model.games;

import oop.model.games.farcry.GoldenPathMemberCreator;
import oop.model.games.farcry.NationalGuardCreator;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * ActorFactory provides singleton instance of each available factory, in AbstractFactory Design Pattern.
 *  It is tightly coupled with number of factories, since a new factory would require a new singleton and corresponding
 *      lock object.
 */
public class ActorFactory {

    private static ActorCreator goldenPathFactory = null;
    private static ReentrantLock goldenPathFactoryLock = new ReentrantLock();

    private static ActorCreator nationalGuardFactory = null;
    private static ReentrantLock nationalGuardFactoryLock = new ReentrantLock();

    public static ActorCreator getGoldenPathFactory() {
        goldenPathFactoryLock.lock();
        if (goldenPathFactory == null) {
            try {
                goldenPathFactory = new GoldenPathMemberCreator();
            } finally {
                goldenPathFactoryLock.unlock();
            }
        }
        else goldenPathFactoryLock.unlock();
        return goldenPathFactory;
    }

    public static ActorCreator getNationalGuardFactory() {
        nationalGuardFactoryLock.lock();
        if (nationalGuardFactory == null) {
            try {
                nationalGuardFactory = new NationalGuardCreator();
            } finally {
                nationalGuardFactoryLock.unlock();
            }
        }
        else nationalGuardFactoryLock.unlock();
        return nationalGuardFactory;
    }
}
