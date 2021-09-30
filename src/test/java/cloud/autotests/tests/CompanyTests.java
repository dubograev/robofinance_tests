package cloud.autotests.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import javax.xml.soap.Text;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("UI")
public class CompanyTests extends TestBase{

    @BeforeEach
    void beforeEach() {
        Configuration.baseUrl = "https://robo.finance";
    }

    @Test
    void buttonCompanyTest() {
        open("");
        $(byText("Компания")).click();
        $("#companyPage").$$(".section_2VQma").shouldHave(size(3));
    }

    @Test
    void leftMenuTest() {
        open("/company");
        $("#companyPage").$(".section_2VQma", 0).shouldHave(text("Проекты"));
        $("#companyPage").$(".section_2VQma", 1).shouldHave(text("Бонусы"));
        $("#companyPage").$(".section_2VQma", 2).shouldHave(text("Офисы"));
    }

    @Test
    void projectCardsTest() {
        open("/company");
        $("#projects").$("[aria-label=slider]").$$(".item_3j0OD").shouldHave(size(8));

    }

    @Test
    void projectBonusesTest() {
        open("/company");
        $("#bonuses").$("[aria-label=slider]").$$(".item_gwr6m").shouldHave(size(6));
        $("#bonuses").$("[aria-label=slider]").$(".item_gwr6m", 3).shouldHave(text("«Перезимовка»"));
    }

    @Test
    void projectOfficesTest() {
        open("/company");
        $("#offices").$("[aria-label=officesList]").$$(".item_wR-Fv").shouldHave(size(6));
    }
}

