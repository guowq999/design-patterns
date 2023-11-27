package com.owenguo.command;

/**
 * 关闭电视命令
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class TelevisionOffCommand implements Command {

    private TelevisionReceiver televisionReceiver = new TelevisionReceiver();

    @Override
    public void execute() {
        televisionReceiver.off();
    }

    @Override
    public void undo() {
        televisionReceiver.on();
    }
}
