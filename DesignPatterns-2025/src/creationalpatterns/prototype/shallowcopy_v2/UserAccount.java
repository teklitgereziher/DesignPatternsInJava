package creationalpatterns.prototype.shallowcopy_v2;

import java.util.Vector;

public class UserAccount implements Cloneable {
    private String userName;
    private String password;
    private String fname;
    private String lname;
    private Vector<String> permissions = new Vector<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String uName) {
        userName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        password = pwd;
    }

    public String getFName() {
        return fname;
    }

    public void setFName(String name) {
        fname = name;
    }

    public String getLName() {
        return lname;
    }

    public void setLName(String name) {
        lname = name;
    }

    public Vector<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Vector<String> rights) {
        permissions = rights;
    }

    public Object clone() {
        //Shallow Copy
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
