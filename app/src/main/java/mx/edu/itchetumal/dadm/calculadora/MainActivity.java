package mx.edu.itchetumal.dadm.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtResul;
    Button btn1, btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        edtResul = (EditText) findViewById(R.id.edtResultado);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*Toast.makeText(MainActivity.this,
                        "Presionaste el botón 1",
                        Toast.LENGTH_SHORT).show();*/
                if (edtResul.getText().toString().compareTo("0") == 0)
                    edtResul.setText("1");
                else
                    edtResul.setText( edtResul.getText() + "1" );

            }
        }
        );

        //Programar el click del botón borrar (C)
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               edtResul.setText("0");
            }
        }
        );

    }


}
