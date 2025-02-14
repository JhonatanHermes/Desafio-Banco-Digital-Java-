public class Transacao {
  public static void transferir(Conta origem, Conta destino, double valor) {
      origem.sacar(valor);
      destino.depositar(valor);
  }
}
