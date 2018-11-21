/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obxectosextras;
import javax.swing.JOptionPane;
/**
 *
 * @author socamporomani
 */
public class Garaxe {
    private int numeroCoches;
    private String matricula;
        
    public void plazas(){
        int cochesEnGaraje=0;
        boolean libre=false;
       do{
           if(JOptionPane.showConfirmDialog(null, "Nuevo coche?", "Siguiente",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION && cochesEnGaraje<3){
             matricula= JOptionPane.showInputDialog("Introduce matricula");
            cochesEnGaraje++;
            libre=true;
               System.out.println(matricula);
               System.out.println(cochesEnGaraje);
            JOptionPane.showMessageDialog(null,"PLAZAS DISPONIBLES");
        }
        else{
               libre=false;
            JOptionPane.showMessageDialog(null,"OCUPADO");
                    }
    } while (libre == true);
       }
       }
    
    
    
    

