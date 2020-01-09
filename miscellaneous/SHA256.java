package miscellaneous;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {

	public static void main(String[] args) {
		String input = "password";
		try {
			//SHA-256 Hashing algorithm
			MessageDigest m = MessageDigest.getInstance("SHA-256");
	        //hashing with SHA-256
			byte[] a = m.digest(input.getBytes());
	        //converting to hexadecimal
	        BigInteger b = new BigInteger(a);
	        System.out.println(String.format("%064x",b));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
