public class NotaFiscal extends Cliente {

    public void calcularImposto(Double valorPedido){
        Double valorFinal = valorPedido * 1.05;
        System.out.println("Valor final com juros: " +  valorFinal);
    }
    public void imprimirNota(Cliente cliente){
        System.out.println("Nota fiscal emitida para: " + cliente.getNome() + " CPF: " + cliente.getCpf());

    }


}
