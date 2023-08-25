package com.oplus.multiuser;

import android.os.UserHandle;

public class OplusMultiUserManager {
    public OplusMultiUserManager() {};

    public static OplusMultiUserManager sOplusMultiUserManager = null;

    public static OplusMultiUserManager getInstance() {
        if (sOplusMultiUserManager == null) {
            sOplusMultiUserManager = new OplusMultiUserManager();
        }
        return sOplusMultiUserManager;
    }

    public boolean isMultiSystemUserHandle(UserHandle userHandle) {
        return true;
    }
}
