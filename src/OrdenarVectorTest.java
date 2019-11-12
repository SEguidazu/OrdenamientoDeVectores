import org.junit.Assert;
import org.junit.Test;


public class OrdenarVectorTest {
	
	@Test //Seleccion
	public void testOrdenarVectorSeleccion() {
		OrdenarVector vector = new OrdenarVector();
		
		int[] vectorTest = {
				50, 45, 41, 40, 23, 20, 14, 12, 3, 2
		};
		
		vector.ordenarVectorSeleccion();
		
		
		Assert.assertArrayEquals(vectorTest, vector.getVector());
	}
	
	@Test //Burbujeo
	public void testOrdenarVectorBurbujeo() {
		OrdenarVector vector = new OrdenarVector();
		
		int[] vectorTest = {
				50, 45, 41, 40, 23, 20, 14, 12, 3, 2
		};
		
		vector.ordenarVectorBurbujeo();
		
		
		Assert.assertArrayEquals(vectorTest, vector.getVector());
	}

}
