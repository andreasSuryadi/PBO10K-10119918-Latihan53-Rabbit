/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan53rabbit;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data kelinci
 * menggunakan sistem override constructor
 * 
 */

public class PBO10K10119918Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println("Peter is Vegetarian? " + rabbit.isVegetarian());
        System.out.println("Peter eats " + rabbit.getEats());
        System.out.println("Peter has " + rabbit.getNoOfLegs() + " legs");
        System.out.println("Peter color is " + rabbit.getColor());
    }
    
}
