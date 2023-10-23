package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputData;
import java.util.ArrayList;

public class ClearState {
    private final ArrayList<String> usernames = new ArrayList<>();
    private String clearError;

    public void addClearedUser(ClearOutputData users) {
        this.usernames.addAll(users.getClearedUsernames());
    }

    public void setClearError(String error) { this.clearError = error; }

    public String toString() {
        StringBuilder clearedUserNames = new StringBuilder();

        for (String username: usernames) {
            clearedUserNames.append(username).append("\n");
        }

        return clearedUserNames.toString();
    }

    public Object getClearError() {
        return clearError;
    }
}
