package aula;

public enum Planeta {
    MERCURIO(1, "Um planeta muito quente."),
    VENUS(2, "Da pra ver esse planeta da superfície da terra."),
    TERRA(3, "Possui seres vivos e muita biodiversidade."),
    MARTE(4, "Não se sabe se tem vida, mas suspeita-se."),
    JUPITER(5, "Muitas luas."),
    SATURNO(6, "Muitos anéis."),
    URANO(7, "Terceiro maior planeta do sistema solar."),
    NETUNO(8, "Planeta azul e gasoso.");

    public final int pos;
    public final String curiosidade;

    Planeta(int pos, String curiosidade) {
        this.pos = pos;
        this.curiosidade = curiosidade;
    }
}
