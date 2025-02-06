package labherplomorfismo.veiculos;

import labherplomorfismo.categorias.TracaoIntegral;

public class Pampa extends Veiculo implements TracaoIntegral {
    private Boolean cacamba;
    private Boolean tracao;

    public Boolean abrirFecharCacamba() {
        this.cacamba = !this.cacamba;
        return this.cacamba;
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
}
