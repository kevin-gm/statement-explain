package site.wellman.sql.explain.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.json.GsonJsonParser;

import java.util.Arrays;
import java.util.List;

/**
 * @author li.guoqiang
 **/
@EnableConfigurationProperties(ExplainProperties.class)
public class ExplainAutoConfiguration {

    public static void main(String[] args) {
        String fileName = "101081899265.png";
        String ext = fileName.substring(fileName.indexOf("."));
        String codeId = fileName.substring(0, fileName.length() - ext.length());
        System.out.println(codeId);
    }
}
