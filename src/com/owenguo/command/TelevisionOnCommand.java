package com.owenguo.command;

/**
 * 打开电视命令
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class TelevisionOnCommand implements Command {

    private TelevisionReceiver televisionReceiver = new TelevisionReceiver();

    @Override
    public void execute() {
        televisionReceiver.on();
    }

    @Override
    public void undo() {
        televisionReceiver.off();
    }
}
