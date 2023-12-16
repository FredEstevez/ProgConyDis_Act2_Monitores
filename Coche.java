package Monitores;

import java.util.Random;

class Coche implements Runnable {
    private Puente puente;
    private String cocheID;

    public Coche(Puente puente, String cocheID) {
        this.puente = puente;
        this.cocheID = cocheID;
    }

    @Override
    public void run() {
        Random random = new Random();
        if (random.nextBoolean()) {
            puente.cruzarPuenteSur(cocheID);
        } else {
            puente.cruzarPuenteNorte(cocheID);
        }

        // Simulación de cruzar el puente
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        //puente.salirPuente();

        // Simulación de tiempo entre coches
        try {
            Thread.sleep(random.nextInt(2000) + 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
