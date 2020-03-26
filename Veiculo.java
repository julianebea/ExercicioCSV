public class Veiculo{

    public enum categoriaDoVeiculo{
        SIMPLES, LUXO, NORMAL;
    }
    private String placa;
    private String marca;
    private String cor;
    private categoriaVeiculo categoria;

    public Veiculo(String placa, String marca, String cor, categoriaVeiculo categoria){
        this.placa = placa;
        this.marca = marca;
        this.cor = cor; 
        this.categoria = categoria;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public categoriaVeiculo getCategoriaVeiculo(){
        return categoria; 
    }
    
}