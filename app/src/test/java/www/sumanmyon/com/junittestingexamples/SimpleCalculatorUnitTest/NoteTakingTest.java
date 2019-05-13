package www.sumanmyon.com.junittestingexamples.SimpleCalculatorUnitTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NoteTakingTest.AddNoteText.class,
        NoteTakingTest.AddImageText.class,
        NoteTakingTest.AddAudioText.class
})
public class NoteTakingTest {
    public static class AddNoteText{

        @Test
        public void testEmptyNote(){

        }

        @Test
        public void testMultilineNote(){

        }
    }

    public static class AddImageText{

        @Test
        public void testGifImage(){

        }

        @Test
        public void testVeryLargeImage(){

        }
    }

    public static class AddAudioText{

        @Test
        public void testMP3Audio(){

        }
    }
}
