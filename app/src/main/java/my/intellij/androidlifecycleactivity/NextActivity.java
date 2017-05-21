package my.intellij.androidlifecycleactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class NextActivity extends AppCompatActivity {

    String msg = "Activity 2 : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Log.d(msg, "The onCreate() event");
    }
}