package com.leopellizzoni.exdadosadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProdutoActivity extends Activity {
    public static final String EXTRA_PRODUTO_ID = "produtoID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_PRODUTO_ID);
        Produto produto = Produto.PRODUTOS[drinkId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(produto.getNome());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(produto.getDescricao());

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(produto.getImageResourceId());
        photo.setContentDescription(produto.getNome());
    }
}