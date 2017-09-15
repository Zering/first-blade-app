package com.bladejava.firstapp;

import com.blade.Blade;
import com.blade.Environment;
import com.blade.event.EventType;
import com.blade.kit.StringKit;

/**
 * Hello world!
 */
public class Application {

    public static void main(String[] args) {

        Blade.me().before("/*", ((request, response) -> {
            String uri = request.uri();
            if("/index".equals(uri)){
                String username = request.session().attribute(Const.LOGIN_SESSION_KEY);
                if (StringKit.isBlank(username)) {
                    response.redirect("/login");
                    return;
                }
            }
        })).event(EventType.SERVER_STARTED, (e) -> {
            Environment environment = e.blade.environment();
            Const.USERNAME = environment.get("app.username").get();
            Const.PASSWORD = environment.get("app.password").get();
        }).start(Application.class);

    }
}
