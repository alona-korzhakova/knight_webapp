/*
 * UserLogicService
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

import ua.training.model.entity.Knight;

    public class UserLogicService {

    private boolean isValidName(String name){
        System.out.println(name);
        return name.matches("^[A-Z]{1}[a-z]+");
    }

    private boolean isValidAge(String age){
        return age.matches("[0-9]{2}");
    }

    private boolean isValidEmail(String email){
        return email.matches("^[\\w-_.+]*[\\w-_.]" +
                "@([\\w]+.)+[\\w]+[\\w]$");
    }

    private boolean isValidLogin(String login){
        return login.matches("^[^\\d_][a-z\\d_]{3,10}");
    }

    private boolean isValidPassword(String password){
        return password.matches(".{4,}");
    }

    /**
     * isValidUser method
     * Checks input data for validity.
     * @return true - if valid, false - if invalid.
     */
    public boolean isValidUser(Knight knight) {
        return (isValidName(knight.getName()) && isValidAge(knight.getAge()) && isValidEmail(knight.getEmail())
                && isValidLogin(knight.getLogin()) && isValidPassword(knight.getPassword()));
    }
}
