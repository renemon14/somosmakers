package elements;

import org.openqa.selenium.By;

public class PageContact {

    public static final By CELLPHONE = By.xpath("//a[@title='celular']");
    public static final By NAME = By.id("et_pb_contact_first_0");
    public static final By LASTNAME = By.id("et_pb_contact_last_0");
    public static final By EMAIL = By.id("et_pb_contact_email_0");
    public static final By PHONE_NUMBER = By.id("et_pb_contact_phone_0");
    public static final By MESSAGE = By.id("et_pb_contact_message_0");
    public static final By BTN_SEND = By.name("et_builder_submit_button");
    public static final By NOTIFY = By.className("et-pb-contact-message");

}
