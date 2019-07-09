package Ex1WeddingInvitation;

import lombok.Data;

@Data
class Invitation {
    private String name;
    private String surname;
    private WeddingEnum weddingInvitationType;

}
