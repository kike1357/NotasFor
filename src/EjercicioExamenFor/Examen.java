/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExamenFor;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Examen {
    float i=0,ac=0;
    float nota,nota1,nota2,nota3;
    String alumno;
    
    public String Alumno() {
        this.alumno=alumno;
        return JOptionPane.showInputDialog("Introducir alumno : ");
    }
    
    public float getNota(){
    return Float.parseFloat(JOptionPane.showInputDialog("Introducir  nota :"));
    
    }
    
    public float calcularNotaMedia(float nota1,float nota2,float nota3){
        this.nota1=nota;
        this.nota2=nota;
        this.nota3=nota;
        return ((nota1+nota2+nota3)/3);
    }
     public void NotaMedia (float calcularNotaMedia,String Alumno){
      JOptionPane.showMessageDialog(null, "La nota media de el alumno "+Alumno+" es de "+calcularNotaMedia );
    }
}      
    
    
    
    
    
    
   

    
    
    

