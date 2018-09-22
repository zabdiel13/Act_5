package com.example.adrianzabdiel.act_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<String> usuario = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nombre = (EditText) findViewById(R.id.editText);
        final EditText apellido = (EditText) findViewById(R.id.editText2);
        final EditText edad = (EditText) findViewById(R.id.editText3);
        final Button button = (Button) findViewById(R.id.button);
        listView =(ListView)findViewById(R.id.listView);
        final ArrayAdapter<String>Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,usuario);
        listView.setAdapter(Adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(null);
                String Name = nombre.getText().toString();
                String Lastname = apellido.getText().toString();
                String Age = edad.getText().toString();
                usuario.add(Name);
                usuario.add(Lastname);
                usuario.add(Age);
                listView.setAdapter(Adapter);
            }
        });
    }
}

