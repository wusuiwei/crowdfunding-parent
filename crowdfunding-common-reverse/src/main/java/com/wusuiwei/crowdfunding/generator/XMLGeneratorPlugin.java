package com.wusuiwei.crowdfunding.generator;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

public class XMLGeneratorPlugin extends PluginAdapter {

    public XMLGeneratorPlugin() {

    }


    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * 生成mapper.xml,文件内容会被清空再写入
     * @param sqlMap
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        sqlMap.setMergeable(false);
        return true;
    }
}
