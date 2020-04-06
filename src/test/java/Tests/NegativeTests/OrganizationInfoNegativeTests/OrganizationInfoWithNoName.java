package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Processes.Functions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class OrganizationInfoWithNoName extends BaseTest {
    final String BLANK_ORGANIZATION_NAME = "";
    final String REQUIRED_FIELD_ERROR = "Required";

    @Test
    public void addOrgInfoNegativeTest() {
        loginAsAdmin(driver);
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                (BLANK_ORGANIZATION_NAME, ORGANIZATION_EMAIL, ORGANIZATION_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getNoOrganizationNameErrorMessageText(), containsString(REQUIRED_FIELD_ERROR));
    }
}
