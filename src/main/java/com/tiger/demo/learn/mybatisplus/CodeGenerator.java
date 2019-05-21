package com.tiger.demo.learn.mybatisplus;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

    //模块名
    private static String moduleName = "sys";
    //表名，多个英文逗号分割
    private static String tableName = "sys_user_token";

    //包设置
    private static String parent = "com.tiger.demo.learn.mybatisplus";

    //mysql设置
    private static String url = "jdbc:mysql://localhost:3306/shiro?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String userName = "root";
    private static String passWord = "123456";

    //抽象类设置
    private static String superEntityClass = null;
    private static String superControllerClass = null;
    /*private static String superEntityClass = "com.tiger.demo.learn.mybatisplus.BaseEntity";
    private static String superControllerClass = "com.tiger.demo.learn.mybatisplus.BaseController";
    */


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("zxl");
        gc.setOpen(false);
//        gc.setSwagger2(true);//实体属性 Swagger2 注解
        gc.setBaseResultMap(true);//生成基本的resultMap
        gc.setBaseColumnList(true);//生成基本的SQL片段
//        gc.setServiceName("%sService");// 设置生成的service接口的名字的首字母是否为I
//        gc.setAuthor("Bean"); //作者
        gc.setFileOverride(true);//文件覆盖
        gc.setIdType(IdType.AUTO);//主键策略
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(url);
        // dsc.setSchemaName("public");
        dsc.setDriverName(driverName);
        dsc.setUsername(userName);
        dsc.setPassword(passWord);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);//模块名
        pc.setParent(parent);
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
//        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
         String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        /*
        cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录");
                return false;
            }
        });
        */
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass(superEntityClass);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setSuperControllerClass(superControllerClass);
        strategy.setInclude(tableName.split(","));//表名，多个英文逗号分割
        strategy.setSuperEntityColumns("p_id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());//配置引擎
        mpg.execute();
    }
}
