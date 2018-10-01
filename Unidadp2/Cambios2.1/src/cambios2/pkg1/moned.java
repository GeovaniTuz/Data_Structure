/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambios2.pkg1;

/**
 *
 * @author geoal
 */
public class moned {

    public static void bille(int cambi) {

        int mil = 0, quinientos = 0, doscientos= 0, cien =0, cincuenta=0, veinte=0, diez=0, cinco=0, dos=0;
        int peso;

        if (cambi >= 1000) {
            mil = cambi / 1000;
            System.out.println("Numero de billetes de $1000: " + mil);
            bille(cambi % 1000);
        } else {

            if (cambi >= 500 && cambi <= 999) {
                quinientos = cambi / 500;
                System.out.println("Numero de billetes de $500: " + quinientos);
                bille(cambi % 500);
            } else {
                if (cambi >= 200 && cambi <= 499) {
                    doscientos = cambi / 200;
                    System.out.println("Numero de billetes de $200: " + doscientos);
                    bille(cambi % 200);
                } else {

                    if (cambi >= 100 && cambi <= 199) {
                        cien = cambi / 100;
                        System.out.println("Numero de billetes de $100: " + cien);
                        bille(cambi % 100);

                    } else {

                        if (cambi >= 50 && cambi <= 99) {
                            cincuenta = cambi / 50;
                            System.out.println("Numero de billetes de $50 " + cincuenta);
                            bille(cambi % 50);
                        } else {

                            if (cambi >= 20 && cambi <= 49) {
                                veinte = cambi / 20;
                                System.out.println("Numero de billetes de $20 " + veinte);
                                bille(cambi % 20);

                            } else {

                                if (cambi >= 10 && cambi <= 19) {

                                    diez = cambi / 10;
                                    System.out.println("Numero de monedas de $10 " + diez);
                                    bille(cambi % 10);

                                } else {

                                    if (cambi >= 5 && cambi <= 9) {
                                        cinco = cambi / 5;
                                        System.out.println("Numero de monedas de $5 " + cinco);
                                        bille(cambi % 5);
                                    } else {

                                        if (cambi >= 2 && cambi <= 4) {

                                            dos = cambi / 2;
                                            System.out.println("Numero de monedas de $2 " + dos);
                                            bille(cambi % 2);
                                        } else {

                                            if (cambi == 1) {
                                                peso = cambi / 1;
                                                System.out.println("Numero de monedas $1 " + peso);
                                            }else{
                                        }

                                    }

                                }
                            }
                        }
                    }

                }
            }
        }

    }
}
}