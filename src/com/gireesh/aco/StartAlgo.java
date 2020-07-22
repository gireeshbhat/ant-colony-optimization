package com.gireesh.aco;

import java.util.Scanner;

import com.gireesh.acoalgorithm.AntColonyOptimization;

public class StartAlgo {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press any key to start");
        in.next();
        AntColonyOptimization antColony = new AntColonyOptimization(21);
        antColony.startAntOptimization();
        in.close();
	}

}
