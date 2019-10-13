/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author stoyan
 */
public class Physics {
    public static void main (String[] args){
        int speed_of_light = 299792458;
        double earth_gravity = 9.8;
        long stars_in_the_milky_way_galaxy = 300000000000L;
        int radius_of_Earth = 6378;
        byte planets = 8;
        String largest_planet = "Jupiter";
        double jupiter_gravity = 24.79;
        boolean gravity_check;
    
    if (jupiter_gravity > earth_gravity){
       gravity_check = true;
    } else {
       gravity_check = false;
    }
        System.out.printf("The speed of light is %d m/s \n", speed_of_light);
        System.out.printf("The gravity of Earth is %f m/s2 \n", earth_gravity);
        System.out.printf("There are %d stars in the Milky Way Galaxy \n", stars_in_the_milky_way_galaxy);
        System.out.printf("The raduis of the Earth is %d km \n", radius_of_Earth);
        System.out.printf("There are %d planets in the Solar System. \n", planets);
        System.out.printf("The largest planet in the Solar System is %s.", largest_planet);
        System.out.printf("The gravity of Jupiter is %f m/s2 \n", jupiter_gravity);
        System.out.println("Is Jupiter's gravity stronger than Earth's: " + gravity_check);
    }
}
