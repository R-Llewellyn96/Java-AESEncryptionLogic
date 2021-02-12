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

        EncryptionRunner.encryptionRunner("This is a testing message", 0);

        EncryptionRunner.decryptionRunner("244f9efd724e06423af6bfe78fd27c53+2CQI+qYLtSJ3c2c4h8rXA==", "UNzl3IT9mfZAyOIm+ihuTpT5peaw3povOv/aKL5Cp4w=");

        // Decryption Tests

        /*  256 bit AES
            * AES/CBC/PKCS5Padding
            * DfRCHRt3jc7eXTS+237bY/DkgxVu48zXAd6CR7yqMGU=
            * 446e34bb2d332f2d85163d37000fb8a3
            * This is a testing message
            * OSDV+yqT1iemNMUR/v0twZJyKprJtcTV5A2W2t8bZiE=
         */

        /*  128 bit AES
         * AES/CBC/PKCS5Padding
         * +2CQI+qYLtSJ3c2c4h8rXA==
         * 244f9efd724e06423af6bfe78fd27c53
         * This is a testing message
         * UNzl3IT9mfZAyOIm+ihuTpT5peaw3povOv/aKL5Cp4w=
         */

    }

    // End of class
}
