package br.com.benefrancis.estudos.temperatura;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class OtherSolution3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        int min = Integer.MAX_VALUE;
            
        if (n != 0) {        
            String[] temperatures = temps.split(" ");            
            int prevT = 0;
            
            for(String t: temperatures) {
                int temp = Integer.parseInt(t);            
                int abs = Math.abs(temp - 0);
                        
                if (abs < Math.abs(min) || (abs == Math.abs(min) && min < 0 && temp > 0)) min = temp;                          
            }        
        }
        else min = 0;
        
        System.out.println(min);
    }
}