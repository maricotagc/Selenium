package org.moita.utilities;

import org.openqa.selenium.WebElement;

public class InputManipulator {

    private WebElement element;

    public InputManipulator(WebElement element){
        this.element = element;
    }

    public String readElement() {
        return element.getAttribute("value");
    }

    public void updateElement(String value) {
        element.sendKeys(value);
    }

}
