package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("UI")
public class MainPageTests extends TestBase {

    @Test
    @AllureId("5009")
    @Description("Page title test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://robo.finance/'", () ->
                open("https://robo.finance/"));

        step("Page title should have text 'Robo.finance - работа в FinTech-компании'", () -> {
            String expectedTitle = "Robo.finance - работа в FinTech-компании";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @AllureId("5008")
    @Description("Console log errors test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://robo.finance/'", () ->
                open("https://robo.finance/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}