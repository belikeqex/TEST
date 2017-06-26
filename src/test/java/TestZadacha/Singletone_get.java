package TestZadacha;

import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static TestZadacha.Singletone.ArrayList;

/**
 * Created by Admin on 21.06.2017.
 */
public class Singletone_get {


     static Singletone X = new Singletone();
    static Random rd = new Random();

@BeforeClass
public static void xpopulate(){

    X = Singletone.getInstance();

    X.populate();
}

    @Test
    public static void testGet() {

    X.get();

//        int itemIndex = rd.nextInt(100);


//        System.out.println(ArrayList[itemIndex]);

//        Assert.assertEquals (ArrayList[itemIndex], "ass");
        Assert.assertTrue (X.getValue(firstPar).equals ("Pass"));

    }

}
