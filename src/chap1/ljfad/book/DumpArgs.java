package chap1.ljfad.book;

public class DumpArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Passed arguments:");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
