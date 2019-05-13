package www.sumanmyon.com.junittestingexamples.AutomateUItestsUsingEspresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import www.sumanmyon.com.junittestingexamples.R;

public class UIEspresso extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiespresso);

        editText = findViewById(R.id.UIEspresso_editText);
        button = findViewById(R.id.done);
        textView = findViewById(R.id.UIEspresso_textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });
    }
}
