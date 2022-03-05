package edu.neu.coe.info6205.union_find;
import java.util.Random;
public class UF_Client {
	  public static void main(String[] args) {
	        Random random = new Random();
	        for(int i=0; i<10;i++) {
	            int n = random.nextInt(200000);
	            System.out.println("No. of Objects that is N:" + n + "  ** No of Pairs that is M: " + count(n));
	        }
	    }
    public static int count(int objects) {
        int noOfConnections = 0;
        UF_HWQUPC uf = new UF_HWQUPC(objects, true);
        Random randInput= new Random();
        while (uf.components()!=1)
        {
            int i = randInput.nextInt(objects);

            int j = randInput.nextInt(objects);

            if(!uf.connected(i,j)) {
                uf.union(i, j);
                noOfConnections++;
            }
            else
            {
            	noOfConnections++;
            }
        }
        return noOfConnections;
    }
}