package model.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UtenteBean {
	private Long idUtente;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String email;
	private String password;
	private boolean isPremium;
	private Long idRuolo;
	private LocalDateTime dataCreazione;
	private LocalDateTime dataModifica;
	private boolean flgCancellato;
	
	public UtenteBean() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	public Long getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(Long idRuolo) {
		this.idRuolo = idRuolo;
	}

	public LocalDateTime getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(LocalDateTime dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public LocalDateTime getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(LocalDateTime dataModifica) {
		this.dataModifica = dataModifica;
	}

	public boolean isFlgCancellato() {
		return flgCancellato;
	}

	public void setFlgCancellato(boolean flgCancellato) {
		this.flgCancellato = flgCancellato;
	}

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	@Override
	public String toString() {
		return "UtenteBean [idUtente=" + idUtente + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", email=" + email + ", password=" + password + ", idRuolo=" + idRuolo
				+ ", dataCreazione=" + dataCreazione + ", dataModifica=" + dataModifica + ", flgCancellato="
				+ flgCancellato + "]";
	}
	
	
	
}
