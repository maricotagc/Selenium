package org.moita.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownWebElementManipulator {

    private DropdownWebElementManipulator() {}

    public static String get(WebElement dropdown) {
        return dropdown.getAttribute("value");
    }

    public static void select(WebElement dropdown, String role) {

        Select roleDropDown = new Select(dropdown);
        roleDropDown.selectByValue(role);
    }
}
