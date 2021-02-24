package com.infoki.sales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sales.clients.transport.Clients;

public class MainActivity extends AppCompatActivity {

    ListView ListViewClients;
    List<Clients> clients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewClients = findViewById(R.id.ListViewClient);

        ClientAdapter adapter = new ClientAdapter(this, GetData());
        ListViewClients.setAdapter(adapter);

        ListViewClients.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Clients c = clients.get(i);
                Toast.makeText(getBaseContext(),c.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        // 3- Create a ListView with Scroll to show Code and Name of each Client, the dao has the method loadClientsList to get this data retriven an ArrayList of Clients

        // 4- When we click on a client in the list, it has to shows the data of the clients (code, name, quote and notes) on the screen
    }

    private List<Clients> GetData() {
        clients = new ArrayList<>();
        clients.add()

    }
    }
