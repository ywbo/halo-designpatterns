package com.ilearning.design.test;

import com.ilearning.design.Command;

/**
 * 命令行测试类
 *
 * @author yuwenbo
 * @date 2022/6/22 6:10
 **/
public class ApiTest {
    public static void main(String[] args) {
        Command cmd = Command.parse(args);
        if (!cmd.ok || cmd.helpFlag) {
            System.out.println("Usage: <main class> [-options] class [args...]");
            return;
        }
        if (cmd.versionFlag) {
            System.out.println("java version \"1.8.0\"");
            return;
        }
        startJVM(cmd);
    }

    private static void startJVM(Command cmd) {
        System.out.printf("classpath:%s class:%s args:%s\n", cmd.classpath, cmd.getMainClass(), cmd.getAppArgs());
    }
}
