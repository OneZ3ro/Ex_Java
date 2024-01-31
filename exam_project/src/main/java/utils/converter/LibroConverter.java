package utils.converter;

import model.bean.LibroBean;
import model.dto.LibroDto;

public class LibroConverter {
	public LibroDto toDto(LibroBean libroBean) {
		LibroDto libroDto = new LibroDto();
		libroDto.setIdLibro(libroBean.getIdLibro());
		libroDto.setTitolo(libroBean.getTitolo());
		libroDto.setAutore(libroBean.getAutore());
		libroDto.setIdPegi(libroBean.getIdPegi());
		libroDto.setDescrizione(libroBean.getDescrizione());
		libroDto.setPrezzo(libroBean.getPrezzo());
		libroDto.setTotDisponibili(libroBean.getTotDisponibili());
		libroDto.setDataPubblicazione(libroBean.getDataPubblicazione());
		
		return libroDto;
	}
	
	public LibroBean toBean(LibroDto libroDto) {
		LibroBean libroBean = new LibroBean();
		libroBean.setIdLibro(libroDto.getIdLibro());
		libroBean.setTitolo(libroDto.getTitolo());
		libroBean.setAutore(libroDto.getAutore());
		libroBean.setIdPegi(libroDto.getIdPegi());
		libroBean.setDescrizione(libroDto.getDescrizione());
		libroBean.setPrezzo(libroDto.getPrezzo());
		libroBean.setTotDisponibili(libroDto.getTotDisponibili());
		libroBean.setDataPubblicazione(libroDto.getDataPubblicazione());
		
		return libroBean;
	}
}
