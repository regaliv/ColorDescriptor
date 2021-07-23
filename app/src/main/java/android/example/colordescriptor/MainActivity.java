package android.example.colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textviewDescriptionTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        textviewDescriptionTemp = findViewById(R.id.textviewDescriptionTemp);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescritionByPositiion(position);
        textviewDescriptionTemp.setText(description);
    }

    private String getDescritionByPositiion(int position){
        String[] description = getResources().getStringArray(R.array.description_of_temp);
        return description[position];
    }
}