package aula;

public enum DiaDaSemana {
    DOM("Domingo", 1),
    SEG("Segunda-Feira", 2),
    TER("Terça-Feira", 3),
    QUA("Quarta-Feira", 4),
    QUI("Quinta-Feira", 5),
    SEX("Sexta-Feira", 6),
    SAB("Sábado", 7);

    public final String extenso;
    public final Integer codigo;

    DiaDaSemana(String s, Integer i) {
        this.extenso = s;
        this.codigo = i;
    }

    public static DiaDaSemana getByCodigo(int c) {
        for (DiaDaSemana d: DiaDaSemana.values()) {
            if (d.codigo == c) {
                return d;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DiaDaSemana{");
        sb.append("extenso='").append(extenso).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
