package myPackage4;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor construtor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.spellChecking();
	}

}
