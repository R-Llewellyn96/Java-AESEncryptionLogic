import controllers.CodebookController;
import runners.EncryptionRunner;
import utils.UtilConverters;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

    // Main method, used for calling methods
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, NoSuchPaddingException {

        System.out.println("\nEncrypting...");
        EncryptionRunner.encryptionRunner("This is my testing message", 0);

        System.out.println("\nDecrypting...");
        EncryptionRunner.decryptionRunner("9751de75726fa880ba48704c5edd9546VjXM93RccB3xmsF6vT3lDkYpuFqM1ONgyTan7u+LLoQ=", "kCiPd6UeXa7aK6hy3npoMA==");

    }

    /*
    // Key
    kCiPd6UeXa7aK6hy3npoMA==
    // IV and Ciphertext
    9751de75726fa880ba48704c5edd9546VjXM93RccB3xmsF6vT3lDkYpuFqM1ONgyTan7u+LLoQ=
     */

    // End of class
}
