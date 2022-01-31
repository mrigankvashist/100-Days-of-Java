import java.util.Scanner;
import java.util.ArrayList;

public class mazewithjumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
        scn.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // horizontal moves
        ArrayList<String> paths = new ArrayList<>();
        for (int  hmovesize= 1; hmovesize <= dc - sc; hmovesize++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + hmovesize, dr, dc);
            for(String hpath : hpaths){
                paths.add("h"+hmovesize+hpath);
            }
        } 

        // vertical moves
        for (int vmovesize = 1; vmovesize <= dr-sr; vmovesize++) {
            ArrayList<String> vpaths = getMazePaths(sr+vmovesize, sc, dr, dc);
            for(String vpath: vpaths){
                paths.add("v"+vmovesize+vpath);
            }
        }

        // diagonal moves
        for (int dmovesize = 1; dmovesize < dr-sr && dmovesize<dc-sc; dmovesize++) {
            ArrayList<String> dpaths = getMazePaths(sr+dmovesize, sc+dmovesize, dr, dc);
            for(String dpath : dpaths){
                paths.add("d"+dmovesize+dpath);
            }
        }

        return paths;

    }

}