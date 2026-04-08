package apoio;

public class ItemRelatorio {
    private String descricao;
    private double Valor;

    public ItemRelatorio(String descricao, double valor) {
        this.descricao = descricao;
        this.Valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.Valor;
    }

}
