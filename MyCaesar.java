
public class MyCaesar {
//	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
//			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
//	private int n;// shift steps (right shift)

//	public MyCaesar(int shiftSteps) {
//		this.n = shiftSteps;
//	}
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	// create encryptData() method for encrypting user input string with given shift
	// key
	public static String encryptData(String input, int n) {
		// convert input into lower case
		input = input.toLowerCase();

		// encryptStr to store encrypted data
		String encryptStr = "";

		// use for loop for traversing each character of the input string
		for (int i = 0; i < input.length(); i++) {
			// get position of each character of input in ALPHABET
			int pos = ALPHABET.indexOf(input.charAt(i));

			// get encrypted char for each char of input
			int encryptPos = (n + pos) % 26;
			char encryptChar = ALPHABET.charAt(encryptPos);

			// add encrypted char to encrypted string
			encryptStr += encryptChar;
		}

		// return encrypted string
		return encryptStr;
	}

	// create decryptData() method for decrypting user input string with given shift
	// key
	public static String decryptData(String input, int n) {
		// convert input into lower case
		input = input.toLowerCase();

		// decryptStr to store decrypted data
		String decryptStr = "";

		// use for loop for traversing each character of the input string
		for (int i = 0; i < input.length(); i++) {

			// get position of each character of input in ALPHABET
			int pos = ALPHABET.indexOf(input.charAt(i));

			// get decrypted char for each char of input
			int decryptPos = (pos - n) % 26;

			// if decryptPos is negative
			if (decryptPos < 0) {
				decryptPos = ALPHABET.length() + decryptPos;
			}
			char decryptChar = ALPHABET.charAt(decryptPos);

			// add decrypted char to decrypted string
			decryptStr += decryptChar;
		}
		// return decrypted string
		return decryptStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take input from the user
		System.out.println("Enter a string for encryption using Caesar Cipher: ");
		String input = sc.nextLine();

		System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
		int n = Integer.valueOf(sc.nextLine());

		System.out.println("Encrypted Data ===> " + encryptData(input, n));
		System.out.println("Decrypted Data ===> " + decryptData(encryptData(input, n), n));
	}
}
