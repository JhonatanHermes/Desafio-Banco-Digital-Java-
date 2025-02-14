public class Conta {
  private double saldo;
  private Cliente cliente;
  
  public Conta(Cliente cliente) {
      this.cliente = cliente;
      this.saldo = 0.0;
  }

  public void depositar(double valor) {
      this.saldo += valor;
  }

  public void sacar(double valor) {
      if (valor <= saldo) {
          saldo -= valor;
      } else {
          System.out.println("Saldo insuficiente.");
      }
  }

  public double getSaldo() {
      return saldo;
  }
}
