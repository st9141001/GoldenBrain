/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.lang.Character;
import Cs.*;
import datastructs.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 張迦
 */
public class function {

    public static void addproblem(String pro, String a, String b, String c, String d, char ans) {
        problemarr.myproblem.add(new problem(pro, a, b, c, d, ans));
    }

    public static void readproblems() {
        try {
            File txt = new File("problem.txt");
            Scanner sc = new Scanner(txt);
            String blankLine, line;
            blankLine = sc.nextLine();
            blankLine = sc.nextLine();
            char ans;
            int NO;
            String problem="";
            String answera="";
            String answerb;
            String answerc;
            String answerd;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                Scanner lineScanner = new Scanner(line);
                ans = lineScanner.next().toUpperCase().charAt(0);
               
                
                NO = lineScanner.nextInt();
                
                String pro = lineScanner.nextLine();
                String proble[] = pro.split("[(][ABCD][)]");
                problem = proble[0];

                //黑底白字 字變大  答案畫線即可
                String s="";
                s+="<html>";
                s+=problem;
                s+="</html>";
                problem = s;
                
                answera = "<html>(A)" + proble[1] +"</html>";
                answerb = "<html>(B)" + proble[2] +"</html>";
                answerc = "<html>(C)" + proble[3] +"</html>";
                answerd = "<html>(D)" + proble[4] +"</html>";
                problemarr.myproblem.add(new problem(problem, answera, answerb, answerc, answerd, ans));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
