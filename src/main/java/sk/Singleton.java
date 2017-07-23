package sk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by SK on 20.07.2017.
 */
public class Singleton {

    private static Singleton instance;

    public Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    List arrayList= Collections.synchronizedList(new ArrayList<String>());

    public synchronized void populate() {
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            String stringValue = null;
            if (rand.nextBoolean() == true) {
                stringValue = "Pass";
            } else {
                stringValue = "Fail";
            }
            arrayList.add(stringValue);
        }
    }

    public synchronized void change(int posNumb, String newValue) {
        arrayList.set(posNumb, newValue);
    }

    public synchronized String get() {
        Random rand = new Random();
        return (String) arrayList.get(rand.nextInt(100));
    }

    public synchronized String get(int y) {
        return (String) arrayList.get(y);
    }
}
