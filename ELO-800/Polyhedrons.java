// 785A - Anton and Polyhedrons

import java.util.Scanner;

public class Polyhedrons{

    static int totalPolySides(String[] polyhedrons) {

        int tetrahedron = 4;
        int cube = 6;
        int octahedron = 8;
        int dodecahedron = 12;
        int icosahedron = 20;

        int totalSides = 0;

        for(int i = 0; i < polyhedrons.length; i++) {

            if(polyhedrons[i].toLowerCase().equals("tetrahedron")) totalSides += tetrahedron;
            else if(polyhedrons[i].toLowerCase().equals("cube")) totalSides += cube;
            else if(polyhedrons[i].toLowerCase().equals("octahedron")) totalSides += octahedron;
            else if(polyhedrons[i].toLowerCase().equals("dodecahedron")) totalSides += dodecahedron;
            else if(polyhedrons[i].toLowerCase().equals("icosahedron")) totalSides += icosahedron;

        }

        return totalSides;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        String[] polyhedrons = new String[n];
        for(int i = 0; i < n; i++) {
            polyhedrons[i] = s.nextLine();
        }

        System.out.println(totalPolySides(polyhedrons));

        s.close();

    }
}