/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
 try {
            System.out.println(Convertir_km_seg(40));
    
            System.out.println(Convertir_cm_lt(3500));

            System.out.println(Convertir_us_cops(45623));

            System.out.println(Convertir_cent_far(0));

            System.out.println(Calcular_segs(1, 1, 1, 1));

            System.out.println(Calcular_peso_carga(47.5, 7.5));

            System.out.println(Calcular_horasxviaje(null, 285, 72));

            System.out.println(Calcular_combustible(638, 312, 1243, 220));

            System.out.println(Calcular_peso_luna(80));

         } catch (Exception e) {
            // TODO: handle exception
         }

     }
    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */

public static String Convertir_km_seg (int velocidad_km_seg){

      try {
       
       //Declarar Variables

         float velocidad_m_s = 0;
         float  velocidad_m_h = 0;

         //Proceso

         final float metro_segundo_cste = 1000;
         final float metro_hora_cste = 3600000;

         velocidad_m_s = velocidad_km_seg * metro_segundo_cste;
     velocidad_m_h = velocidad_km_seg * metro_hora_cste;

         return (velocidad_m_s + " m/s - " + velocidad_m_h + " m/h");         
     }
       catch (Exception e) {
        return "Error en la conversacion";
      }
     }
    
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */

 public static float Convertir_cm_lt(double cen_cubicos) {
      try {
        float litros = 0;
          return (float) cen_cubicos / 1000;
      } catch (Exception e) {
          return 0;
      }
  }

   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */

public static int Convertir_us_cops(int dolares) {
    try {
        int cambio = 4170;
        return cambio * dolares;
    } catch (Exception e) {
        return -1;
    }
}
    
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

     public static double Convertir_cent_far (double celsius){

        try {
            float Fahrenheit = 0;
            return 32 + (9 * celsius / 5);
        } catch (Exception e) {
            return 0;
        }
    }

          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
 public static int Calcular_segs(int dias, int horas, int minutos, int segundos) {
    try {
        int total_segundos = (dias * 24 * 3600) + (horas * 3600) + (minutos * 60) + segundos;
        return total_segundos;
    } catch (Exception e) {
        return -1;
    }
}

   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

 
   public static String Calcular_peso_carga(double toneladas_cargado, double toneladas_vacio){

    try {
            double peso_toneladas_cargado = toneladas_cargado - toneladas_vacio;
            double peso_kilos_cargado = peso_toneladas_cargado * 1000;
            return (peso_kilos_cargado + " kilos - " + peso_toneladas_cargado + " toneladas");

        } catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }
    }
   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

public static float Calcular_horasxviaje(String destino,int distancia, int velocidad) {
    try {
      //Declarar Variables y Proceso

        float horas = 0;
        horas = (float) distancia / velocidad;
        return horas; 

    } catch (Exception e) {     
        return -1;
    }
  }
  //ME DA 3.9 CON LOS DATOS QUE PUSE NO SE PORQUE NO ME DA EL 3.0
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
public static float Calcular_combustible(int gasto1, int gasto2, int gasto3, int gasto4) {
  try {
      final float combustible_fijo = (float) 0.2;
      final float despegar_aterrizar = (float) 1.6;
      final float km_crucero = (float) 60.8;
      float combustible_suficiente = (((combustible_fijo * gasto1) / km_crucero) + despegar_aterrizar) +
                                     (((combustible_fijo * gasto2) / km_crucero) + despegar_aterrizar) +
                                     (((combustible_fijo * gasto3) / km_crucero) + despegar_aterrizar) +
                                     (((combustible_fijo * gasto4) / km_crucero) + despegar_aterrizar);
      return combustible_suficiente;
  } catch (Exception e) {
      return -1;
  }
}

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
 public static double Calcular_peso_luna(int kilos) {
    try {

        double luna_peso = kilos * 9.81 * 0.165;
        return luna_peso;

    } catch (Exception e) {
        return 0;
    }
}
   }

//No me da exactamente sino que me da una secuencia de 0000000 o algo asi.

   
   
   
}
