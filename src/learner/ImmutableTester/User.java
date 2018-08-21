/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner.ImmutableTester;

/**
 *
 * @author pc4
 */
class User implements Cloneable {

    private String userName;
    private String userID;
    private int userNode;

    User(String name, int node) {
        userName = name;
        userNode = node;
    }

    public void setUserName(String name) {//since clonnable class implemented, we can use set method
        userName = name;
    }

    public void setUserID(String userid) {//since clonnable class implemented, we can use set method
        userID = userid;
    }

    public void setUserNode(int node) {//since clonnable class implemented, we can use set method
        userNode = node;
    }

    public String userName() {
        return userName;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            //This should not happen, since this class is Cloneable.
            throw new InternalError();
        }
    }
}
