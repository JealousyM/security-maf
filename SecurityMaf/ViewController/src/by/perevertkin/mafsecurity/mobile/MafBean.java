package by.perevertkin.mafsecurity.mobile;

import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;

public class MafBean {
    public MafBean() {
    }

    public void logout(ActionEvent actionEvent) {
        AdfmfJavaUtilities.logout();
    }
}
