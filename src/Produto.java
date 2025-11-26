package src.main.java;
import java.math.BigDecimal;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque;
    private Fornecedor fornecedor;
    private Categoria categoria;

    public Produto(int id, String nome, String descricao, double preco, int estoque, Fornecedor fornecedor, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao; 
        this.preco = new BigDecimal(preco);
        this.estoque = estoque;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
