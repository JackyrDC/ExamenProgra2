public class Ban_Ops{

    private float pago;
    private Ban_Ops tipo;


    public void calc_pay(int tipo, float wFlow)
    {
        if(tipo instaceOf Pago_Cable)
        {
            setPago(Float.valueOf(500));
        }
        else if(tipo instanceOf Pago_Agua)
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