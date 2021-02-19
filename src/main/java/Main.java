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
        EncryptionRunner.encryptionRunner("This is a testing message", 0);

        System.out.println("\nDecrypting...");
        EncryptionRunner.decryptionRunner("244f9efd724e06423af6bfe78fd27c53+2CQI+qYLtSJ3c2c4h8rXA==", "UNzl3IT9mfZAyOIm+ihuTpT5peaw3povOv/aKL5Cp4w=");

    }

    // End of class
}
