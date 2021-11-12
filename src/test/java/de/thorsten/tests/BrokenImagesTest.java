package de.thorsten.tests;

import de.thorsten.pages.BrokenImagesPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class BrokenImagesTest extends BaseTest {


    @Test
    @DisplayName("Modal opens when mouse leaves viewport")
    public void openExitIntentModal() throws IOException {
        BrokenImagesPage brokenImagesPage = new BrokenImagesPage(driver);
        brokenImagesPage.visit();

        assertFalse(brokenImagesPage.allImagesAreOkay());
        assertEquals(brokenImagesPage.countBrokenImages(), 2);
        assertEquals(brokenImagesPage.countAllImages(), 4);
        assertEquals(brokenImagesPage.countHealthyImages(), 2);

    }
}