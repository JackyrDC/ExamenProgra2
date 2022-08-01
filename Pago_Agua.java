public class Pago_Agua extends Ban_Ops
{
    public Pago_Agua(float water)
    {
       calc_pay(2,water);
        System.out.println("Total a Pagar:\t\t"+ "L."+ Float.valueOf(getPago()));
    }
}