package Zad5Citizen;

import java.util.ArrayList;
import java.util.List;

public class Town {

    Citizen[] citizensTab;

    public Town(final Citizen[] citizensTab) {
        this.citizensTab = citizensTab;
    }

    public List<String> whoCanVote() {
        List<String> nameList = new ArrayList<>();
        for (Citizen citizen : citizensTab) {
            if (citizen.canVote()) {
                nameList.add((citizen.getImie()));
            }
        }
        return nameList;
    }
}
