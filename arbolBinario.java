
public class arbolBinario {
	Nodo raiz;
	public arbolBinario(){
		raiz = null;
	}
	public void MostrarArbol(){
		Nodo iterador;
		int nivel=0;
		iterador = raiz;
		if(iterador!=null)
			System.out.println("nodo raiz nivel "+nivel+"   valor->"+iterador.valor);
		else
			System.out.println("arbol vacio");
		nivel++;//esto es para contar en que nivel esta el arbol
		while(true){
			
			if(iterador.hijoIzquierdo != null)
				
				System.out.println("hijo izquierdo nivel "+nivel+"  valor->"+iterador.hijoIzquierdo.valor);
			    
			if(iterador.hijoDerecho != null)
				System.out.println("hijo derecho nivel "+nivel+"  valor->"+iterador.hijoDerecho.valor);
				
			if(iterador.hijoIzquierdo != null){
				iterador = iterador.hijoIzquierdo;
				nivel++;
			}
			else if(iterador.hijoDerecho != null){
				iterador = iterador.hijoDerecho;
			}
			else{
				return;
			}
			
		}
		
	}
	public void insertarNodo(int valor,String nombre){
		//creamos un nuevo objeto de tipo nodo
		Nodo nuevoNodo = new Nodo(valor,nombre);
		if(raiz == null){
			//si no hay arbol lo creamos
			raiz = nuevoNodo;
		}
		else{
			//empezamos a recorrer el ‡rbol para saber donde insertar el numero
			//en este  ‡rbol binario el hijo izquierdo es mas peque–o que el derecho
			Nodo nodoIterador = raiz ;//hacemos que nodoBase apunte a la ra’z del arbol
			Nodo padre;
			while(true){
				padre = nodoIterador;
				if(valor < nodoIterador.valor){
					//si entramos aqui vamos a recorrer el sub‡rbol izquierdo
					nodoIterador = nodoIterador.hijoIzquierdo;//miramos si tiene hijo izquierdo
					if(nodoIterador == null){
						//si entra aqui significaria que el nodo actual que estamos mirando no tiene hijos
						padre.hijoIzquierdo = nuevoNodo;
						return;//salimos de todo porque ya hemos insertado no hace falta seguir recorriendo el ‡rbol
					}
				}else{
					//si entramos aqui vamos a recorrer el subarbol derecho
					nodoIterador = nodoIterador.hijoDerecho;
					if(nodoIterador == null){
						//si entra aqui significaria que el nodo actual que estamos mirando no tiene hijos
						padre.hijoDerecho = nuevoNodo;
						return;//salimos de todo porque ya hemos insertado no hace falta seguir recorriendo el ‡rbol
					}
				}
			}
			
		}
		
		
	}
}
