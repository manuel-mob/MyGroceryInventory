package cl.mmoscoso.mygroceryinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLogin = null;
    String tagLog = "MainActivity";

    DetailOfProduct detailOfProduct;

    String nombre = "Detergente";
    String valor = "4.990";
    Boolean descuento = true;
    String lugar = "Comerncial Compras SpA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        buttonLogin = (Button) findViewById(R.id.button);
        buttonLogin.setOnClickListener(this);

    }

    protected void onStart() {
        super.onStart();
        Log.i(tagLog,"OnStart");
    }

    protected void onStop() {
        super.onStop();
        Log.i(tagLog,"onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(tagLog,"onDestroy");
    }

    protected void onPostResume() {
        super.onPostResume();
        Log.i(tagLog,"onPostResume");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Log.i("OnClickListerner","Button LOGIN Ok");
                Toast.makeText(this,"Hi Hi, Login go",Toast.LENGTH_LONG).show();


                Intent intent = new Intent(MainActivity.this, DetailOfProduct.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("valor", valor);
                intent.putExtra("descuento", descuento);
                intent.putExtra("lugar", lugar);
                startActivity(intent);


        }
    }
}