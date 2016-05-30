package Forloop;

public class forloop {

	public static void main(String[] args) {
		int[][] x =  {{10,20,30},{40,50},{32,23,54}}; 	
		for(int[] x1 : x)
		{
			for(int x2 : x1)
			{
				System.out.println(x2);
			}
		}
	}
}
