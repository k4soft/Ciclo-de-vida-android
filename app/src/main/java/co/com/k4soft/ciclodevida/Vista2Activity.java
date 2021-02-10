package co.com.k4soft.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Vista2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume activity 2", Toast.LENGTH_LONG).show();
        Log.d("->","onResume()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop activity 2", Toast.LENGTH_LONG).show();
        Log.d("->","onStop()");
    }
}
