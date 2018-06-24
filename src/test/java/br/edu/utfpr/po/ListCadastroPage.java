/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Mussi
 */
class ListCadastroPage extends BasePage {
/*
    @FindBy(id = "lastName")
        WebElement lastNameField;

        @FindBy(xpath = "//button[@type='submit']")
        WebElement findButton;

        @FindBy(xpath = "//a[@href='/owners/new']")
        WebElement addButton;

        @FindBy(xpath = "//*[@id='lastNameGroup']/div/span/div/p")
        WebElement error;
*/
    public ListCadastroPage(WebDriver driver) {
        super(driver);
    }
/*
        public FindOwnerPage(WebDriver driver) {
            super(driver);
        }

        public FindOwnerPage setLastName(String lastName) {
            lastNameField.clear();
            lastNameField.sendKeys(lastName);

            return this;
        }

        public ListOwnersPage clickFindButton() {
            findButton.click();
            return new ListOwnersPage(driver);
        }

        public String getErrorMessage() {
            if (error != null) {
                return error.getText();
            }

            return "";
        }

        public AddOwnerPage goToAddOwner() {
            addButton.click();

            return new AddOwnerPage(driver);
        }
    }
*/
}
