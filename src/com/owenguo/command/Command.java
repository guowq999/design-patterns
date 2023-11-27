package com.owenguo.command;

/**
 * 命令接口
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤回命令
     */
    void undo();
}
