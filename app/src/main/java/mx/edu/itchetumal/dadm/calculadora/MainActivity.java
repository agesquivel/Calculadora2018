package mx.edu.itchetumal.dadm.calculadora;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtResul;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnBorrar;

    char operador = 0;
    boolean bandResulBorrado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        edtResul = (EditText) findViewById(R.id.edtResultado);

        OyenteClic objDetectaClic = new OyenteClic();

        //Botón 1
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(objDetectaClic);

        //Botón 2
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(objDetectaClic);

        //Botón 3
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(objDetectaClic);

        //Botón 4
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(objDetectaClic);

        //Botón 5
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(objDetectaClic);

        //Botón 6
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(objDetectaClic);

        //Botón 7
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(objDetectaClic);

        //Botón 8
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(objDetectaClic);

        //Botón 9
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(objDetectaClic);

        //Botón 0
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(objDetectaClic);


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

   //Declaración de clase oyente

   class OyenteClic implements View.OnClickListener{

       @Override
       public void onClick(View v) {

          /*
           Toast.makeText(getApplicationContext(), "Botón presionado: "
                   + ((Button) v).getText(), Toast.LENGTH_LONG).show();
                   */

           if ((operador != 0) && !bandResulBorrado) {
               edtResul.setText(((Button) v).getText());
               bandResulBorrado = true;
           }
           else
           if (edtResul.getText().toString().compareTo("0") == 0)
               edtResul.setText(((Button) v).getText());
           else
               edtResul.setText( edtResul.getText() + ((Button) v).getText().toString() );

       }
   } //OyenteClic


} //MainActivity













