public class Motorista{

    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagto[] formaPgto; 

    public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagto[] formaPgto){
        this.cpf = cpf; 
        this.nome = nome;
        this.veiculo = veiculo;
        this.formaPgto = formaPgto;
    }

    public String getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public FormaPagto[] getFormaPgto(){
        return formaPgto;
    }
}