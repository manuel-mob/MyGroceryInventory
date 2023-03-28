package cl.mmoscoso.mygroceryinventory;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import cl.mmoscoso.mygroceryinventory.databinding.ActivityDetailOfProductBinding;

public class DetailOfProduct extends AppCompatActivity {

    TextView name;
    TextView value;
    TextView discount;
    TextView place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_of_product);

        name = (TextView)findViewById(R.id.name);
        value = (TextView)findViewById(R.id.value);
        discount = (TextView)findViewById(R.id.discount);
        place = (TextView)findViewById(R.id.place);

        String message = getIntent().getStringExtra("EXTRA_MESSAGE");
        name.setText(getIntent().getStringExtra("nombre"));
        value.setText(getIntent().getStringExtra("valor"));
        Boolean discountValue = getIntent().getBooleanExtra("descuento",false);
        if (discountValue){
            discount.setText("Con Descuento");
        }
        else {
            discount.setText("Sin Descuento :(");
        }
        place.setText(getIntent().getStringExtra("lugar"));

    }

}