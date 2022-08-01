public class Pago_Cable extends Ban_Ops
{
    public Pago_Cable()
    {
        calc_pay(1,0);
        System.out.println("Total a Pagar:\t\t"+ "L."+ Float.valueOf(getPago()));
    }
}