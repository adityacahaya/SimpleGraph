package graph;

import java.util.Scanner;

class Graph {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int jumlahVertice = s.nextInt();
        if(jumlahVertice > 500){
            System.exit(0);
        }
        
        String keterhubungan;
        char[][] edge = new char[jumlahVertice][jumlahVertice];
        char[] kunjungan = new char[jumlahVertice];
        
        for(int i = 0; i < jumlahVertice; i++){
            keterhubungan = s.next();
            for(int j = 0; j < jumlahVertice; j++){
                edge[i][j] = keterhubungan.charAt(j);
                kunjungan[i] = 'b';
            }
        }
        
        for(int i = 0; i < jumlahVertice; i++){
            for(int j = 0; j < jumlahVertice; j++){
                if(edge[i][j] == '1' && kunjungan[i] == 'b' && kunjungan[j] == 'b'){
                    System.out.println((i+1) +" "+ (j+1));
                    kunjungan[j] = 's';
                    kunjungan[i] = 's';
                }
            }
        }
    }   
}
