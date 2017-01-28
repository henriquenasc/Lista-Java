package lista15q02;

public class Produtos {
    private String codigo;
    private String nomeFornecedor;
    private String descricao;
    private int qntMinima;
    private int qntReal;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQntMinima() {
        return qntMinima;
    }

    public void setQntMinima(int qntMinima) {
        this.qntMinima = qntMinima;
    }

    public int getQntReal() {
        return qntReal;
    }

    public void setQntReal(int qntReal) {
        this.qntReal = qntReal;
    }
    
}
