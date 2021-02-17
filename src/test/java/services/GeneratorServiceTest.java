package services;

import org.junit.jupiter.api.Test;
import utils.UtilHexConv;

import javax.crypto.spec.IvParameterSpec;
import static org.junit.jupiter.api.Assertions.*;

class GeneratorServiceTest {

    @Test
    void generateKey() {
        try {
            final String algorithmInstance = "AES";
            final int keySize = 256;

            String generatedKey = GeneratorService.generateKey(algorithmInstance, keySize);
            assertEquals(generatedKey.length(), 44);
            System.out.println("Generate Encryption Key: PASSED");
    } catch (Exception e) {
            fail("Exception: " + e);
        }
    }

    @Test
    void getKeyFromPassword() {
        try {
            String PBEKey = GeneratorService.getKeyFromPassword("My super awesome password", "12345678");
            assertEquals(PBEKey.length(), 44);
            System.out.println("Generate From Password: PASSED");
        } catch (Exception e) {
            fail("Exception: " + e);
        }
    }

    @Test
    void generateIV() {
        String genIV = GeneratorService.generateIV();
        assertEquals(genIV.length(), 32);
        System.out.println("Generate IV: PASSED");
    }

    @Test
    void generateIvParamSpec() {
        try {
            byte[] ivByte = UtilHexConv.hexStringToByteArray("6f47558b71cb8e88ea049d05a077bb5c");
            Object returnedIVParamSpec = GeneratorService.generateIvParamSpec(ivByte);
            assertNotNull(returnedIVParamSpec);
            assertTrue(returnedIVParamSpec instanceof IvParameterSpec);
            System.out.println("Generate IV Parameter Spec: PASSED");
        } catch (Exception e) {
            fail("Exception: " + e);
        }
    }
}