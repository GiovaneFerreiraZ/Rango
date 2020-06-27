package com.example.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EscolherLanches extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_lanches);

        final ArrayList<Item> lista = new ArrayList<Item>();

        Item a = new Item(R.drawable.xbacon,"X-Bacon","$:13,99");
        Item b = new Item(R.drawable.xsalada,"X-Salada","$:12,99");
        Item c = new Item(R.drawable.cachorroquente,"Cachorro - Quente","$:15,99");
        Item d = new Item(R.drawable.xcalabresa,"XCalabresa","$:13,99");
        Item e = new Item(R.drawable.xcatupiry,"X-Catupiru","$:16,00");
        Item f = new Item(R.drawable.combo,"Combo","$:25,00");
        Item g = new Item(R.drawable.xtudo,"X-Tudo","$:20,00");
        Item h = new Item(R.drawable.duplo,"Duplo","$:17,50");


        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        lista.add(h);

        final ListaAdapterItem adapterItem = new ListaAdapterItem(this,lista);

        ListView listView = (ListView)findViewById(R.id.ListView);

        listView.setAdapter(adapterItem);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Nome: "+lista.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Pagar(View view){
        Intent intent = new Intent(this,FazerPagamento.class);
        startActivity(intent);
    }


}
