/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //variables & Constantes
        final int MAX = 500;
        final int MIN = 0;

        int dias;
        int diaMx = 0;
        int diaMn = 0;
        int lluvia;
        int totalL = 0;
        int maxL = 0;
        int minL = 500;

        //Inicio bucle
        dias = 1;

        do {
//            Variable aleatoria para medir la lluvia
            int lluviaR = RND.nextInt(MAX - MIN + 1) + MIN;
            
//            Sumamos 1 a la variable
            totalL += lluviaR;
            
//            Asignamos el valor de lluviaR a la variable lluvia
            lluvia = lluviaR;
            System.out.printf("Lluvia dia %d .......................: %d L/M2%n"
                    ,dias, lluvia);
            
//            Si los litros maximos es igual-inferior a lluvia...
            if (maxL <= lluvia) {
                maxL = lluvia;
                diaMx = dias;

            }
//            Si los litros minimos son igual-mayor que lluvia...
            if (minL >= lluvia) {
                minL = lluvia;
                diaMn = dias;
            }
//            +1 dia en el contador de dias
            dias++;
            
//            Mientras dias sea inferior-igual a siete continuará
        } while (dias <= 7);
            System.out.println("---");
//            Total litros en toda la semana
            System.out.printf("Lluvia total durante la semana .....: %d L/m2 %n"
                , totalL);

//          Día lluvia máxima registrada
            System.out.printf("Lluvia máxima ......................: %d L/m2%n"
                    , maxL);

//          Día lluvia mínima registrada
            System.out.printf("Lluvia mínima ......................: %d L/m2%n"
                    , minL);
            System.out.println("---");
            System.out.println("END");

    }

}
