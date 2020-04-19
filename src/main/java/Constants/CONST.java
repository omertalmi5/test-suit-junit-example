package Constants;

import Objects.Organization;

public class CONST {
    public static String ADMIN_USERNAME = "opensourcecms";
    public static String ADMIN_PASSWORD = "opensourcecms";

    public static String ORGANIZATION_NAME = "Erez Company";
    public static String ORGANIZATION_EMAIL = "admin@erez.com";
    public static String ORGANIZATION_PHONE_NUMBER = "+9753454964";
    public static String ORGANIZATION_FAX_NUMBER = "+23139218329";

    public static Organization organizationInfo = new Organization(ORGANIZATION_NAME, ORGANIZATION_EMAIL,
                                                                ORGANIZATION_PHONE_NUMBER, ORGANIZATION_FAX_NUMBER);

    public static int SECONDS_TO_WAIT = 10;
}
