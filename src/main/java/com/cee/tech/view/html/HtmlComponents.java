package com.cee.tech.view.html;

import com.cee.tech.app.model.entity.TicketPricing;
import com.cee.tech.database.Database;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

public class HtmlComponents implements Serializable {
//    public static String table(List<Object> models) {
//
//        if(models == null || models.isEmpty()){
//            return StringUtils.EMPTY;
//        }
//        Field[] fields = models.get(0).getClass().getFields();
//
//        StringBuilder tbBuilder = new StringBuilder();
//
//        tbBuilder.append("<table>");
//        tbBuilder.append("<tr>");
//        for(Field field: fields){
//        tbBuilder.append(" <th>" + field.getName() + "</th");
//        }
//
//
//        for (Object model: models){
//            tbBuilder.append("<tr>");
//            for(Field field: fields)
//                tb
//        }
//        tbBuilder.append("</table>");
//        return tbBuilder.toString();
//    }

    public static String form(Class<?> model) {


        EticketHtmlForm eticketHtmlForm = null;
        if (model.isAnnotationPresent(EticketHtmlForm.class)) {
            eticketHtmlForm = model.getAnnotation(EticketHtmlForm.class);
        }
        if (eticketHtmlForm == null) {
            return StringUtils.EMPTY;
        }
        String htmlForm = "<form action=\"" + eticketHtmlForm.url() + "\" method=\"" + eticketHtmlForm.httpMethod() + "\">\n";
        htmlForm += "<div class=\"formContainer\">\n";


        Field[] fields = model.getDeclaredFields();

        for (Field field : fields) {

            if (!field.isAnnotationPresent(EticketFormField.class))
                continue;

            EticketFormField formField = field.getDeclaredAnnotation(EticketFormField.class);

            String fieldName = field.getName();
            htmlForm += "<div class=\"formInput\">\n";
            htmlForm += "<label for=\"" + (StringUtils.isBlank(formField.labelFor()) ? fieldName : formField.labelFor()) + "\">" +
                    (StringUtils.isBlank(formField.label()) ? fieldName : formField.label())
                    + "</label>\n";
            htmlForm += " <input type=\"" + (StringUtils.isBlank(formField.fieldType()) ? fieldName : formField.fieldType()) +
                    "\" name=\"" + (StringUtils.isBlank(formField.name()) ? fieldName : formField.name()) +
                    "\" id=\"" + (StringUtils.isBlank(formField.id()) ? fieldName : formField.id()) + "\" />\n";
            htmlForm += " </div>";

        }
        ;

        htmlForm += "</div>\n";
        htmlForm += "<input class=\"normalFormButton\" type=\"submit\" value=\"Post Fixture\" />\n";
        htmlForm += "</form>";


        return htmlForm;
    }

    public static String ticketForm(Class<?> model) {
        EticketHtmlForm eticketHtmlForm = null;
        if (model.isAnnotationPresent(EticketHtmlForm.class)) {
            eticketHtmlForm = model.getAnnotation(EticketHtmlForm.class);
        }
        if (eticketHtmlForm == null) {
            return StringUtils.EMPTY;
        }
        String htmlForm = "<form action=\"" + eticketHtmlForm.url() + "\" method=\"" + eticketHtmlForm.httpMethod() + "\">\n";
        htmlForm += " <p class=\"fixtureTitle\">Book a ticket</p>\n";
        htmlForm += "          <div class=\"formTicketContainer\">\n";

        Field[] fields = model.getDeclaredFields();


        for (Field field : fields) {
            if (!field.isAnnotationPresent(EticketFormField.class))
                continue;

            EticketFormField formField = field.getDeclaredAnnotation(EticketFormField.class);
            String fieldName = field.getName();
            htmlForm += "<div class=\"formInput\">\n";
            htmlForm += "<label for=\"" + (StringUtils.isBlank(formField.labelFor()) ? fieldName : formField.labelFor()) +
                    "\">"
                    + (StringUtils.isBlank(formField.label()) ? fieldName : formField.label())
                    + "</label>\n";
            htmlForm += " <input type=\"" + (StringUtils.isBlank(formField.fieldType()) ? fieldName : formField.fieldType())
                    + "\" name=\"" + (StringUtils.isBlank(formField.name()) ? fieldName : formField.name()) +
                    "\" id=\"" + (StringUtils.isBlank(formField.id()) ? fieldName : formField.id()) +
                    "\" />\n";
            htmlForm += " </div>";

        }
        ;

        htmlForm += "</div>\n";
        htmlForm += " <div class=\"ticketButtons\">\n" +
                "<a href=\"./fixtures\" class=\"homeOutlineButton\" > Cancel</a>\n" +
                "<input class=\"normalFormButton\" type=\"submit\" value=\"Book Ticket\" />\n" +
                "</div>";

        htmlForm += " </form>\n";

        return htmlForm;


    }
}
