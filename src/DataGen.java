import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.github.javafaker.Faker;

/**
 * 
 */

/**
 * @author LUIS MIGUEL GOMEZ LONDOÑO 
 * UNIVERSIDAD DE LOS ANDES
 * 2019
 *
 */
public class DataGen {

	public final static int TIPO_IDENTIFICACION = 1;
	private static final int ID_HOTEL = 1;

	public static String reservasServicio(int i)
	{
		String row = "";
		int id = i;
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id_cliente = (int) (Math.random() * ((143157 - 301) + 1)) + 301;
		int tipo_id = TIPO_IDENTIFICACION;
		int id_servicio = (int)(Math.random() * ((12 - 1) + 1)) + 1;
		int diaAleatorioApertura = (int)(Math.random() * ((26 - 19) + 1)) + 19;
		String horaApertura = diaAleatorioApertura + "/05/2019";
		int diaAleatorioCierre = (int)(Math.random() * ((31 - 27) + 1)) + 27;
		String horaCierre = diaAleatorioCierre + "/05/2019";

		row = id + "," + id_cliente+ "," +tipo_id+ "," +id_servicio+ "," +horaApertura+ "," +horaCierre;
		return row;
	}

	private static String reservasMantenimientoHabitaciones(int i) {
		String row = "";
		int id = i;
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id_habitacion = (int) (Math.random() * ((1200 - 1) + 1)) + 1;
		int tipo_mantenimiento = 1;
		int en_mantenimiento = 0;
		int diaAleatorioApertura = (int)(Math.random() * ((25 - 24) + 1)) + 24;
		String horaApertura = diaAleatorioApertura + "/05/2019";
		int diaAleatorioCierre = (int)(Math.random() * ((27 - 26) + 1)) + 26;
		String horaCierre = diaAleatorioCierre + "/05/2019";

		row = id + "," + id_habitacion+ ",," +tipo_mantenimiento+ "," +en_mantenimiento+ "," +horaApertura + "," + horaCierre;
		return row;
	}

	private static String reservasMantenimientoServicios(int i) {
		String row = "";
		int id = i;
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id_servicio = (int)(Math.random() * ((12 - 1) + 1)) + 1;
		int tipo_mantenimiento = 2;
		int en_mantenimiento = 0;
		int diaAleatorioApertura = (int)(Math.random() * ((25 - 24) + 1)) + 24;
		String horaApertura = diaAleatorioApertura + "/05/2019";
		int diaAleatorioCierre = (int)(Math.random() * ((27 - 26) + 1)) + 26;
		String horaCierre = diaAleatorioCierre + "/05/2019";

		row = id + ",," + id_servicio+ "," +tipo_mantenimiento+ "," +en_mantenimiento+ "," +horaApertura + "," + horaCierre;
		return row;
	}

	private static String reservasHabitaciones(int i) {
		String row = "";
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id = i;
		int id_cliente = (int) (Math.random() * ((143157 - 301) + 1)) + 301;
		int tipo_id = TIPO_IDENTIFICACION;
		int id_habitacion = (int) (Math.random() * ((1200 - 1) + 1)) + 1;
		int id_plan_de_consumo = (int)(Math.random() * ((4 - 1) + 1)) + 1;
		int diaAleatorioInicio = (int)(Math.random() * ((26 - 19) + 1)) + 19;
		String fechaInicio = diaAleatorioInicio + "/05/2019";
		int diaAleatorioFin = (int)(Math.random() * ((31 - 27) + 1)) + 27;
		String fechaFin = diaAleatorioFin + "/05/2019";
		int chckin = 0;
		int chcko = 0;
		int paz = 0;

		row = id + "," + id_cliente + "," + tipo_id + "," + id_habitacion + "," + id_plan_de_consumo + "," + fechaInicio + "," + fechaFin + "," + chckin + "," + chcko + "," + paz;
		return row;
	}

	private static String reservasConvencionesHabitaciones(int i) {
		String row = "";

		int id = i;
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id_convencion = (int)(Math.random() * ((300 - 1) + 1)) + 1;
		int id_habitacion = (int) (Math.random() * ((1200 - 1) + 1)) + 1;

		row = id + "," + id_convencion + "," + id_habitacion + ",";
		return row;
	}

	private static String reservasConvencionesServicios(int i, int z,int j) {
		String row = "";

		int id = i;
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id_convencion = z;
		int id_servicio = j;

		row = id + "," + id_convencion + ",," + id_servicio;
		return row;
	}

	private static String gastos(int i) {
		String row = "";

		int id = i;
		//(int)(Math.random() * ((max - min) + 1)) + min
		int id_producto = (int)(Math.random() * ((20 - 1) + 1)) + 1;
		int id_reserva_habitacion = (int)(Math.random() * ((201145 - 1) + 1)) + 1;
		int diaAleatorioFin = (int)(Math.random() * ((31 - 19) + 1)) + 19;
		String fechaConsumo = diaAleatorioFin + "/05/2019";

		row = id + "," + id_producto + "," + id_reserva_habitacion + "," + fechaConsumo;
		return row;
	}
	
	private static String clientes(int i) {
		String row = "";
		int id = i + 300;
		int tipo_id = TIPO_IDENTIFICACION;
		int hotel = ID_HOTEL;
		int id_reserva_habitacion = (int)(Math.random() * ((201145) + 1));
		int id_reserva_servicio = (int)(Math.random() * ((200145) + 1));
		int id_convencion = (int)(Math.random() * ((300) + 1));
		
		Faker faker = new Faker();
		String nombre = faker.name().firstName();
		String correo = faker.name().firstName().toLowerCase() + "@gmail.com";
		
		row = id + "," + tipo_id + "," + hotel + "," + id_reserva_habitacion + "," + id_reserva_servicio + "," + id_convencion + "," + nombre + "," + correo;
		return row;
	}

	public static void generarDatos(int cantidad, PrintWriter printWriter)
	{
//		int j = 1;
//		int z = 1;
		for (int i = 1; i <= cantidad; i++) {
			String row = "";
			//---------------
			//			row = reservasServicio(i);

//						if(i <= (cantidad/2) )
//							row = reservasMantenimientoHabitaciones(i);
//						else
//							row = reservasMantenimientoServicios(i);

			//			row = reservasHabitaciones(i);

			//			if(i <= 3000) {
			//				if(j > 10) {
			//					j = 1;
			//					z++;
			//				}
			//				row = reservasConvencionesServicios(i, z, j);
			//				j++;
			//			}
			//			else
			//				row = reservasConvencionesHabitaciones(i);

			//			row = gastos(i);

			row = clientes(i);
			
			//---------------
			printWriter.println(row);
		}		
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);		
		//Setup de donde vamos a escribir el archivo
		System.out.println("Ingrese el nombre del archivo para cargar los datos:");
		String nombreArchivo = sc.nextLine();
		File file = new File ("generatedData/" + nombreArchivo + ".csv");
		PrintWriter printWriter = new PrintWriter (file);
		System.out.println("Se creo el archivo " + nombreArchivo + ".csv en " + file.getPath());
		//Aca va el metodo de carga.
		System.out.println("Ahora ingrese el numero de datos que desea generar...");
		int cantidad = sc.nextInt();

		generarDatos(cantidad, printWriter);

		System.out.println("Se acaba de escribir el archivo");
		printWriter.close ();  
		Desktop.getDesktop().open(file);
	}

}
