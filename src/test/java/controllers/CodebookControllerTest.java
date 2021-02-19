package controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodebookControllerTest {

    @Test
    void generateCodeBook() {
        try {
            assertTrue(CodebookController.generateCodeBook(1, 128));
            assertTrue(CodebookController.generateCodeBook(2, 128));
            assertTrue(CodebookController.generateCodeBook(3, 128));
            assertTrue(CodebookController.generateCodeBook(4, 128));
            assertTrue(CodebookController.generateCodeBook(5, 128));
            assertTrue(CodebookController.generateCodeBook(6, 128));
            assertTrue(CodebookController.generateCodeBook(7, 128));
            assertTrue(CodebookController.generateCodeBook(8, 128));
            assertTrue(CodebookController.generateCodeBook(9, 128));
            assertTrue(CodebookController.generateCodeBook(10, 128));
            assertTrue(CodebookController.generateCodeBook(11, 128));
            assertTrue(CodebookController.generateCodeBook(12, 128));
            assertTrue(CodebookController.generateCodeBook(13, 128));

            assertTrue(CodebookController.generateCodeBook(1, 256));
            assertTrue(CodebookController.generateCodeBook(2, 256));
            assertTrue(CodebookController.generateCodeBook(3, 256));
            assertTrue(CodebookController.generateCodeBook(4, 256));
            assertTrue(CodebookController.generateCodeBook(5, 256));
            assertTrue(CodebookController.generateCodeBook(6, 256));
            assertTrue(CodebookController.generateCodeBook(7, 256));
            assertTrue(CodebookController.generateCodeBook(8, 256));
            assertTrue(CodebookController.generateCodeBook(9, 256));
            assertTrue(CodebookController.generateCodeBook(10, 256));
            assertTrue(CodebookController.generateCodeBook(11, 256));
            assertTrue(CodebookController.generateCodeBook(12, 256));
            assertTrue(CodebookController.generateCodeBook(13, 256));

            System.out.println("Generate Codebook: PASSED");
        } catch (Exception e) {
            System.out.println("Generate Codebook: FAILED");
            fail("Exception: " + e);
        }
    }
}