/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2poo;

/**
 *
 * @author Paulo Vitor
 */
public class Point3D {
    public int x;
    public int y;
    public int z;
    public Point3D(){
        
    }
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void set(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
