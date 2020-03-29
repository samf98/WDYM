/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdym;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sam
 */
public class WDYM {
    static ArrayList<Alt_Command> alt_commands;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alt_commands = new ArrayList<Alt_Command>();
        load_alt_commands();
        String input = "";
        Scanner sc;
        boolean exit_condition=false;
        while(!exit_condition){
            System.out.print(">");
            sc = new Scanner(System.in);
            input = sc.nextLine();
            if(input.equals("exit"))
                exit_condition=true;
            for (Alt_Command alt : alt_commands) {
                if(alt.getCommand().equals(input)){
                    input=alt.getOg_command();
                }
            }
            process_commands(input);
        }
        save_alt_commands();
    }
    
    
    private static void process_commands(String input){
        if(input.equals("ls"))
        {
            for(int i=0; i<5; i++) 
        { 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop     
            for(int j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
        }
        else if(input.equals("df"))
        {
            for(int i=0; i<5; i++) 
            { 
  
                // inner loop to handle number spaces 
                // values changing acc. to requirement 
                for(int j=2*(5-i); j>=0; j--) 
                { 
                // printing spaces 
                    System.out.print(" "); 
                } 
             
                //  inner loop to handle number of columns 
                //  values changing acc. to outer loop 
                for(int j=0; j<=i; j++) 
                { 
                    // printing stars 
                    System.out.print("* "); 
                } 
              
                // ending line after each row 
                System.out.println(); 
            } 
        }
        else if(input.equals("dd"))
        {
            for (int i=0; i<5; i++) 
            { 
  
                // inner loop to handle number spaces 
                // values changing acc. to requirement 
                for (int j=5-i; j>1; j--) 
                { 
                    // printing spaces 
                    System.out.print(" "); 
                } 
   
                //  inner loop to handle number of columns 
                //  values changing acc. to outer loop 
                for (int j=0; j<=i; j++ ) 
                { 
                    // printing stars 
                    System.out.print("* "); 
                } 
   
                // ending line after each row 
                System.out.println(); 
            } 
        }
        else if(input.equals("exit"))
        {
            
        }
        else
            wdym(input);
    }
    
    private static void wdym(String input)
    {
        boolean dym_dd=true,dym_df=true,dym_ls=true;
        if(input.length()>2)
        {
            dym_dd=false;
            dym_df=false;
            dym_ls=false;
        }
        else
        {
            char keyboard[][] = new char[10][3];
            keyboard[0][0]='q';
            keyboard[1][0]='w';
            keyboard[2][0]='e';
            keyboard[3][0]='r';
            keyboard[4][0]='t';
            keyboard[5][0]='y';
            keyboard[6][0]='u';
            keyboard[7][0]='i';
            keyboard[8][0]='o';
            keyboard[9][0]='p';
            keyboard[0][1]='a';
            keyboard[1][1]='s';
            keyboard[2][1]='d';
            keyboard[3][1]='f';
            keyboard[4][1]='g';
            keyboard[5][1]='h';
            keyboard[6][1]='j';
            keyboard[7][1]='k';
            keyboard[8][1]='l';
            keyboard[9][1]='ñ';
            keyboard[0][2]='z';
            keyboard[1][2]='x';
            keyboard[2][2]='c';
            keyboard[3][2]='v';
            keyboard[4][2]='b';
            keyboard[5][2]='n';
            keyboard[6][2]='m';
            keyboard[7][2]=',';
            keyboard[8][2]='.';
            keyboard[9][2]='-';
            
            int position=0;
            int position1=0,position2=0;
            
            while(position<input.length()){
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(input.charAt(position)==keyboard[i][j]){
                            position1=i;
                            position2=j;
                        }
                    }
                }
                if(position==0)
                {
                    //System.out.println(input.charAt(position)+","+position1+","+position2);
                    //Validation for letter d
                    if((position1==2&&position2==1)||(position1==1&&position2==1)||(position1==0&&position2==1)
                            ||(position1==3&&position2==1)||(position1==4&&position2==1)||(position1==1&&position2==0)
                            ||(position1==2&&position2==0)||(position1==3&&position2==0)||(position1==1&&position2==2)
                            ||(position1==2&&position2==2)||(position1==3&&position2==2))
                    {}    //System.out.println("Works for me dd (1) or df");
                    else{
                        dym_dd=false;
                        dym_df=false;
                    }
                    
                    //Validation for letter "l"
                    if((position1==8&&position2==1)||(position1==9&&position2==1)||(position1==7&&position2==1)
                            ||(position1==6&&position2==1)||(position1==7&&position2==0)||(position1==8&&position2==0)
                            ||(position1==9&&position2==0)||(position1==7&&position2==2)||(position1==8&&position2==2)
                            ||(position1==9&&position2==2))
                    {}//System.out.println("Works for me ls(1)");
                    else
                        dym_ls=false;
                }
                else if(position==1)
                {
                    //System.out.println(input.charAt(position)+","+position1+","+position2);
                    //Validation for letter "d", reused
                    if(dym_dd!=false){
                        if((position1==2&&position2==1)||(position1==1&&position2==1)||(position1==0&&position2==1)
                                ||(position1==3&&position2==1)||(position1==4&&position2==1)||(position1==1&&position2==0)
                                ||(position1==2&&position2==0)||(position1==3&&position2==0)||(position1==1&&position2==2)
                                ||(position1==2&&position2==2)||(position1==3&&position2==2))
                        {}    //System.out.println("Works for me dd(2)");
                        else
                            dym_dd=false;
                    }
                    //Validation for letter "f"
                    if(dym_df!=false){
                        if((position1==3&&position2==1)||(position1==2&&position2==1)||(position1==1&&position2==1)
                                ||(position1==4&&position2==1)||(position1==5&&position2==1)||(position1==2&&position2==0)
                                ||(position1==3&&position2==0)||(position1==4&&position2==0)||(position1==2&&position2==2)
                                ||(position1==3&&position2==2)||(position1==4&&position2==2)||(position1==1&&position2==2))
                        {}    //System.out.println("Works for me df(2)");
                        else
                            dym_df=false;
                    }
                    
                    //Validation for letter "s"
                    if(dym_ls!=false){
                        if((position1==1&&position2==1)||(position1==0&&position2==1)||(position1==2&&position2==1)
                                ||(position1==3&&position2==1)||(position1==0&&position2==0)||(position1==1&&position2==0)
                                ||(position1==2&&position2==0)||(position1==0&&position2==2)||(position1==1&&position2==2)
                                ||(position1==2&&position2==2))
                        {}    //System.out.println("Works for me ls(2)");
                        else
                            dym_ls=false;
                    }
                }
                position++;
            }
        }
        Scanner sc;
        if(dym_dd)
        {
            System.out.println(input+" is incorrect, did you mean dd?(Y/N)");
            sc = new Scanner(System.in);
            if(sc.nextLine().equals("Y"))
                alt_commands.add(new Alt_Command(input,"dd"));
        }
        else if(dym_df)
        {
            System.out.println(input+" is incorrect, did you mean df?(Y/N)");
            sc = new Scanner(System.in);
            if(sc.nextLine().equals("Y"))
                alt_commands.add(new Alt_Command(input,"df"));
        }
        else if(dym_ls)
        {
            System.out.println(input+" is incorrect, did you mean ls?(Y/N)");
            sc = new Scanner(System.in);
            if(sc.nextLine().equals("Y"))
                alt_commands.add(new Alt_Command(input,"ls"));
        }
        else
            System.out.println(input+" is not supported.");
    }
    
    
    private static void load_alt_commands(){
        try {
            String incoming_command="";
            String[] saving_command;
            Scanner scanner = new Scanner(new File("AltCommands.txt"));
            while (scanner.hasNextLine()) {
                incoming_command=scanner.nextLine();
                saving_command=incoming_command.split(",");
                alt_commands.add(new Alt_Command(saving_command[0],saving_command[1]));
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*for (Alt_Command alt_command : alt_commands) {
            System.out.println(alt_command.toString());
        }*/
    }
    
    private static void save_alt_commands(){
        try {
            String text="";
            for (Alt_Command alt_command : alt_commands) {
                text+=alt_command.getCommand()+","+alt_command.getOg_command()+"\n";
            }
            FileWriter writer = new FileWriter("AltCommands.txt", false);
            writer.write(text);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
