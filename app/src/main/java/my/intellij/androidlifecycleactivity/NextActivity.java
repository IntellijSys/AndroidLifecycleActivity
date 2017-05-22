package my.intellij.androidlifecycleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    String msg = "Activity 2 : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Log.d(msg, "The onCreate() event");
    }

    public void newActivity(View view)
    {
        Intent intent = new Intent(NextActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void backActivity(View view)
    {
        finish();
    }
}