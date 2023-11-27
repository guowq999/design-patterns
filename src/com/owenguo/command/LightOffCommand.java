package com.owenguo.command;

/**
 * 关灯命令
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class LightOffCommand implements Command {

    private LightReceiver lightReceiver = new LightReceiver();


    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
