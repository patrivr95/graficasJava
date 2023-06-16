package presentacion.adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import service.PaisesService;
import service.PaisesServiceFactory;

public class AdaptadorListaPaises extends DefaultComboBoxModel<String> {
	
	List<String> continentes;
	public AdaptadorListaPaises() {
		PaisesService service =PaisesServiceFactory.getPaisesService();
		continentes = service.continentes();
	}
	
	@Override
	public int getSize() {
		return continentes.size();
	}
	
	@Override
	public String getElementAt(int index) {
		return continentes.get(index);
	}
}
