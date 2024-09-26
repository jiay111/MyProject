class CPersonData{
    public String name; //姓名
    public String degree;  //職員
    private String p_id;  // 身分證號碼
    private int salary;  //月薪資

    class CPersonData(){
        salary = 0;
        name = "~~~~~~~~" ;
        degree = "~~~~~~~~";
        p_id = "~~~~~~~~";
        salary = "~~~~~~~~";
    
    }
    public CPersonData(String n, String d, String p, int s){
        public String setname(String n){
            name = n;
        }

        public String degree(String d){
            degree = d;
        }

        public String p_id(String p){
            p_id = p;
        }

        public int salary(int s){
            salary = s;
        }
    

        public int getSalary(){
            return this.salary;
        }
    }
}

class CPersonAccount{
    private CPersonData personArr[];

    class CPersonAccount(){
        personArr = new CPersonData[5];
    }

    public void inputData(){
        setname.add();
        degree.add();
        p_id.add();
        salary.add();

    }

    public void displayData(){
        System.out.println("");
    }

    public void sortBySalary(){
         
    }
}


public class s1114528_fin2 {
    

}
