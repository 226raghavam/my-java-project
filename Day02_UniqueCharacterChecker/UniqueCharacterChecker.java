public class UniqueCharacterChecker {

	public static boolean hasAllUniqueCharacters(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasAllUniqueCharacters("abcdef")); // true
		System.out.println(hasAllUniqueCharacters("aabbcc")); // false
		System.out.println(hasAllUniqueCharacters("AaBb")); // true
		System.out.println(hasAllUniqueCharacters("Hello"));

	}

}
