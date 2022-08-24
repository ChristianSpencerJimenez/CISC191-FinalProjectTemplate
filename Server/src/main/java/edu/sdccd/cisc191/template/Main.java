package edu.sdccd.cisc191.template;

import static java.lang.Math.*;
import java.lang.Math;

/* This is my IfElse Project example for
 * My week one PART2 lighting talk.
 * Thank you for listening!
 * @author Christian Jimenez
 */
public class Main {
    public static void main(String[] args) {

        int hotWater, roomWater, boilingWater, coldWater;
        //I have made 3 water temps, I will plug both into my program to example what the if else statements do!
        hotWater = 190;
        roomWater = 78;
        boilingWater = 280;
        coldWater = 40;
        double x = Math.random(); // CHANGING THIS VARIABLE WILL CHANGE RESULT
        x=x*64;
        if (x < 50) {
            System.out.println("This water is cold, The temperature in Fahrenheit is " + x + "°");
        } else if (x < 78) {
            System.out.println("This water is below room temperature, it's temperature in Fahrenheit is " + x + "°");
        } else if (x == 78) {
            System.out.println("This water is exactly room temperature, it's temperature in Fahrenheit is " + x + "°");
        } else if (x < 100) {
            System.out.println("This water is very warm, it's temperature in Fahrenheit is " + x + "°");
        } else if (x <= 190) {
            System.out.println("This water is really hot! The temperature is " + x + "°");
        } else if (x < 212) {
            System.out.println("This water is extremely hot! The temperature is " + x + "°");
        } else {
            System.out.println("This water is above boiling! The temperature is " + x + "°");
        }
    }
}

