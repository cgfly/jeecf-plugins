package org.jeecf.plugin.lanaguage.helper;

import org.apache.commons.lang3.StringUtils;

/**
 * java 帮助类
 * 
 * @author jianyiming
 *
 */
public class JavaHelper {

    /**
     * 获取简单的字段类型
     * 
     * @param jdbcType
     * @return
     */
    public String getSimpleType(String simpleJdbcType) {
        String type = this.getType(simpleJdbcType);
        return StringUtils.indexOf(type, ".") != -1 ? StringUtils.substringAfterLast(type, ".") : type;
    }

    /**
     * 获取字段类型
     * 
     * @param jdbcType
     * @return
     */
    public String getType(String simpleJdbcTtpe) {
        if (simpleJdbcTtpe.equals("varchar")) {
            return "String";
        } else if (simpleJdbcTtpe.equals("text")) {
            return "String";
        } else if (simpleJdbcTtpe.equals("bigint")) {
            return "Long";
        } else if (simpleJdbcTtpe.equals("Integer")) {
            return "Integer";
        } else if (simpleJdbcTtpe.equals("tinyint")) {
            return "Integer";
        } else if (simpleJdbcTtpe.equals("double")) {
            return "Double";
        } else if (simpleJdbcTtpe.equals("double")) {
            return "Double";
        } else if (simpleJdbcTtpe.equals("double")) {
            return "Double";
        } else if (simpleJdbcTtpe.equals("date")) {
            return "java.util.Date";
        } else if (simpleJdbcTtpe.equals("datetime")) {
            return "java.util.Date";
        } else if (simpleJdbcTtpe.equals("timestamp")) {
            return "java.util.Date";
        } else if (simpleJdbcTtpe.equals("decimal")) {
            return "java.math.BigDecimal";
        } else {
            return "";
        }
    }

}
