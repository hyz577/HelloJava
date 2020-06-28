
public class HelloJava {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		/**
		 * @param args
		 */
		for(i=1;i<=10;i++) {
			sum += i;
			System.out.println("第"+i+"次循环的s值是"+sum);
		}
		System.out.println("循环完毕");
	}
	
}