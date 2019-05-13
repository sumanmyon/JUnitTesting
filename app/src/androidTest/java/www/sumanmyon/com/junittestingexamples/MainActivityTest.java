package www.sumanmyon.com.junittestingexamples;

import android.support.test.rule.ActivityTestRule;
import android.test.ActivityTestCase;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    //to test activity we must create a rule
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    //create a context
    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
    }

    @Test
    public void testLunch(){
        //getting view
        View view = mainActivity.findViewById(R.id.textView);
        assertNotNull(view);   //if view is not null then test is successful.
    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}