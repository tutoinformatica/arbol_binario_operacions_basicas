
public class Main {

	public static void main(String args[]){
		arbolBinario arbol = new arbolBinario();
		arbol.insertarNodo(14, "cristianRonaldo");
		arbol.insertarNodo(12, "ozil");
		arbol.insertarNodo(9, "benzema");
		arbol.insertarNodo(10, "casillas");
		arbol.insertarNodo(7, "pepe");
		arbol.insertarNodo(8, "ramos");
		arbol.insertarNodo(13, "bale");
		
		arbol.MostrarArbol();
	}
}
