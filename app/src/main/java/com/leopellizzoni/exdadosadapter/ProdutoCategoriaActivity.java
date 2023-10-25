package com.leopellizzoni.exdadosadapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProdutoCategoriaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_categoria);

        ArrayAdapter<Produto> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Produto.PRODUTOS);

        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> listDrinks,
                                    View itemView,
                                    int position,
                                    long id) {
                //Pass the drink the user clicks on to DrinkActivity
                Intent intent = new Intent(ProdutoCategoriaActivity.this,
                        ProdutoActivity.class);
                intent.putExtra(ProdutoActivity.EXTRA_PRODUTO_ID, (int) id);
                startActivity(intent);
            }
        };

        listDrinks.setOnItemClickListener(itemClickListener);
    }
}