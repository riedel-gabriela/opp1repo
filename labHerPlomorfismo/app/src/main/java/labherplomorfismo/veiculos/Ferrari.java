package labherplomorfismo.veiculos;

import labherplomorfismo.categorias.Conversivel;

public class Ferrari extends Veiculo implements Conversivel {
    private Boolean farol;
    private Boolean capota;

    protected Ferrari() {
        super();
    }

    public boolean ligarDesligarFarol() {
        this.farol = !this.farol;
        return this.farol;
    }

    @Override
    public Boolean abrirFecharCapota() {
        this.capota = !this.capota;
        return this.capota;
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
