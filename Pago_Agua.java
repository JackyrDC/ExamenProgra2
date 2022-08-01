public class Pago_Agua extends Ban_Ops
{
    public Pago_Agua(float water)
    {
        Ban_Ops(2,water);
        System.out.println("Total a Pagar:\t\t"+ "L."+ float.valueOf(this.getPago));
    }
}