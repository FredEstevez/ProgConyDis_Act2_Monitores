package Monitores;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Puente puente = new Puente();

        int totalCochesNorte = new Random().nextInt(20); // Número total de coches del norte (aleatorio menor a 45)
        int totalCochesSur = new Random().nextInt(20); // Número total de coches del sur (aleatorio menor a 45)

        for (int i = 0; i < totalCochesNorte; i++) {
            String cocheID = "del Norte No" + i;
            new Thread(new Coche(puente, cocheID)).start();
        }

        for (int i = 0; i < totalCochesSur; i++) {
            String cocheID = "del Sur No" + i;
            new Thread(new Coche(puente, cocheID)).start();
        }
    }
}