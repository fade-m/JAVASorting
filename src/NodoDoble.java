
public class NodoDoble {
	
	private int dato;
	private NodoDoble siguiente;
	private NodoDoble anterior;
	
	public NodoDoble() {
		
	}
	
	public NodoDoble getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoDoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}


}
