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
public interface race {
    
    void setForce(int force);
    void setPv(int pv);
    void setEndurance(int endurance);
    void setNom(int nom);
    
    void getForce(int force);
    void getPv(int pv);
    void getEndurance(int endurance);
    void getNom(int nom);
    
}
