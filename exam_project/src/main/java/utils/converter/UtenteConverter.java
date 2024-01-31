package utils.converter;

import model.bean.UtenteBean;
import model.dto.UtenteDto;

public class UtenteConverter {
	public UtenteDto toDto(UtenteBean utenteBean) {
		UtenteDto utenteDto = new UtenteDto();
		
		utenteDto.setIdUtente(utenteBean.getIdUtente());
		utenteDto.setNome(utenteBean.getNome());
		utenteDto.setCognome(utenteBean.getCognome());
		utenteDto.setDataNascita(utenteBean.getDataNascita());
		utenteDto.setEmail(utenteBean.getEmail());
		utenteDto.setPassword(utenteBean.getPassword());
		utenteDto.setPremium(utenteBean.isPremium());
		utenteDto.setIdRuolo(utenteBean.getIdRuolo());
		return utenteDto;
	}
	
	public UtenteBean toBean(UtenteDto utenteDto) {
		UtenteBean utenteBean = new UtenteBean();
		
		utenteBean.setIdUtente(utenteDto.getIdUtente());
		utenteBean.setNome(utenteDto.getNome());
		utenteBean.setCognome(utenteDto.getCognome());
		utenteBean.setDataNascita(utenteDto.getDataNascita());
		utenteBean.setEmail(utenteDto.getEmail());
		utenteBean.setPassword(utenteDto.getPassword());
		utenteBean.setPremium(utenteDto.isPremium());
		utenteBean.setIdRuolo(utenteDto.getIdRuolo());
		
		return utenteBean;
	}
}
