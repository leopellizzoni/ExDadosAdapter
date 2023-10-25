package com.leopellizzoni.exdadosadapter;

public class Produto {
    private String nome;
    private String descricao;
    private int imageResourceId;

    public static final Produto[] PRODUTOS = {
            new Produto("Café com Leite", "Café com leite importado", R.drawable.latte),
            new Produto("Café Expresso", "Café de minas gerias.", R.drawable.cappuccino),
            new Produto("Café Gelado", "Café de minas gerias mas servido gelado.", R.drawable.filter)
    };

    private Produto(String name, String descricao, int imageResourceId) {
        this.nome = name;
        this.descricao = descricao;
        this.imageResourceId = imageResourceId;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.nome;
    }
}