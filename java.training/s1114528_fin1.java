class Electricity{
    public int Power;
    public int Hour;
    public double Degree;

    public void setPower(int Powers){
        Power = Powers;
    }

    public void setHour(int Hours){
        Hour = Hours;
    }

    public void setData(char choose, int data){
        if (choose=='P') {
            Power = data;
        }
        else{
            Hour = data;
        }
    }

    public double calculare(){
        Degree = (Power*Hour/1000.0);
        return Degree;
    }
    
    public void show(){
        System.out.print("瓦數:"+Power+"瓦,用電時數:"+Hour+"小時,使用度數:"+Degree);
    }

    public void sum(){
        double num;
        if(Degree>3000){
            num = (Degree-3000)*5.4+1000*3.5+2000*4.2;
            System.out.print("電費為:"+num);
        }
        else if (Degree>1000 && Degree<=3000) {
            num = 1000*3.5 + (Degree-1000)*4.2;
            System.out.print("電費為:"+num);
        }else{
            num = Degree*3.5;
            System.out.print("電費為:"+num);
        }
        
    }

}

public class s1114528_fin1 {
    public static void main(String[] args) {
        Electricity Meter_1 = new Electricity();
        Electricity Meter_2 = new Electricity();

        Meter_1.setPower(15609);
        Meter_1.setHour(325);
        Meter_2.setData('P',2367);
        Meter_2.setData('H',128);
        Meter_1.calculare();
        Meter_2.calculare();

        System.out.print("Meter_1");
        Meter_1.show();
        Meter_1.sum();

        System.out.println();
        System.out.print("Meter_2");
        Meter_2.show();
        Meter_2.sum();
    }
}
