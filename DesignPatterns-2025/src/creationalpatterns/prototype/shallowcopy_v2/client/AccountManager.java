package creationalpatterns.prototype.shallowcopy_v2.client;

import creationalpatterns.prototype.shallowcopy_v2.AccountPrototypeFactory;
import creationalpatterns.prototype.shallowcopy_v2.UserAccount;

import java.util.Vector;

public class AccountManager {
    public static void main(String[] args) {
        /*
        Create Prototypical Objects
        */
        Vector<String> supervisorPermissions = new Vector<>();
        supervisorPermissions.add("read");
        UserAccount supervisor = new UserAccount();
        supervisor.setPermissions(supervisorPermissions);

        Vector<String> accountRepPermissions = new Vector<>();
        accountRepPermissions.add("read");
        accountRepPermissions.add("write");
        UserAccount accountRep = new UserAccount();
        accountRep.setPermissions(accountRepPermissions);

        AccountPrototypeFactory factory = new AccountPrototypeFactory(supervisor, accountRep);

        /* Using prototype objects to create other user accounts */
        UserAccount newSupervisor = factory.getSupervisor();
        newSupervisor.setUserName("PKuchana");
        newSupervisor.setPassword("Everest");
        System.out.println(newSupervisor);
        UserAccount anotherSupervisor = factory.getSupervisor();
        anotherSupervisor.setUserName("SKuchana");
        anotherSupervisor.setPassword("Everest");
        System.out.println(anotherSupervisor);
        UserAccount newAccountRep = factory.getAccountRep();
        newAccountRep.setUserName("VKuchana");
        newAccountRep.setPassword("Vishal");
        System.out.println(newAccountRep);
    }
}
