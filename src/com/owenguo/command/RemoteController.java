package com.owenguo.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 控制界面
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class RemoteController {

    /**
     * 用来保存命令的设置信息
     */
    private Map<String, Command> map = new HashMap<>(8);

    /**
     * 用来保存执行的命令 【使用栈】 【用于命令撤回】
     */
    private Stack<Command> stack = new Stack<>();

    /**
     * 设置命令
     *
     * @param name
     * @param command
     */
    public void setCommond(String name, Command command) {
        map.put(name, command);
    }

    /**
     * 开
     *
     * @param name
     */
    public void on(String name) {
        Command command = map.getOrDefault(name, new NoCommand());
        command.execute();
        stack.push(command);
    }

    /**
     * 关
     *
     * @param name
     */
    public void off(String name) {
        Command command = map.getOrDefault(name, new NoCommand());
        command.execute();
        stack.push(command);
    }

    /**
     * 撤回
     *
     */
    public void undo() {
        if (stack.isEmpty()) {
            new NoCommand().undo();
            return;
        }
        Command pop = stack.pop();
        pop.undo();
    }
}
