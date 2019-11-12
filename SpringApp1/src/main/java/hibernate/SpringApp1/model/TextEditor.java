package hibernate.SpringApp1.model;
public class TextEditor 
{
private SpellChecker sc;

public SpellChecker getSc() {
	return sc;

}
public void setSc(SpellChecker sc) {
	this.sc = sc;
}

		/*public TextEditor(SpellChecker sc) {
	  super();
       this.sc=sc;                                    }
*/

/*
		public TextEditor(SpellChecker sc) {
			super();
			this.sc = sc;
		}*/

        public void display()
{
	System.out.println("Writing starts");
	sc.checks();
}
}
