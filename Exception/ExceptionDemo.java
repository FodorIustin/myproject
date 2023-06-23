package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String[] strArray = new String[10];
		
		
		try {
		//System.out.println(strArray[11]);
		//	System.out.println(1/0);
			
			if(false)
				throw new MyException("Timp expirat",100);
				myMethod();
		}catch (MyException e){
			System.out.println(" Da am intrat la tratarea MyEception");
			System.out.println(e);
		} catch(MyNewException e){
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("A aparut o problema: " + e.getMessage());
		}
		finally {
			System.out.println("Trecem cu bine si prin finally!");
		}
		System.out.println("Si astfel s-a incheiat programul cu bine!");
	}
		public static void myMethod() throws MyNewException {
			throw new MyNewException("Noua exceptie!");
		}
}
