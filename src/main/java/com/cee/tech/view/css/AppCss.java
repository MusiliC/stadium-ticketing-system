package com.cee.tech.view.css;

import java.io.Serializable;

public class AppCss implements Serializable {

    private String style =   "<style>\n" +
            "      * {\n" +
            "      margin: 0;\n" +
            "      padding: 0;\n" +
            "      box-sizing: border-box;\n" +
            "    }\n" +
            "    body{\n" +
            "        width: 100%;\n" +
            "        font-family: \"Mona Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n" +
            "        font-size: 14px;\n" +
            "    }\n" +
            "    .navbarContainer{\n" +
            "        width: 83%;\n" +
            "        margin: auto;\n" +
            "       padding: 30px 0px;\n" +
            "    }\n" +
            "    .title{\n" +
            "        font-size: 1.2rem;\n" +
            "\n" +
            "    }\n" +
            "    .title a{\n" +
            "        color:  rgb(0, 53, 133);\n" +
            "        text-decoration: none;\n" +
            "        font-weight: 600;\n" +
            "    }\n" +
            "    .navClass{\n" +
            "        display: flex;\n" +
            "        justify-content: space-between;\n" +
            "        width: 100%;\n" +
            "        align-items: center;\n" +
            "    }\n" +
            "    .links{\n" +
            "        display: flex;\n" +
            "        gap: 40px;\n" +
            "        \n" +
            "    }\n" +
            "    .links,a{\n" +
            "        color: #272829;\n" +
            "        text-decoration: none;\n" +
            "        \n" +
            "    }\n" +
            "    .links a:hover{\n" +
            "        color:  rgb(0, 53, 133);\n" +
            "        \n" +
            "    }\n" +
            "    .contactButton{\n" +
            "        border:1px rgb(0, 53, 133) solid;\n" +
            "        padding: 8px 17px;\n" +
            "        border-radius: 25px;  \n" +
            "        color: rgb(0, 53, 133);      \n" +
            "    }\n" +
            "    .contactButton a{\n" +
            "        text-decoration: none;\n" +
            "        color: rgb(0, 53, 133);    \n" +
            "    }\n" +
            "    .contactButton a:hover{\n" +
            "        color: white;   \n" +
            "    }\n" +
            "    .contactButton:hover{\n" +
            "        /* border:none; */\n" +
            "        background-color: rgb(10, 79, 182) ;\n" +
            "        color: white;\n" +
            "        cursor: pointer;\n" +
            "    }\n" +
            ".lastPart{\n" +
            "        display: flex;\n" +
            "        align-items: center;\n" +
            "        gap: 30px;\n" +
            "    }\n" +
            "    .profile{\n" +
            "        padding: 12px 15px;\n" +
            "        border-radius: 50%; \n" +
            "        border:none;\n" +
            "        background-color: rgb(10, 79, 182) ;\n" +
            "        color: white;\n" +
            "        font-weight: 600;\n" +
            "    }" +
            //home styling
            ".mainContainer {\n" +
            "      width: 83%;\n" +
            "      margin: auto;\n" +
            "      padding-top: 10px;\n" +
            "      padding-bottom: 10px;\n" +
            "      display: flex;      \n" +
            "      justify-content: space-around;\n" +
            "      height: 83vh;\n" +
            "      align-items: center;\n" +
            "      gap: 30px;\n" +
            "    }\n" +
            "    .heroSection {\n" +
            "      width: 50%;\n" +
            "      display: flex;\n" +
            "      flex-direction: column;      \n" +
            "      gap: 20px;\n" +
            "    }\n" +
            "    .sectionTitle {\n" +
            "      font-size: 2.7rem;\n" +
            "      font-weight: 600;\n" +
            "      letter-spacing: 2px;\n" +
            "      line-height: 4rem;\n" +
            "     \n" +
            "    }\n" +
            "    .summary {\n" +
            "      width: 70%;\n" +
            "      color: #272829;\n" +
            "      margin: 13px 0px;\n" +
            "  \n" +
            "    }\n" +
            "    .blueText {\n" +
            "      color: rgb(0, 53, 133);\n" +
            "    }\n" +
            "    .homeNormalButton{\n" +
            "        padding: 12px 24px;\n" +
            "        border-radius: 25px; \n" +
            "        border:none;\n" +
            "        background-color: rgb(10, 79, 182) ;\n" +
            "        color: white;\n" +
            "        cursor: pointer;\n" +
            "        text-decoration: none;\n" +
            "    }\n" +
            "    .homeOutlineButton{\n" +
            "        border:1px rgb(0, 53, 133) solid;\n" +
            "        padding: 10px 20px;\n" +
            "        border-radius: 25px;  \n" +
            "        color: rgb(0, 53, 133);  \n" +
            "        text-decoration: none;    \n" +
            "    }\n" +
            "    .homeOutlineButton:hover{\n" +
            "        /* border:none; */\n" +
            "        background-color: rgb(10, 79, 182) ;\n" +
            "        color: white;\n" +
            "        cursor: pointer;\n" +
            "    }\n" +
            "    .homeButtons{\n" +
            "        display: flex;\n" +
            "        gap: 20px;\n" +
            "        align-items: center;\n" +
            "    }\n" +
            "    .heroImage {\n" +
            "      width: 50%;\n" +
            "    }\n" +
            "    .imageContainer{\n" +
            "      width: 100%;\n" +
            "  \n" +
            "    }\n" +
            "    .bgImage{\n" +
            "      width: 100%;\n" +
            "    }" +
            " .formMainContainer {\n" +
            "      width: 83%;\n" +
            "      margin: auto;\n" +
            "      padding-top: 10px;\n" +
            "      padding-bottom: 10px;\n" +
            "    }\n" +
            "    .formContainer {\n" +
            "      width: 600px;\n" +
            "      display: grid;\n" +
            "      grid-template-columns: auto auto;\n" +
            "      gap: 15px;\n" +
            "      margin: 20px 0px;\n" +
            "    }\n" +
            "    .fixtureTitle {\n" +
            "      font-size: 1.5rem;\n" +
            "    }\n" +
            "\n" +
            "    .normalFormButton {\n" +
            "      padding: 12px 24px;\n" +
            "      border-radius: 25px;\n" +
            "      border: none;\n" +
            "      background-color: rgb(10, 79, 182);\n" +
            "      color: white;\n" +
            "      cursor: pointer;\n" +
            "    }\n" +
            "    .formInput {\n" +
            "      display: flex;\n" +
            "      flex-direction: column;\n" +
            "      gap: 5px;\n" +
            "      margin: 5px 0px;\n" +
            "    }\n" +
            "    .formInput input {\n" +
            "      padding: 10px;\n" +
            "      border-radius: 3px;\n" +
            "      border: 1px solid lightgray;\n" +
            "    }\n" +
            "    .formInput input:focus {\n" +
            "      outline: none;\n" +
            "    }" +
            " .fixtureStyling{\n" +
            "      padding: 10px;\n" +
            "      border-radius: 3px;\n" +
            "      border: 1px solid lightgray;\n" +
            "    }\n" +
            "    .fixtureStyling:focus{\n" +
            "      outline: none;\n" +
            "    }"+
            "    .mainTicketContainer {\n" +
            "      width: 83%;\n" +
            "      margin: auto;\n" +
            "      padding-top: 10px;\n" +
            "      padding-bottom: 10px; \n" +
            "      display: flex;\n" +
            "      justify-content: center;\n" +
            "      align-items: center;\n" +
            "      height: 70vh;\n" +
            "    }\n" +
            "    .fixtureCard{\n" +
            "        background-color: rgb(0, 53, 133) ;\n" +
            "        color: white;\n" +
            "        padding: 100px;\n" +
            "        box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2);\n" +
            "    }\n" +
            "    .fixtureCard p{\n" +
            "        font-size: 2rem;\n" +
            "        font-weight: 600;\n" +
            "        margin: 5px 0px;\n" +
            "        text-align: start;\n" +
            //fixture styling
            "    .fixtureContainer {\n" +
            "      width: 83%;\n" +
            "      margin: auto;\n" +
            "    }\n" +
            "    .outlineTicketButton{\n" +
            "        border:1px rgb(0, 53, 133) solid;\n" +
            "        padding: 10px 20px;\n" +
            "        border-radius: 25px;  \n" +
            "        color: rgb(0, 53, 133);      \n" +
            "    }\n" +
            "    .outlineTicketButton:hover{\n" +
            "        /* border:none; */\n" +
            "        background-color: rgb(10, 79, 182) ;\n" +
            "        color: white;\n" +
            "        cursor: pointer;\n" +
            "    }\n" +
            "  \n" +
            "    .topPart {\n" +
            "      height: 200px;\n" +
            "      background: rgb(28, 85, 172);\n" +
            "      margin-bottom: 30px;\n" +
            "      display: flex;\n" +
            "      align-items: center;\n" +
            "    }\n" +
            "    .topPartTitle{\n" +
            "        width: 83%;\n" +
            "        margin: auto;\n" +
            "    }\n" +
            "    .topPartTitle p{\n" +
            "        color: white;\n" +
            "        font-size: 2.5rem;\n" +
            "        font-weight: 600;\n" +
            "        font-style: italic;\n" +
            "    }\n" +

            "    .oneFixture {\n" +
            "      display: flex;\n" +
            "      justify-content: space-between;\n" +
            "      align-items: center;\n" +
            "      padding: 18px 0px;\n" +
            "      color: #272829;\n" +
            "      border-bottom: 1px solid #7c7c7c;\n" +
            "    }\n" +
            "    .oneFixture:hover {\n" +
            "      cursor: pointer;\n" +
            "      background-color: rgb(238, 238, 238);\n" +
            "      padding: 18px 5px;\n" +
            "      color: black;\n" +
            "    }\n" +
            "    .teams {\n" +
            "      display: flex;\n" +
            "      flex-direction: column;\n" +
            "      gap: 7px;\n" +
            "    }\n" +
            " .fixture{\n" +
            "     width: 200px;     \n" +
            "    }\n" +
            "     .timeLocation, .teams{     \n" +
            "      width: 150px;\n" +
            "     }"+
            //ticket styling
            "    .mainTicketContainer {\n" +
            "      width: 83%;\n" +
            "      margin: auto;\n" +
            "      padding-top: 10px;\n" +
            "      padding-bottom: 10px; \n" +
            "      display: flex;\n" +
            "      justify-content: center;\n" +
            "      align-items: center;\n" +
            "      height: 70vh;\n" +
            "    }\n" +
            "    .fixtureCard{\n" +
            "        background-color: rgb(0, 53, 133) ;\n" +
            "        color: white;\n" +
            "        padding: 100px;\n" +
            "        box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2);\n" +
            "    }\n" +
            "    .fixtureCard p{\n" +
            "        font-size: 2rem;\n" +
            "        font-weight: 600;\n" +
            "        margin: 5px 0px;\n" +
            "        text-align: start;\n" +
            "    }\n" +
            "</style>";

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
