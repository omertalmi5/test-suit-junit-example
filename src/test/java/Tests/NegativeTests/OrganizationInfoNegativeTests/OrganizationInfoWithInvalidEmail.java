package Tests.NegativeTests.OrganizationInfoNegativeTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Constants.Errors.INVALID_EMAIL_ERROR;
import static Processes.Utils.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrganizationInfoWithInvalidEmail extends BaseTest {
    final String INVALID_EMAIL = "invalidEmailFormat";
    final String INVALID_ORGANIZATION_EMAIL_ERROR = INVALID_EMAIL_ERROR;

    @Test
    public void organizationInfoWithWrongEmailTest() {
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                            (ORGANIZATION_NAME, INVALID_EMAIL, ORGANIZATION_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getEmailErrorMessageText(), is(INVALID_ORGANIZATION_EMAIL_ERROR));
    }
}
