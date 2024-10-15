package exercise;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;
import static io.javalin.rendering.template.TemplateUtil.model;
import io.javalin.rendering.template.JavalinJte;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/users", ctx -> {
            ctx.jsonStream(Data.getUsers());
        });

        // BEGIN
        app.get("/users/{id}", ctx -> {
            List<User> out = new ArrayList<>();
            long id = ctx.pathParamAsClass("id", Long.class).get();

            for (User m : USERS) {
                if (m.getId() == id) {
                    out.add(m);
                }
            }
            if (out.isEmpty()) {
                throw new NotFoundResponse("User not found");
            }
            ctx.json(out);
        });

        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
