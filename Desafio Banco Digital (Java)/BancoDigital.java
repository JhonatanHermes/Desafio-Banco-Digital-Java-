public class BancoDigital {
  public static void main(String[] args) {
      Cliente cliente1 = new Cliente("João", "12345678901");
      Conta conta1 = new ContaCorrente(cliente1);
      
      cliente1.adicionarConta(conta1);
      
      conta1.depositar(1000);
      System.out.println("Saldo após depósito: " + conta1.getSaldo());
      
      Conta conta2 = new ContaPoupanca(new Cliente("Maria", "98765432100"));
      conta2.depositar(500);
      
      Transacao.transferir(conta1, conta2, 200);
      System.out.println("Saldo de João após transferência: " + conta1.getSaldo());
      System.out.println("Saldo de Maria após transferência: " + conta2.getSaldo());
  }
}
