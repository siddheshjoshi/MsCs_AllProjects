import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 * A tester for the CryptoUtils class.
 * 
 * @author www.codejava.net
 *
 */
public class EncryptionUtil {
	public static void main(String[] args) {
		
		String key1 = "Mary has one cat1";
		File encryptedFile = new File("document.enc");
		File decryptedFile = new File("document");

		Scanner user_input = new Scanner(System.in);
		System.out.println("f k e/d: ");
		String encT = user_input.nextLine();
		System.out.println(encT);
		String val[] = encT.split(" ");
		File inputFile = new File(val[0]);
		String decision = val[2];
		String RealKey = key1 + val[1];
		System.out.println(RealKey);
		
		try {
			if (decision.equalsIgnoreCase("e"))
				encrypt(RealKey, inputFile, encryptedFile);
			else if (decision.equalsIgnoreCase("d"))
				decrypt(RealKey, encryptedFile, decryptedFile);
		} catch (CryptoException ex) {
			System.out.println("FUCK OFF!" + ex.getMessage());
			ex.printStackTrace();
		}
	}

	private static final String ALGORITHM = "AES";
	private static final String TRANSFORMATION = "AES";

	public static void encrypt(String key, File inputFile, File outputFile)
			throws CryptoException {
		doCrypto(Cipher.ENCRYPT_MODE, key, inputFile, outputFile);
	}

	public static void decrypt(String key, File inputFile, File outputFile)
			throws CryptoException {
		doCrypto(Cipher.DECRYPT_MODE, key, inputFile, outputFile);
	}

	private static void doCrypto(int cipherMode, String key, File inputFile,
			File outputFile) throws CryptoException {
		try {
			Key secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
			Cipher cipher = Cipher.getInstance(TRANSFORMATION);
			cipher.init(cipherMode, secretKey);
			
			
			FileInputStream inputStream = new FileInputStream(inputFile);
			byte[] inputBytes = new byte[(int) inputFile.length()];
			inputStream.read(inputBytes);

			byte[] outputBytes = cipher.doFinal(inputBytes);

			FileOutputStream outputStream = new FileOutputStream(outputFile);
			outputStream.write(outputBytes);

			inputStream.close();
			outputStream.close();

		} catch (IOException | IllegalBlockSizeException | BadPaddingException
				| NoSuchAlgorithmException | NoSuchPaddingException
				| InvalidKeyException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

	public class CryptoException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public CryptoException() {
		}

		public CryptoException(String message, Throwable throwable) {
			super(message, throwable);
		}
	}

}