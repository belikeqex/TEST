package TestZadacha;

import java.util.Random;

/**
 * Created by Admin on 20.06.2017.
 */
public class Singletone {

    static String[] ArrayList = new String[100];
    static Random rd = new Random();




    private static Singletone instance;

    private Singletone(){}

    public static synchronized Singletone getInstance(){
        if(instance == null){
            instance = new Singletone();
        }
        return instance;
    }


    public static void populate() {

//        Random rd = new Random();


        for (int i = 0; i < 100; i++) {

            int lol = rd.nextInt(2);

            switch (lol) {
                case 0:
                    ArrayList[i] = "Pass";
                    break;
                case 1:
                    ArrayList[i] = "Fail";
                    break;
            }


//            System.out.println(ArrayList[i]);
        }
    }

    public static String get() {

//        Random rd = new Random();

        int itemIndex = rd.nextInt(100);

        return ArrayList[itemIndex];

//        System.out.println(ArrayList[itemIndex]);

    }



    public static void change(){


        ArrayList[0] = "Fail12";
        System.out.println(ArrayList[0]);
    }





}
