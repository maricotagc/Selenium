package org.moita.utilities;

import org.openqa.selenium.WebElement;

public class DropdownWebElementManipulator {

    private DropdownWebElementManipulator() {}

    public static String get(WebElement dropdown) {
        return dropdown.getAttribute("value");
    }

    //TODO method update
}
