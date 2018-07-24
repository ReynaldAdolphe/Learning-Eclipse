

public class Memento {
	
	// The statement stored in memento Object
	
	private String statement;

	// Save a new statement String to the memento Object
	
	public Memento(String statementSave) { statement = statementSave; }
	
	// Return the value stored in statement 
	
	public String getSavedStatement() { return statement; }
	
}