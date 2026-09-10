package oops;

public class constructor {
    public static class panchayat{
        String name;
        int population;
        String location ;
        panchayat(String n,int x,String p){
            name = n;
            population = x;
            location = p;

        }
        void print(){
            System.out.println(name+" "+population+" "+location);
        }
    }
    public static void main(String[] args){
        panchayat s = new panchayat("simaru",1000,"gurua");
        s.print();
    }

}
