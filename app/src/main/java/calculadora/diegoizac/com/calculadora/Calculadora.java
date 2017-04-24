package calculadora.diegoizac.com.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends Activity {

    private EditText edNUM1;
    private EditText edNUM2;
    private EditText edSOMA;
    private Button btSOMA;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        edNUM1 = (EditText) findViewById(R.id.edNUM1);
        edNUM2 = (EditText) findViewById(R.id.edNUM2);
        edSOMA = (EditText) findViewById(R.id.edSOMA);


        btSOMA = (Button)findViewById(R.id.btSOMA);

    }

    public void facaASoma(View v){
        int x,y;

        x=Integer.valueOf(edNUM1.getText().toString());
        y=Integer.valueOf(edNUM2.getText().toString());

        int soma = x+y;

       edSOMA.setText(String.valueOf(soma));

    }
}
