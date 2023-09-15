package SingleLevel;

public class ParentClassOne {
	public static void main(String[] args) {
		ParentClassOne pcs = new ParentClassOne();
		pcs.engine();
		pcs.breaks();
		
	}
	public void engine() {
		System.out.println("Engine code executed");
		
	}
	public void breaks() {
		System.out.println("break code executed");
	}

}
