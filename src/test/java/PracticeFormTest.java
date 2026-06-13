
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("https://demoqa.com/automation-practice-form");

        $("[id=firstName]").val("Ivan");
        $("[id=lastName]").val("Ivanov");
        $("[id=userEmail]").val("Ivan@gmail.com");
        $("[id=gender-radio-1]").click();
        $("[id=userNumber]").val("1234567890");
        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("2010");
        $(".react-datepicker__day--013").click();
        $("[id=subjectsInput]").val("Maths").pressEnter();
        $("#hobbies-checkbox-1").click();
        $("#uploadPicture").uploadFromClasspath("testPicture.jpg");
        $("[id=currentAddress]").val("Country city");
        $("[id=state]").click();
        $$("[id^=react-select-3-option]").findBy(text("NCR")).click();
        $("[id=city]").click();
        $$("[id^=react-select-4-option]").findBy(text("Delhi")).click();
        $("[id=submit]").click();

        $(".table-responsive").shouldHave(text("Ivan Ivanov"));
        $(".table-responsive").shouldHave(text("Ivan@gmail.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("1234567890"));
        $(".table-responsive").shouldHave(text("13 January,2010"));
        $(".table-responsive").shouldHave(text("Math"));
        $(".table-responsive").shouldHave(text("Sports"));
        $(".table-responsive").shouldHave(text("testPicture.jpg"));
        $(".table-responsive").shouldHave(text("Country city"));
        $(".table-responsive").shouldHave(text("NCR Delhi"));
    }

    @Test
    void succesesfullOnlyRequiredForm(){
        open("https://demoqa.com/automation-practice-form");

        $("[id=firstName]").val("Ivan");
        $("[id=lastName]").val("Ivanov");
        $("[id=gender-radio-1]").click();
        $("[id=userNumber]").val("1234567890");
        $("[id=submit]").click();

        $(".table-responsive").shouldHave(text("Ivan Ivanov"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("1234567890"));
    }
}
