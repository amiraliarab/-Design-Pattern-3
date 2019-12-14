package project4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
	// write your code here
        Builder b = new Builder();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name : ");
        String n = input.nextLine();
        b.setName(n);

        System.out.println("Enter student code : ");
        n = input.nextLine();
        b.setReshteh(n);

        System.out.println("Enter age : ");
        n = input.nextLine();
        b.setAge(n);

        System.out.println("Enter student reshteh : ");
        n = input.nextLine();
        b.setCode(n);

        System.out.println("Enter student gerayesh : ");
        n = input.nextLine();
        b.setGerayesh(n);

        System.out.println("//////////////////information is/////////////////");
        System.out.println("name : " + b.getName());

        System.out.println("tahsilat : " + b.getReshteh());

        System.out.println("address : " + b.getCode());

        System.out.println("mobile : " + b.getGerayesh());

        System.out.println("username : " + b.getAge());
    }
    static class Builder {

        private String name;
        private String code;
        private String reshteh;
        private String gerayesh;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getReshteh() {
            return reshteh;
        }

        public void setReshteh(String reshteh) {
            this.reshteh = reshteh;
        }

        public String getGerayesh() {
            return gerayesh;
        }

        public void setGerayesh(String gerayesh) {
            this.gerayesh = gerayesh;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

    }
}
