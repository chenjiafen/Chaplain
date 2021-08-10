import com.chenjiafeng.ChaplainApplication;
import com.chenjiafeng.entity.Article;
import com.chenjiafeng.entity.Student;
import com.chenjiafeng.service.ArticleSearchService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 15:40
 * @desc
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChaplainApplication.class)
@Slf4j
public class testdemo01 {

    @Autowired
    ArticleSearchService searchService;

    @Test
    public void contextLoads() {
        Page<Article> articles = searchService.findByTitleLike("发发发啊收到", 2, 3);
        log.info("======="+articles);



    }

}
