package com.cee.tech.view.html;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;

public class HtmlComponents implements Serializable {
    public static String table() {
        return StringUtils.EMPTY;
    }

    public static String form(Object model) {
        String htmlForm ="<form action=\"./fixtures\" method=\"post\">\n";
        htmlForm +=  "<div class=\"formContainer\">\n"; 

        
        Field [] fields = model.getClass().getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            htmlForm +=   "<div class=\"formInput\">\n" ;
            htmlForm +=  "<label for=\""+fieldName+"\">"+ fieldName +"</label>\n" ;
            htmlForm += " <input type=\"text\" name=\""+fieldName+"\" id=\""+fieldName+"\" />\n" ;
            htmlForm += " </div>";

        };

        htmlForm +=  "</div>\n";
        htmlForm +=  "<input class=\"normalFormButton\" type=\"submit\" value=\"Post Fixture\" />\n";
        htmlForm +=  "</form>";


       return htmlForm;
    }
}
