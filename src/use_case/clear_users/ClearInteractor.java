package use_case.clear_users;


public class ClearInteractor {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    public void execute() {
        String clearedUsers = userDataAccessObject.clear();

        if (clearedUsers.isEmpty()) {
            userPresenter.prepareFailView("No users have been signed up");
        } else {
                userPresenter.prepareSuccessView(new ClearOutputData(clearedUsers));
        }
    }
}
