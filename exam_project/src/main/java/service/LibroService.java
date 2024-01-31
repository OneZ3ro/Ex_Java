package service;

import java.util.List;
import java.util.Map;

import model.bean.LibroBean;
import model.dao.LibroDao;

public class LibroService {

	LibroDao ld = new LibroDao();
	
	public List<LibroBean> secondQueryExam(String autore) {
		List<LibroBean> result = ld.secondQueryExam(autore);
		return result;
	}
	
	public Map<Long, Integer> thirdQueryExam() {
		Map<Long, Integer> result = ld.thirdQueryExam();
		return result;
	}
}
