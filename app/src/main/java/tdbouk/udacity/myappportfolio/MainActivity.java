package tdbouk.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method used to handle on button clicks
     * @param view
     */
    public void onButtonClick(View view) {
        int viewId = view.getId();

        switch (viewId) {
            case R.id.btn_one:
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_two:
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_three:
                Toast.makeText(MainActivity.this, "This button will launch my Build it Bigger App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_four:
                Toast.makeText(MainActivity.this, "This button will launch my Make your App Material App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_five:
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_six:
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
