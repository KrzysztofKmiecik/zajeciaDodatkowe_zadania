package Ex1WeddingInvitation;

enum WeddingEnum {
    SINGLE(1),
    DOUBLE(2);

    final private int HowManyPerson;

    WeddingEnum(final int HowManyPerson) {
        this.HowManyPerson = HowManyPerson;
    }

    public int getHowManyPerson() {
        return HowManyPerson;
    }
}
