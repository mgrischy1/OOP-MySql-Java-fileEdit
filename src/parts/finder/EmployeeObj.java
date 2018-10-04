/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts.finder;

/**
 *
 * @author mikeg
 */
public class EmployeeObj {
    private int idRegister;
    private String user;
    private String password;
    private String level;

    public int getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(int idRegister) {
        this.idRegister = idRegister;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public EmployeeObj(int idRegister, String user, String password, String level) {
        this.idRegister = idRegister;
        this.user = user;
        this.password = password;
        this.level = level;
    }
}
