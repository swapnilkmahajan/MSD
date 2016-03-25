/**
 * Created by bhumi on 3/24/2016.
 */


import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;
import android.util.Log;


//Click register button on login page to go to registration page
public class LoginToRegisterTest extends InstrumentationTestCase {

    private UiDevice device;


    @Override
    public void setUp() throws Exception {
        super.setUp();
        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();
        device.pressRecentApps();
        try {
            UiObject close = device.findObject(new UiSelector().description("Dismiss MSD."));
            close.click();
        }catch (Exception e){
            Log.d("exception", e.getMessage());
        }
        device.pressHome();
        device.wait(Until.hasObject(By.desc("Apps")), 3000);
        UiObject2 appsButton = device.findObject(By.desc("Apps"));
        appsButton.click();

        device.wait(Until.hasObject(By.text("MSD")), 3000);
        UiObject2 msdApp = device.findObject(By.text("MSD"));
        msdApp.click();

        device.wait(Until.hasObject(By.text("Register")), 10000);
        UiObject2 registerLink = device.findObject(By.text("Register"));
        registerLink.click();

        device.wait(Until.hasObject(By.text("REGISTER")), 5000);

        UiObject2 homeBanner = device.findObject(By.text("REGISTER"));
        device.waitForIdle(3000);

        String result = homeBanner.getText();
        assertTrue(result.equals("REGISTER"));
    }
    public void testAdd() throws Exception {


    }

}


