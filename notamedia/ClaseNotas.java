/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notamedia;

import javax.swing.JOptionPane;

/**
 *
 * @author socamporomani
 */
public class ClaseNotas {

    int media = 0;

    public float pedirNota() {
        float nota;
        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce nota"));
             if (nota==0){
            System.exit(0);
        }
        } 
        
        while (nota < 1 || nota > 10);
       
        System.out.println(nota);
        return nota;
    }

    public float calculoNotaTeorica() {
        float cont;
        float mediaTeorica = 0;
        float notaTeorica;
        for (cont = 1; cont < 3; cont++) {
//          do{
            JOptionPane.showMessageDialog(null, "Nota del " + (byte) cont + "º teórico");
            notaTeorica = pedirNota();
//       }while(notaTeorica<1 || notaTeorica>10);
            mediaTeorica = (mediaTeorica + notaTeorica);
        }
        mediaTeorica = mediaTeorica / 2;
        System.out.println(mediaTeorica);
        return mediaTeorica;
    }

    public float calculoNotaPractica() {
        float notaPractica;
        JOptionPane.showMessageDialog(null, "Ahora la nota del práctico");
        notaPractica = pedirNota();
        return notaPractica;
    }

    public float calculoBoletin() {
        float numeroBoletines = 0f;
        float boletinesCompletos = 0f;
        byte notaBoletin;
        numeroBoletines = Byte.parseByte(JOptionPane.showInputDialog("introduce Nº boletines"));
        boletinesCompletos = Byte.parseByte(JOptionPane.showInputDialog("boletines completados"));
        if ((numeroBoletines / boletinesCompletos) < 1.2f) {
            notaBoletin = 2;
        } else if ((numeroBoletines / boletinesCompletos) <= 1.43f) {
            notaBoletin = 1;
        } else {
            notaBoletin = 0;
        }
        System.out.println(notaBoletin);
        return notaBoletin;
    }

    public void mediaTotal() {
        float notaTeorico = calculoNotaTeorica();
        float notaPracico = calculoNotaPractica();
        float notaBoletin = calculoBoletin();
        media = (byte) ((notaBoletin) + (notaPracico * 0.40) + (notaTeorico * 0.40));
        media = Math.round(media);

        if (media < 5) {
           JOptionPane.showMessageDialog(null, "suspenso con un " + media);
        } else {
            JOptionPane.showMessageDialog(null, "aprobado con un " + media);
        }
        pedirNota();
    }
}
