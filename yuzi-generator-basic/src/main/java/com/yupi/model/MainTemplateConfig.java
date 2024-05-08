package com.yupi.model;

import lombok.Data;

/**
 * @author 程序员小白条
 * @date 2024/5/7 20:15
 * @gitee https://gitee.com/falle22222n-leaves/vue_-book-manage-system
 */
/**
 * 动态模版配置
 */
@Data
public class MainTemplateConfig {

    /**
     * 是否生成循环
     */
    private boolean loop = false;

    /**
     * 作者注释
     */
    private String author = "xiaobaitiao";

    /**
     * 输出信息
     */
    private String outputText = "输出结果";
}
