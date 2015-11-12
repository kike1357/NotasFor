
package EjercicioExamenFor;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjercicioExamenFor {

    
    public static void main(String[] args) {
       float i=0,ac=0;
       float nota1,nota2,nota3;
       String alumno;
       float calcularNotaMedia;
       for(i=0;i<30;i++){
       Examen n= new Examen();
       alumno=n.Alumno();
       nota1=n.getNota();
       nota2=n.getNota();
       nota3=n.getNota();
      calcularNotaMedia= n.calcularNotaMedia(nota1,nota2,nota3);
       n.NotaMedia(calcularNotaMedia,alumno);
       
    }
    
}
}