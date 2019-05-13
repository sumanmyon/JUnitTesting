package www.sumanmyon.com.junittestingexamples.FragmentTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import www.sumanmyon.com.junittestingexamples.R;


public class Main4Activity extends AppCompatActivity {

    private RelativeLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        container = findViewById(R.id.container);

        getSupportFragmentManager().beginTransaction().add(container.getId(),new BlankFragment()).commitAllowingStateLoss();
    }
}
