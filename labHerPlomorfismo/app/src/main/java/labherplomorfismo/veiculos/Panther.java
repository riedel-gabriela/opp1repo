package labherplomorfismo.veiculos;

import labherplomorfismo.categorias.Conversivel;
import labherplomorfismo.categorias.TracaoIntegral;
import labherplomorfismo.categorias.VeiculoAnfibio;

public class Panther extends Veiculo implements Conversivel, TracaoIntegral, VeiculoAnfibio {
    private Integer temperaturaGeladeira;
    private Boolean capota;
    private Boolean tracao;
    private Boolean rodas;
    private Boolean lastro;

    public Integer alterarTemperatura(int i) {
        this.temperaturaGeladeira = i;
        return this.temperaturaGeladeira;
    }

    @Override
    public Boolean abrirFecharCapota() {
        this.capota = !this.capota;
        return this.capota;
    }

    @Override
    public Boolean ativarDesativarTracao() {
        this.tracao = !this.tracao;
        return this.tracao;
}

    @Override
    Integer acelerar(int i) {
        if (i > 0) {
            this.velocidadeAtual += i;
        }
        return this.velocidadeAtual;
    }

    @Override
    Integer frear(int i) {
        if (this.velocidadeAtual - i >= 0) {
            this.velocidadeAtual -= i;
        } else {
            this.velocidadeAtual = 0;
        }
        return this.velocidadeAtual;
    }

    @Override
    public Boolean abrirRecolherRodas() {
        this.rodas = !this.rodas;
        return this.rodas;
    }

    @Override
    public Boolean esvaziarLastro() {
        this.lastro = !this.lastro;
        return this.lastro;
    }
}
