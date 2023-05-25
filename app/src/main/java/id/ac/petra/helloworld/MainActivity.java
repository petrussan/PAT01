package id.ac.petra.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Toast toast = Toast.makeText
                (this,"Application Started", Toast.LENGTH_LONG);
        toast.show();

        nama = findViewById(R.id.etNama);
        b1 = findViewById(R.id.b1);
        tv1 = findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Hello "+nama.getText());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText
                (this,"Application Closed", Toast.LENGTH_LONG);
        toast.show();
    }
}