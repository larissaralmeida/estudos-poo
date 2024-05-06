package aula07b;

public class Combate {
    public static void main(String[] args) {

        Lutador[] l = new Lutador[2];

        l[0] = new Lutador("Larissa", "França", 30,
                1.72F, 75.4F, 11, 2, 5);
        l[1] = new Lutador ("Joao", "Los Angeles", 29, 1.80F, 80.2F,
                10, 5, 8);


        Luta luta01 = new Luta();
        luta01.marcarLuta(l[0], l[1]);
        luta01.lutar();
        l[0].status();
    }
}
