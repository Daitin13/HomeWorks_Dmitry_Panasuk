package Company;

import lombok.*;

import java.util.ArrayList;

public @Data class Manager extends Employee{

private String nameMan;


public static void main(String[]args){
        Manager man=new Manager();
        Manager man1=new Manager();
        Manager man2=new Manager();

        System.out.println(man.getIdEmloyee());
        System.out.println(man1.getIdEmloyee());
        System.out.println(man2.getIdEmloyee());
        ArrayList<Manager>list=new ArrayList<>();
        }
        }
