package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Constants.Errors.REQUIRED_FIELD_ERROR;
import static Processes.Utils.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrganizationInfoWithNoName extends BaseTest {
    final String BLANK_ORGANIZATION_NAME = "";
    final String REQUIRED_NAME_FIELD_ERROR = REQUIRED_FIELD_ERROR;

    @Test
    public void addOrganizationInfoWithNoNameTest() {
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                (BLANK_ORGANIZATION_NAME, ORGANIZATION_EMAIL, ORGANIZATION_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getNoOrganizationNameErrorMessageText(), is(REQUIRED_NAME_FIELD_ERROR));
    }
}
