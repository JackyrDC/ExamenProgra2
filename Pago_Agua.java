import java.time.*;

public class Pago_Agua extends Ban_Ops
{
    public Pago_Agua(float water_actual, float water_prev)
    {
          
        calc_pay(Pago_Agua.class,water_actual-water_prev);
        System.out.println("*-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-**-*-*-*-*");
        System.out.println("*-*-*-*-**-*-*-*-*   Servicio Local de Agua Potable   *-*-*-*-**-*-*-*-*");
        System.out.println("Concepto:\t\t"+ "Servicio de Agua ");
        System.out.println("Total a Pagar:\t\t"+ "L."+ Float.valueOf(getPago()));
    }
}