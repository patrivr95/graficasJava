package presentacion.adaptadores;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Pais;
import service.PaisesService;

public class AdaptadorTablaPaises extends AbstractTableModel {
	
	List<Pais> paises;
	public AdaptadorTablaPaises() {
		PaisesService service = new PaisesService();
		paises=service.paisesFromJson();
	}
	
	@Override
	public int getRowCount() {
		return paises.size();
	}
	@Override
	public int getColumnCount() {
		return 4;
	}
	@Override
	public String getColumnName(int column) {
		switch (column) {
        case 0:
            return "País";
        case 1:
            return "Capital";
        case 2:
        	return "Población";
        case 3:
        	return "Bandera";
		}
		return null;
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		switch(column) {
			case 0:
				return paises.get(row).getPais();
			case 1:
				return paises.get(row).getCapital();
			case 2:
				return paises.get(row).getPoblacion();
			case 3:
				return paises.get(row).getBandera();
		}
		return null;
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex) {
		case 0:
			return String.class;
		case 1:
			return String.class;
		case 2:
			return Long.class;
		case 3:
			return String.class;
		}
		return null;
	}
	
	
	
}
