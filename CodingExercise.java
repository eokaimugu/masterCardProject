package masterCardCodingExercise;

public class CodingExercise {

	public static void main(String[] args) {

		String s = "There oughter be a law to enforce compliance";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		String c = "compliance";
		System.out.println(c.length());

		System.out.println(s.contains(c));

		/*
		 * used String splits method to truncate the sentence. used String contains
		 * method to verify that lingest word is contained in the sentence
		 */

	}

}
