public class LongestWordInSentence {
	
	public static String identifyLongestWordInSentence(String input) {
		 input = input.replaceAll("\\p{Punct}", "");
		 System.out.println(input);
		 String[] strings = input.split(" ");
		 
		 String longestWord = "";
		 
		 for(int i = 0; i < strings.length; i++) {
			 	if(strings[i].length() > longestWord.length()) {
			 		longestWord = strings[i];
			 	}
		 }
		 return longestWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(identifyLongestWordInSentence("The quick brown fox"));
        System.out.println(identifyLongestWordInSentence("I love Java programming language")); 
        System.out.println(identifyLongestWordInSentence("Welcome, to the jungle!"));     
        System.out.println(identifyLongestWordInSentence("Well... this-is-awkward."));
	}

}
