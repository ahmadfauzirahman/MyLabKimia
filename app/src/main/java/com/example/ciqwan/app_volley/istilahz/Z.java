package com.example.ciqwan.app_volley.istilahz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ciqwan.app_volley.istilahw.Wax;

/**
 * Created by AHMAD FAUZI RAHMAN on 26/06/2016.
 */
public class Z extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Zwitter Ion"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Listrs));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihanrs(pilihan);

    }

    private void tampilkanpilihanrs(String pilihan) {
        try {
            Intent i = null;
            if (pilihan.equals("Zwitter Ion")) {
                i = new Intent(this,ZwitterIon.class);

            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}