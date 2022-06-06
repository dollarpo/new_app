package com.example.new_app;

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

    public void onBtnClick(View view) {
        EditText edtTxtFname = findViewById(R.id.edtTxtFname);
        EditText edtTxtLname = findViewById(R.id.edtTxtLname);
        EditText edtTxtEmail = findViewById(R.id.edtEmail);

        TextView txtFname = findViewById(R.id.txtFname);
        TextView txtLname = findViewById(R.id.txtLname);
        TextView txtEmail = findViewById(R.id.txtEmail);


        txtFname.setText("First Name: " + edtTxtFname.getText().toString());
        txtLname.setText("Last Name: " + edtTxtLname.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());

    }

}