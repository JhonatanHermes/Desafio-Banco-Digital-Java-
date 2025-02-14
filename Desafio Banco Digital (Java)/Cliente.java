public class Cliente {
  private String nome;
  private String cpf;
  private List<Conta> contas;
  
  public Cliente(String nome, String cpf) {
      this.nome = nome;
      this.cpf = cpf;
      this.contas = new ArrayList<>();
  }

  public void adicionarConta(Conta conta) {
      contas.add(conta);
  }
}
