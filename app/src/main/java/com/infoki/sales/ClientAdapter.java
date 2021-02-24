package com.infoki.sales;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import sales.clients.transport.Clients;

public class ClientAdapter extends BaseAdapter {

    Context context;
    List<Clients> clients;

    public ClientAdapter(Context context, List<Clients> clients) {
        this.context = context;
        this.clients = clients;
    }

    @Override
    public int getCount() {
        return clients.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView Name;
        TextView Code;

        Clients c=clients.get(i);

        if(view==null)
            view= LayoutInflater.from(context).inflate(R.layout.listview_client, null);
        Name = view.findViewById(R.id.textViewName);
        Code = view.findViewById(R.id.textViewCode);

        Name.setText(c.getName());
        Code.setText(c.getCode());

        return view;
    }
}
