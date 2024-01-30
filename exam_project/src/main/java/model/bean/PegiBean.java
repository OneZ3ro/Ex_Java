package model.bean;

public class PegiBean {
	private Long idPegi;
	private String titolo;
	private String descrizione;
	
	public PegiBean () {}

	public Long getIdPegi() {
		return idPegi;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	};
	
	
}
