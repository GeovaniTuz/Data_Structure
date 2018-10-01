/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambios2.pkg1;

import java.util.Scanner;

/**
 *
 * @author geoal
 */
public class Cambios21 {

    public static void main(String[] args) {
        // TODO code application logic here
        moned bil = new moned();
        Scanner x = new Scanner(System.in);
        int efectivo;
        int precio;
        int cam;

        System.out.println("Ingrese la cantidad de dinero: ");
        efectivo = x.nextInt();
        System.out.println("Ingrese el total del producto: ");
        precio = x.nextInt();

        cam = efectivo - precio;
        bil.bille(cam);
    }

}
