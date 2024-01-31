package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.bean.UtenteBean;
import utils.DbConnection;

public class UtenteDao {
	
	public List<UtenteBean> findAll(){
		String query = "SELECT * FROM utenti";
		DbConnection dbConnection = new DbConnection();
		Connection con = dbConnection.getConnection();
		Statement st = null;
		List<UtenteBean> utenti = new ArrayList<>();
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				UtenteBean utente = new UtenteBean();
				utente.setIdUtente(rs.getLong("id_utente"));
				utente.setNome(rs.getString("nome"));
				utente.setCognome(rs.getString("cognome"));
				utente.setDataNascita(rs.getTimestamp("data_nascita").toLocalDateTime().toLocalDate());
				utente.setEmail(rs.getString("email"));
				utente.setPassword(rs.getString("password"));
				utente.setPremium(rs.getBoolean("is_premium"));
				utente.setIdRuolo(rs.getLong("id_ruolo"));
				utente.setPremium(rs.getBoolean("is_premium"));
				utente.setDataCreazione(rs.getTimestamp("data_creazione").toLocalDateTime());
				utente.setDataModifica(rs.getTimestamp("data_modifica").toLocalDateTime());
				utente.setFlgCancellato(rs.getBoolean("flg_cancellato"));
				utenti.add(utente);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		dbConnection.closeConnection(con);
		return utenti;
	}
	
	public UtenteBean findById(Long id) {
		String query = "SELECT * FROM utenti WHERE id_utente=?";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs;
		UtenteBean utente = new UtenteBean();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				utente.setIdUtente(rs.getLong("id_utente"));
				utente.setNome(rs.getString("nome"));
				utente.setCognome(rs.getString("cognome"));
				utente.setDataNascita(rs.getTimestamp("data_nascita").toLocalDateTime().toLocalDate());
				utente.setEmail(rs.getString("email"));
				utente.setPassword(rs.getString("password"));
				utente.setPremium(rs.getBoolean("is_premium"));
				utente.setIdRuolo(rs.getLong("id_ruolo"));
				utente.setPremium(rs.getBoolean("is_premium"));
				utente.setDataCreazione(rs.getTimestamp("data_creazione").toLocalDateTime());
				utente.setDataModifica(rs.getTimestamp("data_modifica").toLocalDateTime());
				utente.setFlgCancellato(rs.getBoolean("flg_cancellato"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		
		return utente;
	}
	
	public Map<Long, Integer> firstQueryExam (){
		List<UtenteBean> allUtenti = this.findAll();
		String query = "SELECT COUNT(id_utente) AS total FROM utenti_libri WHERE id_utente = ? AND descrizione = 'Acquisto'";
		Map<Long, Integer> utentiTrovati = new HashMap<>();
		

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs;
		try {
			for (UtenteBean utente: allUtenti) {
				ps = con.prepareStatement(query);
				ps.setLong(1, utente.getIdUtente());
				rs = ps.executeQuery();
				//rs.getInt("total");
				while (rs.next()) {
					int res = rs.getInt("total");
					if (res > 5) {
						utentiTrovati.put(utente.getIdUtente(), res);
					}
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbCon.closeConnection(con);
		/* for (Map.Entry<Long, Integer> entry : utentiTrovati.entrySet()) {
		    System.out.println("Utente id: " + entry.getKey() + " ha comprato " + entry.getValue().toString() + " libri in totale");
		} */
		
		return utentiTrovati;
	}
	

}
