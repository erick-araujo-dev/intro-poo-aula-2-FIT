public class Main {
    public static void main(String[] args) {
        //Cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Erick");
        cliente1.setCpf(999999999);

        //Nota fiscal
        NotaFiscal nota1 = new NotaFiscal();
        nota1.imprimirNota(cliente1);
        nota1.calcularImposto(900.00);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println();
        //Produto
        Produto produto1 = new Produto();
        produto1.setNome("Arroz - Prato Fino");
        produto1.setCategoria("Mercearia");
        produto1.setCodigo(1);
        produto1.setEstoque(100);
        produto1.setPreco(27.99);

        Produto produto2 = new Produto();
        produto2.setNome("Feijão - Kicaldo");
        produto2.setCategoria("Mercearia");
        produto2.setCodigo(2);
        produto2.setEstoque(80);
        produto2.setPreco(12.99);


        produto1.atualizarPreco( 30.99);
        produto2.atualizarEstoque(20);
        produto2.atualizarEstoque(30);
        produto1.atualizarEstoque(30);
        produto2.atualizarPreco(25.99);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println();


        //Conta corrente
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setTitular("Antonio Bandeira");
        conta1.setConta(1234);
        conta1.setSaldo(1000d);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setTitular("Michael Jacksson");
        conta2.setConta(4321);
        conta2.setSaldo(500d);
        //

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta2.sacar(600d);
        conta1.sacar(409d);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        System.out.println();

        //Carro
        Carro carro1 = new Carro();
        carro1.setModelo("Onix");
        carro1.setMontadora("Chevrolet");
        carro1.setCor("Preta");
        carro1.setAnoFabricacao(2021);
        carro1.setValor(50d);

        carro1.alterarCor("Cinza");
        carro1.valorDesconto();


    }
}