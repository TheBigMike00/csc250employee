package com.example.csc250employee;

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

        EditText fn = this.findViewById(R.id.inputfnET);
        EditText ln = this.findViewById(R.id.inputlnET);
        EditText a = this.findViewById(R.id.inputageET);
        EditText h = this.findViewById(R.id.inputhET);
        EditText w = this.findViewById(R.id.inputwET);
        TextView op = this.findViewById(R.id.enteredInfo);

        String firstName = fn.getText().toString();
        String lastName = ln.getText().toString();
        int age = Integer.parseInt(a.getText().toString());
        int height = Integer.parseInt(h.getText().toString());
        int weight = Integer.parseInt(w.getText().toString());
        Employee em = new Employee(firstName, lastName, age, height, weight);

        op.setText(em.toString());
    }
}
