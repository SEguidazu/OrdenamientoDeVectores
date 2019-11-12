
public class OrdenarVector {

	private int[] vector = {
			12, 20, 2, 40, 50, 41, 45, 23, 14, 3
	};
	
	
	public void ordenarVectorSeleccion() {
		int max, pos, aux;
		for(int i = 0; i < this.vector.length - 1; i++) {
			max = this.vector[i];
			pos = i;
			for(int j = i + 1; j < this.vector.length; j++) {
				if (this.vector[j] > max) {
					max = this.vector[j];
					pos = j;
				}
			}
			if(pos != i) {
				aux = this.vector[i];
				this.vector[i] = this.vector[pos];
				this.vector[pos] = aux;
			}
		}
	}
	
	
	public void ordenarVectorBurbujeo() {
		boolean ordenado = false;
		int aux;
		for(int i = 0; i < this.vector.length - 1 && !ordenado; i++) {
			ordenado = true;
			for(int j = 0; j < this.vector.length - 1 - i; j++) {
				if(this.vector[j + 1] > this.vector[j]) {
					aux = this.vector[j + 1];
					this.vector[j + 1] = this.vector[j];
					this.vector[j] = aux;
					ordenado = false;
				}
			}
		}
	}
	
	
	public void odenarVectorInsercion() {
		int j, aux;
	    for (int i = 1; i < this.vector.length; i++) {
	    	aux = this.vector[i];
	        j = i - 1;
	        while ((j >= 0) && (aux < this.vector[j])){
	        	this.vector[j + 1] = this.vector[j];
	            j--;
	        }
	        this.vector[j + 1] = aux; 
	    }
	}
	

	public int[] getVector() {
		return vector;
	}
	
	
	
}
