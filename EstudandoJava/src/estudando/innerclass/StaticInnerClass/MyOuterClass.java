package estudando.innerclass.StaticInnerClass;

public class MyOuterClass {

	private static int x = 10;
	
	
	// Criando uma static Inner Class normal(� uma Regular Inner Class s� que com static)
	public static class MyInnerClass{
		
		public void imprimir() {
			x = 19; // Consegue alterar pq elementos estaticos conversam entre si
			System.out.println(x);
			
			int y = 20;
			System.out.println(y);
		}
	}
	
	
	
}
