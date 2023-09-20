package sv.edu.universidad.lm_splashscreen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Handler manejador=new Handler();
        manejador.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent objVentana = new Intent(Home.this, MainActivity.class);
                startActivity(objVentana);
            }
        }, 3000);
    }
}