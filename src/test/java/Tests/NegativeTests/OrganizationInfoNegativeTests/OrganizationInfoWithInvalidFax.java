package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Constants.Errors.INVALID_NUMBER_ERROR;
import static Processes.Utils.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrganizationInfoWithInvalidFax extends BaseTest {
    String INVALID_FAX_NUMBER = "invalidFaxFormat";
    String INVALID_PHONE_NUMBER_ERROR = INVALID_NUMBER_ERROR;

    @Test
    public void organizationInfoWithInvalidFaxTest() {
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                                (ORGANIZATION_NAME, ORGANIZATION_EMAIL, ORGANIZATION_PHONE_NUMBER, INVALID_FAX_NUMBER);

        assertThat(organizationInfoPage.getFaxErrorMessageText(), is(INVALID_PHONE_NUMBER_ERROR));
    }
}
