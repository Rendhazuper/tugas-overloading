/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author GAMES
 */
public class parent {
    int luas;
    double keliling; 
    //konstruktor 
    public int hitung(int x, int y){
        luas = x * y;
        System.out.println("Luas persegi panjang adalah "+luas);
        return luas;
         
        
        
       
        
    }
    public double hitung(double x, double y){
        keliling = 2*(x+y);
        System.out.println("Keliling persegi panjang adalah "+keliling);
        return keliling;
        
    }

}
    
            
    

