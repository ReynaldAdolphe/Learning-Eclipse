
import java.util.ArrayList;

class Caretaker {
   
	// Where all mementos are saved
	
	ArrayList<Memento> savedStatements = new ArrayList<Memento>();

	// Adds memento to the ArrayList
	
	public void addMemento(Memento m) { savedStatements.add(m); }
   
	// Gets the memento requested from the ArrayList
	
	public Memento getMemento(int index) { return savedStatements.get(index); }
} 