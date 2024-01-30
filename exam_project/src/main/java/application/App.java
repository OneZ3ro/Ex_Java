package application;

import model.dao.LibroDao;
import model.dao.UtenteDao;

public class App {

	public static void main(String[] args) {
		UtenteDao ud = new UtenteDao();
		LibroDao ld = new LibroDao();
		System.out.println("--------- EX 1 ----------");
		ud.firstQueryExam();
		System.out.println();
		System.out.println("--------- EX 2 ----------");
		ld.secondQueryExam("autore 1");
		System.out.println();
		System.out.println("--------- EX 3 ----------");
		ld.thirdQueryExam();
		
	}

}
