package exercise;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN

// END

public final class App {

    private static final List<Map<String, String>> COMPANIES = Data.getCompanies();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/companies/{id}", ctx -> {
            var companyNumber = ctx.pathParamAsClass("id", Integer.class);

            if (companyNumber < 0) {
                throw new NotFoundResponse("Company not found");
            }
            var companyInfo = new HashMap<String, String>();
              for (var company : COMPANIES) {
              if (company.get(companyNumber).equals("id")) {
                  companyInfo = new HashMap<String, String>(company);
              }
              }
            ctx.result(companyInfo);
        });

        // END

        app.get("/companies", ctx -> {
            ctx.json(COMPANIES);
        });

        app.get("/", ctx -> {
            ctx.result("open something like (you can change id): /companies/5");
        });

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
