package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.bean.UtenteBean;
import model.dao.UtenteDao;

public class UtenteService {
	
	UtenteDao ud = new UtenteDao();

	public List<UtenteBean> firstQueryExam () {
		Map<Long, Integer> utentiTrovati = ud.firstQueryExam();
		List<UtenteBean> result = new ArrayList<>();
		for (Map.Entry<Long, Integer> entry : utentiTrovati.entrySet()) {
		    UtenteBean utente = ud.findById(entry.getKey());
		    result.add(utente);
		}
		for (UtenteBean ut : result) {
			System.out.println(ut);
		}
		return result;
	}
}
