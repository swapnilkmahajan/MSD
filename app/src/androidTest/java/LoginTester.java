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

public class LoginTester extends InstrumentationTestCase {

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


        //wait till MSD app is on screen
        device.wait(Until.hasObject(By.text("MSD")), 3000);
        UiObject2 msdApp = device.findObject(By.text("MSD"));
        msdApp.click();

        // Wait till the MSD app opens, login page should be on screen
        device.wait(Until.hasObject(By.text("LOG IN")), 5000);

        // Select the button for 9
        UiObject2 loginButton = device.findObject(By.text("LOG IN"));
        loginButton.click();

        device.wait(Until.hasObject(By.text("HOME")), 5000);
        UiObject2 homeBanner = device.findObject(By.text("HOME"));
        device.waitForIdle(3000);
        //  UiObject2 resultText = device.findObject(By.clazz("android.widget.EditText"));
        String result = homeBanner.getText();
        assertTrue(result.equals("HOME"));
    }
    public void testAdd() throws Exception {


    }

}


