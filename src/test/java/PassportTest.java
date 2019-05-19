import adapterpattern.loginadapter.v2.IPassportForThird;
import adapterpattern.loginadapter.v2.PassportForThirdAdapter;

/**
 * Created by Tom.
 */
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");


    }

}
