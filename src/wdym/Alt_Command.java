/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdym;

/**
 *
 * @author Sam
 */
public class Alt_Command {
    private String command;
    private String og_command;

    public Alt_Command(String command, String og_command) {
        this.command = command;
        this.og_command = og_command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getOg_command() {
        return og_command;
    }

    public void setOg_command(String og_command) {
        this.og_command = og_command;
    }

    @Override
    public String toString() {
        return "Alt_Command{" + "command=" + command + ", og_command=" + og_command + '}';
    }
    
    
}
