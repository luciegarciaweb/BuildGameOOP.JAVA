/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.poo.thegame.entities;

/**
 *
 * @author lucie2
 */
public class personnage {
    
    //création d'attributs
    private int force = 100;
    private int pv = 50;
    private final int endurance = 75;
    private String nom = "";
    
    public void attaquer(String cible){
        System.out.println("attaque "+cible);
    }    
}
