/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg2labarraylist1202;

/**
 *
 * @author kms080
 */
import java.util.ArrayList;
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermutationGenerator permGen = new PermutationGenerator();
        int num = 1;
        for(int i = 1; i <= 10; i++) {   
            System.out.println(permGen.nextPermutation(num));
            num++;
        }
    }
}

class PermutationGenerator {
    private ArrayList <Integer> intNums = new ArrayList <> (10);
    private Random randNum = new Random();
    public PermutationGenerator() {
        
    }
    public void ArrayList() {
        
    }
    public String nextPermutation(int num) {
        intNums.clear();
        intNums.add(1); intNums.add(2); intNums.add(3); intNums.add(4); intNums.add(5);
        intNums.add(6); intNums.add(7); intNums.add(8); intNums.add(9); intNums.add(10);
        ArrayList <Integer> arrList = new ArrayList<>(10);
        for(int i = intNums.size(); i > 0; i--) {
            int temp = randNum.nextInt(i);
            arrList.add(intNums.remove(temp));
        }
        String final1 = "List #" + num + ":" + arrList.toString();
        return final1;
    }
}