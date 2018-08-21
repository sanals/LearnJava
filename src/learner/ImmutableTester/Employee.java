/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner.ImmutableTester;

public final class Employee {

    final String pancardNumber;
    final User userShare;

    public Employee(String pancardNumber, User share) {
        this.pancardNumber = pancardNumber;
        userShare = (User)share.clone();
    }

    public String getPancardNumber() {
        return pancardNumber;
    }

    public User share() {
        return (User)userShare.clone();
    }

    public String shareString() {
        return pancardNumber;
    }

}
