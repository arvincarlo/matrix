/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

/**
 *
 * @author student
 */
import java.util.*;

public class MatrixApp {
	public static void main(String[] args) {
		Matrix a = new Matrix();
		a.setCell(0,0,1);
		a.setCell(0,1,2);
		a.setCell(0,2,3);
		a.setCell(0,3,4);
		a.setCell(1,0,5);
		a.setCell(1,1,6);
		a.setCell(1,2,7);
		a.setCell(1,3,8);
		a.setCell(2,0,9);
		a.setCell(2,1,8);
		a.setCell(2,2,7);
		a.setCell(2,3,6);
		a.setCell(3,0,5);
		a.setCell(3,1,4);
		a.setCell(3,2,3);
		a.setCell(3,3,2);

		System.out.println();
		System.out.println("     Matrix A    ");
		System.out.println("-----------------");
		a.displayMatrix();

		Matrix b = new Matrix();
		b.setCell(0,0,8);
		b.setCell(0,1,7);
		b.setCell(0,2,6);
		b.setCell(0,3,5);
		b.setCell(1,0,4);
		b.setCell(1,1,3);
		b.setCell(1,2,2);
		b.setCell(1,3,1);
		b.setCell(2,0,1);
		b.setCell(2,1,2);
		b.setCell(2,2,3);
		b.setCell(2,3,4);
		b.setCell(3,0,5);
		b.setCell(3,1,6);
		b.setCell(3,2,7);
		b.setCell(3,3,8);

		System.out.println();
		System.out.println("     Matrix B    ");
		System.out.println("-----------------");
		b.displayMatrix();

		Matrix sum = new Matrix();
		sum.addMatrices( a, b);
		System.out.println();
		System.out.println(" Sum of Matrices ");
		System.out.println("-----------------");
		sum.displayMatrix();
	}
}