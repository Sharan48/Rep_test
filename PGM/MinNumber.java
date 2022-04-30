package PGM;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {10,20,5,23,56,10};
		int temp=n[0];
		for(int i=1;i<n.length;i++)
		
			
			if(temp>n[i])
			
				temp=n[i];
			System.out.println(temp);
			
			
	}

}
