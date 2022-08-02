import java.util.Scanner;

public class Ban_Ops_Try
{
    public static void main(String args[])
    {
        int tipo;

        System.out.println("*-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-*");
        System.out.println("*-*-*-*-**-*-*-*-**-*-*-*-*  Banco  Mundial  *-*-*-*-**-*-*-*-**-*-*-*-*");
        System.out.println("Elija el tipo de pago a realizar:");
        System.out.println("1.Pago Servicio de Cable\n2.Pago Servicio de Agua");
        Scanner scan=new Scanner(System.in);
        tipo=scan.nextInt();
        if(tipo==1)
        {
            Pago_Cable cable=new Pago_Cable();
        }
        else if(tipo==2)
        {
            System.out.println("Ingrese el flujo de agua del mes actual en m3");
            int water_actual=scan.nextInt();
            System.out.println("Ingrese el flujo de agua del mes anterior en m3");
            int water_prev=scan.nextInt();
            Pago_Agua agua=new Pago_Agua(Float.valueOf(water_actual), Float.valueOf(water_prev));
        }
        else
        {
            System.out.println("Tipo de pago invalido");
        }
        scan.close();
    }
}