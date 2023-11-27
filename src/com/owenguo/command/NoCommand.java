package com.owenguo.command;

/**
 * 空命令
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("空命令");
    }

    @Override
    public void undo() {
        System.out.println("空命令");
    }
}
