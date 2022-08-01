public class Ban_Ops{

    private float pago;
    private int tipo;


    public void calc_pay(int tipo, float wFlow)
    {
        if(tipo==1)
        {
            setPago(500.00);
        }
        else if(tipo==0)
        {
            if(wFlow<=10)
            {
                setPago(wFlow*10);
            } 
            else if(wFlow<30)
            {
                setPago(wFlow*12.50);
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