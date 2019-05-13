package www.sumanmyon.com.junittestingexamples.FragmentTest;

import android.support.design.widget.CoordinatorLayout;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.RelativeLayout;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import www.sumanmyon.com.junittestingexamples.R;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class BlankFragmentTest {

    @Rule
    public ActivityTestRule<TestActivity> activityTestRule = new ActivityTestRule<>(TestActivity.class);
    private TestActivity activity = null;

    @Before
    public void setUp() throws Exception {
        activity = activityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        RelativeLayout layout = activity.findViewById(R.id.test_frg);
        assertNotNull(layout);

        BlankFragment fragment = new BlankFragment();
        activity.getSupportFragmentManager().beginTransaction().add(layout.getId(),fragment).commitAllowingStateLoss();

        //wait to load frag
        getInstrumentation().waitForIdleSync();

        View view = fragment.getView().findViewById(R.id.frag_TextView);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        activity = null;
    }
}