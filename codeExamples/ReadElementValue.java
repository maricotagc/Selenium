//userName is a form element.

WebElement userName = driver.findElement(By.id("profile-name"));
System.out.println(userName.getAttribute("value"));
