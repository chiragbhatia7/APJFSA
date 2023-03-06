package Exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		try { //may throw exception
			int num = 88/0;
			System.out.println(num);
		}
		catch(Exception e) { //handle exception
			System.out.println("Uhmm, cannot divide by zero");
		}
		finally {
			System.out.println("Look at me :)");
		}
	}
}
