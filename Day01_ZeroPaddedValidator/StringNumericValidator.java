public class StringNumericValidator {
	
	private static String validateNumericString(String number) {
		
		//check for null
		if(number == null)
			return "String must not be null";
		
		//check if characters in string are all digits
		for(int i=0; i<number.length(); i++) {
			if(!Character.isDigit(number.charAt(i))) {
				return "string should contain only digits";
			}
		}
		
		if(number.length()>9) {
			return "Invalid String";
		}
		
		if(number.length() <9) {
			number = String.format("%09d", Long.parseLong(number));
		}
		
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringNumericValidator.validateNumericString("12345"));
	}

}
