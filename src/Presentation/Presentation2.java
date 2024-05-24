package Presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("C:\\Users\\lonove\\IdeaProjects\\Tp1\\src\\config.txt"));
        String daoClassname=scanner.nextLine();
        Class cDao=Class.forName(daoClassname);
        IDao dao=(IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassname=scanner.nextLine();
        Class cMetier=Class.forName(daoClassname);
        IMetier metier =(IMetier) cDao.newInstance();
        Method methode=cMetier.getMethod("setDao",IDao.class);
        methode.invoke(metier,dao);

        System.out.println("Resultat=>"+metier.calcul());
    }
}
