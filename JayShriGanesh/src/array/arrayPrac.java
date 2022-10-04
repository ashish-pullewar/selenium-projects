package array;

public class arrayPrac {
	
	
	public static void main(String[] args) {
		int a[] =new int[5];
		a[0]=101;
		a[1]=102;
		a[2]=103;
		a[3]=104;
		a[4]=105;
		
		System.out.println(a.length);
		System.out.println(a[2]);
		System.out.println(a[3+1]);
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		 String[] stdn={"ramesh","suresh","mangesh"}; 
		 System.out.println(stdn.length);
		 
		 for(int i=0; i<stdn.length; i++) {
				System.out.println(stdn[i]);
			}
		 
		 for(int j=a.length-1; j>=0; j-- ) {
			 System.out.println(a[j]);
		 }


	}

}
