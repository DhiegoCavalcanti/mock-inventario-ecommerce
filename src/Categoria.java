package src.main.java;

import java.util.List;

public class Categoria {
    private int id;
    private String nome;
    private List<String> subcategorias;

    public Categoria(int id, String nome, List<String> subcategorias) {
        this.id = id;
        this.nome = nome;
        this.subcategorias = subcategorias;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getSubcategorias() {
        return subcategorias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSubcategorias(List<String> subcategorias) {
        this.subcategorias = subcategorias;
    }
}
