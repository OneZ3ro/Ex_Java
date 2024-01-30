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

import model.bean.LibroBean;
import utils.DbConnection;

public class LibroDao {
	public List<LibroBean> secondQueryExam(String autore) {
		String query = "SELECT * FROM libri where autore = ? order by data_pubblicazione";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, autore);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs;
		
		List<LibroBean> result = new ArrayList<>();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				LibroBean libro = new LibroBean();
				libro.setIdLibro(rs.getLong("id_libro"));
				libro.setTitolo(rs.getString("titolo"));
				libro.setAutore(rs.getString("autore"));
				libro.setIdPegi(rs.getLong("id_pegi"));
				libro.setDescrizione(rs.getString("descrizione"));
				libro.setPrezzo(rs.getDouble("prezzo"));
				libro.setTotDisponibili(rs.getInt("tot_disponibili"));
				libro.setDataPubblicazione(rs.getTimestamp("data_pubblicazione").toLocalDateTime().toLocalDate());
				libro.setDataCreazione(rs.getTimestamp("data_creazione").toLocalDateTime());
				libro.setDataModifica(rs.getTimestamp("data_modifica").toLocalDateTime());
				libro.setFlgCancellato(rs.getBoolean("flg_cancellato"));
				result.add(libro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		
		for(LibroBean l : result) {
			System.out.println(l);
		}
		
		return result;
	}

	public Map<Long, Integer> thirdQueryExam (){
		String query = "SELECT id_libro, tot_disponibili from libri;";
		Map<Long, Integer> libriTrovati = new HashMap<>();
		

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		Statement st = null;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				libriTrovati.put(rs.getLong("id_libro"), rs.getInt("tot_disponibili"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		dbCon.closeConnection(con);
		for (Map.Entry<Long, Integer> entry : libriTrovati.entrySet()) {
			if (entry.getValue() > 3) {
			    System.out.println("Libro id: " + entry.getKey() + " ha ancora disponibile " + entry.getValue() + " copie");
			} else {
				System.out.println("Libro id: " + entry.getKey() + " ha ancora disponibile " + entry.getValue() + " copie. ATTENZIONE!! è IN ESAURIMENTO");
			}
		}
		
		return libriTrovati;
	}
	
}
