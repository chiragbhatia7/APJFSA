package Exception;

public class TestCGPAException {
	public static void main(String[] args) {
		try {
			checkCGPA(6);
		} catch (LowCGPAException e) {
			System.out.println(e);
		}
	}

	public static void checkCGPA(int i) throws LowCGPAException {
		if (i < 7) {
			throw new LowCGPAException("You are not eligible for placements.");
		}else {
			System.out.println("You are eligible for placements.");
		}
	}

}
