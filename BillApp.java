
public class BillApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Person 1 paid: " + args[0]);
		System.out.println("Person 2 paid: " + args[1]);
		System.out.println("Person 3 paid: " + args[2]);
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]); 
		int p3 = Integer.parseInt(args[2]);
		int avg;
		
		avg = (p1 + p2 + p3) / 3;
		//System.out.println(avg);
		int p1mustpay = p1 - avg;
		int p2mustpay = p2 - avg;
		int p3mustpay = p3 - avg;
		
		System.out.println("Balance of Person 1 is " + p1mustpay);
		System.out.println("Balance of Person 2 is " + p2mustpay);
		System.out.println("Balance of Person 3 is " + p3mustpay);
	}

}
