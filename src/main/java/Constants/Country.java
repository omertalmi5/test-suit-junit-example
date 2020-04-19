package Constants;

public enum Country {
    ISRAEL ("Israel"),
    ARGENTINA ("Argentina"),
    SPAIN ("Spain"),
    EGYPT ("Egypt"),
    MEXICO ("Mexico");

    public final String NAME;

    Country (String name) {
        this.NAME = name;
    }
}
