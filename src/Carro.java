public class Carro {
    private String modelo;
    private String montadora;
    private String cor;
    private Integer anoFabricacao;
    private Double valor;

    public void alterarCor(String cor){
        this.cor = cor;
        System.out.println("Cor do do veículo: " + this.modelo + " alterada para: " + cor);
    }

    public void valorDesconto(){

        Double valorPromocional = this.valor - (this.valor*0.05);
        System.out.println("Valor promocional: R$" + valorPromocional);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
