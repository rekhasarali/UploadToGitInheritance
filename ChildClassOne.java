package SingleLevel;

public class ChildClassOne {

	public static void main(String[] args) {
		ChildClassOne ccs =new ChildClassOne();
		ccs.tyres();
		ccs.rpm();
		

	}
	public void tyres() {
		System.out.println("tyres code executed");
	}
	public void rpm() {
		System.out.println("rpm code executed");
	}

}
