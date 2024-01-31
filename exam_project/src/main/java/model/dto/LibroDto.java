package model.dto;

import java.time.LocalDate;

public class LibroDto {
 private Long idLibro;
 private String titolo;
 private String autore;
 private Long idPegi;
 private String descrizione;
 private double prezzo;
 private int totDisponibili;
 private LocalDate dataPubblicazione;
 
 public LibroDto() {}

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

public Long getIdLibro() {
	return idLibro;
}
 
}
