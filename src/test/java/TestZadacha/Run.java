package TestZadacha;

import java.util.Random;

/**
 * Created by Admin on 20.06.2017.
 */
public class Run {

    public static void main(String[] args) {

        Singletone Singletone = new Singletone();


        Singletone.populate();
        Singletone.get();
        Singletone.change();

    }
}
