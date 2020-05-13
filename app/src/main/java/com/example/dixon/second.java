package com.example.dixon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class second extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button button1;
    EditText text1;
    Spinner spin1,spin2,spin3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1=findViewById(R.id.button3);
        text1 = findViewById(R.id.editText4);

        spin1 = findViewById(R.id.spinner1);
        final String college = spin1.getSelectedItem().toString();

        spin2 = findViewById(R.id.spinner2);
        final String branch = spin2.getSelectedItem().toString();

        spin3 = findViewById(R.id.spinner3);
        final String copy = spin3.getSelectedItem().toString();

        final String stid = text1.getText().toString().trim();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.number, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);
        spin1.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.number1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter1);
        spin2.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.number2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter2);
        spin3.setOnItemSelectedListener(this);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (TextUtils.isEmpty(college)) {
                    Toast.makeText(second.this, "SELECT COLLEGE", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(branch)) {
                    Toast.makeText(second.this, "SELECT BRANCH", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(copy)) {
                    Toast.makeText(second.this, "SELECT NUMBER OF COPIES", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(stid)) {
                    Toast.makeText(second.this, "ENTER STUDENT ID", Toast.LENGTH_SHORT).show();
                }


            }
            });

            }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
