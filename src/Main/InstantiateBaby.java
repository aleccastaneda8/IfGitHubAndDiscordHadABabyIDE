package Main;

import FrontEnd.IDE;

import javax.swing.*;

public class InstantiateBaby {
    public static void main(String[] args){

        int i = JOptionPane.showConfirmDialog(null,"Start the baby?","Goo Goo Gah Gah.",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(i == 0){
            System.out.println("Entering boot sequence...\n");
            IDE inst = new IDE();
        }
        System.out.println("Goo Goo Gah Gah");
    }
}
