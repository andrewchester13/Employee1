package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonPressed(View v)
    {
        EditText fn = this.findViewById(R.id.inputfn);
        EditText ln = this.findViewById(R.id.inputln);
        EditText a = this.findViewById(R.id.inputa);
        EditText h = this.findViewById(R.id.inputh);
        EditText w = this.findViewById(R.id.inputw);
        TextView op = this.findViewById(R.id.textView3);

    String firstN = fn.getText().toString();
    String lastN = ln.getText().toString();
    int age = Integer.parseInt(a.getText().toString());
    int height = Integer.parseInt(h.getText().toString());
    int weight = Integer.parseInt(w.getText().toString());
Employee em= new Employee(firstN, lastN, age, height, weight);

    op.setText(em.toString());
    }

}
