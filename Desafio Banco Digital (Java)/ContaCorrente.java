public class ContaCorrente extends Conta {
  public ContaCorrente(Cliente cliente) {
      super(cliente);
  }

  @Override
  public void sacar(double valor) {
      // Conta Corrente pode ter um limite de saque
      if (valor <= (getSaldo() + 500)) {
          super.sacar(valor);
      } else {
          System.out.println("Limite de saque excedido.");
      }
  }
}
