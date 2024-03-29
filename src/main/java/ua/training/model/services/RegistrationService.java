/*
 * RegistrationService
 *
 * Description: This source file is a part of the Knight web app.
 *
 * By: Alyona Korzhakova
 *
 * Created: 2018/04/10
 *
 * Updated: 2018/04/20
 */
package ua.training.model.services;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.KnightDao;
import ua.training.model.dao.implement.JDBCDaoFactory;
import ua.training.model.entity.Knight;
import ua.training.model.util.Constants;

import javax.servlet.http.HttpServletRequest;

public class RegistrationService {

    private UserLogicService loginLogicService = new UserLogicService();
    private DaoFactory daoFactory = new JDBCDaoFactory();
    private KnightDao knightDao = daoFactory.createKnightDao();

    /**
     * Creates Knight entity.
     * @param request
     * @return Knight entity
     */
    public Knight createKnight(HttpServletRequest request) {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        return new Knight(name, age, email, login, password);
    }

    /**
     * Registers user if it is possible, otherwise sets an error message.
     * @param request
     * @param knight
     * @return success page in case of success, otherwise - registration page.
     */
    public String registerKnight(HttpServletRequest request, Knight knight) {

        String page = "/view/registration.jsp";

        if (!loginLogicService.isValidUser(knight)) {
            request.setAttribute("invalidInputMessage", Constants.INVALID_DATA);
        } else if (!knightDao.create(knight)) {
            request.setAttribute("notUniqueLoginMassage", Constants.NOT_UNIQUE_LOGIN);
        } else {
            request.setAttribute("userName", knight.getName());
            request.setAttribute("userCreated", Constants.USER_CREATED);
            page = "/view/success_signup.jsp";
        }
        return page;
    }
}
