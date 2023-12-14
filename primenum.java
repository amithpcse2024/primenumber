package big;

public class primenum {

	public static void main(String[] args) {
		for(int i=2;i<=20;i++) {
			int	a=0;
			for(int j=2;j<=i/2;j++) {
				if (i!=j) {
					if(i%j==0) {
						a=1;
					}
				}
				
			}
			if (a==0) {
			System.out.println(i);
			}
		}
		}
		

	}

