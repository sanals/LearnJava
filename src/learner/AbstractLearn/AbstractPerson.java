/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner.AbstractLearn;

/**
 *
 * @author pc4
 */
public abstract class AbstractPerson {
	
	private String name;
	
	public AbstractPerson(String nm){
		this.name=nm;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name="+this.name;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}

