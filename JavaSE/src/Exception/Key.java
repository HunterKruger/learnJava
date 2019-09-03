package Exception;
public class Key {
	public static void main( String[] args ){
		int dividend = 0;
		int divisor = 1;
		int result = 0;
		try{
			dividend = Integer.parseInt( args[0] );
			divisor = Integer.parseInt( args[1] );
			result = dividend / divisor;	
			System.out.println( "result = " + result );
		}catch( ArrayIndexOutOfBoundsException e ){
			System.out.println( "Parameters are not enough, please input 2 parameters!" );
		}catch( NumberFormatException e ){
			System.out.println( "The formation of parameters is wrong.At least input 2 numbers!" );
		}catch( ArithmeticException e ){
			System.out.println( "The divisor is zero!" );
		}		
	}
}