package com.example.rango;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListaAdapterItem extends ArrayAdapter<Item> {

    private Context context;
    private ArrayList<Item> lista;

    public ListaAdapterItem(Context context, ArrayList<Item> lista){
        super(context,0,lista);
        this.context = context;
        this.lista = lista;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item itemPosicao = this.lista.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.item,null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(itemPosicao.getImagem());

        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        textView.setText(itemPosicao.getNome());

        TextView textViewPreco = (TextView) convertView.findViewById(R.id.textView2);
        textViewPreco.setText(itemPosicao.getPreco());

        return convertView;
    }
}
