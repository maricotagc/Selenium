package org.moita.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class InputManipulator {

    private InputManipulator() {}

    public static String readInputElement(WebElement input) {
        return input.getAttribute("value");
    }

    public static void updateInputElement(WebElement input, String value) {
        int lenght = input.getAttribute("value").length();
        List<CharSequence> keys = deleteInputBuilder(lenght);
        keys.add(value);

        CharSequence[] charSequences = keys.toArray(new CharSequence[0]);
        input.sendKeys(charSequences);
    }

    private static List<CharSequence> deleteInputBuilder(int size) {
        List<CharSequence> updateArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            updateArray.add(Keys.BACK_SPACE);
        }
        return updateArray;
    }
}
