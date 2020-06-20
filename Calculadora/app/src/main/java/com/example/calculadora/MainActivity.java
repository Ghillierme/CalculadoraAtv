package com.example.calculadora;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.nfc.FormatException;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnSub;
    Button btnMulti;
    Button btnDiv;

    double n1, n2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        result = (TextView)findViewById(R.id.txtResult);
        btnSoma = (Button)findViewById(R.id.btnCalc1);
        btnSub = (Button)findViewById(R.id.btnCalc2);
        btnMulti = (Button)findViewById(R.id.btnCalc3);
        btnDiv = (Button)findViewById(R.id.btnCalc4);
    }
    public void Somar(View buttons)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            res = n1 + n2;
        }
        catch(NumberFormatException a){
            Toast messageBox = Toast.makeText(this,"Tem algo errado!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Double.toString(res));
    }
    public void Subtrair(View buttons)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            res = n1 - n2;
        }
        catch(NumberFormatException a){
            Toast messageBox = Toast.makeText(this,"Tem algo errado!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Double.toString(res));
    }
    public void Multiplicar(View buttons)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            res = n1 * n2;
        }
        catch(NumberFormatException a){
            Toast messageBox = Toast.makeText(this,"Tem algo errado!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Double.toString(res));
    }
    public void Dividir(View buttons)
    {
        int i = 0;
        n2 = 0;
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            res = n1 / n2;
        }
        catch(NumberFormatException a){
            Toast messageBox = Toast.makeText(this,"Tem algo errado!", Toast.LENGTH_SHORT);
            messageBox.show();
            i = 1;
        }
        if ((n2 == 0) && i == 0){
            Toast messageBox = Toast.makeText(this,"Impossível dividir!", Toast.LENGTH_SHORT);
            messageBox.show();
            i = 0;
        }
        else {
            result.setText(Double.toString(res));
        }
    }
}
