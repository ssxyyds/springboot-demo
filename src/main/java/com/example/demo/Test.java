package com.example.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class Test {
    private static final String USER_NAME = "root";
    private static final String PASS_WORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/ssxtest?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";

    public static void main(String[] args) {

        FastAutoGenerator.create(URL, USER_NAME, PASS_WORD)
                .globalConfig(builder -> builder
                        .author("ssx")
                        .disableOpenDir()
                        .outputDir(System.getProperty("user.dir") + "\\src\\main\\java"))
                .packageConfig(builder -> builder
                        .parent("com.example.demo")
                        .entity("domain"))
                .strategyConfig(builder -> builder
                        .addInclude("user")
                        .build().entityBuilder()
                        .enableChainModel().enableLombok()
                        .idType(IdType.ASSIGN_ID)
                        .disableSerialVersionUID())
                .execute();
    }
}
