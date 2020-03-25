public class Passageiro {

  public enum FormaPagamento {
    DINHEIRO, CARTAO, TODAS
  }

  private String cpf;
  private String nome;
  private String numeroCartao;
  private FormaPagamento formaPgto;

  public Passageiro(String cpf, String nome, String nrCartao, FormaPagamento pgto) {
    this.cpf = cpf;
    this.nome = nome;
    this.formaPgto = pgto;
    this.numeroCartao = nrCartao;
  }

  public String getCPF() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }

  public FormaPagamento getFormaPgto() {
    return formaPgto;
  }

  public String getNroCartao() {
    return numeroCartao;
  }
}