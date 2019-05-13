package www.sumanmyon.com.junittestingexamples.IntentOrLunchingActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import www.sumanmyon.com.junittestingexamples.R;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class Main2ActivityTest {

    //create a rule to lunch activity
    @Rule
    public ActivityTestRule<Main2Activity> activityTestRule = new ActivityTestRule<>(Main2Activity.class);
    //create context
    Main2Activity main2Activity = null;

    //Monitoring Activity to launch Main3Activity
    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Main3Activity.class.getName(), null, false);

    @Before
    public void setUp() throws Exception {
        main2Activity = activityTestRule.getActivity();
    }

    @Test
    public void testLunchForMain3Activity(){
        assertNotNull(main2Activity.findViewById(R.id.button));

        //we use espresso because it help to use UI component using code
        onView(withId(R.id.button)).perform(click());

        //geting instance of Main3Activity
        Activity main3Activity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5000);

        //if main3Activity is launched then return true
        assertNotNull(main3Activity);

        //destroy
        main3Activity.finish();
    }

    @After
    public void tearDown() throws Exception {
        main2Activity = null;
    }
}