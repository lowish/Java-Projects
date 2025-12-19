public class Stu_Info_Access {
    class Student {
        public String name = "Prince Tan";
        private int age = 18;
        protected double gwa = 1.50;
    }
        public static void main(String[] args){
            Student info = new Stu_Info_Access(). new Student();
            System.out.println("Name: " + info.name);
            System.out.println("GWA: " + info.gwa);
            System.out.println("Age: " + info.age);
        }
        
}
