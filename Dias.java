/*
STATEMENT:

Debido a la crisis, el bar de Javier ha notado un descenso de las consumiciones. Además, 
según dicen en los telediarios, la ley antitabaco le está perjudicando aún más. Como no termina 
de creerse todo lo que dicen en la televisión, ha decidido hacer un estudio de mercado semanal de 
su establecimiento. Para ello, ha estado apuntando la caja diaria que se ha realizado en las últimas semanas. 
Le gustaría saber qué día de la semana se producen el mayor y el menor número de ventas, y si las ventas del 
domingo superan a la media semanal. De esta manera podrá establecer estrategias de marketing que le permitan 
recuperar algo de las ganancias perdidas.

Javier abre su bar todos los días menos los Lunes, que utiliza para descansar.

Realiza un programa que ayude a Javier en su cometido. Dada una lista de valores correspondiente a una 
semana, nuestro programa deberá decirle a Javier el día de la semana que más y menos ha vendido, y si las 
ventas del domingo superan la media.
*/

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
