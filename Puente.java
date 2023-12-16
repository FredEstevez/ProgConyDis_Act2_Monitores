package Monitores;

import java.util.LinkedList;
import java.util.Queue;

class Puente {
    private boolean direccionActualSur;
    private Queue<String> colaSur;
    private Queue<String> colaNorte;

    public Puente() {
        direccionActualSur = true; // Inicialmente, la dirección es sur
        colaSur = new LinkedList<>();
        colaNorte = new LinkedList<>();
    }

    public void cruzarPuenteSur(String cocheID) {
        synchronized (this) {
            if (!direccionActualSur || !colaSur.isEmpty()) {
                colaSur.add(cocheID);
          
            } else {
                System.out.println("Coche " + cocheID + " cruzando el puente.");
             
                System.out.println("Coche " + cocheID + " saliendo del puente.");
            }
        }
    }

    public void cruzarPuenteNorte(String cocheID) {
        synchronized (this) {
            if (direccionActualSur || !colaNorte.isEmpty()) {
                colaNorte.add(cocheID);
           
            } else {
                System.out.println("Coche " + cocheID + " cruzando el puente.");
            
                System.out.println("Coche " + cocheID + " saliendo del puente.");
            }
        }
    }

}