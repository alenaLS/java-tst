package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreationTests() throws Exception {
    app.getContactHelper().goToCreation();
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanovich", "Ivanov", "vanya", "it", "moscow", "79998887766", "vanyasuper@gmail.com"));
    app.getContactHelper().enterContact();
  }
}
