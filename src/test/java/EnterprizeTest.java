import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterprizeTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        //Размер окна браузера во время выполнения тестов
        Configuration.pageLoadStrategy = "eager";
        //Не дожидаться загрузки страницы
    }

    @Test
    void openEnterprisesPageTest(){
        open("https://github.com");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}