public class ContaCorrente {
    private String titular;
    private Integer conta;
    private Double saldo;

    public void sacar(Double valorSaque){
        if(this.saldo > valorSaque) {
            this.saldo = this.saldo - valorSaque;
            if(this.saldo >= 0){
                System.out.println("Saque no valor de R$"+valorSaque + " - Novo saldo - R$"+this.saldo);
            }
        }else{
            System.out.println("ERRO: Saldo insuficiente - Saldo atual: R$"+this.saldo + " - Saque: R$"+valorSaque);
        }
    }

    public void mostrarSaldo(){
        System.out.println("Olá " + this.titular + " seus saldo é: R$" + this.saldo);
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
