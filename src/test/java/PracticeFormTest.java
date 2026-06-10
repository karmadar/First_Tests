
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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
        $("[id=subjectsInput]").val("Maths").click();

        $("#hobbies-checkbox-1").click();
        $("#uploadPicture").uploadFromClasspath("testPicture.jpg");
        $("id=currentAddress").val("Country city");
        $("id=react-select-3-placeholder")
                .selectOption("react-select-3-input");

    }
}
