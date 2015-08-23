package liquibasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {

    @Autowired
    private DataSource dataSource;

    private Logger log = LoggerFactory.getLogger(InfoController.class);

    @RequestMapping("/info")
    public Map<String, String> info() {
        log.info("info");
        Map<String, String> model = new HashMap<>();
        model.put("jdbcurl", ((org.apache.tomcat.jdbc.pool.DataSource) dataSource).getUrl());
        return model;
    }

}
