package use_case.clear_users;


import java.util.ArrayList;
import java.util.Arrays;

public class ClearOutputData {
    private final ArrayList<String> usernames = new ArrayList<>();

    public ClearOutputData(String usernames) { this.usernames.addAll(Arrays.asList(usernames.split(","))); }

    public ArrayList<String> getClearedUsernames() { return usernames; }
}
