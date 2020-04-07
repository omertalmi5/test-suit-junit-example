package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Processes.Utils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class OrganizationInfoWithInvalidPhone extends BaseTest {
    String INVALID_PHONE_NUMBER = "InvalidPhoneNumber123";

    @Test
    public void OrgInfoWrongFaxTest() {
        loginAsAdmin(driver);
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                                  (ORGANIZATION_NAME, ORGANIZATION_EMAIL, INVALID_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getPhoneErrorMessageText(), containsString(INVALID_PHONE_NUMBER_ERROR));
    }
}
