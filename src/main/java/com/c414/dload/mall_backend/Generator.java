package com.c414.dload.mall_backend;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai",
                        "root", "wangziycy")
                .globalConfig(builder -> {
                    builder.author("dload") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\javaCode\\mall_backend\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.c414.dload.mall_backend") // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "E:\\javaCode\\mall_backend\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ums_menu") // 设置需要生成的表名
                            .addTablePrefix("ums_") // 设置过滤表前缀
                            .entityBuilder()
                            .enableLombok()
                            .formatFileName("UmsMenu")
                            .controllerBuilder()
                            .enableRestStyle()
                            .formatFileName("UmsMenuController")
                            .serviceBuilder()
                            .formatServiceFileName("IUmsMenuService")
                            .formatServiceImplFileName("UmsMenuServiceImpl")
                            .mapperBuilder()
                            .enableBaseColumnList()
                            .enableBaseResultMap()
                            .enableMapperAnnotation()
                            .formatMapperFileName("UmsMenuMapper")
                            .formatXmlFileName("UmsMenuMapper");
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
