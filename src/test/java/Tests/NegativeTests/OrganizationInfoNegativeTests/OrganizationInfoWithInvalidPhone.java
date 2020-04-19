package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Processes.Utils.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static Constants.Errors.INVALID_NUMBER_ERROR;

public class OrganizationInfoWithInvalidPhone extends BaseTest {
    final String INVALID_PHONE_NUMBER = "InvalidPhoneNumber123";
    final String INVALID_PHONE_NUMBER_ERROR = INVALID_NUMBER_ERROR;

    @Test
    public void addOrganizationInfoWithInvalidPhoneTest() {
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                                (ORGANIZATION_NAME, ORGANIZATION_EMAIL, INVALID_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getPhoneErrorMessageText(), is(INVALID_PHONE_NUMBER_ERROR));
    }
}
