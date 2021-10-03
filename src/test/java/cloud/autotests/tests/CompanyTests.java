package cloud.autotests.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Левое меню на странице 'Компания' содержит 3 пункта")
    void buttonCompanyTest() {
        open("");
        $(byText("Компания")).click();
        $("#companyPage").$$(".section_2VQma").shouldHave(size(3));
    }

    @Test
    @DisplayName("Левое меню на странице 'Компания' содержит следующие пункты: 'Проекты', 'Бонусы', 'Офисы'")
    void leftMenuTest() {
        open("/company");
        $("#companyPage").$(".section_2VQma", 0).shouldHave(text("Проекты"));
        $("#companyPage").$(".section_2VQma", 1).shouldHave(text("Бонусы"));
        $("#companyPage").$(".section_2VQma", 2).shouldHave(text("Офисы"));
    }

    @Test
    @DisplayName("Количество карточек в разделе 'Проекты' равно 8")
    void projectCardsTest() {
        open("/company");
        $("#projects").$("[aria-label=slider]").$$(".item_3j0OD").shouldHave(size(8));

    }

    @Test
    @DisplayName("Количество карточек в разделе 'Бонусы' равно 6")
    void projectBonusesTest() {
        open("/company");
        $("#bonuses").$("[aria-label=slider]").$$(".item_gwr6m").shouldHave(size(6));
        $("#bonuses").$("[aria-label=slider]").$(".item_gwr6m", 3).shouldHave(text("«Перезимовка»"));
    }

    @Test
    @DisplayName("Количество адресов в разделе 'Офисы' равно 8")
    void projectOfficesTest() {
        open("/company");
        $("#offices").$("[aria-label=officesList]").$$(".item_wR-Fv").shouldHave(size(6));
    }
}

