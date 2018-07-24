 
public class Originator{
	
	private String statement;

	// Sets the value for the statement
	
	public void set(String newStatement) { 
		System.out.println("From Originator: Current Version of Statement\n"+newStatement+ "\n");
	    this.statement = newStatement; 
	}

	// Creates a new Memento with a new statement
	
	public Memento storeInMemento() { 
	    System.out.println("From Originator: Saving to Memento");
	    return new Memento(statement); 
	}
	   
	// Gets the statement currently stored in memento
	
	public String restoreFromMemento(Memento memento) {
		   
		statement = memento.getSavedStatement(); 
	       
		System.out.println("From Originator: Previous Statement Saved in Memento\n"+statement + "\n");
		
		return statement;
	   
	}
	
}