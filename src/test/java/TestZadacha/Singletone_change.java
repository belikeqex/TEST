package TestZadacha;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

/**
 * Created by Admin on 21.06.2017.
 */
public class Singletone_change {

    static Singletone X = new Singletone();






    @DataProvider(name = "datachange")
    public Object[][] simpleDataProvider() {
        return new Object[][]{
                {1,"test"},
                {10,"test"},
                {20,"test"}
        };
    }
    @BeforeClass
    public static void xpopulate() {

        X = Singletone.getInstance();

        X.populate();

    }


        @Test(dataProvider = "datachange")
    public void testChange(int firstPar, String secondPar){

            X.change(firstPar, secondPar);

            assertTrue(X.getValue(firstPar).equals("Pass"));

        }






//        ArrayList[0] = "Fail12";
//        System.out.println(ArrayList[0]);
    }

}
