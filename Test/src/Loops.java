
public class Loops {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter an action.");
			return;
		}
		
		String action = args[0];
		String[] values = new String[args.length - 1];
		
		if (args.length >= 2) {
			for (int i = 1; i < args.length; i++) {
				values[i-1] = args[i];
			}
		}
		
		if (action.equals("for-each")) {
			testForEach(values);
		} else if (action.equals("for")) {
			testFor(values);
		} else if (action.equals("while")) {
			testWhile(values);
		} else {
			System.out.println("no match found for " + action);
		}
	}
	
	public static void testForEach(String[] args) {
		System.out.println("Testing for-each.");
		if (args.length > 0) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}
	}

	public static void testFor(String[] args) {
		System.out.println("Testing for");
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}

	public static void testWhile(String[] args) {
		System.out.println("Testing while");
		if (args.length > 0) {
			int i = 0;
			while (i < args.length) {
				System.out.println(args[i++]);
			}
		}
	}
}
