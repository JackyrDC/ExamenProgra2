public class Ban_Ops{

    private float pago;
    private Class tipo;


    public void calc_pay(Class tipo, float wFlow)
    {
        if(tipo== Pago_Cable.class)
        {
            setPago(Float.valueOf(500));
        }
        else if(tipo == Pago_Agua.class)
        {
            if(wFlow<=10)
            {
                setPago(wFlow*10);
            } 
            else if(wFlow<30)
            {
                setPago(wFlow*Float.valueOf("12.5"));
            }
            else
            {
                setPago(wFlow*15);
            }
        }
        else
        {
            System.out.println("Tipo de pago invalido");
        }

    }

    public void setPago(float pago)
    {
        this.pago=pago;
    }

    public float getPago()
    {
        return this.pago;
    }
}