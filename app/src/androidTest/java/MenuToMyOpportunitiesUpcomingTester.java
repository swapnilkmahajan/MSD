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


//Click an opportynity on home page to go opportunity details page
public class MenuToMyOpportunitiesUpcomingTester extends InstrumentationTestCase {

    private UiDevice device;


    @Override
    public void setUp() throws Exception {
        super.setUp();
        Runtime.getRuntime().exec(new String[]{"am", "force-stop", "MSD"});
        device = UiDevice.getInstance(getInstrumentation());

        device.pressHome();
        device.pressRecentApps();
        try {
            UiObject close = device.findObject(new UiSelector().description("Dismiss MSD."));
            close.click();
        }catch (Exception e){
           Log.d("exception",e.getMessage());
        }
        device.pressHome();
        device.wait(Until.hasObject(By.desc("Apps")), 3000);
        UiObject2 appsButton = device.findObject(By.desc("Apps"));
        appsButton.click();

        device.wait(Until.hasObject(By.text("MSD")), 5000);
        UiObject2 msdApp = device.findObject(By.text("MSD"));
        msdApp.click();

        device.wait(Until.hasObject(By.text("LOG IN")), 5000);
        UiObject2 loginButton = device.findObject(By.text("LOG IN"));
        loginButton.click();

        device.wait(Until.hasObject(By.text("HOME")), 5000);

        UiObject menuButton = device.findObject(new UiSelector().resourceId("com.neonto.exportedByUser_s969932972038319.MSD:id/mIconButton"));
        menuButton.click();



        device.wait(Until.hasObject(By.text("MENU")), 3000);
        UiObject menuMyInfo = device.findObject(new UiSelector().resourceId("com.neonto.exportedByUser_s969932972038319.MSD:id/mButton2"));
        menuMyInfo.click();


        device.wait(Until.hasObject(By.text("Upcoming")), 3000);
        UiObject2 upcomingButton = device.findObject(By.text("Upcoming"));
        upcomingButton.click();

        device.wait(Until.hasObject(By.text("Web development tips & tricks")), 3000);
        UiObject2 opportunity = device.findObject(By.text("Web development tips & tricks"));




        device.waitForIdle(3000);
        //  UiObject2 resultText = device.findObject(By.clazz("android.widget.EditText"));
        String result = opportunity.getText();
        assertTrue(result.equals("Web development tips & tricks"));
    }
    public void testAdd() throws Exception {


    }

}


