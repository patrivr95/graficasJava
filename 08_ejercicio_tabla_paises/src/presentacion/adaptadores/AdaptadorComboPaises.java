package presentacion.adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Pais;
import service.PaisesService;

public class AdaptadorComboPaises extends DefaultComboBoxModel<Pais> {
	
	List<String> paises;
	public AdaptadorComboPaises() {
		PaisesService service = new PaisesService();
		paises = service.continentes();
	}
	
	@Override
	public int getSize() {
		return paises.size();
	}
	
	@Override
	public String getElementAt(int index) {
		return paises.get(index);
	}
}
