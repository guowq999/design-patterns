package com.owenguo.command;

/**
 * 开灯命令
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver = new LightReceiver();


    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
