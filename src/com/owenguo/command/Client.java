package com.owenguo.command;

/**
 * @author wenqiang
 * @date 2023/6/1
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个控制界面
        RemoteController remoteController = new RemoteController();

        // 设置命令
        remoteController.setCommond("灯-开", new LightOnCommand());
        remoteController.setCommond("灯-关", new LightOffCommand());
        remoteController.setCommond("电视-开", new TelevisionOnCommand());
        remoteController.setCommond("电视-关", new TelevisionOffCommand());

        // 执行命令
        remoteController.on("灯-开");
        remoteController.on("电视-开");
        remoteController.on("电视-关");

        // 回撤命令
        remoteController.undo();
        remoteController.undo();
    }
}
