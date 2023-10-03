package collection;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> employees = new CustomArrayList<>();
        employees.add("mario");
        employees.add("jeromo");
        employees.add("gily");
        employees.add("ferer");
        for (int i=1; i<=100;i++ ){
            employees.add("employee"+ i);
        }
        try {
            employees.remove("employee101");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (int i=0; i< employees.getcapacity(); i++){
            System.out.println(employees.get(i));
        }
    }
}
