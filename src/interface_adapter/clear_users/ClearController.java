package interface_adapter.clear_users;

import use_case.clear_users.ClearInteractor;

public class ClearController {

    final ClearInteractor clearInteractor;

    public ClearController(ClearInteractor clearInteractor) {
        this.clearInteractor = clearInteractor;
    }

    public void execute() { clearInteractor.execute(); }
}
