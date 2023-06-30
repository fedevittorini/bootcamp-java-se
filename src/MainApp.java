import com.eduit.Calculadora;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora!");
		
		if (args.length != 3) {
			System.out.println("Se esperan 3 argumentos:");
			System.out.println("Uso java MainApp 3 2 S");
			return;
		}
		Double op1 = Double.valueOf(args[0]);
		Double op2 = Double.valueOf(args[1]);
		
		//[type] [Nombre] = new [NOMBRE de object *type] ( args.... ) ;
		Calculadora calc = new Calculadora(true);
		Double resp = calc.calc(op1, op2, args[2]);
		System.out.print("Salida: ");
		System.out.print(resp);
	}


}
