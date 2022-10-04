
public class primeNUM {

	public static void main(String[] args) {
		// 12 = 2,3,4,5,6 ...12

				int num = 7;

				int mid = num / 2;
				System.out.println("Mid point = " + mid);
				boolean flag = false;

				for (int i = 2; i <= mid; i++) {

					System.out.println(i);
					if (num % i == 0) {
						flag = true;
						break;// stop the loop 
					}
				}

				if (flag) {
					System.out.println(num + " is not prime number");
				} else {
					System.out.println(num + " is prime number");
				}
	}

}
