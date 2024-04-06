package myproject;

public class hello {
	public static void main(String[] args) {
		int []marks= {10,20,30,40,50,};
		float max=0;
		for(int i=0;i<=marks.length;i++)
		if(i>max)//find highest no
		max=i;
		{
			System.out.println(max);
		}
	}
}
