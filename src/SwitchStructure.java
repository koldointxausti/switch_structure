//this programs checks the value of int in different cases.
public class SwitchStructure {
	public static void main (String[] arg) {
				//define the value of x
		        int x = 6;
		 
		        switch ( x ) {
		        	//in case the value of x is:
		            case 1:
		            case 2:
		            case 3:
		            //show this:
		                System.out.println( "El valor de x estaba entre 1 y 3" );
		                break;
		            //in case the value of x is:
		            case 4:
		            case 5:
		            //show this:
		                System.out.println( "El valor de x era 4 o 5" );
		                break;
		            //in case the value is:
		            case 6:
		                System.out.println( "El valor de x era  6" );
		                int valorTemporal = 10;
		                System.out.println( "Operaciones auxiliares completadas" );
		                break;
		            // if the value is not any of the cases we've entered show this:
		            default:
		                System.out.println( "El valor de x no estaba entre 1 y 6" );
		                break;
		}
	}
}
