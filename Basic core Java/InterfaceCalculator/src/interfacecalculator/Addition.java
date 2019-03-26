/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecalculator;

/**
 *
 * @author musharaf
 */
public class Addition implements Operations{
 int a ;
 int b;
   

    @Override
    public int operator() {
       return a + b;
    }

   
}
