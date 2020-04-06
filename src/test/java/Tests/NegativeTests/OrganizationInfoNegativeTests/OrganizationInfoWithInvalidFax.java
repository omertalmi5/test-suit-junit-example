package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Processes.Functions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class OrganizationInfoWithInvalidFax extends BaseTest {
    String INVALID_FAX_NUMBER = "invalidFaxFormat";

    @Test
    public void OrgInfoWithInvalidFaxTest() {
        loginAsAdmin(driver);
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                                (ORGANIZATION_NAME, ORGANIZATION_EMAIL, ORGANIZATION_PHONE_NUMBER, INVALID_FAX_NUMBER);

        assertThat(organizationInfoPage.getFaxErrorMessageText(), containsString(INVALID_PHONE_NUMBER_ERROR));
    }
}
