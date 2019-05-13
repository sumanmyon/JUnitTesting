package www.sumanmyon.com.junittestingexamples.DataStoreTest;

import org.json.JSONArray;
import org.json.JSONTokener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import www.sumanmyon.com.junittestingexamples.DataStore.StoreDataInCache;

@RunWith(Parameterized.class)
public class StoreDataInCacheTest {

    //private static final String GitHubURL = "https://jobs.github.com/positions.json";


//    id	"9b66873e-2af0-4fdb-95dd-ee08e8adc326"
//    type	"Full Time"
//    url	"https://jobs.github.com/…0-4fdb-95dd-ee08e8adc326"
//    created_at	"Thu Apr 04 12:01:43 UTC 2019"
//    company	"Attest"
//    company_url	"https://www.askattest.com/"
//    location	"London"
//    title	"Backend Engineer"
//    description	"<p>Welcome, welcome! We’…e where possible.</p>\n"
//    how_to_apply	"<p>Please apply via <a h…@askattest.com</a></p>\n"
//    company_logo	"https://jobs.github.com/…test-logo-mark-black.png"

    private String key,value;
    JSONArray array = new JSONArray();
    static Object[] objects;

    public StoreDataInCacheTest(String s,String value){
       this.key = s;
       this.value = value;
    }

    @Parameterized.Parameters
    public static Collection<Object> getData(){
         objects = new Object[][]{
                {"id","9b66873e"},
                {"type","Full Time"},
                {"url","https://jobs.github.com/…0-4fdb-95dd-ee08e8adc326"}
        };
        return Arrays.asList(objects);
    }

    @Test
    public void data(){
        //List<Object> list = new ArrayList<>();

        StoreDataInCache cache = new StoreDataInCache(array);
        cache.store();
    }
}
