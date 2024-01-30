package model.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LibroBean {
 private Long idLibro;
 private String titolo;
 private String autore;
 private Long idPegi;
 private String descrizione;
 private double prezzo;
 private int totDisponibili;
 private LocalDate dataPubblicazione;
 private LocalDateTime dataCreazione;
 private LocalDateTime dataModifica;
 private boolean flgCancellato;
 
 public LibroBean() {}

public String getTitolo() {
	return titolo;
}

public void setIdLibro(Long idLibro) {
	this.idLibro = idLibro;
}

public void setTitolo(String titolo) {
	this.titolo = titolo;
}

public String getAutore() {
	return autore;
}

public void setAutore(String autore) {
	this.autore = autore;
}

public Long getIdPegi() {
	return idPegi;
}

public void setIdPegi(Long idPegi) {
	this.idPegi = idPegi;
}

public String getDescrizione() {
	return descrizione;
}

public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}

public double getPrezzo() {
	return prezzo;
}

public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}

public int getTotDisponibili() {
	return totDisponibili;
}

public void setTotDisponibili(int totDisponibili) {
	this.totDisponibili = totDisponibili;
}

public LocalDate getDataPubblicazione() {
	return dataPubblicazione;
}

public void setDataPubblicazione(LocalDate dataPubblicazione) {
	this.dataPubblicazione = dataPubblicazione;
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

public Long getIdLibro() {
	return idLibro;
}

@Override
public String toString() {
	return "LibroBean [idLibro=" + idLibro + ", titolo=" + titolo + ", autore=" + autore + ", idPegi=" + idPegi
			+ ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", totDisponibili=" + totDisponibili
			+ ", dataPubblicazione=" + dataPubblicazione + ", dataCreazione=" + dataCreazione + ", dataModifica="
			+ dataModifica + ", flgCancellato=" + flgCancellato + "]";
}


 
}
