package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Processes.Functions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class OrganizationInfoWithInvalidEmail extends BaseTest {
    String INVALID_EMAIL = "invalidEmailFormat";
    String INVALID_EMAIL_ERROR = "Expected format: admin@example.com";

    @Test
    public void OrgInfoWrongEmailTest() {
        loginAsAdmin(driver);
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                            (ORGANIZATION_NAME, INVALID_EMAIL, ORGANIZATION_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getEmailErrorMessageText(), containsString(INVALID_EMAIL_ERROR));
    }
}
