package org.moita.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class InputManipulator {

    private WebElement element;

    public InputManipulator(WebElement element){
        this.element = element;
    }

    public String readInputElement() {
        return element.getAttribute("value");
    }

    public void updateInputElement(String value) {
        element.sendKeys(value);
    }

    public void clearInputElement() {
        element.clear();
    }
}
