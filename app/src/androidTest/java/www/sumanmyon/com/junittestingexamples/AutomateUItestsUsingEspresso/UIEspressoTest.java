package www.sumanmyon.com.junittestingexamples.AutomateUItestsUsingEspresso;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import www.sumanmyon.com.junittestingexamples.R;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class UIEspressoTest {

    @Rule
    public ActivityTestRule<UIEspresso> uiEspressoActivity = new ActivityTestRule<>(UIEspresso.class);
    private String text = "suman";


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void userTest(){
        //input some text in edit text
        Espresso.onView(withId(R.id.UIEspresso_editText)).perform(typeText(text));
        //close soft keyboard
        Espresso.closeSoftKeyboard();
        //perform button click
        Espresso.onView(withId(R.id.done)).perform(click());
        //checking text in textView
        Espresso.onView(withId(R.id.UIEspresso_textView)).check(matches(withText(text)));

    }

    @After
    public void tearDown() throws Exception {
    }
}