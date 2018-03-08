import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class any_nou_xinesTest {

	@Test
	public void testElement() {
		assertEquals("MADERA", AnyNouXines.element(1714));
		assertEquals("METAL", AnyNouXines.element(1));
		assertEquals("TIERRA", AnyNouXines.element(1998));
		assertEquals("METAL", AnyNouXines.element(0));
		assertEquals("TIERRA", AnyNouXines.element(9999));
	}

	@Test
	public void testAnimalAnual() {
		assertEquals("CABALLO", AnyNouXines.animalAnual(1714));
		assertEquals("GALLO", AnyNouXines.animalAnual(1));
		assertEquals("TIGRE", AnyNouXines.animalAnual(1998));
		assertEquals("MONO", AnyNouXines.animalAnual(0));
		assertEquals("CERDO", AnyNouXines.animalAnual(9999));
	}

	@Test
	public void testAnimalIntern() {
		assertEquals("SERPIENTE", AnyNouXines.animalIntern(5, 27));
		assertEquals("RATA", AnyNouXines.animalIntern(12, 25));
		assertEquals("SERPIENTE", AnyNouXines.animalIntern(6, 1));
		assertEquals("RATA", AnyNouXines.animalIntern(1, 1));
		assertEquals("RATA", AnyNouXines.animalIntern(12, 31));
	}

	@Test
	public void testAnimalSecret() {
		assertEquals("MONO", AnyNouXines.animalSecret(15, 21));
		assertEquals("BUEY", AnyNouXines.animalSecret(1, 0));
		assertEquals("GALLO", AnyNouXines.animalSecret(17, 55));
		assertEquals("BUEY", AnyNouXines.animalSecret(1, 0));
		assertEquals("RATA", AnyNouXines.animalSecret(24, 59));
	}
}