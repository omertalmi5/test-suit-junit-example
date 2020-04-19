package Tests.PositiveTests;

import Pages.OrganizationInfoPage;
import Tests.BaseTest;
import org.junit.Test;
import static Constants.CONST.*;
import static Processes.Utils.goToOrganizationInfoPage;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddOrganizationInfoTest extends BaseTest {
    final String SAVE_SUCCESS_MESSAGE = "Successfully Saved";

    @Test
    public void AddOrganizationInfoTest() {
        goToOrganizationInfoPage(driver);

        OrganizationInfoPage organizationInfoPage = new OrganizationInfoPage(driver);
        organizationInfoPage.clearAllFormFields();
        organizationInfoPage.fillFormWith
                            (ORGANIZATION_NAME, ORGANIZATION_EMAIL, ORGANIZATION_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

        assertThat(organizationInfoPage.getSuccessMessageText(), is(SAVE_SUCCESS_MESSAGE));
    }
}
