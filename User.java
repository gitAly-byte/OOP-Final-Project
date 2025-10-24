package Method;

import java.time.LocalDate;
import java.time.LocalTime;

public class User {
    private String gsuite;
    private String sr_code;
    private LocalDate date_login;
    private LocalTime time_login;
    public User(String gsuite, String sr_code, LocalDate date_login, LocalTime time_login){
        this.gsuite = gsuite;
        this.sr_code = sr_code;
        this.date_login = LocalDate.now();
        this.time_login = LocalTime.now();
    }

    public String getGsuite() {
        return gsuite;
    }

    public void setGsuite(String gsuite) {
        this.gsuite = gsuite;
    }

    public String getSr_code() {
        return sr_code;
    }

    public void setSr_code(String sr_code) {
        this.sr_code = sr_code;
    }

    public LocalDate getDate_login() {
        return date_login;
    }

    public void setDate_login(LocalDate date_login) {
        this.date_login = date_login;
    }

    public LocalTime getTime_login() {
        return time_login;
    }

    public void setTime_login(LocalTime time_login) {
        this.time_login = time_login;
    }
}
