// author: Carolina Marugan

import java.util.Scanner;
public class Dias{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    double current = s.nextDouble();
    
    
    if(current == -1){} // caso base por si no hay datos
    else{
      while(current != -1){
        double suma = 0.0;
        double domingo = 0.0;
        double min = current; String minD = "";
        double max = current; String maxD = "";
        for(int i = 0; i < 6; i++){
          suma += current;
          if(i == 5){ domingo = current; }
          if(min > current || minD == ""){ 
            min = current;
            switch(i){
              case 0: minD = "MARTES";
              break;
              case 1: minD = "MIERCOLES";
              break;
              case 2: minD = "JUEVES";
              break;
              case 3: minD = "VIERNES";
              break;
              case 4: minD = "SABADO";
              break;
              case 5: minD = "DOMINGO";
              break;
            }
          }
          if(current > max || maxD == ""){ 
            max = current; 
          	switch(i){
              case 0: maxD = "MARTES";
              break;
              case 1: maxD = "MIERCOLES";
              break;
              case 2: maxD = "JUEVES";
              break;
              case 3: maxD = "VIERNES";
              break;
              case 4: maxD = "SABADO";
              break;
              case 5: maxD = "DOMINGO";
              break;
            }
          }
          current = s.nextDouble();
        }
        
        double media = suma / 6;
        if(max == min){
            System.out.print("EMPATE ");
        }else{
            System.out.print(maxD + " " + minD + " ");
        }
        if(domingo > media){ System.out.print("SI\n");}
        else{ System.out.print("NO\n");}
      }
    }
    
    s.close();
  }
}
