package vergleichen;

public class Student {

	private int matrnr;
	private String vorname;
	private String nachname;
	private int semester;

	// Konstruktoren
	public Student() {
//		throw new IllegalArgumentException("Obacht");
	}

	public Student(int matrnr, String vorname, String nachname, int semester) {
		super();
		this.matrnr = matrnr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.semester = semester;
	}

	// Getter & Setter
	public int getMatrnr() {
		return matrnr;
	}

	public void setMatrnr(int matrnr) {
		this.matrnr = matrnr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Student [matrnr=" + matrnr + ", vorname=" + vorname + ", nachname=" + nachname + ", semester="
				+ semester + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matrnr;
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + semester;
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	
	// Erzeugt
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (matrnr != other.matrnr)
//			return false;
//		if (nachname == null) {
//			if (other.nachname != null)
//				return false;
//		} else if (!nachname.equals(other.nachname))
//			return false;
//		if (semester != other.semester)
//			return false;
//		if (vorname == null) {
//			if (other.vorname != null)
//				return false;
//		} else if (!vorname.equals(other.vorname))
//			return false;
//		return true;
//	}

	
	// Selbstgeschrieben
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false; // Überprüfen, ob es von derselben Klasse ist
		Student other = (Student) obj; // Casten der Referenzvariable zum Student
		return this.matrnr == other.matrnr;
//				&& this.vorname.equals(other.vorname) 
//				&& this.nachname.equals(other.nachname)
//				&& this.semester == other.semester;
	}
	
	

}
