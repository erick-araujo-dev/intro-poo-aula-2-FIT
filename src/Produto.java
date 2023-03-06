public class Produto {
    private Integer codigo;
    private String nome;
    private String categoria;
    private Double preco;
    private Integer estoque;


    public void atualizarEstoque(Integer estoque){
        this.estoque= estoque;
        System.out.println("Produto: " + this.nome + " - Estoque: " + estoque);
    }

    public void atualizarPreco(Double preco){
        this.preco = preco;
        System.out.println("Valor do produto: "+ this.nome + " - atualizado para R$"+ preco);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
